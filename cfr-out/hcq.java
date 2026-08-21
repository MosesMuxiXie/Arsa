/*
 * Decompiled with CFR 0.152.
 */
public class hcq
extends gzm<ife> {
    public static final hdp b = hdp.scaling(0.5f);
    private static final float c = 9.0f;
    private static final float d = 100.0f;
    private final hdg e;
    private final ggb f;
    private final ggb g;
    private final ggb h;
    private final ggb i;
    private final ggb j;
    private final ggb k;
    private final ggb l;
    private final ggb m;

    public hcq(hdg $$0) {
        super($$0);
        this.e = $$0.b("bone").b("body").b("head");
        this.f = ggl.e.a($$0);
        this.g = ggl.d.a($$0);
        this.h = ggl.f.a($$0);
        this.i = ggl.c.a($$0);
        this.j = ggl.g.a($$0);
        this.k = ggl.i.a($$0);
        this.l = ggl.b.a($$0);
        this.m = ggl.a.a($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("bone", hdl.c(), hdi.a(0.0f, 5.0f, 0.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(62, 68).a(-12.5f, -14.0f, -20.0f, 25.0f, 29.0f, 40.0f, new hdk(0.0f)).a(62, 0).a(-12.5f, -14.0f, -20.0f, 25.0f, 24.0f, 40.0f, new hdk(0.5f)).a(87, 68).a(-12.5f, 12.0f, -20.0f, 25.0f, 0.0f, 40.0f, new hdk(0.0f)), hdi.a(0.0f, 0.0f, 0.0f));
        $$2.a("right_front_leg", hdl.c().a(32, 87).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new hdk(0.0f)), hdi.a(-7.5f, 10.0f, -15.0f));
        $$2.a("right_mid_leg", hdl.c().a(32, 105).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new hdk(0.0f)), hdi.a(-7.5f, 10.0f, 0.0f));
        $$2.a("right_hind_leg", hdl.c().a(32, 123).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new hdk(0.0f)), hdi.a(-7.5f, 10.0f, 15.0f));
        $$2.a("left_front_leg", hdl.c().a(0, 87).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new hdk(0.0f)), hdi.a(7.5f, 10.0f, -15.0f));
        $$2.a("left_mid_leg", hdl.c().a(0, 105).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new hdk(0.0f)), hdi.a(7.5f, 10.0f, 0.0f));
        $$2.a("left_hind_leg", hdl.c().a(0, 123).a(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new hdk(0.0f)), hdi.a(7.5f, 10.0f, 15.0f));
        hdq $$4 = $$3.a("head", hdl.c().a(8, 15).a(-6.5f, -7.5f, -11.5f, 13.0f, 18.0f, 11.0f, new hdk(0.0f)).a(8, 4).a(-6.5f, 7.5f, -11.5f, 13.0f, 0.0f, 11.0f, new hdk(0.0f)), hdi.a(0.0f, 6.5f, -19.48f));
        $$4.a("left_ear", hdl.c().a(2, 0).a(0.0f, 0.0f, -3.0f, 1.0f, 19.0f, 7.0f, new hdk(0.0f)), hdi.a(6.51f, -7.5f, -4.51f));
        $$4.a("right_ear", hdl.c().a(48, 0).a(-1.0f, 0.0f, -3.0f, 1.0f, 19.0f, 7.0f, new hdk(0.0f)), hdi.a(-6.51f, -7.5f, -4.51f));
        $$4.a("nose", hdl.c().a(10, 45).a(-6.5f, -2.0f, -9.0f, 13.0f, 2.0f, 9.0f, new hdk(0.0f)), hdi.a(0.0f, -4.5f, -11.5f));
        $$4.a("lower_beak", hdl.c().a(10, 57).a(-6.5f, -7.0f, -8.0f, 13.0f, 12.0f, 9.0f, new hdk(0.0f)), hdi.a(0.0f, 2.5f, -12.5f));
        return hdm.a($$0, 192, 192);
    }

    @Override
    public void a(ife $$0) {
        super.a($$0);
        this.e.e = $$0.av * ((float)Math.PI / 180);
        this.e.f = $$0.au * ((float)Math.PI / 180);
        if ($$0.a) {
            this.f.a($$0.ax, $$0.ay, 9.0f, 100.0f);
        } else {
            this.g.a($$0.ax, $$0.ay, 9.0f, 100.0f);
        }
        this.h.a($$0.b, $$0.L);
        this.i.a($$0.c, $$0.L);
        this.j.a($$0.d, $$0.L);
        this.k.a($$0.e, $$0.L);
        this.l.a($$0.f, $$0.L);
        if ($$0.aE) {
            this.m.a();
        }
    }
}

