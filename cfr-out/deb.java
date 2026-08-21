/*
 * Decompiled with CFR 0.152.
 */
public class deb
extends dec {
    public deb(cgu<? extends deb> $$0, dwo $$1) {
        super((cgu<? extends dec>)$$0, $$1);
    }

    public deb(dwo $$0, cus $$1) {
        this((cgu<? extends deb>)cgu.aD, $$0);
        this.d($$1);
        this.a_($$1.dP() - (double)($$1.dF() + 1.0f) * 0.5 * (double)bgj.a((double)($$1.bC * ((float)Math.PI / 180))), $$1.dT() - (double)0.1f, $$1.dV() + (double)($$1.dF() + 1.0f) * 0.5 * (double)bgj.b((double)($$1.bC * ((float)Math.PI / 180))));
    }

    @Override
    protected double bs() {
        return 0.06;
    }

    @Override
    public void g() {
        super.g();
        ftm $$0 = this.dN();
        ftk $$1 = dee.a((cgk)this, this::b);
        this.a($$1);
        double $$2 = this.dP() + $$0.g;
        double $$3 = this.dR() + $$0.h;
        double $$4 = this.dV() + $$0.i;
        this.q();
        float $$5 = 0.99f;
        if (this.ao().a(this.dj()).noneMatch(eog.a::l)) {
            this.aC();
            return;
        }
        if (this.by()) {
            this.aC();
            return;
        }
        this.k($$0.c((double)0.99f));
        this.bu();
        this.a_($$2, $$3, $$4);
    }

    @Override
    protected void a(ftj $$0) {
        super.a($$0);
        cgk cgk2 = this.p();
        if (cgk2 instanceof chl) {
            axf $$4;
            chl $$1 = (chl)cgk2;
            cgk $$2 = $$0.a();
            cex $$3 = this.en().b((cgk)this, $$1);
            dwo dwo2 = this.ao();
            if (dwo2 instanceof axf && $$2.a($$4 = (axf)dwo2, $$3, 1.0f)) {
                dsq.a($$4, $$2, $$3);
            }
        }
    }

    @Override
    protected void a(fti $$0) {
        super.a($$0);
        if (!this.ao().B_()) {
            this.aC();
        }
    }

    @Override
    protected void a(ama.a $$0) {
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        ftm $$1 = $$0.j();
        for (int $$2 = 0; $$2 < 7; ++$$2) {
            double $$3 = 0.4 + 0.1 * (double)$$2;
            this.ao().a(ly.al, this.dP(), this.dR(), this.dV(), $$1.g * $$3, $$1.h, $$1.i * $$3);
        }
        this.k($$1);
    }
}

