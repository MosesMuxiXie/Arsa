/*
 * Decompiled with CFR 0.152.
 */
public abstract class gtl<T extends diz>
extends gti<T>
implements gxa {
    private final gwv<?> D;
    private boolean E;

    public gtl(T $$0, gwv<?> $$1, ddl $$2, yh $$3) {
        super($$0, $$2, $$3);
        this.D = $$1;
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.E = this.o < 379;
        this.D.a(this.o, this.p, this.n, this.E);
        this.z = this.D.a(this.o, this.d);
        this.M();
    }

    protected abstract gpl I();

    private void M() {
        gpl $$02 = this.I();
        this.c(new gjq($$02.a(), $$02.b(), 20, 18, gwv.a, $$0 -> {
            this.D.e();
            this.z = this.D.a(this.o, this.d);
            gpl $$1 = this.I();
            $$0.c($$1.a(), $$1.b());
            this.J();
        }));
        this.d(this.D);
    }

    protected void J() {
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        if (this.D.f() && this.E) {
            this.b($$0, $$1, $$2, $$3);
        } else {
            super.d($$0, $$1, $$2, $$3);
        }
        $$0.c();
        this.D.a($$0, $$1, $$2, $$3);
        $$0.c();
        this.a($$0, $$1, $$2);
        this.d($$0);
        this.c($$0, $$1, $$2);
        this.D.a($$0, $$1, $$2, this.y);
    }

    @Override
    protected void b(gir $$0, int $$1, int $$2) {
        super.b($$0, $$1, $$2);
        this.D.a($$0, this.K());
    }

    protected boolean K() {
        return true;
    }

    @Override
    public boolean a(gyy $$0) {
        if (this.D.a($$0)) {
            return true;
        }
        return (boolean)super.a($$0);
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.D.a($$0)) {
            return true;
        }
        return super.a($$0);
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (this.D.a($$0, $$1)) {
            this.a(this.D);
            return true;
        }
        if (this.E && this.D.f()) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        if (this.D.a($$0, $$1, $$2)) {
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
        return (!this.E || !this.D.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected boolean a(double $$0, double $$1, int $$2, int $$3) {
        boolean $$4 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.d) || $$1 >= (double)($$3 + this.e);
        return this.D.a($$0, $$1, this.z, this.A, this.d, this.e) && $$4;
    }

    @Override
    protected void a(dji $$0, int $$1, int $$2, dhu $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.D.b($$0);
    }

    @Override
    public void p() {
        super.p();
        this.D.h();
    }

    @Override
    public void L() {
        this.D.i();
    }

    @Override
    public void a(dry $$0) {
        this.D.a($$0);
    }
}

