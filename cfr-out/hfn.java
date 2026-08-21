/*
 * Decompiled with CFR 0.152.
 */
public class hfn
extends gzm<ifh> {
    public static final hdp b = hdp.scaling(0.5f);
    private static final String c = "right_bottom_bristle";
    private static final String d = "right_middle_bristle";
    private static final String e = "right_top_bristle";
    private static final String f = "left_top_bristle";
    private static final String g = "left_middle_bristle";
    private static final String h = "left_bottom_bristle";
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg q;
    private final hdg r;
    private final hdg s;

    public hfn(hdg $$0) {
        super($$0);
        this.i = $$0.b("right_leg");
        this.j = $$0.b("left_leg");
        this.k = $$0.b("body");
        this.l = this.k.b(c);
        this.m = this.k.b(d);
        this.n = this.k.b(e);
        this.q = this.k.b(f);
        this.r = this.k.b(g);
        this.s = this.k.b(h);
    }

    public static hdm a() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("right_leg", hdl.c().a(0, 32).a(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f), hdi.a(-4.0f, 8.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(0, 55).a(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f), hdi.a(4.0f, 8.0f, 0.0f));
        hdq $$2 = $$1.a("body", hdl.c().a(0, 0).a(-8.0f, -6.0f, -8.0f, 16.0f, 14.0f, 16.0f), hdi.a(0.0f, 1.0f, 0.0f));
        $$2.a(c, hdl.c().a(16, 65).a(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), hdi.a(-8.0f, 4.0f, -8.0f, 0.0f, 0.0f, -1.2217305f));
        $$2.a(d, hdl.c().a(16, 49).a(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), hdi.a(-8.0f, -1.0f, -8.0f, 0.0f, 0.0f, -1.134464f));
        $$2.a(e, hdl.c().a(16, 33).a(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), hdi.a(-8.0f, -5.0f, -8.0f, 0.0f, 0.0f, -0.87266463f));
        $$2.a(f, hdl.c().a(16, 33).a(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), hdi.a(8.0f, -6.0f, -8.0f, 0.0f, 0.0f, 0.87266463f));
        $$2.a(g, hdl.c().a(16, 49).a(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), hdi.a(8.0f, -2.0f, -8.0f, 0.0f, 0.0f, 1.134464f));
        $$2.a(h, hdl.c().a(16, 65).a(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), hdi.a(8.0f, 3.0f, -8.0f, 0.0f, 0.0f, 1.2217305f));
        return hdm.a($$0, 64, 128);
    }

    @Override
    public void a(ifh $$0) {
        super.a($$0);
        float $$1 = $$0.ax;
        float $$2 = Math.min($$0.ay, 0.25f);
        if (!$$0.c) {
            this.k.e = $$0.av * ((float)Math.PI / 180);
            this.k.f = $$0.au * ((float)Math.PI / 180);
        } else {
            this.k.e = 0.0f;
            this.k.f = 0.0f;
        }
        float $$3 = 1.5f;
        this.k.g = 0.1f * bgj.a((double)($$1 * 1.5f)) * 4.0f * $$2;
        this.k.c = 2.0f;
        this.k.c -= 2.0f * bgj.b((double)($$1 * 1.5f)) * 2.0f * $$2;
        this.j.e = bgj.a((double)($$1 * 1.5f * 0.5f)) * 2.0f * $$2;
        this.i.e = bgj.a((double)($$1 * 1.5f * 0.5f + (float)Math.PI)) * 2.0f * $$2;
        this.j.g = 0.17453292f * bgj.b((double)($$1 * 1.5f * 0.5f)) * $$2;
        this.i.g = 0.17453292f * bgj.b((double)($$1 * 1.5f * 0.5f + (float)Math.PI)) * $$2;
        this.j.c = 8.0f + 2.0f * bgj.a((double)($$1 * 1.5f * 0.5f + (float)Math.PI)) * 2.0f * $$2;
        this.i.c = 8.0f + 2.0f * bgj.a((double)($$1 * 1.5f * 0.5f)) * 2.0f * $$2;
        this.l.g = -1.2217305f;
        this.m.g = -1.134464f;
        this.n.g = -0.87266463f;
        this.q.g = 0.87266463f;
        this.r.g = 1.134464f;
        this.s.g = 1.2217305f;
        float $$4 = bgj.b((double)($$1 * 1.5f + (float)Math.PI)) * $$2;
        this.l.g += $$4 * 1.3f;
        this.m.g += $$4 * 1.2f;
        this.n.g += $$4 * 0.6f;
        this.q.g += $$4 * 0.6f;
        this.r.g += $$4 * 1.2f;
        this.s.g += $$4 * 1.3f;
        float $$5 = 1.0f;
        float $$6 = 1.0f;
        this.l.g += 0.05f * bgj.a((double)($$0.L * 1.0f * -0.4f));
        this.m.g += 0.1f * bgj.a((double)($$0.L * 1.0f * 0.2f));
        this.n.g += 0.1f * bgj.a((double)($$0.L * 1.0f * 0.4f));
        this.q.g += 0.1f * bgj.a((double)($$0.L * 1.0f * 0.4f));
        this.r.g += 0.1f * bgj.a((double)($$0.L * 1.0f * 0.2f));
        this.s.g += 0.05f * bgj.a((double)($$0.L * 1.0f * -0.4f));
    }
}

