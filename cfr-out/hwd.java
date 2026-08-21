/*
 * Decompiled with CFR 0.152.
 */
public class hwd
extends hxx<czp, icy, hea> {
    private static final amo a = amo.b("textures/entity/creeper/creeper.png");

    public hwd(hwq.a $$0) {
        super($$0, new hea($$0.a(hdf.ax)), 0.5f);
        this.a(new iam(this, $$0.f()));
    }

    @Override
    protected void a(icy $$0, fzm $$1) {
        float $$2 = $$0.a;
        float $$3 = 1.0f + bgj.a((double)($$2 * 100.0f)) * $$2 * 0.01f;
        $$2 = bgj.a($$2, 0.0f, 1.0f);
        $$2 *= $$2;
        $$2 *= $$2;
        float $$4 = (1.0f + $$2 * 0.4f) * $$3;
        float $$5 = (1.0f + $$2 * 0.1f) / $$3;
        $$1.b($$4, $$5, $$4);
    }

    protected float a(icy $$0) {
        float $$1 = $$0.a;
        if ((int)($$1 * 10.0f) % 2 == 0) {
            return 0.0f;
        }
        return bgj.a($$1, 0.5f, 1.0f);
    }

    @Override
    public amo b(icy $$0) {
        return a;
    }

    public icy a() {
        return new icy();
    }

    @Override
    public void a(czp $$0, icy $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.L($$2);
        $$1.b = $$0.p();
    }

    @Override
    protected /* synthetic */ float c(ieh ieh2) {
        return this.a((icy)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

