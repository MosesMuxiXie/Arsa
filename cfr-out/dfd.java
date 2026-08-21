/*
 * Decompiled with CFR 0.152.
 */
public class dfd
extends dfa {
    public dfd(cgu<? extends dfd> $$0, dwo $$1) {
        super((cgu<? extends dfa>)$$0, $$1);
    }

    public dfd(dwo $$0, chl $$1, dlt $$2) {
        super(cgu.Y, $$1, $$0, $$2);
    }

    public dfd(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        super(cgu.Y, $$1, $$2, $$3, $$0, $$4);
    }

    @Override
    protected dlp f() {
        return dlx.wh;
    }

    @Override
    protected double bs() {
        return 0.07;
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            $$1.c(2002, this.dK(), -13083194);
            int $$2 = 3 + $$1.y.a(5) + $$1.y.a(5);
            if ($$0 instanceof fti) {
                fti $$3 = (fti)$$0;
                ftm $$4 = $$3.c().r();
                cgz.a($$1, $$0.g(), $$4, $$2);
            } else {
                cgz.a($$1, $$0.g(), this.dN().c(-1.0), $$2);
            }
            this.aC();
        }
    }
}

