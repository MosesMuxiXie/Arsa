/*
 * Decompiled with CFR 0.152.
 */
public class hfy
extends hga<ify> {
    public hfy(hdg $$0) {
        super($$0);
    }

    public static hdm a(hdk $$0) {
        hdo $$1 = gzo.a($$0, 0.0f);
        hdq $$2 = $$1.a();
        $$2.a("left_arm", hdl.c().a(32, 48).a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(5.0f, 2.0f, 0.0f));
        $$2.a("left_leg", hdl.c().a(16, 48).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0), hdi.a(1.9f, 12.0f, 0.0f));
        return hdm.a($$1, 64, 64);
    }

    @Override
    public void a(ify $$0) {
        float $$1;
        super.a($$0);
        if ($$0.i == gzo.a.e) {
            this.l.e = this.l.e * 0.5f - (float)Math.PI;
            this.l.f = 0.0f;
        }
        if ($$0.f == gzo.a.e) {
            this.k.e = this.k.e * 0.5f - (float)Math.PI;
            this.k.f = 0.0f;
        }
        if (($$1 = $$0.ab) > 0.0f) {
            this.k.e = bgj.j($$1, this.k.e, -2.5132742f) + $$1 * 0.35f * bgj.a((double)(0.1f * $$0.L));
            this.l.e = bgj.j($$1, this.l.e, -2.5132742f) - $$1 * 0.35f * bgj.a((double)(0.1f * $$0.L));
            this.k.g = bgj.j($$1, this.k.g, -0.15f);
            this.l.g = bgj.j($$1, this.l.g, 0.15f);
            this.n.e -= $$1 * 0.55f * bgj.a((double)(0.1f * $$0.L));
            this.m.e += $$1 * 0.55f * bgj.a((double)(0.1f * $$0.L));
            this.h.e = 0.0f;
        }
    }
}

