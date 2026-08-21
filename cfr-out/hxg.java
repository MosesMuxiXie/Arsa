/*
 * Decompiled with CFR 0.152.
 */
public class hxg
extends hvc<daw> {
    private static final amo a = amo.b("textures/entity/hoglin/hoglin.png");

    public hxg(hwq.a $$0) {
        super($$0, hdf.bu, hdf.bv, 0.7f);
    }

    public amo a(idv $$0) {
        return a;
    }

    @Override
    public void a(daw $$0, idv $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b = $$0.gR();
    }

    @Override
    protected boolean b(idv $$0) {
        return super.a($$0) || $$0.b;
    }

    @Override
    protected /* synthetic */ boolean a(ieh ieh2) {
        return this.b((idv)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idv)ieh2);
    }
}

