/*
 * Decompiled with CFR 0.152.
 */
public class hay
extends gzm<ieh> {
    private final hdg b;

    public hay(hdg $$0) {
        super($$0);
        this.b = $$0.b("tail_fin");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        int $$2 = 22;
        $$1.a("body", hdl.c().a(0, 0).a(-1.0f, -2.0f, 0.0f, 2.0f, 4.0f, 7.0f), hdi.a(0.0f, 22.0f, 0.0f));
        $$1.a("head", hdl.c().a(11, 0).a(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f), hdi.a(0.0f, 22.0f, 0.0f));
        $$1.a("nose", hdl.c().a(0, 0).a(-1.0f, -2.0f, -1.0f, 2.0f, 3.0f, 1.0f), hdi.a(0.0f, 22.0f, -3.0f));
        $$1.a("right_fin", hdl.c().a(22, 1).a(-2.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f), hdi.a(-1.0f, 23.0f, 0.0f, 0.0f, 0.0f, -0.7853982f));
        $$1.a("left_fin", hdl.c().a(22, 4).a(0.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f), hdi.a(1.0f, 23.0f, 0.0f, 0.0f, 0.0f, 0.7853982f));
        $$1.a("tail_fin", hdl.c().a(22, 3).a(0.0f, -2.0f, 0.0f, 0.0f, 4.0f, 4.0f), hdi.a(0.0f, 22.0f, 7.0f));
        $$1.a("top_fin", hdl.c().a(20, -6).a(0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 6.0f), hdi.a(0.0f, 20.0f, 0.0f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(ieh $$0) {
        super.a($$0);
        float $$1 = $$0.aF ? 1.0f : 1.5f;
        this.b.f = -$$1 * 0.45f * bgj.a((double)(0.6f * $$0.L));
    }
}

