/*
 * Decompiled with CFR 0.152.
 */
public class cfo {
    private static final int O = 22;
    public static final jd<cfk> a = cfo.a("speed", new cfk(cfl.a, 3402751).a(cis.x, amo.b("effect.speed"), 0.2f, ciq.a.c));
    public static final jd<cfk> b = cfo.a("slowness", new cfk(cfl.b, 9154528).a(cis.x, amo.b("effect.slowness"), -0.15f, ciq.a.c));
    public static final jd<cfk> c = cfo.a("haste", new cfk(cfl.a, 14270531).a(cis.f, amo.b("effect.haste"), 0.1f, ciq.a.c));
    public static final jd<cfk> d = cfo.a("mining_fatigue", new cfk(cfl.b, 4866583).a(cis.f, amo.b("effect.mining_fatigue"), -0.1f, ciq.a.c));
    public static final jd<cfk> e = cfo.a("strength", new cfk(cfl.a, 16762624).a(cis.d, amo.b("effect.strength"), 3.0, ciq.a.a));
    public static final jd<cfk> f = cfo.a("instant_health", new cfg(cfl.a, 16262179, false));
    public static final jd<cfk> g = cfo.a("instant_damage", new cfg(cfl.b, 11101546, true));
    public static final jd<cfk> h = cfo.a("jump_boost", new cfk(cfl.a, 16646020).a(cis.z, amo.b("effect.jump_boost"), 1.0, ciq.a.a));
    public static final jd<cfk> i = cfo.a("nausea", new cfk(cfl.b, 5578058).a(150, 20, 60));
    public static final jd<cfk> j = cfo.a("regeneration", new cfs(cfl.a, 13458603));
    public static final jd<cfk> k = cfo.a("resistance", new cfk(cfl.a, 9520880));
    public static final jd<cfk> l = cfo.a("fire_resistance", new cfk(cfl.a, 0xFF9900));
    public static final jd<cfk> m = cfo.a("water_breathing", new cfk(cfl.a, 10017472));
    public static final jd<cfk> n = cfo.a("invisibility", new cfk(cfl.a, 0xF6F6F6).a(cis.I, amo.b("effect.waypoint_transmit_range_hide"), -1.0, ciq.a.c));
    public static final jd<cfk> o = cfo.a("blindness", new cfk(cfl.b, 2039587));
    public static final jd<cfk> p = cfo.a("night_vision", new cfk(cfl.a, 12779366));
    public static final jd<cfk> q = cfo.a("hunger", new cfh(cfl.b, 5797459));
    public static final jd<cfk> r = cfo.a("weakness", new cfk(cfl.b, 0x484D48).a(cis.d, amo.b("effect.weakness"), -4.0, ciq.a.a));
    public static final jd<cfk> s = cfo.a("poison", new cfq(cfl.b, 8889187));
    public static final jd<cfk> t = cfo.a("wither", new cfw(cfl.b, 7561558));
    public static final jd<cfk> u = cfo.a("health_boost", new cfk(cfl.a, 16284963).a(cis.u, amo.b("effect.health_boost"), 4.0, ciq.a.a));
    public static final jd<cfk> v = cfo.a("absorption", new cfe(cfl.a, 0x2552A5).a(cis.t, amo.b("effect.absorption"), 4.0, ciq.a.a));
    public static final jd<cfk> w = cfo.a("saturation", new cft(cfl.a, 16262179));
    public static final jd<cfk> x = cfo.a("glowing", new cfk(cfl.c, 9740385));
    public static final jd<cfk> y = cfo.a("levitation", new cfk(cfl.b, 0xCEFFFF));
    public static final jd<cfk> z = cfo.a("luck", new cfk(cfl.a, 5882118).a(cis.s, amo.b("effect.luck"), 1.0, ciq.a.a));
    public static final jd<cfk> A = cfo.a("unluck", new cfk(cfl.b, 12624973).a(cis.s, amo.b("effect.unluck"), -1.0, ciq.a.a));
    public static final jd<cfk> B = cfo.a("slow_falling", new cfk(cfl.a, 15978425));
    public static final jd<cfk> C = cfo.a("conduit_power", new cfk(cfl.a, 1950417));
    public static final jd<cfk> D = cfo.a("dolphins_grace", new cfk(cfl.a, 8954814));
    public static final jd<cfk> E = cfo.a("bad_omen", new cff(cfl.c, 745784).a(bda.Hr));
    public static final jd<cfk> F = cfo.a("hero_of_the_village", new cfk(cfl.a, 0x44FF44));
    public static final jd<cfk> G = cfo.a("darkness", new cfk(cfl.b, 2696993).a(22));
    public static final jd<cfk> H = cfo.a("trial_omen", new cfk(cfl.c, 0x16A6A6, ly.bi).a(bda.Hs));
    public static final jd<cfk> I = cfo.a("raid_omen", new cfr(cfl.c, 14565464, ly.bh).a(bda.Ht));
    public static final jd<cfk> J = cfo.a("wind_charged", new cfv(cfl.b, 12438015));
    public static final jd<cfk> K = cfo.a("weaving", new cfu(cfl.b, 7891290, $$0 -> bgj.b($$0, 2, 3)));
    public static final jd<cfk> L = cfo.a("oozing", new cfp(cfl.b, 10092451, $$0 -> 2));
    public static final jd<cfk> M = cfo.a("infested", new cfi(cfl.b, 9214860, 0.1f, $$0 -> bgj.b($$0, 1, 2)));
    public static final jd<cfk> N = cfo.a("breath_of_the_nautilus", new cfk(cfl.a, 65518));

    private static jd<cfk> a(String $$0, cfk $$1) {
        return jq.b(mi.d, amo.b($$0), $$1);
    }

    public static jd<cfk> a(jq<cfk> $$0) {
        return a;
    }
}

