/*
 * Decompiled with CFR 0.152.
 */
public class hbr
extends gzm<ieb> {
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;

    public hbr(hdg $$0) {
        super($$0);
        this.b = $$0.b("head");
        this.c = $$0.b("right_arm");
        this.d = $$0.b("left_arm");
        this.e = $$0.b("right_leg");
        this.f = $$0.b("left_leg");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -12.0f, -5.5f, 8.0f, 10.0f, 8.0f).a(24, 0).a(-1.0f, -5.0f, -7.5f, 2.0f, 4.0f, 2.0f), hdi.a(0.0f, -7.0f, -2.0f));
        $$1.a("body", hdl.c().a(0, 40).a(-9.0f, -2.0f, -6.0f, 18.0f, 12.0f, 11.0f).a(0, 70).a(-4.5f, 10.0f, -3.0f, 9.0f, 5.0f, 6.0f, new hdk(0.5f)), hdi.a(0.0f, -7.0f, 0.0f));
        $$1.a("right_arm", hdl.c().a(60, 21).a(-13.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f), hdi.a(0.0f, -7.0f, 0.0f));
        $$1.a("left_arm", hdl.c().a(60, 58).a(9.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f), hdi.a(0.0f, -7.0f, 0.0f));
        $$1.a("right_leg", hdl.c().a(37, 0).a(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f), hdi.a(-4.0f, 11.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(60, 0).a().a(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f), hdi.a(5.0f, 11.0f, 0.0f));
        return hdm.a($$0, 128, 128);
    }

    @Override
    public void a(ieb $$0) {
        super.a($$0);
        float $$1 = $$0.a;
        float $$2 = $$0.ay;
        float $$3 = $$0.ax;
        if ($$1 > 0.0f) {
            this.c.e = -2.0f + 1.5f * bgj.f($$1, 10.0f);
            this.d.e = -2.0f + 1.5f * bgj.f($$1, 10.0f);
        } else {
            int $$4 = $$0.b;
            if ($$4 > 0) {
                this.c.e = -0.8f + 0.025f * bgj.f((float)$$4, 70.0f);
                this.d.e = 0.0f;
            } else {
                this.c.e = (-0.2f + 1.5f * bgj.f($$3, 13.0f)) * $$2;
                this.d.e = (-0.2f - 1.5f * bgj.f($$3, 13.0f)) * $$2;
            }
        }
        this.b.f = $$0.au * ((float)Math.PI / 180);
        this.b.e = $$0.av * ((float)Math.PI / 180);
        this.e.e = -1.5f * bgj.f($$3, 13.0f) * $$2;
        this.f.e = 1.5f * bgj.f($$3, 13.0f) * $$2;
        this.e.f = 0.0f;
        this.f.f = 0.0f;
    }

    public hdg e() {
        return this.c;
    }
}

