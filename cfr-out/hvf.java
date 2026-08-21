/*
 * Decompiled with CFR 0.152.
 */
public abstract class hvf<T extends dbv, S extends ifc>
extends hxi<T, S, hfg<S>> {
    public hvf(hwq.a $$0, hde $$1, hvk<hde> $$2) {
        this($$0, $$2, new hfg($$0.a($$1)));
    }

    public hvf(hwq.a $$0, hvk<hde> $$1, hfg<S> $$2) {
        super($$0, $$2, 0.5f);
        this.a((S)new iay(this, hvk.a($$1, $$0.f(), hfg::new), $$0.h()));
    }

    @Override
    public void a(T $$0, S $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ((ifc)$$1).b = ((chn)$$0).gI();
        ((ifc)$$1).c = ((dbv)$$0).gS();
        ((ifc)$$1).d = ((chl)$$0).fx().a(dlx.pW);
    }

    @Override
    protected boolean a(S $$0) {
        return ((ifc)$$0).c;
    }

    @Override
    protected gzo.a a(T $$0, chb $$1) {
        if (((chn)$$0).at() == $$1 && ((chn)$$0).gI() && ((chl)$$0).fx().a(dlx.pW)) {
            return gzo.a.d;
        }
        return super.a($$0, $$1);
    }
}

