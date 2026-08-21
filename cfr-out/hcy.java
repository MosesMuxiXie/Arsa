/*
 * Decompiled with CFR 0.152.
 */
public class hcy
extends gzm<idh> {
    private static final String b = "base";
    private static final String c = "upper_jaw";
    private static final String d = "lower_jaw";
    private final hdg e;
    private final hdg f;
    private final hdg g;

    public hcy(hdg $$0) {
        super($$0);
        this.e = $$0.b(b);
        this.f = this.e.b(c);
        this.g = this.e.b(d);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a(b, hdl.c().a(0, 0).a(0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 10.0f), hdi.a(-5.0f, 24.0f, -5.0f));
        hdl $$3 = hdl.c().a(40, 0).a(0.0f, 0.0f, 0.0f, 4.0f, 14.0f, 8.0f);
        $$2.a(c, $$3, hdi.a(6.5f, 0.0f, 1.0f, 0.0f, 0.0f, 2.042035f));
        $$2.a(d, $$3, hdi.a(3.5f, 0.0f, 9.0f, 0.0f, (float)Math.PI, 4.2411504f));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(idh $$0) {
        super.a($$0);
        float $$1 = $$0.b;
        float $$2 = Math.min($$1 * 2.0f, 1.0f);
        $$2 = 1.0f - $$2 * $$2 * $$2;
        this.f.g = (float)Math.PI - $$2 * 0.35f * (float)Math.PI;
        this.g.g = (float)Math.PI + $$2 * 0.35f * (float)Math.PI;
        this.e.c -= ($$1 + bgj.a((double)($$1 * 2.7f))) * 7.2f;
        float $$3 = 1.0f;
        if ($$1 > 0.9f) {
            $$3 *= (1.0f - $$1) / 0.1f;
        }
        this.o.c = 24.0f - 20.0f * $$3;
        this.o.h = $$3;
        this.o.i = $$3;
        this.o.j = $$3;
    }
}

