/*
 * Decompiled with CFR 0.152.
 */
public class hxb
extends hxx<czw, ify, gzo<ify>> {
    private static final amo a = amo.b("textures/entity/zombie/zombie.png");

    public hxb(hwq.a $$0, float $$1) {
        super($$0, new hfz($$0.a(hdf.bh)), 0.5f * $$1);
        this.a(new ibb<ify, gzo<ify>>(this));
        this.a(new iay<ify, gzo<ify>, hfz>(this, hvk.a(hdf.bi, $$0.f(), hfz::new), $$0.h()));
    }

    public amo a(ify $$0) {
        return a;
    }

    public ify b() {
        return new ify();
    }

    @Override
    public void a(czw $$0, ify $$1, float $$2) {
        super.a($$0, $$1, $$2);
        hxi.a($$0, $$1, $$2, this.g);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ify)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

