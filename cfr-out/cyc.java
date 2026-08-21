/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class cyc
extends chn
implements czu {
    private static final Logger cx = LogUtils.getLogger();
    public static final alw<Integer> a = ama.a(cyc.class, aly.b);
    private static final csk cy = csk.a().a(64.0);
    private static final int cz = 200;
    private static final int cA = 400;
    private static final float cB = 0.25f;
    private static final String cC = "DragonDeathTime";
    private static final String cD = "DragonPhase";
    private static final int cE = 0;
    public final cya b = new cya();
    private final cyd[] cF;
    public final cyd c;
    private final cyd cG;
    private final cyd cH;
    private final cyd cI;
    private final cyd cJ;
    private final cyd cK;
    private final cyd cL;
    private final cyd cM;
    public float d;
    public float e;
    public boolean f;
    public int cu = 0;
    public float cv;
    public @Nullable cyb cw;
    private @Nullable esk cN;
    private is cO = is.c;
    private final cyu cP;
    private int cQ = 100;
    private float cR;
    private final fln[] cU = new fln[24];
    private final int[] cV = new int[24];
    private final fll cW = new fll();

    public cyc(cgu<? extends cyc> $$0, dwo $$1) {
        super((cgu<? extends chn>)cgu.T, $$1);
        this.c = new cyd(this, "head", 1.0f, 1.0f);
        this.cG = new cyd(this, "neck", 3.0f, 3.0f);
        this.cH = new cyd(this, "body", 5.0f, 3.0f);
        this.cI = new cyd(this, "tail", 2.0f, 2.0f);
        this.cJ = new cyd(this, "tail", 2.0f, 2.0f);
        this.cK = new cyd(this, "tail", 2.0f, 2.0f);
        this.cL = new cyd(this, "wing", 4.0f, 2.0f);
        this.cM = new cyd(this, "wing", 4.0f, 2.0f);
        this.cF = new cyd[]{this.c, this.cG, this.cH, this.cI, this.cJ, this.cK, this.cL, this.cM};
        this.x(this.fq());
        this.ar = true;
        this.cP = new cyu(this);
    }

    public void a(esk $$0) {
        this.cN = $$0;
    }

    public void c(is $$0) {
        this.cO = $$0;
    }

    public is k() {
        return this.cO;
    }

    public static cir.a p() {
        return chn.E().a(cis.u, 200.0).a(cis.j, 16.0);
    }

    @Override
    public boolean bp() {
        float $$0 = bgj.b((double)(this.e * ((float)Math.PI * 2)));
        float $$1 = bgj.b((double)(this.d * ((float)Math.PI * 2)));
        return $$1 <= -0.3f && $$0 >= -0.3f;
    }

    @Override
    public void bo() {
        if (this.ao().B_() && !this.bq()) {
            this.ao().a(this.dP(), this.dR(), this.dV(), bda.jL, this.dB(), 5.0f, 0.8f + this.as.i() * 0.3f, false);
        }
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, cyt.k.b());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void d_() {
        axf $$0;
        esk $$1;
        dwo dwo2;
        this.bd();
        if (this.ao().B_()) {
            this.x(this.eZ());
            if (!this.bq() && !this.cP.a().a() && --this.cQ < 0) {
                this.ao().a(this.dP(), this.dR(), this.dV(), bda.jM, this.dB(), 2.5f, 0.8f + this.as.i() * 0.3f, false);
                this.cQ = 200 + this.as.a(200);
            }
        }
        if (this.cN == null && (dwo2 = this.ao()) instanceof axf && ($$1 = ($$0 = (axf)dwo2).K()) != null && this.cY().equals($$1.i())) {
            this.cN = $$1;
        }
        this.d = this.e;
        if (this.fa()) {
            float $$2 = (this.as.i() - 0.5f) * 8.0f;
            float $$3 = (this.as.i() - 0.5f) * 4.0f;
            float $$4 = (this.as.i() - 0.5f) * 8.0f;
            this.ao().a(ly.x, this.dP() + (double)$$2, this.dR() + 2.0 + (double)$$3, this.dV() + (double)$$4, 0.0, 0.0, 0.0);
            return;
        }
        this.gQ();
        ftm $$5 = this.dN();
        float $$6 = 0.2f / ((float)$$5.i() * 10.0f + 1.0f);
        this.e = this.cP.a().a() ? (this.e += 0.1f) : (this.f ? (this.e += $$6 * 0.5f) : (this.e += ($$6 *= (float)Math.pow(2.0, $$5.h))));
        this.v(bgj.f(this.ec()));
        if (this.gG()) {
            this.e = 0.5f;
            return;
        }
        this.b.a(this.dR(), this.ec());
        dwo dwo3 = this.ao();
        if (!(dwo3 instanceof axf)) {
            this.bQ.e();
            this.cP.a().b();
        } else {
            ftm $$10;
            void $$8;
            axf $$7 = (axf)dwo3;
            cyn $$9 = this.cP.a();
            $$9.a((axf)$$8);
            if (this.cP.a() != $$9) {
                $$9 = this.cP.a();
                $$9.a((axf)$$8);
            }
            if (($$10 = $$9.f()) != null) {
                double $$11 = $$10.g - this.dP();
                double $$12 = $$10.h - this.dR();
                double $$13 = $$10.i - this.dV();
                double $$14 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
                float $$15 = $$9.e();
                double $$16 = Math.sqrt($$11 * $$11 + $$13 * $$13);
                if ($$16 > 0.0) {
                    $$12 = bgj.a($$12 / $$16, (double)(-$$15), (double)$$15);
                }
                this.k(this.dN().b(0.0, $$12 * 0.01, 0.0));
                this.v(bgj.f(this.ec()));
                ftm $$17 = $$10.a(this.dP(), this.dR(), this.dV()).d();
                ftm $$18 = new ftm(bgj.a((double)(this.ec() * ((float)Math.PI / 180))), this.dN().h, -bgj.b((double)(this.ec() * ((float)Math.PI / 180)))).d();
                float $$19 = Math.max(((float)$$18.b($$17) + 0.5f) / 1.5f, 0.0f);
                if (Math.abs($$11) > (double)1.0E-5f || Math.abs($$13) > (double)1.0E-5f) {
                    float $$20 = bgj.a(bgj.f(180.0f - (float)bgj.d($$11, $$13) * 57.295776f - this.ec()), -50.0f, 50.0f);
                    this.cv *= 0.8f;
                    this.cv += $$20 * $$9.g();
                    this.v(this.ec() + this.cv * 0.1f);
                }
                float $$21 = (float)(2.0 / ($$14 + 1.0));
                float $$22 = 0.06f;
                this.a(0.06f * ($$19 * $$21 + (1.0f - $$21)), new ftm(0.0, 0.0, -1.0));
                if (this.f) {
                    this.a(chp.a, this.dN().c((double)0.8f));
                } else {
                    this.a(chp.a, this.dN());
                }
                ftm $$23 = this.dN().d();
                double $$24 = 0.8 + 0.15 * ($$23.b($$18) + 1.0) / 2.0;
                this.k(this.dN().d($$24, 0.91f, $$24));
            }
        }
        if (!this.ao().B_()) {
            this.aW();
        }
        this.bC = this.ec();
        ftm[] $$25 = new ftm[this.cF.length];
        for (int $$26 = 0; $$26 < this.cF.length; ++$$26) {
            $$25[$$26] = new ftm(this.cF[$$26].dP(), this.cF[$$26].dR(), this.cF[$$26].dV());
        }
        float $$27 = (float)(this.b.a(5).a() - this.b.a(10).a()) * 10.0f * ((float)Math.PI / 180);
        float $$28 = bgj.b((double)$$27);
        float $$29 = bgj.a((double)$$27);
        float $$30 = this.ec() * ((float)Math.PI / 180);
        float $$31 = bgj.a((double)$$30);
        float $$32 = bgj.b((double)$$30);
        this.a(this.cH, (double)($$31 * 0.5f), 0.0, (double)(-$$32 * 0.5f));
        this.a(this.cL, (double)($$32 * 4.5f), 2.0, (double)($$31 * 4.5f));
        this.a(this.cM, (double)($$32 * -4.5f), 2.0, (double)($$31 * -4.5f));
        dwo dwo4 = this.ao();
        if (dwo4 instanceof axf) {
            axf $$33 = (axf)dwo4;
            if (this.bu == 0) {
                this.a($$33, $$33.a((cgk)this, this.cL.dj().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), cgs.e));
                this.a($$33, $$33.a((cgk)this, this.cM.dj().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), cgs.e));
                this.b($$33, $$33.a((cgk)this, this.c.dj().g(1.0), cgs.e));
                this.b($$33, $$33.a((cgk)this, this.cG.dj().g(1.0), cgs.e));
            }
        }
        float $$34 = bgj.a((double)(this.ec() * ((float)Math.PI / 180) - this.cv * 0.01f));
        float $$35 = bgj.b((double)(this.ec() * ((float)Math.PI / 180) - this.cv * 0.01f));
        float $$36 = this.gP();
        this.a(this.c, (double)($$34 * 6.5f * $$28), (double)($$36 + $$29 * 6.5f), (double)(-$$35 * 6.5f * $$28));
        this.a(this.cG, (double)($$34 * 5.5f * $$28), (double)($$36 + $$29 * 5.5f), (double)(-$$35 * 5.5f * $$28));
        cya.a $$37 = this.b.a(5);
        for (int $$38 = 0; $$38 < 3; ++$$38) {
            cyd $$39 = null;
            if ($$38 == 0) {
                $$39 = this.cI;
            }
            if ($$38 == 1) {
                $$39 = this.cJ;
            }
            if ($$38 == 2) {
                $$39 = this.cK;
            }
            cya.a $$40 = this.b.a(12 + $$38 * 2);
            float $$41 = this.ec() * ((float)Math.PI / 180) + this.k((double)($$40.b() - $$37.b())) * ((float)Math.PI / 180);
            float $$42 = bgj.a((double)$$41);
            float $$43 = bgj.b((double)$$41);
            float $$44 = 1.5f;
            float $$45 = (float)($$38 + 1) * 2.0f;
            this.a($$39, (double)(-($$31 * 1.5f + $$42 * $$45) * $$28), $$40.a() - $$37.a() - (double)(($$45 + 1.5f) * $$29) + 1.5, (double)(($$32 * 1.5f + $$43 * $$45) * $$28));
        }
        dwo dwo5 = this.ao();
        if (dwo5 instanceof axf) {
            axf $$46 = (axf)dwo5;
            this.f = this.a($$46, this.c.dj()) | this.a($$46, this.cG.dj()) | this.a($$46, this.cH.dj());
            if (this.cN != null) {
                this.cN.b(this);
            }
        }
        for (int $$47 = 0; $$47 < this.cF.length; ++$$47) {
            this.cF[$$47].Y = $$25[$$47].g;
            this.cF[$$47].Z = $$25[$$47].h;
            this.cF[$$47].aa = $$25[$$47].i;
            this.cF[$$47].ao = $$25[$$47].g;
            this.cF[$$47].ap = $$25[$$47].h;
            this.cF[$$47].aq = $$25[$$47].i;
        }
    }

    private void a(cyd $$0, double $$1, double $$2, double $$3) {
        $$0.a_(this.dP() + $$1, this.dR() + $$2, this.dV() + $$3);
    }

    private float gP() {
        if (this.cP.a().a()) {
            return -1.0f;
        }
        cya.a $$0 = this.b.a(5);
        cya.a $$1 = this.b.a(0);
        return (float)($$0.a() - $$1.a());
    }

    private void gQ() {
        if (this.cw != null) {
            if (this.cw.eh()) {
                this.cw = null;
            } else if (this.at % 10 == 0 && this.eZ() < this.fq()) {
                this.x(this.eZ() + 1.0f);
            }
        }
        if (this.as.a(10) == 0) {
            List<cyb> $$0 = this.ao().a(cyb.class, this.dj().g(32.0));
            cyb $$1 = null;
            double $$2 = Double.MAX_VALUE;
            for (cyb $$3 : $$0) {
                double $$4 = $$3.g(this);
                if (!($$4 < $$2)) continue;
                $$2 = $$4;
                $$1 = $$3;
            }
            this.cw = $$1;
        }
    }

    private void a(axf $$0, List<cgk> $$1) {
        double $$2 = (this.cH.dj().a + this.cH.dj().d) / 2.0;
        double $$3 = (this.cH.dj().c + this.cH.dj().f) / 2.0;
        for (cgk $$4 : $$1) {
            if (!($$4 instanceof chl)) continue;
            chl $$5 = (chl)$$4;
            double $$6 = $$4.dP() - $$2;
            double $$7 = $$4.dV() - $$3;
            double $$8 = Math.max($$6 * $$6 + $$7 * $$7, 0.1);
            $$4.i($$6 / $$8 * 4.0, 0.2f, $$7 / $$8 * 4.0);
            if (this.cP.a().a() || $$5.eM() >= $$4.at - 2) continue;
            cex $$9 = this.en().b(this);
            $$4.a($$0, $$9, 5.0f);
            dsq.a($$0, $$4, $$9);
        }
    }

    private void b(axf $$0, List<cgk> $$1) {
        for (cgk $$2 : $$1) {
            if (!($$2 instanceof chl)) continue;
            cex $$3 = this.en().b(this);
            $$2.a($$0, $$3, 10.0f);
            dsq.a($$0, $$2, $$3);
        }
    }

    private float k(double $$0) {
        return (float)bgj.g($$0);
    }

    private boolean a(axf $$0, fth $$1) {
        int $$2 = bgj.c($$1.a);
        int $$3 = bgj.c($$1.b);
        int $$4 = bgj.c($$1.c);
        int $$5 = bgj.c($$1.d);
        int $$6 = bgj.c($$1.e);
        int $$7 = bgj.c($$1.f);
        boolean $$8 = false;
        boolean $$9 = false;
        for (int $$10 = $$2; $$10 <= $$5; ++$$10) {
            for (int $$11 = $$3; $$11 <= $$6; ++$$11) {
                for (int $$12 = $$4; $$12 <= $$7; ++$$12) {
                    is $$13 = new is($$10, $$11, $$12);
                    eoh $$14 = $$0.a_($$13);
                    if ($$14.l() || $$14.a(bdp.aR)) continue;
                    if (!$$0.U().a(eua.F).booleanValue() || $$14.a(bdp.aQ)) {
                        $$8 = true;
                        continue;
                    }
                    $$9 = $$0.a($$13, false) || $$9;
                }
            }
        }
        if ($$9) {
            is $$15 = new is($$2 + this.as.a($$5 - $$2 + 1), $$3 + this.as.a($$6 - $$3 + 1), $$4 + this.as.a($$7 - $$4 + 1));
            $$0.c(2008, $$15, 0);
        }
        return $$8;
    }

    public boolean a(axf $$0, cyd $$1, cex $$2, float $$3) {
        if (this.cP.a().h() == cyt.j) {
            return false;
        }
        $$3 = this.cP.a().a($$2, $$3);
        if ($$1 != this.c) {
            $$3 = $$3 / 4.0f + Math.min($$3, 1.0f);
        }
        if ($$3 < 0.01f) {
            return false;
        }
        if ($$2.d() instanceof ddm || $$2.a(bdq.y)) {
            float $$4 = this.eZ();
            this.d($$0, $$2, $$3);
            if (this.fa() && !this.cP.a().a()) {
                this.x(1.0f);
                this.cP.a(cyt.j);
            }
            if (this.cP.a().a()) {
                this.cR = this.cR + $$4 - this.eZ();
                if (this.cR > 0.25f * this.fq()) {
                    this.cR = 0.0f;
                    this.cP.a(cyt.e);
                }
            }
        }
        return true;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        return this.a($$0, this.cH, $$1, $$2);
    }

    protected void d(axf $$0, cex $$1, float $$2) {
        super.a($$0, $$1, $$2);
    }

    @Override
    public void c(axf $$0) {
        this.a(cgk.e.a);
        this.c(etk.p);
        if (this.cN != null) {
            this.cN.b(this);
            this.cN.a(this);
        }
    }

    @Override
    protected void eH() {
        dwo dwo2;
        cyd[] $$22;
        if (this.cN != null) {
            this.cN.b(this);
        }
        ++this.cu;
        if (this.cu >= 180 && this.cu <= 200) {
            float $$0 = (this.as.i() - 0.5f) * 8.0f;
            float $$1 = (this.as.i() - 0.5f) * 4.0f;
            float $$22 = (this.as.i() - 0.5f) * 8.0f;
            this.ao().a(ly.w, this.dP() + (double)$$0, this.dR() + 2.0 + (double)$$1, this.dV() + (double)$$22, 0.0, 0.0, 0.0);
        }
        int $$3 = 500;
        if (this.cN != null && !this.cN.f()) {
            $$3 = 12000;
        }
        if (($$22 = this.ao()) instanceof axf) {
            axf $$4 = (axf)$$22;
            if (this.cu > 150 && this.cu % 5 == 0 && $$4.U().a(eua.D).booleanValue()) {
                cgz.a($$4, this.dI(), bgj.b((float)$$3 * 0.08f));
            }
            if (this.cu == 1 && !this.bq()) {
                $$4.b(1028, this.dK(), 0);
            }
        }
        ftm $$5 = new ftm(0.0, 0.1f, 0.0);
        this.a(chp.a, $$5);
        for (cyd $$6 : this.cF) {
            $$6.bP();
            $$6.b($$6.dI().e($$5));
        }
        if (this.cu == 200 && (dwo2 = this.ao()) instanceof axf) {
            axf $$7 = (axf)dwo2;
            if ($$7.U().a(eua.D).booleanValue()) {
                cgz.a($$7, this.dI(), bgj.b((float)$$3 * 0.2f));
            }
            if (this.cN != null) {
                this.cN.a(this);
            }
            this.a(cgk.e.a);
            this.c(etk.p);
        }
    }

    public int gL() {
        if (this.cU[0] == null) {
            for (int $$0 = 0; $$0 < 24; ++$$0) {
                int $$8;
                int $$7;
                int $$1 = 5;
                int $$2 = $$0;
                if ($$0 < 12) {
                    int $$3 = bgj.b(60.0f * bgj.b((double)(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)$$2))));
                    int $$4 = bgj.b(60.0f * bgj.a((double)(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)$$2))));
                } else if ($$0 < 20) {
                    int $$5 = bgj.b(40.0f * bgj.b((double)(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)($$2 -= 12)))));
                    int $$6 = bgj.b(40.0f * bgj.a((double)(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)$$2))));
                    $$1 += 10;
                } else {
                    $$7 = bgj.b(20.0f * bgj.b((double)(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)($$2 -= 20)))));
                    $$8 = bgj.b(20.0f * bgj.a((double)(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)$$2))));
                }
                int $$9 = Math.max(73, this.ao().a(euq.a.f, new is($$7, 0, $$8)).v() + $$1);
                this.cU[$$0] = new fln($$7, $$9, $$8);
            }
            this.cV[0] = 6146;
            this.cV[1] = 8197;
            this.cV[2] = 8202;
            this.cV[3] = 16404;
            this.cV[4] = 32808;
            this.cV[5] = 32848;
            this.cV[6] = 65696;
            this.cV[7] = 131392;
            this.cV[8] = 131712;
            this.cV[9] = 263424;
            this.cV[10] = 526848;
            this.cV[11] = 525313;
            this.cV[12] = 1581057;
            this.cV[13] = 3166214;
            this.cV[14] = 2138120;
            this.cV[15] = 6373424;
            this.cV[16] = 4358208;
            this.cV[17] = 12910976;
            this.cV[18] = 9044480;
            this.cV[19] = 9706496;
            this.cV[20] = 15216640;
            this.cV[21] = 0xD0E000;
            this.cV[22] = 11763712;
            this.cV[23] = 0x7E0000;
        }
        return this.p(this.dP(), this.dR(), this.dV());
    }

    public int p(double $$0, double $$1, double $$2) {
        float $$3 = 10000.0f;
        int $$4 = 0;
        fln $$5 = new fln(bgj.c($$0), bgj.c($$1), bgj.c($$2));
        int $$6 = 0;
        if (this.cN == null || this.cN.e() == 0) {
            $$6 = 12;
        }
        for (int $$7 = $$6; $$7 < 24; ++$$7) {
            float $$8;
            if (this.cU[$$7] == null || !(($$8 = this.cU[$$7].c($$5)) < $$3)) continue;
            $$3 = $$8;
            $$4 = $$7;
        }
        return $$4;
    }

    public @Nullable flp a(int $$0, int $$1, @Nullable fln $$2) {
        for (int $$3 = 0; $$3 < 24; ++$$3) {
            fln $$4 = this.cU[$$3];
            $$4.i = false;
            $$4.g = 0.0f;
            $$4.e = 0.0f;
            $$4.f = 0.0f;
            $$4.h = null;
            $$4.d = -1;
        }
        fln $$5 = this.cU[$$0];
        fln $$6 = this.cU[$$1];
        $$5.e = 0.0f;
        $$5.g = $$5.f = $$5.a($$6);
        this.cW.a();
        this.cW.a($$5);
        fln $$7 = $$5;
        int $$8 = 0;
        if (this.cN == null || this.cN.e() == 0) {
            $$8 = 12;
        }
        while (!this.cW.e()) {
            fln $$9 = this.cW.c();
            if ($$9.equals($$6)) {
                if ($$2 != null) {
                    $$2.h = $$6;
                    $$6 = $$2;
                }
                return this.a($$5, $$6);
            }
            if ($$9.a($$6) < $$7.a($$6)) {
                $$7 = $$9;
            }
            $$9.i = true;
            int $$10 = 0;
            for (int $$11 = 0; $$11 < 24; ++$$11) {
                if (this.cU[$$11] != $$9) continue;
                $$10 = $$11;
                break;
            }
            for (int $$12 = $$8; $$12 < 24; ++$$12) {
                if ((this.cV[$$10] & 1 << $$12) <= 0) continue;
                fln $$13 = this.cU[$$12];
                if ($$13.i) continue;
                float $$14 = $$9.e + $$9.a($$13);
                if ($$13.c() && !($$14 < $$13.e)) continue;
                $$13.h = $$9;
                $$13.e = $$14;
                $$13.f = $$13.a($$6);
                if ($$13.c()) {
                    this.cW.a($$13, $$13.e + $$13.f);
                    continue;
                }
                $$13.g = $$13.e + $$13.f;
                this.cW.a($$13);
            }
        }
        if ($$7 == $$5) {
            return null;
        }
        cx.debug("Failed to find path from {} to {}", (Object)$$0, (Object)$$1);
        if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
        }
        return this.a($$5, $$7);
    }

    private flp a(fln $$0, fln $$1) {
        ArrayList $$2 = Lists.newArrayList();
        fln $$3 = $$1;
        $$2.add(0, $$3);
        while ($$3.h != null) {
            $$3 = $$3.h;
            $$2.add(0, $$3);
        }
        return new flp($$2, new is($$1.a, $$1.b, $$1.c), true);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(cD, this.cP.a().h().b());
        $$0.a(cC, this.cu);
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        $$02.e(cD).ifPresent($$0 -> this.cP.a(cyt.a($$0)));
        this.cu = $$02.a(cC, 0);
    }

    @Override
    public void dW() {
    }

    public cyd[] gM() {
        return this.cF;
    }

    @Override
    public boolean bX() {
        return false;
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected bcz W() {
        return bda.jI;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.jN;
    }

    @Override
    protected float fC() {
        return 5.0f;
    }

    public ftm L(float $$0) {
        ftm $$12;
        cyn $$1 = this.cP.a();
        cyt<? extends cyn> $$2 = $$1.h();
        if ($$2 == cyt.d || $$2 == cyt.e) {
            is $$3 = this.ao().a(euq.a.f, exv.a(this.cO));
            float $$4 = Math.max((float)Math.sqrt($$3.b(this.dI())) / 4.0f, 1.0f);
            float $$5 = 6.0f / $$4;
            float $$6 = this.ee();
            float $$7 = 1.5f;
            this.w(-$$5 * 1.5f * 5.0f);
            ftm $$8 = this.h($$0);
            this.w($$6);
        } else if ($$1.a()) {
            float $$9 = this.ee();
            float $$10 = 1.5f;
            this.w(-45.0f);
            ftm $$11 = this.h($$0);
            this.w($$9);
        } else {
            $$12 = this.h($$0);
        }
        return $$12;
    }

    public void a(axf $$0, cyb $$1, is $$2, cex $$3) {
        ddm $$6;
        cgk cgk2 = $$3.d();
        if (cgk2 instanceof ddm) {
            ddm $$4;
            ddm $$5 = $$4 = (ddm)cgk2;
        } else {
            $$6 = $$0.a(cy, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
        }
        if ($$1 == this.cw) {
            this.a($$0, this.c, this.en().d($$1, $$6), 10.0f);
        }
        this.cP.a().a($$1, $$2, $$3, $$6);
    }

    @Override
    public void a(alw<?> $$0) {
        if (a.equals($$0) && this.ao().B_()) {
            this.cP.a(cyt.a(this.aD().a(a)));
        }
        super.a($$0);
    }

    public cyu gN() {
        return this.cP;
    }

    public @Nullable esk gO() {
        return this.cN;
    }

    @Override
    public boolean b(cfm $$0, @Nullable cgk $$1) {
        return false;
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
    public void a(adc $$0) {
        super.a($$0);
        cyd[] $$1 = this.gM();
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            $$1[$$2].e($$2 + $$0.b() + 1);
        }
    }

    @Override
    public boolean c(chl $$0) {
        return $$0.eS();
    }

    @Override
    protected float c(float $$0) {
        return 1.0f;
    }
}

