/*
 * Decompiled with CFR 0.152.
 */
public class dhr
extends dhi {
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    private static final int q = 3;
    private static final int r = 30;
    private static final int s = 30;
    private static final int t = 39;
    private final dhw u;
    long v;
    public final ccv p = new cdk(2){

        @Override
        public void e() {
            dhr.this.a(this);
            super.e();
        }
    };
    private final djd w = new djd(){

        @Override
        public void e() {
            dhr.this.a(this);
            super.e();
        }
    };

    public dhr(int $$0, ddl $$1) {
        this($$0, $$1, dhw.a);
    }

    public dhr(int $$0, ddl $$1, final dhw $$2) {
        super(dis.x, $$0);
        this.u = $$2;
        this.a(new dji(this, this.p, 0, 15, 15){

            @Override
            public boolean a(dlt $$0) {
                return $$0.c(ki.T);
            }
        });
        this.a(new dji(this, this.p, 1, 15, 52){

            @Override
            public boolean a(dlt $$0) {
                return $$0.a(dlx.sA) || $$0.a(dlx.wv) || $$0.a(dlx.gE);
            }
        });
        this.a(new dji(this.w, 2, 145, 39){

            @Override
            public boolean a(dlt $$0) {
                return false;
            }

            @Override
            public void a(ddm $$02, dlt $$12) {
                ((dji)dhr.this.k.get(0)).a(1);
                ((dji)dhr.this.k.get(1)).a(1);
                $$12.h().c($$12, $$02);
                $$2.a((dwo $$0, is $$1) -> {
                    long $$22 = $$0.au();
                    if (dhr.this.v != $$22) {
                        $$0.a(null, (is)$$1, bda.DM, bdb.e, 1.0f, 1.0f);
                        dhr.this.v = $$22;
                    }
                });
                super.a($$02, $$12);
            }
        });
        this.c($$1, 8, 84);
    }

    @Override
    public boolean b(ddm $$0) {
        return dhr.a(this.u, $$0, dzs.oU);
    }

    @Override
    public void a(ccv $$0) {
        dlt $$1 = this.p.a(0);
        dlt $$2 = this.p.a(1);
        dlt $$3 = this.w.a(2);
        if (!$$3.f() && ($$1.f() || $$2.f())) {
            this.w.b(2);
        } else if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
        }
    }

    private void a(dlt $$0, dlt $$1, dlt $$2) {
        this.u.a((dwo $$3, is $$4) -> {
            void $$9;
            fmw $$5 = dmg.b($$0, $$3);
            if ($$5 == null) {
                return;
            }
            if ($$1.a(dlx.sA) && !$$5.i && $$5.g < 4) {
                dlt $$6 = $$0.c(1);
                $$6.b(ki.V, dou.b);
                this.d();
            } else if ($$1.a(dlx.gE) && !$$5.i) {
                dlt $$7 = $$0.c(1);
                $$7.b(ki.V, dou.a);
                this.d();
            } else if ($$1.a(dlx.wv)) {
                dlt $$8 = $$0.c(2);
                this.d();
            } else {
                this.w.b(2);
                this.d();
                return;
            }
            if (!dlt.a((dlt)$$9, $$2)) {
                this.w.a(2, (dlt)$$9);
                this.d();
            }
        });
    }

    @Override
    public boolean a(dlt $$0, dji $$1) {
        return $$1.c != this.w && super.a($$0, $$1);
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 == 2) {
                $$4.h().c($$4, $$0);
                if (!this.a($$4, 3, 39, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if ($$1 == 1 || $$1 == 0 ? !this.a($$4, 3, 39, false) : ($$4.c(ki.T) ? !this.a($$4, 0, 1, false) : ($$4.a(dlx.sA) || $$4.a(dlx.wv) || $$4.a(dlx.gE) ? !this.a($$4, 1, 2, false) : ($$1 >= 3 && $$1 < 30 ? !this.a($$4, 30, 39, false) : $$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false))))) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
            }
            $$3.d();
            if ($$4.N() == $$2.N()) {
                return dlt.l;
            }
            $$3.a($$0, $$4);
            this.d();
        }
        return $$2;
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        this.w.b(2);
        this.u.a((dwo $$1, is $$2) -> this.a($$0, this.p));
    }
}

