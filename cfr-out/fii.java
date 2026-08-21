/*
 * Decompiled with CFR 0.152.
 */
public class fii
extends ffm {
    private boolean h;
    private boolean i;

    public fii(bgr $$0, int $$1, int $$2) {
        super(fgf.K, $$1, 64, $$2, 7, 7, 9, fii.a($$0));
    }

    public fii(uz $$0) {
        super(fgf.K, $$0);
        this.h = $$0.b("Witch", false);
        this.i = $$0.b("Cat", false);
    }

    @Override
    protected void a(fge $$0, uz $$1) {
        super.a($$0, $$1);
        $$1.a("Witch", this.h);
        $$1.a("Cat", this.i);
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
        is.a $$13;
        if (!this.a($$0, $$4, 0)) {
            return;
        }
        this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dzs.o.m(), dzs.o.m(), false);
        this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dzs.o.m(), dzs.o.m(), false);
        this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dzs.o.m(), dzs.o.m(), false);
        this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dzs.o.m(), dzs.o.m(), false);
        this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dzs.o.m(), dzs.o.m(), false);
        this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dzs.o.m(), dzs.o.m(), false);
        this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dzs.o.m(), dzs.o.m(), false);
        this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dzs.X.m(), dzs.X.m(), false);
        this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dzs.X.m(), dzs.X.m(), false);
        this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dzs.X.m(), dzs.X.m(), false);
        this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dzs.X.m(), dzs.X.m(), false);
        this.a($$0, dzs.ex.m(), 2, 3, 2, $$4);
        this.a($$0, dzs.ex.m(), 3, 3, 7, $$4);
        this.a($$0, dzs.a.m(), 1, 3, 4, $$4);
        this.a($$0, dzs.a.m(), 5, 3, 4, $$4);
        this.a($$0, dzs.a.m(), 5, 3, 5, $$4);
        this.a($$0, dzs.hf.m(), 1, 3, 5, $$4);
        this.a($$0, dzs.cX.m(), 3, 2, 6, $$4);
        this.a($$0, dzs.gi.m(), 4, 2, 6, $$4);
        this.a($$0, dzs.ex.m(), 1, 2, 1, $$4);
        this.a($$0, dzs.ex.m(), 5, 2, 1, $$4);
        eoh $$7 = (eoh)dzs.gz.m().b(ehz.b, iz.c);
        eoh $$8 = (eoh)dzs.gz.m().b(ehz.b, iz.f);
        eoh $$9 = (eoh)dzs.gz.m().b(ehz.b, iz.e);
        eoh $$10 = (eoh)dzs.gz.m().b(ehz.b, iz.d);
        this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
        this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
        this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
        this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
        this.a($$0, (eoh)$$7.b(ehz.d, epr.e), 0, 4, 1, $$4);
        this.a($$0, (eoh)$$7.b(ehz.d, epr.d), 6, 4, 1, $$4);
        this.a($$0, (eoh)$$10.b(ehz.d, epr.d), 0, 4, 8, $$4);
        this.a($$0, (eoh)$$10.b(ehz.d, epr.e), 6, 4, 8, $$4);
        for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
                this.b($$0, dzs.X.m(), $$12, -1, $$11, $$4);
            }
        }
        if (!this.h && $$4.b($$13 = this.b(2, 2, 5))) {
            this.h = true;
            daj $$14 = cgu.bQ.a($$0.a(), cgt.d);
            if ($$14 != null) {
                $$14.gz();
                $$14.b((double)$$13.u() + 0.5, $$13.v(), (double)$$13.w() + 0.5, 0.0f, 0.0f);
                $$14.a((dxf)$$0, $$0.c($$13), cgt.d, null);
                $$0.a_($$14);
            }
        }
        this.a($$0, $$4);
    }

    private void a(dxf $$0, ffg $$1) {
        is.a $$2;
        if (!this.i && $$1.b($$2 = this.b(2, 2, 5))) {
            this.i = true;
            cvb $$3 = cgu.x.a($$0.a(), cgt.d);
            if ($$3 != null) {
                $$3.gz();
                $$3.b((double)$$2.u() + 0.5, $$2.v(), (double)$$2.w() + 0.5, 0.0f, 0.0f);
                $$3.a($$0, $$0.c($$2), cgt.d, null);
                $$0.a_($$3);
            }
        }
    }
}

