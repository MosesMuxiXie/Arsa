/*
 * Decompiled with CFR 0.152.
 */
public class hfv
extends gzm<ifv> {
    private static final String b = "ribcage";
    private static final String c = "center_head";
    private static final String d = "right_head";
    private static final String e = "left_head";
    private static final float f = 0.065f;
    private static final float g = 0.265f;
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;

    public hfv(hdg $$0) {
        super($$0);
        this.k = $$0.b(b);
        this.l = $$0.b("tail");
        this.h = $$0.b(c);
        this.i = $$0.b(d);
        this.j = $$0.b(e);
    }

    public static hdm a(hdk $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        $$2.a("shoulders", hdl.c().a(0, 16).a(-10.0f, 3.9f, -0.5f, 20.0f, 3.0f, 3.0f, $$0), hdi.a);
        float $$3 = 0.20420352f;
        $$2.a(b, hdl.c().a(0, 22).a(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f, $$0).a(24, 22).a(-4.0f, 1.5f, 0.5f, 11.0f, 2.0f, 2.0f, $$0).a(24, 22).a(-4.0f, 4.0f, 0.5f, 11.0f, 2.0f, 2.0f, $$0).a(24, 22).a(-4.0f, 6.5f, 0.5f, 11.0f, 2.0f, 2.0f, $$0), hdi.a(-2.0f, 6.9f, -0.5f, 0.20420352f, 0.0f, 0.0f));
        $$2.a("tail", hdl.c().a(12, 22).a(0.0f, 0.0f, 0.0f, 3.0f, 6.0f, 3.0f, $$0), hdi.a(-2.0f, 6.9f + bgj.b(0.2042035162448883) * 10.0f, -0.5f + bgj.a(0.2042035162448883) * 10.0f, 0.83252203f, 0.0f, 0.0f));
        $$2.a(c, hdl.c().a(0, 0).a(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), hdi.a);
        hdl $$4 = hdl.c().a(32, 0).a(-4.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, $$0);
        $$2.a(d, $$4, hdi.a(-8.0f, 4.0f, 0.0f));
        $$2.a(e, $$4, hdi.a(10.0f, 4.0f, 0.0f));
        return hdm.a($$1, 64, 64);
    }

    @Override
    public void a(ifv $$0) {
        super.a($$0);
        hfv.a($$0, this.i, 0);
        hfv.a($$0, this.j, 1);
        float $$1 = bgj.b((double)($$0.L * 0.1f));
        this.k.e = (0.065f + 0.05f * $$1) * (float)Math.PI;
        this.l.a(-2.0f, 6.9f + bgj.b((double)this.k.e) * 10.0f, -0.5f + bgj.a((double)this.k.e) * 10.0f);
        this.l.e = (0.265f + 0.1f * $$1) * (float)Math.PI;
        this.h.f = $$0.au * ((float)Math.PI / 180);
        this.h.e = $$0.av * ((float)Math.PI / 180);
    }

    private static void a(ifv $$0, hdg $$1, int $$2) {
        $$1.f = ($$0.b[$$2] - $$0.at) * ((float)Math.PI / 180);
        $$1.e = $$0.a[$$2] * ((float)Math.PI / 180);
    }
}

