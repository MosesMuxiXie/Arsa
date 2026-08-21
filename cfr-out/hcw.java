/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class hcw
extends gzm<ifx> {
    public static final hdp b = new gzl(Set.of("head"));
    private static final String c = "real_head";
    private static final String d = "upper_body";
    private static final String e = "real_tail";
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private final hdg i;
    private final hdg j;
    private final hdg k;
    private final hdg l;
    private final hdg m;
    private final hdg n;
    private final hdg q;
    private static final int r = 8;

    public hcw(hdg $$0) {
        super($$0);
        this.f = $$0.b("head");
        this.g = this.f.b(c);
        this.h = $$0.b("body");
        this.q = $$0.b(d);
        this.i = $$0.b("right_hind_leg");
        this.j = $$0.b("left_hind_leg");
        this.k = $$0.b("right_front_leg");
        this.l = $$0.b("left_front_leg");
        this.m = $$0.b("tail");
        this.n = this.m.b(e);
    }

    public static hdo a(hdk $$0) {
        hdo $$1 = new hdo();
        hdq $$2 = $$1.a();
        float $$3 = 13.5f;
        hdq $$4 = $$2.a("head", hdl.c(), hdi.a(-1.0f, 13.5f, -7.0f));
        $$4.a(c, hdl.c().a(0, 0).a(-2.0f, -3.0f, -2.0f, 6.0f, 6.0f, 4.0f, $$0).a(16, 14).a(-2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, $$0).a(16, 14).a(2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, $$0).a(0, 10).a(-0.5f, -0.001f, -5.0f, 3.0f, 3.0f, 4.0f, $$0), hdi.a);
        $$2.a("body", hdl.c().a(18, 14).a(-3.0f, -2.0f, -3.0f, 6.0f, 9.0f, 6.0f, $$0), hdi.a(0.0f, 14.0f, 2.0f, 1.5707964f, 0.0f, 0.0f));
        $$2.a(d, hdl.c().a(21, 0).a(-3.0f, -3.0f, -3.0f, 8.0f, 6.0f, 7.0f, $$0), hdi.a(-1.0f, 14.0f, -3.0f, 1.5707964f, 0.0f, 0.0f));
        hdl $$5 = hdl.c().a(0, 18).a(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, $$0);
        hdl $$6 = hdl.c().a().a(0, 18).a(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, $$0);
        $$2.a("right_hind_leg", $$6, hdi.a(-2.5f, 16.0f, 7.0f));
        $$2.a("left_hind_leg", $$5, hdi.a(0.5f, 16.0f, 7.0f));
        $$2.a("right_front_leg", $$6, hdi.a(-2.5f, 16.0f, -4.0f));
        $$2.a("left_front_leg", $$5, hdi.a(0.5f, 16.0f, -4.0f));
        hdq $$7 = $$2.a("tail", hdl.c(), hdi.a(-1.0f, 12.0f, 8.0f, 0.62831855f, 0.0f, 0.0f));
        $$7.a(e, hdl.c().a(9, 18).a(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, $$0), hdi.a);
        return $$1;
    }

    @Override
    public void a(ifx $$0) {
        super.a($$0);
        float $$1 = $$0.ax;
        float $$2 = $$0.ay;
        this.m.f = $$0.a ? 0.0f : bgj.b((double)($$1 * 0.6662f)) * 1.4f * $$2;
        if ($$0.b) {
            float $$3 = $$0.aA;
            this.q.c += 2.0f * $$3;
            this.q.e = 1.2566371f;
            this.q.f = 0.0f;
            this.h.c += 4.0f * $$3;
            this.h.d -= 2.0f * $$3;
            this.h.e = 0.7853982f;
            this.m.c += 9.0f * $$3;
            this.m.d -= 2.0f * $$3;
            this.i.c += 6.7f * $$3;
            this.i.d -= 5.0f * $$3;
            this.i.e = 4.712389f;
            this.j.c += 6.7f * $$3;
            this.j.d -= 5.0f * $$3;
            this.j.e = 4.712389f;
            this.k.e = 5.811947f;
            this.k.b += 0.01f * $$3;
            this.k.c += 1.0f * $$3;
            this.l.e = 5.811947f;
            this.l.b -= 0.01f * $$3;
            this.l.c += 1.0f * $$3;
        } else {
            this.i.e = bgj.b((double)($$1 * 0.6662f)) * 1.4f * $$2;
            this.j.e = bgj.b((double)($$1 * 0.6662f + (float)Math.PI)) * 1.4f * $$2;
            this.k.e = bgj.b((double)($$1 * 0.6662f + (float)Math.PI)) * 1.4f * $$2;
            this.l.e = bgj.b((double)($$1 * 0.6662f)) * 1.4f * $$2;
        }
        this.g.g = $$0.d + $$0.a(0.0f);
        this.q.g = $$0.a(-0.08f);
        this.h.g = $$0.a(-0.16f);
        this.n.g = $$0.a(-0.2f);
        this.f.e = $$0.av * ((float)Math.PI / 180);
        this.f.f = $$0.au * ((float)Math.PI / 180);
        this.m.e = $$0.c;
    }
}

