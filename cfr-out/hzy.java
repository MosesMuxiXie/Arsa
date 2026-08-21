/*
 * Decompiled with CFR 0.152.
 */
public class hzy
extends hvh<cxu, ifx, hcw> {
    public hzy(hwq.a $$0) {
        super($$0, new hcw($$0.a(hdf.eq)), new hcw($$0.a(hdf.es)), 0.5f);
        this.a(new ibz(this, $$0.f(), $$0.h()));
        this.a(new ica(this));
    }

    protected int a(ifx $$0) {
        float $$1 = $$0.f;
        if ($$1 == 1.0f) {
            return -1;
        }
        return bel.a(1.0f, $$1, $$1, $$1);
    }

    @Override
    public amo b(ifx $$0) {
        return $$0.g;
    }

    public ifx b() {
        return new ifx();
    }

    @Override
    public void a(cxu $$0, ifx $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.ab_();
        $$1.b = $$0.gQ();
        $$1.c = $$0.hf();
        $$1.d = $$0.N($$2);
        $$1.e = $$0.M($$2);
        $$1.g = $$0.hd();
        $$1.f = $$0.L($$2);
        $$1.h = $$0.p() ? $$0.hg() : null;
        $$1.i = $$0.ak().v();
    }

    @Override
    protected /* synthetic */ int f(ieh ieh2) {
        return this.a((ifx)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

