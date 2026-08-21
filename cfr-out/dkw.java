/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dkw
extends dlp {
    public dkw(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        double $$7;
        double $$6;
        is $$2;
        dwo $$1 = $$0.q();
        eoh $$3 = $$1.a_($$2 = $$0.a());
        if (!$$3.a(dzs.cK) && !$$3.a(dzs.I)) {
            return cdc.d;
        }
        is $$4 = $$2.d();
        if (!$$1.A($$4)) {
            return cdc.d;
        }
        double $$5 = $$4.u();
        List<cgk> $$8 = $$1.a_(null, new fth($$5, $$6 = (double)$$4.v(), $$7 = (double)$$4.w(), $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
        if (!$$8.isEmpty()) {
            return cdc.d;
        }
        if ($$1 instanceof axf) {
            cyb $$9 = new cyb($$1, $$5 + 0.5, $$6, $$7 + 0.5);
            $$9.a(false);
            $$1.b($$9);
            $$1.a((cgk)$$0.o(), etk.t, $$4);
            esk $$10 = ((axf)$$1).K();
            if ($$10 != null) {
                $$10.g();
            }
        }
        $$0.n().h(1);
        return cdc.a;
    }
}

