/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class hht
extends gzo<ick> {
    protected static final String q = "left_sleeve";
    protected static final String r = "right_sleeve";
    protected static final String s = "left_pants";
    protected static final String t = "right_pants";
    private final List<hdg> z;
    public final hdg u;
    public final hdg v;
    public final hdg w;
    public final hdg x;
    public final hdg y;
    private final boolean A;

    public hht(hdg $$0, boolean $$1) {
        super($$0, ijt::j);
        this.A = $$1;
        this.u = this.l.b(q);
        this.v = this.k.b(r);
        this.w = this.n.b(s);
        this.x = this.m.b(t);
        this.y = this.j.b("jacket");
        this.z = List.of(this.h, this.j, this.l, this.k, this.n, this.m);
    }

    public static hdo a(hdk $$0, boolean $$1) {
        hdo $$2 = gzo.a($$0, 0.0f);
        hdq $$3 = $$2.a();
        float $$4 = 0.25f;
        if ($$1) {
            hdq $$5 = $$3.a("left_arm", hdl.c().a(32, 48).a(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0), hdi.a(5.0f, 2.0f, 0.0f));
            hdq $$6 = $$3.a("right_arm", hdl.c().a(40, 16).a(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0), hdi.a(-5.0f, 2.0f, 0.0f));
            $$5.a(q, hdl.c().a(48, 48).a(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0.a(0.25f)), hdi.a);
            $$6.a(r, hdl.c().a(40, 32).a(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, $$0.a(0.25f)), hdi.a);
        } else {
            hdq $$7 = $$3.a("left_arm", hdl.c().a(32, 48).a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(5.0f, 2.0f, 0.0f));
            hdq $$8 = $$3.b("right_arm");
            $$7.a(q, hdl.c().a(48, 48).a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), hdi.a);
            $$8.a(r, hdl.c().a(40, 32).a(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), hdi.a);
        }
        hdq $$9 = $$3.a("left_leg", hdl.c().a(16, 48).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(1.9f, 12.0f, 0.0f));
        hdq $$10 = $$3.b("right_leg");
        $$9.a(s, hdl.c().a(0, 48).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), hdi.a);
        $$10.a(t, hdl.c().a(0, 32).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.25f)), hdi.a);
        hdq $$11 = $$3.b("body");
        $$11.a("jacket", hdl.c().a(16, 32).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0.a(0.25f)), hdi.a);
        return $$2;
    }

    public static hvk<hdo> b(hdk $$02, hdk $$1) {
        return gzo.a($$02, $$1).a((? super T $$0) -> {
            hdq $$1 = $$0.a();
            hdq $$2 = $$1.b("left_arm");
            hdq $$3 = $$1.b("right_arm");
            $$2.a(q, hdl.c(), hdi.a);
            $$3.a(r, hdl.c(), hdi.a);
            hdq $$4 = $$1.b("left_leg");
            hdq $$5 = $$1.b("right_leg");
            $$4.a(s, hdl.c(), hdi.a);
            $$5.a(t, hdl.c(), hdi.a);
            hdq $$6 = $$1.b("body");
            $$6.a("jacket", hdl.c(), hdi.a);
            return $$0;
        });
    }

    @Override
    public void a(ick $$0) {
        boolean $$1;
        this.j.k = $$1 = !$$0.p;
        this.k.k = $$1;
        this.l.k = $$1;
        this.m.k = $$1;
        this.n.k = $$1;
        this.i.k = $$0.q;
        this.y.k = $$0.r;
        this.w.k = $$0.s;
        this.x.k = $$0.t;
        this.u.k = $$0.u;
        this.v.k = $$0.v;
        super.a($$0);
    }

    @Override
    public void a(boolean $$0) {
        super.a($$0);
        this.u.k = $$0;
        this.v.k = $$0;
        this.w.k = $$0;
        this.x.k = $$0;
        this.y.k = $$0;
    }

    @Override
    public void a(ick $$0, chb $$1, fzm $$2) {
        this.b().a($$2);
        hdg $$3 = this.a($$1);
        if (this.A) {
            float $$4 = 0.5f * (float)($$1 == chb.b ? 1 : -1);
            $$3.b += $$4;
            $$3.a($$2);
            $$3.b -= $$4;
        } else {
            $$3.a($$2);
        }
    }

    public hdg a(bgr $$0) {
        return bhs.a(this.z, $$0);
    }
}

