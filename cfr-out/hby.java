/*
 * Decompiled with CFR 0.152.
 */
public class hby
extends gzm<ien> {
    private static final float d = 2.0f;
    private static final float e = 3.0f;
    private static final float f = 0.2f;
    private static final float g = 5.0f;
    protected final hdg b;
    protected final hdg c;
    private final ggb h;

    public hby(hdg $$0) {
        super($$0);
        this.c = $$0.b("root");
        this.b = this.c.b("body");
        this.h = ggk.a.a($$0);
    }

    public static hdm e() {
        return hdm.a(hby.f(), 128, 128);
    }

    public static hdo f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("root", hdl.c(), hdi.a(0.0f, 29.0f, -6.0f));
        $$2.a("shell", hdl.c().a(0, 0).a(-7.0f, -10.0f, -7.0f, 14.0f, 10.0f, 16.0f, new hdk(0.0f)).a(0, 26).a(-7.0f, 0.0f, -7.0f, 14.0f, 8.0f, 20.0f, new hdk(0.0f)).a(48, 26).a(-7.0f, 0.0f, 6.0f, 14.0f, 8.0f, 0.0f, new hdk(0.0f)), hdi.a(0.0f, -13.0f, 5.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(0, 54).a(-5.0f, -4.51f, -3.0f, 10.0f, 8.0f, 14.0f, new hdk(0.0f)).a(0, 76).a(-5.0f, -4.51f, 7.0f, 10.0f, 8.0f, 0.0f, new hdk(0.0f)), hdi.a(0.0f, -8.5f, 12.3f));
        $$3.a("upper_mouth", hdl.c().a(54, 54).a(-5.0f, -2.0f, 0.0f, 10.0f, 4.0f, 4.0f, new hdk(-0.001f)), hdi.a(0.0f, -2.51f, 7.0f));
        $$3.a("inner_mouth", hdl.c().a(54, 70).a(-3.0f, -2.0f, -0.5f, 6.0f, 4.0f, 4.0f, new hdk(0.0f)), hdi.a(0.0f, -0.51f, 7.5f));
        $$3.a("lower_mouth", hdl.c().a(54, 62).a(-5.0f, -1.98f, 0.0f, 10.0f, 4.0f, 4.0f, new hdk(-0.001f)), hdi.a(0.0f, 1.49f, 7.0f));
        return $$0;
    }

    public static hdm g() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("root", hdl.c(), hdi.a(-0.5f, 28.0f, -0.5f));
        $$2.a("shell", hdl.c().a(0, 0).a(-6.0f, -4.0f, -1.0f, 7.0f, 4.0f, 7.0f, new hdk(0.0f)).a(0, 11).a(-6.0f, 0.0f, -1.0f, 7.0f, 4.0f, 9.0f, new hdk(0.0f)).a(23, 11).a(-6.0f, 0.0f, 5.0f, 7.0f, 4.0f, 0.0f, new hdk(0.0f)), hdi.a(3.0f, -8.0f, -2.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(0, 24).a(-2.5f, -3.01f, -1.0f, 5.0f, 4.0f, 7.0f, new hdk(0.0f)).a(0, 35).a(-2.5f, -3.01f, 4.1f, 5.0f, 4.0f, 0.0f, new hdk(0.0f)), hdi.a(0.5f, -5.0f, 3.0f));
        $$3.a("upper_mouth", hdl.c().a(24, 24).a(-2.5f, -1.0f, 0.0f, 5.0f, 2.0f, 2.0f, new hdk(-0.001f)), hdi.a(0.0f, -2.01f, 3.9f));
        $$3.a("inner_mouth", hdl.c().a(24, 32).a(-1.5f, -1.0f, -1.0f, 3.0f, 2.0f, 2.0f, new hdk(0.0f)), hdi.a(0.0f, -1.01f, 4.9f));
        $$3.a("lower_mouth", hdl.c().a(24, 28).a(-2.5f, -1.0f, 0.0f, 5.0f, 2.0f, 2.0f, new hdk(-0.001f)), hdi.a(0.0f, -0.01f, 3.9f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ien $$0) {
        super.a($$0);
        this.a($$0.au, $$0.av);
        this.h.a($$0.ax + $$0.L / 5.0f, $$0.ay + 0.2f, 2.0f, 3.0f);
    }

    private void a(float $$0, float $$1) {
        $$0 = bgj.a($$0, -10.0f, 10.0f);
        $$1 = bgj.a($$1, -10.0f, 10.0f);
        this.b.f = $$0 * ((float)Math.PI / 180);
        this.b.e = $$1 * ((float)Math.PI / 180);
    }
}

