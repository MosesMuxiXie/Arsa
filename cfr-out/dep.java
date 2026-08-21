/*
 * Decompiled with CFR 0.152.
 */
public class dep
extends deo {
    private static final byte e = 1;
    private int f = 1;

    public dep(cgu<? extends dep> $$0, dwo $$1) {
        super((cgu<? extends deo>)$$0, $$1);
    }

    public dep(dwo $$0, chl $$1, ftm $$2, int $$3) {
        super((cgu<? extends deo>)cgu.ac, $$1, $$2, $$0);
        this.f = $$3;
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            boolean $$2 = $$1.U().a(eua.F);
            this.ao().a((cgk)this, this.dP(), this.dR(), this.dV(), (float)this.f, $$2, dwo.a.c);
            this.aC();
        }
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
        cex $$5 = this.en().a(this, $$4);
        $$3.a((axf)$$2, $$5, 6.0f);
        dsq.a((axf)$$2, $$3, $$5);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("ExplosionPower", (byte)this.f);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = $$0.a("ExplosionPower", (byte)1);
    }
}

