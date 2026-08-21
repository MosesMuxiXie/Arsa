/*
 * Decompiled with CFR 0.152.
 */
public class li
extends lf {
    private final lf c = new lf();
    private final cgu<? extends dgi> d;

    public li(cgu<? extends dgi> $$0) {
        this.d = $$0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dlt a(ld $$0, dlt $$1) {
        void $$16;
        iz $$2 = $$0.d().c(eby.b);
        axf $$3 = $$0.b();
        ftm $$4 = $$0.a();
        double $$5 = $$4.a() + (double)$$2.j() * 1.125;
        double $$6 = Math.floor($$4.b()) + (double)$$2.k();
        double $$7 = $$4.c() + (double)$$2.l() * 1.125;
        is $$8 = $$0.c().a($$2);
        eoh $$9 = $$3.a_($$8);
        if ($$9.a(bdp.L)) {
            if (li.a($$9).b()) {
                double $$10 = 0.6;
            } else {
                double $$11 = 0.1;
            }
        } else {
            if (!$$9.l()) return this.c.dispense($$0, $$1);
            eoh $$12 = $$3.a_($$8.e());
            if (!$$12.a(bdp.L)) return this.c.dispense($$0, $$1);
            if ($$2 == iz.a || !li.a($$12).b()) {
                double $$13 = -0.9;
            } else {
                double $$14 = -0.4;
            }
        }
        ftm $$17 = new ftm($$5, $$6 + $$16, $$7);
        dgi $$18 = dgi.a($$3, $$17.g, $$17.h, $$17.i, this.d, cgt.o, $$1, null);
        if ($$18 == null) return $$1;
        $$3.b($$18);
        $$1.h(1);
        return $$1;
    }

    private static epl a(eoh $$0) {
        epl epl2;
        dzq dzq2 = $$0.b();
        if (dzq2 instanceof dzf) {
            dzf $$1 = (dzf)dzq2;
            epl2 = $$0.c($$1.c());
        } else {
            epl2 = epl.a;
        }
        return epl2;
    }

    @Override
    protected void a(ld $$0) {
        $$0.b().c(1000, $$0.c(), 0);
    }
}

