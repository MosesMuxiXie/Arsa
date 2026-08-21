/*
 * Decompiled with CFR 0.152.
 */
public class dlw {
    public static cdc a(dwo $$0, ddm $$1, cdb $$2) {
        $$1.c($$2);
        return cdc.c;
    }

    public static dlt a(dlt $$0, ddm $$1, dlt $$2, boolean $$3) {
        boolean $$4 = $$1.gv();
        if ($$3 && $$4) {
            if (!$$1.gK().j($$2)) {
                $$1.gK().g($$2);
            }
            return $$0;
        }
        $$0.a(1, (chl)$$1);
        if ($$0.f()) {
            return $$2;
        }
        if (!$$1.gK().g($$2)) {
            $$1.a($$2, false);
        }
        return $$0;
    }

    public static dlt a(dlt $$0, ddm $$1, dlt $$2) {
        return dlw.a($$0, $$1, $$2, true);
    }

    public static void a(czl $$0, Iterable<dlt> $$1) {
        dwo $$22 = $$0.ao();
        if ($$22.B_()) {
            return;
        }
        $$1.forEach($$2 -> $$22.b(new czl($$22, $$0.dP(), $$0.dR(), $$0.dV(), (dlt)$$2)));
    }
}

