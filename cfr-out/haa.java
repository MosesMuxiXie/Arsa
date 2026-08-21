/*
 * Decompiled with CFR 0.152.
 */
public class haa
extends gzm<icn> {
    public static final hdp b = hdp.scaling(0.5f);
    private static final String c = "bone";
    private static final String d = "stinger";
    private static final String e = "left_antenna";
    private static final String f = "right_antenna";
    private static final String g = "front_legs";
    private static final String h = "middle_legs";
    private static final String i = "back_legs";
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg q;
    private final hdg r;
    private final hdg s;
    private final hdg t;
    private float u;

    public haa(hdg $$0) {
        super($$0);
        this.j = $$0.b(c);
        hdg $$1 = this.j.b("body");
        this.r = $$1.b(d);
        this.s = $$1.b(e);
        this.t = $$1.b(f);
        this.k = this.j.b("right_wing");
        this.l = this.j.b("left_wing");
        this.m = this.j.b(g);
        this.n = this.j.b(h);
        this.q = this.j.b(i);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a(c, hdl.c(), hdi.a(0.0f, 19.0f, 0.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(0, 0).a(-3.5f, -4.0f, -5.0f, 7.0f, 7.0f, 10.0f), hdi.a);
        $$3.a(d, hdl.c().a(26, 7).a(0.0f, -1.0f, 5.0f, 0.0f, 1.0f, 2.0f), hdi.a);
        $$3.a(e, hdl.c().a(2, 0).a(1.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f), hdi.a(0.0f, -2.0f, -5.0f));
        $$3.a(f, hdl.c().a(2, 3).a(-2.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f), hdi.a(0.0f, -2.0f, -5.0f));
        hdk $$4 = new hdk(0.001f);
        $$2.a("right_wing", hdl.c().a(0, 18).a(-9.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, $$4), hdi.a(-1.5f, -4.0f, -3.0f, 0.0f, -0.2618f, 0.0f));
        $$2.a("left_wing", hdl.c().a(0, 18).a().a(0.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, $$4), hdi.a(1.5f, -4.0f, -3.0f, 0.0f, 0.2618f, 0.0f));
        $$2.a(g, hdl.c().a(g, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 1), hdi.a(1.5f, 3.0f, -2.0f));
        $$2.a(h, hdl.c().a(h, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 3), hdi.a(1.5f, 3.0f, 0.0f));
        $$2.a(i, hdl.c().a(i, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 5), hdi.a(1.5f, 3.0f, 2.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(icn $$0) {
        super.a($$0);
        this.u = $$0.a;
        this.r.k = $$0.b;
        if (!$$0.c) {
            float $$1 = $$0.L * 120.32113f * ((float)Math.PI / 180);
            this.k.f = 0.0f;
            this.k.g = bgj.b((double)$$1) * (float)Math.PI * 0.15f;
            this.l.e = this.k.e;
            this.l.f = this.k.f;
            this.l.g = -this.k.g;
            this.m.e = 0.7853982f;
            this.n.e = 0.7853982f;
            this.q.e = 0.7853982f;
        }
        if (!$$0.d && !$$0.c) {
            float $$2 = bgj.b((double)($$0.L * 0.18f));
            this.j.e = 0.1f + $$2 * (float)Math.PI * 0.025f;
            this.s.e = $$2 * (float)Math.PI * 0.03f;
            this.t.e = $$2 * (float)Math.PI * 0.03f;
            this.m.e = -$$2 * (float)Math.PI * 0.1f + 0.3926991f;
            this.q.e = -$$2 * (float)Math.PI * 0.05f + 0.7853982f;
            this.j.c -= bgj.b((double)($$0.L * 0.18f)) * 0.9f;
        }
        if (this.u > 0.0f) {
            this.j.e = bgj.j(this.u, this.j.e, 3.0915928f);
        }
    }
}

