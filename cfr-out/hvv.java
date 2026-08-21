/*
 * Decompiled with CFR 0.152.
 */
public class hvv
extends hvh<cty, ics, had> {
    private static final amo a = amo.b("textures/entity/camel/camel.png");

    public hvv(hwq.a $$0) {
        super($$0, new had($$0.a(hdf.K)), new had($$0.a(hdf.L)), 0.7f);
        this.a(this.a($$0));
    }

    protected ibn<ics, had, hae> a(hwq.a $$02) {
        return new ibn<ics, had, hae>(this, $$02.h(), inr.d.i, $$0 -> $$0.a, new hae($$02.a(hdf.M)), new hae($$02.a(hdf.N)));
    }

    public amo a(ics $$0) {
        return a;
    }

    public ics a() {
        return new ics();
    }

    @Override
    public void a(cty $$0, ics $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.a(cgv.h).v();
        $$1.b = $$0.cr();
        $$1.c = Math.max((float)$$0.c() - $$2, 0.0f);
        $$1.d.a($$0.cB);
        $$1.e.a($$0.cC);
        $$1.f.a($$0.cD);
        $$1.g.a($$0.cE);
        $$1.h.a($$0.cF);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ics)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

