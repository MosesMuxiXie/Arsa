/*
 * Decompiled with CFR 0.152.
 */
public class hvj
extends hvh<cto, icg, gzw> {
    private static final amo a = amo.b("textures/entity/armadillo.png");

    public hvj(hwq.a $$0) {
        super($$0, new gzw($$0.a(hdf.d)), new gzw($$0.a(hdf.e)), 0.4f);
    }

    public amo a(icg $$0) {
        return a;
    }

    public icg a() {
        return new icg();
    }

    @Override
    public void a(cto $$0, icg $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gQ();
        $$1.d.a($$0.cB);
        $$1.b.a($$0.cz);
        $$1.c.a($$0.cA);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icg)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

