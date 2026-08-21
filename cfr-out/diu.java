/*
 * Decompiled with CFR 0.152.
 */
public class diu
extends dhi {
    protected static final int m = 0;
    protected static final int n = 1;
    protected static final int o = 2;
    private static final int p = 3;
    private static final int q = 30;
    private static final int r = 30;
    private static final int s = 39;
    private static final int t = 136;
    private static final int u = 162;
    private static final int v = 220;
    private static final int w = 37;
    private final dvk x;
    private final dit y;
    private int z;
    private boolean A;
    private boolean B;

    public diu(int $$0, ddl $$1) {
        this($$0, $$1, new dcs($$1.j));
    }

    public diu(int $$0, ddl $$1, dvk $$2) {
        super(dis.t, $$0);
        this.x = $$2;
        this.y = new dit($$2);
        this.a(new dji(this.y, 0, 136, 37));
        this.a(new dji(this.y, 1, 162, 37));
        this.a(new div($$1.j, $$2, this.y, 2, 220, 37));
        this.c($$1, 108, 84);
    }

    public void a(boolean $$0) {
        this.A = $$0;
    }

    @Override
    public void a(ccv $$0) {
        this.y.g();
        super.a($$0);
    }

    public void e(int $$0) {
        this.y.d($$0);
    }

    @Override
    public boolean b(ddm $$0) {
        return this.x.b($$0);
    }

    public int l() {
        return this.x.d();
    }

    public int m() {
        return this.y.i();
    }

    public void f(int $$0) {
        this.x.a($$0);
    }

    public int n() {
        return this.z;
    }

    public void g(int $$0) {
        this.z = $$0;
    }

    public void b(boolean $$0) {
        this.B = $$0;
    }

    public boolean o() {
        return this.B;
    }

    @Override
    public boolean a(dlt $$0, dji $$1) {
        return false;
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 == 2) {
                if (!this.a($$4, 3, 39, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
                this.r();
            } else if ($$1 == 0 || $$1 == 1 ? !this.a($$4, 3, 39, false) : ($$1 >= 3 && $$1 < 30 ? !this.a($$4, 30, 39, false) : $$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false))) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
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

    private void r() {
        if (!this.x.c()) {
            cgk $$0 = (cgk)((Object)this.x);
            $$0.ao().a($$0.dP(), $$0.dR(), $$0.dV(), this.x.f(), bdb.g, 1.0f, 1.0f, false);
        }
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.x.a((ddm)null);
        if (this.x.c()) {
            return;
        }
        if (!$$0.cb() || $$0 instanceof axg && ((axg)$$0).w()) {
            dlt $$1 = this.y.b(0);
            if (!$$1.f()) {
                $$0.a($$1, false);
            }
            if (!($$1 = this.y.b(1)).f()) {
                $$0.a($$1, false);
            }
        } else if ($$0 instanceof axg) {
            $$0.gK().h(this.y.b(0));
            $$0.gK().h(this.y.b(1));
        }
    }

    public void h(int $$02) {
        dlt $$2;
        if ($$02 < 0 || this.p().size() <= $$02) {
            return;
        }
        dlt $$1 = this.y.a(0);
        if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
                return;
            }
            this.y.a(0, $$1);
        }
        if (!($$2 = this.y.a(1)).f()) {
            if (!this.a($$2, 3, 39, true)) {
                return;
            }
            this.y.a(1, $$2);
        }
        if (this.y.a(0).f() && this.y.a(1).f()) {
            dvl $$3 = (dvl)this.p().get($$02);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0 -> this.a(1, (dvj)$$0));
        }
    }

    private void a(int $$0, dvj $$1) {
        for (int $$2 = 3; $$2 < 39; ++$$2) {
            dlt $$4;
            dlt $$3 = ((dji)this.k.get($$2)).g();
            if ($$3.f() || !$$1.a($$3) || !($$4 = this.y.a($$0)).f() && !dlt.c($$3, $$4)) continue;
            int $$5 = $$3.k();
            int $$6 = Math.min($$5 - $$4.N(), $$3.N());
            dlt $$7 = $$3.c($$4.N() + $$6);
            $$3.h($$6);
            this.y.a($$0, $$7);
            if ($$7.N() >= $$5) break;
        }
    }

    public void a(dvm $$0) {
        this.x.a($$0);
    }

    public dvm p() {
        return this.x.b();
    }

    public boolean q() {
        return this.A;
    }
}

