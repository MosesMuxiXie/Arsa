/*
 * Decompiled with CFR 0.152.
 */
public class dmm
extends dlp {
    public dmm(dlp.a $$0) {
        super($$0);
    }

    @Override
    public dlt m() {
        dlt $$0 = super.m();
        $$0.b(ki.Y, new dnr(dns.a));
        return $$0;
    }

    @Override
    public cdc a(dpw $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        ddm $$3 = $$0.o();
        dlt $$4 = $$0.n();
        dnr $$5 = $$4.a(ki.Y, dnr.a);
        eoh $$6 = $$1.a_($$2);
        if ($$0.k() != iz.a && $$6.a(bdp.cz) && $$5.a(dns.a)) {
            $$1.a(null, $$2, bda.lW, bdb.e, 1.0f, 1.0f);
            $$3.a($$0.p(), dlw.a($$4, $$3, new dlt(dlx.uo)));
            if (!$$1.B_()) {
                axf $$7 = (axf)$$1;
                for (int $$8 = 0; $$8 < 5; ++$$8) {
                    $$7.a(ly.aq, (double)$$2.u() + $$1.y.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.y.j(), 1, 0.0, 0.0, 0.0, 1.0);
                }
            }
            $$1.a(null, $$2, bda.cN, bdb.e, 1.0f, 1.0f);
            $$1.a(null, etk.z, $$2);
            $$1.c($$2, dzs.uh.m());
            return cdc.a;
        }
        return cdc.e;
    }

    @Override
    public yh a(dlt $$0) {
        dnr $$1 = $$0.a(ki.Y);
        return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
    }
}

