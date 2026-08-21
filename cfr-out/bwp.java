/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class bwp
extends bsh {
    static final Map<String, String> c = ImmutableMap.builder().put((Object)"minecraft:armor_stand", (Object)"minecraft:armor_stand").put((Object)"minecraft:painting", (Object)"minecraft:painting").put((Object)"minecraft:armadillo_spawn_egg", (Object)"minecraft:armadillo").put((Object)"minecraft:allay_spawn_egg", (Object)"minecraft:allay").put((Object)"minecraft:axolotl_spawn_egg", (Object)"minecraft:axolotl").put((Object)"minecraft:bat_spawn_egg", (Object)"minecraft:bat").put((Object)"minecraft:bee_spawn_egg", (Object)"minecraft:bee").put((Object)"minecraft:blaze_spawn_egg", (Object)"minecraft:blaze").put((Object)"minecraft:bogged_spawn_egg", (Object)"minecraft:bogged").put((Object)"minecraft:breeze_spawn_egg", (Object)"minecraft:breeze").put((Object)"minecraft:cat_spawn_egg", (Object)"minecraft:cat").put((Object)"minecraft:camel_spawn_egg", (Object)"minecraft:camel").put((Object)"minecraft:cave_spider_spawn_egg", (Object)"minecraft:cave_spider").put((Object)"minecraft:chicken_spawn_egg", (Object)"minecraft:chicken").put((Object)"minecraft:cod_spawn_egg", (Object)"minecraft:cod").put((Object)"minecraft:cow_spawn_egg", (Object)"minecraft:cow").put((Object)"minecraft:creeper_spawn_egg", (Object)"minecraft:creeper").put((Object)"minecraft:dolphin_spawn_egg", (Object)"minecraft:dolphin").put((Object)"minecraft:donkey_spawn_egg", (Object)"minecraft:donkey").put((Object)"minecraft:drowned_spawn_egg", (Object)"minecraft:drowned").put((Object)"minecraft:elder_guardian_spawn_egg", (Object)"minecraft:elder_guardian").put((Object)"minecraft:ender_dragon_spawn_egg", (Object)"minecraft:ender_dragon").put((Object)"minecraft:enderman_spawn_egg", (Object)"minecraft:enderman").put((Object)"minecraft:endermite_spawn_egg", (Object)"minecraft:endermite").put((Object)"minecraft:evoker_spawn_egg", (Object)"minecraft:evoker").put((Object)"minecraft:fox_spawn_egg", (Object)"minecraft:fox").put((Object)"minecraft:frog_spawn_egg", (Object)"minecraft:frog").put((Object)"minecraft:ghast_spawn_egg", (Object)"minecraft:ghast").put((Object)"minecraft:glow_squid_spawn_egg", (Object)"minecraft:glow_squid").put((Object)"minecraft:goat_spawn_egg", (Object)"minecraft:goat").put((Object)"minecraft:guardian_spawn_egg", (Object)"minecraft:guardian").put((Object)"minecraft:hoglin_spawn_egg", (Object)"minecraft:hoglin").put((Object)"minecraft:horse_spawn_egg", (Object)"minecraft:horse").put((Object)"minecraft:husk_spawn_egg", (Object)"minecraft:husk").put((Object)"minecraft:iron_golem_spawn_egg", (Object)"minecraft:iron_golem").put((Object)"minecraft:llama_spawn_egg", (Object)"minecraft:llama").put((Object)"minecraft:magma_cube_spawn_egg", (Object)"minecraft:magma_cube").put((Object)"minecraft:mooshroom_spawn_egg", (Object)"minecraft:mooshroom").put((Object)"minecraft:mule_spawn_egg", (Object)"minecraft:mule").put((Object)"minecraft:ocelot_spawn_egg", (Object)"minecraft:ocelot").put((Object)"minecraft:panda_spawn_egg", (Object)"minecraft:panda").put((Object)"minecraft:parrot_spawn_egg", (Object)"minecraft:parrot").put((Object)"minecraft:phantom_spawn_egg", (Object)"minecraft:phantom").put((Object)"minecraft:pig_spawn_egg", (Object)"minecraft:pig").put((Object)"minecraft:piglin_spawn_egg", (Object)"minecraft:piglin").put((Object)"minecraft:piglin_brute_spawn_egg", (Object)"minecraft:piglin_brute").put((Object)"minecraft:pillager_spawn_egg", (Object)"minecraft:pillager").put((Object)"minecraft:polar_bear_spawn_egg", (Object)"minecraft:polar_bear").put((Object)"minecraft:pufferfish_spawn_egg", (Object)"minecraft:pufferfish").put((Object)"minecraft:rabbit_spawn_egg", (Object)"minecraft:rabbit").put((Object)"minecraft:ravager_spawn_egg", (Object)"minecraft:ravager").put((Object)"minecraft:salmon_spawn_egg", (Object)"minecraft:salmon").put((Object)"minecraft:sheep_spawn_egg", (Object)"minecraft:sheep").put((Object)"minecraft:shulker_spawn_egg", (Object)"minecraft:shulker").put((Object)"minecraft:silverfish_spawn_egg", (Object)"minecraft:silverfish").put((Object)"minecraft:skeleton_spawn_egg", (Object)"minecraft:skeleton").put((Object)"minecraft:skeleton_horse_spawn_egg", (Object)"minecraft:skeleton_horse").put((Object)"minecraft:slime_spawn_egg", (Object)"minecraft:slime").put((Object)"minecraft:sniffer_spawn_egg", (Object)"minecraft:sniffer").put((Object)"minecraft:snow_golem_spawn_egg", (Object)"minecraft:snow_golem").put((Object)"minecraft:spider_spawn_egg", (Object)"minecraft:spider").put((Object)"minecraft:squid_spawn_egg", (Object)"minecraft:squid").put((Object)"minecraft:stray_spawn_egg", (Object)"minecraft:stray").put((Object)"minecraft:strider_spawn_egg", (Object)"minecraft:strider").put((Object)"minecraft:tadpole_spawn_egg", (Object)"minecraft:tadpole").put((Object)"minecraft:trader_llama_spawn_egg", (Object)"minecraft:trader_llama").put((Object)"minecraft:tropical_fish_spawn_egg", (Object)"minecraft:tropical_fish").put((Object)"minecraft:turtle_spawn_egg", (Object)"minecraft:turtle").put((Object)"minecraft:vex_spawn_egg", (Object)"minecraft:vex").put((Object)"minecraft:villager_spawn_egg", (Object)"minecraft:villager").put((Object)"minecraft:vindicator_spawn_egg", (Object)"minecraft:vindicator").put((Object)"minecraft:wandering_trader_spawn_egg", (Object)"minecraft:wandering_trader").put((Object)"minecraft:warden_spawn_egg", (Object)"minecraft:warden").put((Object)"minecraft:witch_spawn_egg", (Object)"minecraft:witch").put((Object)"minecraft:wither_spawn_egg", (Object)"minecraft:wither").put((Object)"minecraft:wither_skeleton_spawn_egg", (Object)"minecraft:wither_skeleton").put((Object)"minecraft:wolf_spawn_egg", (Object)"minecraft:wolf").put((Object)"minecraft:zoglin_spawn_egg", (Object)"minecraft:zoglin").put((Object)"minecraft:zombie_spawn_egg", (Object)"minecraft:zombie").put((Object)"minecraft:zombie_horse_spawn_egg", (Object)"minecraft:zombie_horse").put((Object)"minecraft:zombie_villager_spawn_egg", (Object)"minecraft:zombie_villager").put((Object)"minecraft:zombified_piglin_spawn_egg", (Object)"minecraft:zombified_piglin").put((Object)"minecraft:item_frame", (Object)"minecraft:item_frame").put((Object)"minecraft:boat", (Object)"minecraft:oak_boat").put((Object)"minecraft:oak_boat", (Object)"minecraft:oak_boat").put((Object)"minecraft:oak_chest_boat", (Object)"minecraft:oak_chest_boat").put((Object)"minecraft:spruce_boat", (Object)"minecraft:spruce_boat").put((Object)"minecraft:spruce_chest_boat", (Object)"minecraft:spruce_chest_boat").put((Object)"minecraft:birch_boat", (Object)"minecraft:birch_boat").put((Object)"minecraft:birch_chest_boat", (Object)"minecraft:birch_chest_boat").put((Object)"minecraft:jungle_boat", (Object)"minecraft:jungle_boat").put((Object)"minecraft:jungle_chest_boat", (Object)"minecraft:jungle_chest_boat").put((Object)"minecraft:acacia_boat", (Object)"minecraft:acacia_boat").put((Object)"minecraft:acacia_chest_boat", (Object)"minecraft:acacia_chest_boat").put((Object)"minecraft:cherry_boat", (Object)"minecraft:cherry_boat").put((Object)"minecraft:cherry_chest_boat", (Object)"minecraft:cherry_chest_boat").put((Object)"minecraft:dark_oak_boat", (Object)"minecraft:dark_oak_boat").put((Object)"minecraft:dark_oak_chest_boat", (Object)"minecraft:dark_oak_chest_boat").put((Object)"minecraft:mangrove_boat", (Object)"minecraft:mangrove_boat").put((Object)"minecraft:mangrove_chest_boat", (Object)"minecraft:mangrove_chest_boat").put((Object)"minecraft:bamboo_raft", (Object)"minecraft:bamboo_raft").put((Object)"minecraft:bamboo_chest_raft", (Object)"minecraft:bamboo_chest_raft").put((Object)"minecraft:minecart", (Object)"minecraft:minecart").put((Object)"minecraft:chest_minecart", (Object)"minecraft:chest_minecart").put((Object)"minecraft:furnace_minecart", (Object)"minecraft:furnace_minecart").put((Object)"minecraft:tnt_minecart", (Object)"minecraft:tnt_minecart").put((Object)"minecraft:hopper_minecart", (Object)"minecraft:hopper_minecart").build();
    protected static final Hook.HookFunction b = new Hook.HookFunction(){

        public <T> T apply(DynamicOps<T> $$0, T $$1) {
            return bwr.a(new Dynamic($$0, $$1), bwo.a, c);
        }
    };

    public bwp(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.registerSimple($$1, $$2);
    }

    protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0)));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.register((Map)$$12, "minecraft:area_effect_cloud", $$1 -> DSL.optionalFields((String)"Particle", (TypeTemplate)bqh.C.in($$0)));
        bwp.a($$0, $$12, "minecraft:armor_stand");
        $$0.register((Map)$$12, "minecraft:arrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0)));
        bwp.a($$0, $$12, "minecraft:bat");
        bwp.a($$0, $$12, "minecraft:blaze");
        $$0.registerSimple((Map)$$12, "minecraft:boat");
        bwp.a($$0, $$12, "minecraft:cave_spider");
        $$0.register((Map)$$12, "minecraft:chest_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        bwp.a($$0, $$12, "minecraft:chicken");
        $$0.register((Map)$$12, "minecraft:commandblock_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (String)"LastOutput", (TypeTemplate)bqh.D.in($$0)));
        bwp.a($$0, $$12, "minecraft:cow");
        bwp.a($$0, $$12, "minecraft:creeper");
        $$0.register((Map)$$12, "minecraft:donkey", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:dragon_fireball");
        bwp.b($$0, $$12, "minecraft:egg");
        bwp.a($$0, $$12, "minecraft:elder_guardian");
        $$0.registerSimple((Map)$$12, "minecraft:ender_crystal");
        bwp.a($$0, $$12, "minecraft:ender_dragon");
        $$0.register((Map)$$12, "minecraft:enderman", $$1 -> DSL.optionalFields((String)"carried", (TypeTemplate)bqh.I.in($$0)));
        bwp.a($$0, $$12, "minecraft:endermite");
        bwp.b($$0, $$12, "minecraft:ender_pearl");
        $$0.registerSimple((Map)$$12, "minecraft:eye_of_ender_signal");
        $$0.register((Map)$$12, "minecraft:falling_block", $$1 -> DSL.optionalFields((String)"Block", (TypeTemplate)bqh.I.in($$0), (String)"TileEntityData", (TypeTemplate)bqh.w.in($$0)));
        bwp.b($$0, $$12, "minecraft:fireball");
        $$0.register((Map)$$12, "minecraft:fireworks_rocket", $$1 -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.register((Map)$$12, "minecraft:furnace_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0)));
        bwp.a($$0, $$12, "minecraft:ghast");
        bwp.a($$0, $$12, "minecraft:giant");
        bwp.a($$0, $$12, "minecraft:guardian");
        $$0.register((Map)$$12, "minecraft:hopper_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.register((Map)$$12, "minecraft:horse", $$1 -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)bqh.x.in($$0), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bwp.a($$0, $$12, "minecraft:husk");
        $$0.register((Map)$$12, "minecraft:item", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        $$0.register((Map)$$12, "minecraft:item_frame", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:leash_knot");
        bwp.a($$0, $$12, "minecraft:magma_cube");
        $$0.register((Map)$$12, "minecraft:minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0)));
        bwp.a($$0, $$12, "minecraft:mooshroom");
        $$0.register((Map)$$12, "minecraft:mule", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bwp.a($$0, $$12, "minecraft:ocelot");
        $$0.registerSimple((Map)$$12, "minecraft:painting");
        bwp.a($$0, $$12, "minecraft:parrot");
        bwp.a($$0, $$12, "minecraft:pig");
        bwp.a($$0, $$12, "minecraft:polar_bear");
        $$0.register((Map)$$12, "minecraft:potion", $$1 -> DSL.optionalFields((String)"Potion", (TypeTemplate)bqh.x.in($$0), (String)"inTile", (TypeTemplate)bqh.I.in($$0)));
        bwp.a($$0, $$12, "minecraft:rabbit");
        bwp.a($$0, $$12, "minecraft:sheep");
        bwp.a($$0, $$12, "minecraft:shulker");
        $$0.registerSimple((Map)$$12, "minecraft:shulker_bullet");
        bwp.a($$0, $$12, "minecraft:silverfish");
        bwp.a($$0, $$12, "minecraft:skeleton");
        $$0.register((Map)$$12, "minecraft:skeleton_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bwp.a($$0, $$12, "minecraft:slime");
        bwp.b($$0, $$12, "minecraft:small_fireball");
        bwp.b($$0, $$12, "minecraft:snowball");
        bwp.a($$0, $$12, "minecraft:snowman");
        $$0.register((Map)$$12, "minecraft:spawner_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0), (TypeTemplate)bqh.L.in($$0)));
        $$0.register((Map)$$12, "minecraft:spectral_arrow", $$1 -> DSL.optionalFields((String)"inTile", (TypeTemplate)bqh.I.in($$0)));
        bwp.a($$0, $$12, "minecraft:spider");
        bwp.a($$0, $$12, "minecraft:squid");
        bwp.a($$0, $$12, "minecraft:stray");
        $$0.registerSimple((Map)$$12, "minecraft:tnt");
        $$0.register((Map)$$12, "minecraft:tnt_minecart", $$1 -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)bqh.I.in($$0)));
        $$0.register((Map)$$12, "minecraft:villager", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)bqh.B.in($$0)))));
        bwp.a($$0, $$12, "minecraft:villager_golem");
        bwp.a($$0, $$12, "minecraft:witch");
        bwp.a($$0, $$12, "minecraft:wither");
        bwp.a($$0, $$12, "minecraft:wither_skeleton");
        bwp.b($$0, $$12, "minecraft:wither_skull");
        bwp.a($$0, $$12, "minecraft:wolf");
        bwp.b($$0, $$12, "minecraft:xp_bottle");
        $$0.registerSimple((Map)$$12, "minecraft:xp_orb");
        bwp.a($$0, $$12, "minecraft:zombie");
        $$0.register((Map)$$12, "minecraft:zombie_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bwp.a($$0, $$12, "minecraft:zombie_pigman");
        $$0.register((Map)$$12, "minecraft:zombie_villager", $$1 -> DSL.optionalFields((String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)bqh.B.in($$0)))));
        $$0.registerSimple((Map)$$12, "minecraft:evocation_fangs");
        bwp.a($$0, $$12, "minecraft:evocation_illager");
        bwp.a($$0, $$12, "minecraft:illusion_illager");
        $$0.register((Map)$$12, "minecraft:llama", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0), (String)"DecorItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:llama_spit");
        bwp.a($$0, $$12, "minecraft:vex");
        bwp.a($$0, $$12, "minecraft:vindication_illager");
        return $$12;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        super.registerTypes($$0, $$1, $$2);
        $$0.registerType(true, bqh.H, () -> DSL.and((TypeTemplate)bqh.E.in($$0), (TypeTemplate)DSL.optionalFields((String)"CustomName", (TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", bwp.a(), (Map)$$1))));
        $$0.registerType(true, bqh.x, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)bqh.J.in($$0), (String)"tag", (TypeTemplate)bwr.b($$0)), (Hook.HookFunction)b, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
    }
}

