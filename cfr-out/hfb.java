/*
 * Decompiled with CFR 0.152.
 */
public class hfb
extends gzm<ifb> {
    public static final String b = "lid";
    private static final String c = "base";
    private final hdg d;
    private final hdg e;

    public hfb(hdg $$0) {
        super($$0, ijt::h);
        this.d = $$0.b(b);
        this.e = $$0.b("head");
    }

    private static hdo f() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a(b, hdl.c().a(0, 0).a(-8.0f, -16.0f, -8.0f, 16.0f, 12.0f, 16.0f), hdi.a(0.0f, 24.0f, 0.0f));
        $$1.a(c, hdl.c().a(0, 28).a(-8.0f, -8.0f, -8.0f, 16.0f, 8.0f, 16.0f), hdi.a(0.0f, 24.0f, 0.0f));
        return $$0;
    }

    public static hdm a() {
        hdo $$0 = hfb.f();
        $$0.a().a("head", hdl.c().a(0, 52).a(-3.0f, 0.0f, -3.0f, 6.0f, 6.0f, 6.0f), hdi.a(0.0f, 12.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    public static hdm e() {
        hdo $$0 = hfb.f();
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ifb $$0) {
        super.a($$0);
        float $$1 = (0.5f + $$0.c) * (float)Math.PI;
        float $$2 = -1.0f + bgj.a((double)$$1);
        float $$3 = 0.0f;
        if ($$1 > (float)Math.PI) {
            $$3 = bgj.a((double)($$0.L * 0.1f)) * 0.7f;
        }
        this.d.a(0.0f, 16.0f + bgj.a((double)$$1) * 8.0f + $$3, 0.0f);
        this.d.f = $$0.c > 0.3f ? $$2 * $$2 * $$2 * $$2 * (float)Math.PI * 0.125f : 0.0f;
        this.e.e = $$0.av * ((float)Math.PI / 180);
        this.e.f = ($$0.d - 180.0f - $$0.e) * ((float)Math.PI / 180);
    }
}

