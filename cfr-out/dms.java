/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dms
extends dlp {
    public dms(dlp.a $$0) {
        super($$0);
    }

    public static dpc a() {
        je<dzq> $$0 = mi.a(mi.e);
        return new dpc(List.of(dpc.a.a(jh.a(dzs.bz.p()), 15.0f), dpc.a.b($$0.b(bdp.M), 15.0f), dpc.a.b($$0.b(bdp.a), 5.0f), dpc.a.b(jh.a(dzs.fN.p(), dzs.fO.p()), 2.0f)), 1.0f, 1, true);
    }

    @Override
    public boolean a(dlt $$0, dwo $$1, eoh $$2, is $$3, chl $$4) {
        dpc $$5 = $$0.a(ki.D);
        if ($$5 == null) {
            return false;
        }
        if (!$$1.B_() && !$$2.a(bdp.aY) && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, cgv.a);
        }
        return true;
    }

    @Override
    public cdc a(dpw $$0) {
        edl $$5;
        is $$2;
        dwo $$1 = $$0.q();
        eoh $$3 = $$1.a_($$2 = $$0.a());
        dzq $$4 = $$3.b();
        if ($$4 instanceof edl && !($$5 = (edl)$$4).r($$3)) {
            ddm $$6 = $$0.o();
            dlt $$7 = $$0.n();
            if ($$6 instanceof axg) {
                aj.O.a((axg)$$6, $$2, $$7);
            }
            $$1.a((cgk)$$6, $$2, bda.nf, bdb.e, 1.0f, 1.0f);
            eoh $$8 = $$5.q($$3);
            $$1.c($$2, $$8);
            $$1.a(etk.c, $$2, etk.a.a($$0.o(), $$8));
            if ($$6 != null) {
                $$7.a(1, (chl)$$6, $$0.p().a());
            }
            return cdc.a;
        }
        return super.a($$0);
    }
}

