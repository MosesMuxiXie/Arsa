package name.modid;

import name.modid.template.TemplateApplicationRecipe;
import name.modid.template.TemplateCopyRecipe;

import com.mojang.serialization.Codec;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.item.crafting.RecipeSerializer;

// 1.21.11 中 RecipeSerializer#streamCodec 已标记弃用，但仍是自定义序列化器必须实现的接口方法。
@SuppressWarnings("deprecation")
public final class ArsaRecipes {
	public static final RecipeSerializer<TemplateCopyRecipe> TEMPLATE_COPY = new RecipeSerializer<>() {
		@Override
		public Codec<TemplateCopyRecipe> codec() {
			return TemplateCopyRecipe.CODEC;
		}

		@Override
		public TemplateCopyRecipe fromNetwork(FriendlyByteBuf buffer) {
			return TemplateCopyRecipe.INSTANCE;
		}

		@Override
		public void toNetwork(FriendlyByteBuf buffer, TemplateCopyRecipe recipe) {
		}
	};

	public static final RecipeSerializer<TemplateApplicationRecipe> TEMPLATE_APPLICATION = new RecipeSerializer<>() {
		@Override
		public Codec<TemplateApplicationRecipe> codec() {
			return TemplateApplicationRecipe.CODEC;
		}

		@Override
		public TemplateApplicationRecipe fromNetwork(FriendlyByteBuf buffer) {
			return TemplateApplicationRecipe.INSTANCE;
		}

		@Override
		public void toNetwork(FriendlyByteBuf buffer, TemplateApplicationRecipe recipe) {
		}
	};

	private ArsaRecipes() {
	}

	public static void init() {
		Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, Arsa.id("template_copy"), TEMPLATE_COPY);
		Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, Arsa.id("template_application"), TEMPLATE_APPLICATION);
	}
}
