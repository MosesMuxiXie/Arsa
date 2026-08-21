/*
 * Decompiled with CFR 0.152.
 */
public class iac
extends hxi<dco, ifz, hgb<ifz>> {
    private static final amo a = amo.b("textures/entity/zombie_villager/zombie_villager.png");

    public iac(hwq.a $$0) {
        super($$0, new hgb($$0.a(hdf.eF)), new hgb($$0.a(hdf.eH)), 0.5f, hzp.a);
        this.a(new iay<ifz, hgb<ifz>, hgb>(this, hvk.a(hdf.eK, $$0.f(), hgb::new), hvk.a(hdf.eJ, $$0.f(), hgb::new), $$0.h()));
        this.a(new ibv(this, $$0.e(), "zombie_villager", new hgb($$0.a(hdf.eG)), new hgb($$0.a(hdf.eI))));
    }

    public amo a(ifz $$0) {
        return a;
    }

    public ifz b() {
        return new ifz();
    }

    @Override
    public void a(dco $$0, ifz $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.b = $$0.gS();
        $$1.c = $$0.gZ();
        $$1.a = $$0.gI();
    }

    @Override
    protected boolean b(ifz $$0) {
        return super.a($$0) || $$0.b;
    }

    @Override
    protected /* synthetic */ boolean a(ieh ieh2) {
        return this.b((ifz)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifz)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

