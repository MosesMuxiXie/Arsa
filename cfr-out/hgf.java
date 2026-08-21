/*
 * Decompiled with CFR 0.152.
 */
public class hgf
extends gzo<ici> {
    public hgf(hdg $$0) {
        super($$0);
    }

    public static hvk<hdm> b(hdk $$02, hdk $$1) {
        return hgf.a(hgf::a, $$02, $$1).a((? super T $$0) -> hdm.a($$0, 64, 32));
    }

    private static hdo a(hdk $$0) {
        hdo $$1 = gzo.a($$0, 0.0f);
        hdq $$2 = $$1.a();
        hdq $$3 = $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), hdi.a(0.0f, 1.0f, 0.0f));
        $$3.a("hat", hdl.c().a(32, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0.a(0.5f)), hdi.a);
        $$2.a("right_leg", hdl.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(-0.1f)), hdi.a(-1.9f, 11.0f, 0.0f));
        $$2.a("left_leg", hdl.c().a(0, 16).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(-0.1f)), hdi.a(1.9f, 11.0f, 0.0f));
        return $$1;
    }

    @Override
    public void a(ici $$0) {
        super.a($$0);
        this.h.e = (float)Math.PI / 180 * $$0.p.a();
        this.h.f = (float)Math.PI / 180 * $$0.p.b();
        this.h.g = (float)Math.PI / 180 * $$0.p.c();
        this.j.e = (float)Math.PI / 180 * $$0.q.a();
        this.j.f = (float)Math.PI / 180 * $$0.q.b();
        this.j.g = (float)Math.PI / 180 * $$0.q.c();
        this.l.e = (float)Math.PI / 180 * $$0.r.a();
        this.l.f = (float)Math.PI / 180 * $$0.r.b();
        this.l.g = (float)Math.PI / 180 * $$0.r.c();
        this.k.e = (float)Math.PI / 180 * $$0.s.a();
        this.k.f = (float)Math.PI / 180 * $$0.s.b();
        this.k.g = (float)Math.PI / 180 * $$0.s.c();
        this.n.e = (float)Math.PI / 180 * $$0.t.a();
        this.n.f = (float)Math.PI / 180 * $$0.t.b();
        this.n.g = (float)Math.PI / 180 * $$0.t.c();
        this.m.e = (float)Math.PI / 180 * $$0.u.a();
        this.m.f = (float)Math.PI / 180 * $$0.u.b();
        this.m.g = (float)Math.PI / 180 * $$0.u.c();
    }
}

