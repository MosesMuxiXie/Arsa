/*
 * Decompiled with CFR 0.152.
 */
public class dlc
extends dlp {
    public dlc(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        if ($$1.cx != null) {
            if (!$$0.B_()) {
                int $$4 = $$1.cx.a($$3);
                $$3.a($$4, (chl)$$1, $$2.a());
            }
            $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), bda.kK, bdb.g, 1.0f, 0.4f / ($$0.G_().i() * 0.4f + 0.8f));
            $$3.a((cgk)$$1, etk.C);
        } else {
            $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), bda.kM, bdb.g, 0.5f, 0.4f / ($$0.G_().i() * 0.4f + 0.8f));
            if ($$0 instanceof axf) {
                axf $$5 = (axf)$$0;
                int $$6 = (int)(dsq.b($$5, $$3, $$1) * 20.0f);
                int $$7 = dsq.a($$5, $$3, $$1);
                dec.a(new ddz($$1, $$0, $$7, $$6), $$5, $$3);
            }
            $$1.b(bdk.c.b(this));
            $$3.a((cgk)$$1, etk.D);
        }
        return cdc.a;
    }
}

