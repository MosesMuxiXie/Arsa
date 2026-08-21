/*
 * Decompiled with CFR 0.152.
 */
public class dld
extends dlp {
    public dld(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        is $$3;
        ddm $$1 = $$0.o();
        dwo $$2 = $$0.q();
        eoh $$4 = $$2.a_($$3 = $$0.a());
        if (eag.i($$4) || eah.h($$4) || eai.h($$4)) {
            $$2.a((cgk)$$1, $$3, bda.kN, bdb.e, 1.0f, $$2.G_().i() * 0.4f + 0.8f);
            $$2.a($$3, (eoh)$$4.b(eox.u, true), 11);
            $$2.a((cgk)$$1, etk.c, $$3);
            if ($$1 != null) {
                $$0.n().a(1, (chl)$$1, $$0.p().a());
            }
            return cdc.a;
        }
        is $$5 = $$3.a($$0.k());
        if (dzd.a($$2, $$5, $$0.g())) {
            $$2.a((cgk)$$1, $$5, bda.kN, bdb.e, 1.0f, $$2.G_().i() * 0.4f + 0.8f);
            eoh $$6 = dzd.a($$2, $$5);
            $$2.a($$5, $$6, 11);
            $$2.a((cgk)$$1, etk.i, $$3);
            dlt $$7 = $$0.n();
            if ($$1 instanceof axg) {
                aj.z.a((axg)$$1, $$5, $$7);
                $$7.a(1, (chl)$$1, $$0.p().a());
            }
            return cdc.a;
        }
        return cdc.d;
    }
}

