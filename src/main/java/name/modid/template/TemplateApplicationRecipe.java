package name.modid.template;

import name.modid.ArsaItems;
import name.modid.ArsaRecipes;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.PlacementInfo;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmithingRecipe;
import net.minecraft.world.item.crafting.SmithingRecipeInput;
import net.minecraft.world.level.Level;

import java.util.Optional;

/**
 * 锻造台应用配方：模板槽=附魔模板，基底槽=可附魔物品，材料槽必须为空。
 * 复用原版 RecipeType.SMITHING，失败时 assemble 返回 EMPTY，结果槽即为空。
 */
public class TemplateApplicationRecipe implements SmithingRecipe {
	public static final TemplateApplicationRecipe INSTANCE = new TemplateApplicationRecipe();

	public static final MapCodec<TemplateApplicationRecipe> CODEC = MapCodec.unit(INSTANCE);
	public static final StreamCodec<RegistryFriendlyByteBuf, TemplateApplicationRecipe> STREAM_CODEC = StreamCodec.unit(INSTANCE);

	private TemplateApplicationRecipe() {
	}

	@Override
	public Optional<Ingredient> templateIngredient() {
		return Optional.of(Ingredient.of(ArsaItems.ENCHANTMENT_TEMPLATE));
	}

	@Override
	public Ingredient baseIngredient() {
		// 槽位插入由 SmithingMenuMixin 放宽到所有合法基底；这里仅提供非空占位原料，
		// 使 RecipeManager 能正常收集 SMITHING_BASE 属性集。
		return Ingredient.of(Items.EMERALD);
	}

	@Override
	public Optional<Ingredient> additionIngredient() {
		// 材料槽必须为空。
		return Optional.empty();
	}

	@Override
	public boolean matches(SmithingRecipeInput input, Level level) {
		return TemplateEnchantments.isTemplate(input.template())
			&& !TemplateEnchantments.get(input.template()).isEmpty()
			&& TemplateEnchantments.isValidBase(input.base())
			&& input.addition().isEmpty();
	}

	@Override
	public ItemStack assemble(SmithingRecipeInput input, HolderLookup.Provider registries) {
		ItemStack template = input.template();
		ItemStack base = input.base();

		if (!TemplateEnchantments.canApply(template, base)) {
			return ItemStack.EMPTY;
		}

		return TemplateEnchantments.applyTo(template, base);
	}

	@Override
	public boolean isSpecial() {
		return true;
	}

	@Override
	public PlacementInfo placementInfo() {
		return PlacementInfo.NOT_PLACEABLE;
	}

	@Override
	public RecipeSerializer<TemplateApplicationRecipe> getSerializer() {
		return ArsaRecipes.TEMPLATE_APPLICATION;
	}
}
