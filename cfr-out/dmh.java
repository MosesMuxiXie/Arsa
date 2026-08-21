/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dmh
extends dlp {
    private final cgu<? extends dgi> a;

    public dmh(cgu<? extends dgi> $$0, dlp.a $$1) {
        super($$1);
        this.a = $$0;
    }

    @Override
    public cdc a(dpw $$0) {
        is $$2;
        dwo $$1 = $$0.q();
        eoh $$3 = $$1.a_($$2 = $$0.a());
        if (!$$3.a(bdp.L)) {
            return cdc.d;
        }
        dlt $$4 = $$0.n();
        epl $$5 = $$3.b() instanceof dzf ? $$3.c(((dzf)$$3.b()).c()) : epl.a;
        double $$6 = 0.0;
        if ($$5.b()) {
            $$6 = 0.5;
        }
        ftm $$7 = new ftm((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
        dgi $$8 = dgi.a($$1, $$7.g, $$7.h, $$7.i, this.a, cgt.o, $$4, $$0.o());
        if ($$8 == null) {
            return cdc.d;
        }
        if (dgi.b($$1)) {
            List<cgk> $$9 = $$1.a_(null, $$8.dj());
            for (cgk $$10 : $$9) {
                if (!($$10 instanceof dgi)) continue;
                return cdc.d;
            }
        }
        if ($$1 instanceof axf) {
            axf $$11 = (axf)$$1;
            $$11.b($$8);
            $$11.a(etk.t, $$2, etk.a.a($$0.o(), $$11.a_($$2.e())));
        }
        $$4.h(1);
        return cdc.a;
    }
}

