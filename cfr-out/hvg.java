/*
 * Decompiled with CFR 0.152.
 */
public abstract class hvg<T extends dcn, S extends ify, M extends hga<S>>
extends hxi<T, S, M> {
    private static final amo a = amo.b("textures/entity/zombie/zombie.png");

    protected hvg(hwq.a $$0, M $$1, M $$2, hvk<M> $$3, hvk<M> $$4) {
        super($$0, $$1, $$2, 0.5f);
        this.a(new iay(this, $$3, $$4, $$0.h()));
    }

    public amo a(S $$0) {
        return a;
    }

    @Override
    public void a(T $$0, S $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ((ify)$$1).a = ((chn)$$0).gI();
        ((ify)$$1).b = ((dcn)$$0).gU();
    }

    @Override
    protected boolean b(S $$0) {
        return super.a($$0) || ((ify)$$0).b;
    }

    @Override
    protected gzo.a a(T $$0, chb $$1) {
        dpb $$2 = ((chl)$$0).b($$1.a()).a(ki.P);
        if ($$2 != null && $$2.a() == dnf.c) {
            return gzo.a.k;
        }
        return super.a($$0, $$1);
    }

    @Override
    protected /* synthetic */ boolean a(ieh ieh2) {
        return this.b((S)((ify)ieh2));
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((S)((ify)ieh2));
    }
}

