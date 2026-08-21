/*
 * Decompiled with CFR 0.152.
 */
public class dip
extends dhi {
    private static final int q = 1;
    private static final int r = 1;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 100;
    private final ccv s;
    private final dhv t;

    public dip(int $$0) {
        this($$0, new cdk(1), new djh(1));
    }

    public dip(int $$0, ccv $$1, dhv $$2) {
        super(dis.r, $$0);
        dip.a($$1, 1);
        dip.a($$2, 1);
        this.s = $$1;
        this.t = $$2;
        this.a(new dji($$1, 0, 0, 0){

            @Override
            public void d() {
                super.d();
                dip.this.a(this.c);
            }
        });
        this.a($$2);
    }

    @Override
    public boolean a(ddm $$0, int $$1) {
        if ($$1 >= 100) {
            int $$2 = $$1 - 100;
            this.b(0, $$2);
            return true;
        }
        switch ($$1) {
            case 2: {
                int $$3 = this.t.a(0);
                this.b(0, $$3 + 1);
                return true;
            }
            case 1: {
                int $$4 = this.t.a(0);
                this.b(0, $$4 - 1);
                return true;
            }
            case 3: {
                if (!$$0.gY()) {
                    return false;
                }
                dlt $$5 = this.s.b(0);
                this.s.e();
                if (!$$0.gK().g($$5)) {
                    $$0.a($$5, false);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        return dlt.l;
    }

    @Override
    public void b(int $$0, int $$1) {
        super.b($$0, $$1);
        this.d();
    }

    @Override
    public boolean b(ddm $$0) {
        return this.s.a($$0);
    }

    public dlt l() {
        return this.s.a(0);
    }

    public int m() {
        return this.t.a(0);
    }
}

