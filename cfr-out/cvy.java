/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class cvy
extends cth {
    public static final cgn cv = cgn.b(0.9f, 1.3f).a(0.7f);
    private static final int cC = 2;
    private static final int cD = 1;
    protected static final ImmutableList<cse<? extends csd<? super cvy>>> cw = ImmutableList.of(cse.c, cse.d, cse.b, cse.o, cse.f, cse.r);
    protected static final ImmutableList<cqw<?>> cx = ImmutableList.of(cqw.o, cqw.h, cqw.n, cqw.F, cqw.u, cqw.aG, cqw.s, cqw.T, cqw.U, cqw.P, cqw.L, cqw.Q, (Object[])new cqw[]{cqw.S, cqw.W, cqw.X, cqw.aa});
    public static final int cz = 10;
    public static final double cA = 0.02;
    public static final double cB = (double)0.1f;
    private static final alw<Boolean> cE = ama.a(cvy.class, aly.k);
    private static final alw<Boolean> cF = ama.a(cvy.class, aly.k);
    private static final alw<Boolean> cG = ama.a(cvy.class, aly.k);
    private static final boolean cH = false;
    private static final boolean cI = true;
    private static final boolean cJ = true;
    private boolean cK;
    private int cL;

    public cvy(cgu<? extends cvy> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.N().a(true);
        this.a(fls.f, -1.0f);
        this.a(fls.g, -1.0f);
    }

    public dlt p() {
        bgr $$02 = bgr.a(this.cY().hashCode());
        bef<dlm> $$1 = this.hd() ? bdx.b : bdx.a;
        return this.ao().J_().f(mj.bi).a($$1, $$02).map($$0 -> dln.a(dlx.yM, $$0)).orElseGet(() -> new dlt(dlx.yM));
    }

    protected cim.b<cvy> ew() {
        return cim.a(cx, cw);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cvz.a(this.ew().a($$0));
    }

    public static cir.a gP() {
        return cth.gW().a(cis.u, 10.0).a(cis.x, 0.2f).a(cis.d, 2.0);
    }

    @Override
    protected void h() {
        if (this.e_()) {
            this.h(cis.d).a(1.0);
            this.gV();
        } else {
            this.h(cis.d).a(2.0);
            this.gU();
        }
    }

    @Override
    protected int a(double $$0, float $$1) {
        return super.a($$0, $$1) - 10;
    }

    @Override
    protected bcz W() {
        if (this.hd()) {
            return bda.mL;
        }
        return bda.mC;
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.hd()) {
            return bda.mO;
        }
        return bda.mF;
    }

    @Override
    protected bcz fd() {
        if (this.hd()) {
            return bda.mM;
        }
        return bda.mD;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.mT, 0.15f, 1.0f);
    }

    protected bcz gQ() {
        if (this.hd()) {
            return bda.mQ;
        }
        return bda.mH;
    }

    public @Nullable cvy b(axf $$0, cfy $$1) {
        cvy $$2 = cgu.am.a($$0, cgt.e);
        if ($$2 != null) {
            cfy $$4;
            cvz.a($$2, $$0.G_());
            cfy $$3 = $$0.G_().h() ? this : $$1;
            boolean $$5 = $$3 instanceof cvy && ((cvy)($$4 = $$3)).hd() || $$0.G_().j() < 0.02;
            $$2.x($$5);
        }
        return $$2;
    }

    public cim<cvy> ev() {
        return super.ev();
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("goatBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("goatActivityUpdate");
        cvz.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    public int ae() {
        return 15;
    }

    @Override
    public void r(float $$0) {
        int $$1 = this.ae();
        float $$2 = bgj.d(this.bC, $$0);
        float $$3 = bgj.a($$2, (float)(-$$1), (float)$$1);
        super.r(this.bC + $$3);
    }

    @Override
    protected void gX() {
        this.ao().a(null, this, this.hd() ? bda.mN : bda.mE, bdb.g, 1.0f, bgj.b(this.ao().y, 0.8f, 1.2f));
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aF);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.sk) && !this.e_()) {
            $$0.a(this.gQ(), 1.0f, 1.0f);
            dlt $$3 = dlw.a($$2, $$0, dlx.sq.m());
            $$0.a($$1, $$3);
            return cdc.a;
        }
        cdc $$4 = super.b($$0, $$1);
        if ($$4.a() && this.j($$2)) {
            this.gX();
        }
        return $$4;
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        cvz.a(this, $$4);
        this.x($$4.j() < 0.02);
        this.h();
        if (!this.e_() && (double)$$4.i() < (double)0.1f) {
            alw<Boolean> $$5 = $$4.h() ? cF : cG;
            this.az.a($$5, false);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public cgn b(chx $$0) {
        return $$0 == chx.g ? cv.a(this.eE()) : super.b($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("IsScreamingGoat", this.hd());
        $$0.a("HasLeftHorn", this.gR());
        $$0.a("HasRightHorn", this.gS());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("IsScreamingGoat", false));
        this.az.a(cF, $$0.a("HasLeftHorn", true));
        this.az.a(cG, $$0.a("HasRightHorn", true));
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 58) {
            this.cK = true;
        } else if ($$0 == 59) {
            this.cK = false;
        } else {
            super.b($$0);
        }
    }

    @Override
    public void d_() {
        this.cL = this.cK ? ++this.cL : (this.cL -= 2);
        this.cL = bgj.a(this.cL, 0, 20);
        super.d_();
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cE, false);
        $$0.a(cF, true);
        $$0.a(cG, true);
    }

    public boolean gR() {
        return this.az.a(cF);
    }

    public boolean gS() {
        return this.az.a(cG);
    }

    public boolean gT() {
        alw<Boolean> $$4;
        boolean $$0 = this.gR();
        boolean $$1 = this.gS();
        if (!$$0 && !$$1) {
            return false;
        }
        if (!$$0) {
            alw<Boolean> $$2 = cG;
        } else if (!$$1) {
            alw<Boolean> $$3 = cF;
        } else {
            $$4 = this.as.h() ? cF : cG;
        }
        this.az.a($$4, false);
        ftm $$5 = this.dI();
        dlt $$6 = this.p();
        double $$7 = bgj.b(this.as, -0.2f, 0.2f);
        double $$8 = bgj.b(this.as, 0.3f, 0.7f);
        double $$9 = bgj.b(this.as, -0.2f, 0.2f);
        czl $$10 = new czl(this.ao(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
        this.ao().b($$10);
        return true;
    }

    public void gU() {
        this.az.a(cF, true);
        this.az.a(cG, true);
    }

    public void gV() {
        this.az.a(cF, false);
        this.az.a(cG, false);
    }

    public boolean hd() {
        return this.az.a(cE);
    }

    public void x(boolean $$0) {
        this.az.a(cE, $$0);
    }

    public float he() {
        return (float)this.cL / 20.0f * 30.0f * ((float)Math.PI / 180);
    }

    public static boolean c(cgu<? extends cth> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.co) && cvy.a($$1, $$3);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }
}

