/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dke
extends dlp {
    public dke(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dwo $$02, ddm $$1, cdb $$2) {
        List<cga> $$3 = $$02.a(cga.class, $$1.dj().g(2.0), (? super T $$0) -> $$0.cb() && $$0.n() instanceof cyc);
        dlt $$4 = $$1.b($$2);
        if (!$$3.isEmpty()) {
            cga $$5 = $$3.get(0);
            $$5.a($$5.c() - 0.5f);
            $$02.a(null, $$1.dP(), $$1.dR(), $$1.dV(), bda.cP, bdb.g, 1.0f, 1.0f);
            $$02.a((cgk)$$1, etk.y, $$1.dI());
            if ($$1 instanceof axg) {
                axg $$6 = (axg)$$1;
                aj.U.a($$6, $$4, $$5);
            }
            return cdc.a.a(this.a($$4, $$1, new dlt(dlx.xC)));
        }
        fti $$7 = dke.a($$02, $$1, dvw.b.b);
        if ($$7.d() == ftk.a.a) {
            return cdc.e;
        }
        if ($$7.d() == ftk.a.b) {
            is $$8 = $$7.b();
            if (!$$02.a((cgk)$$1, $$8)) {
                return cdc.e;
            }
            if ($$02.b_($$8).a(bdv.a)) {
                $$02.a((cgk)$$1, $$1.dP(), $$1.dR(), $$1.dV(), bda.cO, bdb.g, 1.0f, 1.0f);
                $$02.a((cgk)$$1, etk.y, $$8);
                return cdc.a.a(this.a($$4, $$1, dnr.a(dlx.up, dns.a)));
            }
        }
        return cdc.e;
    }

    protected dlt a(dlt $$0, ddm $$1, dlt $$2) {
        $$1.b(bdk.c.b(this));
        return dlw.a($$0, $$1, $$2);
    }
}

