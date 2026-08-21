/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public class czv
extends chn
implements czu {
    private static final alw<Boolean> a = ama.a(czv.class, aly.k);
    private static final byte b = 1;
    private int c = 1;

    public czv(cgu<? extends czv> $$0, dwo $$1) {
        super((cgu<? extends chn>)$$0, $$1);
        this.cn = 5;
        this.cp = new b(this, false, () -> false);
    }

    @Override
    protected void D() {
        this.cs.a(5, new d(this));
        this.cs.a(7, new a(this));
        this.cs.a(7, new c(this));
        this.ct.a(1, new cqj<ddm>(this, ddm.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dR() - this.dR()) <= 4.0));
    }

    public boolean k() {
        return this.az.a(a);
    }

    public void x(boolean $$0) {
        this.az.a(a, $$0);
    }

    public int p() {
        return this.c;
    }

    private static boolean i(cex $$0) {
        return $$0.c() instanceof dep && $$0.d() instanceof ddm;
    }

    @Override
    public boolean a(axf $$0, cex $$1) {
        return this.cU() && !$$1.a(bdq.d) || !czv.i($$1) && super.a($$0, $$1);
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
        this.a($$0, 0.02f);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (czv.i($$1)) {
            super.a($$0, $$1, 1000.0f);
            return true;
        }
        if (this.a($$0, $$1)) {
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, false);
    }

    public static cir.a gL() {
        return chn.E().a(cis.u, 10.0).a(cis.o, 100.0).a(cis.j, 8.0).a(cis.n, 0.06);
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected bcz W() {
        return bda.lY;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.ma;
    }

    @Override
    protected bcz fd() {
        return bda.lZ;
    }

    @Override
    protected float fC() {
        return 5.0f;
    }

    public static boolean b(cgu<czv> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.av() != ccz.a && $$4.a(20) == 0 && czv.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public int aj() {
        return 1;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("ExplosionPower", (byte)this.c);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.c = $$0.a("ExplosionPower", (byte)1);
    }

    @Override
    public boolean dY() {
        return true;
    }

    @Override
    public double x() {
        return 10.0;
    }

    @Override
    public double w() {
        return 16.0;
    }

    public static void a(chn $$0) {
        if ($$0.ag_() == null) {
            ftm $$1 = $$0.dN();
            $$0.v(-((float)bgj.d($$1.g, $$1.i)) * 57.295776f);
            $$0.bC = $$0.ec();
        } else {
            chl $$2 = $$0.ag_();
            double $$3 = 64.0;
            if ($$2.g($$0) < 4096.0) {
                double $$4 = $$2.dP() - $$0.dP();
                double $$5 = $$2.dV() - $$0.dV();
                $$0.v(-((float)bgj.d($$4, $$5)) * 57.295776f);
                $$0.bC = $$0.ec();
            }
        }
    }

    public static class b
    extends cnq {
        private final chn l;
        private int m;
        private final boolean n;
        private final BooleanSupplier o;

        public b(chn $$0, boolean $$1, BooleanSupplier $$2) {
            super($$0);
            this.l = $$0;
            this.n = $$1;
            this.o = $$2;
        }

        @Override
        public void a() {
            if (this.o.getAsBoolean()) {
                this.k = cnq.a.a;
                this.l.X();
            }
            if (this.k != cnq.a.b) {
                return;
            }
            if (this.m-- <= 0) {
                this.m += this.l.ep().a(5) + 2;
                ftm $$0 = new ftm(this.e - this.l.dP(), this.f - this.l.dR(), this.g - this.l.dV());
                if (this.a($$0)) {
                    this.l.k(this.l.dN().e($$0.d().c(this.l.i(cis.n) * 5.0 / 3.0)));
                } else {
                    this.k = cnq.a.a;
                }
            }
        }

        private boolean a(ftm $$0) {
            fth $$1 = this.l.dj();
            fth $$2 = $$1.c($$0);
            if (this.n) {
                for (is $$3 : is.a($$2.g(1.0))) {
                    if (this.a(this.l.ao(), null, null, $$3, false, false)) continue;
                    return false;
                }
            }
            boolean $$4 = this.l.by();
            boolean $$52 = this.l.bN();
            ftm $$62 = this.l.dI();
            ftm $$7 = $$62.e($$0);
            return dvt.a($$62, $$7, $$2, ($$5, $$6) -> {
                if ($$1.b($$5)) {
                    return true;
                }
                return this.a(this.l.ao(), $$62, $$7, $$5, $$4, $$52);
            });
        }

        private boolean a(dvt $$0, @Nullable ftm $$1, @Nullable ftm $$2, is $$3, boolean $$4, boolean $$5) {
            boolean $$8;
            boolean $$7;
            eoh $$6 = $$0.a_($$3);
            if ($$6.l()) {
                return true;
            }
            boolean bl2 = $$7 = $$1 != null && $$2 != null;
            boolean bl3 = $$7 ? !this.l.a($$1, $$2, $$6.g($$0, $$3).a(new ftm($$3)).e()) : ($$8 = $$6.g($$0, $$3).c());
            if (!this.n) {
                return $$8;
            }
            if ($$6.a(bdp.bD)) {
                return false;
            }
            flb $$9 = $$0.b_($$3);
            if (!($$9.c() || $$7 && !this.l.a($$9, $$3, $$1, $$2))) {
                if ($$9.a(bdv.a)) {
                    return $$4;
                }
                if ($$9.a(bdv.b)) {
                    return $$5;
                }
            }
            return $$8;
        }
    }

    public static class d
    extends cop {
        private static final int a = 64;
        private final chn b;
        private final int c;

        public d(chn $$0) {
            this($$0, 0);
        }

        public d(chn $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            double $$3;
            double $$2;
            cnq $$0 = this.b.K();
            if (!$$0.b()) {
                return true;
            }
            double $$1 = $$0.d() - this.b.dP();
            double $$4 = $$1 * $$1 + ($$2 = $$0.e() - this.b.dR()) * $$2 + ($$3 = $$0.f() - this.b.dV()) * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public void d() {
            ftm $$0 = d.a(this.b, this.c);
            this.b.K().a($$0.a(), $$0.b(), $$0.c(), 1.0);
        }

        public static ftm a(chn $$0, int $$1) {
            is $$7;
            int $$8;
            dwo $$2 = $$0.ao();
            bgr $$3 = $$0.ep();
            ftm $$4 = $$0.dI();
            ftm $$5 = null;
            for (int $$6 = 0; $$6 < 64; ++$$6) {
                $$5 = d.a($$0, $$4, $$3);
                if ($$5 == null || !d.a($$2, $$5, $$1)) continue;
                return $$5;
            }
            if ($$5 == null) {
                $$5 = d.a($$4, $$3);
            }
            if (($$8 = $$2.a(euq.a.e, ($$7 = is.a($$5)).u(), $$7.w())) < $$7.v() && $$8 > $$2.K_()) {
                $$5 = new ftm($$5.a(), $$0.dR() - Math.abs($$0.dR() - $$5.b()), $$5.c());
            }
            return $$5;
        }

        private static boolean a(dwo $$0, ftm $$1, int $$2) {
            if ($$2 <= 0) {
                return true;
            }
            is $$3 = is.a($$1);
            if (!$$0.a_($$3).l()) {
                return false;
            }
            for (iz $$4 : iz.values()) {
                for (int $$5 = 1; $$5 < $$2; ++$$5) {
                    is $$6 = $$3.a($$4, $$5);
                    if ($$0.a_($$6).l()) continue;
                    return true;
                }
            }
            return false;
        }

        private static ftm a(ftm $$0, bgr $$1) {
            double $$2 = $$0.a() + (double)(($$1.i() * 2.0f - 1.0f) * 16.0f);
            double $$3 = $$0.b() + (double)(($$1.i() * 2.0f - 1.0f) * 16.0f);
            double $$4 = $$0.c() + (double)(($$1.i() * 2.0f - 1.0f) * 16.0f);
            return new ftm($$2, $$3, $$4);
        }

        private static @Nullable ftm a(chn $$0, ftm $$1, bgr $$2) {
            ftm $$3 = d.a($$1, $$2);
            if ($$0.gF() && !$$0.a($$3)) {
                return null;
            }
            return $$3;
        }
    }

    public static class a
    extends cop {
        private final chn a;

        public a(chn $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.b));
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            czv.a(this.a);
        }
    }

    static class c
    extends cop {
        private final czv b;
        public int a;

        public c(czv $$0) {
            this.b = $$0;
        }

        @Override
        public boolean b() {
            return this.b.ag_() != null;
        }

        @Override
        public void d() {
            this.a = 0;
        }

        @Override
        public void e() {
            this.b.x(false);
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            chl $$0 = this.b.ag_();
            if ($$0 == null) {
                return;
            }
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.G($$0)) {
                dwo $$2 = this.b.ao();
                ++this.a;
                if (this.a == 10 && !this.b.bq()) {
                    $$2.a(null, 1015, this.b.dK(), 0);
                }
                if (this.a == 20) {
                    double $$3 = 4.0;
                    ftm $$4 = this.b.h(1.0f);
                    double $$5 = $$0.dP() - (this.b.dP() + $$4.g * 4.0);
                    double $$6 = $$0.f(0.5) - (0.5 + this.b.f(0.5));
                    double $$7 = $$0.dV() - (this.b.dV() + $$4.i * 4.0);
                    ftm $$8 = new ftm($$5, $$6, $$7);
                    if (!this.b.bq()) {
                        $$2.a(null, 1016, this.b.dK(), 0);
                    }
                    dep $$9 = new dep($$2, (chl)this.b, $$8.d(), this.b.p());
                    $$9.a_(this.b.dP() + $$4.g * 4.0, this.b.f(0.5) + 0.5, $$9.dV() + $$4.i * 4.0);
                    $$2.b($$9);
                    this.a = -40;
                }
            } else if (this.a > 0) {
                --this.a;
            }
            this.b.x(this.a > 10);
        }
    }
}

