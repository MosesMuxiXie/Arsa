/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Registry
 *  net.minecraft.core.component.DataComponents
 *  net.minecraft.core.registries.BuiltInRegistries
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.references.Items
 *  net.minecraft.resources.Identifier
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.sounds.SoundEvents
 *  net.minecraft.tags.BannerPatternTags
 *  net.minecraft.tags.DamageTypeTags
 *  net.minecraft.tags.ItemTags
 *  net.minecraft.util.Unit
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EquipmentSlot
 *  net.minecraft.world.entity.animal.chicken.ChickenVariants
 *  net.minecraft.world.food.Foods
 *  net.minecraft.world.item.AirItem
 *  net.minecraft.world.item.ArmorStandItem
 *  net.minecraft.world.item.ArrowItem
 *  net.minecraft.world.item.AxeItem
 *  net.minecraft.world.item.BannerItem
 *  net.minecraft.world.item.BedItem
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.BoatItem
 *  net.minecraft.world.item.BoneMealItem
 *  net.minecraft.world.item.BottleItem
 *  net.minecraft.world.item.BowItem
 *  net.minecraft.world.item.BrushItem
 *  net.minecraft.world.item.BucketItem
 *  net.minecraft.world.item.BundleItem
 *  net.minecraft.world.item.CompassItem
 *  net.minecraft.world.item.CrossbowItem
 *  net.minecraft.world.item.DebugStickItem
 *  net.minecraft.world.item.DiscFragmentItem
 *  net.minecraft.world.item.DoubleHighBlockItem
 *  net.minecraft.world.item.DyeColor
 *  net.minecraft.world.item.DyeItem
 *  net.minecraft.world.item.EggItem
 *  net.minecraft.world.item.EitherHolder
 *  net.minecraft.world.item.EmptyMapItem
 *  net.minecraft.world.item.EndCrystalItem
 *  net.minecraft.world.item.EnderEyeItem
 *  net.minecraft.world.item.EnderpearlItem
 *  net.minecraft.world.item.ExperienceBottleItem
 *  net.minecraft.world.item.FireChargeItem
 *  net.minecraft.world.item.FireworkRocketItem
 *  net.minecraft.world.item.FishingRodItem
 *  net.minecraft.world.item.FlintAndSteelItem
 *  net.minecraft.world.item.FoodOnAStickItem
 *  net.minecraft.world.item.GameMasterBlockItem
 *  net.minecraft.world.item.GlowInkSacItem
 *  net.minecraft.world.item.HangingEntityItem
 *  net.minecraft.world.item.HangingSignItem
 *  net.minecraft.world.item.HoeItem
 *  net.minecraft.world.item.HoneycombItem
 *  net.minecraft.world.item.InkSacItem
 *  net.minecraft.world.item.InstrumentItem
 *  net.minecraft.world.item.Instruments
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemFrameItem
 *  net.minecraft.world.item.JukeboxSongs
 *  net.minecraft.world.item.KnowledgeBookItem
 *  net.minecraft.world.item.LeadItem
 *  net.minecraft.world.item.LingeringPotionItem
 *  net.minecraft.world.item.MaceItem
 *  net.minecraft.world.item.MapItem
 *  net.minecraft.world.item.MinecartItem
 *  net.minecraft.world.item.MobBucketItem
 *  net.minecraft.world.item.NameTagItem
 *  net.minecraft.world.item.PlaceOnWaterBlockItem
 *  net.minecraft.world.item.PlayerHeadItem
 *  net.minecraft.world.item.PotionItem
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.ScaffoldingBlockItem
 *  net.minecraft.world.item.ShearsItem
 *  net.minecraft.world.item.ShieldItem
 *  net.minecraft.world.item.ShovelItem
 *  net.minecraft.world.item.SignItem
 *  net.minecraft.world.item.SmithingTemplateItem
 *  net.minecraft.world.item.SnowballItem
 *  net.minecraft.world.item.SolidBucketItem
 *  net.minecraft.world.item.SpawnEggItem
 *  net.minecraft.world.item.SpectralArrowItem
 *  net.minecraft.world.item.SplashPotionItem
 *  net.minecraft.world.item.SpyglassItem
 *  net.minecraft.world.item.StandingAndWallBlockItem
 *  net.minecraft.world.item.TippedArrowItem
 *  net.minecraft.world.item.ToolMaterial
 *  net.minecraft.world.item.TridentItem
 *  net.minecraft.world.item.WeatheringCopperItems
 *  net.minecraft.world.item.WindChargeItem
 *  net.minecraft.world.item.WritableBookItem
 *  net.minecraft.world.item.WrittenBookItem
 *  net.minecraft.world.item.alchemy.PotionContents
 *  net.minecraft.world.item.component.Bees
 *  net.minecraft.world.item.component.BlockItemStateProperties
 *  net.minecraft.world.item.component.BlocksAttacks
 *  net.minecraft.world.item.component.BlocksAttacks$DamageReduction
 *  net.minecraft.world.item.component.BlocksAttacks$ItemDamageFunction
 *  net.minecraft.world.item.component.BundleContents
 *  net.minecraft.world.item.component.ChargedProjectiles
 *  net.minecraft.world.item.component.Consumables
 *  net.minecraft.world.item.component.CustomData
 *  net.minecraft.world.item.component.DamageResistant
 *  net.minecraft.world.item.component.DeathProtection
 *  net.minecraft.world.item.component.DebugStickState
 *  net.minecraft.world.item.component.Fireworks
 *  net.minecraft.world.item.component.InstrumentComponent
 *  net.minecraft.world.item.component.ItemContainerContents
 *  net.minecraft.world.item.component.MapDecorations
 *  net.minecraft.world.item.component.MapItemColor
 *  net.minecraft.world.item.component.OminousBottleAmplifier
 *  net.minecraft.world.item.component.SuspiciousStewEffects
 *  net.minecraft.world.item.component.Weapon
 *  net.minecraft.world.item.component.WritableBookContent
 *  net.minecraft.world.item.enchantment.ItemEnchantments
 *  net.minecraft.world.item.equipment.ArmorMaterials
 *  net.minecraft.world.item.equipment.ArmorType
 *  net.minecraft.world.item.equipment.EquipmentAssets
 *  net.minecraft.world.item.equipment.Equippable
 *  net.minecraft.world.item.equipment.trim.TrimMaterials
 *  net.minecraft.world.level.block.BeehiveBlock
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.CopperGolemStatueBlock
 *  net.minecraft.world.level.block.CopperGolemStatueBlock$Pose
 *  net.minecraft.world.level.block.LightBlock
 *  net.minecraft.world.level.block.TestBlock
 *  net.minecraft.world.level.block.WeatheringCopperBlocks
 *  net.minecraft.world.level.block.entity.BannerPatternLayers
 *  net.minecraft.world.level.block.entity.PotDecorations
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraft.world.level.block.state.properties.TestBlockMode
 *  net.minecraft.world.level.material.Fluid
 *  net.minecraft.world.level.material.Fluids
 *  net.minecraft.world.waypoints.Waypoint
 */
package net.minecraft.world.item;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BannerPatternTags;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.animal.chicken.ChickenVariants;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.AirItem;
import net.minecraft.world.item.ArmorStandItem;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.BedItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.CompassItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.DebugStickItem;
import net.minecraft.world.item.DiscFragmentItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.world.item.EmptyMapItem;
import net.minecraft.world.item.EndCrystalItem;
import net.minecraft.world.item.EnderEyeItem;
import net.minecraft.world.item.EnderpearlItem;
import net.minecraft.world.item.ExperienceBottleItem;
import net.minecraft.world.item.FireChargeItem;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.FoodOnAStickItem;
import net.minecraft.world.item.GameMasterBlockItem;
import net.minecraft.world.item.GlowInkSacItem;
import net.minecraft.world.item.HangingEntityItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.InkSacItem;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.Instruments;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemFrameItem;
import net.minecraft.world.item.JukeboxSongs;
import net.minecraft.world.item.KnowledgeBookItem;
import net.minecraft.world.item.LeadItem;
import net.minecraft.world.item.LingeringPotionItem;
import net.minecraft.world.item.MaceItem;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.item.NameTagItem;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.item.PlayerHeadItem;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ScaffoldingBlockItem;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.SnowballItem;
import net.minecraft.world.item.SolidBucketItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.SpectralArrowItem;
import net.minecraft.world.item.SplashPotionItem;
import net.minecraft.world.item.SpyglassItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.item.TippedArrowItem;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.WeatheringCopperItems;
import net.minecraft.world.item.WindChargeItem;
import net.minecraft.world.item.WritableBookItem;
import net.minecraft.world.item.WrittenBookItem;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.component.Bees;
import net.minecraft.world.item.component.BlockItemStateProperties;
import net.minecraft.world.item.component.BlocksAttacks;
import net.minecraft.world.item.component.BundleContents;
import net.minecraft.world.item.component.ChargedProjectiles;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.component.DeathProtection;
import net.minecraft.world.item.component.DebugStickState;
import net.minecraft.world.item.component.Fireworks;
import net.minecraft.world.item.component.InstrumentComponent;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.item.component.MapDecorations;
import net.minecraft.world.item.component.MapItemColor;
import net.minecraft.world.item.component.OminousBottleAmplifier;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.item.component.Weapon;
import net.minecraft.world.item.component.WritableBookContent;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CopperGolemStatueBlock;
import net.minecraft.world.level.block.LightBlock;
import net.minecraft.world.level.block.TestBlock;
import net.minecraft.world.level.block.WeatheringCopperBlocks;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraft.world.level.block.entity.PotDecorations;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.TestBlockMode;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.waypoints.Waypoint;

public class Items {
    public static final Item AIR = Items.registerBlock(Blocks.AIR, AirItem::new);
    public static final Item STONE = Items.registerBlock(Blocks.STONE);
    public static final Item GRANITE = Items.registerBlock(Blocks.GRANITE);
    public static final Item POLISHED_GRANITE = Items.registerBlock(Blocks.POLISHED_GRANITE);
    public static final Item DIORITE = Items.registerBlock(Blocks.DIORITE);
    public static final Item POLISHED_DIORITE = Items.registerBlock(Blocks.POLISHED_DIORITE);
    public static final Item ANDESITE = Items.registerBlock(Blocks.ANDESITE);
    public static final Item POLISHED_ANDESITE = Items.registerBlock(Blocks.POLISHED_ANDESITE);
    public static final Item DEEPSLATE = Items.registerBlock(Blocks.DEEPSLATE);
    public static final Item COBBLED_DEEPSLATE = Items.registerBlock(Blocks.COBBLED_DEEPSLATE);
    public static final Item POLISHED_DEEPSLATE = Items.registerBlock(Blocks.POLISHED_DEEPSLATE);
    public static final Item CALCITE = Items.registerBlock(Blocks.CALCITE);
    public static final Item TUFF = Items.registerBlock(Blocks.TUFF);
    public static final Item TUFF_SLAB = Items.registerBlock(Blocks.TUFF_SLAB);
    public static final Item TUFF_STAIRS = Items.registerBlock(Blocks.TUFF_STAIRS);
    public static final Item TUFF_WALL = Items.registerBlock(Blocks.TUFF_WALL);
    public static final Item CHISELED_TUFF = Items.registerBlock(Blocks.CHISELED_TUFF);
    public static final Item POLISHED_TUFF = Items.registerBlock(Blocks.POLISHED_TUFF);
    public static final Item POLISHED_TUFF_SLAB = Items.registerBlock(Blocks.POLISHED_TUFF_SLAB);
    public static final Item POLISHED_TUFF_STAIRS = Items.registerBlock(Blocks.POLISHED_TUFF_STAIRS);
    public static final Item POLISHED_TUFF_WALL = Items.registerBlock(Blocks.POLISHED_TUFF_WALL);
    public static final Item TUFF_BRICKS = Items.registerBlock(Blocks.TUFF_BRICKS);
    public static final Item TUFF_BRICK_SLAB = Items.registerBlock(Blocks.TUFF_BRICK_SLAB);
    public static final Item TUFF_BRICK_STAIRS = Items.registerBlock(Blocks.TUFF_BRICK_STAIRS);
    public static final Item TUFF_BRICK_WALL = Items.registerBlock(Blocks.TUFF_BRICK_WALL);
    public static final Item CHISELED_TUFF_BRICKS = Items.registerBlock(Blocks.CHISELED_TUFF_BRICKS);
    public static final Item DRIPSTONE_BLOCK = Items.registerBlock(Blocks.DRIPSTONE_BLOCK);
    public static final Item GRASS_BLOCK = Items.registerBlock(Blocks.GRASS_BLOCK);
    public static final Item DIRT = Items.registerBlock(Blocks.DIRT);
    public static final Item COARSE_DIRT = Items.registerBlock(Blocks.COARSE_DIRT);
    public static final Item PODZOL = Items.registerBlock(Blocks.PODZOL);
    public static final Item ROOTED_DIRT = Items.registerBlock(Blocks.ROOTED_DIRT);
    public static final Item MUD = Items.registerBlock(Blocks.MUD);
    public static final Item CRIMSON_NYLIUM = Items.registerBlock(Blocks.CRIMSON_NYLIUM);
    public static final Item WARPED_NYLIUM = Items.registerBlock(Blocks.WARPED_NYLIUM);
    public static final Item COBBLESTONE = Items.registerBlock(Blocks.COBBLESTONE);
    public static final Item OAK_PLANKS = Items.registerBlock(Blocks.OAK_PLANKS);
    public static final Item SPRUCE_PLANKS = Items.registerBlock(Blocks.SPRUCE_PLANKS);
    public static final Item BIRCH_PLANKS = Items.registerBlock(Blocks.BIRCH_PLANKS);
    public static final Item JUNGLE_PLANKS = Items.registerBlock(Blocks.JUNGLE_PLANKS);
    public static final Item ACACIA_PLANKS = Items.registerBlock(Blocks.ACACIA_PLANKS);
    public static final Item CHERRY_PLANKS = Items.registerBlock(Blocks.CHERRY_PLANKS);
    public static final Item DARK_OAK_PLANKS = Items.registerBlock(Blocks.DARK_OAK_PLANKS);
    public static final Item PALE_OAK_PLANKS = Items.registerBlock(Blocks.PALE_OAK_PLANKS);
    public static final Item MANGROVE_PLANKS = Items.registerBlock(Blocks.MANGROVE_PLANKS);
    public static final Item BAMBOO_PLANKS = Items.registerBlock(Blocks.BAMBOO_PLANKS);
    public static final Item CRIMSON_PLANKS = Items.registerBlock(Blocks.CRIMSON_PLANKS);
    public static final Item WARPED_PLANKS = Items.registerBlock(Blocks.WARPED_PLANKS);
    public static final Item BAMBOO_MOSAIC = Items.registerBlock(Blocks.BAMBOO_MOSAIC);
    public static final Item OAK_SAPLING = Items.registerBlock(Blocks.OAK_SAPLING);
    public static final Item SPRUCE_SAPLING = Items.registerBlock(Blocks.SPRUCE_SAPLING);
    public static final Item BIRCH_SAPLING = Items.registerBlock(Blocks.BIRCH_SAPLING);
    public static final Item JUNGLE_SAPLING = Items.registerBlock(Blocks.JUNGLE_SAPLING);
    public static final Item ACACIA_SAPLING = Items.registerBlock(Blocks.ACACIA_SAPLING);
    public static final Item CHERRY_SAPLING = Items.registerBlock(Blocks.CHERRY_SAPLING);
    public static final Item DARK_OAK_SAPLING = Items.registerBlock(Blocks.DARK_OAK_SAPLING);
    public static final Item PALE_OAK_SAPLING = Items.registerBlock(Blocks.PALE_OAK_SAPLING);
    public static final Item MANGROVE_PROPAGULE = Items.registerBlock(Blocks.MANGROVE_PROPAGULE);
    public static final Item BEDROCK = Items.registerBlock(Blocks.BEDROCK);
    public static final Item SAND = Items.registerBlock(Blocks.SAND);
    public static final Item SUSPICIOUS_SAND = Items.registerBlock(Blocks.SUSPICIOUS_SAND);
    public static final Item SUSPICIOUS_GRAVEL = Items.registerBlock(Blocks.SUSPICIOUS_GRAVEL);
    public static final Item RED_SAND = Items.registerBlock(Blocks.RED_SAND);
    public static final Item GRAVEL = Items.registerBlock(Blocks.GRAVEL);
    public static final Item COAL_ORE = Items.registerBlock(Blocks.COAL_ORE);
    public static final Item DEEPSLATE_COAL_ORE = Items.registerBlock(Blocks.DEEPSLATE_COAL_ORE);
    public static final Item IRON_ORE = Items.registerBlock(Blocks.IRON_ORE);
    public static final Item DEEPSLATE_IRON_ORE = Items.registerBlock(Blocks.DEEPSLATE_IRON_ORE);
    public static final Item COPPER_ORE = Items.registerBlock(Blocks.COPPER_ORE);
    public static final Item DEEPSLATE_COPPER_ORE = Items.registerBlock(Blocks.DEEPSLATE_COPPER_ORE);
    public static final Item GOLD_ORE = Items.registerBlock(Blocks.GOLD_ORE);
    public static final Item DEEPSLATE_GOLD_ORE = Items.registerBlock(Blocks.DEEPSLATE_GOLD_ORE);
    public static final Item REDSTONE_ORE = Items.registerBlock(Blocks.REDSTONE_ORE);
    public static final Item DEEPSLATE_REDSTONE_ORE = Items.registerBlock(Blocks.DEEPSLATE_REDSTONE_ORE);
    public static final Item EMERALD_ORE = Items.registerBlock(Blocks.EMERALD_ORE);
    public static final Item DEEPSLATE_EMERALD_ORE = Items.registerBlock(Blocks.DEEPSLATE_EMERALD_ORE);
    public static final Item LAPIS_ORE = Items.registerBlock(Blocks.LAPIS_ORE);
    public static final Item DEEPSLATE_LAPIS_ORE = Items.registerBlock(Blocks.DEEPSLATE_LAPIS_ORE);
    public static final Item DIAMOND_ORE = Items.registerBlock(Blocks.DIAMOND_ORE);
    public static final Item DEEPSLATE_DIAMOND_ORE = Items.registerBlock(Blocks.DEEPSLATE_DIAMOND_ORE);
    public static final Item NETHER_GOLD_ORE = Items.registerBlock(Blocks.NETHER_GOLD_ORE);
    public static final Item NETHER_QUARTZ_ORE = Items.registerBlock(Blocks.NETHER_QUARTZ_ORE);
    public static final Item ANCIENT_DEBRIS = Items.registerBlock(Blocks.ANCIENT_DEBRIS, new Item.Properties().fireResistant());
    public static final Item COAL_BLOCK = Items.registerBlock(Blocks.COAL_BLOCK);
    public static final Item RAW_IRON_BLOCK = Items.registerBlock(Blocks.RAW_IRON_BLOCK);
    public static final Item RAW_COPPER_BLOCK = Items.registerBlock(Blocks.RAW_COPPER_BLOCK);
    public static final Item RAW_GOLD_BLOCK = Items.registerBlock(Blocks.RAW_GOLD_BLOCK);
    public static final Item HEAVY_CORE = Items.registerBlock(Blocks.HEAVY_CORE, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item AMETHYST_BLOCK = Items.registerBlock(Blocks.AMETHYST_BLOCK);
    public static final Item BUDDING_AMETHYST = Items.registerBlock(Blocks.BUDDING_AMETHYST);
    public static final Item IRON_BLOCK = Items.registerBlock(Blocks.IRON_BLOCK);
    public static final Item COPPER_BLOCK = Items.registerBlock(Blocks.COPPER_BLOCK);
    public static final Item GOLD_BLOCK = Items.registerBlock(Blocks.GOLD_BLOCK);
    public static final Item DIAMOND_BLOCK = Items.registerBlock(Blocks.DIAMOND_BLOCK);
    public static final Item NETHERITE_BLOCK = Items.registerBlock(Blocks.NETHERITE_BLOCK, new Item.Properties().fireResistant());
    public static final Item EXPOSED_COPPER = Items.registerBlock(Blocks.EXPOSED_COPPER);
    public static final Item WEATHERED_COPPER = Items.registerBlock(Blocks.WEATHERED_COPPER);
    public static final Item OXIDIZED_COPPER = Items.registerBlock(Blocks.OXIDIZED_COPPER);
    public static final Item CHISELED_COPPER = Items.registerBlock(Blocks.CHISELED_COPPER);
    public static final Item EXPOSED_CHISELED_COPPER = Items.registerBlock(Blocks.EXPOSED_CHISELED_COPPER);
    public static final Item WEATHERED_CHISELED_COPPER = Items.registerBlock(Blocks.WEATHERED_CHISELED_COPPER);
    public static final Item OXIDIZED_CHISELED_COPPER = Items.registerBlock(Blocks.OXIDIZED_CHISELED_COPPER);
    public static final Item CUT_COPPER = Items.registerBlock(Blocks.CUT_COPPER);
    public static final Item EXPOSED_CUT_COPPER = Items.registerBlock(Blocks.EXPOSED_CUT_COPPER);
    public static final Item WEATHERED_CUT_COPPER = Items.registerBlock(Blocks.WEATHERED_CUT_COPPER);
    public static final Item OXIDIZED_CUT_COPPER = Items.registerBlock(Blocks.OXIDIZED_CUT_COPPER);
    public static final Item CUT_COPPER_STAIRS = Items.registerBlock(Blocks.CUT_COPPER_STAIRS);
    public static final Item EXPOSED_CUT_COPPER_STAIRS = Items.registerBlock(Blocks.EXPOSED_CUT_COPPER_STAIRS);
    public static final Item WEATHERED_CUT_COPPER_STAIRS = Items.registerBlock(Blocks.WEATHERED_CUT_COPPER_STAIRS);
    public static final Item OXIDIZED_CUT_COPPER_STAIRS = Items.registerBlock(Blocks.OXIDIZED_CUT_COPPER_STAIRS);
    public static final Item CUT_COPPER_SLAB = Items.registerBlock(Blocks.CUT_COPPER_SLAB);
    public static final Item EXPOSED_CUT_COPPER_SLAB = Items.registerBlock(Blocks.EXPOSED_CUT_COPPER_SLAB);
    public static final Item WEATHERED_CUT_COPPER_SLAB = Items.registerBlock(Blocks.WEATHERED_CUT_COPPER_SLAB);
    public static final Item OXIDIZED_CUT_COPPER_SLAB = Items.registerBlock(Blocks.OXIDIZED_CUT_COPPER_SLAB);
    public static final Item WAXED_COPPER_BLOCK = Items.registerBlock(Blocks.WAXED_COPPER_BLOCK);
    public static final Item WAXED_EXPOSED_COPPER = Items.registerBlock(Blocks.WAXED_EXPOSED_COPPER);
    public static final Item WAXED_WEATHERED_COPPER = Items.registerBlock(Blocks.WAXED_WEATHERED_COPPER);
    public static final Item WAXED_OXIDIZED_COPPER = Items.registerBlock(Blocks.WAXED_OXIDIZED_COPPER);
    public static final Item WAXED_CHISELED_COPPER = Items.registerBlock(Blocks.WAXED_CHISELED_COPPER);
    public static final Item WAXED_EXPOSED_CHISELED_COPPER = Items.registerBlock(Blocks.WAXED_EXPOSED_CHISELED_COPPER);
    public static final Item WAXED_WEATHERED_CHISELED_COPPER = Items.registerBlock(Blocks.WAXED_WEATHERED_CHISELED_COPPER);
    public static final Item WAXED_OXIDIZED_CHISELED_COPPER = Items.registerBlock(Blocks.WAXED_OXIDIZED_CHISELED_COPPER);
    public static final Item WAXED_CUT_COPPER = Items.registerBlock(Blocks.WAXED_CUT_COPPER);
    public static final Item WAXED_EXPOSED_CUT_COPPER = Items.registerBlock(Blocks.WAXED_EXPOSED_CUT_COPPER);
    public static final Item WAXED_WEATHERED_CUT_COPPER = Items.registerBlock(Blocks.WAXED_WEATHERED_CUT_COPPER);
    public static final Item WAXED_OXIDIZED_CUT_COPPER = Items.registerBlock(Blocks.WAXED_OXIDIZED_CUT_COPPER);
    public static final Item WAXED_CUT_COPPER_STAIRS = Items.registerBlock(Blocks.WAXED_CUT_COPPER_STAIRS);
    public static final Item WAXED_EXPOSED_CUT_COPPER_STAIRS = Items.registerBlock(Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS);
    public static final Item WAXED_WEATHERED_CUT_COPPER_STAIRS = Items.registerBlock(Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS);
    public static final Item WAXED_OXIDIZED_CUT_COPPER_STAIRS = Items.registerBlock(Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
    public static final Item WAXED_CUT_COPPER_SLAB = Items.registerBlock(Blocks.WAXED_CUT_COPPER_SLAB);
    public static final Item WAXED_EXPOSED_CUT_COPPER_SLAB = Items.registerBlock(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
    public static final Item WAXED_WEATHERED_CUT_COPPER_SLAB = Items.registerBlock(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
    public static final Item WAXED_OXIDIZED_CUT_COPPER_SLAB = Items.registerBlock(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
    public static final Item OAK_LOG = Items.registerBlock(Blocks.OAK_LOG);
    public static final Item SPRUCE_LOG = Items.registerBlock(Blocks.SPRUCE_LOG);
    public static final Item BIRCH_LOG = Items.registerBlock(Blocks.BIRCH_LOG);
    public static final Item JUNGLE_LOG = Items.registerBlock(Blocks.JUNGLE_LOG);
    public static final Item ACACIA_LOG = Items.registerBlock(Blocks.ACACIA_LOG);
    public static final Item CHERRY_LOG = Items.registerBlock(Blocks.CHERRY_LOG);
    public static final Item PALE_OAK_LOG = Items.registerBlock(Blocks.PALE_OAK_LOG);
    public static final Item DARK_OAK_LOG = Items.registerBlock(Blocks.DARK_OAK_LOG);
    public static final Item MANGROVE_LOG = Items.registerBlock(Blocks.MANGROVE_LOG);
    public static final Item MANGROVE_ROOTS = Items.registerBlock(Blocks.MANGROVE_ROOTS);
    public static final Item MUDDY_MANGROVE_ROOTS = Items.registerBlock(Blocks.MUDDY_MANGROVE_ROOTS);
    public static final Item CRIMSON_STEM = Items.registerBlock(Blocks.CRIMSON_STEM);
    public static final Item WARPED_STEM = Items.registerBlock(Blocks.WARPED_STEM);
    public static final Item BAMBOO_BLOCK = Items.registerBlock(Blocks.BAMBOO_BLOCK);
    public static final Item STRIPPED_OAK_LOG = Items.registerBlock(Blocks.STRIPPED_OAK_LOG);
    public static final Item STRIPPED_SPRUCE_LOG = Items.registerBlock(Blocks.STRIPPED_SPRUCE_LOG);
    public static final Item STRIPPED_BIRCH_LOG = Items.registerBlock(Blocks.STRIPPED_BIRCH_LOG);
    public static final Item STRIPPED_JUNGLE_LOG = Items.registerBlock(Blocks.STRIPPED_JUNGLE_LOG);
    public static final Item STRIPPED_ACACIA_LOG = Items.registerBlock(Blocks.STRIPPED_ACACIA_LOG);
    public static final Item STRIPPED_CHERRY_LOG = Items.registerBlock(Blocks.STRIPPED_CHERRY_LOG);
    public static final Item STRIPPED_DARK_OAK_LOG = Items.registerBlock(Blocks.STRIPPED_DARK_OAK_LOG);
    public static final Item STRIPPED_PALE_OAK_LOG = Items.registerBlock(Blocks.STRIPPED_PALE_OAK_LOG);
    public static final Item STRIPPED_MANGROVE_LOG = Items.registerBlock(Blocks.STRIPPED_MANGROVE_LOG);
    public static final Item STRIPPED_CRIMSON_STEM = Items.registerBlock(Blocks.STRIPPED_CRIMSON_STEM);
    public static final Item STRIPPED_WARPED_STEM = Items.registerBlock(Blocks.STRIPPED_WARPED_STEM);
    public static final Item STRIPPED_OAK_WOOD = Items.registerBlock(Blocks.STRIPPED_OAK_WOOD);
    public static final Item STRIPPED_SPRUCE_WOOD = Items.registerBlock(Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Item STRIPPED_BIRCH_WOOD = Items.registerBlock(Blocks.STRIPPED_BIRCH_WOOD);
    public static final Item STRIPPED_JUNGLE_WOOD = Items.registerBlock(Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Item STRIPPED_ACACIA_WOOD = Items.registerBlock(Blocks.STRIPPED_ACACIA_WOOD);
    public static final Item STRIPPED_CHERRY_WOOD = Items.registerBlock(Blocks.STRIPPED_CHERRY_WOOD);
    public static final Item STRIPPED_DARK_OAK_WOOD = Items.registerBlock(Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Item STRIPPED_PALE_OAK_WOOD = Items.registerBlock(Blocks.STRIPPED_PALE_OAK_WOOD);
    public static final Item STRIPPED_MANGROVE_WOOD = Items.registerBlock(Blocks.STRIPPED_MANGROVE_WOOD);
    public static final Item STRIPPED_CRIMSON_HYPHAE = Items.registerBlock(Blocks.STRIPPED_CRIMSON_HYPHAE);
    public static final Item STRIPPED_WARPED_HYPHAE = Items.registerBlock(Blocks.STRIPPED_WARPED_HYPHAE);
    public static final Item STRIPPED_BAMBOO_BLOCK = Items.registerBlock(Blocks.STRIPPED_BAMBOO_BLOCK);
    public static final Item OAK_WOOD = Items.registerBlock(Blocks.OAK_WOOD);
    public static final Item SPRUCE_WOOD = Items.registerBlock(Blocks.SPRUCE_WOOD);
    public static final Item BIRCH_WOOD = Items.registerBlock(Blocks.BIRCH_WOOD);
    public static final Item JUNGLE_WOOD = Items.registerBlock(Blocks.JUNGLE_WOOD);
    public static final Item ACACIA_WOOD = Items.registerBlock(Blocks.ACACIA_WOOD);
    public static final Item CHERRY_WOOD = Items.registerBlock(Blocks.CHERRY_WOOD);
    public static final Item PALE_OAK_WOOD = Items.registerBlock(Blocks.PALE_OAK_WOOD);
    public static final Item DARK_OAK_WOOD = Items.registerBlock(Blocks.DARK_OAK_WOOD);
    public static final Item MANGROVE_WOOD = Items.registerBlock(Blocks.MANGROVE_WOOD);
    public static final Item CRIMSON_HYPHAE = Items.registerBlock(Blocks.CRIMSON_HYPHAE);
    public static final Item WARPED_HYPHAE = Items.registerBlock(Blocks.WARPED_HYPHAE);
    public static final Item OAK_LEAVES = Items.registerBlock(Blocks.OAK_LEAVES);
    public static final Item SPRUCE_LEAVES = Items.registerBlock(Blocks.SPRUCE_LEAVES);
    public static final Item BIRCH_LEAVES = Items.registerBlock(Blocks.BIRCH_LEAVES);
    public static final Item JUNGLE_LEAVES = Items.registerBlock(Blocks.JUNGLE_LEAVES);
    public static final Item ACACIA_LEAVES = Items.registerBlock(Blocks.ACACIA_LEAVES);
    public static final Item CHERRY_LEAVES = Items.registerBlock(Blocks.CHERRY_LEAVES);
    public static final Item DARK_OAK_LEAVES = Items.registerBlock(Blocks.DARK_OAK_LEAVES);
    public static final Item PALE_OAK_LEAVES = Items.registerBlock(Blocks.PALE_OAK_LEAVES);
    public static final Item MANGROVE_LEAVES = Items.registerBlock(Blocks.MANGROVE_LEAVES);
    public static final Item AZALEA_LEAVES = Items.registerBlock(Blocks.AZALEA_LEAVES);
    public static final Item FLOWERING_AZALEA_LEAVES = Items.registerBlock(Blocks.FLOWERING_AZALEA_LEAVES);
    public static final Item SPONGE = Items.registerBlock(Blocks.SPONGE);
    public static final Item WET_SPONGE = Items.registerBlock(Blocks.WET_SPONGE);
    public static final Item GLASS = Items.registerBlock(Blocks.GLASS);
    public static final Item TINTED_GLASS = Items.registerBlock(Blocks.TINTED_GLASS);
    public static final Item LAPIS_BLOCK = Items.registerBlock(Blocks.LAPIS_BLOCK);
    public static final Item SANDSTONE = Items.registerBlock(Blocks.SANDSTONE);
    public static final Item CHISELED_SANDSTONE = Items.registerBlock(Blocks.CHISELED_SANDSTONE);
    public static final Item CUT_SANDSTONE = Items.registerBlock(Blocks.CUT_SANDSTONE);
    public static final Item COBWEB = Items.registerBlock(Blocks.COBWEB);
    public static final Item SHORT_GRASS = Items.registerBlock(Blocks.SHORT_GRASS);
    public static final Item FERN = Items.registerBlock(Blocks.FERN);
    public static final Item BUSH = Items.registerBlock(Blocks.BUSH);
    public static final Item AZALEA = Items.registerBlock(Blocks.AZALEA);
    public static final Item FLOWERING_AZALEA = Items.registerBlock(Blocks.FLOWERING_AZALEA);
    public static final Item DEAD_BUSH = Items.registerBlock(Blocks.DEAD_BUSH);
    public static final Item FIREFLY_BUSH = Items.registerBlock(Blocks.FIREFLY_BUSH);
    public static final Item DRY_SHORT_GRASS = Items.registerBlock(Blocks.SHORT_DRY_GRASS);
    public static final Item DRY_TALL_GRASS = Items.registerBlock(Blocks.TALL_DRY_GRASS);
    public static final Item SEAGRASS = Items.registerBlock(Blocks.SEAGRASS);
    public static final Item SEA_PICKLE = Items.registerBlock(Blocks.SEA_PICKLE);
    public static final Item WHITE_WOOL = Items.registerBlock(Blocks.WHITE_WOOL);
    public static final Item ORANGE_WOOL = Items.registerBlock(Blocks.ORANGE_WOOL);
    public static final Item MAGENTA_WOOL = Items.registerBlock(Blocks.MAGENTA_WOOL);
    public static final Item LIGHT_BLUE_WOOL = Items.registerBlock(Blocks.LIGHT_BLUE_WOOL);
    public static final Item YELLOW_WOOL = Items.registerBlock(Blocks.YELLOW_WOOL);
    public static final Item LIME_WOOL = Items.registerBlock(Blocks.LIME_WOOL);
    public static final Item PINK_WOOL = Items.registerBlock(Blocks.PINK_WOOL);
    public static final Item GRAY_WOOL = Items.registerBlock(Blocks.GRAY_WOOL);
    public static final Item LIGHT_GRAY_WOOL = Items.registerBlock(Blocks.LIGHT_GRAY_WOOL);
    public static final Item CYAN_WOOL = Items.registerBlock(Blocks.CYAN_WOOL);
    public static final Item PURPLE_WOOL = Items.registerBlock(Blocks.PURPLE_WOOL);
    public static final Item BLUE_WOOL = Items.registerBlock(Blocks.BLUE_WOOL);
    public static final Item BROWN_WOOL = Items.registerBlock(Blocks.BROWN_WOOL);
    public static final Item GREEN_WOOL = Items.registerBlock(Blocks.GREEN_WOOL);
    public static final Item RED_WOOL = Items.registerBlock(Blocks.RED_WOOL);
    public static final Item BLACK_WOOL = Items.registerBlock(Blocks.BLACK_WOOL);
    public static final Item DANDELION = Items.registerBlock(Blocks.DANDELION);
    public static final Item OPEN_EYEBLOSSOM = Items.registerBlock(Blocks.OPEN_EYEBLOSSOM);
    public static final Item CLOSED_EYEBLOSSOM = Items.registerBlock(Blocks.CLOSED_EYEBLOSSOM);
    public static final Item POPPY = Items.registerBlock(Blocks.POPPY);
    public static final Item BLUE_ORCHID = Items.registerBlock(Blocks.BLUE_ORCHID);
    public static final Item ALLIUM = Items.registerBlock(Blocks.ALLIUM);
    public static final Item AZURE_BLUET = Items.registerBlock(Blocks.AZURE_BLUET);
    public static final Item RED_TULIP = Items.registerBlock(Blocks.RED_TULIP);
    public static final Item ORANGE_TULIP = Items.registerBlock(Blocks.ORANGE_TULIP);
    public static final Item WHITE_TULIP = Items.registerBlock(Blocks.WHITE_TULIP);
    public static final Item PINK_TULIP = Items.registerBlock(Blocks.PINK_TULIP);
    public static final Item OXEYE_DAISY = Items.registerBlock(Blocks.OXEYE_DAISY);
    public static final Item CORNFLOWER = Items.registerBlock(Blocks.CORNFLOWER);
    public static final Item LILY_OF_THE_VALLEY = Items.registerBlock(Blocks.LILY_OF_THE_VALLEY);
    public static final Item WITHER_ROSE = Items.registerBlock(Blocks.WITHER_ROSE);
    public static final Item TORCHFLOWER = Items.registerBlock(Blocks.TORCHFLOWER);
    public static final Item PITCHER_PLANT = Items.registerBlock(Blocks.PITCHER_PLANT);
    public static final Item SPORE_BLOSSOM = Items.registerBlock(Blocks.SPORE_BLOSSOM);
    public static final Item BROWN_MUSHROOM = Items.registerBlock(Blocks.BROWN_MUSHROOM);
    public static final Item RED_MUSHROOM = Items.registerBlock(Blocks.RED_MUSHROOM);
    public static final Item CRIMSON_FUNGUS = Items.registerBlock(Blocks.CRIMSON_FUNGUS);
    public static final Item WARPED_FUNGUS = Items.registerBlock(Blocks.WARPED_FUNGUS);
    public static final Item CRIMSON_ROOTS = Items.registerBlock(Blocks.CRIMSON_ROOTS);
    public static final Item WARPED_ROOTS = Items.registerBlock(Blocks.WARPED_ROOTS);
    public static final Item NETHER_SPROUTS = Items.registerBlock(Blocks.NETHER_SPROUTS);
    public static final Item WEEPING_VINES = Items.registerBlock(Blocks.WEEPING_VINES);
    public static final Item TWISTING_VINES = Items.registerBlock(Blocks.TWISTING_VINES);
    public static final Item SUGAR_CANE = Items.registerBlock(Blocks.SUGAR_CANE);
    public static final Item KELP = Items.registerBlock(Blocks.KELP);
    public static final Item PINK_PETALS = Items.registerBlock(Blocks.PINK_PETALS);
    public static final Item WILDFLOWERS = Items.registerBlock(Blocks.WILDFLOWERS);
    public static final Item LEAF_LITTER = Items.registerBlock(Blocks.LEAF_LITTER);
    public static final Item MOSS_CARPET = Items.registerBlock(Blocks.MOSS_CARPET);
    public static final Item MOSS_BLOCK = Items.registerBlock(Blocks.MOSS_BLOCK);
    public static final Item PALE_MOSS_CARPET = Items.registerBlock(Blocks.PALE_MOSS_CARPET);
    public static final Item PALE_HANGING_MOSS = Items.registerBlock(Blocks.PALE_HANGING_MOSS);
    public static final Item PALE_MOSS_BLOCK = Items.registerBlock(Blocks.PALE_MOSS_BLOCK);
    public static final Item HANGING_ROOTS = Items.registerBlock(Blocks.HANGING_ROOTS);
    public static final Item BIG_DRIPLEAF = Items.registerBlock(Blocks.BIG_DRIPLEAF, Blocks.BIG_DRIPLEAF_STEM);
    public static final Item SMALL_DRIPLEAF = Items.registerBlock(Blocks.SMALL_DRIPLEAF, DoubleHighBlockItem::new);
    public static final Item BAMBOO = Items.registerBlock(Blocks.BAMBOO);
    public static final Item OAK_SLAB = Items.registerBlock(Blocks.OAK_SLAB);
    public static final Item SPRUCE_SLAB = Items.registerBlock(Blocks.SPRUCE_SLAB);
    public static final Item BIRCH_SLAB = Items.registerBlock(Blocks.BIRCH_SLAB);
    public static final Item JUNGLE_SLAB = Items.registerBlock(Blocks.JUNGLE_SLAB);
    public static final Item ACACIA_SLAB = Items.registerBlock(Blocks.ACACIA_SLAB);
    public static final Item CHERRY_SLAB = Items.registerBlock(Blocks.CHERRY_SLAB);
    public static final Item DARK_OAK_SLAB = Items.registerBlock(Blocks.DARK_OAK_SLAB);
    public static final Item PALE_OAK_SLAB = Items.registerBlock(Blocks.PALE_OAK_SLAB);
    public static final Item MANGROVE_SLAB = Items.registerBlock(Blocks.MANGROVE_SLAB);
    public static final Item BAMBOO_SLAB = Items.registerBlock(Blocks.BAMBOO_SLAB);
    public static final Item BAMBOO_MOSAIC_SLAB = Items.registerBlock(Blocks.BAMBOO_MOSAIC_SLAB);
    public static final Item CRIMSON_SLAB = Items.registerBlock(Blocks.CRIMSON_SLAB);
    public static final Item WARPED_SLAB = Items.registerBlock(Blocks.WARPED_SLAB);
    public static final Item STONE_SLAB = Items.registerBlock(Blocks.STONE_SLAB);
    public static final Item SMOOTH_STONE_SLAB = Items.registerBlock(Blocks.SMOOTH_STONE_SLAB);
    public static final Item SANDSTONE_SLAB = Items.registerBlock(Blocks.SANDSTONE_SLAB);
    public static final Item CUT_STANDSTONE_SLAB = Items.registerBlock(Blocks.CUT_SANDSTONE_SLAB);
    public static final Item PETRIFIED_OAK_SLAB = Items.registerBlock(Blocks.PETRIFIED_OAK_SLAB);
    public static final Item COBBLESTONE_SLAB = Items.registerBlock(Blocks.COBBLESTONE_SLAB);
    public static final Item BRICK_SLAB = Items.registerBlock(Blocks.BRICK_SLAB);
    public static final Item STONE_BRICK_SLAB = Items.registerBlock(Blocks.STONE_BRICK_SLAB);
    public static final Item MUD_BRICK_SLAB = Items.registerBlock(Blocks.MUD_BRICK_SLAB);
    public static final Item NETHER_BRICK_SLAB = Items.registerBlock(Blocks.NETHER_BRICK_SLAB);
    public static final Item QUARTZ_SLAB = Items.registerBlock(Blocks.QUARTZ_SLAB);
    public static final Item RED_SANDSTONE_SLAB = Items.registerBlock(Blocks.RED_SANDSTONE_SLAB);
    public static final Item CUT_RED_SANDSTONE_SLAB = Items.registerBlock(Blocks.CUT_RED_SANDSTONE_SLAB);
    public static final Item PURPUR_SLAB = Items.registerBlock(Blocks.PURPUR_SLAB);
    public static final Item PRISMARINE_SLAB = Items.registerBlock(Blocks.PRISMARINE_SLAB);
    public static final Item PRISMARINE_BRICK_SLAB = Items.registerBlock(Blocks.PRISMARINE_BRICK_SLAB);
    public static final Item DARK_PRISMARINE_SLAB = Items.registerBlock(Blocks.DARK_PRISMARINE_SLAB);
    public static final Item SMOOTH_QUARTZ = Items.registerBlock(Blocks.SMOOTH_QUARTZ);
    public static final Item SMOOTH_RED_SANDSTONE = Items.registerBlock(Blocks.SMOOTH_RED_SANDSTONE);
    public static final Item SMOOTH_SANDSTONE = Items.registerBlock(Blocks.SMOOTH_SANDSTONE);
    public static final Item SMOOTH_STONE = Items.registerBlock(Blocks.SMOOTH_STONE);
    public static final Item BRICKS = Items.registerBlock(Blocks.BRICKS);
    public static final Item ACACIA_SHELF = Items.registerBlock(Blocks.ACACIA_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item BAMBOO_SHELF = Items.registerBlock(Blocks.BAMBOO_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item BIRCH_SHELF = Items.registerBlock(Blocks.BIRCH_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item CHERRY_SHELF = Items.registerBlock(Blocks.CHERRY_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item CRIMSON_SHELF = Items.registerBlock(Blocks.CRIMSON_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item DARK_OAK_SHELF = Items.registerBlock(Blocks.DARK_OAK_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item JUNGLE_SHELF = Items.registerBlock(Blocks.JUNGLE_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item MANGROVE_SHELF = Items.registerBlock(Blocks.MANGROVE_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item OAK_SHELF = Items.registerBlock(Blocks.OAK_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item PALE_OAK_SHELF = Items.registerBlock(Blocks.PALE_OAK_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item SPRUCE_SHELF = Items.registerBlock(Blocks.SPRUCE_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item WARPED_SHELF = Items.registerBlock(Blocks.WARPED_SHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item BOOKSHELF = Items.registerBlock(Blocks.BOOKSHELF);
    public static final Item CHISELED_BOOKSHELF = Items.registerBlock(Blocks.CHISELED_BOOKSHELF, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item DECORATED_POT = Items.registerBlock(Blocks.DECORATED_POT, new Item.Properties().component(DataComponents.POT_DECORATIONS, (Object)PotDecorations.EMPTY).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item MOSSY_COBBLESTONE = Items.registerBlock(Blocks.MOSSY_COBBLESTONE);
    public static final Item OBSIDIAN = Items.registerBlock(Blocks.OBSIDIAN);
    public static final Item TORCH = Items.registerBlock(Blocks.TORCH, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.WALL_TORCH, Direction.DOWN, properties));
    public static final Item END_ROD = Items.registerBlock(Blocks.END_ROD);
    public static final Item CHORUS_PLANT = Items.registerBlock(Blocks.CHORUS_PLANT);
    public static final Item CHORUS_FLOWER = Items.registerBlock(Blocks.CHORUS_FLOWER);
    public static final Item PURPUR_BLOCK = Items.registerBlock(Blocks.PURPUR_BLOCK);
    public static final Item PURPUR_PILLAR = Items.registerBlock(Blocks.PURPUR_PILLAR);
    public static final Item PURPUR_STAIRS = Items.registerBlock(Blocks.PURPUR_STAIRS);
    public static final Item SPAWNER = Items.registerBlock(Blocks.SPAWNER);
    public static final Item CREAKING_HEART = Items.registerBlock(Blocks.CREAKING_HEART);
    public static final Item CHEST = Items.registerBlock(Blocks.CHEST, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item CRAFTING_TABLE = Items.registerBlock(Blocks.CRAFTING_TABLE);
    public static final Item FARMLAND = Items.registerBlock(Blocks.FARMLAND);
    public static final Item FURNACE = Items.registerBlock(Blocks.FURNACE, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item LADDER = Items.registerBlock(Blocks.LADDER);
    public static final Item COBBLESTONE_STAIRS = Items.registerBlock(Blocks.COBBLESTONE_STAIRS);
    public static final Item SNOW = Items.registerBlock(Blocks.SNOW);
    public static final Item ICE = Items.registerBlock(Blocks.ICE);
    public static final Item SNOW_BLOCK = Items.registerBlock(Blocks.SNOW_BLOCK);
    public static final Item CACTUS = Items.registerBlock(Blocks.CACTUS);
    public static final Item CACTUS_FLOWER = Items.registerBlock(Blocks.CACTUS_FLOWER);
    public static final Item CLAY = Items.registerBlock(Blocks.CLAY);
    public static final Item JUKEBOX = Items.registerBlock(Blocks.JUKEBOX);
    public static final Item OAK_FENCE = Items.registerBlock(Blocks.OAK_FENCE);
    public static final Item SPRUCE_FENCE = Items.registerBlock(Blocks.SPRUCE_FENCE);
    public static final Item BIRCH_FENCE = Items.registerBlock(Blocks.BIRCH_FENCE);
    public static final Item JUNGLE_FENCE = Items.registerBlock(Blocks.JUNGLE_FENCE);
    public static final Item ACACIA_FENCE = Items.registerBlock(Blocks.ACACIA_FENCE);
    public static final Item CHERRY_FENCE = Items.registerBlock(Blocks.CHERRY_FENCE);
    public static final Item DARK_OAK_FENCE = Items.registerBlock(Blocks.DARK_OAK_FENCE);
    public static final Item PALE_OAK_FENCE = Items.registerBlock(Blocks.PALE_OAK_FENCE);
    public static final Item MANGROVE_FENCE = Items.registerBlock(Blocks.MANGROVE_FENCE);
    public static final Item BAMBOO_FENCE = Items.registerBlock(Blocks.BAMBOO_FENCE);
    public static final Item CRIMSON_FENCE = Items.registerBlock(Blocks.CRIMSON_FENCE);
    public static final Item WARPED_FENCE = Items.registerBlock(Blocks.WARPED_FENCE);
    public static final Item PUMPKIN = Items.registerBlock(Blocks.PUMPKIN);
    public static final Item CARVED_PUMPKIN = Items.registerBlock(Blocks.CARVED_PUMPKIN, properties -> Waypoint.addHideAttribute((Item.Properties)properties).component(DataComponents.EQUIPPABLE, (Object)Equippable.builder((EquipmentSlot)EquipmentSlot.HEAD).setSwappable(false).setCameraOverlay(Identifier.withDefaultNamespace((String)"misc/pumpkinblur")).build()));
    public static final Item JACK_O_LANTERN = Items.registerBlock(Blocks.JACK_O_LANTERN);
    public static final Item NETHERRACK = Items.registerBlock(Blocks.NETHERRACK);
    public static final Item SOUL_SAND = Items.registerBlock(Blocks.SOUL_SAND);
    public static final Item SOUL_SOIL = Items.registerBlock(Blocks.SOUL_SOIL);
    public static final Item BASALT = Items.registerBlock(Blocks.BASALT);
    public static final Item POLISHED_BASALT = Items.registerBlock(Blocks.POLISHED_BASALT);
    public static final Item SMOOTH_BASALT = Items.registerBlock(Blocks.SMOOTH_BASALT);
    public static final Item SOUL_TORCH = Items.registerBlock(Blocks.SOUL_TORCH, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.SOUL_WALL_TORCH, Direction.DOWN, properties));
    public static final Item COPPER_TORCH = Items.registerBlock(Blocks.COPPER_TORCH, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.COPPER_WALL_TORCH, Direction.DOWN, properties));
    public static final Item GLOWSTONE = Items.registerBlock(Blocks.GLOWSTONE);
    public static final Item INFESTED_STONE = Items.registerBlock(Blocks.INFESTED_STONE);
    public static final Item INFESTED_COBBLESTONE = Items.registerBlock(Blocks.INFESTED_COBBLESTONE);
    public static final Item INFESTED_STONE_BRICKS = Items.registerBlock(Blocks.INFESTED_STONE_BRICKS);
    public static final Item INFESTED_MOSSY_STONE_BRICKS = Items.registerBlock(Blocks.INFESTED_MOSSY_STONE_BRICKS);
    public static final Item INFESTED_CRACKED_STONE_BRICKS = Items.registerBlock(Blocks.INFESTED_CRACKED_STONE_BRICKS);
    public static final Item INFESTED_CHISELED_STONE_BRICKS = Items.registerBlock(Blocks.INFESTED_CHISELED_STONE_BRICKS);
    public static final Item INFESTED_DEEPSLATE = Items.registerBlock(Blocks.INFESTED_DEEPSLATE);
    public static final Item STONE_BRICKS = Items.registerBlock(Blocks.STONE_BRICKS);
    public static final Item MOSSY_STONE_BRICKS = Items.registerBlock(Blocks.MOSSY_STONE_BRICKS);
    public static final Item CRACKED_STONE_BRICKS = Items.registerBlock(Blocks.CRACKED_STONE_BRICKS);
    public static final Item CHISELED_STONE_BRICKS = Items.registerBlock(Blocks.CHISELED_STONE_BRICKS);
    public static final Item PACKED_MUD = Items.registerBlock(Blocks.PACKED_MUD);
    public static final Item MUD_BRICKS = Items.registerBlock(Blocks.MUD_BRICKS);
    public static final Item DEEPSLATE_BRICKS = Items.registerBlock(Blocks.DEEPSLATE_BRICKS);
    public static final Item CRACKED_DEEPSLATE_BRICKS = Items.registerBlock(Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Item DEEPSLATE_TILES = Items.registerBlock(Blocks.DEEPSLATE_TILES);
    public static final Item CRACKED_DEEPSLATE_TILES = Items.registerBlock(Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Item CHISELED_DEEPSLATE = Items.registerBlock(Blocks.CHISELED_DEEPSLATE);
    public static final Item REINFORCED_DEEPSLATE = Items.registerBlock(Blocks.REINFORCED_DEEPSLATE);
    public static final Item BROWN_MUSHROOM_BLOCK = Items.registerBlock(Blocks.BROWN_MUSHROOM_BLOCK);
    public static final Item RED_MUSHROOM_BLOCK = Items.registerBlock(Blocks.RED_MUSHROOM_BLOCK);
    public static final Item MUSHROOM_STEM = Items.registerBlock(Blocks.MUSHROOM_STEM);
    public static final Item IRON_BARS = Items.registerBlock(Blocks.IRON_BARS);
    public static final WeatheringCopperItems COPPER_BARS = WeatheringCopperItems.create((WeatheringCopperBlocks)Blocks.COPPER_BARS, Items::registerBlock);
    public static final Item IRON_CHAIN = Items.registerBlock(Blocks.IRON_CHAIN);
    public static final WeatheringCopperItems COPPER_CHAIN = WeatheringCopperItems.create((WeatheringCopperBlocks)Blocks.COPPER_CHAIN, Items::registerBlock);
    public static final Item GLASS_PANE = Items.registerBlock(Blocks.GLASS_PANE);
    public static final Item MELON = Items.registerBlock(Blocks.MELON);
    public static final Item VINE = Items.registerBlock(Blocks.VINE);
    public static final Item GLOW_LICHEN = Items.registerBlock(Blocks.GLOW_LICHEN);
    public static final Item RESIN_CLUMP = Items.registerItem("resin_clump", Items.createBlockItemWithCustomItemName(Blocks.RESIN_CLUMP));
    public static final Item RESIN_BLOCK = Items.registerBlock(Blocks.RESIN_BLOCK);
    public static final Item RESIN_BRICKS = Items.registerBlock(Blocks.RESIN_BRICKS);
    public static final Item RESIN_BRICK_STAIRS = Items.registerBlock(Blocks.RESIN_BRICK_STAIRS);
    public static final Item RESIN_BRICK_SLAB = Items.registerBlock(Blocks.RESIN_BRICK_SLAB);
    public static final Item RESIN_BRICK_WALL = Items.registerBlock(Blocks.RESIN_BRICK_WALL);
    public static final Item CHISELED_RESIN_BRICKS = Items.registerBlock(Blocks.CHISELED_RESIN_BRICKS);
    public static final Item BRICK_STAIRS = Items.registerBlock(Blocks.BRICK_STAIRS);
    public static final Item STONE_BRICK_STAIRS = Items.registerBlock(Blocks.STONE_BRICK_STAIRS);
    public static final Item MUD_BRICK_STAIRS = Items.registerBlock(Blocks.MUD_BRICK_STAIRS);
    public static final Item MYCELIUM = Items.registerBlock(Blocks.MYCELIUM);
    public static final Item LILY_PAD = Items.registerBlock(Blocks.LILY_PAD, PlaceOnWaterBlockItem::new);
    public static final Item NETHER_BRICKS = Items.registerBlock(Blocks.NETHER_BRICKS);
    public static final Item CRACKED_NETHER_BRICKS = Items.registerBlock(Blocks.CRACKED_NETHER_BRICKS);
    public static final Item CHISELED_NETHER_BRICKS = Items.registerBlock(Blocks.CHISELED_NETHER_BRICKS);
    public static final Item NETHER_BRICK_FENCE = Items.registerBlock(Blocks.NETHER_BRICK_FENCE);
    public static final Item NETHER_BRICK_STAIRS = Items.registerBlock(Blocks.NETHER_BRICK_STAIRS);
    public static final Item SCULK = Items.registerBlock(Blocks.SCULK);
    public static final Item SCULK_VEIN = Items.registerBlock(Blocks.SCULK_VEIN);
    public static final Item SCULK_CATALYST = Items.registerBlock(Blocks.SCULK_CATALYST);
    public static final Item SCULK_SHRIEKER = Items.registerBlock(Blocks.SCULK_SHRIEKER);
    public static final Item ENCHANTING_TABLE = Items.registerBlock(Blocks.ENCHANTING_TABLE);
    public static final Item END_PORTAL_FRAME = Items.registerBlock(Blocks.END_PORTAL_FRAME);
    public static final Item END_STONE = Items.registerBlock(Blocks.END_STONE);
    public static final Item END_STONE_BRICKS = Items.registerBlock(Blocks.END_STONE_BRICKS);
    public static final Item DRAGON_EGG = Items.registerBlock(Blocks.DRAGON_EGG, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item SANDSTONE_STAIRS = Items.registerBlock(Blocks.SANDSTONE_STAIRS);
    public static final Item ENDER_CHEST = Items.registerBlock(Blocks.ENDER_CHEST);
    public static final Item EMERALD_BLOCK = Items.registerBlock(Blocks.EMERALD_BLOCK);
    public static final Item OAK_STAIRS = Items.registerBlock(Blocks.OAK_STAIRS);
    public static final Item SPRUCE_STAIRS = Items.registerBlock(Blocks.SPRUCE_STAIRS);
    public static final Item BIRCH_STAIRS = Items.registerBlock(Blocks.BIRCH_STAIRS);
    public static final Item JUNGLE_STAIRS = Items.registerBlock(Blocks.JUNGLE_STAIRS);
    public static final Item ACACIA_STAIRS = Items.registerBlock(Blocks.ACACIA_STAIRS);
    public static final Item CHERRY_STAIRS = Items.registerBlock(Blocks.CHERRY_STAIRS);
    public static final Item DARK_OAK_STAIRS = Items.registerBlock(Blocks.DARK_OAK_STAIRS);
    public static final Item PALE_OAK_STAIRS = Items.registerBlock(Blocks.PALE_OAK_STAIRS);
    public static final Item MANGROVE_STAIRS = Items.registerBlock(Blocks.MANGROVE_STAIRS);
    public static final Item BAMBOO_STAIRS = Items.registerBlock(Blocks.BAMBOO_STAIRS);
    public static final Item BAMBOO_MOSAIC_STAIRS = Items.registerBlock(Blocks.BAMBOO_MOSAIC_STAIRS);
    public static final Item CRIMSON_STAIRS = Items.registerBlock(Blocks.CRIMSON_STAIRS);
    public static final Item WARPED_STAIRS = Items.registerBlock(Blocks.WARPED_STAIRS);
    public static final Item COMMAND_BLOCK = Items.registerBlock(Blocks.COMMAND_BLOCK, GameMasterBlockItem::new, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item BEACON = Items.registerBlock(Blocks.BEACON, new Item.Properties().rarity(Rarity.RARE));
    public static final Item COBBLESTONE_WALL = Items.registerBlock(Blocks.COBBLESTONE_WALL);
    public static final Item MOSSY_COBBLESTONE_WALL = Items.registerBlock(Blocks.MOSSY_COBBLESTONE_WALL);
    public static final Item BRICK_WALL = Items.registerBlock(Blocks.BRICK_WALL);
    public static final Item PRISMARINE_WALL = Items.registerBlock(Blocks.PRISMARINE_WALL);
    public static final Item RED_SANDSTONE_WALL = Items.registerBlock(Blocks.RED_SANDSTONE_WALL);
    public static final Item MOSSY_STONE_BRICK_WALL = Items.registerBlock(Blocks.MOSSY_STONE_BRICK_WALL);
    public static final Item GRANITE_WALL = Items.registerBlock(Blocks.GRANITE_WALL);
    public static final Item STONE_BRICK_WALL = Items.registerBlock(Blocks.STONE_BRICK_WALL);
    public static final Item MUD_BRICK_WALL = Items.registerBlock(Blocks.MUD_BRICK_WALL);
    public static final Item NETHER_BRICK_WALL = Items.registerBlock(Blocks.NETHER_BRICK_WALL);
    public static final Item ANDESITE_WALL = Items.registerBlock(Blocks.ANDESITE_WALL);
    public static final Item RED_NETHER_BRICK_WALL = Items.registerBlock(Blocks.RED_NETHER_BRICK_WALL);
    public static final Item SANDSTONE_WALL = Items.registerBlock(Blocks.SANDSTONE_WALL);
    public static final Item END_STONE_BRICK_WALL = Items.registerBlock(Blocks.END_STONE_BRICK_WALL);
    public static final Item DIORITE_WALL = Items.registerBlock(Blocks.DIORITE_WALL);
    public static final Item BLACKSTONE_WALL = Items.registerBlock(Blocks.BLACKSTONE_WALL);
    public static final Item POLISHED_BLACKSTONE_WALL = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_WALL);
    public static final Item POLISHED_BLACKSTONE_BRICK_WALL = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
    public static final Item COBBLED_DEEPSLATE_WALL = Items.registerBlock(Blocks.COBBLED_DEEPSLATE_WALL);
    public static final Item POLISHED_DEEPSLATE_WALL = Items.registerBlock(Blocks.POLISHED_DEEPSLATE_WALL);
    public static final Item DEEPSLATE_BRICK_WALL = Items.registerBlock(Blocks.DEEPSLATE_BRICK_WALL);
    public static final Item DEEPSLATE_TILE_WALL = Items.registerBlock(Blocks.DEEPSLATE_TILE_WALL);
    public static final Item ANVIL = Items.registerBlock(Blocks.ANVIL);
    public static final Item CHIPPED_ANVIL = Items.registerBlock(Blocks.CHIPPED_ANVIL);
    public static final Item DAMAGED_ANVIL = Items.registerBlock(Blocks.DAMAGED_ANVIL);
    public static final Item CHISELED_QUARTZ_BLOCK = Items.registerBlock(Blocks.CHISELED_QUARTZ_BLOCK);
    public static final Item QUARTZ_BLOCK = Items.registerBlock(Blocks.QUARTZ_BLOCK);
    public static final Item QUARTZ_BRICKS = Items.registerBlock(Blocks.QUARTZ_BRICKS);
    public static final Item QUARTZ_PILLAR = Items.registerBlock(Blocks.QUARTZ_PILLAR);
    public static final Item QUARTZ_STAIRS = Items.registerBlock(Blocks.QUARTZ_STAIRS);
    public static final Item WHITE_TERRACOTTA = Items.registerBlock(Blocks.WHITE_TERRACOTTA);
    public static final Item ORANGE_TERRACOTTA = Items.registerBlock(Blocks.ORANGE_TERRACOTTA);
    public static final Item MAGENTA_TERRACOTTA = Items.registerBlock(Blocks.MAGENTA_TERRACOTTA);
    public static final Item LIGHT_BLUE_TERRACOTTA = Items.registerBlock(Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Item YELLOW_TERRACOTTA = Items.registerBlock(Blocks.YELLOW_TERRACOTTA);
    public static final Item LIME_TERRACOTTA = Items.registerBlock(Blocks.LIME_TERRACOTTA);
    public static final Item PINK_TERRACOTTA = Items.registerBlock(Blocks.PINK_TERRACOTTA);
    public static final Item GRAY_TERRACOTTA = Items.registerBlock(Blocks.GRAY_TERRACOTTA);
    public static final Item LIGHT_GRAY_TERRACOTTA = Items.registerBlock(Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Item CYAN_TERRACOTTA = Items.registerBlock(Blocks.CYAN_TERRACOTTA);
    public static final Item PURPLE_TERRACOTTA = Items.registerBlock(Blocks.PURPLE_TERRACOTTA);
    public static final Item BLUE_TERRACOTTA = Items.registerBlock(Blocks.BLUE_TERRACOTTA);
    public static final Item BROWN_TERRACOTTA = Items.registerBlock(Blocks.BROWN_TERRACOTTA);
    public static final Item GREEN_TERRACOTTA = Items.registerBlock(Blocks.GREEN_TERRACOTTA);
    public static final Item RED_TERRACOTTA = Items.registerBlock(Blocks.RED_TERRACOTTA);
    public static final Item BLACK_TERRACOTTA = Items.registerBlock(Blocks.BLACK_TERRACOTTA);
    public static final Item BARRIER = Items.registerBlock(Blocks.BARRIER, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item LIGHT = Items.registerBlock(Blocks.LIGHT, properties -> properties.rarity(Rarity.EPIC).component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)LightBlock.LEVEL, (Comparable)Integer.valueOf(15))));
    public static final Item HAY_BLOCK = Items.registerBlock(Blocks.HAY_BLOCK);
    public static final Item WHITE_CARPET = Items.registerBlock(Blocks.WHITE_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.WHITE)));
    public static final Item ORANGE_CARPET = Items.registerBlock(Blocks.ORANGE_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.ORANGE)));
    public static final Item MAGENTA_CARPET = Items.registerBlock(Blocks.MAGENTA_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.MAGENTA)));
    public static final Item LIGHT_BLUE_CARPET = Items.registerBlock(Blocks.LIGHT_BLUE_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.LIGHT_BLUE)));
    public static final Item YELLOW_CARPET = Items.registerBlock(Blocks.YELLOW_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.YELLOW)));
    public static final Item LIME_CARPET = Items.registerBlock(Blocks.LIME_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.LIME)));
    public static final Item PINK_CARPET = Items.registerBlock(Blocks.PINK_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.PINK)));
    public static final Item GRAY_CARPET = Items.registerBlock(Blocks.GRAY_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.GRAY)));
    public static final Item LIGHT_GRAY_CARPET = Items.registerBlock(Blocks.LIGHT_GRAY_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.LIGHT_GRAY)));
    public static final Item CYAN_CARPET = Items.registerBlock(Blocks.CYAN_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.CYAN)));
    public static final Item PURPLE_CARPET = Items.registerBlock(Blocks.PURPLE_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.PURPLE)));
    public static final Item BLUE_CARPET = Items.registerBlock(Blocks.BLUE_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.BLUE)));
    public static final Item BROWN_CARPET = Items.registerBlock(Blocks.BROWN_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.BROWN)));
    public static final Item GREEN_CARPET = Items.registerBlock(Blocks.GREEN_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.GREEN)));
    public static final Item RED_CARPET = Items.registerBlock(Blocks.RED_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.RED)));
    public static final Item BLACK_CARPET = Items.registerBlock(Blocks.BLACK_CARPET, properties -> properties.component(DataComponents.EQUIPPABLE, (Object)Equippable.llamaSwag((DyeColor)DyeColor.BLACK)));
    public static final Item TERRACOTTA = Items.registerBlock(Blocks.TERRACOTTA);
    public static final Item PACKED_ICE = Items.registerBlock(Blocks.PACKED_ICE);
    public static final Item DIRT_PATH = Items.registerBlock(Blocks.DIRT_PATH);
    public static final Item SUNFLOWER = Items.registerBlock(Blocks.SUNFLOWER, DoubleHighBlockItem::new);
    public static final Item LILAC = Items.registerBlock(Blocks.LILAC, DoubleHighBlockItem::new);
    public static final Item ROSE_BUSH = Items.registerBlock(Blocks.ROSE_BUSH, DoubleHighBlockItem::new);
    public static final Item PEONY = Items.registerBlock(Blocks.PEONY, DoubleHighBlockItem::new);
    public static final Item TALL_GRASS = Items.registerBlock(Blocks.TALL_GRASS, DoubleHighBlockItem::new);
    public static final Item LARGE_FERN = Items.registerBlock(Blocks.LARGE_FERN, DoubleHighBlockItem::new);
    public static final Item WHITE_STAINED_GLASS = Items.registerBlock(Blocks.WHITE_STAINED_GLASS);
    public static final Item ORANGE_STAINED_GLASS = Items.registerBlock(Blocks.ORANGE_STAINED_GLASS);
    public static final Item MAGENTA_STAINED_GLASS = Items.registerBlock(Blocks.MAGENTA_STAINED_GLASS);
    public static final Item LIGHT_BLUE_STAINED_GLASS = Items.registerBlock(Blocks.LIGHT_BLUE_STAINED_GLASS);
    public static final Item YELLOW_STAINED_GLASS = Items.registerBlock(Blocks.YELLOW_STAINED_GLASS);
    public static final Item LIME_STAINED_GLASS = Items.registerBlock(Blocks.LIME_STAINED_GLASS);
    public static final Item PINK_STAINED_GLASS = Items.registerBlock(Blocks.PINK_STAINED_GLASS);
    public static final Item GRAY_STAINED_GLASS = Items.registerBlock(Blocks.GRAY_STAINED_GLASS);
    public static final Item LIGHT_GRAY_STAINED_GLASS = Items.registerBlock(Blocks.LIGHT_GRAY_STAINED_GLASS);
    public static final Item CYAN_STAINED_GLASS = Items.registerBlock(Blocks.CYAN_STAINED_GLASS);
    public static final Item PURPLE_STAINED_GLASS = Items.registerBlock(Blocks.PURPLE_STAINED_GLASS);
    public static final Item BLUE_STAINED_GLASS = Items.registerBlock(Blocks.BLUE_STAINED_GLASS);
    public static final Item BROWN_STAINED_GLASS = Items.registerBlock(Blocks.BROWN_STAINED_GLASS);
    public static final Item GREEN_STAINED_GLASS = Items.registerBlock(Blocks.GREEN_STAINED_GLASS);
    public static final Item RED_STAINED_GLASS = Items.registerBlock(Blocks.RED_STAINED_GLASS);
    public static final Item BLACK_STAINED_GLASS = Items.registerBlock(Blocks.BLACK_STAINED_GLASS);
    public static final Item WHITE_STAINED_GLASS_PANE = Items.registerBlock(Blocks.WHITE_STAINED_GLASS_PANE);
    public static final Item ORANGE_STAINED_GLASS_PANE = Items.registerBlock(Blocks.ORANGE_STAINED_GLASS_PANE);
    public static final Item MAGENTA_STAINED_GLASS_PANE = Items.registerBlock(Blocks.MAGENTA_STAINED_GLASS_PANE);
    public static final Item LIGHT_BLUE_STAINED_GLASS_PANE = Items.registerBlock(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
    public static final Item YELLOW_STAINED_GLASS_PANE = Items.registerBlock(Blocks.YELLOW_STAINED_GLASS_PANE);
    public static final Item LIME_STAINED_GLASS_PANE = Items.registerBlock(Blocks.LIME_STAINED_GLASS_PANE);
    public static final Item PINK_STAINED_GLASS_PANE = Items.registerBlock(Blocks.PINK_STAINED_GLASS_PANE);
    public static final Item GRAY_STAINED_GLASS_PANE = Items.registerBlock(Blocks.GRAY_STAINED_GLASS_PANE);
    public static final Item LIGHT_GRAY_STAINED_GLASS_PANE = Items.registerBlock(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
    public static final Item CYAN_STAINED_GLASS_PANE = Items.registerBlock(Blocks.CYAN_STAINED_GLASS_PANE);
    public static final Item PURPLE_STAINED_GLASS_PANE = Items.registerBlock(Blocks.PURPLE_STAINED_GLASS_PANE);
    public static final Item BLUE_STAINED_GLASS_PANE = Items.registerBlock(Blocks.BLUE_STAINED_GLASS_PANE);
    public static final Item BROWN_STAINED_GLASS_PANE = Items.registerBlock(Blocks.BROWN_STAINED_GLASS_PANE);
    public static final Item GREEN_STAINED_GLASS_PANE = Items.registerBlock(Blocks.GREEN_STAINED_GLASS_PANE);
    public static final Item RED_STAINED_GLASS_PANE = Items.registerBlock(Blocks.RED_STAINED_GLASS_PANE);
    public static final Item BLACK_STAINED_GLASS_PANE = Items.registerBlock(Blocks.BLACK_STAINED_GLASS_PANE);
    public static final Item PRISMARINE = Items.registerBlock(Blocks.PRISMARINE);
    public static final Item PRISMARINE_BRICKS = Items.registerBlock(Blocks.PRISMARINE_BRICKS);
    public static final Item DARK_PRISMARINE = Items.registerBlock(Blocks.DARK_PRISMARINE);
    public static final Item PRISMARINE_STAIRS = Items.registerBlock(Blocks.PRISMARINE_STAIRS);
    public static final Item PRISMARINE_BRICK_STAIRS = Items.registerBlock(Blocks.PRISMARINE_BRICK_STAIRS);
    public static final Item DARK_PRISMARINE_STAIRS = Items.registerBlock(Blocks.DARK_PRISMARINE_STAIRS);
    public static final Item SEA_LANTERN = Items.registerBlock(Blocks.SEA_LANTERN);
    public static final Item RED_SANDSTONE = Items.registerBlock(Blocks.RED_SANDSTONE);
    public static final Item CHISELED_RED_SANDSTONE = Items.registerBlock(Blocks.CHISELED_RED_SANDSTONE);
    public static final Item CUT_RED_SANDSTONE = Items.registerBlock(Blocks.CUT_RED_SANDSTONE);
    public static final Item RED_SANDSTONE_STAIRS = Items.registerBlock(Blocks.RED_SANDSTONE_STAIRS);
    public static final Item REPEATING_COMMAND_BLOCK = Items.registerBlock(Blocks.REPEATING_COMMAND_BLOCK, GameMasterBlockItem::new, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item CHAIN_COMMAND_BLOCK = Items.registerBlock(Blocks.CHAIN_COMMAND_BLOCK, GameMasterBlockItem::new, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item MAGMA_BLOCK = Items.registerBlock(Blocks.MAGMA_BLOCK);
    public static final Item NETHER_WART_BLOCK = Items.registerBlock(Blocks.NETHER_WART_BLOCK);
    public static final Item WARPED_WART_BLOCK = Items.registerBlock(Blocks.WARPED_WART_BLOCK);
    public static final Item RED_NETHER_BRICKS = Items.registerBlock(Blocks.RED_NETHER_BRICKS);
    public static final Item BONE_BLOCK = Items.registerBlock(Blocks.BONE_BLOCK);
    public static final Item STRUCTURE_VOID = Items.registerBlock(Blocks.STRUCTURE_VOID, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item SHULKER_BOX = Items.registerBlock(Blocks.SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item WHITE_SHULKER_BOX = Items.registerBlock(Blocks.WHITE_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item ORANGE_SHULKER_BOX = Items.registerBlock(Blocks.ORANGE_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item MAGENTA_SHULKER_BOX = Items.registerBlock(Blocks.MAGENTA_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item LIGHT_BLUE_SHULKER_BOX = Items.registerBlock(Blocks.LIGHT_BLUE_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item YELLOW_SHULKER_BOX = Items.registerBlock(Blocks.YELLOW_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item LIME_SHULKER_BOX = Items.registerBlock(Blocks.LIME_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item PINK_SHULKER_BOX = Items.registerBlock(Blocks.PINK_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item GRAY_SHULKER_BOX = Items.registerBlock(Blocks.GRAY_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item LIGHT_GRAY_SHULKER_BOX = Items.registerBlock(Blocks.LIGHT_GRAY_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item CYAN_SHULKER_BOX = Items.registerBlock(Blocks.CYAN_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item PURPLE_SHULKER_BOX = Items.registerBlock(Blocks.PURPLE_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item BLUE_SHULKER_BOX = Items.registerBlock(Blocks.BLUE_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item BROWN_SHULKER_BOX = Items.registerBlock(Blocks.BROWN_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item GREEN_SHULKER_BOX = Items.registerBlock(Blocks.GREEN_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item RED_SHULKER_BOX = Items.registerBlock(Blocks.RED_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item BLACK_SHULKER_BOX = Items.registerBlock(Blocks.BLACK_SHULKER_BOX, new Item.Properties().stacksTo(1).component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item WHITE_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.WHITE_GLAZED_TERRACOTTA);
    public static final Item ORANGE_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.ORANGE_GLAZED_TERRACOTTA);
    public static final Item MAGENTA_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA);
    public static final Item LIGHT_BLUE_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
    public static final Item YELLOW_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.YELLOW_GLAZED_TERRACOTTA);
    public static final Item LIME_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.LIME_GLAZED_TERRACOTTA);
    public static final Item PINK_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.PINK_GLAZED_TERRACOTTA);
    public static final Item GRAY_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.GRAY_GLAZED_TERRACOTTA);
    public static final Item LIGHT_GRAY_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
    public static final Item CYAN_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.CYAN_GLAZED_TERRACOTTA);
    public static final Item PURPLE_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.PURPLE_GLAZED_TERRACOTTA);
    public static final Item BLUE_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.BLUE_GLAZED_TERRACOTTA);
    public static final Item BROWN_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.BROWN_GLAZED_TERRACOTTA);
    public static final Item GREEN_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.GREEN_GLAZED_TERRACOTTA);
    public static final Item RED_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.RED_GLAZED_TERRACOTTA);
    public static final Item BLACK_GLAZED_TERRACOTTA = Items.registerBlock(Blocks.BLACK_GLAZED_TERRACOTTA);
    public static final Item WHITE_CONCRETE = Items.registerBlock(Blocks.WHITE_CONCRETE);
    public static final Item ORANGE_CONCRETE = Items.registerBlock(Blocks.ORANGE_CONCRETE);
    public static final Item MAGENTA_CONCRETE = Items.registerBlock(Blocks.MAGENTA_CONCRETE);
    public static final Item LIGHT_BLUE_CONCRETE = Items.registerBlock(Blocks.LIGHT_BLUE_CONCRETE);
    public static final Item YELLOW_CONCRETE = Items.registerBlock(Blocks.YELLOW_CONCRETE);
    public static final Item LIME_CONCRETE = Items.registerBlock(Blocks.LIME_CONCRETE);
    public static final Item PINK_CONCRETE = Items.registerBlock(Blocks.PINK_CONCRETE);
    public static final Item GRAY_CONCRETE = Items.registerBlock(Blocks.GRAY_CONCRETE);
    public static final Item LIGHT_GRAY_CONCRETE = Items.registerBlock(Blocks.LIGHT_GRAY_CONCRETE);
    public static final Item CYAN_CONCRETE = Items.registerBlock(Blocks.CYAN_CONCRETE);
    public static final Item PURPLE_CONCRETE = Items.registerBlock(Blocks.PURPLE_CONCRETE);
    public static final Item BLUE_CONCRETE = Items.registerBlock(Blocks.BLUE_CONCRETE);
    public static final Item BROWN_CONCRETE = Items.registerBlock(Blocks.BROWN_CONCRETE);
    public static final Item GREEN_CONCRETE = Items.registerBlock(Blocks.GREEN_CONCRETE);
    public static final Item RED_CONCRETE = Items.registerBlock(Blocks.RED_CONCRETE);
    public static final Item BLACK_CONCRETE = Items.registerBlock(Blocks.BLACK_CONCRETE);
    public static final Item WHITE_CONCRETE_POWDER = Items.registerBlock(Blocks.WHITE_CONCRETE_POWDER);
    public static final Item ORANGE_CONCRETE_POWDER = Items.registerBlock(Blocks.ORANGE_CONCRETE_POWDER);
    public static final Item MAGENTA_CONCRETE_POWDER = Items.registerBlock(Blocks.MAGENTA_CONCRETE_POWDER);
    public static final Item LIGHT_BLUE_CONCRETE_POWDER = Items.registerBlock(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
    public static final Item YELLOW_CONCRETE_POWDER = Items.registerBlock(Blocks.YELLOW_CONCRETE_POWDER);
    public static final Item LIME_CONCRETE_POWDER = Items.registerBlock(Blocks.LIME_CONCRETE_POWDER);
    public static final Item PINK_CONCRETE_POWDER = Items.registerBlock(Blocks.PINK_CONCRETE_POWDER);
    public static final Item GRAY_CONCRETE_POWDER = Items.registerBlock(Blocks.GRAY_CONCRETE_POWDER);
    public static final Item LIGHT_GRAY_CONCRETE_POWDER = Items.registerBlock(Blocks.LIGHT_GRAY_CONCRETE_POWDER);
    public static final Item CYAN_CONCRETE_POWDER = Items.registerBlock(Blocks.CYAN_CONCRETE_POWDER);
    public static final Item PURPLE_CONCRETE_POWDER = Items.registerBlock(Blocks.PURPLE_CONCRETE_POWDER);
    public static final Item BLUE_CONCRETE_POWDER = Items.registerBlock(Blocks.BLUE_CONCRETE_POWDER);
    public static final Item BROWN_CONCRETE_POWDER = Items.registerBlock(Blocks.BROWN_CONCRETE_POWDER);
    public static final Item GREEN_CONCRETE_POWDER = Items.registerBlock(Blocks.GREEN_CONCRETE_POWDER);
    public static final Item RED_CONCRETE_POWDER = Items.registerBlock(Blocks.RED_CONCRETE_POWDER);
    public static final Item BLACK_CONCRETE_POWDER = Items.registerBlock(Blocks.BLACK_CONCRETE_POWDER);
    public static final Item TURTLE_EGG = Items.registerBlock(Blocks.TURTLE_EGG);
    public static final Item SNIFFER_EGG = Items.registerBlock(Blocks.SNIFFER_EGG, properties -> properties.rarity(Rarity.UNCOMMON));
    public static final Item DRIED_GHAST = Items.registerBlock(Blocks.DRIED_GHAST);
    public static final Item DEAD_TUBE_CORAL_BLOCK = Items.registerBlock(Blocks.DEAD_TUBE_CORAL_BLOCK);
    public static final Item DEAD_BRAIN_CORAL_BLOCK = Items.registerBlock(Blocks.DEAD_BRAIN_CORAL_BLOCK);
    public static final Item DEAD_BUBBLE_CORAL_BLOCK = Items.registerBlock(Blocks.DEAD_BUBBLE_CORAL_BLOCK);
    public static final Item DEAD_FIRE_CORAL_BLOCK = Items.registerBlock(Blocks.DEAD_FIRE_CORAL_BLOCK);
    public static final Item DEAD_HORN_CORAL_BLOCK = Items.registerBlock(Blocks.DEAD_HORN_CORAL_BLOCK);
    public static final Item TUBE_CORAL_BLOCK = Items.registerBlock(Blocks.TUBE_CORAL_BLOCK);
    public static final Item BRAIN_CORAL_BLOCK = Items.registerBlock(Blocks.BRAIN_CORAL_BLOCK);
    public static final Item BUBBLE_CORAL_BLOCK = Items.registerBlock(Blocks.BUBBLE_CORAL_BLOCK);
    public static final Item FIRE_CORAL_BLOCK = Items.registerBlock(Blocks.FIRE_CORAL_BLOCK);
    public static final Item HORN_CORAL_BLOCK = Items.registerBlock(Blocks.HORN_CORAL_BLOCK);
    public static final Item TUBE_CORAL = Items.registerBlock(Blocks.TUBE_CORAL);
    public static final Item BRAIN_CORAL = Items.registerBlock(Blocks.BRAIN_CORAL);
    public static final Item BUBBLE_CORAL = Items.registerBlock(Blocks.BUBBLE_CORAL);
    public static final Item FIRE_CORAL = Items.registerBlock(Blocks.FIRE_CORAL);
    public static final Item HORN_CORAL = Items.registerBlock(Blocks.HORN_CORAL);
    public static final Item DEAD_BRAIN_CORAL = Items.registerBlock(Blocks.DEAD_BRAIN_CORAL);
    public static final Item DEAD_BUBBLE_CORAL = Items.registerBlock(Blocks.DEAD_BUBBLE_CORAL);
    public static final Item DEAD_FIRE_CORAL = Items.registerBlock(Blocks.DEAD_FIRE_CORAL);
    public static final Item DEAD_HORN_CORAL = Items.registerBlock(Blocks.DEAD_HORN_CORAL);
    public static final Item DEAD_TUBE_CORAL = Items.registerBlock(Blocks.DEAD_TUBE_CORAL);
    public static final Item TUBE_CORAL_FAN = Items.registerBlock(Blocks.TUBE_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.TUBE_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item BRAIN_CORAL_FAN = Items.registerBlock(Blocks.BRAIN_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.BRAIN_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item BUBBLE_CORAL_FAN = Items.registerBlock(Blocks.BUBBLE_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.BUBBLE_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item FIRE_CORAL_FAN = Items.registerBlock(Blocks.FIRE_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.FIRE_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item HORN_CORAL_FAN = Items.registerBlock(Blocks.HORN_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.HORN_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item DEAD_TUBE_CORAL_FAN = Items.registerBlock(Blocks.DEAD_TUBE_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.DEAD_TUBE_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item DEAD_BRAIN_CORAL_FAN = Items.registerBlock(Blocks.DEAD_BRAIN_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.DEAD_BRAIN_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item DEAD_BUBBLE_CORAL_FAN = Items.registerBlock(Blocks.DEAD_BUBBLE_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.DEAD_BUBBLE_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item DEAD_FIRE_CORAL_FAN = Items.registerBlock(Blocks.DEAD_FIRE_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.DEAD_FIRE_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item DEAD_HORN_CORAL_FAN = Items.registerBlock(Blocks.DEAD_HORN_CORAL_FAN, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.DEAD_HORN_CORAL_WALL_FAN, Direction.DOWN, properties));
    public static final Item BLUE_ICE = Items.registerBlock(Blocks.BLUE_ICE);
    public static final Item CONDUIT = Items.registerBlock(Blocks.CONDUIT, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item POLISHED_GRANITE_STAIRS = Items.registerBlock(Blocks.POLISHED_GRANITE_STAIRS);
    public static final Item SMOOTH_RED_SANDSTONE_STAIRS = Items.registerBlock(Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
    public static final Item MOSSY_STONE_BRICK_STAIRS = Items.registerBlock(Blocks.MOSSY_STONE_BRICK_STAIRS);
    public static final Item POLISHED_DIORITE_STAIRS = Items.registerBlock(Blocks.POLISHED_DIORITE_STAIRS);
    public static final Item MOSSY_COBBLESTONE_STAIRS = Items.registerBlock(Blocks.MOSSY_COBBLESTONE_STAIRS);
    public static final Item END_STONE_BRICK_STAIRS = Items.registerBlock(Blocks.END_STONE_BRICK_STAIRS);
    public static final Item STONE_STAIRS = Items.registerBlock(Blocks.STONE_STAIRS);
    public static final Item SMOOTH_SANDSTONE_STAIRS = Items.registerBlock(Blocks.SMOOTH_SANDSTONE_STAIRS);
    public static final Item SMOOTH_QUARTZ_STAIRS = Items.registerBlock(Blocks.SMOOTH_QUARTZ_STAIRS);
    public static final Item GRANITE_STAIRS = Items.registerBlock(Blocks.GRANITE_STAIRS);
    public static final Item ANDESITE_STAIRS = Items.registerBlock(Blocks.ANDESITE_STAIRS);
    public static final Item RED_NETHER_BRICK_STAIRS = Items.registerBlock(Blocks.RED_NETHER_BRICK_STAIRS);
    public static final Item POLISHED_ANDESITE_STAIRS = Items.registerBlock(Blocks.POLISHED_ANDESITE_STAIRS);
    public static final Item DIORITE_STAIRS = Items.registerBlock(Blocks.DIORITE_STAIRS);
    public static final Item COBBLED_DEEPSLATE_STAIRS = Items.registerBlock(Blocks.COBBLED_DEEPSLATE_STAIRS);
    public static final Item POLISHED_DEEPSLATE_STAIRS = Items.registerBlock(Blocks.POLISHED_DEEPSLATE_STAIRS);
    public static final Item DEEPSLATE_BRICK_STAIRS = Items.registerBlock(Blocks.DEEPSLATE_BRICK_STAIRS);
    public static final Item DEEPSLATE_TILE_STAIRS = Items.registerBlock(Blocks.DEEPSLATE_TILE_STAIRS);
    public static final Item POLISHED_GRANITE_SLAB = Items.registerBlock(Blocks.POLISHED_GRANITE_SLAB);
    public static final Item SMOOTH_RED_SANDSTONE_SLAB = Items.registerBlock(Blocks.SMOOTH_RED_SANDSTONE_SLAB);
    public static final Item MOSSY_STONE_BRICK_SLAB = Items.registerBlock(Blocks.MOSSY_STONE_BRICK_SLAB);
    public static final Item POLISHED_DIORITE_SLAB = Items.registerBlock(Blocks.POLISHED_DIORITE_SLAB);
    public static final Item MOSSY_COBBLESTONE_SLAB = Items.registerBlock(Blocks.MOSSY_COBBLESTONE_SLAB);
    public static final Item END_STONE_BRICK_SLAB = Items.registerBlock(Blocks.END_STONE_BRICK_SLAB);
    public static final Item SMOOTH_SANDSTONE_SLAB = Items.registerBlock(Blocks.SMOOTH_SANDSTONE_SLAB);
    public static final Item SMOOTH_QUARTZ_SLAB = Items.registerBlock(Blocks.SMOOTH_QUARTZ_SLAB);
    public static final Item GRANITE_SLAB = Items.registerBlock(Blocks.GRANITE_SLAB);
    public static final Item ANDESITE_SLAB = Items.registerBlock(Blocks.ANDESITE_SLAB);
    public static final Item RED_NETHER_BRICK_SLAB = Items.registerBlock(Blocks.RED_NETHER_BRICK_SLAB);
    public static final Item POLISHED_ANDESITE_SLAB = Items.registerBlock(Blocks.POLISHED_ANDESITE_SLAB);
    public static final Item DIORITE_SLAB = Items.registerBlock(Blocks.DIORITE_SLAB);
    public static final Item COBBLED_DEEPSLATE_SLAB = Items.registerBlock(Blocks.COBBLED_DEEPSLATE_SLAB);
    public static final Item POLISHED_DEEPSLATE_SLAB = Items.registerBlock(Blocks.POLISHED_DEEPSLATE_SLAB);
    public static final Item DEEPSLATE_BRICK_SLAB = Items.registerBlock(Blocks.DEEPSLATE_BRICK_SLAB);
    public static final Item DEEPSLATE_TILE_SLAB = Items.registerBlock(Blocks.DEEPSLATE_TILE_SLAB);
    public static final Item SCAFFOLDING = Items.registerBlock(Blocks.SCAFFOLDING, ScaffoldingBlockItem::new);
    public static final Item REDSTONE = Items.registerItem("redstone", Items.createBlockItemWithCustomItemName(Blocks.REDSTONE_WIRE), new Item.Properties().trimMaterial(TrimMaterials.REDSTONE));
    public static final Item REDSTONE_TORCH = Items.registerBlock(Blocks.REDSTONE_TORCH, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.REDSTONE_WALL_TORCH, Direction.DOWN, properties));
    public static final Item REDSTONE_BLOCK = Items.registerBlock(Blocks.REDSTONE_BLOCK);
    public static final Item REPEATER = Items.registerBlock(Blocks.REPEATER);
    public static final Item COMPARATOR = Items.registerBlock(Blocks.COMPARATOR);
    public static final Item PISTON = Items.registerBlock(Blocks.PISTON);
    public static final Item STICKY_PISTON = Items.registerBlock(Blocks.STICKY_PISTON);
    public static final Item SLIME_BLOCK = Items.registerBlock(Blocks.SLIME_BLOCK);
    public static final Item HONEY_BLOCK = Items.registerBlock(Blocks.HONEY_BLOCK);
    public static final Item OBSERVER = Items.registerBlock(Blocks.OBSERVER);
    public static final Item HOPPER = Items.registerBlock(Blocks.HOPPER, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item DISPENSER = Items.registerBlock(Blocks.DISPENSER, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item DROPPER = Items.registerBlock(Blocks.DROPPER, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item LECTERN = Items.registerBlock(Blocks.LECTERN);
    public static final Item TARGET = Items.registerBlock(Blocks.TARGET);
    public static final Item LEVER = Items.registerBlock(Blocks.LEVER);
    public static final Item LIGHTNING_ROD = Items.registerBlock(Blocks.LIGHTNING_ROD);
    public static final Item EXPOSED_LIGHTNING_ROD = Items.registerBlock(Blocks.EXPOSED_LIGHTNING_ROD);
    public static final Item WEATHERED_LIGHTNING_ROD = Items.registerBlock(Blocks.WEATHERED_LIGHTNING_ROD);
    public static final Item OXIDIZED_LIGHTNING_ROD = Items.registerBlock(Blocks.OXIDIZED_LIGHTNING_ROD);
    public static final Item WAXED_LIGHTNING_ROD = Items.registerBlock(Blocks.WAXED_LIGHTNING_ROD);
    public static final Item WAXED_EXPOSED_LIGHTNING_ROD = Items.registerBlock(Blocks.WAXED_EXPOSED_LIGHTNING_ROD);
    public static final Item WAXED_WEATHERED_LIGHTNING_ROD = Items.registerBlock(Blocks.WAXED_WEATHERED_LIGHTNING_ROD);
    public static final Item WAXED_OXIDIZED_LIGHTNING_ROD = Items.registerBlock(Blocks.WAXED_OXIDIZED_LIGHTNING_ROD);
    public static final Item DAYLIGHT_DETECTOR = Items.registerBlock(Blocks.DAYLIGHT_DETECTOR);
    public static final Item SCULK_SENSOR = Items.registerBlock(Blocks.SCULK_SENSOR);
    public static final Item CALIBRATED_SCULK_SENSOR = Items.registerBlock(Blocks.CALIBRATED_SCULK_SENSOR);
    public static final Item TRIPWIRE_HOOK = Items.registerBlock(Blocks.TRIPWIRE_HOOK);
    public static final Item TRAPPED_CHEST = Items.registerBlock(Blocks.TRAPPED_CHEST, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item TNT = Items.registerBlock(Blocks.TNT);
    public static final Item REDSTONE_LAMP = Items.registerBlock(Blocks.REDSTONE_LAMP);
    public static final Item NOTE_BLOCK = Items.registerBlock(Blocks.NOTE_BLOCK);
    public static final Item STONE_BUTTON = Items.registerBlock(Blocks.STONE_BUTTON);
    public static final Item POLISHED_BLACKSTONE_BUTTON = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_BUTTON);
    public static final Item OAK_BUTTON = Items.registerBlock(Blocks.OAK_BUTTON);
    public static final Item SPRUCE_BUTTON = Items.registerBlock(Blocks.SPRUCE_BUTTON);
    public static final Item BIRCH_BUTTON = Items.registerBlock(Blocks.BIRCH_BUTTON);
    public static final Item JUNGLE_BUTTON = Items.registerBlock(Blocks.JUNGLE_BUTTON);
    public static final Item ACACIA_BUTTON = Items.registerBlock(Blocks.ACACIA_BUTTON);
    public static final Item CHERRY_BUTTON = Items.registerBlock(Blocks.CHERRY_BUTTON);
    public static final Item DARK_OAK_BUTTON = Items.registerBlock(Blocks.DARK_OAK_BUTTON);
    public static final Item PALE_OAK_BUTTON = Items.registerBlock(Blocks.PALE_OAK_BUTTON);
    public static final Item MANGROVE_BUTTON = Items.registerBlock(Blocks.MANGROVE_BUTTON);
    public static final Item BAMBOO_BUTTON = Items.registerBlock(Blocks.BAMBOO_BUTTON);
    public static final Item CRIMSON_BUTTON = Items.registerBlock(Blocks.CRIMSON_BUTTON);
    public static final Item WARPED_BUTTON = Items.registerBlock(Blocks.WARPED_BUTTON);
    public static final Item STONE_PRESSURE_PLATE = Items.registerBlock(Blocks.STONE_PRESSURE_PLATE);
    public static final Item POLISHED_BLACKSTONE_PRESSURE_PLATE = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE);
    public static final Item LIGHT_WEIGHTED_PRESSURE_PLATE = Items.registerBlock(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
    public static final Item HEAVY_WEIGHTED_PRESSURE_PLATE = Items.registerBlock(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
    public static final Item OAK_PRESSURE_PLATE = Items.registerBlock(Blocks.OAK_PRESSURE_PLATE);
    public static final Item SPRUCE_PRESSURE_PLATE = Items.registerBlock(Blocks.SPRUCE_PRESSURE_PLATE);
    public static final Item BIRCH_PRESSURE_PLATE = Items.registerBlock(Blocks.BIRCH_PRESSURE_PLATE);
    public static final Item JUNGLE_PRESSURE_PLATE = Items.registerBlock(Blocks.JUNGLE_PRESSURE_PLATE);
    public static final Item ACACIA_PRESSURE_PLATE = Items.registerBlock(Blocks.ACACIA_PRESSURE_PLATE);
    public static final Item CHERRY_PRESSURE_PLATE = Items.registerBlock(Blocks.CHERRY_PRESSURE_PLATE);
    public static final Item DARK_OAK_PRESSURE_PLATE = Items.registerBlock(Blocks.DARK_OAK_PRESSURE_PLATE);
    public static final Item PALE_OAK_PRESSURE_PLATE = Items.registerBlock(Blocks.PALE_OAK_PRESSURE_PLATE);
    public static final Item MANGROVE_PRESSURE_PLATE = Items.registerBlock(Blocks.MANGROVE_PRESSURE_PLATE);
    public static final Item BAMBOO_PRESSURE_PLATE = Items.registerBlock(Blocks.BAMBOO_PRESSURE_PLATE);
    public static final Item CRIMSON_PRESSURE_PLATE = Items.registerBlock(Blocks.CRIMSON_PRESSURE_PLATE);
    public static final Item WARPED_PRESSURE_PLATE = Items.registerBlock(Blocks.WARPED_PRESSURE_PLATE);
    public static final Item IRON_DOOR = Items.registerBlock(Blocks.IRON_DOOR, DoubleHighBlockItem::new);
    public static final Item OAK_DOOR = Items.registerBlock(Blocks.OAK_DOOR, DoubleHighBlockItem::new);
    public static final Item SPRUCE_DOOR = Items.registerBlock(Blocks.SPRUCE_DOOR, DoubleHighBlockItem::new);
    public static final Item BIRCH_DOOR = Items.registerBlock(Blocks.BIRCH_DOOR, DoubleHighBlockItem::new);
    public static final Item JUNGLE_DOOR = Items.registerBlock(Blocks.JUNGLE_DOOR, DoubleHighBlockItem::new);
    public static final Item ACACIA_DOOR = Items.registerBlock(Blocks.ACACIA_DOOR, DoubleHighBlockItem::new);
    public static final Item CHERRY_DOOR = Items.registerBlock(Blocks.CHERRY_DOOR, DoubleHighBlockItem::new);
    public static final Item DARK_OAK_DOOR = Items.registerBlock(Blocks.DARK_OAK_DOOR, DoubleHighBlockItem::new);
    public static final Item PALE_OAK_DOOR = Items.registerBlock(Blocks.PALE_OAK_DOOR, DoubleHighBlockItem::new);
    public static final Item MANGROVE_DOOR = Items.registerBlock(Blocks.MANGROVE_DOOR, DoubleHighBlockItem::new);
    public static final Item BAMBOO_DOOR = Items.registerBlock(Blocks.BAMBOO_DOOR, DoubleHighBlockItem::new);
    public static final Item CRIMSON_DOOR = Items.registerBlock(Blocks.CRIMSON_DOOR, DoubleHighBlockItem::new);
    public static final Item WARPED_DOOR = Items.registerBlock(Blocks.WARPED_DOOR, DoubleHighBlockItem::new);
    public static final Item COPPER_DOOR = Items.registerBlock(Blocks.COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item EXPOSED_COPPER_DOOR = Items.registerBlock(Blocks.EXPOSED_COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item WEATHERED_COPPER_DOOR = Items.registerBlock(Blocks.WEATHERED_COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item OXIDIZED_COPPER_DOOR = Items.registerBlock(Blocks.OXIDIZED_COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item WAXED_COPPER_DOOR = Items.registerBlock(Blocks.WAXED_COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item WAXED_EXPOSED_COPPER_DOOR = Items.registerBlock(Blocks.WAXED_EXPOSED_COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item WAXED_WEATHERED_COPPER_DOOR = Items.registerBlock(Blocks.WAXED_WEATHERED_COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item WAXED_OXIDIZED_COPPER_DOOR = Items.registerBlock(Blocks.WAXED_OXIDIZED_COPPER_DOOR, DoubleHighBlockItem::new);
    public static final Item IRON_TRAPDOOR = Items.registerBlock(Blocks.IRON_TRAPDOOR);
    public static final Item OAK_TRAPDOOR = Items.registerBlock(Blocks.OAK_TRAPDOOR);
    public static final Item SPRUCE_TRAPDOOR = Items.registerBlock(Blocks.SPRUCE_TRAPDOOR);
    public static final Item BIRCH_TRAPDOOR = Items.registerBlock(Blocks.BIRCH_TRAPDOOR);
    public static final Item JUNGLE_TRAPDOOR = Items.registerBlock(Blocks.JUNGLE_TRAPDOOR);
    public static final Item ACACIA_TRAPDOOR = Items.registerBlock(Blocks.ACACIA_TRAPDOOR);
    public static final Item CHERRY_TRAPDOOR = Items.registerBlock(Blocks.CHERRY_TRAPDOOR);
    public static final Item DARK_OAK_TRAPDOOR = Items.registerBlock(Blocks.DARK_OAK_TRAPDOOR);
    public static final Item PALE_OAK_TRAPDOOR = Items.registerBlock(Blocks.PALE_OAK_TRAPDOOR);
    public static final Item MANGROVE_TRAPDOOR = Items.registerBlock(Blocks.MANGROVE_TRAPDOOR);
    public static final Item BAMBOO_TRAPDOOR = Items.registerBlock(Blocks.BAMBOO_TRAPDOOR);
    public static final Item CRIMSON_TRAPDOOR = Items.registerBlock(Blocks.CRIMSON_TRAPDOOR);
    public static final Item WARPED_TRAPDOOR = Items.registerBlock(Blocks.WARPED_TRAPDOOR);
    public static final Item COPPER_TRAPDOOR = Items.registerBlock(Blocks.COPPER_TRAPDOOR);
    public static final Item EXPOSED_COPPER_TRAPDOOR = Items.registerBlock(Blocks.EXPOSED_COPPER_TRAPDOOR);
    public static final Item WEATHERED_COPPER_TRAPDOOR = Items.registerBlock(Blocks.WEATHERED_COPPER_TRAPDOOR);
    public static final Item OXIDIZED_COPPER_TRAPDOOR = Items.registerBlock(Blocks.OXIDIZED_COPPER_TRAPDOOR);
    public static final Item WAXED_COPPER_TRAPDOOR = Items.registerBlock(Blocks.WAXED_COPPER_TRAPDOOR);
    public static final Item WAXED_EXPOSED_COPPER_TRAPDOOR = Items.registerBlock(Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
    public static final Item WAXED_WEATHERED_COPPER_TRAPDOOR = Items.registerBlock(Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
    public static final Item WAXED_OXIDIZED_COPPER_TRAPDOOR = Items.registerBlock(Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
    public static final Item OAK_FENCE_GATE = Items.registerBlock(Blocks.OAK_FENCE_GATE);
    public static final Item SPRUCE_FENCE_GATE = Items.registerBlock(Blocks.SPRUCE_FENCE_GATE);
    public static final Item BIRCH_FENCE_GATE = Items.registerBlock(Blocks.BIRCH_FENCE_GATE);
    public static final Item JUNGLE_FENCE_GATE = Items.registerBlock(Blocks.JUNGLE_FENCE_GATE);
    public static final Item ACACIA_FENCE_GATE = Items.registerBlock(Blocks.ACACIA_FENCE_GATE);
    public static final Item CHERRY_FENCE_GATE = Items.registerBlock(Blocks.CHERRY_FENCE_GATE);
    public static final Item DARK_OAK_FENCE_GATE = Items.registerBlock(Blocks.DARK_OAK_FENCE_GATE);
    public static final Item PALE_OAK_FENCE_GATE = Items.registerBlock(Blocks.PALE_OAK_FENCE_GATE);
    public static final Item MANGROVE_FENCE_GATE = Items.registerBlock(Blocks.MANGROVE_FENCE_GATE);
    public static final Item BAMBOO_FENCE_GATE = Items.registerBlock(Blocks.BAMBOO_FENCE_GATE);
    public static final Item CRIMSON_FENCE_GATE = Items.registerBlock(Blocks.CRIMSON_FENCE_GATE);
    public static final Item WARPED_FENCE_GATE = Items.registerBlock(Blocks.WARPED_FENCE_GATE);
    public static final Item POWERED_RAIL = Items.registerBlock(Blocks.POWERED_RAIL);
    public static final Item DETECTOR_RAIL = Items.registerBlock(Blocks.DETECTOR_RAIL);
    public static final Item RAIL = Items.registerBlock(Blocks.RAIL);
    public static final Item ACTIVATOR_RAIL = Items.registerBlock(Blocks.ACTIVATOR_RAIL);
    public static final Item SADDLE = Items.registerItem("saddle", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.saddle()));
    public static final Item WHITE_HARNESS = Items.registerItem("white_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.WHITE)));
    public static final Item ORANGE_HARNESS = Items.registerItem("orange_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.ORANGE)));
    public static final Item MAGENTA_HARNESS = Items.registerItem("magenta_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.MAGENTA)));
    public static final Item LIGHT_BLUE_HARNESS = Items.registerItem("light_blue_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.LIGHT_BLUE)));
    public static final Item YELLOW_HARNESS = Items.registerItem("yellow_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.YELLOW)));
    public static final Item LIME_HARNESS = Items.registerItem("lime_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.LIME)));
    public static final Item PINK_HARNESS = Items.registerItem("pink_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.PINK)));
    public static final Item GRAY_HARNESS = Items.registerItem("gray_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.GRAY)));
    public static final Item LIGHT_GRAY_HARNESS = Items.registerItem("light_gray_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.LIGHT_GRAY)));
    public static final Item CYAN_HARNESS = Items.registerItem("cyan_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.CYAN)));
    public static final Item PURPLE_HARNESS = Items.registerItem("purple_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.PURPLE)));
    public static final Item BLUE_HARNESS = Items.registerItem("blue_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.BLUE)));
    public static final Item BROWN_HARNESS = Items.registerItem("brown_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.BROWN)));
    public static final Item GREEN_HARNESS = Items.registerItem("green_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.GREEN)));
    public static final Item RED_HARNESS = Items.registerItem("red_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.RED)));
    public static final Item BLACK_HARNESS = Items.registerItem("black_harness", new Item.Properties().stacksTo(1).component(DataComponents.EQUIPPABLE, (Object)Equippable.harness((DyeColor)DyeColor.BLACK)));
    public static final Item MINECART = Items.registerItem("minecart", (Item.Properties properties) -> new MinecartItem(EntityType.MINECART, properties), new Item.Properties().stacksTo(1));
    public static final Item CHEST_MINECART = Items.registerItem("chest_minecart", (Item.Properties properties) -> new MinecartItem(EntityType.CHEST_MINECART, properties), new Item.Properties().stacksTo(1));
    public static final Item FURNACE_MINECART = Items.registerItem("furnace_minecart", (Item.Properties properties) -> new MinecartItem(EntityType.FURNACE_MINECART, properties), new Item.Properties().stacksTo(1));
    public static final Item TNT_MINECART = Items.registerItem("tnt_minecart", (Item.Properties properties) -> new MinecartItem(EntityType.TNT_MINECART, properties), new Item.Properties().stacksTo(1));
    public static final Item HOPPER_MINECART = Items.registerItem("hopper_minecart", (Item.Properties properties) -> new MinecartItem(EntityType.HOPPER_MINECART, properties), new Item.Properties().stacksTo(1));
    public static final Item CARROT_ON_A_STICK = Items.registerItem("carrot_on_a_stick", (Item.Properties properties) -> new FoodOnAStickItem(EntityType.PIG, 7, properties), new Item.Properties().durability(25));
    public static final Item WARPED_FUNGUS_ON_A_STICK = Items.registerItem("warped_fungus_on_a_stick", (Item.Properties properties) -> new FoodOnAStickItem(EntityType.STRIDER, 1, properties), new Item.Properties().durability(100));
    public static final Item PHANTOM_MEMBRANE = Items.registerItem("phantom_membrane");
    public static final Item ELYTRA = Items.registerItem("elytra", new Item.Properties().durability(432).rarity(Rarity.EPIC).component(DataComponents.GLIDER, (Object)Unit.INSTANCE).component(DataComponents.EQUIPPABLE, (Object)Equippable.builder((EquipmentSlot)EquipmentSlot.CHEST).setEquipSound(SoundEvents.ARMOR_EQUIP_ELYTRA).setAsset(EquipmentAssets.ELYTRA).setDamageOnHurt(false).build()).repairable(PHANTOM_MEMBRANE));
    public static final Item OAK_BOAT = Items.registerItem("oak_boat", (Item.Properties properties) -> new BoatItem(EntityType.OAK_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item OAK_CHEST_BOAT = Items.registerItem("oak_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.OAK_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item SPRUCE_BOAT = Items.registerItem("spruce_boat", (Item.Properties properties) -> new BoatItem(EntityType.SPRUCE_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item SPRUCE_CHEST_BOAT = Items.registerItem("spruce_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.SPRUCE_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item BIRCH_BOAT = Items.registerItem("birch_boat", (Item.Properties properties) -> new BoatItem(EntityType.BIRCH_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item BIRCH_CHEST_BOAT = Items.registerItem("birch_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.BIRCH_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item JUNGLE_BOAT = Items.registerItem("jungle_boat", (Item.Properties properties) -> new BoatItem(EntityType.JUNGLE_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item JUNGLE_CHEST_BOAT = Items.registerItem("jungle_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.JUNGLE_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item ACACIA_BOAT = Items.registerItem("acacia_boat", (Item.Properties properties) -> new BoatItem(EntityType.ACACIA_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item ACACIA_CHEST_BOAT = Items.registerItem("acacia_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.ACACIA_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item CHERRY_BOAT = Items.registerItem("cherry_boat", (Item.Properties properties) -> new BoatItem(EntityType.CHERRY_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item CHERRY_CHEST_BOAT = Items.registerItem("cherry_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.CHERRY_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item DARK_OAK_BOAT = Items.registerItem("dark_oak_boat", (Item.Properties properties) -> new BoatItem(EntityType.DARK_OAK_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item DARK_OAK_CHEST_BOAT = Items.registerItem("dark_oak_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.DARK_OAK_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item PALE_OAK_BOAT = Items.registerItem("pale_oak_boat", (Item.Properties properties) -> new BoatItem(EntityType.PALE_OAK_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item PALE_OAK_CHEST_BOAT = Items.registerItem("pale_oak_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.PALE_OAK_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item MANGROVE_BOAT = Items.registerItem("mangrove_boat", (Item.Properties properties) -> new BoatItem(EntityType.MANGROVE_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item MANGROVE_CHEST_BOAT = Items.registerItem("mangrove_chest_boat", (Item.Properties properties) -> new BoatItem(EntityType.MANGROVE_CHEST_BOAT, properties), new Item.Properties().stacksTo(1));
    public static final Item BAMBOO_RAFT = Items.registerItem("bamboo_raft", (Item.Properties properties) -> new BoatItem(EntityType.BAMBOO_RAFT, properties), new Item.Properties().stacksTo(1));
    public static final Item BAMBOO_CHEST_RAFT = Items.registerItem("bamboo_chest_raft", (Item.Properties properties) -> new BoatItem(EntityType.BAMBOO_CHEST_RAFT, properties), new Item.Properties().stacksTo(1));
    public static final Item STRUCTURE_BLOCK = Items.registerBlock(Blocks.STRUCTURE_BLOCK, GameMasterBlockItem::new, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item JIGSAW = Items.registerBlock(Blocks.JIGSAW, GameMasterBlockItem::new, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item TEST_BLOCK = Items.registerBlock(Blocks.TEST_BLOCK, GameMasterBlockItem::new, new Item.Properties().rarity(Rarity.EPIC).component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)TestBlock.MODE, (Comparable)TestBlockMode.START)));
    public static final Item TEST_INSTANCE_BLOCK = Items.registerBlock(Blocks.TEST_INSTANCE_BLOCK, GameMasterBlockItem::new, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item TURTLE_HELMET = Items.registerItem("turtle_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.TURTLE_SCUTE, ArmorType.HELMET));
    public static final Item TURTLE_SCUTE = Items.registerItem("turtle_scute");
    public static final Item ARMADILLO_SCUTE = Items.registerItem("armadillo_scute");
    public static final Item WOLF_ARMOR = Items.registerItem("wolf_armor", new Item.Properties().wolfArmor(ArmorMaterials.ARMADILLO_SCUTE));
    public static final Item FLINT_AND_STEEL = Items.registerItem("flint_and_steel", FlintAndSteelItem::new, new Item.Properties().durability(64));
    public static final Item BOWL = Items.registerItem("bowl");
    public static final Item APPLE = Items.registerItem("apple", new Item.Properties().food(Foods.APPLE));
    public static final Item BOW = Items.registerItem("bow", BowItem::new, new Item.Properties().durability(384).enchantable(1));
    public static final Item ARROW = Items.registerItem("arrow", ArrowItem::new);
    public static final Item COAL = Items.registerItem("coal");
    public static final Item CHARCOAL = Items.registerItem("charcoal");
    public static final Item DIAMOND = Items.registerItem("diamond", new Item.Properties().trimMaterial(TrimMaterials.DIAMOND));
    public static final Item EMERALD = Items.registerItem("emerald", new Item.Properties().trimMaterial(TrimMaterials.EMERALD));
    public static final Item LAPIS_LAZULI = Items.registerItem("lapis_lazuli", new Item.Properties().trimMaterial(TrimMaterials.LAPIS));
    public static final Item QUARTZ = Items.registerItem("quartz", new Item.Properties().trimMaterial(TrimMaterials.QUARTZ));
    public static final Item AMETHYST_SHARD = Items.registerItem("amethyst_shard", new Item.Properties().trimMaterial(TrimMaterials.AMETHYST));
    public static final Item RAW_IRON = Items.registerItem("raw_iron");
    public static final Item IRON_INGOT = Items.registerItem("iron_ingot", new Item.Properties().trimMaterial(TrimMaterials.IRON));
    public static final Item RAW_COPPER = Items.registerItem("raw_copper");
    public static final Item COPPER_INGOT = Items.registerItem("copper_ingot", new Item.Properties().trimMaterial(TrimMaterials.COPPER));
    public static final Item RAW_GOLD = Items.registerItem("raw_gold");
    public static final Item GOLD_INGOT = Items.registerItem("gold_ingot", new Item.Properties().trimMaterial(TrimMaterials.GOLD));
    public static final Item NETHERITE_INGOT = Items.registerItem("netherite_ingot", new Item.Properties().fireResistant().trimMaterial(TrimMaterials.NETHERITE));
    public static final Item NETHERITE_SCRAP = Items.registerItem("netherite_scrap", new Item.Properties().fireResistant());
    public static final Item WOODEN_SWORD = Items.registerItem("wooden_sword", new Item.Properties().sword(ToolMaterial.WOOD, 3.0f, -2.4f));
    public static final Item WOODEN_SHOVEL = Items.registerItem("wooden_shovel", (Item.Properties properties) -> new ShovelItem(ToolMaterial.WOOD, 1.5f, -3.0f, properties));
    public static final Item WOODEN_PICKAXE = Items.registerItem("wooden_pickaxe", new Item.Properties().pickaxe(ToolMaterial.WOOD, 1.0f, -2.8f));
    public static final Item WOODEN_AXE = Items.registerItem("wooden_axe", (Item.Properties properties) -> new AxeItem(ToolMaterial.WOOD, 6.0f, -3.2f, properties));
    public static final Item WOODEN_HOE = Items.registerItem("wooden_hoe", (Item.Properties properties) -> new HoeItem(ToolMaterial.WOOD, 0.0f, -3.0f, properties));
    public static final Item COPPER_SWORD = Items.registerItem("copper_sword", new Item.Properties().sword(ToolMaterial.COPPER, 3.0f, -2.4f));
    public static final Item COPPER_SHOVEL = Items.registerItem("copper_shovel", (Item.Properties properties) -> new ShovelItem(ToolMaterial.COPPER, 1.5f, -3.0f, properties));
    public static final Item COPPER_PICKAXE = Items.registerItem("copper_pickaxe", new Item.Properties().pickaxe(ToolMaterial.COPPER, 1.0f, -2.8f));
    public static final Item COPPER_AXE = Items.registerItem("copper_axe", (Item.Properties properties) -> new AxeItem(ToolMaterial.COPPER, 7.0f, -3.2f, properties));
    public static final Item COPPER_HOE = Items.registerItem("copper_hoe", (Item.Properties properties) -> new HoeItem(ToolMaterial.COPPER, -1.0f, -2.0f, properties));
    public static final Item STONE_SWORD = Items.registerItem("stone_sword", new Item.Properties().sword(ToolMaterial.STONE, 3.0f, -2.4f));
    public static final Item STONE_SHOVEL = Items.registerItem("stone_shovel", (Item.Properties properties) -> new ShovelItem(ToolMaterial.STONE, 1.5f, -3.0f, properties));
    public static final Item STONE_PICKAXE = Items.registerItem("stone_pickaxe", new Item.Properties().pickaxe(ToolMaterial.STONE, 1.0f, -2.8f));
    public static final Item STONE_AXE = Items.registerItem("stone_axe", (Item.Properties properties) -> new AxeItem(ToolMaterial.STONE, 7.0f, -3.2f, properties));
    public static final Item STONE_HOE = Items.registerItem("stone_hoe", (Item.Properties properties) -> new HoeItem(ToolMaterial.STONE, -1.0f, -2.0f, properties));
    public static final Item GOLDEN_SWORD = Items.registerItem("golden_sword", new Item.Properties().sword(ToolMaterial.GOLD, 3.0f, -2.4f));
    public static final Item GOLDEN_SHOVEL = Items.registerItem("golden_shovel", (Item.Properties properties) -> new ShovelItem(ToolMaterial.GOLD, 1.5f, -3.0f, properties));
    public static final Item GOLDEN_PICKAXE = Items.registerItem("golden_pickaxe", new Item.Properties().pickaxe(ToolMaterial.GOLD, 1.0f, -2.8f));
    public static final Item GOLDEN_AXE = Items.registerItem("golden_axe", (Item.Properties properties) -> new AxeItem(ToolMaterial.GOLD, 6.0f, -3.0f, properties));
    public static final Item GOLDEN_HOE = Items.registerItem("golden_hoe", (Item.Properties properties) -> new HoeItem(ToolMaterial.GOLD, 0.0f, -3.0f, properties));
    public static final Item IRON_SWORD = Items.registerItem("iron_sword", new Item.Properties().sword(ToolMaterial.IRON, 3.0f, -2.4f));
    public static final Item IRON_SHOVEL = Items.registerItem("iron_shovel", (Item.Properties properties) -> new ShovelItem(ToolMaterial.IRON, 1.5f, -3.0f, properties));
    public static final Item IRON_PICKAXE = Items.registerItem("iron_pickaxe", new Item.Properties().pickaxe(ToolMaterial.IRON, 1.0f, -2.8f));
    public static final Item IRON_AXE = Items.registerItem("iron_axe", (Item.Properties properties) -> new AxeItem(ToolMaterial.IRON, 6.0f, -3.1f, properties));
    public static final Item IRON_HOE = Items.registerItem("iron_hoe", (Item.Properties properties) -> new HoeItem(ToolMaterial.IRON, -2.0f, -1.0f, properties));
    public static final Item DIAMOND_SWORD = Items.registerItem("diamond_sword", new Item.Properties().sword(ToolMaterial.DIAMOND, 3.0f, -2.4f));
    public static final Item DIAMOND_SHOVEL = Items.registerItem("diamond_shovel", (Item.Properties properties) -> new ShovelItem(ToolMaterial.DIAMOND, 1.5f, -3.0f, properties));
    public static final Item DIAMOND_PICKAXE = Items.registerItem("diamond_pickaxe", new Item.Properties().pickaxe(ToolMaterial.DIAMOND, 1.0f, -2.8f));
    public static final Item DIAMOND_AXE = Items.registerItem("diamond_axe", (Item.Properties properties) -> new AxeItem(ToolMaterial.DIAMOND, 5.0f, -3.0f, properties));
    public static final Item DIAMOND_HOE = Items.registerItem("diamond_hoe", (Item.Properties properties) -> new HoeItem(ToolMaterial.DIAMOND, -3.0f, 0.0f, properties));
    public static final Item NETHERITE_SWORD = Items.registerItem("netherite_sword", new Item.Properties().sword(ToolMaterial.NETHERITE, 3.0f, -2.4f).fireResistant());
    public static final Item NETHERITE_SHOVEL = Items.registerItem("netherite_shovel", (Item.Properties properties) -> new ShovelItem(ToolMaterial.NETHERITE, 1.5f, -3.0f, properties), new Item.Properties().fireResistant());
    public static final Item NETHERITE_PICKAXE = Items.registerItem("netherite_pickaxe", new Item.Properties().pickaxe(ToolMaterial.NETHERITE, 1.0f, -2.8f).fireResistant());
    public static final Item NETHERITE_AXE = Items.registerItem("netherite_axe", (Item.Properties properties) -> new AxeItem(ToolMaterial.NETHERITE, 5.0f, -3.0f, properties), new Item.Properties().fireResistant());
    public static final Item NETHERITE_HOE = Items.registerItem("netherite_hoe", (Item.Properties properties) -> new HoeItem(ToolMaterial.NETHERITE, -4.0f, 0.0f, properties), new Item.Properties().fireResistant());
    public static final Item STICK = Items.registerItem("stick");
    public static final Item MUSHROOM_STEW = Items.registerItem("mushroom_stew", new Item.Properties().stacksTo(1).food(Foods.MUSHROOM_STEW).usingConvertsTo(BOWL));
    public static final Item STRING = Items.registerItem("string", Items.createBlockItemWithCustomItemName(Blocks.TRIPWIRE));
    public static final Item FEATHER = Items.registerItem("feather");
    public static final Item GUNPOWDER = Items.registerItem("gunpowder");
    public static final Item WHEAT_SEEDS = Items.registerItem("wheat_seeds", Items.createBlockItemWithCustomItemName(Blocks.WHEAT));
    public static final Item WHEAT = Items.registerItem("wheat");
    public static final Item BREAD = Items.registerItem("bread", new Item.Properties().food(Foods.BREAD));
    public static final Item LEATHER_HELMET = Items.registerItem("leather_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.LEATHER, ArmorType.HELMET));
    public static final Item LEATHER_CHESTPLATE = Items.registerItem("leather_chestplate", new Item.Properties().humanoidArmor(ArmorMaterials.LEATHER, ArmorType.CHESTPLATE));
    public static final Item LEATHER_LEGGINGS = Items.registerItem("leather_leggings", new Item.Properties().humanoidArmor(ArmorMaterials.LEATHER, ArmorType.LEGGINGS));
    public static final Item LEATHER_BOOTS = Items.registerItem("leather_boots", new Item.Properties().humanoidArmor(ArmorMaterials.LEATHER, ArmorType.BOOTS));
    public static final Item COPPER_HELMET = Items.registerItem("copper_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.COPPER, ArmorType.HELMET));
    public static final Item COPPER_CHESTPLATE = Items.registerItem("copper_chestplate", new Item.Properties().humanoidArmor(ArmorMaterials.COPPER, ArmorType.CHESTPLATE));
    public static final Item COPPER_LEGGINGS = Items.registerItem("copper_leggings", new Item.Properties().humanoidArmor(ArmorMaterials.COPPER, ArmorType.LEGGINGS));
    public static final Item COPPER_BOOTS = Items.registerItem("copper_boots", new Item.Properties().humanoidArmor(ArmorMaterials.COPPER, ArmorType.BOOTS));
    public static final Item CHAINMAIL_HELMET = Items.registerItem("chainmail_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.CHAINMAIL, ArmorType.HELMET).rarity(Rarity.UNCOMMON));
    public static final Item CHAINMAIL_CHESTPLATE = Items.registerItem("chainmail_chestplate", new Item.Properties().humanoidArmor(ArmorMaterials.CHAINMAIL, ArmorType.CHESTPLATE).rarity(Rarity.UNCOMMON));
    public static final Item CHAINMAIL_LEGGINGS = Items.registerItem("chainmail_leggings", new Item.Properties().humanoidArmor(ArmorMaterials.CHAINMAIL, ArmorType.LEGGINGS).rarity(Rarity.UNCOMMON));
    public static final Item CHAINMAIL_BOOTS = Items.registerItem("chainmail_boots", new Item.Properties().humanoidArmor(ArmorMaterials.CHAINMAIL, ArmorType.BOOTS).rarity(Rarity.UNCOMMON));
    public static final Item IRON_HELMET = Items.registerItem("iron_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.IRON, ArmorType.HELMET));
    public static final Item IRON_CHESTPLATE = Items.registerItem("iron_chestplate", new Item.Properties().humanoidArmor(ArmorMaterials.IRON, ArmorType.CHESTPLATE));
    public static final Item IRON_LEGGINGS = Items.registerItem("iron_leggings", new Item.Properties().humanoidArmor(ArmorMaterials.IRON, ArmorType.LEGGINGS));
    public static final Item IRON_BOOTS = Items.registerItem("iron_boots", new Item.Properties().humanoidArmor(ArmorMaterials.IRON, ArmorType.BOOTS));
    public static final Item DIAMOND_HELMET = Items.registerItem("diamond_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.DIAMOND, ArmorType.HELMET));
    public static final Item DIAMOND_CHESTPLATE = Items.registerItem("diamond_chestplate", new Item.Properties().humanoidArmor(ArmorMaterials.DIAMOND, ArmorType.CHESTPLATE));
    public static final Item DIAMOND_LEGGINGS = Items.registerItem("diamond_leggings", new Item.Properties().humanoidArmor(ArmorMaterials.DIAMOND, ArmorType.LEGGINGS));
    public static final Item DIAMOND_BOOTS = Items.registerItem("diamond_boots", new Item.Properties().humanoidArmor(ArmorMaterials.DIAMOND, ArmorType.BOOTS));
    public static final Item GOLDEN_HELMET = Items.registerItem("golden_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.GOLD, ArmorType.HELMET));
    public static final Item GOLDEN_CHESTPLATE = Items.registerItem("golden_chestplate", new Item.Properties().humanoidArmor(ArmorMaterials.GOLD, ArmorType.CHESTPLATE));
    public static final Item GOLDEN_LEGGINGS = Items.registerItem("golden_leggings", new Item.Properties().humanoidArmor(ArmorMaterials.GOLD, ArmorType.LEGGINGS));
    public static final Item GOLDEN_BOOTS = Items.registerItem("golden_boots", new Item.Properties().humanoidArmor(ArmorMaterials.GOLD, ArmorType.BOOTS));
    public static final Item NETHERITE_HELMET = Items.registerItem("netherite_helmet", new Item.Properties().humanoidArmor(ArmorMaterials.NETHERITE, ArmorType.HELMET).fireResistant());
    public static final Item NETHERITE_CHESTPLATE = Items.registerItem("netherite_chestplate", new Item.Properties().humanoidArmor(ArmorMaterials.NETHERITE, ArmorType.CHESTPLATE).fireResistant());
    public static final Item NETHERITE_LEGGINGS = Items.registerItem("netherite_leggings", new Item.Properties().humanoidArmor(ArmorMaterials.NETHERITE, ArmorType.LEGGINGS).fireResistant());
    public static final Item NETHERITE_BOOTS = Items.registerItem("netherite_boots", new Item.Properties().humanoidArmor(ArmorMaterials.NETHERITE, ArmorType.BOOTS).fireResistant());
    public static final Item FLINT = Items.registerItem("flint");
    public static final Item PORKCHOP = Items.registerItem("porkchop", new Item.Properties().food(Foods.PORKCHOP));
    public static final Item COOKED_PORKCHOP = Items.registerItem("cooked_porkchop", new Item.Properties().food(Foods.COOKED_PORKCHOP));
    public static final Item PAINTING = Items.registerItem("painting", (Item.Properties properties) -> new HangingEntityItem(EntityType.PAINTING, properties));
    public static final Item GOLDEN_APPLE = Items.registerItem("golden_apple", new Item.Properties().food(Foods.GOLDEN_APPLE, Consumables.GOLDEN_APPLE));
    public static final Item ENCHANTED_GOLDEN_APPLE = Items.registerItem("enchanted_golden_apple", new Item.Properties().rarity(Rarity.RARE).food(Foods.ENCHANTED_GOLDEN_APPLE, Consumables.ENCHANTED_GOLDEN_APPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, (Object)true));
    public static final Item OAK_SIGN = Items.registerBlock(Blocks.OAK_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.OAK_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item SPRUCE_SIGN = Items.registerBlock(Blocks.SPRUCE_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.SPRUCE_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item BIRCH_SIGN = Items.registerBlock(Blocks.BIRCH_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.BIRCH_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item JUNGLE_SIGN = Items.registerBlock(Blocks.JUNGLE_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.JUNGLE_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item ACACIA_SIGN = Items.registerBlock(Blocks.ACACIA_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.ACACIA_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item CHERRY_SIGN = Items.registerBlock(Blocks.CHERRY_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.CHERRY_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item DARK_OAK_SIGN = Items.registerBlock(Blocks.DARK_OAK_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.DARK_OAK_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item PALE_OAK_SIGN = Items.registerBlock(Blocks.PALE_OAK_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.PALE_OAK_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item MANGROVE_SIGN = Items.registerBlock(Blocks.MANGROVE_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.MANGROVE_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item BAMBOO_SIGN = Items.registerBlock(Blocks.BAMBOO_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.BAMBOO_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item CRIMSON_SIGN = Items.registerBlock(Blocks.CRIMSON_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.CRIMSON_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item WARPED_SIGN = Items.registerBlock(Blocks.WARPED_SIGN, (Block block, Item.Properties properties) -> new SignItem(block, Blocks.WARPED_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item OAK_HANGING_SIGN = Items.registerBlock(Blocks.OAK_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.OAK_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item SPRUCE_HANGING_SIGN = Items.registerBlock(Blocks.SPRUCE_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.SPRUCE_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item BIRCH_HANGING_SIGN = Items.registerBlock(Blocks.BIRCH_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.BIRCH_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item JUNGLE_HANGING_SIGN = Items.registerBlock(Blocks.JUNGLE_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.JUNGLE_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item ACACIA_HANGING_SIGN = Items.registerBlock(Blocks.ACACIA_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.ACACIA_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item CHERRY_HANGING_SIGN = Items.registerBlock(Blocks.CHERRY_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.CHERRY_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item DARK_OAK_HANGING_SIGN = Items.registerBlock(Blocks.DARK_OAK_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.DARK_OAK_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item PALE_OAK_HANGING_SIGN = Items.registerBlock(Blocks.PALE_OAK_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.PALE_OAK_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item MANGROVE_HANGING_SIGN = Items.registerBlock(Blocks.MANGROVE_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.MANGROVE_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item BAMBOO_HANGING_SIGN = Items.registerBlock(Blocks.BAMBOO_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.BAMBOO_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item CRIMSON_HANGING_SIGN = Items.registerBlock(Blocks.CRIMSON_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.CRIMSON_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item WARPED_HANGING_SIGN = Items.registerBlock(Blocks.WARPED_HANGING_SIGN, (Block block, Item.Properties properties) -> new HangingSignItem(block, Blocks.WARPED_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Item BUCKET = Items.registerItem("bucket", (Item.Properties properties) -> new BucketItem(Fluids.EMPTY, properties), new Item.Properties().stacksTo(16));
    public static final Item WATER_BUCKET = Items.registerItem("water_bucket", (Item.Properties properties) -> new BucketItem((Fluid)Fluids.WATER, properties), new Item.Properties().craftRemainder(BUCKET).stacksTo(1));
    public static final Item LAVA_BUCKET = Items.registerItem("lava_bucket", (Item.Properties properties) -> new BucketItem((Fluid)Fluids.LAVA, properties), new Item.Properties().craftRemainder(BUCKET).stacksTo(1));
    public static final Item POWDER_SNOW_BUCKET = Items.registerItem("powder_snow_bucket", (Item.Properties properties) -> new SolidBucketItem(Blocks.POWDER_SNOW, SoundEvents.BUCKET_EMPTY_POWDER_SNOW, properties), new Item.Properties().stacksTo(1).useItemDescriptionPrefix());
    public static final Item SNOWBALL = Items.registerItem("snowball", SnowballItem::new, new Item.Properties().stacksTo(16));
    public static final Item LEATHER = Items.registerItem("leather");
    public static final Item MILK_BUCKET = Items.registerItem("milk_bucket", new Item.Properties().craftRemainder(BUCKET).component(DataComponents.CONSUMABLE, (Object)Consumables.MILK_BUCKET).usingConvertsTo(BUCKET).stacksTo(1));
    public static final Item PUFFERFISH_BUCKET = Items.registerItem("pufferfish_bucket", (Item.Properties properties) -> new MobBucketItem(EntityType.PUFFERFISH, (Fluid)Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, (Object)CustomData.EMPTY).component(DataComponents.FOOD, (Object)Foods.PUFFERFISH));
    public static final Item SALMON_BUCKET = Items.registerItem("salmon_bucket", (Item.Properties properties) -> new MobBucketItem(EntityType.SALMON, (Fluid)Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, (Object)CustomData.EMPTY).component(DataComponents.FOOD, (Object)Foods.SALMON));
    public static final Item COD_BUCKET = Items.registerItem("cod_bucket", (Item.Properties properties) -> new MobBucketItem(EntityType.COD, (Fluid)Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, (Object)CustomData.EMPTY).component(DataComponents.FOOD, (Object)Foods.COD));
    public static final Item TROPICAL_FISH_BUCKET = Items.registerItem("tropical_fish_bucket", (Item.Properties properties) -> new MobBucketItem(EntityType.TROPICAL_FISH, (Fluid)Fluids.WATER, SoundEvents.BUCKET_EMPTY_FISH, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, (Object)CustomData.EMPTY).component(DataComponents.FOOD, (Object)Foods.TROPICAL_FISH));
    public static final Item AXOLOTL_BUCKET = Items.registerItem("axolotl_bucket", (Item.Properties properties) -> new MobBucketItem(EntityType.AXOLOTL, (Fluid)Fluids.WATER, SoundEvents.BUCKET_EMPTY_AXOLOTL, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, (Object)CustomData.EMPTY));
    public static final Item TADPOLE_BUCKET = Items.registerItem("tadpole_bucket", (Item.Properties properties) -> new MobBucketItem(EntityType.TADPOLE, (Fluid)Fluids.WATER, SoundEvents.BUCKET_EMPTY_TADPOLE, properties), new Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, (Object)CustomData.EMPTY));
    public static final Item BRICK = Items.registerItem("brick");
    public static final Item CLAY_BALL = Items.registerItem("clay_ball");
    public static final Item DRIED_KELP_BLOCK = Items.registerBlock(Blocks.DRIED_KELP_BLOCK);
    public static final Item PAPER = Items.registerItem("paper");
    public static final Item BOOK = Items.registerItem("book", new Item.Properties().enchantable(1));
    public static final Item SLIME_BALL = Items.registerItem("slime_ball");
    public static final Item EGG = Items.registerItem("egg", EggItem::new, new Item.Properties().stacksTo(16).component(DataComponents.CHICKEN_VARIANT, (Object)new EitherHolder(ChickenVariants.TEMPERATE)));
    public static final Item BLUE_EGG = Items.registerItem("blue_egg", EggItem::new, new Item.Properties().stacksTo(16).component(DataComponents.CHICKEN_VARIANT, (Object)new EitherHolder(ChickenVariants.COLD)));
    public static final Item BROWN_EGG = Items.registerItem("brown_egg", EggItem::new, new Item.Properties().stacksTo(16).component(DataComponents.CHICKEN_VARIANT, (Object)new EitherHolder(ChickenVariants.WARM)));
    public static final Item COMPASS = Items.registerItem("compass", CompassItem::new);
    public static final Item RECOVERY_COMPASS = Items.registerItem("recovery_compass", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item BUNDLE = Items.registerItem("bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item WHITE_BUNDLE = Items.registerItem("white_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item ORANGE_BUNDLE = Items.registerItem("orange_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item MAGENTA_BUNDLE = Items.registerItem("magenta_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item LIGHT_BLUE_BUNDLE = Items.registerItem("light_blue_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item YELLOW_BUNDLE = Items.registerItem("yellow_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item LIME_BUNDLE = Items.registerItem("lime_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item PINK_BUNDLE = Items.registerItem("pink_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item GRAY_BUNDLE = Items.registerItem("gray_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item LIGHT_GRAY_BUNDLE = Items.registerItem("light_gray_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item CYAN_BUNDLE = Items.registerItem("cyan_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item PURPLE_BUNDLE = Items.registerItem("purple_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item BLUE_BUNDLE = Items.registerItem("blue_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item BROWN_BUNDLE = Items.registerItem("brown_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item GREEN_BUNDLE = Items.registerItem("green_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item RED_BUNDLE = Items.registerItem("red_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item BLACK_BUNDLE = Items.registerItem("black_bundle", BundleItem::new, new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, (Object)BundleContents.EMPTY));
    public static final Item FISHING_ROD = Items.registerItem("fishing_rod", FishingRodItem::new, new Item.Properties().durability(64).enchantable(1));
    public static final Item CLOCK = Items.registerItem("clock");
    public static final Item SPYGLASS = Items.registerItem("spyglass", SpyglassItem::new, new Item.Properties().stacksTo(1));
    public static final Item GLOWSTONE_DUST = Items.registerItem("glowstone_dust");
    public static final Item COD = Items.registerItem("cod", new Item.Properties().food(Foods.COD));
    public static final Item SALMON = Items.registerItem("salmon", new Item.Properties().food(Foods.SALMON));
    public static final Item TROPICAL_FISH = Items.registerItem("tropical_fish", new Item.Properties().food(Foods.TROPICAL_FISH));
    public static final Item PUFFERFISH = Items.registerItem("pufferfish", new Item.Properties().food(Foods.PUFFERFISH, Consumables.PUFFERFISH));
    public static final Item COOKED_COD = Items.registerItem("cooked_cod", new Item.Properties().food(Foods.COOKED_COD));
    public static final Item COOKED_SALMON = Items.registerItem("cooked_salmon", new Item.Properties().food(Foods.COOKED_SALMON));
    public static final Item INK_SAC = Items.registerItem("ink_sac", InkSacItem::new);
    public static final Item GLOW_INK_SAC = Items.registerItem("glow_ink_sac", GlowInkSacItem::new);
    public static final Item COCOA_BEANS = Items.registerItem("cocoa_beans", Items.createBlockItemWithCustomItemName(Blocks.COCOA));
    public static final Item WHITE_DYE = Items.registerItem("white_dye", (Item.Properties properties) -> new DyeItem(DyeColor.WHITE, properties));
    public static final Item ORANGE_DYE = Items.registerItem("orange_dye", (Item.Properties properties) -> new DyeItem(DyeColor.ORANGE, properties));
    public static final Item MAGENTA_DYE = Items.registerItem("magenta_dye", (Item.Properties properties) -> new DyeItem(DyeColor.MAGENTA, properties));
    public static final Item LIGHT_BLUE_DYE = Items.registerItem("light_blue_dye", (Item.Properties properties) -> new DyeItem(DyeColor.LIGHT_BLUE, properties));
    public static final Item YELLOW_DYE = Items.registerItem("yellow_dye", (Item.Properties properties) -> new DyeItem(DyeColor.YELLOW, properties));
    public static final Item LIME_DYE = Items.registerItem("lime_dye", (Item.Properties properties) -> new DyeItem(DyeColor.LIME, properties));
    public static final Item PINK_DYE = Items.registerItem("pink_dye", (Item.Properties properties) -> new DyeItem(DyeColor.PINK, properties));
    public static final Item GRAY_DYE = Items.registerItem("gray_dye", (Item.Properties properties) -> new DyeItem(DyeColor.GRAY, properties));
    public static final Item LIGHT_GRAY_DYE = Items.registerItem("light_gray_dye", (Item.Properties properties) -> new DyeItem(DyeColor.LIGHT_GRAY, properties));
    public static final Item CYAN_DYE = Items.registerItem("cyan_dye", (Item.Properties properties) -> new DyeItem(DyeColor.CYAN, properties));
    public static final Item PURPLE_DYE = Items.registerItem("purple_dye", (Item.Properties properties) -> new DyeItem(DyeColor.PURPLE, properties));
    public static final Item BLUE_DYE = Items.registerItem("blue_dye", (Item.Properties properties) -> new DyeItem(DyeColor.BLUE, properties));
    public static final Item BROWN_DYE = Items.registerItem("brown_dye", (Item.Properties properties) -> new DyeItem(DyeColor.BROWN, properties));
    public static final Item GREEN_DYE = Items.registerItem("green_dye", (Item.Properties properties) -> new DyeItem(DyeColor.GREEN, properties));
    public static final Item RED_DYE = Items.registerItem("red_dye", (Item.Properties properties) -> new DyeItem(DyeColor.RED, properties));
    public static final Item BLACK_DYE = Items.registerItem("black_dye", (Item.Properties properties) -> new DyeItem(DyeColor.BLACK, properties));
    public static final Item BONE_MEAL = Items.registerItem("bone_meal", BoneMealItem::new);
    public static final Item BONE = Items.registerItem("bone");
    public static final Item SUGAR = Items.registerItem("sugar");
    public static final Item CAKE = Items.registerBlock(Blocks.CAKE, new Item.Properties().stacksTo(1));
    public static final Item WHITE_BED = Items.registerBlock(Blocks.WHITE_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item ORANGE_BED = Items.registerBlock(Blocks.ORANGE_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item MAGENTA_BED = Items.registerBlock(Blocks.MAGENTA_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item LIGHT_BLUE_BED = Items.registerBlock(Blocks.LIGHT_BLUE_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item YELLOW_BED = Items.registerBlock(Blocks.YELLOW_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item LIME_BED = Items.registerBlock(Blocks.LIME_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item PINK_BED = Items.registerBlock(Blocks.PINK_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item GRAY_BED = Items.registerBlock(Blocks.GRAY_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item LIGHT_GRAY_BED = Items.registerBlock(Blocks.LIGHT_GRAY_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item CYAN_BED = Items.registerBlock(Blocks.CYAN_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item PURPLE_BED = Items.registerBlock(Blocks.PURPLE_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item BLUE_BED = Items.registerBlock(Blocks.BLUE_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item BROWN_BED = Items.registerBlock(Blocks.BROWN_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item GREEN_BED = Items.registerBlock(Blocks.GREEN_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item RED_BED = Items.registerBlock(Blocks.RED_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item BLACK_BED = Items.registerBlock(Blocks.BLACK_BED, BedItem::new, new Item.Properties().stacksTo(1));
    public static final Item COOKIE = Items.registerItem("cookie", new Item.Properties().food(Foods.COOKIE));
    public static final Item CRAFTER = Items.registerBlock(Blocks.CRAFTER, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item FILLED_MAP = Items.registerItem("filled_map", MapItem::new, new Item.Properties().component(DataComponents.MAP_COLOR, (Object)MapItemColor.DEFAULT).component(DataComponents.MAP_DECORATIONS, (Object)MapDecorations.EMPTY));
    public static final Item SHEARS = Items.registerItem("shears", ShearsItem::new, new Item.Properties().durability(238).component(DataComponents.TOOL, (Object)ShearsItem.createToolProperties()));
    public static final Item MELON_SLICE = Items.registerItem("melon_slice", new Item.Properties().food(Foods.MELON_SLICE));
    public static final Item DRIED_KELP = Items.registerItem("dried_kelp", new Item.Properties().food(Foods.DRIED_KELP, Consumables.DRIED_KELP));
    public static final Item PUMPKIN_SEEDS = Items.registerItem((ResourceKey<Item>)net.minecraft.references.Items.PUMPKIN_SEEDS, Items.createBlockItemWithCustomItemName(Blocks.PUMPKIN_STEM));
    public static final Item MELON_SEEDS = Items.registerItem((ResourceKey<Item>)net.minecraft.references.Items.MELON_SEEDS, Items.createBlockItemWithCustomItemName(Blocks.MELON_STEM));
    public static final Item BEEF = Items.registerItem("beef", new Item.Properties().food(Foods.BEEF));
    public static final Item COOKED_BEEF = Items.registerItem("cooked_beef", new Item.Properties().food(Foods.COOKED_BEEF));
    public static final Item CHICKEN = Items.registerItem("chicken", new Item.Properties().food(Foods.CHICKEN, Consumables.CHICKEN));
    public static final Item COOKED_CHICKEN = Items.registerItem("cooked_chicken", new Item.Properties().food(Foods.COOKED_CHICKEN));
    public static final Item ROTTEN_FLESH = Items.registerItem("rotten_flesh", new Item.Properties().food(Foods.ROTTEN_FLESH, Consumables.ROTTEN_FLESH));
    public static final Item ENDER_PEARL = Items.registerItem("ender_pearl", EnderpearlItem::new, new Item.Properties().stacksTo(16).useCooldown(1.0f));
    public static final Item BLAZE_ROD = Items.registerItem("blaze_rod");
    public static final Item GHAST_TEAR = Items.registerItem("ghast_tear");
    public static final Item GOLD_NUGGET = Items.registerItem("gold_nugget");
    public static final Item NETHER_WART = Items.registerItem("nether_wart", Items.createBlockItemWithCustomItemName(Blocks.NETHER_WART));
    public static final Item GLASS_BOTTLE = Items.registerItem("glass_bottle", BottleItem::new);
    public static final Item POTION = Items.registerItem("potion", PotionItem::new, new Item.Properties().stacksTo(1).component(DataComponents.POTION_CONTENTS, (Object)PotionContents.EMPTY).component(DataComponents.CONSUMABLE, (Object)Consumables.DEFAULT_DRINK).usingConvertsTo(GLASS_BOTTLE));
    public static final Item SPIDER_EYE = Items.registerItem("spider_eye", new Item.Properties().food(Foods.SPIDER_EYE, Consumables.SPIDER_EYE));
    public static final Item FERMENTED_SPIDER_EYE = Items.registerItem("fermented_spider_eye");
    public static final Item BLAZE_POWDER = Items.registerItem("blaze_powder");
    public static final Item MAGMA_CREAM = Items.registerItem("magma_cream");
    public static final Item BREWING_STAND = Items.registerBlock(Blocks.BREWING_STAND, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item CAULDRON = Items.registerBlock(Blocks.CAULDRON, Blocks.WATER_CAULDRON, Blocks.LAVA_CAULDRON, Blocks.POWDER_SNOW_CAULDRON);
    public static final Item ENDER_EYE = Items.registerItem("ender_eye", EnderEyeItem::new);
    public static final Item GLISTERING_MELON_SLICE = Items.registerItem("glistering_melon_slice");
    public static final Item CHICKEN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.CHICKEN);
    public static final Item COW_SPAWN_EGG = Items.registerSpawnEgg(EntityType.COW);
    public static final Item PIG_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PIG);
    public static final Item SHEEP_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SHEEP);
    public static final Item CAMEL_SPAWN_EGG = Items.registerSpawnEgg(EntityType.CAMEL);
    public static final Item DONKEY_SPAWN_EGG = Items.registerSpawnEgg(EntityType.DONKEY);
    public static final Item HORSE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.HORSE);
    public static final Item MULE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.MULE);
    public static final Item CAT_SPAWN_EGG = Items.registerSpawnEgg(EntityType.CAT);
    public static final Item PARROT_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PARROT);
    public static final Item WOLF_SPAWN_EGG = Items.registerSpawnEgg(EntityType.WOLF);
    public static final Item ARMADILLO_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ARMADILLO);
    public static final Item BAT_SPAWN_EGG = Items.registerSpawnEgg(EntityType.BAT);
    public static final Item BEE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.BEE);
    public static final Item FOX_SPAWN_EGG = Items.registerSpawnEgg(EntityType.FOX);
    public static final Item GOAT_SPAWN_EGG = Items.registerSpawnEgg(EntityType.GOAT);
    public static final Item LLAMA_SPAWN_EGG = Items.registerSpawnEgg(EntityType.LLAMA);
    public static final Item OCELOT_SPAWN_EGG = Items.registerSpawnEgg(EntityType.OCELOT);
    public static final Item PANDA_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PANDA);
    public static final Item POLAR_BEAR_SPAWN_EGG = Items.registerSpawnEgg(EntityType.POLAR_BEAR);
    public static final Item RABBIT_SPAWN_EGG = Items.registerSpawnEgg(EntityType.RABBIT);
    public static final Item AXOLOTL_SPAWN_EGG = Items.registerSpawnEgg(EntityType.AXOLOTL);
    public static final Item COD_SPAWN_EGG = Items.registerSpawnEgg(EntityType.COD);
    public static final Item DOLPHIN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.DOLPHIN);
    public static final Item FROG_SPAWN_EGG = Items.registerSpawnEgg(EntityType.FROG);
    public static final Item GLOW_SQUID_SPAWN_EGG = Items.registerSpawnEgg(EntityType.GLOW_SQUID);
    public static final Item NAUTILUS_SPAWN_EGG = Items.registerSpawnEgg(EntityType.NAUTILUS);
    public static final Item PUFFERFISH_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PUFFERFISH);
    public static final Item SALMON_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SALMON);
    public static final Item SQUID_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SQUID);
    public static final Item TADPOLE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.TADPOLE);
    public static final Item TROPICAL_FISH_SPAWN_EGG = Items.registerSpawnEgg(EntityType.TROPICAL_FISH);
    public static final Item TURTLE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.TURTLE);
    public static final Item ALLAY_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ALLAY);
    public static final Item MOOSHROOM_SPAWN_EGG = Items.registerSpawnEgg(EntityType.MOOSHROOM);
    public static final Item SNIFFER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SNIFFER);
    public static final Item COPPER_GOLEM_SPAWN_EGG = Items.registerSpawnEgg(EntityType.COPPER_GOLEM);
    public static final Item IRON_GOLEM_SPAWN_EGG = Items.registerSpawnEgg(EntityType.IRON_GOLEM);
    public static final Item SNOW_GOLEM_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SNOW_GOLEM);
    public static final Item TRADER_LLAMA_SPAWN_EGG = Items.registerSpawnEgg(EntityType.TRADER_LLAMA);
    public static final Item VILLAGER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.VILLAGER);
    public static final Item WANDERING_TRADER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.WANDERING_TRADER);
    public static final Item BOGGED_SPAWN_EGG = Items.registerSpawnEgg(EntityType.BOGGED);
    public static final Item CAMEL_HUSK_SPAWN_EGG = Items.registerSpawnEgg(EntityType.CAMEL_HUSK);
    public static final Item DROWNED_SPAWN_EGG = Items.registerSpawnEgg(EntityType.DROWNED);
    public static final Item HUSK_SPAWN_EGG = Items.registerSpawnEgg(EntityType.HUSK);
    public static final Item PARCHED_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PARCHED);
    public static final Item SKELETON_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SKELETON);
    public static final Item SKELETON_HORSE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SKELETON_HORSE);
    public static final Item STRAY_SPAWN_EGG = Items.registerSpawnEgg(EntityType.STRAY);
    public static final Item WITHER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.WITHER);
    public static final Item WITHER_SKELETON_SPAWN_EGG = Items.registerSpawnEgg(EntityType.WITHER_SKELETON);
    public static final Item ZOMBIE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ZOMBIE);
    public static final Item ZOMBIE_HORSE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ZOMBIE_HORSE);
    public static final Item ZOMBIE_NAUTILUS_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ZOMBIE_NAUTILUS);
    public static final Item ZOMBIE_VILLAGER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ZOMBIE_VILLAGER);
    public static final Item CAVE_SPIDER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.CAVE_SPIDER);
    public static final Item SPIDER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SPIDER);
    public static final Item BREEZE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.BREEZE);
    public static final Item CREAKING_SPAWN_EGG = Items.registerSpawnEgg(EntityType.CREAKING);
    public static final Item CREEPER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.CREEPER);
    public static final Item ELDER_GUARDIAN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ELDER_GUARDIAN);
    public static final Item GUARDIAN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.GUARDIAN);
    public static final Item PHANTOM_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PHANTOM);
    public static final Item SILVERFISH_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SILVERFISH);
    public static final Item SLIME_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SLIME);
    public static final Item WARDEN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.WARDEN);
    public static final Item WITCH_SPAWN_EGG = Items.registerSpawnEgg(EntityType.WITCH);
    public static final Item EVOKER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.EVOKER);
    public static final Item PILLAGER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PILLAGER);
    public static final Item RAVAGER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.RAVAGER);
    public static final Item VINDICATOR_SPAWN_EGG = Items.registerSpawnEgg(EntityType.VINDICATOR);
    public static final Item VEX_SPAWN_EGG = Items.registerSpawnEgg(EntityType.VEX);
    public static final Item BLAZE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.BLAZE);
    public static final Item GHAST_SPAWN_EGG = Items.registerSpawnEgg(EntityType.GHAST);
    public static final Item HAPPY_GHAST_SPAWN_EGG = Items.registerSpawnEgg(EntityType.HAPPY_GHAST);
    public static final Item HOGLIN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.HOGLIN);
    public static final Item MAGMA_CUBE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.MAGMA_CUBE);
    public static final Item PIGLIN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PIGLIN);
    public static final Item PIGLIN_BRUTE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.PIGLIN_BRUTE);
    public static final Item STRIDER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.STRIDER);
    public static final Item ZOGLIN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ZOGLIN);
    public static final Item ZOMBIFIED_PIGLIN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ZOMBIFIED_PIGLIN);
    public static final Item ENDER_DRAGON_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ENDER_DRAGON);
    public static final Item ENDERMAN_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ENDERMAN);
    public static final Item ENDERMITE_SPAWN_EGG = Items.registerSpawnEgg(EntityType.ENDERMITE);
    public static final Item SHULKER_SPAWN_EGG = Items.registerSpawnEgg(EntityType.SHULKER);
    public static final Item EXPERIENCE_BOTTLE = Items.registerItem("experience_bottle", ExperienceBottleItem::new, new Item.Properties().rarity(Rarity.UNCOMMON).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, (Object)true));
    public static final Item FIRE_CHARGE = Items.registerItem("fire_charge", FireChargeItem::new);
    public static final Item WIND_CHARGE = Items.registerItem("wind_charge", WindChargeItem::new, new Item.Properties().useCooldown(0.5f));
    public static final Item WRITABLE_BOOK = Items.registerItem("writable_book", WritableBookItem::new, new Item.Properties().stacksTo(1).component(DataComponents.WRITABLE_BOOK_CONTENT, (Object)WritableBookContent.EMPTY));
    public static final Item WRITTEN_BOOK = Items.registerItem("written_book", WrittenBookItem::new, new Item.Properties().stacksTo(16).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, (Object)true));
    public static final Item BREEZE_ROD = Items.registerItem("breeze_rod");
    public static final Item MACE = Items.registerItem("mace", MaceItem::new, new Item.Properties().rarity(Rarity.EPIC).durability(500).component(DataComponents.TOOL, (Object)MaceItem.createToolProperties()).repairable(BREEZE_ROD).attributes(MaceItem.createAttributes()).enchantable(15).component(DataComponents.WEAPON, (Object)new Weapon(1)));
    public static final Item ITEM_FRAME = Items.registerItem("item_frame", (Item.Properties properties) -> new ItemFrameItem(EntityType.ITEM_FRAME, properties));
    public static final Item GLOW_ITEM_FRAME = Items.registerItem("glow_item_frame", (Item.Properties properties) -> new ItemFrameItem(EntityType.GLOW_ITEM_FRAME, properties));
    public static final Item FLOWER_POT = Items.registerBlock(Blocks.FLOWER_POT);
    public static final Item CARROT = Items.registerItem("carrot", Items.createBlockItemWithCustomItemName(Blocks.CARROTS), new Item.Properties().food(Foods.CARROT));
    public static final Item POTATO = Items.registerItem("potato", Items.createBlockItemWithCustomItemName(Blocks.POTATOES), new Item.Properties().food(Foods.POTATO));
    public static final Item BAKED_POTATO = Items.registerItem("baked_potato", new Item.Properties().food(Foods.BAKED_POTATO));
    public static final Item POISONOUS_POTATO = Items.registerItem("poisonous_potato", new Item.Properties().food(Foods.POISONOUS_POTATO, Consumables.POISONOUS_POTATO));
    public static final Item MAP = Items.registerItem("map", EmptyMapItem::new);
    public static final Item GOLDEN_CARROT = Items.registerItem("golden_carrot", new Item.Properties().food(Foods.GOLDEN_CARROT));
    public static final Item SKELETON_SKULL = Items.registerBlock(Blocks.SKELETON_SKULL, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.SKELETON_WALL_SKULL, Direction.DOWN, Waypoint.addHideAttribute((Item.Properties)properties)), new Item.Properties().rarity(Rarity.UNCOMMON).equippableUnswappable(EquipmentSlot.HEAD));
    public static final Item WITHER_SKELETON_SKULL = Items.registerBlock(Blocks.WITHER_SKELETON_SKULL, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.WITHER_SKELETON_WALL_SKULL, Direction.DOWN, Waypoint.addHideAttribute((Item.Properties)properties)), new Item.Properties().rarity(Rarity.RARE).equippableUnswappable(EquipmentSlot.HEAD));
    public static final Item PLAYER_HEAD = Items.registerBlock(Blocks.PLAYER_HEAD, (Block block, Item.Properties properties) -> new PlayerHeadItem(block, Blocks.PLAYER_WALL_HEAD, Waypoint.addHideAttribute((Item.Properties)properties)), new Item.Properties().rarity(Rarity.UNCOMMON).equippableUnswappable(EquipmentSlot.HEAD));
    public static final Item ZOMBIE_HEAD = Items.registerBlock(Blocks.ZOMBIE_HEAD, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.ZOMBIE_WALL_HEAD, Direction.DOWN, Waypoint.addHideAttribute((Item.Properties)properties)), new Item.Properties().rarity(Rarity.UNCOMMON).equippableUnswappable(EquipmentSlot.HEAD));
    public static final Item CREEPER_HEAD = Items.registerBlock(Blocks.CREEPER_HEAD, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.CREEPER_WALL_HEAD, Direction.DOWN, Waypoint.addHideAttribute((Item.Properties)properties)), new Item.Properties().rarity(Rarity.UNCOMMON).equippableUnswappable(EquipmentSlot.HEAD));
    public static final Item DRAGON_HEAD = Items.registerBlock(Blocks.DRAGON_HEAD, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.DRAGON_WALL_HEAD, Direction.DOWN, Waypoint.addHideAttribute((Item.Properties)properties)), new Item.Properties().rarity(Rarity.EPIC).equippableUnswappable(EquipmentSlot.HEAD));
    public static final Item PIGLIN_HEAD = Items.registerBlock(Blocks.PIGLIN_HEAD, (Block block, Item.Properties properties) -> new StandingAndWallBlockItem(block, Blocks.PIGLIN_WALL_HEAD, Direction.DOWN, Waypoint.addHideAttribute((Item.Properties)properties)), new Item.Properties().rarity(Rarity.UNCOMMON).equippableUnswappable(EquipmentSlot.HEAD));
    public static final Item NETHER_STAR = Items.registerItem("nether_star", new Item.Properties().rarity(Rarity.RARE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, (Object)true).component(DataComponents.DAMAGE_RESISTANT, (Object)new DamageResistant(DamageTypeTags.IS_EXPLOSION)));
    public static final Item PUMPKIN_PIE = Items.registerItem("pumpkin_pie", new Item.Properties().food(Foods.PUMPKIN_PIE));
    public static final Item FIREWORK_ROCKET = Items.registerItem("firework_rocket", FireworkRocketItem::new, new Item.Properties().component(DataComponents.FIREWORKS, (Object)new Fireworks(1, List.of())));
    public static final Item FIREWORK_STAR = Items.registerItem("firework_star");
    public static final Item ENCHANTED_BOOK = Items.registerItem("enchanted_book", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).component(DataComponents.STORED_ENCHANTMENTS, (Object)ItemEnchantments.EMPTY).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, (Object)true));
    public static final Item NETHER_BRICK = Items.registerItem("nether_brick");
    public static final Item RESIN_BRICK = Items.registerItem("resin_brick", new Item.Properties().trimMaterial(TrimMaterials.RESIN));
    public static final Item PRISMARINE_SHARD = Items.registerItem("prismarine_shard");
    public static final Item PRISMARINE_CRYSTALS = Items.registerItem("prismarine_crystals");
    public static final Item RABBIT = Items.registerItem("rabbit", new Item.Properties().food(Foods.RABBIT));
    public static final Item COOKED_RABBIT = Items.registerItem("cooked_rabbit", new Item.Properties().food(Foods.COOKED_RABBIT));
    public static final Item RABBIT_STEW = Items.registerItem("rabbit_stew", new Item.Properties().stacksTo(1).food(Foods.RABBIT_STEW).usingConvertsTo(BOWL));
    public static final Item RABBIT_FOOT = Items.registerItem("rabbit_foot");
    public static final Item RABBIT_HIDE = Items.registerItem("rabbit_hide");
    public static final Item ARMOR_STAND = Items.registerItem("armor_stand", ArmorStandItem::new, new Item.Properties().stacksTo(16));
    public static final Item COPPER_HORSE_ARMOR = Items.registerItem("copper_horse_armor", new Item.Properties().horseArmor(ArmorMaterials.COPPER));
    public static final Item IRON_HORSE_ARMOR = Items.registerItem("iron_horse_armor", new Item.Properties().horseArmor(ArmorMaterials.IRON));
    public static final Item GOLDEN_HORSE_ARMOR = Items.registerItem("golden_horse_armor", new Item.Properties().horseArmor(ArmorMaterials.GOLD));
    public static final Item DIAMOND_HORSE_ARMOR = Items.registerItem("diamond_horse_armor", new Item.Properties().horseArmor(ArmorMaterials.DIAMOND));
    public static final Item NETHERITE_HORSE_ARMOR = Items.registerItem("netherite_horse_armor", new Item.Properties().horseArmor(ArmorMaterials.NETHERITE).fireResistant());
    public static final Item LEATHER_HORSE_ARMOR = Items.registerItem("leather_horse_armor", new Item.Properties().horseArmor(ArmorMaterials.LEATHER));
    public static final Item LEAD = Items.registerItem("lead", LeadItem::new);
    public static final Item NAME_TAG = Items.registerItem("name_tag", NameTagItem::new);
    public static final Item COMMAND_BLOCK_MINECART = Items.registerItem("command_block_minecart", (Item.Properties properties) -> new MinecartItem(EntityType.COMMAND_BLOCK_MINECART, properties), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
    public static final Item MUTTON = Items.registerItem("mutton", new Item.Properties().food(Foods.MUTTON));
    public static final Item COOKED_MUTTON = Items.registerItem("cooked_mutton", new Item.Properties().food(Foods.COOKED_MUTTON));
    public static final Item WHITE_BANNER = Items.registerBlock(Blocks.WHITE_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.WHITE_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item ORANGE_BANNER = Items.registerBlock(Blocks.ORANGE_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.ORANGE_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item MAGENTA_BANNER = Items.registerBlock(Blocks.MAGENTA_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.MAGENTA_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item LIGHT_BLUE_BANNER = Items.registerBlock(Blocks.LIGHT_BLUE_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.LIGHT_BLUE_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item YELLOW_BANNER = Items.registerBlock(Blocks.YELLOW_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.YELLOW_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item LIME_BANNER = Items.registerBlock(Blocks.LIME_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.LIME_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item PINK_BANNER = Items.registerBlock(Blocks.PINK_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.PINK_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item GRAY_BANNER = Items.registerBlock(Blocks.GRAY_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.GRAY_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item LIGHT_GRAY_BANNER = Items.registerBlock(Blocks.LIGHT_GRAY_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.LIGHT_GRAY_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item CYAN_BANNER = Items.registerBlock(Blocks.CYAN_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.CYAN_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item PURPLE_BANNER = Items.registerBlock(Blocks.PURPLE_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.PURPLE_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item BLUE_BANNER = Items.registerBlock(Blocks.BLUE_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.BLUE_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item BROWN_BANNER = Items.registerBlock(Blocks.BROWN_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.BROWN_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item GREEN_BANNER = Items.registerBlock(Blocks.GREEN_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.GREEN_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item RED_BANNER = Items.registerBlock(Blocks.RED_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.RED_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item BLACK_BANNER = Items.registerBlock(Blocks.BLACK_BANNER, (Block block, Item.Properties properties) -> new BannerItem(block, Blocks.BLACK_WALL_BANNER, properties), new Item.Properties().stacksTo(16).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY));
    public static final Item END_CRYSTAL = Items.registerItem("end_crystal", EndCrystalItem::new, new Item.Properties().component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, (Object)true));
    public static final Item CHORUS_FRUIT = Items.registerItem("chorus_fruit", new Item.Properties().food(Foods.CHORUS_FRUIT, Consumables.CHORUS_FRUIT).useCooldown(1.0f));
    public static final Item POPPED_CHORUS_FRUIT = Items.registerItem("popped_chorus_fruit");
    public static final Item TORCHFLOWER_SEEDS = Items.registerItem("torchflower_seeds", Items.createBlockItemWithCustomItemName(Blocks.TORCHFLOWER_CROP));
    public static final Item PITCHER_POD = Items.registerItem("pitcher_pod", Items.createBlockItemWithCustomItemName(Blocks.PITCHER_CROP));
    public static final Item BEETROOT = Items.registerItem("beetroot", new Item.Properties().food(Foods.BEETROOT));
    public static final Item BEETROOT_SEEDS = Items.registerItem("beetroot_seeds", Items.createBlockItemWithCustomItemName(Blocks.BEETROOTS));
    public static final Item BEETROOT_SOUP = Items.registerItem("beetroot_soup", new Item.Properties().stacksTo(1).food(Foods.BEETROOT_SOUP).usingConvertsTo(BOWL));
    public static final Item DRAGON_BREATH = Items.registerItem("dragon_breath", new Item.Properties().craftRemainder(GLASS_BOTTLE).rarity(Rarity.UNCOMMON));
    public static final Item SPLASH_POTION = Items.registerItem("splash_potion", SplashPotionItem::new, new Item.Properties().stacksTo(1).component(DataComponents.POTION_CONTENTS, (Object)PotionContents.EMPTY));
    public static final Item SPECTRAL_ARROW = Items.registerItem("spectral_arrow", SpectralArrowItem::new);
    public static final Item TIPPED_ARROW = Items.registerItem("tipped_arrow", TippedArrowItem::new, new Item.Properties().component(DataComponents.POTION_CONTENTS, (Object)PotionContents.EMPTY).component(DataComponents.POTION_DURATION_SCALE, (Object)Float.valueOf(0.125f)));
    public static final Item LINGERING_POTION = Items.registerItem("lingering_potion", LingeringPotionItem::new, new Item.Properties().stacksTo(1).component(DataComponents.POTION_CONTENTS, (Object)PotionContents.EMPTY).component(DataComponents.POTION_DURATION_SCALE, (Object)Float.valueOf(0.25f)));
    public static final Item SHIELD = Items.registerItem("shield", ShieldItem::new, new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY).repairable(ItemTags.WOODEN_TOOL_MATERIALS).equippableUnswappable(EquipmentSlot.OFFHAND).component(DataComponents.BLOCKS_ATTACKS, (Object)new BlocksAttacks(0.25f, 1.0f, List.of(new BlocksAttacks.DamageReduction(90.0f, Optional.empty(), 0.0f, 1.0f)), new BlocksAttacks.ItemDamageFunction(3.0f, 1.0f, 1.0f), Optional.of(DamageTypeTags.BYPASSES_SHIELD), Optional.of(SoundEvents.SHIELD_BLOCK), Optional.of(SoundEvents.SHIELD_BREAK))).component(DataComponents.BREAK_SOUND, (Object)SoundEvents.SHIELD_BREAK));
    public static final Item WOODEN_SPEAR = Items.registerItem("wooden_spear", new Item.Properties().spear(ToolMaterial.WOOD, 0.65f, 0.7f, 0.75f, 5.0f, 14.0f, 10.0f, 5.1f, 15.0f, 4.6f));
    public static final Item STONE_SPEAR = Items.registerItem("stone_spear", new Item.Properties().spear(ToolMaterial.STONE, 0.75f, 0.82f, 0.7f, 4.5f, 10.0f, 9.0f, 5.1f, 13.75f, 4.6f));
    public static final Item COPPER_SPEAR = Items.registerItem("copper_spear", new Item.Properties().spear(ToolMaterial.COPPER, 0.85f, 0.82f, 0.65f, 4.0f, 9.0f, 8.25f, 5.1f, 12.5f, 4.6f));
    public static final Item IRON_SPEAR = Items.registerItem("iron_spear", new Item.Properties().spear(ToolMaterial.IRON, 0.95f, 0.95f, 0.6f, 2.5f, 8.0f, 6.75f, 5.1f, 11.25f, 4.6f));
    public static final Item GOLDEN_SPEAR = Items.registerItem("golden_spear", new Item.Properties().spear(ToolMaterial.GOLD, 0.95f, 0.7f, 0.7f, 3.5f, 10.0f, 8.5f, 5.1f, 13.75f, 4.6f));
    public static final Item DIAMOND_SPEAR = Items.registerItem("diamond_spear", new Item.Properties().spear(ToolMaterial.DIAMOND, 1.05f, 1.075f, 0.5f, 3.0f, 7.5f, 6.5f, 5.1f, 10.0f, 4.6f));
    public static final Item NETHERITE_SPEAR = Items.registerItem("netherite_spear", new Item.Properties().spear(ToolMaterial.NETHERITE, 1.15f, 1.2f, 0.4f, 2.5f, 7.0f, 5.5f, 5.1f, 8.75f, 4.6f).fireResistant());
    public static final Item TOTEM_OF_UNDYING = Items.registerItem("totem_of_undying", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).component(DataComponents.DEATH_PROTECTION, (Object)DeathProtection.TOTEM_OF_UNDYING));
    public static final Item SHULKER_SHELL = Items.registerItem("shulker_shell");
    public static final Item IRON_NUGGET = Items.registerItem("iron_nugget");
    public static final Item COPPER_NUGGET = Items.registerItem("copper_nugget");
    public static final Item KNOWLEDGE_BOOK = Items.registerItem("knowledge_book", KnowledgeBookItem::new, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).component(DataComponents.RECIPES, List.of()));
    public static final Item DEBUG_STICK = Items.registerItem("debug_stick", DebugStickItem::new, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).component(DataComponents.DEBUG_STICK_STATE, (Object)DebugStickState.EMPTY).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, (Object)true));
    public static final Item MUSIC_DISC_13 = Items.registerItem("music_disc_13", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.THIRTEEN));
    public static final Item MUSIC_DISC_CAT = Items.registerItem("music_disc_cat", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.CAT));
    public static final Item MUSIC_DISC_BLOCKS = Items.registerItem("music_disc_blocks", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.BLOCKS));
    public static final Item MUSIC_DISC_CHIRP = Items.registerItem("music_disc_chirp", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.CHIRP));
    public static final Item MUSIC_DISC_CREATOR = Items.registerItem("music_disc_creator", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(JukeboxSongs.CREATOR));
    public static final Item MUSIC_DISC_CREATOR_MUSIC_BOX = Items.registerItem("music_disc_creator_music_box", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.CREATOR_MUSIC_BOX));
    public static final Item MUSIC_DISC_FAR = Items.registerItem("music_disc_far", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.FAR));
    public static final Item MUSIC_DISC_LAVA_CHICKEN = Items.registerItem("music_disc_lava_chicken", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(JukeboxSongs.LAVA_CHICKEN));
    public static final Item MUSIC_DISC_MALL = Items.registerItem("music_disc_mall", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.MALL));
    public static final Item MUSIC_DISC_MELLOHI = Items.registerItem("music_disc_mellohi", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.MELLOHI));
    public static final Item MUSIC_DISC_STAL = Items.registerItem("music_disc_stal", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.STAL));
    public static final Item MUSIC_DISC_STRAD = Items.registerItem("music_disc_strad", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.STRAD));
    public static final Item MUSIC_DISC_WARD = Items.registerItem("music_disc_ward", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.WARD));
    public static final Item MUSIC_DISC_11 = Items.registerItem("music_disc_11", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.ELEVEN));
    public static final Item MUSIC_DISC_WAIT = Items.registerItem("music_disc_wait", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.WAIT));
    public static final Item MUSIC_DISC_OTHERSIDE = Items.registerItem("music_disc_otherside", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(JukeboxSongs.OTHERSIDE));
    public static final Item MUSIC_DISC_RELIC = Items.registerItem("music_disc_relic", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.RELIC));
    public static final Item MUSIC_DISC_5 = Items.registerItem("music_disc_5", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.FIVE));
    public static final Item MUSIC_DISC_PIGSTEP = Items.registerItem("music_disc_pigstep", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(JukeboxSongs.PIGSTEP));
    public static final Item MUSIC_DISC_PRECIPICE = Items.registerItem("music_disc_precipice", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.PRECIPICE));
    public static final Item MUSIC_DISC_TEARS = Items.registerItem("music_disc_tears", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(JukeboxSongs.TEARS));
    public static final Item DISC_FRAGMENT_5 = Items.registerItem("disc_fragment_5", DiscFragmentItem::new, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item TRIDENT = Items.registerItem("trident", TridentItem::new, new Item.Properties().rarity(Rarity.RARE).durability(250).attributes(TridentItem.createAttributes()).component(DataComponents.TOOL, (Object)TridentItem.createToolProperties()).enchantable(1).component(DataComponents.WEAPON, (Object)new Weapon(1)));
    public static final Item NAUTILUS_SHELL = Items.registerItem("nautilus_shell", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item IRON_NAUTILUS_ARMOR = Items.registerItem("iron_nautilus_armor", new Item.Properties().nautilusArmor(ArmorMaterials.IRON));
    public static final Item GOLDEN_NAUTILUS_ARMOR = Items.registerItem("golden_nautilus_armor", new Item.Properties().nautilusArmor(ArmorMaterials.GOLD));
    public static final Item DIAMOND_NAUTILUS_ARMOR = Items.registerItem("diamond_nautilus_armor", new Item.Properties().nautilusArmor(ArmorMaterials.DIAMOND));
    public static final Item NETHERITE_NAUTILUS_ARMOR = Items.registerItem("netherite_nautilus_armor", new Item.Properties().nautilusArmor(ArmorMaterials.NETHERITE).fireResistant());
    public static final Item COPPER_NAUTILUS_ARMOR = Items.registerItem("copper_nautilus_armor", new Item.Properties().nautilusArmor(ArmorMaterials.COPPER));
    public static final Item HEART_OF_THE_SEA = Items.registerItem("heart_of_the_sea", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item CROSSBOW = Items.registerItem("crossbow", CrossbowItem::new, new Item.Properties().stacksTo(1).durability(465).component(DataComponents.CHARGED_PROJECTILES, (Object)ChargedProjectiles.EMPTY).enchantable(1));
    public static final Item SUSPICIOUS_STEW = Items.registerItem("suspicious_stew", new Item.Properties().stacksTo(1).food(Foods.SUSPICIOUS_STEW).component(DataComponents.SUSPICIOUS_STEW_EFFECTS, (Object)SuspiciousStewEffects.EMPTY).usingConvertsTo(BOWL));
    public static final Item LOOM = Items.registerBlock(Blocks.LOOM);
    public static final Item FLOWER_BANNER_PATTERN = Items.registerItem("flower_banner_pattern", new Item.Properties().stacksTo(1).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_FLOWER));
    public static final Item CREEPER_BANNER_PATTERN = Items.registerItem("creeper_banner_pattern", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_CREEPER));
    public static final Item SKULL_BANNER_PATTERN = Items.registerItem("skull_banner_pattern", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_SKULL));
    public static final Item MOJANG_BANNER_PATTERN = Items.registerItem("mojang_banner_pattern", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_MOJANG));
    public static final Item GLOBE_BANNER_PATTERN = Items.registerItem("globe_banner_pattern", new Item.Properties().stacksTo(1).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_GLOBE));
    public static final Item PIGLIN_BANNER_PATTERN = Items.registerItem("piglin_banner_pattern", new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_PIGLIN));
    public static final Item FLOW_BANNER_PATTERN = Items.registerItem("flow_banner_pattern", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_FLOW));
    public static final Item GUSTER_BANNER_PATTERN = Items.registerItem("guster_banner_pattern", new Item.Properties().stacksTo(1).rarity(Rarity.RARE).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_GUSTER));
    public static final Item FIELD_MASONED_BANNER_PATTERN = Items.registerItem("field_masoned_banner_pattern", new Item.Properties().stacksTo(1).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_FIELD_MASONED));
    public static final Item BORDURE_INDENTED_BANNER_PATTERN = Items.registerItem("bordure_indented_banner_pattern", new Item.Properties().stacksTo(1).component(DataComponents.PROVIDES_BANNER_PATTERNS, (Object)BannerPatternTags.PATTERN_ITEM_BORDURE_INDENTED));
    public static final Item GOAT_HORN = Items.registerItem("goat_horn", InstrumentItem::new, new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1).component(DataComponents.INSTRUMENT, (Object)new InstrumentComponent(Instruments.PONDER_GOAT_HORN)));
    public static final Item COMPOSTER = Items.registerBlock(Blocks.COMPOSTER);
    public static final Item BARREL = Items.registerBlock(Blocks.BARREL, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item SMOKER = Items.registerBlock(Blocks.SMOKER, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item BLAST_FURNACE = Items.registerBlock(Blocks.BLAST_FURNACE, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item CARTOGRAPHY_TABLE = Items.registerBlock(Blocks.CARTOGRAPHY_TABLE);
    public static final Item FLETCHING_TABLE = Items.registerBlock(Blocks.FLETCHING_TABLE);
    public static final Item GRINDSTONE = Items.registerBlock(Blocks.GRINDSTONE);
    public static final Item SMITHING_TABLE = Items.registerBlock(Blocks.SMITHING_TABLE);
    public static final Item STONECUTTER = Items.registerBlock(Blocks.STONECUTTER);
    public static final Item BELL = Items.registerBlock(Blocks.BELL);
    public static final Item LANTERN = Items.registerBlock(Blocks.LANTERN);
    public static final Item SOUL_LANTERN = Items.registerBlock(Blocks.SOUL_LANTERN);
    public static final WeatheringCopperItems COPPER_LANTERN = WeatheringCopperItems.create((WeatheringCopperBlocks)Blocks.COPPER_LANTERN, Items::registerBlock);
    public static final Item SWEET_BERRIES = Items.registerItem("sweet_berries", Items.createBlockItemWithCustomItemName(Blocks.SWEET_BERRY_BUSH), new Item.Properties().food(Foods.SWEET_BERRIES));
    public static final Item GLOW_BERRIES = Items.registerItem("glow_berries", Items.createBlockItemWithCustomItemName(Blocks.CAVE_VINES), new Item.Properties().food(Foods.GLOW_BERRIES));
    public static final Item CAMPFIRE = Items.registerBlock(Blocks.CAMPFIRE, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item SOUL_CAMPFIRE = Items.registerBlock(Blocks.SOUL_CAMPFIRE, properties -> properties.component(DataComponents.CONTAINER, (Object)ItemContainerContents.EMPTY));
    public static final Item SHROOMLIGHT = Items.registerBlock(Blocks.SHROOMLIGHT);
    public static final Item HONEYCOMB = Items.registerItem("honeycomb", HoneycombItem::new);
    public static final Item BEE_NEST = Items.registerBlock(Blocks.BEE_NEST, new Item.Properties().component(DataComponents.BEES, (Object)Bees.EMPTY).component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)BeehiveBlock.HONEY_LEVEL, (Comparable)Integer.valueOf(0))));
    public static final Item BEEHIVE = Items.registerBlock(Blocks.BEEHIVE, new Item.Properties().component(DataComponents.BEES, (Object)Bees.EMPTY).component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)BeehiveBlock.HONEY_LEVEL, (Comparable)Integer.valueOf(0))));
    public static final Item HONEY_BOTTLE = Items.registerItem("honey_bottle", new Item.Properties().craftRemainder(GLASS_BOTTLE).food(Foods.HONEY_BOTTLE, Consumables.HONEY_BOTTLE).usingConvertsTo(GLASS_BOTTLE).stacksTo(16));
    public static final Item HONEYCOMB_BLOCK = Items.registerBlock(Blocks.HONEYCOMB_BLOCK);
    public static final Item LODESTONE = Items.registerBlock(Blocks.LODESTONE);
    public static final Item CRYING_OBSIDIAN = Items.registerBlock(Blocks.CRYING_OBSIDIAN);
    public static final Item BLACKSTONE = Items.registerBlock(Blocks.BLACKSTONE);
    public static final Item BLACKSTONE_SLAB = Items.registerBlock(Blocks.BLACKSTONE_SLAB);
    public static final Item BLACKSTONE_STAIRS = Items.registerBlock(Blocks.BLACKSTONE_STAIRS);
    public static final Item GILDED_BLACKSTONE = Items.registerBlock(Blocks.GILDED_BLACKSTONE);
    public static final Item POLISHED_BLACKSTONE = Items.registerBlock(Blocks.POLISHED_BLACKSTONE);
    public static final Item POLISHED_BLACKSTONE_SLAB = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_SLAB);
    public static final Item POLISHED_BLACKSTONE_STAIRS = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_STAIRS);
    public static final Item CHISELED_POLISHED_BLACKSTONE = Items.registerBlock(Blocks.CHISELED_POLISHED_BLACKSTONE);
    public static final Item POLISHED_BLACKSTONE_BRICKS = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICKS);
    public static final Item POLISHED_BLACKSTONE_BRICK_SLAB = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
    public static final Item POLISHED_BLACKSTONE_BRICK_STAIRS = Items.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
    public static final Item CRACKED_POLISHED_BLACKSTONE_BRICKS = Items.registerBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Item RESPAWN_ANCHOR = Items.registerBlock(Blocks.RESPAWN_ANCHOR);
    public static final Item CANDLE = Items.registerBlock(Blocks.CANDLE);
    public static final Item WHITE_CANDLE = Items.registerBlock(Blocks.WHITE_CANDLE);
    public static final Item ORANGE_CANDLE = Items.registerBlock(Blocks.ORANGE_CANDLE);
    public static final Item MAGENTA_CANDLE = Items.registerBlock(Blocks.MAGENTA_CANDLE);
    public static final Item LIGHT_BLUE_CANDLE = Items.registerBlock(Blocks.LIGHT_BLUE_CANDLE);
    public static final Item YELLOW_CANDLE = Items.registerBlock(Blocks.YELLOW_CANDLE);
    public static final Item LIME_CANDLE = Items.registerBlock(Blocks.LIME_CANDLE);
    public static final Item PINK_CANDLE = Items.registerBlock(Blocks.PINK_CANDLE);
    public static final Item GRAY_CANDLE = Items.registerBlock(Blocks.GRAY_CANDLE);
    public static final Item LIGHT_GRAY_CANDLE = Items.registerBlock(Blocks.LIGHT_GRAY_CANDLE);
    public static final Item CYAN_CANDLE = Items.registerBlock(Blocks.CYAN_CANDLE);
    public static final Item PURPLE_CANDLE = Items.registerBlock(Blocks.PURPLE_CANDLE);
    public static final Item BLUE_CANDLE = Items.registerBlock(Blocks.BLUE_CANDLE);
    public static final Item BROWN_CANDLE = Items.registerBlock(Blocks.BROWN_CANDLE);
    public static final Item GREEN_CANDLE = Items.registerBlock(Blocks.GREEN_CANDLE);
    public static final Item RED_CANDLE = Items.registerBlock(Blocks.RED_CANDLE);
    public static final Item BLACK_CANDLE = Items.registerBlock(Blocks.BLACK_CANDLE);
    public static final Item SMALL_AMETHYST_BUD = Items.registerBlock(Blocks.SMALL_AMETHYST_BUD);
    public static final Item MEDIUM_AMETHYST_BUD = Items.registerBlock(Blocks.MEDIUM_AMETHYST_BUD);
    public static final Item LARGE_AMETHYST_BUD = Items.registerBlock(Blocks.LARGE_AMETHYST_BUD);
    public static final Item AMETHYST_CLUSTER = Items.registerBlock(Blocks.AMETHYST_CLUSTER);
    public static final Item POINTED_DRIPSTONE = Items.registerBlock(Blocks.POINTED_DRIPSTONE);
    public static final Item OCHRE_FROGLIGHT = Items.registerBlock(Blocks.OCHRE_FROGLIGHT);
    public static final Item VERDANT_FROGLIGHT = Items.registerBlock(Blocks.VERDANT_FROGLIGHT);
    public static final Item PEARLESCENT_FROGLIGHT = Items.registerBlock(Blocks.PEARLESCENT_FROGLIGHT);
    public static final Item FROGSPAWN = Items.registerBlock(Blocks.FROGSPAWN, PlaceOnWaterBlockItem::new);
    public static final Item ECHO_SHARD = Items.registerItem("echo_shard", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item BRUSH = Items.registerItem("brush", BrushItem::new, new Item.Properties().durability(64));
    public static final Item NETHERITE_UPGRADE_SMITHING_TEMPLATE = Items.registerItem("netherite_upgrade_smithing_template", SmithingTemplateItem::createNetheriteUpgradeTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("sentry_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item DUNE_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("dune_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item COAST_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("coast_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item WILD_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("wild_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item WARD_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("ward_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.RARE));
    public static final Item EYE_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("eye_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.RARE));
    public static final Item VEX_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("vex_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.RARE));
    public static final Item TIDE_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("tide_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("snout_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item RIB_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("rib_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("spire_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.RARE));
    public static final Item WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("wayfinder_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("shaper_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("silence_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.EPIC));
    public static final Item RAISER_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("raiser_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item HOST_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("host_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item FLOW_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("flow_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item BOLT_ARMOR_TRIM_SMITHING_TEMPLATE = Items.registerItem("bolt_armor_trim_smithing_template", SmithingTemplateItem::createArmorTrimTemplate, new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item ANGLER_POTTERY_SHERD = Items.registerItem("angler_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item ARCHER_POTTERY_SHERD = Items.registerItem("archer_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item ARMS_UP_POTTERY_SHERD = Items.registerItem("arms_up_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item BLADE_POTTERY_SHERD = Items.registerItem("blade_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item BREWER_POTTERY_SHERD = Items.registerItem("brewer_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item BURN_POTTERY_SHERD = Items.registerItem("burn_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item DANGER_POTTERY_SHERD = Items.registerItem("danger_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item EXPLORER_POTTERY_SHERD = Items.registerItem("explorer_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item FLOW_POTTERY_SHERD = Items.registerItem("flow_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item FRIEND_POTTERY_SHERD = Items.registerItem("friend_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item GUSTER_POTTERY_SHERD = Items.registerItem("guster_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item HEART_POTTERY_SHERD = Items.registerItem("heart_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item HEARTBREAK_POTTERY_SHERD = Items.registerItem("heartbreak_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item HOWL_POTTERY_SHERD = Items.registerItem("howl_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item MINER_POTTERY_SHERD = Items.registerItem("miner_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item MOURNER_POTTERY_SHERD = Items.registerItem("mourner_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item PLENTY_POTTERY_SHERD = Items.registerItem("plenty_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item PRIZE_POTTERY_SHERD = Items.registerItem("prize_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SCRAPE_POTTERY_SHERD = Items.registerItem("scrape_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SHEAF_POTTERY_SHERD = Items.registerItem("sheaf_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SHELTER_POTTERY_SHERD = Items.registerItem("shelter_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SKULL_POTTERY_SHERD = Items.registerItem("skull_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item SNORT_POTTERY_SHERD = Items.registerItem("snort_pottery_sherd", new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final Item COPPER_GRATE = Items.registerBlock(Blocks.COPPER_GRATE);
    public static final Item EXPOSED_COPPER_GRATE = Items.registerBlock(Blocks.EXPOSED_COPPER_GRATE);
    public static final Item WEATHERED_COPPER_GRATE = Items.registerBlock(Blocks.WEATHERED_COPPER_GRATE);
    public static final Item OXIDIZED_COPPER_GRATE = Items.registerBlock(Blocks.OXIDIZED_COPPER_GRATE);
    public static final Item WAXED_COPPER_GRATE = Items.registerBlock(Blocks.WAXED_COPPER_GRATE);
    public static final Item WAXED_EXPOSED_COPPER_GRATE = Items.registerBlock(Blocks.WAXED_EXPOSED_COPPER_GRATE);
    public static final Item WAXED_WEATHERED_COPPER_GRATE = Items.registerBlock(Blocks.WAXED_WEATHERED_COPPER_GRATE);
    public static final Item WAXED_OXIDIZED_COPPER_GRATE = Items.registerBlock(Blocks.WAXED_OXIDIZED_COPPER_GRATE);
    public static final Item COPPER_BULB = Items.registerBlock(Blocks.COPPER_BULB);
    public static final Item EXPOSED_COPPER_BULB = Items.registerBlock(Blocks.EXPOSED_COPPER_BULB);
    public static final Item WEATHERED_COPPER_BULB = Items.registerBlock(Blocks.WEATHERED_COPPER_BULB);
    public static final Item OXIDIZED_COPPER_BULB = Items.registerBlock(Blocks.OXIDIZED_COPPER_BULB);
    public static final Item WAXED_COPPER_BULB = Items.registerBlock(Blocks.WAXED_COPPER_BULB);
    public static final Item WAXED_EXPOSED_COPPER_BULB = Items.registerBlock(Blocks.WAXED_EXPOSED_COPPER_BULB);
    public static final Item WAXED_WEATHERED_COPPER_BULB = Items.registerBlock(Blocks.WAXED_WEATHERED_COPPER_BULB);
    public static final Item WAXED_OXIDIZED_COPPER_BULB = Items.registerBlock(Blocks.WAXED_OXIDIZED_COPPER_BULB);
    public static final Item COPPER_CHEST = Items.registerBlock(Blocks.COPPER_CHEST);
    public static final Item EXPOSED_COPPER_CHEST = Items.registerBlock(Blocks.EXPOSED_COPPER_CHEST);
    public static final Item WEATHERED_COPPER_CHEST = Items.registerBlock(Blocks.WEATHERED_COPPER_CHEST);
    public static final Item OXIDIZED_COPPER_CHEST = Items.registerBlock(Blocks.OXIDIZED_COPPER_CHEST);
    public static final Item WAXED_COPPER_CHEST = Items.registerBlock(Blocks.WAXED_COPPER_CHEST);
    public static final Item WAXED_EXPOSED_COPPER_CHEST = Items.registerBlock(Blocks.WAXED_EXPOSED_COPPER_CHEST);
    public static final Item WAXED_WEATHERED_COPPER_CHEST = Items.registerBlock(Blocks.WAXED_WEATHERED_COPPER_CHEST);
    public static final Item WAXED_OXIDIZED_COPPER_CHEST = Items.registerBlock(Blocks.WAXED_OXIDIZED_COPPER_CHEST);
    public static final Item COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item EXPOSED_COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.EXPOSED_COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item WEATHERED_COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.WEATHERED_COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item OXIDIZED_COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.OXIDIZED_COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item WAXED_COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.WAXED_COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item WAXED_EXPOSED_COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.WAXED_EXPOSED_COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item WAXED_WEATHERED_COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.WAXED_WEATHERED_COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item WAXED_OXIDIZED_COPPER_GOLEM_STATUE = Items.registerBlock(Blocks.WAXED_OXIDIZED_COPPER_GOLEM_STATUE, new Item.Properties().component(DataComponents.BLOCK_STATE, (Object)BlockItemStateProperties.EMPTY.with((Property)CopperGolemStatueBlock.POSE, (Comparable)CopperGolemStatueBlock.Pose.STANDING)));
    public static final Item TRIAL_SPAWNER = Items.registerBlock(Blocks.TRIAL_SPAWNER);
    public static final Item TRIAL_KEY = Items.registerItem("trial_key");
    public static final Item OMINOUS_TRIAL_KEY = Items.registerItem("ominous_trial_key");
    public static final Item VAULT = Items.registerBlock(Blocks.VAULT);
    public static final Item OMINOUS_BOTTLE = Items.registerItem("ominous_bottle", new Item.Properties().rarity(Rarity.UNCOMMON).component(DataComponents.CONSUMABLE, (Object)Consumables.OMINOUS_BOTTLE).component(DataComponents.OMINOUS_BOTTLE_AMPLIFIER, (Object)new OminousBottleAmplifier(0)));

    private static Function<Item.Properties, Item> createBlockItemWithCustomItemName(Block block) {
        return properties -> new BlockItem(block, properties.useItemDescriptionPrefix());
    }

    private static ResourceKey<Item> vanillaItemId(String string) {
        return ResourceKey.create((ResourceKey)Registries.ITEM, (Identifier)Identifier.withDefaultNamespace((String)string));
    }

    private static ResourceKey<Item> blockIdToItemId(ResourceKey<Block> resourceKey) {
        return ResourceKey.create((ResourceKey)Registries.ITEM, (Identifier)resourceKey.identifier());
    }

    private static Item registerSpawnEgg(EntityType<?> entityType) {
        return Items.registerItem((ResourceKey<Item>)ResourceKey.create((ResourceKey)Registries.ITEM, (Identifier)EntityType.getKey(entityType).withSuffix("_spawn_egg")), SpawnEggItem::new, new Item.Properties().spawnEgg(entityType));
    }

    public static Item registerBlock(Block block) {
        return Items.registerBlock(block, BlockItem::new);
    }

    public static Item registerBlock(Block block, Item.Properties properties) {
        return Items.registerBlock(block, BlockItem::new, properties);
    }

    public static Item registerBlock(Block block2, UnaryOperator<Item.Properties> unaryOperator) {
        return Items.registerBlock(block2, (Block block, Item.Properties properties) -> new BlockItem(block, (Item.Properties)unaryOperator.apply((Item.Properties)properties)));
    }

    public static Item registerBlock(Block block, Block ... blocks) {
        Item item = Items.registerBlock(block);
        for (Block block2 : blocks) {
            Item.BY_BLOCK.put(block2, item);
        }
        return item;
    }

    public static Item registerBlock(Block block, BiFunction<Block, Item.Properties, Item> biFunction) {
        return Items.registerBlock(block, biFunction, new Item.Properties());
    }

    public static Item registerBlock(Block block, BiFunction<Block, Item.Properties, Item> biFunction, Item.Properties properties2) {
        return Items.registerItem(Items.blockIdToItemId((ResourceKey<Block>)block.builtInRegistryHolder().key()), (Item.Properties properties) -> (Item)biFunction.apply(block, (Item.Properties)properties), properties2.useBlockDescriptionPrefix());
    }

    public static Item registerItem(String string, Function<Item.Properties, Item> function) {
        return Items.registerItem(Items.vanillaItemId(string), function, new Item.Properties());
    }

    public static Item registerItem(String string, Function<Item.Properties, Item> function, Item.Properties properties) {
        return Items.registerItem(Items.vanillaItemId(string), function, properties);
    }

    public static Item registerItem(String string, Item.Properties properties) {
        return Items.registerItem(Items.vanillaItemId(string), Item::new, properties);
    }

    public static Item registerItem(String string) {
        return Items.registerItem(Items.vanillaItemId(string), Item::new, new Item.Properties());
    }

    public static Item registerItem(ResourceKey<Item> resourceKey, Function<Item.Properties, Item> function) {
        return Items.registerItem(resourceKey, function, new Item.Properties());
    }

    public static Item registerItem(ResourceKey<Item> resourceKey, Function<Item.Properties, Item> function, Item.Properties properties) {
        Item item = function.apply(properties.setId(resourceKey));
        if (item instanceof BlockItem) {
            BlockItem blockItem = (BlockItem)item;
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }
        return (Item)Registry.register((Registry)BuiltInRegistries.ITEM, resourceKey, (Object)item);
    }
}
