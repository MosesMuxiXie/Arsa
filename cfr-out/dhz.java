/*
 * Decompiled with CFR 0.152.
 */
public class dhz
extends dhi
implements dhx {
    protected static final int m = 9;
    private static final int n = 9;
    private static final int o = 36;
    private static final int p = 36;
    private static final int q = 45;
    private final djd r = new djd();
    private final dhv s;
    private final ddm t;
    private final dib u;

    public dhz(int $$0, ddl $$1) {
        super(dis.h, $$0);
        this.t = $$1.j;
        this.s = new djh(10);
        this.u = new djp(this, 3, 3);
        this.a($$1);
    }

    public dhz(int $$0, ddl $$1, dib $$2, dhv $$3) {
        super(dis.h, $$0);
        this.t = $$1.j;
        this.s = $$3;
        this.u = $$2;
        dhz.a($$2, 9);
        $$2.a((cgd)$$1.j);
        this.a($$1);
        this.a(this);
    }

    private void a(ddl $$0) {
        for (int $$1 = 0; $$1 < 3; ++$$1) {
            for (int $$2 = 0; $$2 < 3; ++$$2) {
                int $$3 = $$2 + $$1 * 3;
                this.a(new dia(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
            }
        }
        this.c($$0, 8, 84);
        this.a(new dix(this.r, 0, 134, 35));
        this.a(this.s);
        this.n();
    }

    public void a(int $$0, boolean $$1) {
        dia $$2 = (dia)this.b($$0);
        this.s.a($$2.d, $$1 ? 0 : 1);
        this.d();
    }

    public boolean e(int $$0) {
        if ($$0 > -1 && $$0 < 9) {
            return this.s.a($$0) == 1;
        }
        return false;
    }

    public boolean l() {
        return this.s.a(9) == 1;
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 < 9 ? !this.a($$4, 9, 45, true) : !this.a($$4, 0, 9, false)) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.f(dlt.l);
            } else {
                $$3.d();
            }
            if ($$4.N() == $$2.N()) {
                return dlt.l;
            }
            $$3.a($$0, $$4);
        }
        return $$2;
    }

    @Override
    public boolean b(ddm $$0) {
        return this.u.a($$0);
    }

    private void n() {
        ddm ddm2 = this.t;
        if (ddm2 instanceof axg) {
            axg $$0 = (axg)ddm2;
            axf $$1 = $$0.A();
            dqg $$22 = this.u.aE_();
            dlt $$3 = ebm.a($$1, $$22).map($$2 -> ((dqh)$$2.b()).a($$22, $$1.J_())).orElse(dlt.l);
            this.r.a(0, $$3);
        }
    }

    public ccv m() {
        return this.u;
    }

    @Override
    public void a(dhi $$0, int $$1, dlt $$2) {
        this.n();
    }

    @Override
    public void a(dhi $$0, int $$1, int $$2) {
    }
}

