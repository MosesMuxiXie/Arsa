/*
 * Decompiled with CFR 0.152.
 */
public class hzb<T extends dcd>
extends hxx<T, ieh, hfl> {
    private static final amo a = amo.b("textures/entity/spider/spider.png");

    public hzb(hwq.a $$0) {
        this($$0, hdf.dv);
    }

    public hzb(hwq.a $$0, hde $$1) {
        super($$0, new hfl($$0.a($$1)), 0.8f);
        this.a(new ibr<hfl>(this));
    }

    @Override
    protected float bm_() {
        return 180.0f;
    }

    @Override
    public amo b(ieh $$0) {
        return a;
    }

    public ieh b() {
        return new ieh();
    }

    @Override
    public void a(T $$0, ieh $$1, float $$2) {
        super.a($$0, $$1, $$2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

