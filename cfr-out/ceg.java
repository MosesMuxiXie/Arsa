/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public interface ceg {
    public static final cea<Integer> a = ceg.a("visual/fog_color", ((cea.a)((Object)cea.a(cdx.e))).a(0).c().a());
    public static final cea<Float> b = ceg.a("visual/fog_start_distance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(0.0f)).c().a());
    public static final cea<Float> c = ceg.a("visual/fog_end_distance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(1024.0f)).a(cdv.b).c().a());
    public static final cea<Float> d = ceg.a("visual/sky_fog_end_distance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(512.0f)).a(cdv.b).c().a());
    public static final cea<Float> e = ceg.a("visual/cloud_fog_end_distance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(2048.0f)).a(cdv.b).c().a());
    public static final cea<Integer> f = ceg.a("visual/water_fog_color", ((cea.a)((Object)cea.a(cdx.e))).a(-16448205).c().a());
    public static final cea<Float> g = ceg.a("visual/water_fog_start_distance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(-8.0f)).c().a());
    public static final cea<Float> h = ceg.a("visual/water_fog_end_distance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(96.0f)).a(cdv.b).c().a());
    public static final cea<Integer> i = ceg.a("visual/sky_color", ((cea.a)((Object)cea.a(cdx.e))).a(0).c().a());
    public static final cea<Integer> j = ceg.a("visual/sunrise_sunset_color", ((cea.a)((Object)cea.a(cdx.f))).a(0).c().a());
    public static final cea<Integer> k = ceg.a("visual/cloud_color", ((cea.a)((Object)cea.a(cdx.f))).a(0).c().a());
    public static final cea<Float> l = ceg.a("visual/cloud_height", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(192.33f)).c().a());
    public static final cea<Float> m = ceg.a("visual/sun_angle", ((cea.a)((Object)cea.a(cdx.d))).a(Float.valueOf(0.0f)).c().a());
    public static final cea<Float> n = ceg.a("visual/moon_angle", ((cea.a)((Object)cea.a(cdx.d))).a(Float.valueOf(0.0f)).c().a());
    public static final cea<Float> o = ceg.a("visual/star_angle", ((cea.a)((Object)cea.a(cdx.d))).a(Float.valueOf(0.0f)).c().a());
    public static final cea<dwy> p = ceg.a("visual/moon_phase", ((cea.a)((Object)cea.a(cdx.g))).a(dwy.a).a());
    public static final cea<Float> q = ceg.a("visual/star_brightness", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(0.0f)).a(cdv.a).c().a());
    public static final cea<Integer> r = ceg.a("visual/sky_light_color", ((cea.a)((Object)cea.a(cdx.e))).a(-1).c().a());
    public static final cea<Float> s = ceg.a("visual/sky_light_factor", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(1.0f)).a(cdv.a).c().a());
    public static final cea<lw> t = ceg.a("visual/default_dripstone_particle", ((cea.a)((Object)cea.a(cdx.j))).a(ly.aR).a());
    public static final cea<List<cdt>> u = ceg.a("visual/ambient_particles", ((cea.a)((Object)cea.a(cdx.k))).a(List.of()).a());
    public static final cea<cdy> v = ceg.a("audio/background_music", ((cea.a)((Object)cea.a(cdx.l))).a(cdy.a).a());
    public static final cea<Float> w = ceg.a("audio/music_volume", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(1.0f)).a(cdv.a).a());
    public static final cea<cdu> x = ceg.a("audio/ambient_sounds", ((cea.a)((Object)cea.a(cdx.m))).a(cdu.a).a());
    public static final cea<Boolean> y = ceg.a("audio/firefly_bush_sounds", ((cea.a)((Object)cea.a(cdx.a))).a(false).a());
    public static final cea<Float> z = ceg.a("gameplay/sky_light_level", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(15.0f)).a(cdv.a(0.0f, 15.0f)).b().a());
    public static final cea<Boolean> A = ceg.a("gameplay/can_start_raid", ((cea.a)((Object)cea.a(cdx.a))).a(true));
    public static final cea<Boolean> B = ceg.a("gameplay/water_evaporates", ((cea.a)((Object)cea.a(cdx.a))).a(false).a());
    public static final cea<cdz> C = ceg.a("gameplay/bed_rule", ((cea.a)((Object)cea.a(cdx.i))).a(cdz.a));
    public static final cea<Boolean> D = ceg.a("gameplay/respawn_anchor_works", ((cea.a)((Object)cea.a(cdx.a))).a(false));
    public static final cea<Boolean> E = ceg.a("gameplay/nether_portal_spawns_piglin", ((cea.a)((Object)cea.a(cdx.a))).a(false));
    public static final cea<Boolean> F = ceg.a("gameplay/fast_lava", ((cea.a)((Object)cea.a(cdx.a))).a(false).b().a());
    public static final cea<Boolean> G = ceg.a("gameplay/increased_fire_burnout", ((cea.a)((Object)cea.a(cdx.a))).a(false));
    public static final cea<bhp> H = ceg.a("gameplay/eyeblossom_open", ((cea.a)((Object)cea.a(cdx.b))).a(bhp.c));
    public static final cea<Float> I = ceg.a("gameplay/turtle_egg_hatch_chance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(0.0f)).a(cdv.a));
    public static final cea<Boolean> J = ceg.a("gameplay/piglins_zombify", ((cea.a)((Object)cea.a(cdx.a))).a(true).a());
    public static final cea<Boolean> K = ceg.a("gameplay/snow_golem_melts", ((cea.a)((Object)cea.a(cdx.a))).a(false));
    public static final cea<Boolean> L = ceg.a("gameplay/creaking_active", ((cea.a)((Object)cea.a(cdx.a))).a(false).a());
    public static final cea<Float> M = ceg.a("gameplay/surface_slime_spawn_chance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(0.0f)).a(cdv.a));
    public static final cea<Float> N = ceg.a("gameplay/cat_waking_up_gift_chance", ((cea.a)((Object)cea.a(cdx.c))).a(Float.valueOf(0.0f)).a(cdv.a));
    public static final cea<Boolean> O = ceg.a("gameplay/bees_stay_in_hive", ((cea.a)((Object)cea.a(cdx.a))).a(false));
    public static final cea<Boolean> P = ceg.a("gameplay/monsters_burn", ((cea.a)((Object)cea.a(cdx.a))).a(false));
    public static final cea<Boolean> Q = ceg.a("gameplay/can_pillager_patrol_spawn", ((cea.a)((Object)cea.a(cdx.a))).a(true));
    public static final cea<dfl> R = ceg.a("gameplay/villager_activity", ((cea.a)((Object)cea.a(cdx.h))).a(dfl.b));
    public static final cea<dfl> S = ceg.a("gameplay/baby_villager_activity", ((cea.a)((Object)cea.a(cdx.h))).a(dfl.b));
    public static final Codec<cea<?>> T = mi.aN.q();

    public static cea<?> a(jq<cea<?>> $$0) {
        return D;
    }

    private static <Value> cea<Value> a(String $$0, cea.a<Value> $$1) {
        cea<Value> $$2 = $$1.d();
        jq.a(mi.aN, amo.b($$0), $$2);
        return $$2;
    }
}

