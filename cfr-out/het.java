/*
 * Decompiled with CFR 0.152.
 */
public class het
extends gzm<ier> {
    private static final String b = "tail_base";
    private static final String c = "tail_tip";
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;

    public het(hdg $$0) {
        super($$0);
        hdg $$1 = $$0.b("body");
        this.h = $$1.b(b);
        this.i = this.h.b(c);
        this.d = $$1.b("left_wing_base");
        this.e = this.d.b("left_wing_tip");
        this.f = $$1.b("right_wing_base");
        this.g = this.f.b("right_wing_tip");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("body", hdl.c().a(0, 8).a(-3.0f, -2.0f, -8.0f, 5.0f, 3.0f, 9.0f), hdi.b(-0.1f, 0.0f, 0.0f));
        hdq $$3 = $$2.a(b, hdl.c().a(3, 20).a(-2.0f, 0.0f, 0.0f, 3.0f, 2.0f, 6.0f), hdi.a(0.0f, -2.0f, 1.0f));
        $$3.a(c, hdl.c().a(4, 29).a(-1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 6.0f), hdi.a(0.0f, 0.5f, 6.0f));
        hdq $$4 = $$2.a("left_wing_base", hdl.c().a(23, 12).a(0.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f), hdi.a(2.0f, -2.0f, -8.0f, 0.0f, 0.0f, 0.1f));
        $$4.a("left_wing_tip", hdl.c().a(16, 24).a(0.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f), hdi.a(6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f));
        hdq $$5 = $$2.a("right_wing_base", hdl.c().a(23, 12).a().a(-6.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f), hdi.a(-3.0f, -2.0f, -8.0f, 0.0f, 0.0f, -0.1f));
        $$5.a("right_wing_tip", hdl.c().a(16, 24).a().a(-13.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f), hdi.a(-6.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f));
        $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -2.0f, -5.0f, 7.0f, 3.0f, 5.0f), hdi.a(0.0f, 1.0f, -7.0f, 0.2f, 0.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ier $$0) {
        super.a($$0);
        float $$1 = $$0.a * 7.448451f * ((float)Math.PI / 180);
        float $$2 = 16.0f;
        this.d.g = bgj.b((double)$$1) * 16.0f * ((float)Math.PI / 180);
        this.e.g = bgj.b((double)$$1) * 16.0f * ((float)Math.PI / 180);
        this.f.g = -this.d.g;
        this.g.g = -this.e.g;
        this.h.e = -(5.0f + bgj.b((double)($$1 * 2.0f)) * 5.0f) * ((float)Math.PI / 180);
        this.i.e = -(5.0f + bgj.b((double)($$1 * 2.0f)) * 5.0f) * ((float)Math.PI / 180);
    }
}

