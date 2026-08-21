/*
 * Decompiled with CFR 0.152.
 */
public class fms {
    private static final int J = 12741452;
    public static final jd<fmr> a = fms.a("player", "player", false, true);
    public static final jd<fmr> b = fms.a("frame", "frame", true, true);
    public static final jd<fmr> c = fms.a("red_marker", "red_marker", false, true);
    public static final jd<fmr> d = fms.a("blue_marker", "blue_marker", false, true);
    public static final jd<fmr> e = fms.a("target_x", "target_x", true, false);
    public static final jd<fmr> f = fms.a("target_point", "target_point", true, false);
    public static final jd<fmr> g = fms.a("player_off_map", "player_off_map", false, true);
    public static final jd<fmr> h = fms.a("player_off_limits", "player_off_limits", false, true);
    public static final jd<fmr> i = fms.a("mansion", "woodland_mansion", true, 5393476, false, true);
    public static final jd<fmr> j = fms.a("monument", "ocean_monument", true, 3830373, false, true);
    public static final jd<fmr> k = fms.a("banner_white", "white_banner", true, true);
    public static final jd<fmr> l = fms.a("banner_orange", "orange_banner", true, true);
    public static final jd<fmr> m = fms.a("banner_magenta", "magenta_banner", true, true);
    public static final jd<fmr> n = fms.a("banner_light_blue", "light_blue_banner", true, true);
    public static final jd<fmr> o = fms.a("banner_yellow", "yellow_banner", true, true);
    public static final jd<fmr> p = fms.a("banner_lime", "lime_banner", true, true);
    public static final jd<fmr> q = fms.a("banner_pink", "pink_banner", true, true);
    public static final jd<fmr> r = fms.a("banner_gray", "gray_banner", true, true);
    public static final jd<fmr> s = fms.a("banner_light_gray", "light_gray_banner", true, true);
    public static final jd<fmr> t = fms.a("banner_cyan", "cyan_banner", true, true);
    public static final jd<fmr> u = fms.a("banner_purple", "purple_banner", true, true);
    public static final jd<fmr> v = fms.a("banner_blue", "blue_banner", true, true);
    public static final jd<fmr> w = fms.a("banner_brown", "brown_banner", true, true);
    public static final jd<fmr> x = fms.a("banner_green", "green_banner", true, true);
    public static final jd<fmr> y = fms.a("banner_red", "red_banner", true, true);
    public static final jd<fmr> z = fms.a("banner_black", "black_banner", true, true);
    public static final jd<fmr> A = fms.a("red_x", "red_x", true, false);
    public static final jd<fmr> B = fms.a("village_desert", "desert_village", true, flf.w.ak, false, true);
    public static final jd<fmr> C = fms.a("village_plains", "plains_village", true, flf.w.ak, false, true);
    public static final jd<fmr> D = fms.a("village_savanna", "savanna_village", true, flf.w.ak, false, true);
    public static final jd<fmr> E = fms.a("village_snowy", "snowy_village", true, flf.w.ak, false, true);
    public static final jd<fmr> F = fms.a("village_taiga", "taiga_village", true, flf.w.ak, false, true);
    public static final jd<fmr> G = fms.a("jungle_temple", "jungle_temple", true, flf.w.ak, false, true);
    public static final jd<fmr> H = fms.a("swamp_hut", "swamp_hut", true, flf.w.ak, false, true);
    public static final jd<fmr> I = fms.a("trial_chambers", "trial_chambers", true, 12741452, false, true);

    public static jd<fmr> a(jq<fmr> $$0) {
        return a;
    }

    private static jd<fmr> a(String $$0, String $$1, boolean $$2, boolean $$3) {
        return fms.a($$0, $$1, $$2, -1, $$3, false);
    }

    private static jd<fmr> a(String $$0, String $$1, boolean $$2, int $$3, boolean $$4, boolean $$5) {
        amt<fmr> $$6 = amt.a(mj.Z, amo.b($$0));
        fmr $$7 = new fmr(amo.b($$1), $$2, $$3, $$5, $$4);
        return jq.b(mi.aq, $$6, $$7);
    }
}

