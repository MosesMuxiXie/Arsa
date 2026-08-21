/*
 * Decompiled with CFR 0.152.
 */
public class dkv
extends dlp {
    public dkv(dlp.a $$0) {
        super($$0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        void $$5;
        dlt $$3 = $$1.b($$2);
        if (!($$0 instanceof axf)) {
            return cdc.a;
        }
        axf $$4 = (axf)$$0;
        $$3.a(1, (chl)$$1);
        $$1.b(bdk.c.b(this));
        $$5.a(null, $$1, bda.DM, $$1.dB(), 1.0f, 1.0f);
        dlt $$6 = dmg.a((axf)$$5, $$1.dO(), $$1.dU(), (byte)0, true, false);
        if ($$3.f()) {
            return cdc.a.a($$6);
        }
        if (!$$1.gK().g($$6.v())) {
            $$1.a($$6, false);
        }
        return cdc.a;
    }
}

