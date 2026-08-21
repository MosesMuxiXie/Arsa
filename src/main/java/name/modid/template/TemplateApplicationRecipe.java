package name.modid.template;

import name.modid.ArsaItems;
import name.modid.ArsaRecipes;

import com.mojang.serialization.Codec;

import net.minecraft.core.RegistryAccess;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmithingRecipe;
import net.minecraft.world.level.Level;

/**
 * 锻造台应用配方：模板槽=附魔模板，基底槽=可附魔物品，材料槽必须为空。
 * 复用原版 RecipeType.SMITHING，失败时 assemble 返回 EMPTY，结果槽即为空。
 */
public class TemplateApplicationRecipe implements SmithingRecipe {
	public static final TemplateApplicationRecipe INSTANCE = new TemplateApplicationRecipe();

	public static final Codec<TemplateApplicationRecipe> CODEC = Codec.unit(INSTANCE);

	private TemplateApplicationRecipe() {
	}

	@Override
	public boolean isTemplateIngredient(ItemStack stack) {
		return stack.is(ArsaItems.ENCHANTMENT_TEMPLATE);
	}

	@Override
	public boolean isBaseIngredient(ItemStack stack) {
		return TemplateEnchantments.isValidBase(stack);
	}

	@Override
	public boolean isAdditionIngredient(ItemStack stack) {
		return false;
	}

	@Override
	public boolean matches(Container input, Level level) {
		return TemplateEnchantments.isTemplate(input.getItem(0))
			&& !TemplateEnchantments.get(input.getItem(0)).isEmpty()
			&& TemplateEnchantments.isValidBase(input.getItem(1))
			&& input.getItem(2).isEmpty();
	}

	@Override
	public ItemStack assemble(Container input, RegistryAccess registries) {
		ItemStack template = input.getItem(0);
		ItemStack base = input.getItem(1);

		if (!TemplateEnchantments.canApply(template, base)) {
			return ItemStack.EMPTY;
		}

		return TemplateEnchantments.applyTo(template, base);
	}

	@Override
	public ItemStack getResultItem(RegistryAccess registries) {
		// 实际结果取决于基底物品及模板携带的附魔，无法静态预览。
		return ItemStack.EMPTY;
	}

	@Override
	public boolean isSpecial() {
		return true;
	}

	@Override
	public RecipeSerializer<TemplateApplicationRecipe> getSerializer() {
		return ArsaRecipes.TEMPLATE_APPLICATION;
	}
}
