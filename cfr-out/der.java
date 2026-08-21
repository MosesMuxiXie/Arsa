/*
 * Decompiled with CFR 0.152.
 */
public class der
extends dem {
    private static final alw<Boolean> e = ama.a(der.class, aly.k);
    private static final boolean f = false;

    public der(cgu<? extends der> $$0, dwo $$1) {
        super((cgu<? extends dem>)$$0, $$1);
    }

    public der(dwo $$0, chl $$1, ftm $$2) {
        super(cgu.bT, $$1, $$2, $$0);
    }

    @Override
    protected float r() {
        return this.u() ? 0.73f : super.r();
    }

    @Override
    public boolean cp() {
        return false;
    }

    @Override
    public float a(dwi $$0, dvt $$1, is $$2, eoh $$3, flb $$4, float $$5) {
        if (this.u() && cyw.c($$3)) {
            return Math.min(0.8f, $$5);
        }
        return $$5;
    }

    @Override
    protected void a(ftj $$0) {
        boolean $$8;
        super.a($$0);
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        cgk $$3 = $$0.a();
        cgk $$4 = this.p();
        if ($$4 instanceof chl) {
            chl $$5 = (chl)$$4;
            cex $$6 = this.en().a(this, (cgk)$$5);
            boolean $$7 = $$3.a((axf)$$2, $$6, 8.0f);
            if ($$7) {
                if ($$3.cb()) {
                    dsq.a((axf)$$2, $$3, $$6);
                } else {
                    $$5.d(5.0f);
                }
            }
        } else {
            $$8 = $$3.a((axf)$$2, this.en().q(), 5.0f);
        }
        if ($$8 && $$3 instanceof chl) {
            chl $$9 = (chl)$$3;
            int $$10 = 0;
            if (this.ao().av() == ccz.c) {
                $$10 = 10;
            } else if (this.ao().av() == ccz.d) {
                $$10 = 40;
            }
            if ($$10 > 0) {
                $$9.b(new cfm(cfo.t, 20 * $$10, 1), this.m());
            }
        }
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        if (!this.ao().B_()) {
            this.ao().a((cgk)this, this.dP(), this.dR(), this.dV(), 1.0f, false, dwo.a.c);
            this.aC();
        }
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(e, false);
    }

    public boolean u() {
        return this.az.a(e);
    }

    public void b(boolean $$0) {
        this.az.a(e, $$0);
    }

    @Override
    protected boolean i() {
        return false;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("dangerous", this.u());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.b($$0.a("dangerous", false));
    }
}

