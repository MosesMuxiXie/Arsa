/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class sb {
    public static final amt<fes> a = sh.a("seagrass_warm");
    public static final amt<fes> b = sh.a("seagrass_normal");
    public static final amt<fes> c = sh.a("seagrass_cold");
    public static final amt<fes> d = sh.a("seagrass_river");
    public static final amt<fes> e = sh.a("seagrass_swamp");
    public static final amt<fes> f = sh.a("seagrass_deep_warm");
    public static final amt<fes> g = sh.a("seagrass_deep");
    public static final amt<fes> h = sh.a("seagrass_deep_cold");
    public static final amt<fes> i = sh.a("sea_pickle");
    public static final amt<fes> j = sh.a("kelp_cold");
    public static final amt<fes> k = sh.a("kelp_warm");
    public static final amt<fes> l = sh.a("warm_ocean_vegetation");

    private static List<fev> a(int $$0) {
        return List.of(fep.a(), sh.c, fek.a($$0), feg.a());
    }

    public static void a(qr<fes> $$0) {
        je<exi<?, ?>> $$1 = $$0.a(mj.aY);
        jd.c<exi<?, ?>> $$2 = $$1.b(rp.a);
        jd.c<exi<?, ?>> $$3 = $$1.b(rp.b);
        jd.c<exi<?, ?>> $$4 = $$1.b(rp.c);
        jd.c<exi<?, ?>> $$5 = $$1.b(rp.d);
        jd.c<exi<?, ?>> $$6 = $$1.b(rp.e);
        jd.c<exi<?, ?>> $$7 = $$1.b(rp.f);
        jd.c<exi<?, ?>> $$8 = $$1.b(rp.g);
        sh.a($$0, a, $$2, sb.a(80));
        sh.a($$0, b, $$2, sb.a(48));
        sh.a($$0, c, $$2, sb.a(32));
        sh.a($$0, d, $$3, sb.a(48));
        sh.a($$0, e, $$4, sb.a(64));
        sh.a($$0, f, $$5, sb.a(80));
        sh.a($$0, g, $$5, sb.a(48));
        sh.a($$0, h, $$5, sb.a(40));
        sh.a($$0, i, $$6, fey.a(16), fep.a(), sh.c, feg.a());
        sh.a($$0, j, $$7, feq.a(120, 80.0, 0.0), fep.a(), sh.c, feg.a());
        sh.a($$0, k, $$7, feq.a(80, 80.0, 0.0), fep.a(), sh.c, feg.a());
        sh.a($$0, l, $$8, feq.a(20, 400.0, 0.0), fep.a(), sh.c, feg.a());
    }
}

