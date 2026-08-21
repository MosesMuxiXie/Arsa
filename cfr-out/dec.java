/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public abstract class dec
extends cgk
implements cik {
    private static final boolean b = false;
    private static final boolean c = false;
    protected @Nullable cgr<cgk> a;
    private boolean d = false;
    private boolean e;
    private boolean f = false;
    private @Nullable cgk g;

    protected dec(cgu<? extends dec> $$0, dwo $$1) {
        super($$0, $$1);
    }

    protected void a(@Nullable cgr<cgk> $$0) {
        this.a = $$0;
    }

    public void d(@Nullable cgk $$0) {
        this.a(cgr.a($$0));
    }

    @Override
    public @Nullable cgk p() {
        return cgr.a(this.a, this.ao());
    }

    public cgk m() {
        return (cgk)MoreObjects.firstNonNull((Object)this.p(), (Object)this);
    }

    @Override
    protected void a(fns $$0) {
        cgr.a(this.a, $$0, "Owner");
        if (this.d) {
            $$0.a("LeftOwner", true);
        }
        $$0.a("HasBeenShot", this.f);
    }

    protected boolean e(cgk $$0) {
        return this.a != null && this.a.b($$0);
    }

    @Override
    protected void a(fnq $$0) {
        this.a(cgr.a($$0, "Owner"));
        this.d = $$0.a("LeftOwner", false);
        this.f = $$0.a("HasBeenShot", false);
    }

    @Override
    public void y(cgk $$0) {
        super.y($$0);
        if ($$0 instanceof dec) {
            dec $$1 = (dec)$$0;
            this.a = $$1.a;
        }
    }

    @Override
    public void g() {
        if (!this.f) {
            this.a(etk.K, this.p());
            this.f = true;
        }
        this.n();
        super.g();
        this.e = false;
    }

    protected void n() {
        if (!this.d && !this.e) {
            this.d = this.f();
            this.e = true;
        }
    }

    private boolean f() {
        cgk $$0 = this.p();
        if ($$0 != null) {
            fth $$12 = this.dj().b(this.dN()).g(1.0);
            return $$0.du().dp().filter(cgs.h).noneMatch($$1 -> $$12.c($$1.dj()));
        }
        return true;
    }

    public ftm c(double $$0, double $$1, double $$2, float $$3, float $$4) {
        return new ftm($$0, $$1, $$2).d().b(this.as.a(0.0, 0.0172275 * (double)$$4), this.as.a(0.0, 0.0172275 * (double)$$4), this.as.a(0.0, 0.0172275 * (double)$$4)).c((double)$$3);
    }

    public void d(double $$0, double $$1, double $$2, float $$3, float $$4) {
        ftm $$5 = this.c($$0, $$1, $$2, $$3, $$4);
        this.k($$5);
        this.aF = true;
        double $$6 = $$5.i();
        this.v((float)(bgj.d($$5.g, $$5.i) * 57.2957763671875));
        this.w((float)(bgj.d($$5.h, $$6) * 57.2957763671875));
        this.ab = this.ec();
        this.ac = this.ee();
    }

    public void a(cgk $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        float $$6 = -bgj.a((double)($$2 * ((float)Math.PI / 180))) * bgj.b((double)($$1 * ((float)Math.PI / 180)));
        float $$7 = -bgj.a((double)(($$1 + $$3) * ((float)Math.PI / 180)));
        float $$8 = bgj.b((double)($$2 * ((float)Math.PI / 180))) * bgj.b((double)($$1 * ((float)Math.PI / 180)));
        this.d($$6, $$7, $$8, $$4, $$5);
        ftm $$9 = $$0.ag();
        this.k(this.dN().b($$9.g, $$0.aV() ? 0.0 : $$9.h, $$9.i));
    }

    @Override
    public void a(boolean $$0, is $$1) {
        double $$2 = $$0 ? -0.03 : 0.1;
        this.k(this.dN().b(0.0, $$2, 0.0));
        dec.a(this.ao(), $$1);
    }

    @Override
    public void m(boolean $$0) {
        double $$1 = $$0 ? -0.03 : 0.06;
        this.k(this.dN().b(0.0, $$1, 0.0));
        this.l();
    }

    public static <T extends dec> T a(a<T> $$0, axf $$1, dlt $$2, chl $$3, float $$42, float $$5, float $$6) {
        return (T)dec.a($$0.create($$1, $$3, $$2), $$1, $$2, $$4 -> $$4.a($$3, $$3.ee(), $$3.ec(), $$42, $$5, $$6));
    }

    public static <T extends dec> T a(a<T> $$0, axf $$1, dlt $$2, chl $$3, double $$4, double $$52, double $$6, float $$7, float $$8) {
        return (T)dec.a($$0.create($$1, $$3, $$2), $$1, $$2, $$5 -> $$5.d($$4, $$52, $$6, $$7, $$8));
    }

    public static <T extends dec> T a(T $$0, axf $$1, dlt $$2, double $$3, double $$4, double $$5, float $$62, float $$7) {
        return (T)dec.a($$0, $$1, $$2, $$6 -> $$0.d($$3, $$4, $$5, $$62, $$7));
    }

    public static <T extends dec> T a(T $$02, axf $$1, dlt $$2) {
        return (T)dec.a($$02, $$1, $$2, $$0 -> {});
    }

    public static <T extends dec> T a(T $$0, axf $$1, dlt $$2, Consumer<T> $$3) {
        $$3.accept($$0);
        $$1.b($$0);
        $$0.b($$1, $$2);
        return $$0;
    }

    public void b(axf $$02, dlt $$1) {
        deh $$2;
        dlt $$3;
        dsq.a($$02, $$1, this, (dlp $$0) -> {});
        dec dec2 = this;
        if (dec2 instanceof deh && ($$3 = ($$2 = (deh)dec2).eq()) != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dsq.a($$02, $$3, this, $$2::b);
        }
    }

    protected ded a(ftk $$0) {
        ded $$5;
        fti $$4;
        if ($$0.d() == ftk.a.c) {
            ftj $$1 = (ftj)$$0;
            cgk $$2 = $$1.a();
            ded $$3 = $$2.a(this);
            if ($$3 != ded.a) {
                if ($$2 != this.g && this.a($$3, $$2, this.a, false)) {
                    this.g = $$2;
                }
                return $$3;
            }
        } else if (this.ah_() && $$0 instanceof fti && ($$4 = (fti)$$0).f() && this.a($$5 = ded.b, null, this.a, false)) {
            this.k(this.dN().c(0.2));
            return $$5;
        }
        this.b($$0);
        return ded.a;
    }

    protected boolean ah_() {
        return false;
    }

    public boolean a(ded $$0, @Nullable cgk $$1, @Nullable cgr<cgk> $$2, boolean $$3) {
        $$0.deflect(this, $$1, this.as);
        if (!this.ao().B_()) {
            this.a($$2);
            this.a($$3);
        }
        return true;
    }

    protected void a(boolean $$0) {
    }

    protected void b(dlp $$0) {
    }

    protected void b(ftk $$0) {
        ftk.a $$1 = $$0.d();
        if ($$1 == ftk.a.c) {
            ftj $$2 = (ftj)$$0;
            cgk $$3 = $$2.a();
            if ($$3.ay().a(bdt.I) && $$3 instanceof dec) {
                dec $$4 = (dec)$$3;
                $$4.a(ded.c, this.p(), this.a, true);
            }
            this.a($$2);
            this.ao().a(etk.J, $$0.g(), etk.a.a(this, null));
        } else if ($$1 == ftk.a.b) {
            fti $$5 = (fti)$$0;
            this.a($$5);
            is $$6 = $$5.b();
            this.ao().a(etk.J, $$6, etk.a.a(this, this.ao().a_($$6)));
        }
    }

    protected void a(ftj $$0) {
    }

    protected void a(fti $$0) {
        eoh $$1 = this.ao().a_($$0.b());
        $$1.a(this.ao(), $$1, $$0, this);
    }

    protected boolean b(cgk $$0) {
        if (!$$0.bW()) {
            return false;
        }
        cgk $$1 = this.p();
        return $$1 == null || this.d || !$$1.A($$0);
    }

    protected void q() {
        ftm $$0 = this.dN();
        double $$1 = $$0.i();
        this.w(dec.f(this.ac, (float)(bgj.d($$0.h, $$1) * 57.2957763671875)));
        this.v(dec.f(this.ab, (float)(bgj.d($$0.g, $$0.i) * 57.2957763671875)));
    }

    protected static float f(float $$0, float $$1) {
        while ($$1 - $$0 < -180.0f) {
            $$0 -= 360.0f;
        }
        while ($$1 - $$0 >= 180.0f) {
            $$0 += 360.0f;
        }
        return bgj.h(0.2f, $$0, $$1);
    }

    @Override
    public aay<adb> a(axd $$0) {
        cgk $$1 = this.p();
        return new adc((cgk)this, $$0, $$1 == null ? 0 : $$1.aA());
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        cgk $$1 = this.ao().a($$0.n());
        if ($$1 != null) {
            this.d($$1);
        }
    }

    @Override
    public boolean c(axf $$0, is $$1) {
        cgk $$2 = this.p();
        if ($$2 instanceof ddm) {
            return $$2.c($$0, $$1);
        }
        return $$2 == null || $$0.U().a(eua.F) != false;
    }

    public boolean a(axf $$0) {
        return this.ay().a(bdt.h) && $$0.U().a(eua.L) != false;
    }

    @Override
    public boolean bX() {
        return this.ay().a(bdt.I);
    }

    @Override
    public float ci() {
        return this.bX() ? 1.0f : 0.0f;
    }

    public DoubleDoubleImmutablePair a(chl $$0, cex $$1) {
        double $$2 = this.dN().g;
        double $$3 = this.dN().i;
        return DoubleDoubleImmutablePair.of((double)$$2, (double)$$3);
    }

    @Override
    public int co() {
        return 2;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (!this.d($$1)) {
            this.bT();
        }
        return false;
    }

    @FunctionalInterface
    public static interface a<T extends dec> {
        public T create(axf var1, chl var2, dlt var3);
    }
}

