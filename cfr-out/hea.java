/*
 * Decompiled with CFR 0.152.
 */
public class hea
extends gzm<icy> {
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private static final int g = 6;

    public hea(hdg $$0) {
        super($$0);
        this.b = $$0.b("head");
        this.d = $$0.b("right_hind_leg");
        this.c = $$0.b("left_hind_leg");
        this.f = $$0.b("right_front_leg");
        this.e = $$0.b("left_front_leg");
    }

    public static hdm a(hdk $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), hdi.a(0.0f, 6.0f, 0.0f));
        $$2.a("body", hdl.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0), hdi.a(0.0f, 6.0f, 0.0f));
        hdl $$3 = hdl.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, $$0);
        $$2.a("right_hind_leg", $$3, hdi.a(-2.0f, 18.0f, 4.0f));
        $$2.a("left_hind_leg", $$3, hdi.a(2.0f, 18.0f, 4.0f));
        $$2.a("right_front_leg", $$3, hdi.a(-2.0f, 18.0f, -4.0f));
        $$2.a("left_front_leg", $$3, hdi.a(2.0f, 18.0f, -4.0f));
        return hdm.a($$1, 64, 32);
    }

    @Override
    public void a(icy $$0) {
        super.a($$0);
        this.b.f = $$0.au * ((float)Math.PI / 180);
        this.b.e = $$0.av * ((float)Math.PI / 180);
        float $$1 = $$0.ay;
        float $$2 = $$0.ax;
        this.c.e = bgj.b((double)($$2 * 0.6662f)) * 1.4f * $$1;
        this.d.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 1.4f * $$1;
        this.e.e = bgj.b((double)($$2 * 0.6662f + (float)Math.PI)) * 1.4f * $$1;
        this.f.e = bgj.b((double)($$2 * 0.6662f)) * 1.4f * $$1;
    }
}

