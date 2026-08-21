/*
 * Decompiled with CFR 0.152.
 */
public class guz
extends gti<djo> {
    private static final amo D = amo.b("container/stonecutter/scroller");
    private static final amo E = amo.b("container/stonecutter/scroller_disabled");
    private static final amo F = amo.b("container/stonecutter/recipe_selected");
    private static final amo G = amo.b("container/stonecutter/recipe_highlighted");
    private static final amo H = amo.b("container/stonecutter/recipe");
    private static final amo I = amo.b("textures/gui/container/stonecutter.png");
    private static final int J = 12;
    private static final int K = 15;
    private static final int L = 4;
    private static final int M = 3;
    private static final int N = 16;
    private static final int O = 18;
    private static final int P = 54;
    private static final int Q = 52;
    private static final int R = 14;
    private float S;
    private boolean T;
    private int U;
    private boolean V;

    public guz(djo $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        $$0.a(this::K);
        --this.t;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = this.z;
        int $$5 = this.A;
        $$0.a(hpa.at, I, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        int $$6 = (int)(41.0f * this.S);
        amo $$7 = this.J() ? D : E;
        int $$8 = $$4 + 119;
        int $$9 = $$5 + 15 + $$6;
        $$0.a(hpa.at, $$7, $$8, $$9, 12, 15);
        if ($$2 >= $$8 && $$2 < $$8 + 12 && $$3 >= $$9 && $$3 < $$9 + 15) {
            $$0.a(this.T ? fyn.e : fyn.d);
        }
        int $$10 = this.z + 52;
        int $$11 = this.A + 14;
        int $$12 = this.U + 12;
        this.a($$0, $$2, $$3, $$10, $$11, $$12);
        this.a($$0, $$10, $$11, $$12);
    }

    @Override
    protected void c(gir $$0, int $$1, int $$2) {
        super.c($$0, $$1, $$2);
        if (this.V) {
            int $$3 = this.z + 52;
            int $$4 = this.A + 14;
            int $$5 = this.U + 12;
            drf.b<drs> $$6 = ((djo)this.w).m();
            for (int $$7 = this.U; $$7 < $$5 && $$7 < $$6.d(); ++$$7) {
                int $$8 = $$7 - this.U;
                int $$9 = $$3 + $$8 % 4 * 16;
                int $$10 = $$4 + $$8 / 4 * 18 + 2;
                if ($$1 < $$9 || $$1 >= $$9 + 16 || $$2 < $$10 || $$2 >= $$10 + 18) continue;
                bhx $$11 = dsf.a(this.n.r);
                dse $$12 = $$6.e().get($$7).c().b();
                $$0.b(this.q, $$12.b($$11), $$1, $$2);
            }
        }
    }

    private void a(gir $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        for (int $$6 = this.U; $$6 < $$5 && $$6 < ((djo)this.w).n(); ++$$6) {
            amo $$13;
            int $$7 = $$6 - this.U;
            int $$8 = $$3 + $$7 % 4 * 16;
            int $$9 = $$7 / 4;
            int $$10 = $$4 + $$9 * 18 + 2;
            if ($$6 == ((djo)this.w).l()) {
                amo $$11 = F;
            } else if ($$1 >= $$8 && $$2 >= $$10 && $$1 < $$8 + 16 && $$2 < $$10 + 18) {
                amo $$12 = G;
            } else {
                $$13 = H;
            }
            int $$14 = $$10 - 1;
            $$0.a(hpa.at, $$13, $$8, $$14, 16, 18);
            if ($$1 < $$8 || $$2 < $$14 || $$1 >= $$8 + 16 || $$2 >= $$14 + 18) continue;
            $$0.a(fyn.d);
        }
    }

    private void a(gir $$0, int $$1, int $$2, int $$3) {
        drf.b<drs> $$4 = ((djo)this.w).m();
        bhx $$5 = dsf.a(this.n.r);
        for (int $$6 = this.U; $$6 < $$3 && $$6 < $$4.d(); ++$$6) {
            int $$7 = $$6 - this.U;
            int $$8 = $$1 + $$7 % 4 * 16;
            int $$9 = $$7 / 4;
            int $$10 = $$2 + $$9 * 18 + 2;
            dse $$11 = $$4.e().get($$6).c().b();
            $$0.a($$11.b($$5), $$8, $$10);
        }
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (this.V) {
            int $$2 = this.z + 52;
            int $$3 = this.A + 14;
            int $$4 = this.U + 12;
            for (int $$5 = this.U; $$5 < $$4; ++$$5) {
                int $$6 = $$5 - this.U;
                double $$7 = $$0.u() - (double)($$2 + $$6 % 4 * 16);
                double $$8 = $$0.v() - (double)($$3 + $$6 / 4 * 18);
                if (!($$7 >= 0.0) || !($$8 >= 0.0) || !($$7 < 16.0) || !($$8 < 18.0) || !((djo)this.w).a((ddm)this.n.s, $$5)) continue;
                gfj.V().ap().a(iph.a(bda.DO, 1.0f));
                this.n.q.a(((djo)this.w).l, $$5);
                return true;
            }
            $$2 = this.z + 119;
            $$3 = this.A + 9;
            if ($$0.u() >= (double)$$2 && $$0.u() < (double)($$2 + 12) && $$0.v() >= (double)$$3 && $$0.v() < (double)($$3 + 54)) {
                this.T = true;
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        if (this.T && this.J()) {
            int $$3 = this.A + 14;
            int $$4 = $$3 + 54;
            this.S = ((float)$$0.v() - (float)$$3 - 7.5f) / ((float)($$4 - $$3) - 15.0f);
            this.S = bgj.a(this.S, 0.0f, 1.0f);
            this.U = (int)((double)(this.S * (float)this.I()) + 0.5) * 4;
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean b(gzc $$0) {
        this.T = false;
        return super.b($$0);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (super.a($$0, $$1, $$2, $$3)) {
            return true;
        }
        if (this.J()) {
            int $$4 = this.I();
            float $$5 = (float)$$3 / (float)$$4;
            this.S = bgj.a(this.S - $$5, 0.0f, 1.0f);
            this.U = (int)((double)(this.S * (float)$$4) + 0.5) * 4;
        }
        return true;
    }

    private boolean J() {
        return this.V && ((djo)this.w).n() > 12;
    }

    protected int I() {
        return (((djo)this.w).n() + 4 - 1) / 4 - 3;
    }

    private void K() {
        this.V = ((djo)this.w).o();
        if (!this.V) {
            this.S = 0.0f;
            this.U = 0;
        }
    }
}

