/*
 * Decompiled with CFR 0.152.
 */
public class lf
implements lg {
    private static final int c = 6;

    @Override
    public final dlt dispense(ld $$0, dlt $$1) {
        dlt $$2 = this.a($$0, $$1);
        this.a($$0);
        this.a($$0, $$0.d().c(eby.b));
        return $$2;
    }

    protected dlt a(ld $$0, dlt $$1) {
        iz $$2 = $$0.d().c(eby.b);
        jn $$3 = eby.a($$0);
        dlt $$4 = $$1.a(1);
        lf.a($$0.b(), $$4, 6, $$2, $$3);
        return $$1;
    }

    public static void a(dwo $$0, dlt $$1, int $$2, iz $$3, jn $$4) {
        double $$5 = $$4.a();
        double $$6 = $$4.b();
        double $$7 = $$4.c();
        $$6 = $$3.o() == iz.a.b ? ($$6 -= 0.125) : ($$6 -= 0.15625);
        czl $$8 = new czl($$0, $$5, $$6, $$7, $$1);
        double $$9 = $$0.y.j() * 0.1 + 0.2;
        $$8.m($$0.y.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2), $$0.y.a(0.2, 0.0172275 * (double)$$2), $$0.y.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2));
        $$0.b($$8);
    }

    protected void a(ld $$0) {
        lf.b($$0);
    }

    protected void a(ld $$0, iz $$1) {
        lf.b($$0, $$1);
    }

    private static void b(ld $$0) {
        $$0.b().c(1000, $$0.c(), 0);
    }

    private static void b(ld $$0, iz $$1) {
        $$0.b().c(2000, $$0.c(), $$1.d());
    }

    protected dlt a(ld $$0, dlt $$1, dlt $$2) {
        $$1.h(1);
        if ($$1.f()) {
            return $$2;
        }
        this.b($$0, $$2);
        return $$1;
    }

    private void b(ld $$0, dlt $$1) {
        dlt $$2 = $$0.e().b($$1);
        if ($$2.f()) {
            return;
        }
        iz $$3 = $$0.d().c(eby.b);
        lf.a($$0.b(), $$2, 6, $$3, eby.a($$0));
        lf.b($$0);
        lf.b($$0, $$3);
    }
}

