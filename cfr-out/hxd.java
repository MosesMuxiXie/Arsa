/*
 * Decompiled with CFR 0.152.
 */
public class hxd
extends hvh<cvy, idr, hbo> {
    private static final amo a = amo.b("textures/entity/goat/goat.png");

    public hxd(hwq.a $$0) {
        super($$0, new hbo($$0.a(hdf.bl)), new hbo($$0.a(hdf.bm)), 0.7f);
    }

    public amo a(idr $$0) {
        return a;
    }

    public idr b() {
        return new idr();
    }

    @Override
    public void a(cvy $$0, idr $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gR();
        $$1.b = $$0.gS();
        $$1.c = $$0.he();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idr)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

