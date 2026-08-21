/*
 * Decompiled with CFR 0.152.
 */
public class hba
extends gzm<idf> {
    private final hdg b;
    private final hdg c;

    public hba(hdg $$0) {
        super($$0);
        this.b = $$0.b("left_blue_fin");
        this.c = $$0.b("right_blue_fin");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        int $$2 = 22;
        $$1.a("body", hdl.c().a(12, 22).a(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f), hdi.a(0.0f, 22.0f, 0.0f));
        $$1.a("right_blue_fin", hdl.c().a(24, 0).a(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), hdi.a(-2.5f, 18.0f, -1.5f));
        $$1.a("left_blue_fin", hdl.c().a(24, 3).a(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), hdi.a(2.5f, 18.0f, -1.5f));
        $$1.a("top_front_fin", hdl.c().a(19, 17).a(-2.5f, -1.0f, 0.0f, 5.0f, 1.0f, 0.0f), hdi.a(0.0f, 17.0f, -2.5f, 0.7853982f, 0.0f, 0.0f));
        $$1.a("top_back_fin", hdl.c().a(11, 17).a(-2.5f, -1.0f, 0.0f, 5.0f, 1.0f, 0.0f), hdi.a(0.0f, 17.0f, 2.5f, -0.7853982f, 0.0f, 0.0f));
        $$1.a("right_front_fin", hdl.c().a(5, 17).a(-1.0f, -5.0f, 0.0f, 1.0f, 5.0f, 0.0f), hdi.a(-2.5f, 22.0f, -2.5f, 0.0f, -0.7853982f, 0.0f));
        $$1.a("right_back_fin", hdl.c().a(9, 17).a(-1.0f, -5.0f, 0.0f, 1.0f, 5.0f, 0.0f), hdi.a(-2.5f, 22.0f, 2.5f, 0.0f, 0.7853982f, 0.0f));
        $$1.a("left_back_fin", hdl.c().a(1, 17).a(0.0f, -5.0f, 0.0f, 1.0f, 5.0f, 0.0f), hdi.a(2.5f, 22.0f, 2.5f, 0.0f, -0.7853982f, 0.0f));
        $$1.a("left_front_fin", hdl.c().a(1, 17).a(0.0f, -5.0f, 0.0f, 1.0f, 5.0f, 0.0f), hdi.a(2.5f, 22.0f, -2.5f, 0.0f, 0.7853982f, 0.0f));
        $$1.a("bottom_back_fin", hdl.c().a(18, 20).a(0.0f, 0.0f, 0.0f, 5.0f, 1.0f, 0.0f), hdi.a(-2.5f, 22.0f, 2.5f, 0.7853982f, 0.0f, 0.0f));
        $$1.a("bottom_front_fin", hdl.c().a(17, 19).a(-2.5f, 0.0f, 0.0f, 5.0f, 1.0f, 1.0f), hdi.a(0.0f, 22.0f, -2.5f, -0.7853982f, 0.0f, 0.0f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(idf $$0) {
        super.a($$0);
        this.c.g = -0.2f + 0.4f * bgj.a((double)($$0.L * 0.2f));
        this.b.g = 0.2f - 0.4f * bgj.a((double)($$0.L * 0.2f));
    }
}

