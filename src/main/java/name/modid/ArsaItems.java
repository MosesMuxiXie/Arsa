package name.modid;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public final class ArsaItems {
	// 1.21.11 要求物品构造时必须带 RegistryKey（Item.Properties#setId），否则运行时 NPE。
	public static final Item ENCHANTMENT_TEMPLATE = new Item(
		new Item.Properties()
			.setId(ResourceKey.create(Registries.ITEM, Arsa.id("enchantment_template")))
			.stacksTo(64)
			.rarity(Rarity.RARE)
	);

	private ArsaItems() {
	}

	public static void init() {
		Registry.register(BuiltInRegistries.ITEM, Arsa.id("enchantment_template"), ENCHANTMENT_TEMPLATE);
	}
}
