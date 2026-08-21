/*
 * Decompiled with CFR 0.152.
 */
public class hzm
extends hvh<cxs, ifo, hcu> {
    private static final amo a = amo.b("textures/entity/turtle/big_sea_turtle.png");

    public hzm(hwq.a $$0) {
        super($$0, new hcu($$0.a(hdf.dQ)), new hcu($$0.a(hdf.dR)), 0.7f);
    }

    protected float a(ifo $$0) {
        float $$1 = super.g($$0);
        if ($$0.aE) {
            return $$1 * 0.83f;
        }
        return $$1;
    }

    public ifo b() {
        return new ifo();
    }

    @Override
    public void a(cxs $$0, ifo $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = !$$0.by() && $$0.aV();
        $$1.b = $$0.gP();
        $$1.c = !$$0.e_() && $$0.p();
    }

    @Override
    public amo b(ifo $$0) {
        return a;
    }

    @Override
    protected /* synthetic */ float g(ieh ieh2) {
        return this.a((ifo)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.a((ifo)idf2);
    }
}

