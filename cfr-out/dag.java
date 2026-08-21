/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class dag
extends chn
implements czu {
    private static final alw<Integer> cu = ama.a(dag.class, aly.b);
    public static final int a = 1;
    public static final int b = 127;
    public static final int c = 4;
    private static final boolean cv = false;
    public float d;
    public float e;
    public float f;
    private boolean cw = false;

    public dag(cgu<? extends dag> $$0, dwo $$1) {
        super((cgu<? extends chn>)$$0, $$1);
        this.df();
        this.cp = new d(this);
    }

    @Override
    protected void D() {
        this.cs.a(1, new b(this));
        this.cs.a(2, new a(this));
        this.cs.a(3, new e(this));
        this.cs.a(5, new c(this));
        this.ct.a(1, new cqj<ddm>(this, ddm.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dR() - this.dR()) <= 4.0));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, true));
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cu, 1);
    }

    @VisibleForTesting
    public void a(int $$0, boolean $$1) {
        int $$2 = bgj.a($$0, 1, 127);
        this.az.a(cu, $$2);
        this.aH();
        this.j_();
        this.h(cis.u).a($$2 * $$2);
        this.h(cis.x).a(0.2f + 0.1f * (float)$$2);
        this.h(cis.d).a($$2);
        if ($$1) {
            this.x(this.fq());
        }
        this.cn = $$2;
    }

    public int gR() {
        return this.az.a(cu);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Size", this.gR() - 1);
        $$0.a("wasOnGround", this.cw);
    }

    @Override
    protected void a(fnq $$0) {
        this.a($$0.a("Size", 0) + 1, false);
        super.a($$0);
        this.cw = $$0.a("wasOnGround", false);
    }

    public boolean gS() {
        return this.gR() <= 1;
    }

    protected lw p() {
        return ly.Y;
    }

    @Override
    public void g() {
        this.f = this.e;
        this.e += (this.d - this.e) * 0.5f;
        super.g();
        if (this.aV() && !this.cw) {
            float $$0 = this.a(this.aF()).a() * 2.0f;
            float $$1 = $$0 / 2.0f;
            int $$2 = 0;
            while ((float)$$2 < $$0 * 16.0f) {
                float $$3 = this.as.i() * ((float)Math.PI * 2);
                float $$4 = this.as.i() * 0.5f + 0.5f;
                float $$5 = bgj.a((double)$$3) * $$1 * $$4;
                float $$6 = bgj.b((double)$$3) * $$1 * $$4;
                this.ao().a(this.p(), this.dP() + (double)$$5, this.dR(), this.dV() + (double)$$6, 0.0, 0.0, 0.0);
                ++$$2;
            }
            this.a(this.gP(), this.fC(), ((this.as.i() - this.as.i()) * 0.2f + 1.0f) / 0.8f);
            this.d = -0.5f;
        } else if (!this.aV() && this.cw) {
            this.d = 1.0f;
        }
        this.cw = this.aV();
        this.gM();
    }

    protected void gM() {
        this.d *= 0.6f;
    }

    protected int gL() {
        return this.as.a(20) + 10;
    }

    @Override
    public void j_() {
        double $$0 = this.dP();
        double $$1 = this.dR();
        double $$2 = this.dV();
        super.j_();
        this.a_($$0, $$1, $$2);
    }

    @Override
    public void a(alw<?> $$0) {
        if (cu.equals($$0)) {
            this.j_();
            this.v(this.bE);
            this.bC = this.bE;
            if (this.by() && this.as.a(20) == 0) {
                this.bI();
            }
        }
        super.a($$0);
    }

    public cgu<? extends dag> ay() {
        return super.ay();
    }

    @Override
    public void a(cgk.e $$0) {
        int $$1 = this.gR();
        if (!this.ao().B_() && $$1 > 1 && this.fa()) {
            float $$2 = this.a(this.aF()).a();
            float $$32 = $$2 / 2.0f;
            int $$4 = $$1 / 2;
            int $$5 = 2 + this.as.a(3);
            fum $$6 = this.cI();
            for (int $$7 = 0; $$7 < $$5; ++$$7) {
                float $$8 = ((float)($$7 % 2) - 0.5f) * $$32;
                float $$9 = ((float)($$7 / 2) - 0.5f) * $$32;
                this.a(this.ay(), new cge(cgf.b, false, false, $$6), cgt.k, (T $$3) -> {
                    $$3.a($$4, true);
                    $$3.b(this.dP() + (double)$$8, this.dR() + 0.5, this.dV() + (double)$$9, this.as.i() * 360.0f, 0.0f);
                });
            }
        }
        super.a($$0);
    }

    @Override
    public void h(cgk $$0) {
        super.h($$0);
        if ($$0 instanceof cwh && this.gN()) {
            this.i((chl)$$0);
        }
    }

    @Override
    public void a_(ddm $$0) {
        if (this.gN()) {
            this.i($$0);
        }
    }

    protected void i(chl $$0) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            cex $$2;
            axf $$1 = (axf)dwo2;
            if (this.cb() && this.h($$0) && this.G($$0) && $$0.a($$1, $$2 = this.en().b(this), this.gO())) {
                this.a(bda.Aw, 1.0f, (this.as.i() - this.as.i()) * 0.2f + 1.0f);
                dsq.a($$1, (cgk)$$0, $$2);
            }
        }
    }

    @Override
    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        return new ftm(0.0, (double)$$1.b() - 0.015625 * (double)this.gR() * (double)$$2, 0.0);
    }

    protected boolean gN() {
        return !this.gS() && this.dy();
    }

    protected float gO() {
        return (float)this.i(cis.d);
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.gS()) {
            return bda.By;
        }
        return bda.Ay;
    }

    @Override
    protected bcz fd() {
        if (this.gS()) {
            return bda.Bx;
        }
        return bda.Ax;
    }

    protected bcz gP() {
        if (this.gS()) {
            return bda.BA;
        }
        return bda.AA;
    }

    public static boolean c(cgu<dag> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        if ($$1.av() != ccz.a) {
            boolean $$7;
            if (cgt.a($$2)) {
                return dag.a($$0, $$1, $$2, $$3, $$4);
            }
            if ($$1.z($$3).a(bdo.an) && $$3.v() > 50 && $$3.v() < 70) {
                float $$5 = $$1.ad().a(ceg.M, $$3).floatValue();
                if ($$4.i() < $$5 && $$1.G($$3) <= $$4.a(8)) {
                    return dag.a($$0, $$1, $$2, $$3, $$4);
                }
            }
            if (!($$1 instanceof dxn)) {
                return false;
            }
            dvu $$6 = new dvu($$3);
            boolean bl2 = $$7 = evp.a($$6.h, $$6.i, ((dxn)$$1).J(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$7 && $$3.v() < 40) {
                return dag.a($$0, $$1, $$2, $$3, $$4);
            }
        }
        return false;
    }

    @Override
    protected float fC() {
        return 0.4f * (float)this.gR();
    }

    @Override
    public int ac() {
        return 0;
    }

    protected boolean gT() {
        return this.gR() > 0;
    }

    @Override
    public void u() {
        ftm $$0 = this.dN();
        this.m($$0.g, this.fF(), $$0.i);
        this.aF = true;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        int $$5 = $$4.a(3);
        if ($$5 < 2 && $$4.i() < 0.5f * $$1.d()) {
            ++$$5;
        }
        int $$6 = 1 << $$5;
        this.a($$6, true);
        return super.a($$0, $$1, $$2, $$3);
    }

    float k() {
        float $$0 = this.gS() ? 1.4f : 0.8f;
        return ((this.as.i() - this.as.i()) * 0.2f + 1.0f) * $$0;
    }

    protected bcz gQ() {
        return this.gS() ? bda.Bz : bda.Az;
    }

    @Override
    public cgn b(chx $$0) {
        return super.b($$0).a(this.gR());
    }

    static class d
    extends cnq {
        private float l;
        private int m;
        private final dag n;
        private boolean o;

        public d(dag $$0) {
            super($$0);
            this.n = $$0;
            this.l = 180.0f * $$0.ec() / (float)Math.PI;
        }

        public void a(float $$0, boolean $$1) {
            this.l = $$0;
            this.o = $$1;
        }

        public void a(double $$0) {
            this.h = $$0;
            this.k = cnq.a.b;
        }

        @Override
        public void a() {
            this.d.v(this.b(this.d.ec(), this.l, 90.0f));
            this.d.bE = this.d.ec();
            this.d.bC = this.d.ec();
            if (this.k != cnq.a.b) {
                this.d.I(0.0f);
                return;
            }
            this.k = cnq.a.a;
            if (this.d.aV()) {
                this.d.C((float)(this.h * this.d.i(cis.x)));
                if (this.m-- <= 0) {
                    this.m = this.n.gL();
                    if (this.o) {
                        this.m /= 3;
                    }
                    this.n.L().a();
                    if (this.n.gT()) {
                        this.n.a(this.n.gQ(), this.n.fC(), this.n.k());
                    }
                } else {
                    this.n.bN = 0.0f;
                    this.n.bP = 0.0f;
                    this.d.C(0.0f);
                }
            } else {
                this.d.C((float)(this.h * this.d.i(cis.x)));
            }
        }
    }

    static class b
    extends cop {
        private final dag a;

        public b(dag $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.c, cop.a.a));
            $$0.N().a(true);
        }

        @Override
        public boolean b() {
            return (this.a.by() || this.a.bN()) && this.a.K() instanceof d;
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            cnq cnq2;
            if (this.a.ep().i() < 0.8f) {
                this.a.L().a();
            }
            if ((cnq2 = this.a.K()) instanceof d) {
                d $$0 = (d)cnq2;
                $$0.a(1.2);
            }
        }
    }

    static class a
    extends cop {
        private final dag a;
        private int b;

        public a(dag $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.b));
        }

        @Override
        public boolean b() {
            chl $$0 = this.a.ag_();
            if ($$0 == null) {
                return false;
            }
            if (!this.a.c($$0)) {
                return false;
            }
            return this.a.K() instanceof d;
        }

        @Override
        public void d() {
            this.b = dag$a.b(300);
            super.d();
        }

        @Override
        public boolean c() {
            chl $$0 = this.a.ag_();
            if ($$0 == null) {
                return false;
            }
            if (!this.a.c($$0)) {
                return false;
            }
            return --this.b > 0;
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            cnq cnq2;
            chl $$0 = this.a.ag_();
            if ($$0 != null) {
                this.a.a((cgk)$$0, 10.0f, 10.0f);
            }
            if ((cnq2 = this.a.K()) instanceof d) {
                d $$1 = (d)cnq2;
                $$1.a(this.a.ec(), this.a.gN());
            }
        }
    }

    static class e
    extends cop {
        private final dag a;
        private float b;
        private int c;

        public e(dag $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.b));
        }

        @Override
        public boolean b() {
            return this.a.ag_() == null && (this.a.aV() || this.a.by() || this.a.bN() || this.a.d(cfo.y)) && this.a.K() instanceof d;
        }

        @Override
        public void a() {
            cnq cnq2;
            if (--this.c <= 0) {
                this.c = this.a(40 + this.a.ep().a(60));
                this.b = this.a.ep().a(360);
            }
            if ((cnq2 = this.a.K()) instanceof d) {
                d $$0 = (d)cnq2;
                $$0.a(this.b, false);
            }
        }
    }

    static class c
    extends cop {
        private final dag a;

        public c(dag $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.c, cop.a.a));
        }

        @Override
        public boolean b() {
            return !this.a.cq();
        }

        @Override
        public void a() {
            cnq cnq2 = this.a.K();
            if (cnq2 instanceof d) {
                d $$0 = (d)cnq2;
                $$0.a(1.0);
            }
        }
    }
}

