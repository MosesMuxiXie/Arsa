/*
 * Decompiled with CFR 0.152.
 */
public class hvs
extends hvf<dbw, icq> {
    private static final amo a = amo.b("textures/entity/skeleton/bogged.png");
    private static final amo i = amo.b("textures/entity/skeleton/bogged_overlay.png");

    public hvs(hwq.a $$0) {
        super($$0, hdf.E, new hff($$0.a(hdf.D)));
        this.a(new ibo<icq, hfg<icq>>(this, $$0.f(), hdf.F, i));
    }

    public amo a(icq $$0) {
        return a;
    }

    public icq a() {
        return new icq();
    }

    @Override
    public void a(dbw $$0, icq $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gU();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icq)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

