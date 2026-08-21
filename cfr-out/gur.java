/*
 * Decompiled with CFR 0.152.
 */
public class gur
extends gti<diu> {
    private static final amo D = amo.b("container/villager/out_of_stock");
    private static final amo E = amo.b("container/villager/experience_bar_background");
    private static final amo F = amo.b("container/villager/experience_bar_current");
    private static final amo G = amo.b("container/villager/experience_bar_result");
    private static final amo H = amo.b("container/villager/scroller");
    private static final amo I = amo.b("container/villager/scroller_disabled");
    private static final amo J = amo.b("container/villager/trade_arrow_out_of_stock");
    private static final amo K = amo.b("container/villager/trade_arrow");
    private static final amo L = amo.b("container/villager/discount_strikethrough");
    private static final amo M = amo.b("textures/gui/container/villager.png");
    private static final int N = 512;
    private static final int O = 256;
    private static final int P = 99;
    private static final int Q = 136;
    private static final int R = 16;
    private static final int S = 5;
    private static final int T = 35;
    private static final int U = 68;
    private static final int V = 6;
    private static final int W = 7;
    private static final int X = 5;
    private static final int Y = 20;
    private static final int Z = 88;
    private static final int aa = 27;
    private static final int ab = 6;
    private static final int ac = 139;
    private static final int ad = 18;
    private static final int ae = 94;
    private static final yh af = yh.c("merchant.trades");
    private static final yh ag = yh.c("merchant.deprecated");
    private int ah;
    private final a[] ai = new a[7];
    int aj;
    private boolean ak;

    public gur(diu $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        this.d = 276;
        this.u = 107;
    }

    private void I() {
        ((diu)this.w).e(this.ah);
        ((diu)this.w).h(this.ah);
        this.n.R().b(new ajr(this.ah));
    }

    @Override
    protected void bg_() {
        super.bg_();
        int $$02 = (this.o - this.d) / 2;
        int $$1 = (this.p - this.e) / 2;
        int $$2 = $$1 + 16 + 2;
        for (int $$3 = 0; $$3 < 7; ++$$3) {
            this.ai[$$3] = this.c(new a($$02 + 5, $$2, $$3, $$0 -> {
                if ($$0 instanceof a) {
                    this.ah = ((a)$$0).a() + this.aj;
                    this.I();
                }
            }));
            $$2 += 20;
        }
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2) {
        int $$3 = ((diu)this.w).n();
        if ($$3 > 0 && $$3 <= 5 && ((diu)this.w).q()) {
            yw $$4 = yh.a("merchant.title", this.m, yh.c("merchant.level." + $$3));
            int $$5 = this.q.a($$4);
            int $$6 = 49 + this.d / 2 - $$5 / 2;
            $$0.a(this.q, (yh)$$4, $$6, 6, -12566464, false);
        } else {
            $$0.a(this.q, this.m, 49 + this.d / 2 - this.q.a(this.m) / 2, 6, -12566464, false);
        }
        $$0.a(this.q, this.x, this.u, this.v, -12566464, false);
        int $$7 = this.q.a(af);
        $$0.a(this.q, af, 5 - $$7 / 2 + 48, 6, -12566464, false);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = (this.o - this.d) / 2;
        int $$5 = (this.p - this.e) / 2;
        $$0.a(hpa.at, M, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 512, 256);
        dvm $$6 = ((diu)this.w).p();
        if (!$$6.isEmpty()) {
            int $$7 = this.ah;
            if ($$7 < 0 || $$7 >= $$6.size()) {
                return;
            }
            dvl $$8 = (dvl)$$6.get($$7);
            if ($$8.r()) {
                $$0.a(hpa.at, D, this.z + 83 + 99, this.A + 35, 28, 21);
            }
        }
    }

    private void a(gir $$0, int $$1, int $$2, dvl $$3) {
        int $$4 = ((diu)this.w).n();
        int $$5 = ((diu)this.w).l();
        if ($$4 >= 5) {
            return;
        }
        $$0.a(hpa.at, E, $$1 + 136, $$2 + 16, 102, 5);
        int $$6 = dcy.b($$4);
        if ($$5 < $$6 || !dcy.d($$4)) {
            return;
        }
        int $$7 = 102;
        float $$8 = 102.0f / (float)(dcy.c($$4) - $$6);
        int $$9 = Math.min(bgj.b($$8 * (float)($$5 - $$6)), 102);
        $$0.a(hpa.at, F, 102, 5, 0, 0, $$1 + 136, $$2 + 16, $$9, 5);
        int $$10 = ((diu)this.w).m();
        if ($$10 > 0) {
            int $$11 = Math.min(bgj.b((float)$$10 * $$8), 102 - $$9);
            $$0.a(hpa.at, G, 102, 5, $$9, 0, $$1 + 136 + $$9, $$2 + 16, $$11, 5);
        }
    }

    private void a(gir $$0, int $$1, int $$2, int $$3, int $$4, dvm $$5) {
        int $$6 = $$5.size() + 1 - 7;
        if ($$6 > 1) {
            int $$7 = 139 - (27 + ($$6 - 1) * 139 / $$6);
            int $$8 = 1 + $$7 / $$6 + 139 / $$6;
            int $$9 = 113;
            int $$10 = Math.min(113, this.aj * $$8);
            if (this.aj == $$6 - 1) {
                $$10 = 113;
            }
            int $$11 = $$1 + 94;
            int $$12 = $$2 + 18 + $$10;
            $$0.a(hpa.at, H, $$11, $$12, 6, 27);
            if ($$3 >= $$11 && $$3 < $$1 + 94 + 6 && $$4 >= $$12 && $$4 <= $$12 + 27) {
                $$0.a(this.ak ? fyn.e : fyn.d);
            }
        } else {
            $$0.a(hpa.at, I, $$1 + 94, $$2 + 18, 6, 27);
        }
    }

    @Override
    public void d(gir $$0, int $$1, int $$2, float $$3) {
        super.d($$0, $$1, $$2, $$3);
        dvm $$4 = ((diu)this.w).p();
        if (!$$4.isEmpty()) {
            int $$5 = (this.o - this.d) / 2;
            int $$6 = (this.p - this.e) / 2;
            int $$7 = $$6 + 16 + 1;
            int $$8 = $$5 + 5 + 5;
            this.a($$0, $$5, $$6, $$1, $$2, $$4);
            int $$9 = 0;
            for (dvl $$10 : $$4) {
                if (this.a($$4.size()) && ($$9 < this.aj || $$9 >= 7 + this.aj)) {
                    ++$$9;
                    continue;
                }
                dlt $$11 = $$10.a();
                dlt $$12 = $$10.b();
                dlt $$13 = $$10.c();
                dlt $$14 = $$10.f();
                int $$15 = $$7 + 2;
                this.a($$0, $$12, $$11, $$8, $$15);
                if (!$$13.f()) {
                    $$0.b($$13, $$5 + 5 + 35, $$15);
                    $$0.a(this.q, $$13, $$5 + 5 + 35, $$15);
                }
                this.a($$0, $$10, $$5, $$15);
                $$0.b($$14, $$5 + 5 + 68, $$15);
                $$0.a(this.q, $$14, $$5 + 5 + 68, $$15);
                $$7 += 20;
                ++$$9;
            }
            int $$16 = this.ah;
            dvl $$17 = (dvl)$$4.get($$16);
            if (((diu)this.w).q()) {
                this.a($$0, $$5, $$6, $$17);
            }
            if ($$17.r() && this.a(186, 35, 22, 21, (double)$$1, $$2) && ((diu)this.w).o()) {
                $$0.a(this.q, ag, $$1, $$2);
            }
            for (a $$18 : this.ai) {
                if ($$18.D()) {
                    $$18.a($$0, $$1, $$2);
                }
                $$18.l = $$18.a < ((diu)this.w).p().size();
            }
        }
        this.c($$0, $$1, $$2);
    }

    private void a(gir $$0, dvl $$1, int $$2, int $$3) {
        if ($$1.r()) {
            $$0.a(hpa.at, J, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
        } else {
            $$0.a(hpa.at, K, $$2 + 5 + 35 + 20, $$3 + 3, 10, 9);
        }
    }

    private void a(gir $$0, dlt $$1, dlt $$2, int $$3, int $$4) {
        $$0.b($$1, $$3, $$4);
        if ($$2.N() == $$1.N()) {
            $$0.a(this.q, $$1, $$3, $$4);
        } else {
            $$0.a(this.q, $$2, $$3, $$4, $$2.N() == 1 ? "1" : null);
            $$0.a(this.q, $$1, $$3 + 14, $$4, $$1.N() == 1 ? "1" : null);
            $$0.a(hpa.at, L, $$3 + 7, $$4 + 12, 9, 2);
        }
    }

    private boolean a(int $$0) {
        return $$0 > 7;
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (super.a($$0, $$1, $$2, $$3)) {
            return true;
        }
        int $$4 = ((diu)this.w).p().size();
        if (this.a($$4)) {
            int $$5 = $$4 - 7;
            this.aj = bgj.a((int)((double)this.aj - $$3), 0, $$5);
        }
        return true;
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        int $$3 = ((diu)this.w).p().size();
        if (this.ak) {
            int $$4 = this.A + 18;
            int $$5 = $$4 + 139;
            int $$6 = $$3 - 7;
            float $$7 = ((float)$$0.v() - (float)$$4 - 13.5f) / ((float)($$5 - $$4) - 27.0f);
            $$7 = $$7 * (float)$$6 + 0.5f;
            this.aj = bgj.a((int)$$7, 0, $$6);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        int $$2 = (this.o - this.d) / 2;
        int $$3 = (this.p - this.e) / 2;
        if (this.a(((diu)this.w).p().size()) && $$0.u() > (double)($$2 + 94) && $$0.u() < (double)($$2 + 94 + 6) && $$0.v() > (double)($$3 + 18) && $$0.v() <= (double)($$3 + 18 + 139 + 1)) {
            this.ak = true;
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean b(gzc $$0) {
        this.ak = false;
        return super.b($$0);
    }

    class a
    extends gje.d {
        final int a;

        public a(int $$0, int $$1, int $$2, gje.c $$3) {
            super($$0, $$1, 88, 20, yg.a, $$3, r);
            this.a = $$2;
            this.l = false;
        }

        public int a() {
            return this.a;
        }

        public void a(gir $$0, int $$1, int $$2) {
            if (this.j && ((diu)gur.this.w).p().size() > this.a + gur.this.aj) {
                if ($$1 < this.aT_() + 20) {
                    dlt $$3 = ((dvl)((diu)gur.this.w).p().get(this.a + gur.this.aj)).b();
                    $$0.b(gur.this.q, $$3, $$1, $$2);
                } else if ($$1 < this.aT_() + 50 && $$1 > this.aT_() + 30) {
                    dlt $$4 = ((dvl)((diu)gur.this.w).p().get(this.a + gur.this.aj)).c();
                    if (!$$4.f()) {
                        $$0.b(gur.this.q, $$4, $$1, $$2);
                    }
                } else if ($$1 > this.aT_() + 65) {
                    dlt $$5 = ((dvl)((diu)gur.this.w).p().get(this.a + gur.this.aj)).f();
                    $$0.b(gur.this.q, $$5, $$1, $$2);
                }
            }
        }
    }
}

