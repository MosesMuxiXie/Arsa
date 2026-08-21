/*
 * Decompiled with CFR 0.152.
 */
public class hbe
extends gzm<ifn> {
    private final hdg b;

    public hbe(hdg $$0) {
        super($$0);
        this.b = $$0.b("tail");
    }

    public static hdm a(hdk $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        int $$3 = 22;
        $$2.a("body", hdl.c().a(0, 0).a(-1.0f, -1.5f, -3.0f, 2.0f, 3.0f, 6.0f, $$0), hdi.a(0.0f, 22.0f, 0.0f));
        $$2.a("tail", hdl.c().a(22, -6).a(0.0f, -1.5f, 0.0f, 0.0f, 3.0f, 6.0f, $$0), hdi.a(0.0f, 22.0f, 3.0f));
        $$2.a("right_fin", hdl.c().a(2, 16).a(-2.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, $$0), hdi.a(-1.0f, 22.5f, 0.0f, 0.0f, 0.7853982f, 0.0f));
        $$2.a("left_fin", hdl.c().a(2, 12).a(0.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, $$0), hdi.a(1.0f, 22.5f, 0.0f, 0.0f, -0.7853982f, 0.0f));
        $$2.a("top_fin", hdl.c().a(10, -5).a(0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 6.0f, $$0), hdi.a(0.0f, 20.5f, -3.0f));
        return hdm.a($$1, 32, 32);
    }

    @Override
    public void a(ifn $$0) {
        super.a($$0);
        float $$1 = $$0.aF ? 1.0f : 1.5f;
        this.b.f = -$$1 * 0.45f * bgj.a((double)(0.6f * $$0.L));
    }
}

