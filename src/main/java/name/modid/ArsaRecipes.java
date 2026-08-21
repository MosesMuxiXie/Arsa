package name.modid;

import name.modid.template.TemplateApplicationRecipe;
import name.modid.template.TemplateCopyRecipe;

import com.google.gson.JsonObject;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;

// 1.21.11 中 RecipeSerializer#streamCodec 已标记弃用，但仍是自定义序列化器必须实现的接口方法。
@SuppressWarnings("deprecation")
public final class ArsaRecipes {
	public static final RecipeSerializer<TemplateCopyRecipe> TEMPLATE_COPY = new RecipeSerializer<>() {
		@Override
		public TemplateCopyRecipe fromJson(ResourceLocation id, JsonObject json) {
			return new TemplateCopyRecipe(id);
		}

		@Override
		public TemplateCopyRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buffer) {
			return new TemplateCopyRecipe(id);
		}

		@Override
		public void toNetwork(FriendlyByteBuf buffer, TemplateCopyRecipe recipe) {
		}
	};

	public static final RecipeSerializer<TemplateApplicationRecipe> TEMPLATE_APPLICATION = new RecipeSerializer<>() {
		@Override
		public TemplateApplicationRecipe fromJson(ResourceLocation id, JsonObject json) {
			return new TemplateApplicationRecipe(id);
		}

		@Override
		public TemplateApplicationRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buffer) {
			return new TemplateApplicationRecipe(id);
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
