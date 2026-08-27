package name.modid.mixin;

import name.modid.template.TemplateEnchantments;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.ItemCombinerMenu;
import net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

/**
 * 铁砧制作附魔模板 + 模板重命名。
 * 继承 ItemCombinerMenu（与官方 Fabric API 的 AnvilMenuMixin 同款写法），
 * 直接使用继承来的 inputSlots / resultSlots / broadcastChanges()，
 * 仅对 AnvilMenu 自身的私有字段保留 @Shadow。
 */
@Mixin(AnvilMenu.class)
public abstract class AnvilMenuMixin extends ItemCombinerMenu {
	@Unique
	private static final int TEMPLATE_CREATION_LEVEL_COST = 10;
	@Unique
	private static final int TEMPLATE_RENAME_LEVEL_COST = 1;

	@Shadow
	private String itemName;

	@Shadow
	private DataSlot cost;

	@Shadow
	private int repairItemCountCost;

	protected AnvilMenuMixin(MenuType<?> type, int syncId, Inventory playerInventory,
	                         ContainerLevelAccess context, ItemCombinerMenuSlotDefinition forgingSlotsManager) {
		super(type, syncId, playerInventory, context, forgingSlotsManager);
	}

	@Inject(method = "createResult", at = @At("HEAD"), cancellable = true)
	private void arsa$handleTemplateRecipe(CallbackInfo ci) {
		ItemStack left = this.inputSlots.getItem(0);
		ItemStack right = this.inputSlots.getItem(1);

		// 模板只允许在右槽为空时重命名；不允许与其它物品合并。
		if (TemplateEnchantments.isTemplate(left)) {
			ci.cancel();
			this.arsa$setEmptyResult();
			if (right.isEmpty()) {
				this.arsa$setTemplateRenameResult(left);
			}
			this.broadcastChanges();
			return;
		}

		// 制作：附魔书(左) + 绿宝石块(右)
		if (left.is(Items.ENCHANTED_BOOK) && right.is(Items.EMERALD_BLOCK)) {
			ci.cancel();
			if (EnchantmentHelper.getEnchantmentsForCrafting(left).isEmpty() || right.getCount() < 9) {
				this.resultSlots.setItem(0, ItemStack.EMPTY);
				this.cost.set(0);
				this.repairItemCountCost = 0;
			} else {
				this.arsa$setFixedTemplateResult(TemplateEnchantments.fromBook(left));
			}
			this.broadcastChanges();
		}
	}

	/**
	 * 结果刷新后的兜底：制作模板固定 10 级，重命名模板固定 1 级，
	 * 两种操作都不写入或累加 repair_cost。
	 */
	@Inject(method = "createResult", at = @At("RETURN"))
	private void arsa$normalizeTemplateResultAfterRefresh(CallbackInfo ci) {
		ItemStack result = this.resultSlots.getItem(0);
		if (TemplateEnchantments.isTemplate(result)) {
			this.arsa$setFixedTemplateResult(result, this.arsa$isRenamingTemplate());
		}
	}

	/**
	 * 不让原版 mayPickup 读取任何可能残留的高费用。
	 * 生存按当前操作检查固定费用，创造模式照常无视经验。
	 */
	@Inject(method = "mayPickup", at = @At("HEAD"), cancellable = true)
	private void arsa$mayPickupTemplateAtFixedCost(Player player, boolean hasStack,
	                                               CallbackInfoReturnable<Boolean> cir) {
		if (hasStack && TemplateEnchantments.isTemplate(this.resultSlots.getItem(0))) {
			int fixedCost = this.arsa$getFixedTemplateCost();
			this.cost.set(fixedCost);
			cir.setReturnValue(player.getAbilities().instabuild || player.experienceLevel >= fixedCost);
		}
	}

	/** 实际取出前再归一一次，保证原版 onTake 按当前操作扣除正确资源。 */
	@Inject(method = "onTake", at = @At("HEAD"))
	private void arsa$normalizeTemplateBeforeTake(Player player, ItemStack stack, CallbackInfo ci) {
		if (TemplateEnchantments.isTemplate(stack)) {
			stack.remove(DataComponents.REPAIR_COST);
			boolean renaming = this.arsa$isRenamingTemplate();
			this.cost.set(renaming ? TEMPLATE_RENAME_LEVEL_COST : TEMPLATE_CREATION_LEVEL_COST);
			this.repairItemCountCost = renaming ? 0 : 9;
		}
	}

	@Unique
	private void arsa$setFixedTemplateResult(ItemStack result) {
		this.arsa$setFixedTemplateResult(result, false);
	}

	@Unique
	private void arsa$setFixedTemplateResult(ItemStack result, boolean renaming) {
		// 模板永不继承附魔书经多次铁砧合并产生的 penalty。
		result.remove(DataComponents.REPAIR_COST);
		this.resultSlots.setItem(0, result);
		this.cost.set(renaming ? TEMPLATE_RENAME_LEVEL_COST : TEMPLATE_CREATION_LEVEL_COST);
		this.repairItemCountCost = renaming ? 0 : 9;
	}

	@Unique
	private void arsa$setTemplateRenameResult(ItemStack input) {
		ItemStack result = input.copy();
		result.setCount(1);
		boolean changed = false;

		if (this.itemName == null || this.itemName.isBlank()) {
			if (input.has(DataComponents.CUSTOM_NAME)) {
				result.remove(DataComponents.CUSTOM_NAME);
				changed = true;
			}
		} else if (!this.itemName.equals(input.getHoverName().getString())) {
			result.set(DataComponents.CUSTOM_NAME, Component.literal(this.itemName));
			changed = true;
		}

		if (changed) {
			this.arsa$setFixedTemplateResult(result, true);
		}
	}

	@Unique
	private boolean arsa$isRenamingTemplate() {
		return TemplateEnchantments.isTemplate(this.inputSlots.getItem(0))
			&& this.inputSlots.getItem(1).isEmpty();
	}

	@Unique
	private int arsa$getFixedTemplateCost() {
		return this.arsa$isRenamingTemplate() ? TEMPLATE_RENAME_LEVEL_COST : TEMPLATE_CREATION_LEVEL_COST;
	}

	@Unique
	private void arsa$setEmptyResult() {
		this.resultSlots.setItem(0, ItemStack.EMPTY);
		this.cost.set(0);
		this.repairItemCountCost = 0;
	}
}
