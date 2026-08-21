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
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dbj
extends dbi
implements czq,
dct {
    private static final alw<Boolean> cv = ama.a(dbj.class, aly.k);
    private static final alw<Boolean> cw = ama.a(dbj.class, aly.k);
    private static final alw<Boolean> cx = ama.a(dbj.class, aly.k);
    private static final amo cy = amo.b("baby");
    private static final ciq cz = new ciq(cy, 0.2f, ciq.a.b);
    private static final int cA = 16;
    private static final float cB = 0.35f;
    private static final int cC = 5;
    private static final float cD = 0.1f;
    private static final int cE = 3;
    private static final float cF = 0.2f;
    private static final cgn cG = cgu.aZ.n().a(0.5f).b(0.97f);
    private static final double cH = 0.5;
    private static final boolean cI = false;
    private static final boolean cJ = false;
    private final cdk cK = new cdk(8);
    private boolean cL = false;
    protected static final ImmutableList<cse<? extends csd<? super dbj>>> d = ImmutableList.of(cse.c, cse.d, cse.b, cse.f, cse.l);
    protected static final ImmutableList<cqw<?>> e = ImmutableList.of(cqw.o, cqw.w, cqw.g, cqw.h, cqw.k, cqw.l, cqw.az, cqw.ay, cqw.M, cqw.ba, cqw.y, cqw.z, (Object[])new cqw[]{cqw.n, cqw.F, cqw.p, cqw.q, cqw.r, cqw.u, cqw.am, cqw.an, cqw.A, cqw.ao, cqw.ap, cqw.ar, cqw.aq, cqw.at, cqw.au, cqw.as, cqw.aw, cqw.N, cqw.aC, cqw.t, cqw.aD, cqw.aE, cqw.av, cqw.ax, cqw.aF, cqw.aG, cqw.aH, cqw.ah, cqw.ai, cqw.aj, cqw.ak, cqw.al});

    public dbj(cgu<? extends dbi> $$0, dwo $$1) {
        super($$0, $$1);
        this.cn = 5;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("IsBaby", this.e_());
        $$0.a("CannotHunt", this.cL);
        this.a_($$0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a_($$0.a("IsBaby", false));
        this.z($$0.a("CannotHunt", false));
        this.a_($$0);
    }

    @Override
    @bht
    public cdk gP() {
        return this.cK;
    }

    @Override
    protected void a(axf $$0, cex $$12, boolean $$2) {
        super.a($$0, $$12, $$2);
        this.cK.g().forEach($$1 -> this.a($$0, (dlt)$$1));
    }

    protected dlt j(dlt $$0) {
        return this.cK.b($$0);
    }

    protected boolean k(dlt $$0) {
        return this.cK.c($$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, false);
        $$0.a(cw, false);
        $$0.a(cx, false);
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (cv.equals($$0)) {
            this.j_();
        }
    }

    public static cir.a gX() {
        return czz.gW().a(cis.u, 16.0).a(cis.x, 0.35f).a(cis.d, 5.0);
    }

    public static boolean b(cgu<dbj> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return !$$1.a_($$3.e()).a(dzs.lG);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        if ($$2 != cgt.d) {
            if ($$4.i() < 0.2f) {
                this.a_(true);
            } else if (this.gR()) {
                this.a(cgv.a, this.gZ());
            }
        }
        dbk.a(this, $$0.G_());
        this.a($$4, $$1);
        this.a($$0, $$4, $$1);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean i(double $$0) {
        return !this.gA();
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        if (this.gR()) {
            this.a(cgv.f, new dlt(dlx.ry), $$0);
            this.a(cgv.e, new dlt(dlx.rz), $$0);
            this.a(cgv.d, new dlt(dlx.rA), $$0);
            this.a(cgv.c, new dlt(dlx.rB), $$0);
        }
    }

    private void a(cgv $$0, dlt $$1, bgr $$2) {
        if ($$2.i() < 0.1f) {
            this.a($$0, $$1);
        }
    }

    protected cim.b<dbj> ew() {
        return cim.a(e, d);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return dbk.a(this, this.ew().a($$0));
    }

    public cim<dbj> ev() {
        return super.ev();
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        cdc $$2 = super.b($$0, $$1);
        if ($$2.a()) {
            return $$2;
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$3 = (axf)dwo2;
            return dbk.a($$3, this, $$0, $$1);
        }
        boolean $$4 = dbk.b(this, $$0.b($$1)) && this.gS() != dbl.d;
        return $$4 ? cdc.a : cdc.e;
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cG : super.b($$0);
    }

    @Override
    public void a_(boolean $$0) {
        this.aD().a(cv, $$0);
        if (!this.ao().B_()) {
            cio $$1 = this.h(cis.x);
            $$1.c(cz.a());
            if ($$0) {
                $$1.b(cz);
            }
        }
    }

    @Override
    public boolean e_() {
        return this.aD().a(cv);
    }

    private void z(boolean $$0) {
        this.cL = $$0;
    }

    @Override
    protected boolean k() {
        return !this.cL;
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("piglinBrain");
        this.ev().a($$0, this);
        $$1.c();
        dbk.a(this);
        super.a($$0);
    }

    @Override
    protected int f(axf $$0) {
        return this.cn;
    }

    @Override
    protected void h(axf $$0) {
        dbk.a($$0, this);
        this.cK.g().forEach($$1 -> this.a($$0, (dlt)$$1));
        super.h($$0);
    }

    private dlt gZ() {
        if ((double)this.as.i() < 0.5) {
            return new dlt(dlx.yz);
        }
        return new dlt(this.as.a(10) == 0 ? dlx.xM : dlx.qC);
    }

    @Override
    public @Nullable bef<dlp> aa() {
        if (this.e_()) {
            return null;
        }
        return bdy.cp;
    }

    private boolean ha() {
        return this.az.a(cw);
    }

    @Override
    public void b(boolean $$0) {
        this.az.a(cw, $$0);
    }

    @Override
    public void a() {
        this.bK = 0;
    }

    @Override
    public dbl gS() {
        if (this.gY()) {
            return dbl.e;
        }
        if (dbk.a(this.fy())) {
            return dbl.d;
        }
        if (this.gI() && this.gT()) {
            return dbl.a;
        }
        if (this.ha()) {
            return dbl.c;
        }
        if (this.b(dlx.yz) && dkm.g(this.eq())) {
            return dbl.b;
        }
        return dbl.f;
    }

    public boolean gY() {
        return this.az.a(cx);
    }

    public void y(boolean $$0) {
        this.az.a(cx, $$0);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk cgk2;
        boolean $$3 = super.a($$0, $$1, $$2);
        if ($$3 && (cgk2 = $$1.d()) instanceof chl) {
            chl $$4 = (chl)cgk2;
            dbk.a($$0, this, $$4);
        }
        return $$3;
    }

    @Override
    public void a(chl $$0, float $$1) {
        this.b(this, 1.6f);
    }

    @Override
    public boolean g(dlt $$0) {
        return $$0.h() == dlx.yz || $$0.c(ki.O);
    }

    protected void l(dlt $$0) {
        this.b(cgv.a, $$0);
    }

    protected void m(dlt $$0) {
        if ($$0.a(dbk.c)) {
            this.a(cgv.b, $$0);
            this.g(cgv.b);
        } else {
            this.b(cgv.b, $$0);
        }
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        return $$0.U().a(eua.F) != false && this.gn() && dbk.a(this, $$1);
    }

    protected boolean n(dlt $$0) {
        cgv $$1 = this.f($$0);
        dlt $$2 = this.a($$1);
        return this.a($$0, $$2, $$1);
    }

    @Override
    protected boolean a(dlt $$0, dlt $$1, cgv $$2) {
        boolean $$5;
        if (dsq.a($$1, dsp.F)) {
            return false;
        }
        bef<dlp> $$3 = this.aa();
        boolean $$4 = dbk.a($$0) || $$3 != null && $$0.a($$3);
        boolean bl2 = $$5 = dbk.a($$1) || $$3 != null && $$1.a($$3);
        if ($$4 && !$$5) {
            return true;
        }
        if (!$$4 && $$5) {
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        this.a($$1);
        dbk.a($$0, this, $$1);
    }

    @Override
    public boolean a(cgk $$0, boolean $$1, boolean $$2) {
        if (this.e_() && $$0.ay() == cgu.ao) {
            $$0 = this.c($$0, 3);
        }
        return super.a($$0, $$1, $$2);
    }

    private cgk c(cgk $$0, int $$1) {
        List<cgk> $$2 = $$0.dn();
        if ($$1 == 1 || $$2.isEmpty()) {
            return $$0;
        }
        return this.c($$2.getFirst(), $$1 - 1);
    }

    @Override
    protected @Nullable bcz W() {
        if (this.ao().B_()) {
            return null;
        }
        return dbk.b(this).orElse(null);
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.wx;
    }

    @Override
    protected bcz fd() {
        return bda.wv;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.wz, 0.15f, 1.0f);
    }

    @Override
    protected void gU() {
        this.b(bda.wA);
    }
}

