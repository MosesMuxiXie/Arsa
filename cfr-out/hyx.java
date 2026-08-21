/*
 * Decompiled with CFR 0.152.
 */
public class hyx
extends hxx<dag, ifd, hfj> {
    public static final amo a = amo.b("textures/entity/slime/slime.png");

    public hyx(hwq.a $$0) {
        super($$0, new hfj($$0.a(hdf.dp)), 0.25f);
        this.a(new ibp(this, $$0.f()));
    }

    protected float a(ifd $$0) {
        return (float)$$0.b * 0.25f;
    }

    @Override
    protected void a(ifd $$0, fzm $$1) {
        float $$2 = 0.999f;
        $$1.b(0.999f, 0.999f, 0.999f);
        $$1.a(0.0f, 0.001f, 0.0f);
        float $$3 = $$0.b;
        float $$4 = $$0.a / ($$3 * 0.5f + 1.0f);
        float $$5 = 1.0f / ($$4 + 1.0f);
        $$1.b($$5 * $$3, 1.0f / $$5 * $$3, $$5 * $$3);
    }

    @Override
    public amo b(ifd $$0) {
        return a;
    }

    public ifd b() {
        return new ifd();
    }

    @Override
    public void a(dag $$0, ifd $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = bgj.h($$2, $$0.f, $$0.e);
        $$1.b = $$0.gR();
    }

    @Override
    protected /* synthetic */ float g(ieh ieh2) {
        return this.a((ifd)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.a((ifd)idf2);
    }
}

