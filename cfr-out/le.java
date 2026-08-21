/*
 * Decompiled with CFR 0.152.
 */
public class le
extends lf {
    private final lf c = new lf();
    private final cgu<? extends dgb> d;

    public le(cgu<? extends dgb> $$0) {
        this.d = $$0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public dlt a(ld $$0, dlt $$1) {
        iz $$2 = $$0.d().c(eby.b);
        axf $$3 = $$0.b();
        ftm $$4 = $$0.a();
        double $$5 = 0.5625 + (double)this.d.l() / 2.0;
        double $$6 = $$4.a() + (double)$$2.j() * $$5;
        double $$7 = $$4.b() + (double)((float)$$2.k() * 1.125f);
        double $$8 = $$4.c() + (double)$$2.l() * $$5;
        is $$9 = $$0.c().a($$2);
        if ($$3.b_($$9).a(bdv.a)) {
            double $$10 = 1.0;
        } else if ($$3.a_($$9).l() && $$3.b_($$9.e()).a(bdv.a)) {
            double $$11 = 0.0;
        } else {
            return this.c.dispense($$0, $$1);
        }
        dgb $$13 = this.d.a($$3, cgt.o);
        if ($$13 != null) {
            void $$12;
            $$13.o($$6, $$7 + $$12, $$8);
            cgu.a((dwo)$$3, $$1, null).accept($$13);
            $$13.v($$2.p());
            $$3.b($$13);
            $$1.h(1);
        }
        return $$1;
    }

    @Override
    protected void a(ld $$0) {
        $$0.b().c(1000, $$0.c(), 0);
    }
}

