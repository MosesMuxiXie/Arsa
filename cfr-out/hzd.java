/*
 * Decompiled with CFR 0.152.
 */
public class hzd
extends hvf<dbz, ifc> {
    private static final amo a = amo.b("textures/entity/skeleton/stray.png");
    private static final amo i = amo.b("textures/entity/skeleton/stray_overlay.png");

    public hzd(hwq.a $$0) {
        super($$0, hdf.dA, hdf.dB);
        this.a(new ibo<ifc, hfg<ifc>>(this, $$0.f(), hdf.dC, i));
    }

    @Override
    public amo b(ifc $$0) {
        return a;
    }

    public ifc b() {
        return new ifc();
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

