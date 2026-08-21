/*
 * Decompiled with CFR 0.152.
 */
public class dkx
extends dlp {
    public dkx(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        is $$2;
        dwo $$1 = $$0.q();
        eoh $$3 = $$1.a_($$2 = $$0.a());
        if (!$$3.a(dzs.gn) || $$3.c(eck.c).booleanValue()) {
            return cdc.e;
        }
        if ($$1.B_()) {
            return cdc.a;
        }
        eoh $$4 = (eoh)$$3.b(eck.c, true);
        dzq.a($$3, $$4, $$1, $$2);
        $$1.a($$2, $$4, 2);
        $$1.b($$2, dzs.gn);
        $$0.n().h(1);
        $$1.c(1503, $$2, 0);
        eom.b $$5 = eck.b().a($$1, $$2);
        if ($$5 != null) {
            is $$6 = $$5.a().b(-3, 0, -3);
            for (int $$7 = 0; $$7 < 3; ++$$7) {
                for (int $$8 = 0; $$8 < 3; ++$$8) {
                    is $$9 = $$6.b($$7, 0, $$8);
                    $$1.a($$9, true, null);
                    $$1.a($$9, dzs.gm.m(), 2);
                }
            }
            $$1.b(1038, $$6.b(1, 0, 1), 0);
        }
        return cdc.a;
    }

    @Override
    public int a(dlt $$0, chl $$1) {
        return 0;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        fti $$4 = dkx.a($$0, $$1, dvw.b.a);
        if ($$4.d() == ftk.a.b && $$0.a_($$4.b()).a(dzs.gn)) {
            return cdc.e;
        }
        $$1.c($$2);
        if ($$0 instanceof axf) {
            axf $$5 = (axf)$$0;
            is $$6 = $$5.a(beb.a, $$1.dK(), 100, false);
            if ($$6 == null) {
                return cdc.c;
            }
            ddx $$7 = new ddx($$0, $$1.dP(), $$1.f(0.5), $$1.dV());
            $$7.a($$3);
            $$7.a(ftm.a($$6));
            $$0.a(etk.K, $$7.dI(), etk.a.a($$1));
            $$0.b($$7);
            if ($$1 instanceof axg) {
                axg $$8 = (axg)$$1;
                aj.n.a($$8, $$6);
            }
            float $$9 = bgj.h($$0.y.i(), 0.33f, 0.5f);
            $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), bda.jQ, bdb.g, 1.0f, $$9);
            $$3.a(1, (chl)$$1);
            $$1.b(bdk.c.b(this));
        }
        return cdc.b;
    }
}

