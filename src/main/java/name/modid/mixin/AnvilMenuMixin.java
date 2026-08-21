package name.modid.mixin;

import name.modid.template.TemplateEnchantments;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

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
 * 铁砧制作附魔模板 + 模板只读。
 * 继承 ItemCombinerMenu（与官方 Fabric API 的 AnvilMenuMixin 同款写法），
 * 直接使用继承来的 inputSlots / resultSlots / broadcastChanges()，
 * 仅对 AnvilMenu 自身的私有字段保留 @Shadow。
 */
@Mixin(AnvilMenu.class)
public abstract class AnvilMenuMixin extends ItemCombinerMenu {
	@Unique
	private static final int TEMPLATE_LEVEL_COST = 10;

	@Shadow
	private DataSlot cost;

	@Shadow
	private int repairItemCountCost;

	protected AnvilMenuMixin(MenuType<?> type, int syncId, Inventory playerInventory,
	                         ContainerLevelAccess context) {
		super(type, syncId, playerInventory, context);
	}

	@Inject(method = "createResult", at = @At("HEAD"), cancellable = true)
	private void arsa$handleTemplateRecipe(CallbackInfo ci) {
		ItemStack left = this.inputSlots.getItem(0);
		ItemStack right = this.inputSlots.getItem(1);

		// 模板只读：禁止再进铁砧合并/改名
		if (TemplateEnchantments.isTemplate(left)) {
			ci.cancel();
			this.resultSlots.setItem(0, ItemStack.EMPTY);
			this.cost.set(0);
			this.repairItemCountCost = 0;
			this.broadcastChanges();
			return;
		}

		// 制作：附魔书(左) + 绿宝石块(右)
		if (left.is(Items.ENCHANTED_BOOK) && right.is(Items.EMERALD_BLOCK)) {
			ci.cancel();
			if (EnchantmentHelper.getEnchantments(left).isEmpty() || right.getCount() < 9) {
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
	 * 结果刷新后的兜底：即使其他铁砧逻辑在同一轮计算中改写了 cost，
	 * 只要结果仍是附魔模板，就恢复为固定 10 级并清除输出的 repair_cost。
	 */
	@Inject(method = "createResult", at = @At("RETURN"))
	private void arsa$normalizeTemplateResultAfterRefresh(CallbackInfo ci) {
		ItemStack result = this.resultSlots.getItem(0);
		if (TemplateEnchantments.isTemplate(result)) {
			this.arsa$setFixedTemplateResult(result);
		}
	}

	/**
	 * 不让原版 mayPickup 读取任何可能残留的高费用。
	 * 生存只检查是否有固定的 10 级经验，创造模式照常无视经验。
	 */
	@Inject(method = "mayPickup", at = @At("HEAD"), cancellable = true)
	private void arsa$mayPickupTemplateAtFixedCost(Player player, boolean hasStack,
	                                               CallbackInfoReturnable<Boolean> cir) {
		if (hasStack && TemplateEnchantments.isTemplate(this.resultSlots.getItem(0))) {
			this.cost.set(TEMPLATE_LEVEL_COST);
			cir.setReturnValue(player.getAbilities().instabuild || player.experienceLevel >= TEMPLATE_LEVEL_COST);
		}
	}

	/** 实际取出前再归一一次，保证原版 onTake 最终只扣 10 级和 9 个绿宝石块。 */
	@Inject(method = "onTake", at = @At("HEAD"))
	private void arsa$normalizeTemplateBeforeTake(Player player, ItemStack stack, CallbackInfo ci) {
		if (TemplateEnchantments.isTemplate(stack)) {
			stack.setRepairCost(0);
			this.cost.set(TEMPLATE_LEVEL_COST);
			this.repairItemCountCost = 9;
		}
	}

	@Unique
	private void arsa$setFixedTemplateResult(ItemStack result) {
		// 模板永不继承附魔书经多次铁砧合并产生的 penalty。
		result.setRepairCost(0);
		this.resultSlots.setItem(0, result);
		this.cost.set(TEMPLATE_LEVEL_COST);
		this.repairItemCountCost = 9;
	}
}
