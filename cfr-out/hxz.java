/*
 * Decompiled with CFR 0.152.
 */
public class hxz<T extends cwn>
extends hvh<T, ien, hby> {
    private static final amo a = amo.b("textures/entity/nautilus/nautilus.png");
    private static final amo i = amo.b("textures/entity/nautilus/nautilus_baby.png");

    public hxz(hwq.a $$02) {
        super($$02, new hby($$02.a(hdf.cb)), new hby($$02.a(hdf.cc)), 0.7f);
        this.a(new ibn<ien, hby, Object>(this, $$02.h(), inr.d.r, $$0 -> $$0.b, new hbx($$02.a(hdf.ce)), null));
        this.a(new ibn<ien, hby, Object>(this, $$02.h(), inr.d.q, $$0 -> $$0.a, new hbz($$02.a(hdf.cd)), null));
    }

    public amo a(ien $$0) {
        return $$0.aE ? i : a;
    }

    public ien b() {
        return new ien();
    }

    @Override
    public void a(T $$0, ien $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = ((chl)$$0).a(cgv.h).v();
        $$1.b = ((chn)$$0).ak().v();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ien)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

