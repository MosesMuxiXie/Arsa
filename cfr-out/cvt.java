/*
 * Decompiled with CFR 0.152.
 */
public interface cvt {
    public static final amt<cvs> a = cvt.a(ctk.a);
    public static final amt<cvs> b = cvt.a(ctk.b);
    public static final amt<cvs> c = cvt.a(ctk.c);

    private static amt<cvs> a(amo $$0) {
        return amt.a(mj.bh, $$0);
    }

    public static void a(qr<cvs> $$0) {
        cvt.a($$0, a, "entity/frog/temperate_frog", dfu.a(0));
        cvt.a($$0, b, "entity/frog/warm_frog", bdo.ae);
        cvt.a($$0, c, "entity/frog/cold_frog", bdo.ad);
    }

    private static void a(qr<cvs> $$0, amt<cvs> $$1, String $$2, bef<dxo> $$3) {
        jh.c<dxo> $$4 = $$0.a(mj.aS).b($$3);
        cvt.a($$0, $$1, $$2, dfu.a(new dfn($$4), 1));
    }

    private static void a(qr<cvs> $$0, amt<cvs> $$1, String $$2, dfu $$3) {
        $$0.a($$1, new cvs(new iu.b(amo.b($$2)), $$3));
    }
}

