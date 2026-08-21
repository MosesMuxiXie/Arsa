/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class cwk
extends cth {
    public static final float cv = 0.2375f;
    public static final int cw = 16;
    public static final int cx = 32;
    public static final int cz = 64;
    public static final int cA = 16;
    public static final int cB = 20;
    public static final int cC = 600;
    public static final int cD = 4;
    private static final int cF = 60;
    private static final int cG = 10;
    public static final float cE = 2.0f;
    private int cH = 0;
    private int cI;
    private static final alw<Boolean> cJ = ama.a(cwk.class, aly.k);
    private static final alw<Boolean> cK = ama.a(cwk.class, aly.k);
    private static final float cL = 1.0f;

    public cwk(cgu<? extends cwk> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.cp = new czv.b(this, true, this::gR);
        this.co = new d();
    }

    private void s(int $$0) {
        dwo dwo2;
        if (this.cI <= 0 && $$0 > 0 && (dwo2 = this.ao()) instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.e(this.dP(), this.dR(), this.dV());
            $$1.p().a.a(this, aej.a(this));
        }
        this.cI = $$0;
        this.he();
    }

    private cre c(dwo $$0) {
        return new a(this, $$0);
    }

    @Override
    protected void D() {
        this.cs.a(3, new c());
        this.cs.a(4, new cpy.a((chn)this, 1.0, $$0 -> this.am() || this.e_() ? $$0.a(bdy.aN) : $$0.a(bdy.aO), false, 7.0));
        this.cs.a(5, new czv.d(this, 16));
    }

    private void gS() {
        this.cp = new czv.b(this, true, this::gR);
        this.co = new d();
        this.cr = this.b(this.ao());
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$02 = (axf)dwo2;
            this.d((cop $$0) -> true);
            this.D();
            this.ca.b($$02, this);
            this.ca.a();
        }
    }

    private void gT() {
        this.cp = new cnn(this, 180, true);
        this.co = new cnp(this);
        this.cr = this.c(this.ao());
        this.s(0);
        this.d((cop $$0) -> true);
    }

    @Override
    protected void h() {
        if (this.e_()) {
            this.gT();
        } else {
            this.gS();
        }
        super.h();
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 20.0).a(cis.G, 16.0).a(cis.n, 0.05).a(cis.x, 0.05).a(cis.o, 16.0).a(cis.j, 8.0);
    }

    @Override
    protected float c(float $$0) {
        return Math.min($$0, 1.0f);
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
    }

    @Override
    public boolean fl() {
        return false;
    }

    @Override
    public void m(ftm $$0) {
        float $$1 = (float)this.i(cis.n) * 5.0f / 3.0f;
        this.a($$0, $$1, $$1, $$1);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if (!$$1.A($$0)) {
            return 0.0f;
        }
        if ($$1.A($$0.e()) && !$$1.A($$0.c(2))) {
            return 10.0f;
        }
        return 5.0f;
    }

    @Override
    public boolean ey() {
        if (this.e_()) {
            return true;
        }
        return super.ey();
    }

    @Override
    protected boolean gN() {
        return false;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
    }

    @Override
    public float fD() {
        return 1.0f;
    }

    @Override
    public bdb dB() {
        return bdb.g;
    }

    @Override
    public int S() {
        int $$0 = super.S();
        if (this.cr()) {
            return $$0 * 6;
        }
        return $$0;
    }

    @Override
    protected bcz W() {
        return this.e_() ? bda.me : bda.ny;
    }

    @Override
    protected bcz h(cex $$0) {
        return this.e_() ? bda.mg : bda.nA;
    }

    @Override
    protected bcz fd() {
        return this.e_() ? bda.mf : bda.nz;
    }

    @Override
    protected float fC() {
        return this.e_() ? 1.0f : 4.0f;
    }

    @Override
    public int aj() {
        return 1;
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return cgu.ai.a($$0, cgt.e);
    }

    @Override
    public boolean gY() {
        return false;
    }

    @Override
    public float eE() {
        return this.e_() ? 0.2375f : 1.0f;
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aN);
    }

    @Override
    public boolean e(cgv $$0) {
        if ($$0 == cgv.g) {
            return this.cb() && !this.e_();
        }
        return super.e($$0);
    }

    @Override
    protected boolean f(cgv $$0) {
        return $$0 == cgv.g;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        cdc $$3;
        if (this.e_()) {
            return super.b($$0, $$1);
        }
        dlt $$2 = $$0.b($$1);
        if (!$$2.f() && ($$3 = $$2.a($$0, (chl)this, $$1)).a()) {
            return $$3;
        }
        if (this.am() && !$$0.gA()) {
            this.g($$0);
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    private void g(ddm $$0) {
        if (!this.ao().B_()) {
            $$0.o(this);
        }
    }

    @Override
    protected void q(cgk $$0) {
        if (!this.cr()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.ok, this.dB(), 1.0f, 1.0f);
        }
        super.q($$0);
        if (!this.ao().B_()) {
            if (!this.hf()) {
                this.s(0);
            } else if (this.cI > 10) {
                this.s(10);
            }
        }
    }

    @Override
    protected void r(cgk $$0) {
        super.r($$0);
        if (!this.ao().B_()) {
            this.s(10);
        }
        if (!this.cr()) {
            this.gE();
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.oj, this.dB(), 1.0f, 1.0f);
        }
    }

    @Override
    protected boolean s(cgk $$0) {
        return this.dn().size() < 4;
    }

    @Override
    public @Nullable chl dl() {
        cgk $$0 = this.do();
        if (this.am() && !this.gR() && $$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            return $$1;
        }
        return super.dl();
    }

    @Override
    protected ftm b(ddm $$0, ftm $$1) {
        float $$2 = $$0.bN;
        float $$3 = 0.0f;
        float $$4 = 0.0f;
        if ($$0.bP != 0.0f) {
            float $$5 = bgj.b((double)($$0.ee() * ((float)Math.PI / 180)));
            float $$6 = -bgj.a((double)($$0.ee() * ((float)Math.PI / 180)));
            if ($$0.bP < 0.0f) {
                $$5 *= -0.5f;
                $$6 *= -0.5f;
            }
            $$4 = $$6;
            $$3 = $$5;
        }
        if ($$0.fS()) {
            $$4 += 0.5f;
        }
        return new ftm($$2, $$4, $$3).c((double)3.9f * this.i(cis.n));
    }

    protected ftl i(chl $$0) {
        return new ftl($$0.ee() * 0.5f, $$0.ec());
    }

    @Override
    protected void a(ddm $$0, ftm $$1) {
        super.a($$0, $$1);
        ftl $$2 = this.i($$0);
        float $$3 = this.ec();
        float $$4 = bgj.f($$2.k - $$3);
        float $$5 = 0.08f;
        this.a($$3 += $$4 * 0.08f, $$2.j);
        this.bC = this.bE = $$3;
        this.ab = this.bE;
    }

    protected cim.b<cwk> ew() {
        return cwl.a();
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cwl.a(this.ew().a($$0));
    }

    @Override
    protected void a(axf $$0) {
        if (this.e_()) {
            bzm $$1 = bzl.a();
            $$1.a("happyGhastBrain");
            this.ca.a($$0, this);
            $$1.c();
            $$1.a("happyGhastActivityUpdate");
            cwl.a(this);
            $$1.c();
        }
        this.gV();
        super.a($$0);
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            return;
        }
        if (this.cH > 0) {
            --this.cH;
        }
        this.x(this.cH > 0);
        if (this.cI > 0) {
            if (this.at > 60) {
                --this.cI;
            }
            this.s(this.cI);
        }
        if (this.hf()) {
            this.s(10);
        }
    }

    @Override
    public void d_() {
        if (!this.ao().B_()) {
            this.c(this.gR());
        }
        super.d_();
        this.hd();
    }

    private int gU() {
        if (!this.e_() && this.a(cgv.g).f()) {
            return 64;
        }
        return 32;
    }

    private void gV() {
        if (this.S_() || this.cr()) {
            return;
        }
        int $$0 = this.gU();
        if (this.gF() && this.gC().a(this.dK(), (double)($$0 + 16)) && $$0 == this.gD()) {
            return;
        }
        this.a(this.dK(), $$0);
    }

    /*
     * WARNING - void declaration
     */
    private void hd() {
        void $$1;
        block5: {
            block4: {
                dwo dwo2 = this.ao();
                if (!(dwo2 instanceof axf)) break block4;
                axf $$0 = (axf)dwo2;
                if (this.cb() && this.bw == 0 && this.fq() != this.eZ()) break block5;
            }
            return;
        }
        boolean $$2 = this.bE() || $$1.w(this.dK()) != dxo.c.a;
        if (this.at % ($$2 ? 20 : 600) == 0) {
            this.d(1.0f);
        }
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cJ, false);
        $$0.a(cK, false);
    }

    private void x(boolean $$0) {
        this.az.a(cJ, $$0);
    }

    public boolean gP() {
        return this.az.a(cJ);
    }

    private void he() {
        this.az.a(cK, this.cI > 0);
    }

    public boolean gQ() {
        return this.az.a(cK);
    }

    @Override
    public boolean dY() {
        return true;
    }

    @Override
    public ftm[] dX() {
        return chj.a(this, -0.03125, 0.4375, 0.46875, 0.03125);
    }

    @Override
    public ftm B() {
        return ftm.c;
    }

    @Override
    public double x() {
        return 10.0;
    }

    @Override
    public double w() {
        return 16.0;
    }

    @Override
    public void v() {
        super.v();
        this.K().g();
    }

    @Override
    public void a(chj $$0) {
        if ($$0.z()) {
            this.cH = 5;
        }
    }

    @Override
    public void a(fns $$0) {
        super.a($$0);
        $$0.a("still_timeout", this.cI);
    }

    @Override
    public void a(fnq $$0) {
        super.a($$0);
        this.s($$0.a("still_timeout", 0));
    }

    public boolean gR() {
        return this.gQ() || this.cI > 0;
    }

    private boolean hf() {
        fth $$0 = this.dj();
        fth $$1 = new fth($$0.a - 1.0, $$0.e - (double)1.0E-5f, $$0.c - 1.0, $$0.d + 1.0, $$0.e + $$0.c() / 2.0, $$0.f + 1.0);
        for (ddm ddm2 : this.ao().E()) {
            cgk $$3;
            if (ddm2.au() || ($$3 = ddm2.du()) instanceof cwk || !$$1.d($$3.dI())) continue;
            return true;
        }
        return false;
    }

    @Override
    protected cnl I() {
        return new b();
    }

    @Override
    public boolean j(@Nullable cgk $$0) {
        if (this.e_() || !this.cb()) {
            return false;
        }
        if (this.ao().B_() && $$0 instanceof ddm && $$0.dI().h >= this.dj().e) {
            return true;
        }
        if (this.cr() && $$0 instanceof cwk) {
            return true;
        }
        return this.gR();
    }

    @Override
    public boolean em() {
        return !this.e_();
    }

    @Override
    public ftm b(chl $$0) {
        return new ftm(this.dP(), this.dj().e, this.dV());
    }

    class d
    extends cnp {
        d() {
            super(cwk.this);
        }

        @Override
        public void a() {
            if (cwk.this.gR()) {
                float $$0 = cwk$d.a(cwk.this.ec());
                cwk.this.v(cwk.this.ec() - $$0);
                cwk.this.r(cwk.this.ec());
                return;
            }
            if (this.d > 0) {
                --this.d;
                double $$1 = this.e - cwk.this.dP();
                double $$2 = this.g - cwk.this.dV();
                cwk.this.v(-((float)bgj.d($$1, $$2)) * 57.295776f);
                cwk.this.bE = cwk.this.bC = cwk.this.ec();
                return;
            }
            czv.a(this.a);
        }

        public static float a(float $$0) {
            float $$1 = $$0 % 90.0f;
            if ($$1 >= 45.0f) {
                $$1 -= 90.0f;
            }
            if ($$1 < -45.0f) {
                $$1 += 90.0f;
            }
            return $$1;
        }
    }

    static class a
    extends crc {
        public a(cwk $$0, dwo $$1) {
            super($$0, $$1);
            this.e(false);
            this.a(true);
            this.a(48.0f);
        }

        @Override
        protected boolean a(ftm $$0, ftm $$1) {
            return cwk$a.a(this.a, $$0, $$1, false);
        }
    }

    class c
    extends coh {
        public c() {
            super(cwk.this);
        }

        @Override
        public boolean b() {
            return !cwk.this.gR() && super.b();
        }
    }

    class b
    extends cnl {
        public b() {
            super(cwk.this);
        }

        @Override
        public void a() {
            if (cwk.this.cr()) {
                cwk.this.bC = cwk.this.bE = cwk.this.ec();
            }
            super.a();
        }
    }
}

