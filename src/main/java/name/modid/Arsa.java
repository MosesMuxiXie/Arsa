package name.modid;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Arsa implements ModInitializer {
	public static final String MOD_ID = "arsa";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ArsaItems.init();
		ArsaRecipes.init();

		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output ->
			output.insertAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ArsaItems.ENCHANTMENT_TEMPLATE)
		);

		LOGGER.info("Arsa enchantment template initialized.");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
