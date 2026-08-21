/*
 * Decompiled with CFR 0.152.
 */
public class cxy {
    public static final amt<cxx> a = cxy.a("pale");
    public static final amt<cxx> b = cxy.a("spotted");
    public static final amt<cxx> c = cxy.a("snowy");
    public static final amt<cxx> d = cxy.a("black");
    public static final amt<cxx> e = cxy.a("ashen");
    public static final amt<cxx> f = cxy.a("rusty");
    public static final amt<cxx> g = cxy.a("woods");
    public static final amt<cxx> h = cxy.a("chestnut");
    public static final amt<cxx> i = cxy.a("striped");
    public static final amt<cxx> j = a;

    private static amt<cxx> a(String $$0) {
        return amt.a(mj.bB, amo.b($$0));
    }

    private static void a(qr<cxx> $$0, amt<cxx> $$1, String $$2, amt<dxo> $$3) {
        cxy.a($$0, $$1, $$2, cxy.a(jh.a($$0.a(mj.aS).b($$3))));
    }

    private static void a(qr<cxx> $$0, amt<cxx> $$1, String $$2, bef<dxo> $$3) {
        cxy.a($$0, $$1, $$2, cxy.a($$0.a(mj.aS).b($$3)));
    }

    private static dfu a(jh<dxo> $$0) {
        return dfu.a(new dfn($$0), 1);
    }

    private static void a(qr<cxx> $$0, amt<cxx> $$1, String $$2, dfu $$3) {
        amo $$4 = amo.b("entity/wolf/" + $$2);
        amo $$5 = amo.b("entity/wolf/" + $$2 + "_tame");
        amo $$6 = amo.b("entity/wolf/" + $$2 + "_angry");
        $$0.a($$1, new cxx(new cxx.a(new iu.b($$4), new iu.b($$5), new iu.b($$6)), $$3));
    }

    public static void a(qr<cxx> $$0) {
        cxy.a($$0, a, "wolf", dfu.a(0));
        cxy.a($$0, b, "wolf_spotted", bdo.k);
        cxy.a($$0, c, "wolf_snowy", dxv.G);
        cxy.a($$0, d, "wolf_black", dxv.o);
        cxy.a($$0, e, "wolf_ashen", dxv.r);
        cxy.a($$0, f, "wolf_rusty", bdo.i);
        cxy.a($$0, g, "wolf_woods", dxv.i);
        cxy.a($$0, h, "wolf_chestnut", dxv.p);
        cxy.a($$0, i, "wolf_striped", bdo.f);
    }
}

