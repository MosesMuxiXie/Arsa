/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class cyw
extends czz
implements dac {
    private static final alw<Integer> a = ama.a(cyw.class, aly.b);
    private static final alw<Integer> b = ama.a(cyw.class, aly.b);
    private static final alw<Integer> c = ama.a(cyw.class, aly.b);
    private static final List<alw<Integer>> d = ImmutableList.of(a, b, c);
    private static final alw<Integer> e = ama.a(cyw.class, aly.b);
    private static final int f = 220;
    private static final int cv = 0;
    private final float[] cw = new float[2];
    private final float[] cx = new float[2];
    private final float[] cy = new float[2];
    private final float[] cz = new float[2];
    private final int[] cA = new int[2];
    private final int[] cB = new int[2];
    private int cC;
    private final axb cD = (axb)new axb(this.R_(), ccs.a.f, ccs.b.a).a(true);
    private static final csk.a cE = ($$0, $$1) -> !$$0.ay().a(bdt.z) && $$0.gm();
    private static final csk cF = csk.a().a(20.0).a(cE);

    public cyw(cgu<? extends cyw> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.cp = new cnn(this, 10, false);
        this.x(this.fq());
        this.cn = 50;
    }

    @Override
    protected cre b(dwo $$0) {
        crc $$1 = new crc(this, $$0);
        $$1.e(false);
        $$1.a(true);
        return $$1;
    }

    @Override
    protected void D() {
        this.cs.a(0, new a());
        this.cs.a(2, new cpo(this, 1.0, 40, 20.0f));
        this.cs.a(5, new cqc(this, 1.0));
        this.cs.a(6, new cox(this, ddm.class, 8.0f));
        this.cs.a(7, new cpk(this));
        this.ct.a(1, new cqi(this, new Class[0]));
        this.ct.a(2, new cqj<chl>(this, chl.class, 0, false, false, cE));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, 0);
        $$0.a(b, 0);
        $$0.a(c, 0);
        $$0.a(e, 0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Invul", this.gR());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("Invul", 0));
        if (this.i_()) {
            this.cD.a(this.R_());
        }
    }

    @Override
    public void b(@Nullable yh $$0) {
        super.b($$0);
        this.cD.a(this.R_());
    }

    @Override
    protected bcz W() {
        return bda.FR;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.FU;
    }

    @Override
    protected bcz fd() {
        return bda.FT;
    }

    @Override
    public void d_() {
        cgk $$1;
        ftm $$0 = this.dN().d(1.0, 0.6, 1.0);
        if (!this.ao().B_() && this.b(0) > 0 && ($$1 = this.ao().a(this.b(0))) != null) {
            double $$2 = $$0.h;
            if (this.dR() < $$1.dR() || !this.gS() && this.dR() < $$1.dR() + 5.0) {
                $$2 = Math.max(0.0, $$2);
                $$2 += 0.3 - $$2 * (double)0.6f;
            }
            $$0 = new ftm($$0.g, $$2, $$0.i);
            ftm $$3 = new ftm($$1.dP() - this.dP(), 0.0, $$1.dV() - this.dV());
            if ($$3.j() > 9.0) {
                ftm $$4 = $$3.d();
                $$0 = $$0.b($$4.g * 0.3 - $$0.g * 0.6, 0.0, $$4.i * 0.3 - $$0.i * 0.6);
            }
        }
        this.k($$0);
        if ($$0.j() > 0.05) {
            this.v((float)bgj.d($$0.i, $$0.g) * 57.295776f - 90.0f);
        }
        super.d_();
        for (int $$5 = 0; $$5 < 2; ++$$5) {
            this.cz[$$5] = this.cx[$$5];
            this.cy[$$5] = this.cw[$$5];
        }
        for (int $$6 = 0; $$6 < 2; ++$$6) {
            int $$7 = this.b($$6 + 1);
            cgk $$8 = null;
            if ($$7 > 0) {
                $$8 = this.ao().a($$7);
            }
            if ($$8 != null) {
                double $$9 = this.d($$6 + 1);
                double $$10 = this.r($$6 + 1);
                double $$11 = this.s($$6 + 1);
                double $$12 = $$8.dP() - $$9;
                double $$13 = $$8.dT() - $$10;
                double $$14 = $$8.dV() - $$11;
                double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
                float $$16 = (float)(bgj.d($$14, $$12) * 57.2957763671875) - 90.0f;
                float $$17 = (float)(-(bgj.d($$13, $$15) * 57.2957763671875));
                this.cw[$$6] = this.a(this.cw[$$6], $$17, 40.0f);
                this.cx[$$6] = this.a(this.cx[$$6], $$16, 10.0f);
                continue;
            }
            this.cx[$$6] = this.a(this.cx[$$6], this.bC, 10.0f);
        }
        boolean $$18 = this.gS();
        for (int $$19 = 0; $$19 < 3; ++$$19) {
            double $$20 = this.d($$19);
            double $$21 = this.r($$19);
            double $$22 = this.s($$19);
            float $$23 = 0.3f * this.eF();
            this.ao().a(ly.ai, $$20 + this.as.k() * (double)$$23, $$21 + this.as.k() * (double)$$23, $$22 + this.as.k() * (double)$$23, 0.0, 0.0, 0.0);
            if (!$$18 || this.ao().y.a(4) != 0) continue;
            this.ao().a(lq.a(ly.v, 0.7f, 0.7f, 0.5f), $$20 + this.as.k() * (double)$$23, $$21 + this.as.k() * (double)$$23, $$22 + this.as.k() * (double)$$23, 0.0, 0.0, 0.0);
        }
        if (this.gR() > 0) {
            float $$24 = 3.3f * this.eF();
            for (int $$25 = 0; $$25 < 3; ++$$25) {
                this.ao().a(lq.a(ly.v, 0.7f, 0.7f, 0.9f), this.dP() + this.as.k(), this.dR() + (double)(this.as.i() * $$24), this.dV() + this.as.k(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void a(axf $$0) {
        if (this.gR() > 0) {
            int $$1 = this.gR() - 1;
            this.cD.a(1.0f - (float)$$1 / 220.0f);
            if ($$1 <= 0) {
                $$0.a((cgk)this, this.dP(), this.dT(), this.dV(), 7.0f, false, dwo.a.c);
                if (!this.bq()) {
                    $$0.b(1023, this.dK(), 0);
                }
            }
            this.a($$1);
            if (this.at % 10 == 0) {
                this.d(10.0f);
            }
            return;
        }
        super.a($$0);
        for (int $$2 = 1; $$2 < 3; ++$$2) {
            int $$8;
            if (this.at < this.cA[$$2 - 1]) continue;
            this.cA[$$2 - 1] = this.at + 10 + this.as.a(10);
            if ($$0.av() == ccz.c || $$0.av() == ccz.d) {
                int n2 = $$2 - 1;
                int n3 = this.cB[n2];
                this.cB[n2] = n3 + 1;
                if (n3 > 15) {
                    float $$3 = 10.0f;
                    float $$4 = 5.0f;
                    double $$5 = bgj.a(this.as, this.dP() - 10.0, this.dP() + 10.0);
                    double $$6 = bgj.a(this.as, this.dR() - 5.0, this.dR() + 5.0);
                    double $$7 = bgj.a(this.as, this.dV() - 10.0, this.dV() + 10.0);
                    this.a($$2 + 1, $$5, $$6, $$7, true);
                    this.cB[$$2 - 1] = 0;
                }
            }
            if (($$8 = this.b($$2)) > 0) {
                chl $$9 = (chl)$$0.a($$8);
                if ($$9 == null || !this.c($$9) || this.g((cgk)$$9) > 900.0 || !this.G($$9)) {
                    this.a($$2, 0);
                    continue;
                }
                this.a($$2 + 1, $$9);
                this.cA[$$2 - 1] = this.at + 40 + this.as.a(20);
                this.cB[$$2 - 1] = 0;
                continue;
            }
            List<chl> $$10 = $$0.a(chl.class, cF, this, this.dj().c(20.0, 8.0, 20.0));
            if ($$10.isEmpty()) continue;
            chl $$11 = $$10.get(this.as.a($$10.size()));
            this.a($$2, $$11.aA());
        }
        if (this.ag_() != null) {
            this.a(0, this.ag_().aA());
        } else {
            this.a(0, 0);
        }
        if (this.cC > 0) {
            --this.cC;
            if (this.cC == 0 && $$0.U().a(eua.F).booleanValue()) {
                boolean $$12 = false;
                int $$13 = bgj.b(this.dF() / 2.0f + 1.0f);
                int $$14 = bgj.b(this.dG());
                for (is $$15 : is.b(this.dO() - $$13, this.dQ(), this.dU() - $$13, this.dO() + $$13, this.dQ() + $$14, this.dU() + $$13)) {
                    eoh $$16 = $$0.a_($$15);
                    if (!cyw.c($$16)) continue;
                    $$12 = $$0.a($$15, true, (cgk)this) || $$12;
                }
                if ($$12) {
                    $$0.a(null, 1022, this.dK(), 0);
                }
            }
        }
        if (this.at % 20 == 0) {
            this.d(1.0f);
        }
        this.cD.a(this.eZ() / this.fq());
    }

    public static boolean c(eoh $$0) {
        return !$$0.l() && !$$0.a(bdp.aS);
    }

    public void k() {
        this.a(220);
        this.cD.a(0.0f);
        this.x(this.fq() / 3.0f);
    }

    @Override
    public void a(eoh $$0, ftm $$1) {
    }

    @Override
    public void d(axg $$0) {
        super.d($$0);
        this.cD.a($$0);
    }

    @Override
    public void e(axg $$0) {
        super.e($$0);
        this.cD.b($$0);
    }

    private double d(int $$0) {
        if ($$0 <= 0) {
            return this.dP();
        }
        float $$1 = (this.bC + (float)(180 * ($$0 - 1))) * ((float)Math.PI / 180);
        float $$2 = bgj.b((double)$$1);
        return this.dP() + (double)$$2 * 1.3 * (double)this.eF();
    }

    private double r(int $$0) {
        float $$1 = $$0 <= 0 ? 3.0f : 2.2f;
        return this.dR() + (double)($$1 * this.eF());
    }

    private double s(int $$0) {
        if ($$0 <= 0) {
            return this.dV();
        }
        float $$1 = (this.bC + (float)(180 * ($$0 - 1))) * ((float)Math.PI / 180);
        float $$2 = bgj.a((double)$$1);
        return this.dV() + (double)$$2 * 1.3 * (double)this.eF();
    }

    private float a(float $$0, float $$1, float $$2) {
        float $$3 = bgj.f($$1 - $$0);
        if ($$3 > $$2) {
            $$3 = $$2;
        }
        if ($$3 < -$$2) {
            $$3 = -$$2;
        }
        return $$0 + $$3;
    }

    private void a(int $$0, chl $$1) {
        this.a($$0, $$1.dP(), $$1.dR() + (double)$$1.dk() * 0.5, $$1.dV(), $$0 == 0 && this.as.i() < 0.001f);
    }

    private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
        if (!this.bq()) {
            this.ao().a(null, 1024, this.dK(), 0);
        }
        double $$5 = this.d($$0);
        double $$6 = this.r($$0);
        double $$7 = this.s($$0);
        double $$8 = $$1 - $$5;
        double $$9 = $$2 - $$6;
        double $$10 = $$3 - $$7;
        ftm $$11 = new ftm($$8, $$9, $$10);
        der $$12 = new der(this.ao(), this, $$11.d());
        $$12.d(this);
        if ($$4) {
            $$12.b(true);
        }
        $$12.a_($$5, $$6, $$7);
        this.ao().b($$12);
    }

    @Override
    public void a(chl $$0, float $$1) {
        this.a(0, $$0);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk $$3;
        if (this.a($$0, $$1)) {
            return false;
        }
        if ($$1.a(bdq.t) || $$1.d() instanceof cyw) {
            return false;
        }
        if (this.gR() > 0 && !$$1.a(bdq.d)) {
            return false;
        }
        if (this.gS() && (($$3 = $$1.c()) instanceof deh || $$3 instanceof dev)) {
            return false;
        }
        cgk $$4 = $$1.d();
        if ($$4 != null && $$4.ay().a(bdt.z)) {
            return false;
        }
        if (this.cC <= 0) {
            this.cC = 20;
        }
        int $$5 = 0;
        while ($$5 < this.cB.length) {
            int n2 = $$5++;
            this.cB[n2] = this.cB[n2] + 3;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void a(axf $$0, cex $$1, boolean $$2) {
        super.a($$0, $$1, $$2);
        czl $$3 = this.a($$0, dlx.wE);
        if ($$3 != null) {
            $$3.r();
        }
    }

    @Override
    public void dW() {
        if (this.ao().av() == ccz.a && !this.ay().s()) {
            this.aC();
            return;
        }
        this.bK = 0;
    }

    @Override
    public boolean b(cfm $$0, @Nullable cgk $$1) {
        return false;
    }

    public static cir.a p() {
        return czz.gW().a(cis.u, 300.0).a(cis.x, 0.6f).a(cis.n, 0.6f).a(cis.o, 40.0).a(cis.b, 4.0);
    }

    public float[] gP() {
        return this.cx;
    }

    public float[] gQ() {
        return this.cw;
    }

    public int gR() {
        return this.az.a(e);
    }

    public void a(int $$0) {
        this.az.a(e, $$0);
    }

    public int b(int $$0) {
        return this.az.a(d.get($$0));
    }

    public void a(int $$0, int $$1) {
        this.az.a(d.get($$0), $$1);
    }

    public boolean gS() {
        return this.eZ() <= this.fq() / 2.0f;
    }

    @Override
    protected boolean p(cgk $$0) {
        return false;
    }

    @Override
    public boolean o(boolean $$0) {
        return false;
    }

    @Override
    public boolean b(cfm $$0) {
        if ($$0.a(cfo.t)) {
            return false;
        }
        return super.b($$0);
    }

    class a
    extends cop {
        public a() {
            this.a(EnumSet.of(cop.a.a, cop.a.c, cop.a.b));
        }

        @Override
        public boolean b() {
            return cyw.this.gR() > 0;
        }
    }
}

