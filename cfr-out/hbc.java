/*
 * Decompiled with CFR 0.152.
 */
public class hbc
extends gzm<iey> {
    public static final hdp b = hdp.scaling(0.5f);
    public static final hdp c = hdp.scaling(1.5f);
    private static final String d = "body_front";
    private static final String e = "body_back";
    private static final float f = -7.2f;
    private final hdg g;

    public hbc(hdg $$0) {
        super($$0);
        this.g = $$0.b(e);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        int $$2 = 20;
        hdq $$3 = $$1.a(d, hdl.c().a(0, 0).a(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f), hdi.a(0.0f, 20.0f, -7.2f));
        hdq $$4 = $$1.a(e, hdl.c().a(0, 13).a(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f), hdi.a(0.0f, 20.0f, 0.8000002f));
        $$1.a("head", hdl.c().a(22, 0).a(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f), hdi.a(0.0f, 20.0f, -7.2f));
        $$4.a("back_fin", hdl.c().a(20, 10).a(0.0f, -2.5f, 0.0f, 0.0f, 5.0f, 6.0f), hdi.a(0.0f, 0.0f, 8.0f));
        $$3.a("top_front_fin", hdl.c().a(2, 1).a(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 3.0f), hdi.a(0.0f, -4.5f, 5.0f));
        $$4.a("top_back_fin", hdl.c().a(0, 2).a(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 4.0f), hdi.a(0.0f, -4.5f, -1.0f));
        $$1.a("right_fin", hdl.c().a(-4, 0).a(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), hdi.a(-1.5f, 21.5f, -7.2f, 0.0f, 0.0f, -0.7853982f));
        $$1.a("left_fin", hdl.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), hdi.a(1.5f, 21.5f, -7.2f, 0.0f, 0.0f, 0.7853982f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(iey $$0) {
        super.a($$0);
        float $$1 = 1.0f;
        float $$2 = 1.0f;
        if (!$$0.aF) {
            $$1 = 1.3f;
            $$2 = 1.7f;
        }
        this.g.f = -$$1 * 0.25f * bgj.a((double)($$2 * 0.6f * $$0.L));
    }
}

