/*
 * Decompiled with CFR 0.152.
 */
public class dkt
extends dlp
implements dmn {
    public static final float a = 1.5f;

    public dkt(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), bda.jv, bdb.h, 0.5f, 0.4f / ($$0.G_().i() * 0.4f + 0.8f));
        if ($$0 instanceof axf) {
            axf $$4 = (axf)$$0;
            dec.a(dfb::new, $$4, $$3, $$1, 0.0f, 1.5f, 1.0f);
        }
        $$1.b(bdk.c.b(this));
        $$3.a(1, (chl)$$1);
        return cdc.a;
    }

    @Override
    public dec a(dwo $$0, jn $$1, dlt $$2, iz $$3) {
        return new dfb($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
    }
}

