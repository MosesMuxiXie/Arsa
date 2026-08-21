/*
 * Decompiled with CFR 0.152.
 */
public abstract class gth
extends gsb {
    private static final yh f = yh.c("advMode.setCommand");
    private static final yh t = yh.c("advMode.command");
    private static final yh u = yh.c("advMode.previousOutput");
    protected gjn a;
    protected gjn b;
    protected gje c;
    protected gje d;
    protected gjl<Boolean> e;
    gjh v;

    public gth() {
        super(gfa.a);
    }

    @Override
    public void e() {
        if (!this.o().a()) {
            this.aX_();
        }
    }

    abstract dvo o();

    abstract int p();

    @Override
    protected void bg_() {
        boolean $$02 = this.o().g();
        this.a = new gjn(this.q, this.o / 2 - 150, 50, 300, 20, (yh)yh.c("advMode.command")){

            @Override
            protected yw f() {
                return super.f().b(gth.this.v.e());
            }
        };
        this.a.k(32500);
        this.a.b(this::a);
        this.d(this.a);
        this.b = new gjn(this.q, this.o / 2 - 150, this.p(), 276, 20, yh.c("advMode.previousOutput"));
        this.b.k(32500);
        this.b.e(false);
        this.b.a("-");
        this.d(this.b);
        this.e = this.c(gjl.a((yh)yh.b("O"), (yh)yh.b("X"), $$02).a().a(this.o / 2 + 150 - 20, this.p(), 20, 20, yh.c("advMode.trackOutput"), ($$0, $$1) -> {
            dvo $$2 = this.o();
            $$2.a((boolean)$$1);
            this.c((boolean)$$1);
        }));
        this.F();
        this.c = this.c(gje.a(yg.d, (gje $$0) -> this.I()).a(this.o / 2 - 4 - 150, this.p / 4 + 120 + 12, 150, 20).a());
        this.d = this.c(gje.a(yg.e, (gje $$0) -> this.aX_()).a(this.o / 2 + 4, this.p / 4 + 120 + 12, 150, 20).a());
        this.v = new gjh(this.n, this, this.a, this.q, true, true, 0, 7, false, Integer.MIN_VALUE);
        this.v.a(true);
        this.v.d();
        this.c($$02);
    }

    protected void F() {
    }

    @Override
    protected void aI_() {
        this.b(this.a);
    }

    @Override
    protected yh B() {
        if (this.v.a()) {
            return this.v.b();
        }
        return super.B();
    }

    @Override
    public void a(int $$0, int $$1) {
        String $$2 = this.a.a();
        this.b($$0, $$1);
        this.a.a($$2);
        this.v.d();
    }

    protected void c(boolean $$0) {
        this.b.a($$0 ? this.o().c().getString() : "-");
    }

    protected void I() {
        this.J();
        dvo $$0 = this.o();
        if (!$$0.g()) {
            $$0.b((yh)null);
        }
        this.n.a((gsb)null);
    }

    protected abstract void J();

    private void a(String $$0) {
        this.v.d();
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.v.a($$0)) {
            return true;
        }
        if (super.a($$0)) {
            return true;
        }
        if ($$0.d()) {
            this.I();
            return true;
        }
        return false;
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (this.v.a($$3)) {
            return true;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (this.v.a($$0)) {
            return true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, f, this.o / 2, 20, -1);
        $$0.b(this.q, t, this.o / 2 - 150 + 1, 40, -6250336);
        this.a.a($$0, $$1, $$2, $$3);
        int $$4 = 75;
        if (!this.b.a().isEmpty()) {
            $$0.b(this.q, u, this.o / 2 - 150 + 1, ($$4 += 5 * this.q.b + 1 + this.p() - 135) + 4, -6250336);
            this.b.a($$0, $$1, $$2, $$3);
        }
        this.v.a($$0, $$1, $$2);
    }
}

