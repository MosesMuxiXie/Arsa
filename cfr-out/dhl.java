/*
 * Decompiled with CFR 0.152.
 */
public abstract class dhl
extends dhi {
    protected final ccv m;
    protected final chl n;
    protected final int o = 0;
    protected final int p = 1;
    protected final int q = 2;
    protected static final int r = 3;

    protected dhl(int $$0, ddl $$1, ccv $$2, chl $$3) {
        super(null, $$0);
        this.m = $$2;
        this.n = $$3;
        $$2.a((cgd)$$1.j);
    }

    protected abstract boolean c(ccv var1);

    @Override
    public boolean b(ddm $$0) {
        return !this.c(this.m) && this.m.a($$0) && this.n.cb() && $$0.b((cgk)this.n, 4.0);
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.m.b($$0);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            int $$5 = 2 + this.m.b();
            if ($$1 < $$5) {
                if (!this.a($$4, $$5, this.k.size(), true)) {
                    return dlt.l;
                }
            } else if (this.b(1).a($$4) && !this.b(1).h()) {
                if (!this.a($$4, 1, 2, false)) {
                    return dlt.l;
                }
            } else if (this.b(0).a($$4) && !this.b(0).h()) {
                if (!this.a($$4, 0, 1, false)) {
                    return dlt.l;
                }
            } else if (this.m.b() == 0 || !this.a($$4, 2, $$5, false)) {
                int $$6;
                int $$7 = $$6 = $$5 + 27;
                int $$8 = $$7 + 9;
                if ($$1 >= $$7 && $$1 < $$8 ? !this.a($$4, $$5, $$6, false) : ($$1 >= $$5 && $$1 < $$6 ? !this.a($$4, $$7, $$8, false) : !this.a($$4, $$7, $$6, false))) {
                    return dlt.l;
                }
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
            } else {
                $$3.d();
            }
        }
        return $$2;
    }

    public static int e(int $$0) {
        return $$0 * 3;
    }
}

