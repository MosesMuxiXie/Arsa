/*
 * Decompiled with CFR 0.152.
 */
public class djf
extends dhi {
    private static final int m = 27;
    private final ccv n;

    public djf(int $$0, ddl $$1) {
        this($$0, $$1, new cdk(27));
    }

    public djf(int $$0, ddl $$1, ccv $$2) {
        super(dis.u, $$0);
        djf.a($$2, 27);
        this.n = $$2;
        $$2.a((cgd)$$1.j);
        int $$3 = 3;
        int $$4 = 9;
        for (int $$5 = 0; $$5 < 3; ++$$5) {
            for (int $$6 = 0; $$6 < 9; ++$$6) {
                this.a(new djg($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
            }
        }
        this.c($$1, 8, 84);
    }

    @Override
    public boolean b(ddm $$0) {
        return this.n.a($$0);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 < this.n.b() ? !this.a($$4, this.n.b(), this.k.size(), true) : !this.a($$4, 0, this.n.b(), false)) {
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
        this.n.b($$0);
    }
}

