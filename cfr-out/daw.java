/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class daw
extends cth
implements czu,
day {
    private static final alw<Boolean> cz = ama.a(daw.class, aly.k);
    private static final int cA = 40;
    private static final float cB = 0.3f;
    private static final int cC = 1;
    private static final float cD = 0.6f;
    private static final int cE = 6;
    private static final float cF = 0.5f;
    private static final boolean cG = false;
    private static final int cH = 0;
    private static final boolean cI = false;
    public static final int cv = 300;
    private int cJ;
    private int cK = 0;
    private boolean cL = false;
    protected static final ImmutableList<? extends cse<? extends csd<? super daw>>> cw = ImmutableList.of(cse.c, cse.d, cse.o, cse.n);
    protected static final ImmutableList<? extends cqw<?>> cx = ImmutableList.of(cqw.s, cqw.g, cqw.h, cqw.k, cqw.l, cqw.o, cqw.n, cqw.F, cqw.u, cqw.p, cqw.q, cqw.aB, (Object[])new cqw[]{cqw.A, cqw.aD, cqw.aE, cqw.aA, cqw.L, cqw.aH, cqw.aI, cqw.aa});

    public daw(cgu<? extends daw> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.cn = 5;
    }

    @VisibleForTesting
    public void s(int $$0) {
        this.cK = $$0;
    }

    @Override
    public boolean aj_() {
        return true;
    }

    public static cir.a p() {
        return czz.gW().a(cis.u, 40.0).a(cis.x, 0.3f).a(cis.r, 0.6f).a(cis.e, 1.0).a(cis.d, 6.0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean c(axf $$0, cgk $$1) {
        void $$3;
        if (!($$1 instanceof chl)) {
            return false;
        }
        chl $$2 = (chl)$$1;
        this.cJ = 10;
        this.ao().a((cgk)this, (byte)4);
        this.b(bda.oo);
        dax.a(this, (chl)$$3);
        return day.a($$0, this, (chl)$$3);
    }

    @Override
    protected void d(chl $$0) {
        if (this.gP()) {
            day.a(this, $$0);
        }
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk cgk2;
        boolean $$3 = super.a($$0, $$1, $$2);
        if ($$3 && (cgk2 = $$1.d()) instanceof chl) {
            chl $$4 = (chl)cgk2;
            dax.a($$0, this, $$4);
        }
        return $$3;
    }

    protected cim.b<daw> ew() {
        return cim.a(cx, cw);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return dax.a(this.ew().a($$0));
    }

    public cim<daw> ev() {
        return super.ev();
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("hoglinBrain");
        this.ev().a($$0, this);
        $$1.c();
        dax.a(this);
        if (this.gR()) {
            ++this.cK;
            if (this.cK > 300) {
                this.b(bda.op);
                this.gT();
            }
        } else {
            this.cK = 0;
        }
    }

    @Override
    public void d_() {
        if (this.cJ > 0) {
            --this.cJ;
        }
        super.d_();
    }

    @Override
    protected void h() {
        if (this.e_()) {
            this.cn = 3;
            this.h(cis.d).a(0.5);
        } else {
            this.cn = 5;
            this.h(cis.d).a(6.0);
        }
    }

    public static boolean c(cgu<daw> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return !$$1.a_($$3.e()).a(dzs.lG);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$0.G_().i() < 0.2f) {
            this.a_(true);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean i(double $$0) {
        return true;
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if (dax.a(this, $$0)) {
            return -1.0f;
        }
        if ($$1.a_($$0.e()).a(dzs.pu)) {
            return 10.0f;
        }
        return 0.0f;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        cdc $$2 = super.b($$0, $$1);
        if ($$2.a()) {
            this.gz();
        }
        return $$2;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.cJ = 10;
            this.b(bda.oo);
        } else {
            super.b($$0);
        }
    }

    @Override
    public int gQ() {
        return this.cJ;
    }

    @Override
    public boolean eI() {
        return true;
    }

    @Override
    protected int f(axf $$0) {
        return this.cn;
    }

    private void gT() {
        this.a(cgu.bV, cge.a(this, true, false), (T $$0) -> $$0.a(new cfm(cfo.i, 200, 0)));
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aU);
    }

    public boolean gP() {
        return !this.e_();
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cz, false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("IsImmuneToZombification", this.gU());
        $$0.a("TimeInOverworld", this.cK);
        $$0.a("CannotBeHunted", this.cL);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("IsImmuneToZombification", false));
        this.cK = $$0.a("TimeInOverworld", 0);
        this.y($$0.a("CannotBeHunted", false));
    }

    public void x(boolean $$0) {
        this.aD().a(cz, $$0);
    }

    private boolean gU() {
        return this.aD().a(cz);
    }

    public boolean gR() {
        return !this.gU() && !this.gG() && this.ao().c().a(ceg.J, this.dI()) != false;
    }

    private void y(boolean $$0) {
        this.cL = $$0;
    }

    public boolean gS() {
        return this.gP() && !this.cL;
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        daw $$2 = cgu.ao.a($$0, cgt.e);
        if ($$2 != null) {
            $$2.gz();
        }
        return $$2;
    }

    @Override
    public boolean gY() {
        return !dax.c(this) && super.gY();
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected bcz W() {
        if (this.ao().B_()) {
            return null;
        }
        return dax.b(this).orElse(null);
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.or;
    }

    @Override
    protected bcz fd() {
        return bda.oq;
    }

    @Override
    protected bcz bk() {
        return bda.oX;
    }

    @Override
    protected bcz bl() {
        return bda.oW;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.ot, 0.15f, 1.0f);
    }

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }
}

