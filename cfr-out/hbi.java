/*
 * Decompiled with CFR 0.152.
 */
public class hbi
extends gzm<idp> {
    private static final float b = 1.5f;
    private static final float c = 1.0f;
    private static final float d = 2.5f;
    private final hdg e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final ggb n;
    private final ggb q;
    private final ggb r;
    private final ggb s;
    private final ggb t;
    private final ggb u;

    public hbi(hdg $$0) {
        super($$0.b("root"));
        this.e = this.o.b("body");
        this.f = this.e.b("head");
        this.g = this.f.b("eyes");
        this.h = this.e.b("tongue");
        this.i = this.e.b("left_arm");
        this.j = this.e.b("right_arm");
        this.k = this.o.b("left_leg");
        this.l = this.o.b("right_leg");
        this.m = this.e.b("croaking_body");
        this.n = ggj.c.a($$0);
        this.q = ggj.a.a($$0);
        this.r = ggj.d.a($$0);
        this.s = ggj.e.a($$0);
        this.t = ggj.b.a($$0);
        this.u = ggj.f.a($$0);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("root", hdl.c(), hdi.a(0.0f, 24.0f, 0.0f));
        hdq $$3 = $$2.a("body", hdl.c().a(3, 1).a(-3.5f, -2.0f, -8.0f, 7.0f, 3.0f, 9.0f).a(23, 22).a(-3.5f, -1.0f, -8.0f, 7.0f, 0.0f, 9.0f), hdi.a(0.0f, -2.0f, 4.0f));
        hdq $$4 = $$3.a("head", hdl.c().a(23, 13).a(-3.5f, -1.0f, -7.0f, 7.0f, 0.0f, 9.0f).a(0, 13).a(-3.5f, -2.0f, -7.0f, 7.0f, 3.0f, 9.0f), hdi.a(0.0f, -2.0f, -1.0f));
        hdq $$5 = $$4.a("eyes", hdl.c(), hdi.a(-0.5f, 0.0f, 2.0f));
        $$5.a("right_eye", hdl.c().a(0, 0).a(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), hdi.a(-1.5f, -3.0f, -6.5f));
        $$5.a("left_eye", hdl.c().a(0, 5).a(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), hdi.a(2.5f, -3.0f, -6.5f));
        $$3.a("croaking_body", hdl.c().a(26, 5).a(-3.5f, -0.1f, -2.9f, 7.0f, 2.0f, 3.0f, new hdk(-0.1f)), hdi.a(0.0f, -1.0f, -5.0f));
        hdq $$6 = $$3.a("tongue", hdl.c().a(17, 13).a(-2.0f, 0.0f, -7.1f, 4.0f, 0.0f, 7.0f), hdi.a(0.0f, -1.01f, 1.0f));
        hdq $$7 = $$3.a("left_arm", hdl.c().a(0, 32).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 3.0f), hdi.a(4.0f, -1.0f, -6.5f));
        $$7.a("left_hand", hdl.c().a(18, 40).a(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), hdi.a(0.0f, 3.0f, -1.0f));
        hdq $$8 = $$3.a("right_arm", hdl.c().a(0, 38).a(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 3.0f), hdi.a(-4.0f, -1.0f, -6.5f));
        $$8.a("right_hand", hdl.c().a(2, 40).a(-4.0f, 0.01f, -5.0f, 8.0f, 0.0f, 8.0f), hdi.a(0.0f, 3.0f, 0.0f));
        hdq $$9 = $$2.a("left_leg", hdl.c().a(14, 25).a(-1.0f, 0.0f, -2.0f, 3.0f, 3.0f, 4.0f), hdi.a(3.5f, -3.0f, 4.0f));
        $$9.a("left_foot", hdl.c().a(2, 32).a(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), hdi.a(2.0f, 3.0f, 0.0f));
        hdq $$10 = $$2.a("right_leg", hdl.c().a(0, 25).a(-2.0f, 0.0f, -2.0f, 3.0f, 3.0f, 4.0f), hdi.a(-3.5f, -3.0f, 4.0f));
        $$10.a("right_foot", hdl.c().a(18, 32).a(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), hdi.a(-2.0f, 3.0f, 0.0f));
        return hdm.a($$0, 48, 48);
    }

    @Override
    public void a(idp $$0) {
        super.a($$0);
        this.n.a($$0.b, $$0.L);
        this.q.a($$0.c, $$0.L);
        this.r.a($$0.d, $$0.L);
        if ($$0.a) {
            this.s.a($$0.ax, $$0.ay, 1.0f, 2.5f);
        } else {
            this.t.a($$0.ax, $$0.ay, 1.5f, 2.5f);
        }
        this.u.a($$0.e, $$0.L);
        this.m.k = $$0.c.b();
    }
}

