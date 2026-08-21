/*
 * Decompiled with CFR 0.152.
 */
public class hyz
extends hxx<cwi, iff, hbs> {
    private static final amo a = amo.b("textures/entity/snow_golem.png");

    public hyz(hwq.a $$0) {
        super($$0, new hbs($$0.a(hdf.dt)), 0.5f);
        this.a(new ibq(this, $$0.d()));
    }

    public amo a(iff $$0) {
        return a;
    }

    public iff b() {
        return new iff();
    }

    @Override
    public void a(cwi $$0, iff $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.p();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iff)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

