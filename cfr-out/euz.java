/*
 * Decompiled with CFR 0.152.
 */
public class euz {
    public static final amt<fke.a> a = euz.a("temperature");
    public static final amt<fke.a> b = euz.a("vegetation");
    public static final amt<fke.a> c = euz.a("continentalness");
    public static final amt<fke.a> d = euz.a("erosion");
    public static final amt<fke.a> e = euz.a("temperature_large");
    public static final amt<fke.a> f = euz.a("vegetation_large");
    public static final amt<fke.a> g = euz.a("continentalness_large");
    public static final amt<fke.a> h = euz.a("erosion_large");
    public static final amt<fke.a> i = euz.a("ridge");
    public static final amt<fke.a> j = euz.a("offset");
    public static final amt<fke.a> k = euz.a("aquifer_barrier");
    public static final amt<fke.a> l = euz.a("aquifer_fluid_level_floodedness");
    public static final amt<fke.a> m = euz.a("aquifer_lava");
    public static final amt<fke.a> n = euz.a("aquifer_fluid_level_spread");
    public static final amt<fke.a> o = euz.a("pillar");
    public static final amt<fke.a> p = euz.a("pillar_rareness");
    public static final amt<fke.a> q = euz.a("pillar_thickness");
    public static final amt<fke.a> r = euz.a("spaghetti_2d");
    public static final amt<fke.a> s = euz.a("spaghetti_2d_elevation");
    public static final amt<fke.a> t = euz.a("spaghetti_2d_modulator");
    public static final amt<fke.a> u = euz.a("spaghetti_2d_thickness");
    public static final amt<fke.a> v = euz.a("spaghetti_3d_1");
    public static final amt<fke.a> w = euz.a("spaghetti_3d_2");
    public static final amt<fke.a> x = euz.a("spaghetti_3d_rarity");
    public static final amt<fke.a> y = euz.a("spaghetti_3d_thickness");
    public static final amt<fke.a> z = euz.a("spaghetti_roughness");
    public static final amt<fke.a> A = euz.a("spaghetti_roughness_modulator");
    public static final amt<fke.a> B = euz.a("cave_entrance");
    public static final amt<fke.a> C = euz.a("cave_layer");
    public static final amt<fke.a> D = euz.a("cave_cheese");
    public static final amt<fke.a> E = euz.a("ore_veininess");
    public static final amt<fke.a> F = euz.a("ore_vein_a");
    public static final amt<fke.a> G = euz.a("ore_vein_b");
    public static final amt<fke.a> H = euz.a("ore_gap");
    public static final amt<fke.a> I = euz.a("noodle");
    public static final amt<fke.a> J = euz.a("noodle_thickness");
    public static final amt<fke.a> K = euz.a("noodle_ridge_a");
    public static final amt<fke.a> L = euz.a("noodle_ridge_b");
    public static final amt<fke.a> M = euz.a("jagged");
    public static final amt<fke.a> N = euz.a("surface");
    public static final amt<fke.a> O = euz.a("surface_secondary");
    public static final amt<fke.a> P = euz.a("clay_bands_offset");
    public static final amt<fke.a> Q = euz.a("badlands_pillar");
    public static final amt<fke.a> R = euz.a("badlands_pillar_roof");
    public static final amt<fke.a> S = euz.a("badlands_surface");
    public static final amt<fke.a> T = euz.a("iceberg_pillar");
    public static final amt<fke.a> U = euz.a("iceberg_pillar_roof");
    public static final amt<fke.a> V = euz.a("iceberg_surface");
    public static final amt<fke.a> W = euz.a("surface_swamp");
    public static final amt<fke.a> X = euz.a("calcite");
    public static final amt<fke.a> Y = euz.a("gravel");
    public static final amt<fke.a> Z = euz.a("powder_snow");
    public static final amt<fke.a> aa = euz.a("packed_ice");
    public static final amt<fke.a> ab = euz.a("ice");
    public static final amt<fke.a> ac = euz.a("soul_sand_layer");
    public static final amt<fke.a> ad = euz.a("gravel_layer");
    public static final amt<fke.a> ae = euz.a("patch");
    public static final amt<fke.a> af = euz.a("netherrack");
    public static final amt<fke.a> ag = euz.a("nether_wart");
    public static final amt<fke.a> ah = euz.a("nether_state_selector");

    private static amt<fke.a> a(String $$0) {
        return amt.a(mj.bm, amo.b($$0));
    }

    public static fke a(je<fke.a> $$0, evd $$1, amt<fke.a> $$2) {
        jd.c<fke.a> $$3 = $$0.b($$2);
        return fke.b($$1.a($$3.e().orElseThrow().a()), (fke.a)$$3.a());
    }
}

