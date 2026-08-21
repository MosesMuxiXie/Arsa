/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class ly {
    public static final md a = ly.a("angry_villager", false);
    public static final lx<lp> b = ly.a("block", false, lp::a, lp::b);
    public static final lx<lp> c = ly.a("block_marker", true, lp::a, lp::b);
    public static final md d = ly.a("bubble", false);
    public static final md e = ly.a("cloud", false);
    public static final md f = ly.a("copper_fire_flame", false);
    public static final md g = ly.a("crit", false);
    public static final md h = ly.a("damage_indicator", true);
    public static final lx<lz> i = ly.a("dragon_breath", false, lz::a, lz::b);
    public static final md j = ly.a("dripping_lava", false);
    public static final md k = ly.a("falling_lava", false);
    public static final md l = ly.a("landing_lava", false);
    public static final md m = ly.a("dripping_water", false);
    public static final md n = ly.a("falling_water", false);
    public static final lx<ls> o = ly.a("dust", false, $$0 -> ls.c, $$0 -> ls.d);
    public static final lx<lr> p = ly.a("dust_color_transition", false, $$0 -> lr.c, $$0 -> lr.d);
    public static final lx<me> q = ly.a("effect", false, me::a, me::b);
    public static final md r = ly.a("elder_guardian", true);
    public static final md s = ly.a("enchanted_hit", false);
    public static final md t = ly.a("enchant", false);
    public static final md u = ly.a("end_rod", false);
    public static final lx<lq> v = ly.a("entity_effect", false, lq::a, lq::b);
    public static final md w = ly.a("explosion_emitter", true);
    public static final md x = ly.a("explosion", true);
    public static final md y = ly.a("gust", true);
    public static final md z = ly.a("small_gust", false);
    public static final md A = ly.a("gust_emitter_large", true);
    public static final md B = ly.a("gust_emitter_small", true);
    public static final md C = ly.a("sonic_boom", true);
    public static final lx<lp> D = ly.a("falling_dust", false, lp::a, lp::b);
    public static final md E = ly.a("firework", false);
    public static final md F = ly.a("fishing", false);
    public static final md G = ly.a("flame", false);
    public static final md H = ly.a("infested", false);
    public static final md I = ly.a("cherry_leaves", false);
    public static final md J = ly.a("pale_oak_leaves", false);
    public static final lx<lq> K = ly.a("tinted_leaves", false, lq::a, lq::b);
    public static final md L = ly.a("sculk_soul", false);
    public static final lx<mb> M = ly.a("sculk_charge", true, $$0 -> mb.a, $$0 -> mb.b);
    public static final md N = ly.a("sculk_charge_pop", true);
    public static final md O = ly.a("soul_fire_flame", false);
    public static final md P = ly.a("soul", false);
    public static final lx<lq> Q = ly.a("flash", false, lq::a, lq::b);
    public static final md R = ly.a("happy_villager", false);
    public static final md S = ly.a("composter", false);
    public static final md T = ly.a("heart", false);
    public static final lx<me> U = ly.a("instant_effect", false, me::a, me::b);
    public static final lx<lu> V = ly.a("item", false, lu::a, lu::b);
    public static final lx<mg> W = ly.a("vibration", true, $$0 -> mg.a, $$0 -> mg.b);
    public static final lx<mf> X = ly.a("trail", false, $$0 -> mf.a, $$0 -> mf.b);
    public static final md Y = ly.a("item_slime", false);
    public static final md Z = ly.a("item_cobweb", false);
    public static final md aa = ly.a("item_snowball", false);
    public static final md ab = ly.a("large_smoke", false);
    public static final md ac = ly.a("lava", false);
    public static final md ad = ly.a("mycelium", false);
    public static final md ae = ly.a("note", false);
    public static final md af = ly.a("poof", true);
    public static final md ag = ly.a("portal", false);
    public static final md ah = ly.a("rain", false);
    public static final md ai = ly.a("smoke", false);
    public static final md aj = ly.a("white_smoke", false);
    public static final md ak = ly.a("sneeze", false);
    public static final md al = ly.a("spit", true);
    public static final md am = ly.a("squid_ink", true);
    public static final md an = ly.a("sweep_attack", true);
    public static final md ao = ly.a("totem_of_undying", false);
    public static final md ap = ly.a("underwater", false);
    public static final md aq = ly.a("splash", false);
    public static final md ar = ly.a("witch", false);
    public static final md as = ly.a("bubble_pop", false);
    public static final md at = ly.a("current_down", false);
    public static final md au = ly.a("bubble_column_up", false);
    public static final md av = ly.a("nautilus", false);
    public static final md aw = ly.a("dolphin", false);
    public static final md ax = ly.a("campfire_cosy_smoke", true);
    public static final md ay = ly.a("campfire_signal_smoke", true);
    public static final md az = ly.a("dripping_honey", false);
    public static final md aA = ly.a("falling_honey", false);
    public static final md aB = ly.a("landing_honey", false);
    public static final md aC = ly.a("falling_nectar", false);
    public static final md aD = ly.a("falling_spore_blossom", false);
    public static final md aE = ly.a("ash", false);
    public static final md aF = ly.a("crimson_spore", false);
    public static final md aG = ly.a("warped_spore", false);
    public static final md aH = ly.a("spore_blossom_air", false);
    public static final md aI = ly.a("dripping_obsidian_tear", false);
    public static final md aJ = ly.a("falling_obsidian_tear", false);
    public static final md aK = ly.a("landing_obsidian_tear", false);
    public static final md aL = ly.a("reverse_portal", false);
    public static final md aM = ly.a("white_ash", false);
    public static final md aN = ly.a("small_flame", false);
    public static final md aO = ly.a("snowflake", false);
    public static final md aP = ly.a("dripping_dripstone_lava", false);
    public static final md aQ = ly.a("falling_dripstone_lava", false);
    public static final md aR = ly.a("dripping_dripstone_water", false);
    public static final md aS = ly.a("falling_dripstone_water", false);
    public static final md aT = ly.a("glow_squid_ink", true);
    public static final md aU = ly.a("glow", true);
    public static final md aV = ly.a("wax_on", true);
    public static final md aW = ly.a("wax_off", true);
    public static final md aX = ly.a("electric_spark", true);
    public static final md aY = ly.a("scrape", true);
    public static final lx<mc> aZ = ly.a("shriek", false, $$0 -> mc.a, $$0 -> mc.b);
    public static final md ba = ly.a("egg_crack", false);
    public static final md bb = ly.a("dust_plume", false);
    public static final md bc = ly.a("trial_spawner_detection", true);
    public static final md bd = ly.a("trial_spawner_detection_ominous", true);
    public static final md be = ly.a("vault_connection", true);
    public static final lx<lp> bf = ly.a("dust_pillar", false, lp::a, lp::b);
    public static final md bg = ly.a("ominous_spawning", true);
    public static final md bh = ly.a("raid_omen", false);
    public static final md bi = ly.a("trial_omen", false);
    public static final lx<lp> bj = ly.a("block_crumble", false, lp::a, lp::b);
    public static final md bk = ly.a("firefly", false);
    public static final Codec<lw> bl = mi.j.q().dispatch("type", lw::a, lx::c);
    public static final aao<xq, lw> bm = aam.a(mj.ag).b(lw::a, lx::d);

    private static md a(String $$0, boolean $$1) {
        return jq.a(mi.j, $$0, new md($$1));
    }

    private static <T extends lw> lx<T> a(String $$0, boolean $$1, final Function<lx<T>, MapCodec<T>> $$2, final Function<lx<T>, aao<? super xq, T>> $$3) {
        return jq.a(mi.j, $$0, new lx<T>($$1){

            @Override
            public MapCodec<T> c() {
                return (MapCodec)$$2.apply(this);
            }

            @Override
            public aao<? super xq, T> d() {
                return (aao)$$3.apply(this);
            }
        });
    }
}

