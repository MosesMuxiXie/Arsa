/*
 * Decompiled with CFR 0.152.
 */
public class had
extends gzm<ics> {
    private static final float d = 2.0f;
    private static final float e = 2.5f;
    public static final hdp b = hdp.scaling(0.45f);
    protected final hdg c;
    private final ggb f;
    private final ggb g;
    private final ggb h;
    private final ggb i;
    private final ggb j;
    private final ggb k;

    public had(hdg $$0) {
        super($$0);
        hdg $$1 = $$0.b("body");
        this.c = $$1.b("head");
        this.f = ggg.a.a($$0);
        this.g = ggg.b.a($$0);
        this.h = ggg.c.a($$0);
        this.i = ggg.d.a($$0);
        this.j = ggg.f.a($$0);
        this.k = ggg.e.a($$0);
    }

    public static hdm a() {
        return hdm.a(had.e(), 128, 128);
    }

    protected static hdo e() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("body", hdl.c().a(0, 25).a(-7.5f, -12.0f, -23.5f, 15.0f, 12.0f, 27.0f), hdi.a(0.0f, 4.0f, 9.5f));
        $$2.a("hump", hdl.c().a(74, 0).a(-4.5f, -5.0f, -5.5f, 9.0f, 5.0f, 11.0f), hdi.a(0.0f, -12.0f, -10.0f));
        $$2.a("tail", hdl.c().a(122, 0).a(-1.5f, 0.0f, 0.0f, 3.0f, 14.0f, 0.0f), hdi.a(0.0f, -9.0f, 3.5f));
        hdq $$3 = $$2.a("head", hdl.c().a(60, 24).a(-3.5f, -7.0f, -15.0f, 7.0f, 8.0f, 19.0f).a(21, 0).a(-3.5f, -21.0f, -15.0f, 7.0f, 14.0f, 7.0f).a(50, 0).a(-2.5f, -21.0f, -21.0f, 5.0f, 5.0f, 6.0f), hdi.a(0.0f, -3.0f, -19.5f));
        $$3.a("left_ear", hdl.c().a(45, 0).a(-0.5f, 0.5f, -1.0f, 3.0f, 1.0f, 2.0f), hdi.a(2.5f, -21.0f, -9.5f));
        $$3.a("right_ear", hdl.c().a(67, 0).a(-2.5f, 0.5f, -1.0f, 3.0f, 1.0f, 2.0f), hdi.a(-2.5f, -21.0f, -9.5f));
        $$1.a("left_hind_leg", hdl.c().a(58, 16).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), hdi.a(4.9f, 1.0f, 9.5f));
        $$1.a("right_hind_leg", hdl.c().a(94, 16).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), hdi.a(-4.9f, 1.0f, 9.5f));
        $$1.a("left_front_leg", hdl.c().a(0, 0).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), hdi.a(4.9f, 1.0f, -10.5f));
        $$1.a("right_front_leg", hdl.c().a(0, 26).a(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), hdi.a(-4.9f, 1.0f, -10.5f));
        return $$0;
    }

    @Override
    public void a(ics $$0) {
        super.a($$0);
        this.a($$0, $$0.au, $$0.av);
        this.f.a($$0.ax, $$0.ay, 2.0f, 2.5f);
        this.g.a($$0.d, $$0.L);
        this.h.a($$0.e, $$0.L);
        this.i.a($$0.f, $$0.L);
        this.j.a($$0.g, $$0.L);
        this.k.a($$0.h, $$0.L);
    }

    private void a(ics $$0, float $$1, float $$2) {
        $$1 = bgj.a($$1, -30.0f, 30.0f);
        $$2 = bgj.a($$2, -25.0f, 45.0f);
        if ($$0.c > 0.0f) {
            float $$3 = 45.0f * $$0.c / 55.0f;
            $$2 = bgj.a($$2 + $$3, -25.0f, 70.0f);
        }
        this.c.f = $$1 * ((float)Math.PI / 180);
        this.c.e = $$2 * ((float)Math.PI / 180);
    }
}

