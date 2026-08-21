package name.modid.mixin;

import name.modid.template.TemplateEnchantments;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition;
import net.minecraft.world.inventory.SmithingMenu;
import net.minecraft.world.item.ItemStack;

import java.util.function.Predicate;

@Mixin(SmithingMenu.class)
public abstract class SmithingMenuMixin {
	@Unique
	private static final Predicate<ItemStack> ARSA_BASE_PREDICATE = stack ->
		!stack.isEmpty() && TemplateEnchantments.isValidBase(stack);

	/**
	 * 原版基底槽只接受 RecipePropertySet 里出现过的物品。
	 * 我们的应用配方基底是“任意非书/非模板物品”，无法用 Ingredient 表达，
	 * 因此在原版槽位定义基础上放宽基底槽（保留原版行为，取并集）。
	 */
	@Inject(method = "createInputSlotDefinitions", at = @At("RETURN"), cancellable = true)
	private void arsa$widenBaseSlot(CallbackInfoReturnable<ItemCombinerMenuSlotDefinition> cir) {
		ItemCombinerMenuSlotDefinition original = cir.getReturnValue();
		ItemCombinerMenuSlotDefinition.Builder builder = ItemCombinerMenuSlotDefinition.create();

		for (ItemCombinerMenuSlotDefinition.SlotDefinition slot : original.getSlots()) {
			Predicate<ItemStack> predicate = slot.mayPlace();
			if (slot.slotIndex() == SmithingMenu.BASE_SLOT) {
				predicate = predicate.or(ARSA_BASE_PREDICATE);
			}
			builder.withSlot(slot.slotIndex(), slot.x(), slot.y(), predicate);
		}

		ItemCombinerMenuSlotDefinition.SlotDefinition result = original.getResultSlot();
		builder.withResultSlot(result.slotIndex(), result.x(), result.y());
		cir.setReturnValue(builder.build());
	}

	/**
	 * 允许 shift 点击把合法基底放入锻造台。
	 */
	@Inject(method = "canMoveIntoInputSlots", at = @At("RETURN"), cancellable = true)
	private void arsa$allowBaseShiftClick(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		if (!cir.getReturnValue() && ARSA_BASE_PREDICATE.test(stack)) {
			cir.setReturnValue(true);
		}
	}
}
