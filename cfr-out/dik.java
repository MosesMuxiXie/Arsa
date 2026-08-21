/*
 * Decompiled with CFR 0.152.
 */
public class dik
extends dhi {
    public static final int m = 5;
    private final ccv n;

    public dik(int $$0, ddl $$1) {
        this($$0, $$1, new cdk(5));
    }

    public dik(int $$0, ddl $$1, ccv $$2) {
        super(dis.q, $$0);
        this.n = $$2;
        dik.a($$2, 5);
        $$2.a((cgd)$$1.j);
        for (int $$3 = 0; $$3 < 5; ++$$3) {
            this.a(new dji($$2, $$3, 44 + $$3 * 18, 20));
        }
        this.c($$1, 8, 51);
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

