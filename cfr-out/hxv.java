/*
 * Decompiled with CFR 0.152.
 */
public class hxv
extends hxx<czy, ifd, hfi> {
    private static final amo a = amo.b("textures/entity/slime/magmacube.png");

    public hxv(hwq.a $$0) {
        super($$0, new hfi($$0.a(hdf.bR)), 0.25f);
    }

    @Override
    protected int a(czy $$0, is $$1) {
        return 15;
    }

    public amo a(ifd $$0) {
        return a;
    }

    public ifd b() {
        return new ifd();
    }

    @Override
    public void a(czy $$0, ifd $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = bgj.h($$2, $$0.f, $$0.e);
        $$1.b = $$0.gR();
    }

    @Override
    protected float b(ifd $$0) {
        return (float)$$0.b * 0.25f;
    }

    @Override
    protected void a(ifd $$0, fzm $$1) {
        int $$2 = $$0.b;
        float $$3 = $$0.a / ((float)$$2 * 0.5f + 1.0f);
        float $$4 = 1.0f / ($$3 + 1.0f);
        $$1.b($$4 * (float)$$2, 1.0f / $$4 * (float)$$2, $$4 * (float)$$2);
    }

    @Override
    protected /* synthetic */ float g(ieh ieh2) {
        return this.b((ifd)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifd)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.b((ifd)idf2);
    }
}

