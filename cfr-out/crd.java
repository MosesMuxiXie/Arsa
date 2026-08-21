/*
 * Decompiled with CFR 0.152.
 */
public class crd
extends cre {
    private boolean p;
    private boolean q;

    public crd(chn $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    protected flr a(int $$0) {
        this.o = new flx();
        return new flr(this.o, $$0);
    }

    @Override
    protected boolean a() {
        return this.a.aV() || this.a.bB() || this.a.cq();
    }

    @Override
    protected ftm b() {
        return new ftm(this.a.dP(), this.s(), this.a.dV());
    }

    @Override
    public flp a(is $$0, int $$1) {
        eqq $$2 = this.b.ac().a(jw.a($$0.u()), jw.a($$0.w()));
        if ($$2 == null) {
            return null;
        }
        if (!this.q) {
            $$0 = this.a($$2, $$0, $$1);
        }
        return super.a($$0, $$1);
    }

    final is a(eqq $$0, is $$1, int $$2) {
        if ($$0.a_($$1).l()) {
            is.a $$3 = $$1.k().c(iz.a);
            while ($$3.v() >= this.b.K_() && $$0.a_($$3).l()) {
                $$3.c(iz.a);
            }
            if ($$3.v() >= this.b.K_()) {
                return $$3.d();
            }
            $$3.q($$1.v() + 1);
            while ($$3.v() <= this.b.aw() && $$0.a_($$3).l()) {
                $$3.c(iz.b);
            }
            $$1 = $$3;
        }
        if ($$0.a_($$1).e()) {
            is.a $$4 = $$1.k().c(iz.b);
            while ($$4.v() <= this.b.aw() && $$0.a_($$4).e()) {
                $$4.c(iz.b);
            }
            return $$4.j();
        }
        return $$1;
    }

    @Override
    public flp a(cgk $$0, int $$1) {
        return this.a($$0.dK(), $$1);
    }

    private int s() {
        if (!this.a.by() || !this.p()) {
            return bgj.c(this.a.dR() + 0.5);
        }
        int $$0 = this.a.dQ();
        eoh $$1 = this.b.a_(is.a(this.a.dP(), (double)$$0, this.a.dV()));
        int $$2 = 0;
        while ($$1.a(dzs.J)) {
            $$1 = this.b.a_(is.a(this.a.dP(), (double)(++$$0), this.a.dV()));
            if (++$$2 <= 16) continue;
            return this.a.dQ();
        }
        return $$0;
    }

    @Override
    protected void e() {
        super.e();
        if (this.p) {
            if (this.b.k(is.a(this.a.dP(), this.a.dR() + 0.5, this.a.dV()))) {
                return;
            }
            for (int $$0 = 0; $$0 < this.c.e(); ++$$0) {
                fln $$1 = this.c.a($$0);
                if (!this.b.k(new is($$1.a, $$1.b, $$1.c))) continue;
                this.c.b($$0);
                return;
            }
        }
    }

    @Override
    public boolean c() {
        return true;
    }

    protected boolean a(fls $$0) {
        if ($$0 == fls.j) {
            return false;
        }
        if ($$0 == fls.i) {
            return false;
        }
        return $$0 != fls.b;
    }

    public void b(boolean $$0) {
        this.p = $$0;
    }

    public void c(boolean $$0) {
        this.o.d($$0);
    }

    public void d(boolean $$0) {
        this.q = $$0;
    }
}

