/*
 * Decompiled with CFR 0.152.
 */
public class dkz
extends dlp
implements dmn {
    public dkz(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), bda.ko, bdb.g, 0.5f, 0.4f / ($$0.G_().i() * 0.4f + 0.8f));
        if ($$0 instanceof axf) {
            axf $$4 = (axf)$$0;
            dec.a(dfd::new, $$4, $$3, $$1, -20.0f, 0.7f, 1.0f);
        }
        $$1.b(bdk.c.b(this));
        $$3.a(1, (chl)$$1);
        return cdc.a;
    }

    @Override
    public dec a(dwo $$0, jn $$1, dlt $$2, iz $$3) {
        return new dfd($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
    }

    @Override
    public dmn.a a() {
        return dmn.a.a().a(dmn.a.a.c() * 0.5f).b(dmn.a.a.d() * 1.25f).a();
    }
}

