/*
 * Decompiled with CFR 0.152.
 */
public class hfg<S extends ifc>
extends gzo<S> {
    public hfg(hdg $$0) {
        super($$0);
    }

    public static hdm f() {
        hdo $$0 = gzo.a(hdk.a, 0.0f);
        hdq $$1 = $$0.a();
        hfg.a($$1);
        return hdm.a($$0, 64, 32);
    }

    protected static void a(hdq $$0) {
        $$0.a("right_arm", hdl.c().a(40, 16).a(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), hdi.a(-5.0f, 2.0f, 0.0f));
        $$0.a("left_arm", hdl.c().a(40, 16).a().a(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), hdi.a(5.0f, 2.0f, 0.0f));
        $$0.a("right_leg", hdl.c().a(0, 16).a(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f), hdi.a(-2.0f, 12.0f, 0.0f));
        $$0.a("left_leg", hdl.c().a(0, 16).a().a(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f), hdi.a(2.0f, 12.0f, 0.0f));
    }

    public static hdm g() {
        hdo $$0 = new hdo();
        hdq $$1 = $$0.a();
        $$1.a("body", hdl.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f).a(28, 0).a(-4.0f, 10.0f, -2.0f, 8.0f, 1.0f, 4.0f).a(16, 48).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new hdk(0.025f)), hdi.a(0.0f, 0.0f, 0.0f));
        $$1.a("head", hdl.c().a(0, 0).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f).a(0, 32).a(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new hdk(0.2f)), hdi.a(0.0f, 0.0f, 0.0f)).a("hat", hdl.c(), hdi.a);
        $$1.a("right_arm", hdl.c().a(40, 16).a(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f).a(42, 33).a(-1.55f, -2.025f, -1.5f, 3.0f, 12.0f, 3.0f), hdi.a(-5.5f, 2.0f, 0.0f));
        $$1.a("left_arm", hdl.c().a(56, 16).a(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f).a(40, 48).a(-1.45f, -2.025f, -1.5f, 3.0f, 12.0f, 3.0f), hdi.a(5.5f, 2.0f, 0.0f));
        $$1.a("right_leg", hdl.c().a(0, 16).a(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f).a(0, 49).a(-1.5f, -0.0f, -1.5f, 3.0f, 12.0f, 3.0f), hdi.a(-2.0f, 12.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(0, 16).a(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f).a(4, 49).a(-1.5f, 0.0f, -1.5f, 3.0f, 12.0f, 3.0f), hdi.a(2.0f, 12.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    @Override
    public void a(S $$0) {
        super.a($$0);
        if (((ifc)$$0).b && !((ifc)$$0).d) {
            float $$1 = ((ifc)$$0).m;
            float $$2 = bgj.a((double)($$1 * (float)Math.PI));
            float $$3 = bgj.a((double)((1.0f - (1.0f - $$1) * (1.0f - $$1)) * (float)Math.PI));
            this.k.g = 0.0f;
            this.l.g = 0.0f;
            this.k.f = -(0.1f - $$2 * 0.6f);
            this.l.f = 0.1f - $$2 * 0.6f;
            this.k.e = -1.5707964f;
            this.l.e = -1.5707964f;
            this.k.e -= $$2 * 1.2f - $$3 * 0.4f;
            this.l.e -= $$2 * 1.2f - $$3 * 0.4f;
            gzj.a(this.k, this.l, ((ifc)$$0).L);
        }
    }

    @Override
    public void a(ifc $$0, chb $$1, fzm $$2) {
        this.b().a($$2);
        float $$3 = $$1 == chb.b ? 1.0f : -1.0f;
        hdg $$4 = this.a($$1);
        $$4.b += $$3;
        $$4.a($$2);
        $$4.b -= $$3;
    }
}

