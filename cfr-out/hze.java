/*
 * Decompiled with CFR 0.152.
 */
public class hze
extends hvh<dah, ifh, hfn> {
    private static final amo a = amo.b("textures/entity/strider/strider.png");
    private static final amo i = amo.b("textures/entity/strider/strider_cold.png");
    private static final float j = 0.5f;

    public hze(hwq.a $$02) {
        super($$02, new hfn($$02.a(hdf.dD)), new hfn($$02.a(hdf.dF)), 0.5f);
        this.a(new ibn<ifh, hfn, hfn>(this, $$02.h(), inr.d.h, $$0 -> $$0.a, new hfn($$02.a(hdf.dE)), new hfn($$02.a(hdf.dG))));
    }

    public amo a(ifh $$0) {
        return $$0.b ? i : a;
    }

    @Override
    protected float b(ifh $$0) {
        float $$1 = super.g($$0);
        if ($$0.aE) {
            return $$1 * 0.5f;
        }
        return $$1;
    }

    public ifh b() {
        return new ifh();
    }

    @Override
    public void a(dah $$0, ifh $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.a(cgv.h).v();
        $$1.b = $$0.p();
        $$1.c = $$0.cr();
    }

    protected boolean c(ifh $$0) {
        return super.a($$0) || $$0.b;
    }

    @Override
    protected /* synthetic */ float g(ieh ieh2) {
        return this.b((ifh)ieh2);
    }

    @Override
    protected /* synthetic */ boolean a(ieh ieh2) {
        return this.c((ifh)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifh)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.b((ifh)idf2);
    }
}

