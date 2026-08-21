/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class czc
extends czb {
    private static final alw<dlt> c = ama.a(czc.class, aly.h);
    private static final alw<Integer> d = ama.a(czc.class, aly.b);
    public static final int b = 8;
    private static final float e = 0.0625f;
    private static final float f = 0.75f;
    private static final float g = 0.75f;
    private static final byte h = 0;
    private static final float i = 1.0f;
    private static final boolean j = false;
    private static final boolean k = false;
    private float l = 1.0f;
    private boolean m = false;

    public czc(cgu<? extends czc> $$0, dwo $$1) {
        super((cgu<? extends czb>)$$0, $$1);
        this.l(false);
    }

    public czc(dwo $$0, is $$1, iz $$2) {
        this(cgu.ax, $$0, $$1, $$2);
    }

    public czc(cgu<? extends czc> $$0, dwo $$1, is $$2, iz $$3) {
        super((cgu<? extends czb>)$$0, $$1, $$2);
        this.b($$3);
        this.l(false);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, dlt.l);
        $$0.a(d, 0);
    }

    @Override
    protected void b(iz $$0) {
        Objects.requireNonNull($$0);
        super.a($$0);
        if ($$0.o().d()) {
            this.w(0.0f);
            this.v($$0.e() * 90);
        } else {
            this.w(-90 * $$0.f().a());
            this.v(0.0f);
        }
        this.ac = this.ee();
        this.ab = this.ec();
        this.e();
    }

    @Override
    protected final void e() {
        super.e();
        this.e(this.dP(), this.dR(), this.dV());
    }

    @Override
    protected fth a(is $$0, iz $$1) {
        return this.a($$0, $$1, this.x());
    }

    @Override
    protected fth u() {
        return this.a(this.a, this.dg(), false);
    }

    private fth a(is $$0, iz $$1, boolean $$2) {
        float $$3 = 0.46875f;
        ftm $$4 = ftm.b($$0).a($$1, -0.46875);
        float $$5 = $$2 ? 1.0f : 0.75f;
        float $$6 = $$2 ? 1.0f : 0.75f;
        iz.a $$7 = $$1.o();
        double $$8 = $$7 == iz.a.a ? 0.0625 : (double)$$5;
        double $$9 = $$7 == iz.a.b ? 0.0625 : (double)$$6;
        double $$10 = $$7 == iz.a.c ? 0.0625 : (double)$$5;
        return fth.a($$4, $$8, $$9, $$10);
    }

    @Override
    public boolean f() {
        if (this.m) {
            return true;
        }
        if (this.b(this.u())) {
            return false;
        }
        eoh $$0 = this.ao().a_(this.a.a(this.dg().g()));
        if (!($$0.e() || this.dg().o().d() && ebv.n($$0))) {
            return false;
        }
        return this.a(true);
    }

    @Override
    public void a(chp $$0, ftm $$1) {
        if (!this.m) {
            super.a($$0, $$1);
        }
    }

    @Override
    public void i(double $$0, double $$1, double $$2) {
        if (!this.m) {
            super.i($$0, $$1, $$2);
        }
    }

    @Override
    public void c(axf $$0) {
        this.d(this.w());
        super.c($$0);
    }

    private boolean a(cex $$0) {
        return !$$0.a(bdq.l) && !this.w().f();
    }

    private static boolean e(cex $$0) {
        return $$0.a(bdq.d) || $$0.h();
    }

    @Override
    public boolean b(cex $$0) {
        if (this.m && !czc.e($$0)) {
            return false;
        }
        return !this.d($$0);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.m) {
            return czc.e($$1) && super.a($$0, $$1, $$2);
        }
        if (this.d($$1)) {
            return false;
        }
        if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(etk.c, $$1.d());
            this.a(this.k(), 1.0f, 1.0f);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    public bcz k() {
        return bda.pD;
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = 16.0;
        return $$0 < ($$1 *= 64.0 * czc.dc()) * $$1;
    }

    @Override
    public void a(axf $$0, @Nullable cgk $$1) {
        this.a(this.m(), 1.0f, 1.0f);
        this.a($$0, $$1, true);
        this.a(etk.c, $$1);
    }

    public bcz m() {
        return bda.pB;
    }

    @Override
    public void v() {
        this.a(this.n(), 1.0f, 1.0f);
    }

    public bcz n() {
        return bda.pC;
    }

    private void a(axf $$0, @Nullable cgk $$1, boolean $$2) {
        ddm $$4;
        if (this.m) {
            return;
        }
        dlt $$3 = this.w();
        this.b(dlt.l);
        if (!$$0.U().a(eua.k).booleanValue()) {
            if ($$1 == null) {
                this.d($$3);
            }
            return;
        }
        if ($$1 instanceof ddm && ($$4 = (ddm)$$1).gv()) {
            this.d($$3);
            return;
        }
        if ($$2) {
            this.a($$0, this.r());
        }
        if (!$$3.f()) {
            $$3 = $$3.v();
            this.d($$3);
            if (this.as.i() < this.l) {
                this.a($$0, $$3);
            }
        }
    }

    private void d(dlt $$0) {
        fmw $$2;
        fmu $$1 = this.a($$0);
        if ($$1 != null && ($$2 = dmg.a($$1, this.ao())) != null) {
            $$2.a(this.a, this.aA());
        }
        $$0.a((cgk)null);
    }

    public dlt w() {
        return this.aD().a(c);
    }

    public @Nullable fmu a(dlt $$0) {
        return $$0.a(ki.T);
    }

    public boolean x() {
        return this.w().c(ki.T);
    }

    public void b(dlt $$0) {
        this.a($$0, true);
    }

    public void a(dlt $$0, boolean $$1) {
        if (!$$0.f()) {
            $$0 = $$0.c(1);
        }
        this.e($$0);
        this.aD().a(c, $$0);
        if (!$$0.f()) {
            this.a(this.p(), 1.0f, 1.0f);
        }
        if ($$1 && this.a != null) {
            this.ao().b(this.a, dzs.a);
        }
    }

    public bcz p() {
        return bda.pA;
    }

    @Override
    public @Nullable cic a_(int $$0) {
        if ($$0 == 0) {
            return cic.a(this::w, this::b);
        }
        return super.a_($$0);
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if ($$0.equals(c)) {
            this.e(this.w());
        }
    }

    private void e(dlt $$0) {
        if (!$$0.f() && $$0.I() != this) {
            $$0.a(this);
        }
        this.e();
    }

    public int y() {
        return this.aD().a(d);
    }

    public void a(int $$0) {
        this.a($$0, true);
    }

    private void a(int $$0, boolean $$1) {
        this.aD().a(d, $$0 % 8);
        if ($$1 && this.a != null) {
            this.ao().b(this.a, dzs.a);
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        dlt $$1 = this.w();
        if (!$$1.f()) {
            $$0.a("Item", dlt.b, $$1);
        }
        $$0.a("ItemRotation", (byte)this.y());
        $$0.a("ItemDropChance", this.l);
        $$0.a("Facing", iz.k, this.dg());
        $$0.a("Invisible", this.cG());
        $$0.a("Fixed", this.m);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        dlt $$1 = $$0.a("Item", dlt.b).orElse(dlt.l);
        dlt $$2 = this.w();
        if (!$$2.f() && !dlt.a($$1, $$2)) {
            this.d($$2);
        }
        this.a($$1, false);
        this.a($$0.a("ItemRotation", (byte)0), false);
        this.l = $$0.a("ItemDropChance", 1.0f);
        this.b($$0.a("Facing", iz.k).orElse(iz.a));
        this.l($$0.a("Invisible", false));
        this.m = $$0.a("Fixed", false);
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        boolean $$4;
        dlt $$2 = $$0.b($$1);
        boolean $$3 = !this.w().f();
        boolean bl2 = $$4 = !$$2.f();
        if (this.m) {
            return cdc.e;
        }
        if ($$0.ao().B_()) {
            return $$3 || $$4 ? cdc.a : cdc.e;
        }
        if (!$$3) {
            if ($$4 && !this.eh()) {
                fmw $$5 = dmg.b($$2, this.ao());
                if ($$5 != null && $$5.a(256)) {
                    return cdc.d;
                }
                this.b($$2);
                this.a(etk.c, (cgk)$$0);
                $$2.a(1, (chl)$$0);
                return cdc.a;
            }
            return cdc.e;
        }
        this.a(this.q(), 1.0f, 1.0f);
        this.a(this.y() + 1);
        this.a(etk.c, (cgk)$$0);
        return cdc.a;
    }

    public bcz q() {
        return bda.pE;
    }

    public int z() {
        if (this.w().f()) {
            return 0;
        }
        return this.y() % 8 + 1;
    }

    @Override
    public aay<adb> a(axd $$0) {
        return new adc((cgk)this, this.dg().d(), this.i());
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        this.b(iz.a($$0.n()));
    }

    @Override
    public dlt dZ() {
        dlt $$0 = this.w();
        if ($$0.f()) {
            return this.r();
        }
        return $$0.v();
    }

    protected dlt r() {
        return new dlt(dlx.wo);
    }

    @Override
    public float ed() {
        iz $$0 = this.dg();
        int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
        return bgj.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
    }
}

