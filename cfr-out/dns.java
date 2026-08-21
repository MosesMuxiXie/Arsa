/*
 * Decompiled with CFR 0.152.
 */
public class dns {
    public static final jd<dnp> a = dns.a("water", new dnp("water", new cfm[0]));
    public static final jd<dnp> b = dns.a("mundane", new dnp("mundane", new cfm[0]));
    public static final jd<dnp> c = dns.a("thick", new dnp("thick", new cfm[0]));
    public static final jd<dnp> d = dns.a("awkward", new dnp("awkward", new cfm[0]));
    public static final jd<dnp> e = dns.a("night_vision", new dnp("night_vision", new cfm(cfo.p, 3600)));
    public static final jd<dnp> f = dns.a("long_night_vision", new dnp("night_vision", new cfm(cfo.p, 9600)));
    public static final jd<dnp> g = dns.a("invisibility", new dnp("invisibility", new cfm(cfo.n, 3600)));
    public static final jd<dnp> h = dns.a("long_invisibility", new dnp("invisibility", new cfm(cfo.n, 9600)));
    public static final jd<dnp> i = dns.a("leaping", new dnp("leaping", new cfm(cfo.h, 3600)));
    public static final jd<dnp> j = dns.a("long_leaping", new dnp("leaping", new cfm(cfo.h, 9600)));
    public static final jd<dnp> k = dns.a("strong_leaping", new dnp("leaping", new cfm(cfo.h, 1800, 1)));
    public static final jd<dnp> l = dns.a("fire_resistance", new dnp("fire_resistance", new cfm(cfo.l, 3600)));
    public static final jd<dnp> m = dns.a("long_fire_resistance", new dnp("fire_resistance", new cfm(cfo.l, 9600)));
    public static final jd<dnp> n = dns.a("swiftness", new dnp("swiftness", new cfm(cfo.a, 3600)));
    public static final jd<dnp> o = dns.a("long_swiftness", new dnp("swiftness", new cfm(cfo.a, 9600)));
    public static final jd<dnp> p = dns.a("strong_swiftness", new dnp("swiftness", new cfm(cfo.a, 1800, 1)));
    public static final jd<dnp> q = dns.a("slowness", new dnp("slowness", new cfm(cfo.b, 1800)));
    public static final jd<dnp> r = dns.a("long_slowness", new dnp("slowness", new cfm(cfo.b, 4800)));
    public static final jd<dnp> s = dns.a("strong_slowness", new dnp("slowness", new cfm(cfo.b, 400, 3)));
    public static final jd<dnp> t = dns.a("turtle_master", new dnp("turtle_master", new cfm(cfo.b, 400, 3), new cfm(cfo.k, 400, 2)));
    public static final jd<dnp> u = dns.a("long_turtle_master", new dnp("turtle_master", new cfm(cfo.b, 800, 3), new cfm(cfo.k, 800, 2)));
    public static final jd<dnp> v = dns.a("strong_turtle_master", new dnp("turtle_master", new cfm(cfo.b, 400, 5), new cfm(cfo.k, 400, 3)));
    public static final jd<dnp> w = dns.a("water_breathing", new dnp("water_breathing", new cfm(cfo.m, 3600)));
    public static final jd<dnp> x = dns.a("long_water_breathing", new dnp("water_breathing", new cfm(cfo.m, 9600)));
    public static final jd<dnp> y = dns.a("healing", new dnp("healing", new cfm(cfo.f, 1)));
    public static final jd<dnp> z = dns.a("strong_healing", new dnp("healing", new cfm(cfo.f, 1, 1)));
    public static final jd<dnp> A = dns.a("harming", new dnp("harming", new cfm(cfo.g, 1)));
    public static final jd<dnp> B = dns.a("strong_harming", new dnp("harming", new cfm(cfo.g, 1, 1)));
    public static final jd<dnp> C = dns.a("poison", new dnp("poison", new cfm(cfo.s, 900)));
    public static final jd<dnp> D = dns.a("long_poison", new dnp("poison", new cfm(cfo.s, 1800)));
    public static final jd<dnp> E = dns.a("strong_poison", new dnp("poison", new cfm(cfo.s, 432, 1)));
    public static final jd<dnp> F = dns.a("regeneration", new dnp("regeneration", new cfm(cfo.j, 900)));
    public static final jd<dnp> G = dns.a("long_regeneration", new dnp("regeneration", new cfm(cfo.j, 1800)));
    public static final jd<dnp> H = dns.a("strong_regeneration", new dnp("regeneration", new cfm(cfo.j, 450, 1)));
    public static final jd<dnp> I = dns.a("strength", new dnp("strength", new cfm(cfo.e, 3600)));
    public static final jd<dnp> J = dns.a("long_strength", new dnp("strength", new cfm(cfo.e, 9600)));
    public static final jd<dnp> K = dns.a("strong_strength", new dnp("strength", new cfm(cfo.e, 1800, 1)));
    public static final jd<dnp> L = dns.a("weakness", new dnp("weakness", new cfm(cfo.r, 1800)));
    public static final jd<dnp> M = dns.a("long_weakness", new dnp("weakness", new cfm(cfo.r, 4800)));
    public static final jd<dnp> N = dns.a("luck", new dnp("luck", new cfm(cfo.z, 6000)));
    public static final jd<dnp> O = dns.a("slow_falling", new dnp("slow_falling", new cfm(cfo.B, 1800)));
    public static final jd<dnp> P = dns.a("long_slow_falling", new dnp("slow_falling", new cfm(cfo.B, 4800)));
    public static final jd<dnp> Q = dns.a("wind_charged", new dnp("wind_charged", new cfm(cfo.J, 3600)));
    public static final jd<dnp> R = dns.a("weaving", new dnp("weaving", new cfm(cfo.K, 3600)));
    public static final jd<dnp> S = dns.a("oozing", new dnp("oozing", new cfm(cfo.L, 3600)));
    public static final jd<dnp> T = dns.a("infested", new dnp("infested", new cfm(cfo.M, 3600)));

    private static jd<dnp> a(String $$0, dnp $$1) {
        return jq.b(mi.i, amo.b($$0), $$1);
    }

    public static jd<dnp> a(jq<dnp> $$0) {
        return a;
    }
}

