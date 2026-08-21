/*
 * Decompiled with CFR 0.152.
 */
public class hev<S extends idy>
extends gzo<S> {
    private static final String x = "left_sleeve";
    private static final String y = "right_sleeve";
    private static final String z = "left_pants";
    private static final String A = "right_pants";
    public final hdg q;
    public final hdg r;
    public final hdg s;
    public final hdg t;
    public final hdg u;
    public final hdg v;
    public final hdg w;

    public hev(hdg $$0) {
        super($$0, ijt::j);
        this.q = this.l.b(x);
        this.r = this.k.b(y);
        this.s = this.n.b(z);
        this.t = this.m.b(A);
        this.u = this.j.b("jacket");
        this.v = this.h.b("right_ear");
        this.w = this.h.b("left_ear");
    }

    public static hdo a(hdk $$0) {
        hdo $$1 = hht.a($$0, false);
        hdq $$2 = $$1.a();
        $$2.a("body", hdl.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0), hdi.a);
        hdq $$3 = hev.a($$0, $$1);
        $$3.a("hat");
        return $$1;
    }

    public static hvk<hdo> b(hdk $$02, hdk $$1) {
        return hht.b($$02, $$1).a((? super T $$0) -> {
            hdq $$1 = $$0.a();
            hdq $$2 = $$1.b("head");
            $$2.a("left_ear", hdl.c(), hdi.a);
            $$2.a("right_ear", hdl.c(), hdi.a);
            return $$0;
        });
    }

    public static hdq a(hdk $$0, hdo $$1) {
        hdq $$2 = $$1.a();
        hdq $$3 = $$2.a("head", hdl.c().a(0, 0).a(-5.0f, -8.0f, -4.0f, 10.0f, 8.0f, 8.0f, $$0).a(31, 1).a(-2.0f, -4.0f, -5.0f, 4.0f, 4.0f, 1.0f, $$0).a(2, 4).a(2.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, $$0).a(2, 0).a(-3.0f, -2.0f, -5.0f, 1.0f, 2.0f, 1.0f, $$0), hdi.a);
        $$3.a("left_ear", hdl.c().a(51, 6).a(0.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, $$0), hdi.a(4.5f, -6.0f, 0.0f, 0.0f, 0.0f, -0.5235988f));
        $$3.a("right_ear", hdl.c().a(39, 6).a(-1.0f, 0.0f, -2.0f, 1.0f, 5.0f, 4.0f, $$0), hdi.a(-4.5f, -6.0f, 0.0f, 0.0f, 0.0f, 0.5235988f));
        return $$3;
    }

    @Override
    public void a(S $$0) {
        super.a($$0);
        float $$1 = ((idy)$$0).ax;
        float $$2 = ((idy)$$0).ay;
        float $$3 = 0.5235988f;
        float $$4 = ((idy)$$0).L * 0.1f + $$1 * 0.5f;
        float $$5 = 0.08f + $$2 * 0.4f;
        this.w.g = -0.5235988f - bgj.b((double)($$4 * 1.2f)) * $$5;
        this.v.g = 0.5235988f + bgj.b((double)$$4) * $$5;
    }

    @Override
    public void a(boolean $$0) {
        super.a($$0);
        this.q.k = $$0;
        this.r.k = $$0;
        this.s.k = $$0;
        this.t.k = $$0;
        this.u.k = $$0;
    }
}

