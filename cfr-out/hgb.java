/*
 * Decompiled with CFR 0.152.
 */
public class hgb<S extends ifz>
extends gzo<S>
implements gzr<S> {
    public hgb(hdg $$0) {
        super($$0);
    }

    public static hdm e() {
        hdo $$0 = gzo.a(hdk.a, 0.0f);
        hdq $$1 = $$0.a();
        hdq $$2 = $$1.a("head", new hdl().a(0, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f).a(24, 0).a(-1.0f, -3.0f, -6.0f, 2.0f, 4.0f, 2.0f), hdi.a);
        hdq $$3 = $$2.a("hat", hdl.c().a(32, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, new hdk(0.5f)), hdi.a);
        $$3.a("hat_rim", hdl.c().a(30, 47).a(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f), hdi.b(-1.5707964f, 0.0f, 0.0f));
        $$1.a("body", hdl.c().a(16, 20).a(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f).a(0, 38).a(-4.0f, 0.0f, -3.0f, 8.0f, 20.0f, 6.0f, new hdk(0.05f)), hdi.a);
        $$1.a("right_arm", hdl.c().a(44, 22).a(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(-5.0f, 2.0f, 0.0f));
        $$1.a("left_arm", hdl.c().a(44, 22).a().a(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(5.0f, 2.0f, 0.0f));
        $$1.a("right_leg", hdl.c().a(0, 22).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(-2.0f, 12.0f, 0.0f));
        $$1.a("left_leg", hdl.c().a(0, 22).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), hdi.a(2.0f, 12.0f, 0.0f));
        return hdm.a($$0, 64, 64);
    }

    public static hdm f() {
        return hgb.e().a((hdo $$0) -> {
            $$0.a().a("head").a();
            return $$0;
        });
    }

    public static hvk<hdm> b(hdk $$02, hdk $$1) {
        return hgb.a(hgb::a, $$02, $$1).a((? super T $$0) -> hdm.a($$0, 64, 32));
    }

    private static hdo a(hdk $$0) {
        hdo $$1 = gzo.a($$0, 0.0f);
        hdq $$2 = $$1.a();
        hdq $$3 = $$2.a("head", hdl.c().a(0, 0).a(-4.0f, -10.0f, -4.0f, 8.0f, 8.0f, 8.0f, $$0), hdi.a);
        $$2.a("body", hdl.c().a(16, 16).a(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, $$0.a(0.1f)), hdi.a);
        $$2.a("right_leg", hdl.c().a(0, 16).a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.1f)), hdi.a(-2.0f, 12.0f, 0.0f));
        $$2.a("left_leg", hdl.c().a(0, 16).a().a(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, $$0.a(0.1f)), hdi.a(2.0f, 12.0f, 0.0f));
        $$3.b("hat").a("hat_rim", hdl.c(), hdi.a);
        return $$1;
    }

    @Override
    public void a(S $$0) {
        super.a($$0);
        gzj.a(this.l, this.k, ((ifz)$$0).a, $$0);
    }

    @Override
    public void a(ifz $$0, fzm $$1) {
        this.a($$0, chb.b, $$1);
    }
}

