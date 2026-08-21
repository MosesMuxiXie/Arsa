/*
 * Decompiled with CFR 0.152.
 */
public class hfl
extends gzm<ieh> {
    private static final String b = "body0";
    private static final String c = "body1";
    private static final String d = "right_middle_front_leg";
    private static final String e = "left_middle_front_leg";
    private static final String f = "right_middle_hind_leg";
    private static final String g = "left_middle_hind_leg";
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg q;
    private final hdg r;

    public hfl(hdg $$0) {
        super($$0);
        this.h = $$0.b("head");
        this.i = $$0.b("right_hind_leg");
        this.j = $$0.b("left_hind_leg");
        this.k = $$0.b(f);
        this.l = $$0.b(g);
        this.m = $$0.b(d);
        this.n = $$0.b(e);
        this.q = $$0.b("right_front_leg");
        this.r = $$0.b("left_front_leg");
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        int $$2 = 15;
        $$1.a("head", hdl.c().a(32, 4).a(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f), hdi.a(0.0f, 15.0f, -3.0f));
        $$1.a(b, hdl.c().a(0, 0).a(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f), hdi.a(0.0f, 15.0f, 0.0f));
        $$1.a(c, hdl.c().a(0, 12).a(-5.0f, -4.0f, -6.0f, 10.0f, 8.0f, 12.0f), hdi.a(0.0f, 15.0f, 9.0f));
        hdl $$3 = hdl.c().a(18, 0).a(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f);
        hdl $$4 = hdl.c().a(18, 0).a().a(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f);
        float $$5 = 0.7853982f;
        float $$6 = 0.3926991f;
        $$1.a("right_hind_leg", $$3, hdi.a(-4.0f, 15.0f, 2.0f, 0.0f, 0.7853982f, -0.7853982f));
        $$1.a("left_hind_leg", $$4, hdi.a(4.0f, 15.0f, 2.0f, 0.0f, -0.7853982f, 0.7853982f));
        $$1.a(f, $$3, hdi.a(-4.0f, 15.0f, 1.0f, 0.0f, 0.3926991f, -0.58119464f));
        $$1.a(g, $$4, hdi.a(4.0f, 15.0f, 1.0f, 0.0f, -0.3926991f, 0.58119464f));
        $$1.a(d, $$3, hdi.a(-4.0f, 15.0f, 0.0f, 0.0f, -0.3926991f, -0.58119464f));
        $$1.a(e, $$4, hdi.a(4.0f, 15.0f, 0.0f, 0.0f, 0.3926991f, 0.58119464f));
        $$1.a("right_front_leg", $$3, hdi.a(-4.0f, 15.0f, -1.0f, 0.0f, -0.7853982f, -0.7853982f));
        $$1.a("left_front_leg", $$4, hdi.a(4.0f, 15.0f, -1.0f, 0.0f, 0.7853982f, 0.7853982f));
        return hdm.a($$0, 64, 32);
    }

    @Override
    public void a(ieh $$0) {
        super.a($$0);
        this.h.f = $$0.au * ((float)Math.PI / 180);
        this.h.e = $$0.av * ((float)Math.PI / 180);
        float $$1 = $$0.ax * 0.6662f;
        float $$2 = $$0.ay;
        float $$3 = -(bgj.b((double)($$1 * 2.0f + 0.0f)) * 0.4f) * $$2;
        float $$4 = -(bgj.b((double)($$1 * 2.0f + (float)Math.PI)) * 0.4f) * $$2;
        float $$5 = -(bgj.b((double)($$1 * 2.0f + 1.5707964f)) * 0.4f) * $$2;
        float $$6 = -(bgj.b((double)($$1 * 2.0f + 4.712389f)) * 0.4f) * $$2;
        float $$7 = Math.abs(bgj.a((double)($$1 + 0.0f)) * 0.4f) * $$2;
        float $$8 = Math.abs(bgj.a((double)($$1 + (float)Math.PI)) * 0.4f) * $$2;
        float $$9 = Math.abs(bgj.a((double)($$1 + 1.5707964f)) * 0.4f) * $$2;
        float $$10 = Math.abs(bgj.a((double)($$1 + 4.712389f)) * 0.4f) * $$2;
        this.i.f += $$3;
        this.j.f -= $$3;
        this.k.f += $$4;
        this.l.f -= $$4;
        this.m.f += $$5;
        this.n.f -= $$5;
        this.q.f += $$6;
        this.r.f -= $$6;
        this.i.g += $$7;
        this.j.g -= $$7;
        this.k.g += $$8;
        this.l.g -= $$8;
        this.m.g += $$9;
        this.n.g -= $$9;
        this.q.g += $$10;
        this.r.g -= $$10;
    }
}

