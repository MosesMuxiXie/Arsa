package name.modid.template;

import name.modid.ArsaItems;
import name.modid.ArsaRecipes;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.PlacementInfo;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.display.RecipeDisplay;
import net.minecraft.world.item.crafting.display.ShapedCraftingRecipeDisplay;
import net.minecraft.world.item.crafting.display.SlotDisplay;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Optional;

/**
 * 工作台复制配方：上中=普通书，正中=附魔模板，其余 7 格=绿宝石。
 * 输出 2 个携带完全相同附魔组件的模板。
 */
public class TemplateCopyRecipe extends CustomRecipe {
	public static final TemplateCopyRecipe INSTANCE = new TemplateCopyRecipe();

	public static final MapCodec<TemplateCopyRecipe> CODEC = MapCodec.unit(INSTANCE);
	public static final StreamCodec<RegistryFriendlyByteBuf, TemplateCopyRecipe> STREAM_CODEC = StreamCodec.unit(INSTANCE);

	private static final Ingredient BOOK = Ingredient.of(Items.BOOK);
	private static final Ingredient TEMPLATE = Ingredient.of(ArsaItems.ENCHANTMENT_TEMPLATE);
	private static final Ingredient EMERALD = Ingredient.of(Items.EMERALD);

	/**
	 * 3×3 工作台中的行优先原料顺序。PlacementInfo 同时供配方书判定可合成性
	 * 和服务端一键摆放使用，因此必须与 matches 里的坐标严格一致。
	 */
	private static final List<Optional<Ingredient>> PATTERN_INGREDIENTS = List.of(
		Optional.of(EMERALD), Optional.of(BOOK), Optional.of(EMERALD),
		Optional.of(EMERALD), Optional.of(TEMPLATE), Optional.of(EMERALD),
		Optional.of(EMERALD), Optional.of(EMERALD), Optional.of(EMERALD)
	);
	private static final PlacementInfo PLACEMENT_INFO = PlacementInfo.createFromOptionals(PATTERN_INGREDIENTS);

	private TemplateCopyRecipe() {
		super(CraftingBookCategory.MISC);
	}

	@Override
	public boolean matches(CraftingInput input, Level level) {
		if (input.width() != 3 || input.height() != 3) {
			return false;
		}

		ItemStack book = input.getItem(1, 0);
		ItemStack template = input.getItem(1, 1);

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
				if (!input.getItem(x, y).is(Items.EMERALD)) {
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public ItemStack assemble(CraftingInput input, HolderLookup.Provider registries) {
		ItemStack result = new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE, 2);

		for (int i = 0; i < input.size(); i++) {
			ItemStack stack = input.getItem(i);
			if (TemplateEnchantments.isTemplate(stack)) {
				result.set(DataComponents.ENCHANTMENTS, TemplateEnchantments.get(stack));
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
	public PlacementInfo placementInfo() {
		return PLACEMENT_INFO;
	}

	@Override
	public List<RecipeDisplay> display() {
		List<SlotDisplay> ingredients = PATTERN_INGREDIENTS.stream()
			.map(ingredient -> ingredient.map(Ingredient::display).orElse(SlotDisplay.Empty.INSTANCE))
			.toList();

		return List.of(new ShapedCraftingRecipeDisplay(
			3,
			3,
			ingredients,
			new SlotDisplay.ItemStackSlotDisplay(new ItemStack(ArsaItems.ENCHANTMENT_TEMPLATE, 2)),
			new SlotDisplay.ItemSlotDisplay(Items.CRAFTING_TABLE)
		));
	}

	@Override
	public RecipeSerializer<TemplateCopyRecipe> getSerializer() {
		return ArsaRecipes.TEMPLATE_COPY;
	}
}
