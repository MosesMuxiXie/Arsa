/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class bsy
extends bsh {
    public bsy(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.registerSimple($$1, $$2);
    }

    protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
        $$0.register($$1, $$2, () -> bsx.a($$0));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        $$0.register((Map)$$12, "minecraft:area_effect_cloud", $$1 -> DSL.optionalFields((String)"Particle", (TypeTemplate)bqh.C.in($$0)));
        bsy.a($$0, $$12, "minecraft:armor_stand");
        $$0.register((Map)$$12, "minecraft:arrow", $$1 -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)bqh.y.in($$0)));
        bsy.a($$0, $$12, "minecraft:bat");
        bsy.a($$0, $$12, "minecraft:blaze");
        $$0.registerSimple((Map)$$12, "minecraft:boat");
        bsy.a($$0, $$12, "minecraft:cave_spider");
        $$0.register((Map)$$12, "minecraft:chest_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        bsy.a($$0, $$12, "minecraft:chicken");
        $$0.register((Map)$$12, "minecraft:commandblock_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (String)"LastOutput", (TypeTemplate)bqh.D.in($$0)));
        bsy.a($$0, $$12, "minecraft:cow");
        bsy.a($$0, $$12, "minecraft:creeper");
        $$0.register((Map)$$12, "minecraft:donkey", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:dragon_fireball");
        $$0.registerSimple((Map)$$12, "minecraft:egg");
        bsy.a($$0, $$12, "minecraft:elder_guardian");
        $$0.registerSimple((Map)$$12, "minecraft:ender_crystal");
        bsy.a($$0, $$12, "minecraft:ender_dragon");
        $$0.register((Map)$$12, "minecraft:enderman", $$1 -> DSL.optionalFields((String)"carriedBlockState", (TypeTemplate)bqh.y.in($$0)));
        bsy.a($$0, $$12, "minecraft:endermite");
        $$0.registerSimple((Map)$$12, "minecraft:ender_pearl");
        $$0.registerSimple((Map)$$12, "minecraft:evocation_fangs");
        bsy.a($$0, $$12, "minecraft:evocation_illager");
        $$0.registerSimple((Map)$$12, "minecraft:eye_of_ender_signal");
        $$0.register((Map)$$12, "minecraft:falling_block", $$1 -> DSL.optionalFields((String)"BlockState", (TypeTemplate)bqh.y.in($$0), (String)"TileEntityData", (TypeTemplate)bqh.w.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:fireball");
        $$0.register((Map)$$12, "minecraft:fireworks_rocket", $$1 -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.register((Map)$$12, "minecraft:furnace_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0)));
        bsy.a($$0, $$12, "minecraft:ghast");
        bsy.a($$0, $$12, "minecraft:giant");
        bsy.a($$0, $$12, "minecraft:guardian");
        $$0.register((Map)$$12, "minecraft:hopper_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.register((Map)$$12, "minecraft:horse", $$1 -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)bqh.x.in($$0), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bsy.a($$0, $$12, "minecraft:husk");
        bsy.a($$0, $$12, "minecraft:illusion_illager");
        $$0.register((Map)$$12, "minecraft:item", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        $$0.register((Map)$$12, "minecraft:item_frame", $$1 -> DSL.optionalFields((String)"Item", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:leash_knot");
        $$0.register((Map)$$12, "minecraft:llama", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0), (String)"DecorItem", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:llama_spit");
        bsy.a($$0, $$12, "minecraft:magma_cube");
        $$0.register((Map)$$12, "minecraft:minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0)));
        bsy.a($$0, $$12, "minecraft:mooshroom");
        $$0.register((Map)$$12, "minecraft:mule", $$1 -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bsy.a($$0, $$12, "minecraft:ocelot");
        $$0.registerSimple((Map)$$12, "minecraft:painting");
        bsy.a($$0, $$12, "minecraft:parrot");
        bsy.a($$0, $$12, "minecraft:pig");
        bsy.a($$0, $$12, "minecraft:polar_bear");
        $$0.register((Map)$$12, "minecraft:potion", $$1 -> DSL.optionalFields((String)"Potion", (TypeTemplate)bqh.x.in($$0)));
        bsy.a($$0, $$12, "minecraft:rabbit");
        bsy.a($$0, $$12, "minecraft:sheep");
        bsy.a($$0, $$12, "minecraft:shulker");
        $$0.registerSimple((Map)$$12, "minecraft:shulker_bullet");
        bsy.a($$0, $$12, "minecraft:silverfish");
        bsy.a($$0, $$12, "minecraft:skeleton");
        $$0.register((Map)$$12, "minecraft:skeleton_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bsy.a($$0, $$12, "minecraft:slime");
        $$0.registerSimple((Map)$$12, "minecraft:small_fireball");
        $$0.registerSimple((Map)$$12, "minecraft:snowball");
        bsy.a($$0, $$12, "minecraft:snowman");
        $$0.register((Map)$$12, "minecraft:spawner_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0), (TypeTemplate)bqh.L.in($$0)));
        $$0.register((Map)$$12, "minecraft:spectral_arrow", $$1 -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)bqh.y.in($$0)));
        bsy.a($$0, $$12, "minecraft:spider");
        bsy.a($$0, $$12, "minecraft:squid");
        bsy.a($$0, $$12, "minecraft:stray");
        $$0.registerSimple((Map)$$12, "minecraft:tnt");
        $$0.register((Map)$$12, "minecraft:tnt_minecart", $$1 -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)bqh.y.in($$0)));
        bsy.a($$0, $$12, "minecraft:vex");
        $$0.register((Map)$$12, "minecraft:villager", $$1 -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)bqh.B.in($$0)))));
        bsy.a($$0, $$12, "minecraft:villager_golem");
        bsy.a($$0, $$12, "minecraft:vindication_illager");
        bsy.a($$0, $$12, "minecraft:witch");
        bsy.a($$0, $$12, "minecraft:wither");
        bsy.a($$0, $$12, "minecraft:wither_skeleton");
        $$0.registerSimple((Map)$$12, "minecraft:wither_skull");
        bsy.a($$0, $$12, "minecraft:wolf");
        $$0.registerSimple((Map)$$12, "minecraft:xp_bottle");
        $$0.registerSimple((Map)$$12, "minecraft:xp_orb");
        bsy.a($$0, $$12, "minecraft:zombie");
        $$0.register((Map)$$12, "minecraft:zombie_horse", $$1 -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)bqh.x.in($$0)));
        bsy.a($$0, $$12, "minecraft:zombie_pigman");
        $$0.register((Map)$$12, "minecraft:zombie_villager", $$1 -> DSL.optionalFields((String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)bqh.B.in($$0)))));
        return $$12;
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
        HashMap $$12 = Maps.newHashMap();
        bsy.b($$0, $$12, "minecraft:furnace");
        bsy.b($$0, $$12, "minecraft:chest");
        bsy.b($$0, $$12, "minecraft:trapped_chest");
        $$0.registerSimple((Map)$$12, "minecraft:ender_chest");
        $$0.register((Map)$$12, "minecraft:jukebox", $$1 -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)bqh.x.in($$0)));
        bsy.b($$0, $$12, "minecraft:dispenser");
        bsy.b($$0, $$12, "minecraft:dropper");
        $$0.register((Map)$$12, "minecraft:sign", () -> bwr.a($$0));
        $$0.register((Map)$$12, "minecraft:mob_spawner", $$1 -> bqh.L.in($$0));
        $$0.register((Map)$$12, "minecraft:piston", $$1 -> DSL.optionalFields((String)"blockState", (TypeTemplate)bqh.y.in($$0)));
        bsy.b($$0, $$12, "minecraft:brewing_stand");
        $$0.register((Map)$$12, "minecraft:enchanting_table", () -> bsx.b($$0));
        $$0.registerSimple((Map)$$12, "minecraft:end_portal");
        $$0.register((Map)$$12, "minecraft:beacon", () -> bsx.b($$0));
        $$0.register((Map)$$12, "minecraft:skull", () -> DSL.optionalFields((String)"custom_name", (TypeTemplate)bqh.D.in($$0)));
        $$0.registerSimple((Map)$$12, "minecraft:daylight_detector");
        bsy.b($$0, $$12, "minecraft:hopper");
        $$0.registerSimple((Map)$$12, "minecraft:comparator");
        $$0.register((Map)$$12, "minecraft:banner", () -> bsx.b($$0));
        $$0.registerSimple((Map)$$12, "minecraft:structure_block");
        $$0.registerSimple((Map)$$12, "minecraft:end_gateway");
        $$0.register((Map)$$12, "minecraft:command_block", () -> DSL.optionalFields((String)"LastOutput", (TypeTemplate)bqh.D.in($$0)));
        bsy.b($$0, $$12, "minecraft:shulker_box");
        $$0.registerSimple((Map)$$12, "minecraft:bed");
        return $$12;
    }

    public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
        $$0.registerType(false, bqh.a, () -> DSL.optionalFields((String)"CustomBossEvents", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.optionalFields((String)"Name", (TypeTemplate)bqh.D.in($$0))), (TypeTemplate)bqh.b.in($$0)));
        $$0.registerType(false, bqh.b, DSL::remainder);
        $$0.registerType(false, bqh.P, () -> DSL.constType(bsy.a()));
        $$0.registerType(false, bqh.c, () -> DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"RootVehicle", (Object)DSL.optionalFields((String)"Entity", (TypeTemplate)bqh.G.in($$0))), Pair.of((Object)"ender_pearls", (Object)DSL.list((TypeTemplate)bqh.G.in($$0))), Pair.of((Object)"Inventory", (Object)DSL.list((TypeTemplate)bqh.x.in($$0))), Pair.of((Object)"EnderItems", (Object)DSL.list((TypeTemplate)bqh.x.in($$0))), Pair.of((Object)"ShoulderEntityLeft", (Object)bqh.G.in($$0)), Pair.of((Object)"ShoulderEntityRight", (Object)bqh.G.in($$0)), Pair.of((Object)"recipeBook", (Object)DSL.optionalFields((String)"recipes", (TypeTemplate)DSL.list((TypeTemplate)bqh.P.in($$0)), (String)"toBeDisplayed", (TypeTemplate)DSL.list((TypeTemplate)bqh.P.in($$0))))}));
        $$0.registerType(false, bqh.d, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)bqh.w.in($$0), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)bqh.I.in($$0))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Palette", (TypeTemplate)DSL.list((TypeTemplate)bqh.y.in($$0)))))));
        $$0.registerType(true, bqh.w, () -> DSL.optionalFields((String)"components", (TypeTemplate)bqh.A.in($$0), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", bsy.a(), (Map)$$2)));
        $$0.registerType(true, bqh.G, () -> DSL.optionalFields((String)"Passengers", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0)), (TypeTemplate)bqh.H.in($$0)));
        $$0.registerType(true, bqh.H, () -> DSL.and((TypeTemplate)bqh.E.in($$0), (TypeTemplate)DSL.optionalFields((String)"CustomName", (TypeTemplate)bqh.D.in($$0), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", bsy.a(), (Map)$$1))));
        $$0.registerType(true, bqh.x, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)bqh.J.in($$0), (String)"tag", (TypeTemplate)bwr.b($$0)), (Hook.HookFunction)bwp.b, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        $$0.registerType(false, bqh.e, () -> DSL.compoundList((TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0))));
        $$0.registerType(false, bqh.f, DSL::remainder);
        $$0.registerType(false, bqh.g, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)bqh.G.in($$0))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)bqh.w.in($$0))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)bqh.y.in($$0))));
        $$0.registerType(false, bqh.I, () -> DSL.constType(bsy.a()));
        $$0.registerType(false, bqh.J, () -> DSL.constType(bsy.a()));
        $$0.registerType(false, bqh.y, DSL::remainder);
        $$0.registerType(false, bqh.z, DSL::remainder);
        Supplier<TypeTemplate> $$3 = () -> DSL.compoundList((TypeTemplate)bqh.J.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType()));
        $$0.registerType(false, bqh.h, () -> DSL.optionalFields((String)"stats", (TypeTemplate)DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"minecraft:mined", (Object)DSL.compoundList((TypeTemplate)bqh.I.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:crafted", (Object)((TypeTemplate)$$3.get())), Pair.of((Object)"minecraft:used", (Object)((TypeTemplate)$$3.get())), Pair.of((Object)"minecraft:broken", (Object)((TypeTemplate)$$3.get())), Pair.of((Object)"minecraft:picked_up", (Object)((TypeTemplate)$$3.get())), Pair.of((Object)"minecraft:dropped", (Object)((TypeTemplate)$$3.get())), Pair.of((Object)"minecraft:killed", (Object)DSL.compoundList((TypeTemplate)bqh.F.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:killed_by", (Object)DSL.compoundList((TypeTemplate)bqh.F.in($$0), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:custom", (Object)DSL.compoundList((TypeTemplate)DSL.constType(bsy.a()), (TypeTemplate)DSL.constType((Type)DSL.intType())))})));
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
        Map<String, Supplier<TypeTemplate>> $$4 = bsw.a($$0);
        $$0.registerType(false, bqh.N, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"CriteriaType", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)$$4), (String)"DisplayName", (TypeTemplate)bqh.D.in($$0)), (Hook.HookFunction)bsw.c, (Hook.HookFunction)bsw.d));
        $$0.registerType(false, bqh.O, () -> DSL.optionalFields((String)"MemberNamePrefix", (TypeTemplate)bqh.D.in($$0), (String)"MemberNameSuffix", (TypeTemplate)bqh.D.in($$0), (String)"DisplayName", (TypeTemplate)bqh.D.in($$0)));
        $$0.registerType(true, bqh.L, () -> DSL.optionalFields((String)"SpawnPotentials", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"Entity", (TypeTemplate)bqh.G.in($$0))), (String)"SpawnData", (TypeTemplate)bqh.G.in($$0)));
        $$0.registerType(false, bqh.s, () -> DSL.optionalFields((String)"minecraft:adventure/adventuring_time", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.Q.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_a_mob", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.F.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_all_mobs", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.F.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:husbandry/bred_all_animals", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)bqh.F.in($$0), (TypeTemplate)DSL.constType((Type)DSL.string())))));
        $$0.registerType(false, bqh.Q, () -> DSL.constType(bsy.a()));
        $$0.registerType(false, bqh.F, () -> DSL.constType(bsy.a()));
        $$0.registerType(false, bqh.t, DSL::remainder);
        $$0.registerType(false, bqh.S, DSL::remainder);
        $$0.registerType(false, bqh.u, () -> DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)bqh.G.in($$0))));
        $$0.registerType(true, bqh.A, DSL::remainder);
        $$0.registerType(true, bqh.B, () -> DSL.optionalFields((String)"buy", (TypeTemplate)bqh.x.in($$0), (String)"buyB", (TypeTemplate)bqh.x.in($$0), (String)"sell", (TypeTemplate)bqh.x.in($$0)));
        $$0.registerType(true, bqh.C, () -> DSL.constType((Type)DSL.string()));
        $$0.registerType(true, bqh.D, () -> DSL.constType((Type)DSL.string()));
        $$0.registerType(true, bqh.E, () -> DSL.and((TypeTemplate)DSL.optional((TypeTemplate)DSL.field((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)))), (TypeTemplate[])new TypeTemplate[]{DSL.optional((TypeTemplate)DSL.field((String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)bqh.x.in($$0)))), DSL.optional((TypeTemplate)DSL.field((String)"body_armor_item", (TypeTemplate)bqh.x.in($$0))), DSL.optional((TypeTemplate)DSL.field((String)"saddle", (TypeTemplate)bqh.x.in($$0)))}));
    }
}

