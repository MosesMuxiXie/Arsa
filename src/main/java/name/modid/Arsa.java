package name.modid;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Arsa implements ModInitializer {
	public static final String MOD_ID = "arsa";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ArsaItems.init();
		ArsaRecipes.init();

		LOGGER.info("Arsa enchantment template initialized.");
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
