package name.modid;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public final class ArsaItems {
	public static final Item ENCHANTMENT_TEMPLATE = new Item(
		new Item.Properties()
			.stacksTo(64)
			.rarity(Rarity.RARE)
	);

	private ArsaItems() {
	}

	public static void init() {
		Registry.register(BuiltInRegistries.ITEM, Arsa.id("enchantment_template"), ENCHANTMENT_TEMPLATE);
	}
}
