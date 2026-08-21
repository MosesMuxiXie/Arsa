/*
 * Decompiled with CFR 0.152.
 */
public class hbj
extends gzm<ieh> {
    private final hdg b;

    public hbj(hdg $$0) {
        super($$0, ijt::g);
        this.b = $$0.b("tail");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = 0.0f;
        float $$3 = 22.0f;
        float $$4 = -3.0f;
        $$1.a("body", hdl.c().a(0, 0).a(-1.5f, -1.0f, 0.0f, 3.0f, 2.0f, 3.0f), hdi.a(0.0f, 22.0f, -3.0f));
        $$1.a("tail", hdl.c().a(0, 0).a(0.0f, -1.0f, 0.0f, 0.0f, 2.0f, 7.0f), hdi.a(0.0f, 22.0f, 0.0f));
        return hdm.a($$0, 16, 16);
    }

    @Override
    public void a(ieh $$0) {
        super.a($$0);
        float $$1 = $$0.aF ? 1.0f : 1.5f;
        this.b.f = -$$1 * 0.25f * bgj.a((double)(0.3f * $$0.L));
    }
}

