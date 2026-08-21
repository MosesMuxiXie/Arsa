/*
 * Decompiled with CFR 0.152.
 */
public class hgg
extends hgf {
    private static final String q = "right_body_stick";
    private static final String r = "left_body_stick";
    private static final String s = "shoulder_stick";
    private static final String t = "base_plate";
    private final hdg u;
    private final hdg v;
    private final hdg w;
    private final hdg x;

    public hgg(hdg $$0) {
        super($$0);
        this.u = $$0.b(q);
        this.v = $$0.b(r);
        this.w = $$0.b(s);
        this.x = $$0.b(t);
        this.i.k = false;
    }

    public static hdm e() {
        hdo $$0 = gzo.a(hdk.a, 0.0f);
        hdq $$1 = $$0.a();
        $$1.a("head", hdl.c().a(0, 0).a(-1.0f, -7.0f, -1.0f, 2.0f, 7.0f, 2.0f), hdi.a(0.0f, 1.0f, 0.0f));
        $$1.a("body", hdl.c().a(0, 26).a(-6.0f, 0.0f, -1.5f, 12.0f, 3.0f, 3.0f), hdi.a);
        $$1.a("right_arm", hdl.c().a(24, 0).a(-2.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), hdi.a(-5.0f, 2.0f, 0.0f));
        $$1.a("left_arm", hdl.c().a(32, 16).a().a(0.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), hdi.a(5.0f, 2.0f, 0.0f));
        $$1.a("right_leg", hdl.c().a(8, 0).a(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f), hdi.a(-1.9f, 12.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(40, 16).a().a(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f), hdi.a(1.9f, 12.0f, 0.0f));
        $$1.a(q, hdl.c().a(16, 0).a(-3.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f), hdi.a);
        $$1.a(r, hdl.c().a(48, 16).a(1.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f), hdi.a);
        $$1.a(s, hdl.c().a(0, 48).a(-4.0f, 10.0f, -1.0f, 8.0f, 2.0f, 2.0f), hdi.a);
        $$1.a(t, hdl.c().a(0, 32).a(-6.0f, 11.0f, -6.0f, 12.0f, 1.0f, 12.0f), hdi.a(0.0f, 12.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(ici $$0) {
        super.a($$0);
        this.x.f = (float)Math.PI / 180 * -$$0.a;
        this.l.k = $$0.n;
        this.k.k = $$0.n;
        this.x.k = $$0.o;
        this.u.e = (float)Math.PI / 180 * $$0.q.a();
        this.u.f = (float)Math.PI / 180 * $$0.q.b();
        this.u.g = (float)Math.PI / 180 * $$0.q.c();
        this.v.e = (float)Math.PI / 180 * $$0.q.a();
        this.v.f = (float)Math.PI / 180 * $$0.q.b();
        this.v.g = (float)Math.PI / 180 * $$0.q.c();
        this.w.e = (float)Math.PI / 180 * $$0.q.a();
        this.w.f = (float)Math.PI / 180 * $$0.q.b();
        this.w.g = (float)Math.PI / 180 * $$0.q.c();
    }

    @Override
    public void a(ici $$0, chb $$1, fzm $$2) {
        hdg $$3 = this.a($$1);
        boolean $$4 = $$3.k;
        $$3.k = true;
        super.a($$0, $$1, $$2);
        $$3.k = $$4;
    }
}

