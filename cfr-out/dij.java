/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class dij
extends dhi {
    public static final int m = 35;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    private static final int q = 3;
    private static final int r = 30;
    private static final int s = 30;
    private static final int t = 39;
    private final ccv u = new djd();
    final ccv v = new cdk(2){

        @Override
        public void e() {
            super.e();
            dij.this.a(this);
        }
    };
    private final dhw w;

    public dij(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public dij(int $$0, ddl $$1, final dhw $$2) {
        super(dis.p, $$0);
        this.w = $$2;
        this.a(new dji(this, this.v, 0, 49, 19){

            @Override
            public boolean a(dlt $$0) {
                return $$0.m() || dsq.c($$0);
            }
        });
        this.a(new dji(this, this.v, 1, 49, 40){

            @Override
            public boolean a(dlt $$0) {
                return $$0.m() || dsq.c($$0);
            }
        });
        this.a(new dji(this.u, 2, 129, 34){

            @Override
            public boolean a(dlt $$0) {
                return false;
            }

            @Override
            public void a(ddm $$02, dlt $$12) {
                $$2.a((dwo $$0, is $$1) -> {
                    if ($$0 instanceof axf) {
                        cgz.a((axf)$$0, ftm.b($$1), this.a((dwo)$$0));
                    }
                    $$0.c(1042, (is)$$1, 0);
                });
                dij.this.v.a(0, dlt.l);
                dij.this.v.a(1, dlt.l);
            }

            private int a(dwo $$0) {
                int $$1 = 0;
                $$1 += this.g(dij.this.v.a(0));
                if (($$1 += this.g(dij.this.v.a(1))) > 0) {
                    int $$22 = (int)Math.ceil((double)$$1 / 2.0);
                    return $$22 + $$0.y.a($$22);
                }
                return 0;
            }

            private int g(dlt $$0) {
                int $$1 = 0;
                dsu $$22 = dsq.b($$0);
                for (Object2IntMap.Entry<jd<dso>> $$3 : $$22.b()) {
                    jd $$4 = (jd)$$3.getKey();
                    int $$5 = $$3.getIntValue();
                    if ($$4.a(bds.o)) continue;
                    $$1 += ((dso)$$4.a()).b($$5);
                }
                return $$1;
            }
        });
        this.c($$1, 8, 84);
    }

    @Override
    public void a(ccv $$0) {
        super.a($$0);
        if ($$0 == this.v) {
            this.l();
        }
    }

    private void l() {
        this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
        this.d();
    }

    private dlt a(dlt $$0, dlt $$1) {
        boolean $$3;
        boolean $$2;
        boolean bl2 = $$2 = !$$0.f() || !$$1.f();
        if (!$$2) {
            return dlt.l;
        }
        if ($$0.N() > 1 || $$1.N() > 1) {
            return dlt.l;
        }
        boolean bl3 = $$3 = !$$0.f() && !$$1.f();
        if (!$$3) {
            dlt $$4;
            dlt dlt2 = $$4 = !$$0.f() ? $$0 : $$1;
            if (!dsq.c($$4)) {
                return dlt.l;
            }
            return this.b($$4.v());
        }
        return this.b($$0, $$1);
    }

    private dlt b(dlt $$0, dlt $$1) {
        dlt $$7;
        if (!$$0.a($$1.h())) {
            return dlt.l;
        }
        int $$2 = Math.max($$0.p(), $$1.p());
        int $$3 = $$0.p() - $$0.o();
        int $$4 = $$1.p() - $$1.o();
        int $$5 = $$3 + $$4 + $$2 * 5 / 100;
        int $$6 = 1;
        if (!$$0.m()) {
            if ($$0.k() < 2 || !dlt.a($$0, $$1)) {
                return dlt.l;
            }
            $$6 = 2;
        }
        if (($$7 = $$0.c($$6)).m()) {
            $$7.b(ki.d, Integer.valueOf($$2));
            $$7.b(Math.max($$2 - $$5, 0));
        }
        this.c($$7, $$1);
        return this.b($$7);
    }

    private void c(dlt $$0, dlt $$12) {
        dsq.a($$0, (dsu.a $$1) -> {
            dsu $$2 = dsq.b($$12);
            for (Object2IntMap.Entry<jd<dso>> $$3 : $$2.b()) {
                jd $$4 = (jd)$$3.getKey();
                if ($$4.a(bds.o) && $$1.a($$4) != 0) continue;
                $$1.b($$4, $$3.getIntValue());
            }
        });
    }

    private dlt b(dlt $$0) {
        dsu $$1 = dsq.a($$0, (dsu.a $$02) -> $$02.a((jd<dso> $$0) -> !$$0.a(bds.o)));
        if ($$0.a(dlx.wI) && $$1.d()) {
            $$0 = $$0.a((dwn)dlx.sB);
        }
        int $$2 = 0;
        for (int $$3 = 0; $$3 < $$1.c(); ++$$3) {
            $$2 = dhm.e($$2);
        }
        $$0.b(ki.u, Integer.valueOf($$2));
        return $$0;
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.w.a((dwo $$1, is $$2) -> this.a($$0, this.v));
    }

    @Override
    public boolean b(ddm $$0) {
        return dij.a(this.w, $$0, dzs.oW);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            dlt $$5 = this.v.a(0);
            dlt $$6 = this.v.a(1);
            if ($$1 == 2) {
                if (!this.a($$4, 3, 39, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 == 0 || $$1 == 1 ? !this.a($$4, 3, 39, false) : ($$5.f() || $$6.f() ? !this.a($$4, 0, 2, false) : ($$1 >= 3 && $$1 < 30 ? !this.a($$4, 30, 39, false) : $$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)))) {
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
}

