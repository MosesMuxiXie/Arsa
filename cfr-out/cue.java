/*
 * Decompiled with CFR 0.152.
 */
public class cue {
    public static final amt<cud> a = cue.a(ctk.a);
    public static final amt<cud> b = cue.a(ctk.b);
    public static final amt<cud> c = cue.a(ctk.c);
    public static final amt<cud> d = a;

    private static amt<cud> a(amo $$0) {
        return amt.a(mj.aV, $$0);
    }

    public static void a(qr<cud> $$0) {
        cue.a($$0, a, cud.a.a, "temperate_chicken", dfu.a(0));
        cue.a($$0, b, cud.a.a, "warm_chicken", bdo.ag);
        cue.a($$0, c, cud.a.b, "cold_chicken", bdo.af);
    }

    private static void a(qr<cud> $$0, amt<cud> $$1, cud.a $$2, String $$3, bef<dxo> $$4) {
        jh.c<dxo> $$5 = $$0.a(mj.aS).b($$4);
        cue.a($$0, $$1, $$2, $$3, dfu.a(new dfn($$5), 1));
    }

    private static void a(qr<cud> $$0, amt<cud> $$1, cud.a $$2, String $$3, dfu $$4) {
        amo $$5 = amo.b("entity/chicken/" + $$3);
        $$0.a($$1, new cud(new dfo<cud.a>($$2, $$5), $$4));
    }
}

