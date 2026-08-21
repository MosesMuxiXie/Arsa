/*
 * Decompiled with CFR 0.152.
 */
public class cuj {
    public static final amt<cui> a = cuj.a(ctk.a);
    public static final amt<cui> b = cuj.a(ctk.b);
    public static final amt<cui> c = cuj.a(ctk.c);
    public static final amt<cui> d = a;

    private static amt<cui> a(amo $$0) {
        return amt.a(mj.aZ, $$0);
    }

    public static void a(qr<cui> $$0) {
        cuj.a($$0, a, cui.a.a, "temperate_cow", dfu.a(0));
        cuj.a($$0, b, cui.a.c, "warm_cow", bdo.ag);
        cuj.a($$0, c, cui.a.b, "cold_cow", bdo.af);
    }

    private static void a(qr<cui> $$0, amt<cui> $$1, cui.a $$2, String $$3, bef<dxo> $$4) {
        jh.c<dxo> $$5 = $$0.a(mj.aS).b($$4);
        cuj.a($$0, $$1, $$2, $$3, dfu.a(new dfn($$5), 1));
    }

    private static void a(qr<cui> $$0, amt<cui> $$1, cui.a $$2, String $$3, dfu $$4) {
        amo $$5 = amo.b("entity/cow/" + $$3);
        $$0.a($$1, new cui(new dfo<cui.a>($$2, $$5), $$4));
    }
}

