/*
 * Decompiled with CFR 0.152.
 */
public class gzs
extends gzm<icm> {
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final ggb i;
    private final ggb j;

    public gzs(hdg $$0) {
        super($$0, ijt::f);
        this.c = $$0.b("body");
        this.b = $$0.b("head");
        this.d = this.c.b("right_wing");
        this.f = this.d.b("right_wing_tip");
        this.e = this.c.b("left_wing");
        this.g = this.e.b("left_wing_tip");
        this.h = this.c.b("feet");
        this.i = gge.b.a($$0);
        this.j = gge.a.a($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("body", hdl.c().a(0, 0).a(-1.5f, 0.0f, -1.0f, 3.0f, 5.0f, 2.0f), hdi.a(0.0f, 17.0f, 0.0f));
        hdq $$3 = $$1.a("head", hdl.c().a(0, 7).a(-2.0f, -3.0f, -1.0f, 4.0f, 3.0f, 2.0f), hdi.a(0.0f, 17.0f, 0.0f));
        $$3.a("right_ear", hdl.c().a(1, 15).a(-2.5f, -4.0f, 0.0f, 3.0f, 5.0f, 0.0f), hdi.a(-1.5f, -2.0f, 0.0f));
        $$3.a("left_ear", hdl.c().a(8, 15).a(-0.1f, -3.0f, 0.0f, 3.0f, 5.0f, 0.0f), hdi.a(1.1f, -3.0f, 0.0f));
        hdq $$4 = $$2.a("right_wing", hdl.c().a(12, 0).a(-2.0f, -2.0f, 0.0f, 2.0f, 7.0f, 0.0f), hdi.a(-1.5f, 0.0f, 0.0f));
        $$4.a("right_wing_tip", hdl.c().a(16, 0).a(-6.0f, -2.0f, 0.0f, 6.0f, 8.0f, 0.0f), hdi.a(-2.0f, 0.0f, 0.0f));
        hdq $$5 = $$2.a("left_wing", hdl.c().a(12, 7).a(0.0f, -2.0f, 0.0f, 2.0f, 7.0f, 0.0f), hdi.a(1.5f, 0.0f, 0.0f));
        $$5.a("left_wing_tip", hdl.c().a(16, 8).a(0.0f, -2.0f, 0.0f, 6.0f, 8.0f, 0.0f), hdi.a(2.0f, 0.0f, 0.0f));
        $$2.a("feet", hdl.c().a(16, 16).a(-1.5f, 0.0f, 0.0f, 3.0f, 2.0f, 0.0f), hdi.a(0.0f, 5.0f, 0.0f));
        return hdm.a($$0, 32, 32);
    }

    @Override
    public void a(icm $$0) {
        super.a($$0);
        if ($$0.a) {
            this.a($$0.au);
        }
        this.i.a($$0.b, $$0.L);
        this.j.a($$0.c, $$0.L);
    }

    @Override
    private void a(float $$0) {
        this.b.f = $$0 * ((float)Math.PI / 180);
    }
}

