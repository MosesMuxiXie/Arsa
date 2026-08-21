/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class cty
extends cup {
    public static final float cv = 0.45f;
    public static final int cw = 55;
    public static final int cx = 30;
    private static final float cU = 0.1f;
    private static final float cV = 1.4285f;
    private static final float cW = 22.2222f;
    private static final int cX = 5;
    private static final int cY = 40;
    private static final int cZ = 52;
    private static final int da = 80;
    private static final float db = 1.43f;
    private static final long dc = 0L;
    public static final alw<Boolean> cz = ama.a(cty.class, aly.k);
    public static final alw<Long> cA = ama.a(cty.class, aly.c);
    public final cfz cB = new cfz();
    public final cfz cC = new cfz();
    public final cfz cD = new cfz();
    public final cfz cE = new cfz();
    public final cfz cF = new cfz();
    private static final cgn dd = cgn.b(cgu.v.l(), cgu.v.m() - 1.43f).b(0.845f);
    private int de = 0;
    private int df = 0;

    public cty(cgu<? extends cty> $$0, dwo $$1) {
        super((cgu<? extends cup>)$$0, $$1);
        this.cp = new c();
        this.co = new b();
        crd $$2 = (crd)this.N();
        $$2.a(true);
        $$2.c(true);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("LastPoseTick", this.az.a(cA));
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        long $$1 = $$0.a("LastPoseTick", 0L);
        if ($$1 < 0L) {
            this.c(chx.k);
        }
        this.a($$1);
    }

    public static cir.a p() {
        return cty.hx().a(cis.u, 32.0).a(cis.x, 0.09f).a(cis.q, 0.42f).a(cis.D, 1.5);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cz, false);
        $$0.a(cA, 0L);
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        ctz.a(this, $$0.G_());
        this.b($$0.a().au());
        return super.a($$0, $$1, $$2, $$3);
    }

    public static boolean c(cgu<cty> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cx) && cty.a($$1, $$3);
    }

    protected cim.b<cty> ew() {
        return ctz.a();
    }

    @Override
    protected void D() {
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return ctz.a(this.ew().a($$0));
    }

    @Override
    public cgn b(chx $$0) {
        return $$0 == chx.k ? dd.a(this.eE()) : super.b($$0);
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("camelBrain");
        cim<?> $$2 = this.ev();
        $$2.a($$0, this);
        $$1.c();
        $$1.a("camelActivityUpdate");
        ctz.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    public void g() {
        super.g();
        if (this.gQ() && this.de < 50 && (this.aV() || this.bB() || this.cq())) {
            this.x(false);
        }
        if (this.de > 0) {
            --this.de;
            if (this.de == 0) {
                this.ao().a(null, this.dK(), this.gS(), bdb.g, 1.0f, 1.0f);
            }
        }
        if (this.ao().B_()) {
            this.hI();
        }
        if (this.gP()) {
            this.af();
        }
        if (this.hd() && this.by()) {
            this.hk();
        }
    }

    private void hI() {
        if (this.df <= 0) {
            this.df = this.as.a(40) + 80;
            this.cE.a(this.at);
        } else {
            --this.df;
        }
        if (this.he()) {
            this.cD.a();
            this.cF.a();
            if (this.hJ()) {
                this.cB.b(this.at);
                this.cC.a();
            } else {
                this.cB.a();
                this.cC.b(this.at);
            }
        } else {
            this.cB.a();
            this.cC.a();
            this.cF.a(this.gQ(), this.at);
            this.cD.a(this.hf() && this.hl() >= 0L, this.at);
        }
    }

    @Override
    protected void B(float $$0) {
        float $$2;
        if (this.aF() == chx.a && !this.cF.b()) {
            float $$1 = Math.min($$0 * 6.0f, 1.0f);
        } else {
            $$2 = 0.0f;
        }
        this.bB.a($$2, 0.2f, this.e_() ? 3.0f : 1.0f);
    }

    @Override
    public void m(ftm $$0) {
        if (this.gP() && this.aV()) {
            this.k(this.dN().d(0.0, 1.0, 0.0));
            $$0 = $$0.d(0.0, 1.0, 0.0);
        }
        super.m($$0);
    }

    @Override
    protected void a(ddm $$0, ftm $$1) {
        super.a($$0, $$1);
        if ($$0.bP > 0.0f && this.hd() && !this.hf()) {
            this.hh();
        }
    }

    public boolean gP() {
        return this.hd() || this.hf();
    }

    @Override
    protected float f(ddm $$0) {
        float $$1 = $$0.cA() && this.c() == 0 ? 0.1f : 0.0f;
        return (float)this.i(cis.x) + $$1;
    }

    @Override
    protected ftl i(chl $$0) {
        if (this.gP()) {
            return new ftl(this.ee(), this.ec());
        }
        return super.i($$0);
    }

    @Override
    protected ftm b(ddm $$0, ftm $$1) {
        if (this.gP()) {
            return ftm.c;
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean a() {
        return !this.gP() && super.a();
    }

    @Override
    public void a(int $$0) {
        if (!this.al() || this.de > 0 || !this.aV()) {
            return;
        }
        super.a($$0);
    }

    @Override
    public boolean ef() {
        return true;
    }

    @Override
    protected void b(float $$0, ftm $$1) {
        double $$2 = this.fF();
        this.l(this.cj().d(1.0, 0.0, 1.0).d().c((double)(22.2222f * $$0) * this.i(cis.x) * (double)this.bi()).b(0.0, (double)(1.4285f * $$0) * $$2, 0.0));
        this.de = 55;
        this.x(true);
        this.aF = true;
    }

    public boolean gQ() {
        return this.az.a(cz);
    }

    public void x(boolean $$0) {
        this.az.a(cz, $$0);
    }

    @Override
    public void b(int $$0) {
        this.b(this.gR());
        this.c(etk.u);
        this.x(true);
    }

    protected bcz gR() {
        return bda.dZ;
    }

    protected bcz gS() {
        return bda.ea;
    }

    @Override
    public void b() {
    }

    @Override
    public int c() {
        return this.de;
    }

    @Override
    protected bcz W() {
        return bda.dY;
    }

    @Override
    protected bcz fd() {
        return bda.eb;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.ed;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        if ($$1.a(bdp.bC)) {
            this.a(bda.ei, 1.0f, 1.0f);
        } else {
            this.a(bda.eh, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aP);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$0.gA() && !this.e_()) {
            this.b($$0);
            return cdc.a;
        }
        cdc $$3 = $$2.a($$0, (chl)this, $$1);
        if ($$3.a()) {
            return $$3;
        }
        if (this.j($$2)) {
            return this.c($$0, $$2);
        }
        if (this.dn().size() < 2 && !this.e_()) {
            this.g($$0);
        }
        return cdc.c;
    }

    @Override
    public void v() {
        super.v();
        if (this.hd() && !this.hf() && this.gT()) {
            this.hh();
        }
    }

    @Override
    public ftm[] A() {
        return chj.a(this, 0.02, 0.48, 0.25, 0.82);
    }

    public boolean gT() {
        return this.g(this.hd() ? chx.a : chx.k);
    }

    @Override
    protected boolean a(ddm $$0, dlt $$1) {
        boolean $$4;
        boolean $$3;
        boolean $$2;
        if (!this.j($$1)) {
            return false;
        }
        boolean bl2 = $$2 = this.eZ() < this.fq();
        if ($$2) {
            this.d(2.0f);
        }
        boolean bl3 = $$3 = this.hn() && this.Z_() == 0 && this.gY();
        if ($$3) {
            this.h($$0);
        }
        if ($$4 = this.e_()) {
            this.ao().a(ly.R, this.e(1.0), this.dS() + 0.5, this.h(1.0), 0.0, 0.0, 0.0);
            if (!this.ao().B_()) {
                this.c_(10);
            }
        }
        if ($$2 || $$3 || $$4) {
            bcz $$5;
            if (!this.bq() && ($$5 = this.gV()) != null) {
                this.ao().a(null, this.dP(), this.dR(), this.dV(), $$5, this.dB(), 1.0f, 1.0f + (this.as.i() - this.as.i()) * 0.2f);
            }
            this.c(etk.m);
            return true;
        }
        return false;
    }

    @Override
    protected boolean gU() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(cth $$0) {
        if ($$0 == this) return false;
        if (!($$0 instanceof cty)) return false;
        cty $$1 = (cty)$$0;
        if (!this.hF()) return false;
        if (!$$1.hF()) return false;
        return true;
    }

    public @Nullable cty b(axf $$0, cfy $$1) {
        return cgu.v.a($$0, cgt.e);
    }

    @Override
    protected bcz gV() {
        return bda.ec;
    }

    @Override
    protected void c(axf $$0, cex $$1, float $$2) {
        this.hk();
        super.c($$0, $$1, $$2);
    }

    @Override
    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        int $$3 = Math.max(this.dn().indexOf($$0), 0);
        boolean $$4 = $$3 == 0;
        float $$5 = 0.5f;
        float $$6 = (float)(this.eh() ? (double)0.01f : this.a($$4, 0.0f, $$1, $$2));
        if (this.dn().size() > 1) {
            if (!$$4) {
                $$5 = -0.7f;
            }
            if ($$0 instanceof cth) {
                $$5 += 0.2f;
            }
        }
        return new ftm(0.0, $$6, $$5 * $$2).b(-this.ec() * ((float)Math.PI / 180));
    }

    @Override
    public float eE() {
        return this.e_() ? 0.45f : 1.0f;
    }

    private double a(boolean $$0, float $$1, cgn $$2, float $$3) {
        double $$4 = $$2.b() - 0.375f * $$3;
        float $$5 = $$3 * 1.43f;
        float $$6 = $$5 - $$3 * 0.2f;
        float $$7 = $$5 - $$6;
        boolean $$8 = this.hf();
        boolean $$9 = this.hd();
        if ($$8) {
            float $$14;
            int $$13;
            int $$10;
            int n2 = $$10 = $$9 ? 40 : 52;
            if ($$9) {
                int $$11 = 28;
                float $$12 = $$0 ? 0.5f : 0.1f;
            } else {
                $$13 = $$0 ? 24 : 32;
                $$14 = $$0 ? 0.6f : 0.35f;
            }
            float $$15 = bgj.a((float)this.hl() + $$1, 0.0f, (float)$$10);
            boolean $$16 = $$15 < (float)$$13;
            float $$17 = $$16 ? $$15 / (float)$$13 : ($$15 - (float)$$13) / (float)($$10 - $$13);
            float $$18 = $$5 - $$14 * $$6;
            $$4 += $$9 ? (double)bgj.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)bgj.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0f);
        }
        if ($$9 && !$$8) {
            $$4 += (double)$$7;
        }
        return $$4;
    }

    @Override
    public ftm a_(float $$0) {
        cgn $$1 = this.a(this.aF());
        float $$2 = this.eE();
        return new ftm(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2f * $$2), $$1.a() * 0.56f);
    }

    @Override
    public int ae() {
        return 30;
    }

    @Override
    protected boolean s(cgk $$0) {
        return this.dn().size() <= 2;
    }

    public boolean hd() {
        return this.az.a(cA) < 0L;
    }

    public boolean he() {
        return this.hl() < 0L != this.hd();
    }

    public boolean hf() {
        long $$0 = this.hl();
        return $$0 < (long)(this.hd() ? 40 : 52);
    }

    private boolean hJ() {
        return this.hd() && this.hl() < 40L && this.hl() >= 0L;
    }

    public void hg() {
        if (this.hd()) {
            return;
        }
        this.b(this.hj());
        this.c(chx.k);
        this.c(etk.u);
        this.a(-this.ao().au());
    }

    public void hh() {
        if (!this.hd()) {
            return;
        }
        this.b(this.hi());
        this.c(chx.a);
        this.c(etk.u);
        this.a(this.ao().au());
    }

    protected bcz hi() {
        return bda.eg;
    }

    protected bcz hj() {
        return bda.ef;
    }

    public void hk() {
        this.c(chx.a);
        this.c(etk.u);
        this.b(this.ao().au());
    }

    @VisibleForTesting
    public void a(long $$0) {
        this.az.a(cA, $$0);
    }

    private void b(long $$0) {
        this.a(Math.max(0L, $$0 - 52L - 1L));
    }

    public long hl() {
        return this.ao().au() - Math.abs(this.az.a(cA));
    }

    @Override
    protected jd<bcz> a(cgv $$0, dlt $$1, dun $$2) {
        if ($$0 == cgv.h) {
            return this.hm();
        }
        return super.a($$0, $$1, $$2);
    }

    protected jd.c<bcz> hm() {
        return bda.ee;
    }

    @Override
    public void a(alw<?> $$0) {
        if (!this.ay && cz.equals($$0)) {
            this.de = this.de == 0 ? 55 : this.de;
        }
        super.a($$0);
    }

    @Override
    public boolean hn() {
        return true;
    }

    @Override
    public void b(ddm $$0) {
        if (!this.ao().B_()) {
            $$0.a(this, (ccv)this.cM);
        }
    }

    @Override
    protected cnl I() {
        return new a(this);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    class c
    extends cnq {
        public c() {
            super(cty.this);
        }

        @Override
        public void a() {
            if (this.k == cnq.a.b && !cty.this.S_() && cty.this.hd() && !cty.this.hf() && cty.this.gT()) {
                cty.this.hh();
            }
            super.a();
        }
    }

    class b
    extends cnp {
        b() {
            super(cty.this);
        }

        @Override
        public void a() {
            if (!cty.this.dm()) {
                super.a();
            }
        }
    }

    class a
    extends cnl {
        public a(cty $$0) {
            super($$0);
        }

        @Override
        public void a() {
            if (!cty.this.gP()) {
                super.a();
            }
        }
    }
}

