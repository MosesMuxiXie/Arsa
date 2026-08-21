/*
 * Decompiled with CFR 0.152.
 */
public class dfe
extends dey {
    public dfe(cgu<? extends dfe> $$0, dwo $$1) {
        super((cgu<? extends dey>)$$0, $$1);
    }

    public dfe(dwo $$0, chl $$1, dlt $$2) {
        super(cgu.be, $$0, $$1, $$2);
    }

    public dfe(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        super(cgu.be, $$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected dlp f() {
        return dlx.xG;
    }

    @Override
    public void a(axf $$0, dlt $$1, ftk $$2) {
        cga $$3 = new cga(this.ao(), this.dP(), this.dR(), this.dV());
        cgk cgk2 = this.p();
        if (cgk2 instanceof chl) {
            chl $$4 = (chl)cgk2;
            $$3.a($$4);
        }
        $$3.a(3.0f);
        $$3.c(-0.5f);
        $$3.a(600);
        $$3.d(10);
        $$3.d(-$$3.c() / (float)$$3.h());
        $$3.c($$1);
        $$0.b($$3);
    }
}

