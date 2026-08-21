/*
 * Decompiled with CFR 0.152.
 */
public class hec
extends gzm<idd> {
    private static final int b = 5;
    private static final int c = 12;
    private final hdg d;
    private final hdg[] e = new hdg[5];
    private final hdg[] f = new hdg[12];
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg q;
    private final hdg r;
    private final hdg s;
    private final hdg t;
    private final hdg u;
    private final hdg v;
    private final hdg w;
    private final hdg x;
    private final hdg y;
    private final hdg z;

    private static String a(int $$0) {
        return "neck" + $$0;
    }

    private static String b(int $$0) {
        return "tail" + $$0;
    }

    public hec(hdg $$0) {
        super($$0);
        this.d = $$0.b("head");
        this.g = this.d.b("jaw");
        for (int $$1 = 0; $$1 < this.e.length; ++$$1) {
            this.e[$$1] = $$0.b(hec.a($$1));
        }
        for (int $$2 = 0; $$2 < this.f.length; ++$$2) {
            this.f[$$2] = $$0.b(hec.b($$2));
        }
        this.h = $$0.b("body");
        this.i = this.h.b("left_wing");
        this.j = this.i.b("left_wing_tip");
        this.k = this.h.b("left_front_leg");
        this.l = this.k.b("left_front_leg_tip");
        this.m = this.l.b("left_front_foot");
        this.n = this.h.b("left_hind_leg");
        this.q = this.n.b("left_hind_leg_tip");
        this.r = this.q.b("left_hind_foot");
        this.s = this.h.b("right_wing");
        this.t = this.s.b("right_wing_tip");
        this.u = this.h.b("right_front_leg");
        this.v = this.u.b("right_front_leg_tip");
        this.w = this.v.b("right_front_foot");
        this.x = this.h.b("right_hind_leg");
        this.y = this.x.b("right_hind_leg_tip");
        this.z = this.y.b("right_hind_foot");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        float $$2 = -16.0f;
        hdq $$3 = $$1.a("head", hdl.c().a("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16, 176, 44).a("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16, 112, 30).a().a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0).a().a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0), hdi.a(0.0f, 20.0f, -62.0f));
        $$3.a("jaw", hdl.c().a("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16, 176, 65), hdi.a(0.0f, 4.0f, -8.0f));
        hdl $$4 = hdl.c().a("box", -5.0f, -5.0f, -5.0f, 10, 10, 10, 192, 104).a("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6, 48, 0);
        for (int $$5 = 0; $$5 < 5; ++$$5) {
            $$1.a(hec.a($$5), $$4, hdi.a(0.0f, 20.0f, -12.0f - (float)$$5 * 10.0f));
        }
        for (int $$6 = 0; $$6 < 12; ++$$6) {
            $$1.a(hec.b($$6), $$4, hdi.a(0.0f, 10.0f, 60.0f + (float)$$6 * 10.0f));
        }
        hdq $$7 = $$1.a("body", hdl.c().a("body", -12.0f, 1.0f, -16.0f, 24, 24, 64, 0, 0).a("scale", -1.0f, -5.0f, -10.0f, 2, 6, 12, 220, 53).a("scale", -1.0f, -5.0f, 10.0f, 2, 6, 12, 220, 53).a("scale", -1.0f, -5.0f, 30.0f, 2, 6, 12, 220, 53), hdi.a(0.0f, 3.0f, 8.0f));
        hdq $$8 = $$7.a("left_wing", hdl.c().a().a("bone", 0.0f, -4.0f, -4.0f, 56, 8, 8, 112, 88).a("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, -56, 88), hdi.a(12.0f, 2.0f, -6.0f));
        $$8.a("left_wing_tip", hdl.c().a().a("bone", 0.0f, -2.0f, -2.0f, 56, 4, 4, 112, 136).a("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, -56, 144), hdi.a(56.0f, 0.0f, 0.0f));
        hdq $$9 = $$7.a("left_front_leg", hdl.c().a("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 112, 104), hdi.a(12.0f, 17.0f, -6.0f, 1.3f, 0.0f, 0.0f));
        hdq $$10 = $$9.a("left_front_leg_tip", hdl.c().a("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 226, 138), hdi.a(0.0f, 20.0f, -1.0f, -0.5f, 0.0f, 0.0f));
        $$10.a("left_front_foot", hdl.c().a("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 144, 104), hdi.a(0.0f, 23.0f, 0.0f, 0.75f, 0.0f, 0.0f));
        hdq $$11 = $$7.a("left_hind_leg", hdl.c().a("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0, 0), hdi.a(16.0f, 13.0f, 34.0f, 1.0f, 0.0f, 0.0f));
        hdq $$12 = $$11.a("left_hind_leg_tip", hdl.c().a("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 196, 0), hdi.a(0.0f, 32.0f, -4.0f, 0.5f, 0.0f, 0.0f));
        $$12.a("left_hind_foot", hdl.c().a("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 112, 0), hdi.a(0.0f, 31.0f, 4.0f, 0.75f, 0.0f, 0.0f));
        hdq $$13 = $$7.a("right_wing", hdl.c().a("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8, 112, 88).a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, -56, 88), hdi.a(-12.0f, 2.0f, -6.0f));
        $$13.a("right_wing_tip", hdl.c().a("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4, 112, 136).a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, -56, 144), hdi.a(-56.0f, 0.0f, 0.0f));
        hdq $$14 = $$7.a("right_front_leg", hdl.c().a("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 112, 104), hdi.a(-12.0f, 17.0f, -6.0f, 1.3f, 0.0f, 0.0f));
        hdq $$15 = $$14.a("right_front_leg_tip", hdl.c().a("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 226, 138), hdi.a(0.0f, 20.0f, -1.0f, -0.5f, 0.0f, 0.0f));
        $$15.a("right_front_foot", hdl.c().a("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 144, 104), hdi.a(0.0f, 23.0f, 0.0f, 0.75f, 0.0f, 0.0f));
        hdq $$16 = $$7.a("right_hind_leg", hdl.c().a("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0, 0), hdi.a(-16.0f, 13.0f, 34.0f, 1.0f, 0.0f, 0.0f));
        hdq $$17 = $$16.a("right_hind_leg_tip", hdl.c().a("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 196, 0), hdi.a(0.0f, 32.0f, -4.0f, 0.5f, 0.0f, 0.0f));
        $$17.a("right_hind_foot", hdl.c().a("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 112, 0), hdi.a(0.0f, 31.0f, 4.0f, 0.75f, 0.0f, 0.0f));
        return hdm.a($$0, 256, 256);
    }

    @Override
    public void a(idd $$0) {
        super.a($$0);
        float $$1 = $$0.a * ((float)Math.PI * 2);
        this.g.e = (bgj.a((double)$$1) + 1.0f) * 0.2f;
        float $$2 = bgj.a((double)($$1 - 1.0f)) + 1.0f;
        $$2 = ($$2 * $$2 + $$2 * 2.0f) * 0.05f;
        this.o.c = ($$2 - 2.0f) * 16.0f;
        this.o.d = -48.0f;
        this.o.e = $$2 * 2.0f * ((float)Math.PI / 180);
        float $$3 = this.e[0].b;
        float $$4 = this.e[0].c;
        float $$5 = this.e[0].d;
        float $$6 = 1.5f;
        cya.a $$7 = $$0.a(6);
        float $$8 = bgj.f($$0.a(5).b() - $$0.a(10).b());
        float $$9 = bgj.f($$0.a(5).b() + $$8 / 2.0f);
        for (int $$10 = 0; $$10 < 5; ++$$10) {
            hdg $$11 = this.e[$$10];
            cya.a $$12 = $$0.a(5 - $$10);
            float $$13 = bgj.b((double)((float)$$10 * 0.45f + $$1)) * 0.15f;
            $$11.f = bgj.f($$12.b() - $$7.b()) * ((float)Math.PI / 180) * 1.5f;
            $$11.e = $$13 + $$0.a($$10, $$7, $$12) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            $$11.g = -bgj.f($$12.b() - $$9) * ((float)Math.PI / 180) * 1.5f;
            $$11.c = $$4;
            $$11.d = $$5;
            $$11.b = $$3;
            $$3 -= bgj.a((double)$$11.f) * bgj.b((double)$$11.e) * 10.0f;
            $$4 += bgj.a((double)$$11.e) * 10.0f;
            $$5 -= bgj.b((double)$$11.f) * bgj.b((double)$$11.e) * 10.0f;
        }
        this.d.c = $$4;
        this.d.d = $$5;
        this.d.b = $$3;
        cya.a $$14 = $$0.a(0);
        this.d.f = bgj.f($$14.b() - $$7.b()) * ((float)Math.PI / 180);
        this.d.e = bgj.f($$0.a(6, $$7, $$14)) * ((float)Math.PI / 180) * 1.5f * 5.0f;
        this.d.g = -bgj.f($$14.b() - $$9) * ((float)Math.PI / 180);
        this.h.g = -$$8 * 1.5f * ((float)Math.PI / 180);
        this.i.e = 0.125f - bgj.b((double)$$1) * 0.2f;
        this.i.f = -0.25f;
        this.i.g = -(bgj.a((double)$$1) + 0.125f) * 0.8f;
        this.j.g = (bgj.a((double)($$1 + 2.0f)) + 0.5f) * 0.75f;
        this.s.e = this.i.e;
        this.s.f = -this.i.f;
        this.s.g = -this.i.g;
        this.t.g = -this.j.g;
        this.a($$2, this.k, this.l, this.m, this.n, this.q, this.r);
        this.a($$2, this.u, this.v, this.w, this.x, this.y, this.z);
        float $$15 = 0.0f;
        $$4 = this.f[0].c;
        $$5 = this.f[0].d;
        $$3 = this.f[0].b;
        $$7 = $$0.a(11);
        for (int $$16 = 0; $$16 < 12; ++$$16) {
            cya.a $$17 = $$0.a(12 + $$16);
            hdg $$18 = this.f[$$16];
            $$18.f = (bgj.f($$17.b() - $$7.b()) * 1.5f + 180.0f) * ((float)Math.PI / 180);
            $$18.e = ($$15 += bgj.a((double)((float)$$16 * 0.45f + $$1)) * 0.05f) + (float)($$17.a() - $$7.a()) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            $$18.g = bgj.f($$17.b() - $$9) * ((float)Math.PI / 180) * 1.5f;
            $$18.c = $$4;
            $$18.d = $$5;
            $$18.b = $$3;
            $$4 += bgj.a((double)$$18.e) * 10.0f;
            $$5 -= bgj.b((double)$$18.f) * bgj.b((double)$$18.e) * 10.0f;
            $$3 -= bgj.a((double)$$18.f) * bgj.b((double)$$18.e) * 10.0f;
        }
    }

    private void a(float $$0, hdg $$1, hdg $$2, hdg $$3, hdg $$4, hdg $$5, hdg $$6) {
        $$4.e = 1.0f + $$0 * 0.1f;
        $$5.e = 0.5f + $$0 * 0.1f;
        $$6.e = 0.75f + $$0 * 0.1f;
        $$1.e = 1.3f + $$0 * 0.1f;
        $$2.e = -0.5f - $$0 * 0.1f;
        $$3.e = 0.75f + $$0 * 0.1f;
    }
}

