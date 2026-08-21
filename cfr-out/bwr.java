/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class bwr
extends Schema {
    private static final Logger c = LogUtils.getLogger();
    static final Map<String, String> d = (Map)DataFixUtils.make((Object)Maps.newHashMap(), $$0 -> {
        $$0.put("minecraft:furnace", "Furnace");
        $$0.put("minecraft:lit_furnace", "Furnace");
        $$0.put("minecraft:chest", "Chest");
        $$0.put("minecraft:trapped_chest", "Chest");
        $$0.put("minecraft:ender_chest", "EnderChest");
        $$0.put("minecraft:jukebox", "RecordPlayer");
        $$0.put("minecraft:dispenser", "Trap");
        $$0.put("minecraft:dropper", "Dropper");
        $$0.put("minecraft:sign", "Sign");
        $$0.put("minecraft:mob_spawner", "MobSpawner");
        $$0.put("minecraft:noteblock", "Music");
        $$0.put("minecraft:brewing_stand", "Cauldron");
        $$0.put("minecraft:enhanting_table", "EnchantTable");
        $$0.put("minecraft:command_block", "CommandBlock");
        $$0.put("minecraft:beacon", "Beacon");
        $$0.put("minecraft:skull", "Skull");
        $$0.put("minecraft:daylight_detector", "DLDetector");
        $$0.put("minecraft:hopper", "Hopper");
        $$0.put("minecraft:banner", "Banner");
        $$0.put("minecraft:flower_pot", "FlowerPot");
        $$0.put("minecraft:repeating_command_block", "CommandBlock");
        $$0.put("minecraft:chain_command_block", "CommandBlock");
        $$0.put("minecraft:standing_sign", "Sign");
        $$0.put("minecraft:wall_sign", "Sign");
        $$0.put("minecraft:piston_head", "Piston");
        $$0.put("minecraft:daylight_detector_inverted", "DLDetector");
        $$0.put("minecraft:unpowered_comparator", "Comparator");
        $$0.put("minecraft:powered_comparator", "Comparator");
        $$0.put("minecraft:wall_banner", "Banner");
        $$0.put("minecraft:standing_banner", "Banner");
        $$0.put("minecraft:structure_block", "Structure");
        $$0.put("minecraft:end_portal", "Airportal");
        $$0.put("minecraft:end_gateway", "EndGateway");
        $$0.put("minecraft:shield", "Banner");
    });
    public static final Map<String, String> a = Map.of("minecraft:armor_stand", "ArmorStand", "minecraft:painting", "Painting");
    protected static final Hook.HookFunction b = new Hook.HookFunction(){

        public <T> T apply(DynamicOps<T> $$0, T $$1) {
            return bwr.a(new Dynamic($$0, $$1), d, a);
        }
    };

    public bwr(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0)));
    }

    protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0)));
    }

    protected static void c(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.register((Map)$$12, "Item", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "XPOrb");
        bwr.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "ThrownEgg");
        $$0.registerSimple((Map)$$12, "LeashKnot");
        $$0.registerSimple((Map)$$12, "Painting");
        $$0.register((Map)$$12, "Arrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0)));
        $$0.register((Map)$$12, "TippedArrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0)));
        $$0.register((Map)$$12, "SpectralArrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0)));
        bwr.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Snowball");
        bwr.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "Fireball");
        bwr.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "SmallFireball");
        bwr.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "ThrownEnderpearl");
        $$0.registerSimple((Map)$$12, "EyeOfEnderSignal");
        $$0.register((Map)$$12, "ThrownPotion", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0), (String)"Potion", (TypeTemplate)bqh.x.in($$0)));
        bwr.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "ThrownExpBottle");
        $$0.register((Map)$$12, "ItemFrame", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        bwr.a($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "WitherSkull");
        $$0.registerSimple((Map)$$12, "PrimedTnt");
        $$0.register((Map)$$12, "FallingSand", $$1 -> DSL.optionalFields((String)"Block", (TypeTemplate)bqh.I.in($$0), (String)"TileEntityData", (TypeTemplate)bqh.w.in($$0)));
        $$0.register((Map)$$12, "FireworksRocketEntity", $$1 -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "Boat");
        $$0.register((Map)$$12, "Minecart", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        bwr.b($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "MinecartRideable");
        $$0.register((Map)$$12, "MinecartChest", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        bwr.b($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "MinecartFurnace");
        bwr.b($$0, (Map<String, Supplier<TypeTemplate>>)$$12, "MinecartTNT");
        $$0.register((Map)$$12, "MinecartSpawner", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (TypeTemplate)bqh.L.in($$0)));
        $$0.register((Map)$$12, "MinecartHopper", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.register((Map)$$12, "MinecartCommandBlock", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (String)"LastOutput", (TypeTemplate)bqh.D.in($$0)));
        $$0.registerSimple((Map)$$12, "ArmorStand");
        $$0.registerSimple((Map)$$12, "Creeper");
        $$0.registerSimple((Map)$$12, "Skeleton");
        $$0.registerSimple((Map)$$12, "Spider");
        $$0.registerSimple((Map)$$12, "Giant");
        $$0.registerSimple((Map)$$12, "Zombie");
        $$0.registerSimple((Map)$$12, "Slime");
        $$0.registerSimple((Map)$$12, "Ghast");
        $$0.registerSimple((Map)$$12, "PigZombie");
        $$0.register((Map)$$12, "Enderman", $$1 -> DSL.optionalFields((String)"carried", (TypeTemplate)bqh.I.in($$0)));
        $$0.registerSimple((Map)$$12, "CaveSpider");
        $$0.registerSimple((Map)$$12, "Silverfish");
        $$0.registerSimple((Map)$$12, "Blaze");
        $$0.registerSimple((Map)$$12, "LavaSlime");
        $$0.registerSimple((Map)$$12, "EnderDragon");
        $$0.registerSimple((Map)$$12, "WitherBoss");
        $$0.registerSimple((Map)$$12, "Bat");
        $$0.registerSimple((Map)$$12, "Witch");
        $$0.registerSimple((Map)$$12, "Endermite");
        $$0.registerSimple((Map)$$12, "Guardian");
        $$0.registerSimple((Map)$$12, "Pig");
        $$0.registerSimple((Map)$$12, "Sheep");
        $$0.registerSimple((Map)$$12, "Cow");
        $$0.registerSimple((Map)$$12, "Chicken");
        $$0.registerSimple((Map)$$12, "Squid");
        $$0.registerSimple((Map)$$12, "Wolf");
        $$0.registerSimple((Map)$$12, "MushroomCow");
        $$0.registerSimple((Map)$$12, "SnowMan");
        $$0.registerSimple((Map)$$12, "Ozelot");
        $$0.registerSimple((Map)$$12, "VillagerGolem");
        $$0.register((Map)$$12, "EntityHorse", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"ArmorItem", (TypeTemplate)bqh.x.in($$0), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "Rabbit");
        $$0.register((Map)$$12, "Villager", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)bqh.B.in($$0)))));
        $$0.registerSimple((Map)$$12, "EnderCrystal");
        $$0.register((Map)$$12, "AreaEffectCloud", $$1 -> DSL.optionalFields((String)"Particle", (TypeTemplate)bqh.C.in($$0)));
        $$0.registerSimple((Map)$$12, "ShulkerBullet");
        $$0.registerSimple((Map)$$12, "DragonFireball");
        $$0.registerSimple((Map)$$12, "Shulker");
        return $$12;
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        bwr.c($$0, $$12, "Furnace");
        bwr.c($$0, $$12, "Chest");
        $$0.registerSimple((Map)$$12, "EnderChest");
        $$0.register((Map)$$12, "RecordPlayer", $$1 -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)bqh.x.in($$0)));
        bwr.c($$0, $$12, "Trap");
        bwr.c($$0, $$12, "Dropper");
        $$0.register((Map)$$12, "Sign", () -> bwr.a($$0));
        $$0.register((Map)$$12, "MobSpawner", $$1 -> bqh.L.in($$0));
        $$0.registerSimple((Map)$$12, "Music");
        $$0.registerSimple((Map)$$12, "Piston");
        bwr.c($$0, $$12, "Cauldron");
        $$0.registerSimple((Map)$$12, "EnchantTable");
        $$0.registerSimple((Map)$$12, "Airportal");
        $$0.register((Map)$$12, "Control", () -> DSL.optionalFields((String)"LastOutput", (TypeTemplate)bqh.D.in($$0)));
        $$0.registerSimple((Map)$$12, "Beacon");
        $$0.register((Map)$$12, "Skull", () -> DSL.optionalFields((String)"custom_name", (TypeTemplate)bqh.D.in($$0)));
        $$0.registerSimple((Map)$$12, "DLDetector");
        bwr.c($$0, $$12, "Hopper");
        $$0.registerSimple((Map)$$12, "Comparator");
        $$0.register((Map)$$12, "FlowerPot", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)bqh.J.in($$0))));
        $$0.register((Map)$$12, "Banner", () -> DSL.optionalFields((String)"CustomName", (TypeTemplate)bqh.D.in($$0)));
        $$0.registerSimple((Map)$$12, "Structure");
        $$0.registerSimple((Map)$$12, "EndGateway");
        return $$12;
    }

    public static TypeTemplate a(Schema $$0) {
        return DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"Text1", (Object)bqh.D.in($$0)), Pair.of((Object)"Text2", (Object)bqh.D.in($$0)), Pair.of((Object)"Text3", (Object)bqh.D.in($$0)), Pair.of((Object)"Text4", (Object)bqh.D.in($$0)), Pair.of((Object)"FilteredText1", (Object)bqh.D.in($$0)), Pair.of((Object)"FilteredText2", (Object)bqh.D.in($$0)), Pair.of((Object)"FilteredText3", (Object)bqh.D.in($$0)), Pair.of((Object)"FilteredText4", (Object)bqh.D.in($$0))});
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        $$0.registerType(false, bqh.a, () -> DSL.optionalFields((String)"CustomBossEvents", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.optionalFields((String)"Name", (TypeTemplate)bqh.D.in($$0))), (TypeTemplate)bqh.b.in($$0)));
        $$0.registerType(false, bqh.b, DSL::remainder);
        $$0.registerType(false, bqh.c, () -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.registerType(false, bqh.d, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)bqh.w.in($$0), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)bqh.I.in($$0))))));
        $$0.registerType(true, bqh.w, () -> DSL.optionalFields((String)"components", (TypeTemplate)bqh.A.in($$0), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)$$2)));
        $$0.registerType(true, bqh.G, () -> DSL.optionalFields((String)"Riding", (TypeTemplate)bqh.G.in($$0), (TypeTemplate)bqh.H.in($$0)));
        $$0.registerType(false, bqh.F, () -> DSL.constType(bsh.a()));
        $$0.registerType(true, bqh.H, () -> DSL.and((TypeTemplate)bqh.E.in($$0), (TypeTemplate)DSL.optionalFields((String)"CustomName", (TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)$$1))));
        $$0.registerType(true, bqh.x, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)bqh.J.in($$0)), (String)"tag", (TypeTemplate)bwr.b($$0)), (Hook.HookFunction)b, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        $$0.registerType(false, bqh.f, DSL::remainder);
        $$0.registerType(false, bqh.I, () -> DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)DSL.constType(bsh.a())));
        $$0.registerType(false, bqh.J, () -> DSL.constType(bsh.a()));
        $$0.registerType(false, bqh.h, DSL::remainder);
        $$0.registerType(false, bqh.i, DSL::remainder);
        $$0.registerType(false, bqh.j, DSL::remainder);
        $$0.registerType(false, bqh.k, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"banners", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Name", (TypeTemplate)bqh.D.in($$0))))));
        $$0.registerType(false, bqh.l, DSL::remainder);
        $$0.registerType(false, bqh.m, DSL::remainder);
        $$0.registerType(false, bqh.n, DSL::remainder);
        $$0.registerType(false, bqh.o, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Objectives", (TypeTemplate)DSL.list((TypeTemplate)bqh.N.in($$0)), (String)"Teams", (TypeTemplate)DSL.list((TypeTemplate)bqh.O.in($$0)), (String)"PlayerScores", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"display", (TypeTemplate)bqh.D.in($$0))))));
        $$0.registerType(false, bqh.p, DSL::remainder);
        $$0.registerType(false, bqh.q, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Features", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.M.in($$0)))));
        $$0.registerType(false, bqh.r, DSL::remainder);
        $$0.registerType(false, bqh.v, DSL::remainder);
        $$0.registerType(false, bqh.M, DSL::remainder);
        $$0.registerType(false, bqh.N, DSL::remainder);
        $$0.registerType(false, bqh.O, () -> DSL.optionalFields((String)"MemberNamePrefix", (TypeTemplate)bqh.D.in($$0), (String)"MemberNameSuffix", (TypeTemplate)bqh.D.in($$0), (String)"DisplayName", (TypeTemplate)bqh.D.in($$0)));
        $$0.registerType(true, bqh.L, DSL::remainder);
        $$0.registerType(false, bqh.t, DSL::remainder);
        $$0.registerType(false, bqh.S, DSL::remainder);
        $$0.registerType(false, bqh.u, () -> DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0))));
        $$0.registerType(true, bqh.A, DSL::remainder);
        $$0.registerType(true, bqh.B, () -> DSL.optionalFields((String)"buy", (TypeTemplate)bqh.x.in($$0), (String)"buyB", (TypeTemplate)bqh.x.in($$0), (String)"sell", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerType(true, bqh.C, () -> DSL.constType((Type)DSL.string()));
        $$0.registerType(true, bqh.D, () -> DSL.constType((Type)DSL.string()));
        $$0.registerType(false, bqh.g, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)bqh.G.in($$0))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)bqh.w.in($$0))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)bqh.y.in($$0))));
        $$0.registerType(false, bqh.y, DSL::remainder);
        $$0.registerType(false, bqh.z, DSL::remainder);
        $$0.registerType(true, bqh.E, () -> DSL.optional((TypeTemplate)DSL.field((String)"Equipment", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)))));
    }

    public static TypeTemplate b(Schema $$0) {
        return DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"EntityTag", (Object)bqh.G.in($$0)), Pair.of((Object)"BlockEntityTag", (Object)bqh.w.in($$0)), Pair.of((Object)"CanDestroy", (Object)DSL.list((TypeTemplate)bqh.I.in($$0))), Pair.of((Object)"CanPlaceOn", (Object)DSL.list((TypeTemplate)bqh.I.in($$0))), Pair.of((Object)"Items", (Object)DSL.list((TypeTemplate)bqh.x.in($$0))), Pair.of((Object)"ChargedProjectiles", (Object)DSL.list((TypeTemplate)bqh.x.in($$0))), Pair.of((Object)"pages", (Object)DSL.list((TypeTemplate)bqh.D.in($$0))), Pair.of((Object)"filtered_pages", (Object)DSL.compoundList((TypeTemplate)bqh.D.in($$0))), Pair.of((Object)"display", (Object)DSL.optionalFields((String)"Name", (TypeTemplate)bqh.D.in($$0), (String)"Lore", (TypeTemplate)DSL.list((TypeTemplate)bqh.D.in($$0))))});
    }

    protected static <T> T a(Dynamic<T> $$0, Map<String, String> $$1, Map<String, String> $$2) {
        return (T)$$0.update("tag", $$3 -> $$3.update("BlockEntityTag", $$2 -> {
            Object $$3 = $$0.get("id").asString().result().map(bsh::a).orElse("minecraft:air");
            if (!"minecraft:air".equals($$3)) {
                String $$4 = (String)$$1.get($$3);
                if ($$4 == null) {
                    c.warn("Unable to resolve BlockEntity for ItemStack: {}", $$3);
                } else {
                    return $$2.set("id", $$0.createString($$4));
                }
            }
            return $$2;
        }).update("EntityTag", $$2 -> {
            if ($$2.get("id").result().isPresent()) {
                return $$2;
            }
            Object $$3 = bsh.a($$0.get("id").asString(""));
            String $$4 = (String)$$2.get($$3);
            if ($$4 != null) {
                return $$2.set("id", $$0.createString($$4));
            }
            return $$2;
        })).getValue();
    }
}

