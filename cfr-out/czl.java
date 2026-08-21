/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class czl
extends cgk
implements cik {
    private static final alw<dlt> c = ama.a(czl.class, aly.h);
    private static final float d = 0.1f;
    public static final float a = 0.2125f;
    private static final int e = 6000;
    private static final int f = Short.MAX_VALUE;
    private static final int g = Short.MIN_VALUE;
    private static final int h = 5;
    private static final short i = 0;
    private static final short j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 5;
    private @Nullable cgr<cgk> n;
    private @Nullable UUID o;
    public final float b = this.as.i() * (float)Math.PI * 2.0f;

    public czl(cgu<? extends czl> $$0, dwo $$1) {
        super($$0, $$1);
        this.v(this.as.i() * 360.0f);
    }

    public czl(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        this($$0, $$1, $$2, $$3, $$4, $$0.y.j() * 0.2 - 0.1, 0.2, $$0.y.j() * 0.2 - 0.1);
    }

    public czl(dwo $$0, double $$1, double $$2, double $$3, dlt $$4, double $$5, double $$6, double $$7) {
        this((cgu<? extends czl>)cgu.av, $$0);
        this.a_($$1, $$2, $$3);
        this.m($$5, $$6, $$7);
        this.a($$4);
    }

    @Override
    public boolean bw() {
        return this.e().a(bdy.V);
    }

    @Override
    public @Nullable cgk p() {
        return cgr.a(this.n, this.ao());
    }

    @Override
    public void y(cgk $$0) {
        super.y($$0);
        if ($$0 instanceof czl) {
            czl $$1 = (czl)$$0;
            this.n = $$1.n;
        }
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(c, dlt.l);
    }

    @Override
    protected double bs() {
        return 0.04;
    }

    @Override
    public void g() {
        double $$5;
        int $$4;
        if (this.e().f()) {
            this.aC();
            return;
        }
        super.g();
        if (this.l > 0 && this.l != Short.MAX_VALUE) {
            --this.l;
        }
        this.Y = this.dP();
        this.Z = this.dR();
        this.aa = this.dV();
        ftm $$0 = this.dN();
        if (this.by() && this.b(bdv.a) > (double)0.1f) {
            this.u();
        } else if (this.bN() && this.b(bdv.b) > (double)0.1f) {
            this.v();
        } else {
            this.bu();
        }
        if (this.ao().B_()) {
            this.ar = false;
        } else {
            boolean bl2 = this.ar = !this.ao().a((cgk)this, this.dj().h(1.0E-7));
            if (this.ar) {
                this.k(this.dP(), (this.dj().b + this.dj().e) / 2.0, this.dV());
            }
        }
        if (!this.aV() || this.dN().j() > (double)1.0E-5f || (this.at + this.aA()) % 4 == 0) {
            this.a(chp.a, this.dN());
            this.aW();
            float $$1 = 0.98f;
            if (this.aV()) {
                $$1 = this.ao().a_(this.bf()).b().g() * 0.98f;
            }
            this.k(this.dN().d($$1, 0.98, $$1));
            if (this.aV()) {
                ftm $$2 = this.dN();
                if ($$2.h < 0.0) {
                    this.k($$2.d(1.0, -0.5, 1.0));
                }
            }
        }
        boolean $$3 = bgj.c(this.Y) != bgj.c(this.dP()) || bgj.c(this.Z) != bgj.c(this.dR()) || bgj.c(this.aa) != bgj.c(this.dV());
        int n2 = $$4 = $$3 ? 2 : 40;
        if (this.at % $$4 == 0 && !this.ao().B_() && this.x()) {
            this.w();
        }
        if (this.k != Short.MIN_VALUE) {
            ++this.k;
        }
        this.aF |= this.bG();
        if (!this.ao().B_() && ($$5 = this.dN().d($$0).h()) > 0.01) {
            this.aF = true;
        }
        if (!this.ao().B_() && this.k >= 6000) {
            this.aC();
        }
    }

    @Override
    public is bf() {
        return this.f(0.999999f);
    }

    private void u() {
        this.i((double)0.99f);
    }

    private void v() {
        this.i((double)0.95f);
    }

    private void i(double $$0) {
        ftm $$1 = this.dN();
        this.m($$1.g * $$0, $$1.h + (double)($$1.h < (double)0.06f ? 5.0E-4f : 0.0f), $$1.i * $$0);
    }

    private void w() {
        if (!this.x()) {
            return;
        }
        List<czl> $$02 = this.ao().a(czl.class, this.dj().c(0.5, 0.0, 0.5), (? super T $$0) -> $$0 != this && $$0.x());
        for (czl $$1 : $$02) {
            if (!$$1.x()) continue;
            this.a($$1);
            if (!this.eh()) continue;
            break;
        }
    }

    private boolean x() {
        dlt $$0 = this.e();
        return this.cb() && this.l != Short.MAX_VALUE && this.k != Short.MIN_VALUE && this.k < 6000 && $$0.N() < $$0.k();
    }

    private void a(czl $$0) {
        dlt $$1 = this.e();
        dlt $$2 = $$0.e();
        if (!Objects.equals(this.o, $$0.o) || !czl.a($$1, $$2)) {
            return;
        }
        if ($$2.N() < $$1.N()) {
            czl.a(this, $$1, $$0, $$2);
        } else {
            czl.a($$0, $$2, this, $$1);
        }
    }

    public static boolean a(dlt $$0, dlt $$1) {
        if ($$1.N() + $$0.N() > $$1.k()) {
            return false;
        }
        return dlt.c($$0, $$1);
    }

    public static dlt a(dlt $$0, dlt $$1, int $$2) {
        int $$3 = Math.min(Math.min($$0.k(), $$2) - $$0.N(), $$1.N());
        dlt $$4 = $$0.c($$0.N() + $$3);
        $$1.h($$3);
        return $$4;
    }

    private static void a(czl $$0, dlt $$1, dlt $$2) {
        dlt $$3 = czl.a($$1, $$2, 64);
        $$0.a($$3);
    }

    private static void a(czl $$0, dlt $$1, czl $$2, dlt $$3) {
        czl.a($$0, $$1, $$3);
        $$0.l = Math.max($$0.l, $$2.l);
        $$0.k = Math.min($$0.k, $$2.k);
        if ($$3.f()) {
            $$2.aC();
        }
    }

    @Override
    public boolean bx() {
        return !this.e().a(this.en().a()) || super.bx();
    }

    @Override
    protected boolean aR() {
        if (this.m <= 0) {
            return true;
        }
        return this.at % 10 == 0;
    }

    @Override
    public final boolean b(cex $$0) {
        if (this.d($$0)) {
            return false;
        }
        return this.e().a($$0);
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        if (this.d($$1)) {
            return false;
        }
        if (!$$0.U().a(eua.F).booleanValue() && $$1.d() instanceof chn) {
            return false;
        }
        if (!this.e().a($$1)) {
            return false;
        }
        this.bT();
        this.m = (int)((float)this.m - $$2);
        this.a(etk.o, $$1.d());
        if (this.m <= 0) {
            this.e().a(this);
            this.aC();
        }
        return true;
    }

    @Override
    public boolean a(dwi $$0) {
        if ($$0.h()) {
            return super.a($$0);
        }
        return true;
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("Health", (short)this.m);
        $$0.a("Age", (short)this.k);
        $$0.a("PickupDelay", (short)this.l);
        cgr.a(this.n, $$0, "Thrower");
        $$0.b("Owner", jx.a, this.o);
        if (!this.e().f()) {
            $$0.a("Item", dlt.b, this.e());
        }
    }

    @Override
    protected void a(fnq $$0) {
        this.m = $$0.a("Health", (short)5);
        this.k = $$0.a("Age", (short)0);
        this.l = $$0.a("PickupDelay", (short)0);
        this.o = $$0.a("Owner", jx.a).orElse(null);
        this.n = cgr.a($$0, "Thrower");
        this.a($$0.a("Item", dlt.b).orElse(dlt.l));
        if (this.e().f()) {
            this.aC();
        }
    }

    @Override
    public void a_(ddm $$0) {
        if (this.ao().B_()) {
            return;
        }
        dlt $$1 = this.e();
        dlp $$2 = $$1.h();
        int $$3 = $$1.N();
        if (this.l == 0 && (this.o == null || this.o.equals($$0.cY())) && $$0.gK().g($$1)) {
            $$0.a((cgk)this, $$3);
            if ($$1.f()) {
                this.aC();
                $$1.e($$3);
            }
            $$0.a(bdk.e.b($$2), $$3);
            $$0.a(this);
        }
    }

    @Override
    public yh ap() {
        yh $$0 = this.as();
        if ($$0 != null) {
            return $$0;
        }
        return this.e().A();
    }

    @Override
    public boolean cT() {
        return false;
    }

    @Override
    public @Nullable cgk b(fmb $$0) {
        cgk $$1 = super.b($$0);
        if (!this.ao().B_() && $$1 instanceof czl) {
            czl $$2 = (czl)$$1;
            $$2.w();
        }
        return $$1;
    }

    public dlt e() {
        return this.aD().a(c);
    }

    public void a(dlt $$0) {
        this.aD().a(c, $$0);
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (c.equals($$0)) {
            this.e().a((cgk)this);
        }
    }

    public void b(@Nullable UUID $$0) {
        this.o = $$0;
    }

    public void b(cgk $$0) {
        this.n = cgr.a($$0);
    }

    public int f() {
        return this.k;
    }

    public void i() {
        this.l = 10;
    }

    public void k() {
        this.l = 0;
    }

    public void m() {
        this.l = Short.MAX_VALUE;
    }

    public void a(int $$0) {
        this.l = $$0;
    }

    public boolean n() {
        return this.l > 0;
    }

    public void q() {
        this.k = Short.MIN_VALUE;
    }

    public void r() {
        this.k = -6000;
    }

    public void s() {
        this.m();
        this.k = 5999;
    }

    public static float f(float $$0, float $$1) {
        return $$0 / 20.0f + $$1;
    }

    @Override
    public bdb dB() {
        return bdb.i;
    }

    @Override
    public float ed() {
        return 180.0f - czl.f((float)this.f() + 0.5f, this.b) / ((float)Math.PI * 2) * 360.0f;
    }

    @Override
    public @Nullable cic a_(int $$0) {
        if ($$0 == 0) {
            return cic.a(this::e, this::a);
        }
        return super.a_($$0);
    }
}

