/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class dhq
extends dhi {
    static final amo m = amo.b("container/slot/brewing_fuel");
    static final amo n = amo.b("container/slot/potion");
    private static final int o = 0;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 4;
    private static final int s = 5;
    private static final int t = 2;
    private static final int u = 5;
    private static final int v = 32;
    private static final int w = 32;
    private static final int x = 41;
    private final ccv y;
    private final dhv z;
    private final dji A;

    public dhq(int $$0, ddl $$1) {
        this($$0, $$1, new cdk(5), new djh(2));
    }

    public dhq(int $$0, ddl $$1, ccv $$2, dhv $$3) {
        super(dis.l, $$0);
        dhq.a($$2, 5);
        dhq.a($$3, 2);
        this.y = $$2;
        this.z = $$3;
        dnq $$4 = $$1.j.ao().R();
        this.a(new c($$2, 0, 56, 51));
        this.a(new c($$2, 1, 79, 58));
        this.a(new c($$2, 2, 102, 51));
        this.A = this.a(new b($$4, $$2, 3, 79, 17));
        this.a(new a($$2, 4, 17, 17));
        this.a($$3);
        this.c($$1, 8, 84);
    }

    @Override
    public boolean b(ddm $$0) {
        return this.y.a($$0);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 >= 0 && $$1 <= 2 || $$1 == 3 || $$1 == 4) {
                if (!this.a($$4, 5, 41, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if (dhq$a.b($$2) ? this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false) : (this.A.a($$4) ? !this.a($$4, 3, 4, false) : (dhq$c.b($$2) ? !this.a($$4, 0, 3, false) : ($$1 >= 5 && $$1 < 32 ? !this.a($$4, 32, 41, false) : ($$1 >= 32 && $$1 < 41 ? !this.a($$4, 5, 32, false) : !this.a($$4, 5, 41, false)))))) {
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
            $$3.a($$0, $$2);
        }
        return $$2;
    }

    public int l() {
        return this.z.a(1);
    }

    public int m() {
        return this.z.a(0);
    }

    static class c
    extends dji {
        public c(ccv $$0, int $$1, int $$2, int $$3) {
            super($$0, $$1, $$2, $$3);
        }

        @Override
        public boolean a(dlt $$0) {
            return dhq$c.b($$0);
        }

        @Override
        public int a() {
            return 1;
        }

        @Override
        public void a(ddm $$0, dlt $$1) {
            Optional<jd<dnp>> $$2 = $$1.a(ki.Y, dnr.a).e();
            if ($$2.isPresent() && $$0 instanceof axg) {
                axg $$3 = (axg)$$0;
                aj.l.a($$3, $$2.get());
            }
            super.a($$0, $$1);
        }

        public static boolean b(dlt $$0) {
            return $$0.a(dlx.up) || $$0.a(dlx.xD) || $$0.a(dlx.xG) || $$0.a(dlx.uo);
        }

        @Override
        public amo c() {
            return n;
        }
    }

    static class b
    extends dji {
        private final dnq a;

        public b(dnq $$0, ccv $$1, int $$2, int $$3, int $$4) {
            super($$1, $$2, $$3, $$4);
            this.a = $$0;
        }

        @Override
        public boolean a(dlt $$0) {
            return this.a.a($$0);
        }
    }

    static class a
    extends dji {
        public a(ccv $$0, int $$1, int $$2, int $$3) {
            super($$0, $$1, $$2, $$3);
        }

        @Override
        public boolean a(dlt $$0) {
            return dhq$a.b($$0);
        }

        public static boolean b(dlt $$0) {
            return $$0.a(bdy.ay);
        }

        @Override
        public amo c() {
            return m;
        }
    }
}

