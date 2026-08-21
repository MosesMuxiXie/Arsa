/*
 * Decompiled with CFR 0.152.
 */
public class die
extends dhi {
    private static final int m = 9;
    private static final int n = 9;
    private static final int o = 36;
    private static final int p = 36;
    private static final int q = 45;
    private final ccv r;

    public die(int $$0, ddl $$1) {
        this($$0, $$1, new cdk(9));
    }

    public die(int $$0, ddl $$1, ccv $$2) {
        super(dis.g, $$0);
        die.a($$2, 9);
        this.r = $$2;
        $$2.a((cgd)$$1.j);
        this.d($$2, 62, 17);
        this.c($$1, 8, 84);
    }

    protected void d(ccv $$0, int $$1, int $$2) {
        for (int $$3 = 0; $$3 < 3; ++$$3) {
            for (int $$4 = 0; $$4 < 3; ++$$4) {
                int $$5 = $$4 + $$3 * 3;
                this.a(new dji($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
            }
        }
    }

    @Override
    public boolean b(ddm $$0) {
        return this.r.a($$0);
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

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.r.b($$0);
    }
}

