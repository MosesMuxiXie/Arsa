/*
 * Decompiled with CFR 0.152.
 */
public class hbb
extends gzm<idf> {
    private final hdg b;
    private final hdg c;

    public hbb(hdg $$0) {
        super($$0);
        this.b = $$0.b("left_fin");
        this.c = $$0.b("right_fin");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        int $$2 = 23;
        $$1.a("body", hdl.c().a(0, 27).a(-1.5f, -2.0f, -1.5f, 3.0f, 2.0f, 3.0f), hdi.a(0.0f, 23.0f, 0.0f));
        $$1.a("right_eye", hdl.c().a(24, 6).a(-1.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f), hdi.a(0.0f, 20.0f, 0.0f));
        $$1.a("left_eye", hdl.c().a(28, 6).a(0.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f), hdi.a(0.0f, 20.0f, 0.0f));
        $$1.a("back_fin", hdl.c().a(-3, 0).a(-1.5f, 0.0f, 0.0f, 3.0f, 0.0f, 3.0f), hdi.a(0.0f, 22.0f, 1.5f));
        $$1.a("right_fin", hdl.c().a(25, 0).a(-1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f), hdi.a(-1.5f, 22.0f, -1.5f));
        $$1.a("left_fin", hdl.c().a(25, 0).a(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f), hdi.a(1.5f, 22.0f, -1.5f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(idf $$0) {
        super.a($$0);
        this.c.g = -0.2f + 0.4f * bgj.a((double)($$0.L * 0.2f));
        this.b.g = 0.2f - 0.4f * bgj.a((double)($$0.L * 0.2f));
    }
}

