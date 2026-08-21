/*
 * Decompiled with CFR 0.152.
 */
public class cxd {
    public static final amt<cxc> a = cxd.a(ctk.a);
    public static final amt<cxc> b = cxd.a(ctk.b);
    public static final amt<cxc> c = cxd.a(ctk.c);
    public static final amt<cxc> d = a;

    private static amt<cxc> a(amo $$0) {
        return amt.a(mj.bo, $$0);
    }

    public static void a(qr<cxc> $$0) {
        cxd.a($$0, a, cxc.a.a, "temperate_pig", dfu.a(0));
        cxd.a($$0, b, cxc.a.a, "warm_pig", bdo.ag);
        cxd.a($$0, c, cxc.a.b, "cold_pig", bdo.af);
    }

    private static void a(qr<cxc> $$0, amt<cxc> $$1, cxc.a $$2, String $$3, bef<dxo> $$4) {
        jh.c<dxo> $$5 = $$0.a(mj.aS).b($$4);
        cxd.a($$0, $$1, $$2, $$3, dfu.a(new dfn($$5), 1));
    }

    private static void a(qr<cxc> $$0, amt<cxc> $$1, cxc.a $$2, String $$3, dfu $$4) {
        amo $$5 = amo.b("entity/pig/" + $$3);
        $$0.a($$1, new cxc(new dfo<cxc.a>($$2, $$5), $$4));
    }
}

