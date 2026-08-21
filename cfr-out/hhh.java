/*
 * Decompiled with CFR 0.152.
 */
public class hhh
extends gzm<idf> {
    private static final int b = 16;
    private final hdg c;
    private final hdg d;
    private final hdg e;

    public hhh(hdg $$0) {
        super($$0, ijt::j);
        this.c = $$0.b("bone");
        this.e = this.c.b("wind");
        this.d = this.c.b("wind_charge");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("bone", hdl.c(), hdi.a(0.0f, 0.0f, 0.0f));
        $$2.a("wind", hdl.c().a(15, 20).a(-4.0f, -1.0f, -4.0f, 8.0f, 2.0f, 8.0f, new hdk(0.0f)).a(0, 9).a(-3.0f, -2.0f, -3.0f, 6.0f, 4.0f, 6.0f, new hdk(0.0f)), hdi.a(0.0f, 0.0f, 0.0f, 0.0f, -0.7854f, 0.0f));
        $$2.a("wind_charge", hdl.c().a(0, 0).a(-2.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f, new hdk(0.0f)), hdi.a(0.0f, 0.0f, 0.0f));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(idf $$0) {
        super.a($$0);
        this.d.f = -$$0.L * 16.0f * ((float)Math.PI / 180);
        this.e.f = $$0.L * 16.0f * ((float)Math.PI / 180);
    }
}

