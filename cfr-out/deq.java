/*
 * Decompiled with CFR 0.152.
 */
public class deq
extends deo {
    public deq(cgu<? extends deq> $$0, dwo $$1) {
        super((cgu<? extends deo>)$$0, $$1);
    }

    public deq(dwo $$0, chl $$1, ftm $$2) {
        super((cgu<? extends deo>)cgu.bq, $$1, $$2, $$0);
    }

    public deq(dwo $$0, double $$1, double $$2, double $$3, ftm $$4) {
        super((cgu<? extends deo>)cgu.bq, $$1, $$2, $$3, $$4, $$0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void a(ftj $$0) {
        void $$2;
        super.a($$0);
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        cgk $$3 = $$0.a();
        cgk $$4 = this.p();
        int $$5 = $$3.aS();
        $$3.e(5.0f);
        cex $$6 = this.en().a(this, $$4);
        if (!$$3.a((axf)$$2, $$6, 5.0f)) {
            $$3.h($$5);
        } else {
            dsq.a((axf)$$2, $$3, $$6);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void a(fti $$0) {
        void $$2;
        super.a($$0);
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        cgk $$3 = this.p();
        if (!($$3 instanceof chn) || $$2.U().a(eua.F).booleanValue()) {
            is $$4 = $$0.b().a($$0.c());
            if (this.ao().A($$4)) {
                this.ao().c($$4, dzd.a(this.ao(), $$4));
            }
        }
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        if (!this.ao().B_()) {
            this.aC();
        }
    }
}

