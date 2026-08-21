/*
 * Decompiled with CFR 0.152.
 */
public class cwt {
    public static final amt<cws> a = cwt.a(ctk.a);
    public static final amt<cws> b = cwt.a(ctk.b);
    public static final amt<cws> c = a;

    private static amt<cws> a(amo $$0) {
        return amt.a(mj.aW, $$0);
    }

    public static void a(qr<cws> $$0) {
        cwt.a($$0, a, cws.a.a, "zombie_nautilus", dfu.a(0));
        cwt.a($$0, b, cws.a.b, "zombie_nautilus_coral", bdo.ap);
    }

    private static void a(qr<cws> $$0, amt<cws> $$1, cws.a $$2, String $$3, bef<dxo> $$4) {
        jh.c<dxo> $$5 = $$0.a(mj.aS).b($$4);
        cwt.a($$0, $$1, $$2, $$3, dfu.a(new dfn($$5), 1));
    }

    private static void a(qr<cws> $$0, amt<cws> $$1, cws.a $$2, String $$3, dfu $$4) {
        amo $$5 = amo.b("entity/nautilus/" + $$3);
        $$0.a($$1, new cws(new dfo<cws.a>($$2, $$5), $$4));
    }
}

