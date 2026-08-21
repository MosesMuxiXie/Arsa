/*
 * Decompiled with CFR 0.152.
 */
public class dhs
extends dhi {
    private final ccv m;
    private final int n;

    private dhs(dis<?> $$0, int $$1, ddl $$2, int $$3) {
        this($$0, $$1, $$2, new cdk(9 * $$3), $$3);
    }

    public static dhs a(int $$0, ddl $$1) {
        return new dhs(dis.a, $$0, $$1, 1);
    }

    public static dhs b(int $$0, ddl $$1) {
        return new dhs(dis.b, $$0, $$1, 2);
    }

    public static dhs c(int $$0, ddl $$1) {
        return new dhs(dis.c, $$0, $$1, 3);
    }

    public static dhs d(int $$0, ddl $$1) {
        return new dhs(dis.d, $$0, $$1, 4);
    }

    public static dhs e(int $$0, ddl $$1) {
        return new dhs(dis.e, $$0, $$1, 5);
    }

    public static dhs f(int $$0, ddl $$1) {
        return new dhs(dis.f, $$0, $$1, 6);
    }

    public static dhs a(int $$0, ddl $$1, ccv $$2) {
        return new dhs(dis.c, $$0, $$1, $$2, 3);
    }

    public static dhs b(int $$0, ddl $$1, ccv $$2) {
        return new dhs(dis.f, $$0, $$1, $$2, 6);
    }

    public dhs(dis<?> $$0, int $$1, ddl $$2, ccv $$3, int $$4) {
        super($$0, $$1);
        dhs.a($$3, $$4 * 9);
        this.m = $$3;
        this.n = $$4;
        $$3.a((cgd)$$2.j);
        int $$5 = 18;
        this.d($$3, 8, 18);
        int $$6 = 18 + this.n * 18 + 13;
        this.c($$2, 8, $$6);
    }

    private void d(ccv $$0, int $$1, int $$2) {
        for (int $$3 = 0; $$3 < this.n; ++$$3) {
            for (int $$4 = 0; $$4 < 9; ++$$4) {
                this.a(new dji($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
            }
        }
    }

    @Override
    public boolean b(ddm $$0) {
        return this.m.a($$0);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 < this.n * 9 ? !this.a($$4, this.n * 9, this.k.size(), true) : !this.a($$4, 0, this.n * 9, false)) {
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

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.m.b($$0);
    }

    public ccv l() {
        return this.m;
    }

    public int m() {
        return this.n;
    }
}

