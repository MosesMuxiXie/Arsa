package name.modid.template;

import name.modid.ArsaItems;
import name.modid.ArsaRecipes;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.UpgradeRecipe;
import net.minecraft.world.level.Level;

/**
 * 旧版双槽锻造台应用配方：左槽=附魔模板，右槽=可附魔物品。
 * 复用原版 RecipeType.SMITHING，失败时 assemble 返回 EMPTY，结果槽即为空。
 */
public class TemplateApplicationRecipe extends UpgradeRecipe {
	public TemplateApplicationRecipe(ResourceLocation id) {
		super(id, Ingredient.of(ArsaItems.ENCHANTMENT_TEMPLATE), Ingredient.of(Items.EMERALD), ItemStack.EMPTY);
	}

	@Override
	public boolean isAdditionIngredient(ItemStack stack) {
		return TemplateEnchantments.isValidBase(stack);
	}

	@Override
	public boolean matches(Container input, Level level) {
		return TemplateEnchantments.isTemplate(input.getItem(0))
			&& !TemplateEnchantments.get(input.getItem(0)).isEmpty()
			&& TemplateEnchantments.isValidBase(input.getItem(1));
	}

	@Override
	public ItemStack assemble(Container input) {
		ItemStack template = input.getItem(0);
		ItemStack base = input.getItem(1);

		if (!TemplateEnchantments.canApply(template, base)) {
			return ItemStack.EMPTY;
		}

		return TemplateEnchantments.applyTo(template, base);
	}

	@Override
	public ItemStack getResultItem() {
		// 实际结果取决于基底物品及模板携带的附魔，无法静态预览。
		return ItemStack.EMPTY;
	}

	@Override
	public boolean isSpecial() {
		return true;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return ArsaRecipes.TEMPLATE_APPLICATION;
	}
}
