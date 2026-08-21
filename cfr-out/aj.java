/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class aj {
    public static final Codec<am<?>> a = mi.ak.q();
    public static final cc b = aj.a("impossible", new cc());
    public static final cj c = aj.a("player_killed_entity", new cj());
    public static final cj d = aj.a("entity_killed_player", new cj());
    public static final bo e = aj.a("enter_block", new bo());
    public static final ce f = aj.a("inventory_changed", new ce());
    public static final db g = aj.a("recipe_unlocked", new db());
    public static final cv h = aj.a("player_hurt_entity", new cv());
    public static final br i = aj.a("entity_hurt_player", new br());
    public static final bm j = aj.a("enchanted_item", new bm());
    public static final bx k = aj.a("filled_bucket", new bx());
    public static final au l = aj.a("brewed_potion", new au());
    public static final ba m = aj.a("construct_beacon", new ba());
    public static final ds n = aj.a("used_ender_eye", new ds());
    public static final dm o = aj.a("summoned_entity", new dm());
    public static final at p = aj.a("bred_animals", new at());
    public static final cy q = aj.a("location", new cy());
    public static final cy r = aj.a("slept_in_bed", new cy());
    public static final be s = aj.a("cured_zombie_villager", new be());
    public static final dr t = aj.a("villager_trade", new dr());
    public static final cf u = aj.a("item_durability_changed", new cf());
    public static final ck v = aj.a("levitation", new ck());
    public static final av w = aj.a("changed_dimension", new av());
    public static final cy x = aj.a("tick", new cy());
    public static final dp y = aj.a("tame_animal", new dp());
    public static final ch z = aj.a("placed_block", new ch());
    public static final bb A = aj.a("consume_item", new bb());
    public static final bl B = aj.a("effects_changed", new bl());
    public static final dt C = aj.a("used_totem", new dt());
    public static final bk D = aj.a("nether_travel", new bk());
    public static final bz E = aj.a("fishing_rod_hooked", new bz());
    public static final aw F = aj.a("channeled_lightning", new aw());
    public static final dd G = aj.a("shot_crossbow", new dd());
    public static final dj H = aj.a("spear_mobs", new dj());
    public static final ci I = aj.a("killed_by_arrow", new ci());
    public static final cy J = aj.a("hero_of_the_village", new cy());
    public static final cy K = aj.a("voluntary_exile", new cy());
    public static final dg L = aj.a("slide_down_block", new dg());
    public static final ar M = aj.a("bee_nest_destroyed", new ar());
    public static final dq N = aj.a("target_hit", new dq());
    public static final ch O = aj.a("item_used_on_block", new ch());
    public static final bi P = aj.a("default_block_use", new bi());
    public static final aq Q = aj.a("any_block_use", new aq());
    public static final cp R = aj.a("player_generates_container_loot", new cp());
    public static final cu S = aj.a("thrown_item_picked_up_by_entity", new cu());
    public static final cu T = aj.a("thrown_item_picked_up_by_player", new cu());
    public static final cw U = aj.a("player_interacted_with_entity", new cw());
    public static final cw V = aj.a("player_sheared_equipment", new cw());
    public static final dk W = aj.a("started_riding", new dk());
    public static final cn X = aj.a("lightning_strike", new cn());
    public static final du Y = aj.a("using_item", new du());
    public static final bk Z = aj.a("fall_from_height", new bk());
    public static final bk aa = aj.a("ride_entity_in_lava", new bk());
    public static final cj ab = aj.a("kill_mob_near_sculk_catalyst", new cj());
    public static final ch ac = aj.a("allay_drop_item_on_block", new ch());
    public static final cy ad = aj.a("avoid_vibration", new cy());
    public static final da ae = aj.a("recipe_crafted", new da());
    public static final da af = aj.a("crafter_recipe_crafted", new da());
    public static final bw ag = aj.a("fall_after_explosion", new bw());

    private static <T extends am<?>> T a(String $$0, T $$1) {
        return (T)jq.a(mi.ak, $$0, $$1);
    }

    public static am<?> a(jq<am<?>> $$0) {
        return b;
    }
}

