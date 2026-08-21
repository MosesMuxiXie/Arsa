/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class ddy
extends dec
implements dea {
    private static final alw<dlt> b = ama.a(ddy.class, aly.h);
    private static final alw<OptionalInt> c = ama.a(ddy.class, aly.u);
    private static final alw<Boolean> d = ama.a(ddy.class, aly.k);
    private static final int e = 0;
    private static final int f = 0;
    private static final boolean g = false;
    private int h = 0;
    private int i = 0;
    private @Nullable chl j;

    public ddy(cgu<? extends ddy> $$0, dwo $$1) {
        super((cgu<? extends dec>)$$0, $$1);
    }

    public ddy(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        super((cgu<? extends dec>)cgu.ad, $$0);
        this.h = 0;
        this.a_($$1, $$2, $$3);
        this.az.a(b, $$4.v());
        int $$5 = 1;
        dol $$6 = $$4.a(ki.aq);
        if ($$6 != null) {
            $$5 += $$6.a();
        }
        this.m(this.as.a(0.0, 0.002297), 0.05, this.as.a(0.0, 0.002297));
        this.i = 10 * $$5 + this.as.a(6) + this.as.a(7);
    }

    public ddy(dwo $$0, @Nullable cgk $$1, double $$2, double $$3, double $$4, dlt $$5) {
        this($$0, $$2, $$3, $$4, $$5);
        this.d($$1);
    }

    public ddy(dwo $$0, dlt $$1, chl $$2) {
        this($$0, $$2, $$2.dP(), $$2.dR(), $$2.dV(), $$1);
        this.az.a(c, OptionalInt.of($$2.aA()));
        this.j = $$2;
    }

    public ddy(dwo $$0, dlt $$1, double $$2, double $$3, double $$4, boolean $$5) {
        this($$0, $$2, $$3, $$4, $$1);
        this.az.a(d, $$5);
    }

    public ddy(dwo $$0, dlt $$1, cgk $$2, double $$3, double $$4, double $$5, boolean $$6) {
        this($$0, $$1, $$3, $$4, $$5, $$6);
        this.d($$2);
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(b, ddy.s());
        $$0.a(c, OptionalInt.empty());
        $$0.a(d, false);
    }

    @Override
    public boolean a(double $$0) {
        return $$0 < 4096.0 && !this.k();
    }

    @Override
    public boolean j(double $$0, double $$1, double $$2) {
        return super.j($$0, $$1, $$2) && !this.k();
    }

    @Override
    public void g() {
        dwo dwo2;
        ftk $$9;
        super.g();
        if (this.k()) {
            if (this.j == null) {
                this.az.a(c).ifPresent($$0 -> {
                    cgk $$1 = this.ao().a($$0);
                    if ($$1 instanceof chl) {
                        this.j = (chl)$$1;
                    }
                });
            }
            if (this.j != null) {
                ftm $$5;
                if (this.j.gj()) {
                    ftm $$02 = this.j.cj();
                    double $$1 = 1.5;
                    double $$2 = 0.1;
                    ftm $$3 = this.j.dN();
                    this.j.k($$3.b($$02.g * 0.1 + ($$02.g * 1.5 - $$3.g) * 0.5, $$02.h * 0.1 + ($$02.h * 1.5 - $$3.h) * 0.5, $$02.i * 0.1 + ($$02.i * 1.5 - $$3.i) * 0.5));
                    ftm $$4 = this.j.a(dlx.wG);
                } else {
                    $$5 = ftm.c;
                }
                this.a_(this.j.dP() + $$5.g, this.j.dR() + $$5.h, this.j.dV() + $$5.i);
                this.k(this.j.dN());
            }
            ftk $$6 = dee.a((cgk)this, this::b);
        } else {
            if (!this.f()) {
                double $$7 = this.ad ? 1.0 : 1.15;
                this.k(this.dN().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
            }
            ftm $$8 = this.dN();
            $$9 = dee.a((cgk)this, this::b);
            this.a(chp.a, $$8);
            this.aW();
            this.k($$8);
        }
        if (!this.ar && this.cb() && $$9.d() != ftk.a.a) {
            this.a($$9);
            this.aF = true;
        }
        this.q();
        if (this.h == 0 && !this.bq()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.kD, bdb.i, 3.0f, 1.0f);
        }
        ++this.h;
        if (this.ao().B_() && this.h % 2 < 2) {
            this.ao().a(ly.E, this.dP(), this.dR(), this.dV(), this.as.k() * 0.05, -this.dN().h * 0.5, this.as.k() * 0.05);
        }
        if (this.h > this.i && (dwo2 = this.ao()) instanceof axf) {
            axf $$10 = (axf)dwo2;
            this.b($$10);
        }
    }

    private void b(axf $$0) {
        $$0.a((cgk)this, (byte)17);
        this.a(etk.w, this.p());
        this.e($$0);
        this.aC();
    }

    @Override
    protected void a(ftj $$0) {
        super.a($$0);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.b($$1);
        }
    }

    @Override
    protected void a(fti $$0) {
        is $$1 = new is($$0.b());
        this.ao().a_($$1).a(this.ao(), $$1, this, chc.a, true);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            if (this.i()) {
                this.b($$2);
            }
        }
        super.a($$0);
    }

    private boolean i() {
        return !this.r().isEmpty();
    }

    private void e(axf $$0) {
        float $$1 = 0.0f;
        List<dok> $$2 = this.r();
        if (!$$2.isEmpty()) {
            $$1 = 5.0f + (float)($$2.size() * 2);
        }
        if ($$1 > 0.0f) {
            if (this.j != null) {
                this.j.a($$0, this.en().a(this, this.p()), 5.0f + (float)($$2.size() * 2));
            }
            double $$3 = 5.0;
            ftm $$4 = this.dI();
            List<chl> $$5 = this.ao().a(chl.class, this.dj().g(5.0));
            for (chl $$6 : $$5) {
                if ($$6 == this.j || this.g($$6) > 25.0) continue;
                boolean $$7 = false;
                for (int $$8 = 0; $$8 < 2; ++$$8) {
                    ftm $$9 = new ftm($$6.dP(), $$6.f(0.5 * (double)$$8), $$6.dV());
                    fti $$10 = this.ao().a(new dvw($$4, $$9, dvw.a.a, dvw.b.a, this));
                    if (((ftk)$$10).d() != ftk.a.a) continue;
                    $$7 = true;
                    break;
                }
                if (!$$7) continue;
                float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                $$6.a($$0, this.en().a(this, this.p()), $$11);
            }
        }
    }

    private boolean k() {
        return this.az.a(c).isPresent();
    }

    public boolean f() {
        return this.az.a(d);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 17 && this.ao().B_()) {
            ftm $$1 = this.dN();
            this.ao().a(this.dP(), this.dR(), this.dV(), $$1.g, $$1.h, $$1.i, this.r());
        }
        super.b($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Life", this.h);
        $$0.a("LifeTime", this.i);
        $$0.a("FireworksItem", dlt.b, this.e());
        $$0.a("ShotAtAngle", this.az.a(d));
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.h = $$0.a("Life", 0);
        this.i = $$0.a("LifeTime", 0);
        this.az.a(b, $$0.a("FireworksItem", dlt.b).orElse(ddy.s()));
        this.az.a(d, $$0.a("ShotAtAngle", false));
    }

    private List<dok> r() {
        dlt $$0 = this.az.a(b);
        dol $$1 = $$0.a(ki.aq);
        return $$1 != null ? $$1.b() : List.of();
    }

    @Override
    public dlt e() {
        return this.az.a(b);
    }

    @Override
    public boolean cT() {
        return false;
    }

    private static dlt s() {
        return new dlt(dlx.wG);
    }

    @Override
    public DoubleDoubleImmutablePair a(chl $$0, cex $$1) {
        double $$2 = $$0.dI().g - this.dI().g;
        double $$3 = $$0.dI().i - this.dI().i;
        return DoubleDoubleImmutablePair.of((double)$$2, (double)$$3);
    }
}

