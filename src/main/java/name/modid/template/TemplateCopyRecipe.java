package name.modid.template;

import name.modid.ArsaItems;
import name.modid.ArsaRecipes;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

/**
 * 工作台复制配方：上中=普通书，正中=附魔模板，其余 7 格=绿宝石。
 * 输出 2 个携带完全相同附魔组件的模板。
 */
public class TemplateCopyRecipe extends CustomRecipe {
	private static final Ingredient BOOK = Ingredient.of(Items.BOOK);
	private static final Ingredient TEMPLATE = Ingredient.of(ArsaItems.ENCHANTMENT_TEMPLATE);
	private static final Ingredient EMERALD = Ingredient.of(Items.EMERALD);

	/**
	 * 3×3 工作台中的行优先原料顺序。PlacementInfo 同时供配方书判定可合成性
	 * 和服务端一键摆放使用，因此必须与 matches 里的坐标严格一致。
	 */
	public TemplateCopyRecipe(ResourceLocation id) {
		super(id, CraftingBookCategory.MISC);
	}

	@Override
	public boolean matches(CraftingContainer input, Level level) {
		if (input.getWidth() != 3 || input.getHeight() != 3) {
			return false;
		}

		ItemStack book = input.getItem(1);
		ItemStack template = input.getItem(4);

		if (!book.is(Items.BOOK)) {
			return false;
		}
		if (!TemplateEnchantments.isTemplate(template) || TemplateEnchantments.get(template).isEmpty()) {
			return false;
		}

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if ((x == 1 && y == 0) || (x == 1 && y == 1)) {
					continue;
				}
				if (!input.getItem(x + y * 3).is(Items.EMERALD)) {
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public ItemStack assemble(CraftingContainer input) {
		ItemStack result = new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE, 2);

		for (int i = 0; i < input.getContainerSize(); i++) {
			ItemStack stack = input.getItem(i);
			if (TemplateEnchantments.isTemplate(stack)) {
				EnchantmentHelper.setEnchantments(TemplateEnchantments.get(stack), result);
				break;
			}
		}

		return result;
	}

	/**
	 * CustomRecipe 默认是“特殊配方”并且不可摆放，那会让它从原版配方书中消失。
	 * 这个配方有固定的 3×3 外形，所以可以安全提供完整的摆放信息。
	 */
	@Override
	public boolean isSpecial() {
		return false;
	}

	@Override
	public boolean canCraftInDimensions(int width, int height) {
		return width >= 3 && height >= 3;
	}

	@Override
	public NonNullList<Ingredient> getIngredients() {
		NonNullList<Ingredient> ingredients = NonNullList.create();
		ingredients.add(EMERALD);
		ingredients.add(BOOK);
		ingredients.add(EMERALD);
		ingredients.add(EMERALD);
		ingredients.add(TEMPLATE);
		ingredients.add(EMERALD);
		ingredients.add(EMERALD);
		ingredients.add(EMERALD);
		ingredients.add(EMERALD);
		return ingredients;
	}

	@Override
	public ItemStack getResultItem() {
		return new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE, 2);
	}

	@Override
	public RecipeSerializer<TemplateCopyRecipe> getSerializer() {
		return ArsaRecipes.TEMPLATE_COPY;
	}
}
