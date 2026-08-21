/*
 * Decompiled with CFR 0.152.
 */
public class gzw
extends gzm<icg> {
    public static final hdp b = hdp.scaling(0.6f);
    private static final float c = 25.0f;
    private static final float d = 22.5f;
    private static final float e = 16.5f;
    private static final float f = 2.5f;
    private static final String g = "head_cube";
    private static final String h = "right_ear_cube";
    private static final String i = "left_ear_cube";
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg q;
    private final ggb r;
    private final ggb s;
    private final ggb t;
    private final ggb u;

    public gzw(hdg $$0) {
        super($$0);
        this.j = $$0.b("body");
        this.k = $$0.b("right_hind_leg");
        this.l = $$0.b("left_hind_leg");
        this.n = this.j.b("head");
        this.q = this.j.b("tail");
        this.m = $$0.b("cube");
        this.r = ggd.b.a($$0);
        this.s = ggd.d.a($$0);
        this.t = ggd.a.a($$0);
        this.u = ggd.c.a($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("body", hdl.c().a(0, 20).a(-4.0f, -7.0f, -10.0f, 8.0f, 8.0f, 12.0f, new hdk(0.3f)).a(0, 40).a(-4.0f, -7.0f, -10.0f, 8.0f, 8.0f, 12.0f, new hdk(0.0f)), hdi.a(0.0f, 21.0f, 4.0f));
        $$2.a("tail", hdl.c().a(44, 53).a(-0.5f, -0.0865f, 0.0933f, 1.0f, 6.0f, 1.0f, new hdk(0.0f)), hdi.a(0.0f, -3.0f, 1.0f, 0.5061f, 0.0f, 0.0f));
        hdq $$3 = $$2.a("head", hdl.c(), hdi.a(0.0f, -2.0f, -11.0f));
        $$3.a(g, hdl.c().a(43, 15).a(-1.5f, -1.0f, -1.0f, 3.0f, 5.0f, 2.0f, new hdk(0.0f)), hdi.a(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        hdq $$4 = $$3.a("right_ear", hdl.c(), hdi.a(-1.0f, -1.0f, 0.0f));
        $$4.a(h, hdl.c().a(43, 10).a(-2.0f, -3.0f, 0.0f, 2.0f, 5.0f, 0.0f, new hdk(0.0f)), hdi.a(-0.5f, 0.0f, -0.6f, 0.1886f, -0.3864f, -0.0718f));
        hdq $$5 = $$3.a("left_ear", hdl.c(), hdi.a(1.0f, -2.0f, 0.0f));
        $$5.a(i, hdl.c().a(47, 10).a(0.0f, -3.0f, 0.0f, 2.0f, 5.0f, 0.0f, new hdk(0.0f)), hdi.a(0.5f, 1.0f, -0.6f, 0.1886f, 0.3864f, 0.0718f));
        $$1.a("right_hind_leg", hdl.c().a(51, 31).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new hdk(0.0f)), hdi.a(-2.0f, 21.0f, 4.0f));
        $$1.a("left_hind_leg", hdl.c().a(42, 31).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new hdk(0.0f)), hdi.a(2.0f, 21.0f, 4.0f));
        $$1.a("right_front_leg", hdl.c().a(51, 43).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new hdk(0.0f)), hdi.a(-2.0f, 21.0f, -4.0f));
        $$1.a("left_front_leg", hdl.c().a(42, 43).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new hdk(0.0f)), hdi.a(2.0f, 21.0f, -4.0f));
        $$1.a("cube", hdl.c().a(0, 0).a(-5.0f, -10.0f, -6.0f, 10.0f, 10.0f, 10.0f, new hdk(0.0f)), hdi.a(0.0f, 24.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(icg $$0) {
        super.a($$0);
        if ($$0.a) {
            this.j.l = true;
            this.l.k = false;
            this.k.k = false;
            this.q.k = false;
            this.m.k = true;
        } else {
            this.j.l = false;
            this.l.k = true;
            this.k.k = true;
            this.q.k = true;
            this.m.k = false;
            this.n.e = bgj.a($$0.av, -22.5f, 25.0f) * ((float)Math.PI / 180);
            this.n.f = bgj.a($$0.au, -32.5f, 32.5f) * ((float)Math.PI / 180);
        }
        this.r.a($$0.ax, $$0.ay, 16.5f, 2.5f);
        this.s.a($$0.b, $$0.L);
        this.t.a($$0.c, $$0.L);
        this.u.a($$0.d, $$0.L);
    }
}

