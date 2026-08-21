/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class cgz
extends cgk {
    protected static final alw<Integer> a = ama.a(cgz.class, aly.b);
    private static final int b = 6000;
    private static final int c = 20;
    private static final int d = 8;
    private static final int e = 40;
    private static final double f = 0.5;
    private static final short g = 5;
    private static final short h = 0;
    private static final short i = 0;
    private static final int j = 1;
    private int k = 0;
    private int l = 5;
    private int m = 1;
    private @Nullable ddm n;
    private final chf o = new chf(this);

    public cgz(dwo $$0, double $$1, double $$2, double $$3, int $$4) {
        this($$0, new ftm($$1, $$2, $$3), ftm.c, $$4);
    }

    public cgz(dwo $$0, ftm $$1, ftm $$2, int $$3) {
        this((cgu<? extends cgz>)cgu.Z, $$0);
        this.b($$1);
        if (!$$0.B_()) {
            this.v(this.as.i() * 360.0f);
            ftm $$4 = new ftm((this.as.j() * 0.2 - 0.1) * 2.0, this.as.j() * 0.2 * 2.0, (this.as.j() * 0.2 - 0.1) * 2.0);
            if ($$2.h() > 0.0 && $$2.b($$4) < 0.0) {
                $$4 = $$4.c(-1.0);
            }
            double $$5 = this.dj().a();
            this.b($$1.e($$2.d().c($$5 * 0.5)));
            this.k($$4);
            if (!$$0.b(this.dj())) {
                this.i($$5);
            }
        }
        this.b($$3);
    }

    public cgz(cgu<? extends cgz> $$0, dwo $$1) {
        super($$0, $$1);
    }

    protected void i(double $$02) {
        ftm $$1 = this.dI().b(0.0, (double)this.dG() / 2.0, 0.0);
        fug $$2 = fud.a(fth.a($$1, $$02, $$02, $$02));
        this.ao().a((cgk)this, $$2, $$1, (double)this.dF(), (double)this.dG(), (double)this.dF()).ifPresent($$0 -> this.b($$0.b(0.0, (double)(-this.dG()) / 2.0, 0.0)));
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(a, 0);
    }

    @Override
    protected double bs() {
        return 0.03;
    }

    @Override
    public void g() {
        boolean $$0;
        this.o.e();
        if (this.ay && this.ao().B_()) {
            this.ay = false;
            return;
        }
        super.g();
        boolean bl2 = $$0 = !this.ao().b(this.dj());
        if (this.a(bdv.a)) {
            this.m();
        } else if (!$$0) {
            this.bu();
        }
        if (this.ao().b_(this.dK()).a(bdv.b)) {
            this.m((this.as.i() - this.as.i()) * 0.2f, 0.2f, (this.as.i() - this.as.i()) * 0.2f);
        }
        if (this.at % 20 == 1) {
            this.k();
        }
        this.i();
        if (this.n == null && !this.ao().B_() && $$0) {
            boolean $$1;
            boolean bl3 = $$1 = !this.ao().b(this.dj().c(this.dN()));
            if ($$1) {
                this.k(this.dP(), (this.dj().b + this.dj().e) / 2.0, this.dV());
                this.aF = true;
            }
        }
        double $$2 = this.dN().h;
        this.a(chp.a, this.dN());
        this.aW();
        float $$3 = 0.98f;
        if (this.aV()) {
            $$3 = this.ao().a_(this.bf()).b().g() * 0.98f;
        }
        this.k(this.dN().c((double)$$3));
        if (this.af && $$2 < -this.bt()) {
            this.k(new ftm(this.dN().g, -$$2 * 0.4, this.dN().i));
        }
        ++this.k;
        if (this.k >= 6000) {
            this.aC();
        }
    }

    private void i() {
        if (this.n == null || this.n.au() || this.n.g(this) > 64.0) {
            ddm $$0 = this.ao().a((cgk)this, 8.0);
            this.n = $$0 != null && !$$0.au() && !$$0.fa() ? $$0 : null;
        }
        if (this.n != null) {
            ftm $$1 = new ftm(this.n.dP() - this.dP(), this.n.dR() + (double)this.n.dk() / 2.0 - this.dR(), this.n.dV() - this.dV());
            double $$2 = $$1.h();
            double $$3 = 1.0 - Math.sqrt($$2) / 8.0;
            this.k(this.dN().e($$1.d().c($$3 * $$3 * 0.1)));
        }
    }

    @Override
    public is bf() {
        return this.f(0.999999f);
    }

    private void k() {
        if (this.ao() instanceof axf) {
            List<cgz> $$0 = this.ao().a(esw.a(cgz.class), this.dj().g(0.5), this::a);
            for (cgz $$1 : $$0) {
                this.b($$1);
            }
        }
    }

    public static void a(axf $$0, ftm $$1, int $$2) {
        cgz.a($$0, $$1, ftm.c, $$2);
    }

    public static void a(axf $$0, ftm $$1, ftm $$2, int $$3) {
        while ($$3 > 0) {
            int $$4 = cgz.a($$3);
            $$3 -= $$4;
            if (cgz.b($$0, $$1, $$4)) continue;
            $$0.b(new cgz($$0, $$1, $$2, $$4));
        }
    }

    private static boolean b(axf $$0, ftm $$1, int $$22) {
        fth $$3 = fth.a($$1, 1.0, 1.0, 1.0);
        int $$4 = $$0.G_().a(40);
        List<cgz> $$5 = $$0.a(esw.a(cgz.class), $$3, (? super T $$2) -> cgz.a($$2, $$4, $$22));
        if (!$$5.isEmpty()) {
            cgz $$6 = $$5.get(0);
            ++$$6.m;
            $$6.k = 0;
            return true;
        }
        return false;
    }

    private boolean a(cgz $$0) {
        return $$0 != this && cgz.a($$0, this.aA(), this.e());
    }

    private static boolean a(cgz $$0, int $$1, int $$2) {
        return !$$0.eh() && ($$0.aA() - $$1) % 40 == 0 && $$0.e() == $$2;
    }

    private void b(cgz $$0) {
        this.m += $$0.m;
        this.k = Math.min(this.k, $$0.k);
        $$0.aC();
    }

    private void m() {
        ftm $$0 = this.dN();
        this.m($$0.g * (double)0.99f, Math.min($$0.h + (double)5.0E-4f, (double)0.06f), $$0.i * (double)0.99f);
    }

    @Override
    protected void bI() {
    }

    @Override
    public final boolean b(cex $$0) {
        return !this.d($$0);
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        if (this.d($$1)) {
            return false;
        }
        this.bT();
        this.l = (int)((float)this.l - $$2);
        if (this.l <= 0) {
            this.aC();
        }
        return true;
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("Health", (short)this.l);
        $$0.a("Age", (short)this.k);
        $$0.a("Value", (short)this.e());
        $$0.a("Count", this.m);
    }

    @Override
    protected void a(fnq $$0) {
        this.l = $$0.a("Health", (short)5);
        this.k = $$0.a("Age", (short)0);
        this.b($$0.a("Value", (short)0));
        this.m = $$0.a("Count", bfm.r).orElse(1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a_(ddm $$0) {
        if (!($$0 instanceof axg)) {
            return;
        }
        axg $$1 = (axg)$$0;
        if ($$0.cq == 0) {
            void $$2;
            $$0.cq = 2;
            $$0.a((cgk)this, 1);
            int $$3 = this.a((axg)$$2, this.e());
            if ($$3 > 0) {
                $$0.d($$3);
            }
            --this.m;
            if (this.m == 0) {
                this.aC();
            }
        }
    }

    private int a(axg $$0, int $$1) {
        Optional<dsn> $$2 = dsq.a(dsp.A, (chl)$$0, dlt::n);
        if ($$2.isPresent()) {
            int $$6;
            dlt $$3 = $$2.get().a();
            int $$4 = dsq.c($$0.A(), $$3, $$1);
            int $$5 = Math.min($$4, $$3.o());
            $$3.b($$3.o() - $$5);
            if ($$5 > 0 && ($$6 = $$1 - $$5 * $$1 / $$4) > 0) {
                return this.a($$0, $$6);
            }
            return 0;
        }
        return $$1;
    }

    public int e() {
        return this.az.a(a);
    }

    private void b(int $$0) {
        this.az.a(a, $$0);
    }

    public int f() {
        int $$0 = this.e();
        if ($$0 >= 2477) {
            return 10;
        }
        if ($$0 >= 1237) {
            return 9;
        }
        if ($$0 >= 617) {
            return 8;
        }
        if ($$0 >= 307) {
            return 7;
        }
        if ($$0 >= 149) {
            return 6;
        }
        if ($$0 >= 73) {
            return 5;
        }
        if ($$0 >= 37) {
            return 4;
        }
        if ($$0 >= 17) {
            return 3;
        }
        if ($$0 >= 7) {
            return 2;
        }
        if ($$0 >= 3) {
            return 1;
        }
        return 0;
    }

    public static int a(int $$0) {
        if ($$0 >= 2477) {
            return 2477;
        }
        if ($$0 >= 1237) {
            return 1237;
        }
        if ($$0 >= 617) {
            return 617;
        }
        if ($$0 >= 307) {
            return 307;
        }
        if ($$0 >= 149) {
            return 149;
        }
        if ($$0 >= 73) {
            return 73;
        }
        if ($$0 >= 37) {
            return 37;
        }
        if ($$0 >= 17) {
            return 17;
        }
        if ($$0 >= 7) {
            return 7;
        }
        if ($$0 >= 3) {
            return 3;
        }
        return 1;
    }

    @Override
    public boolean cT() {
        return false;
    }

    @Override
    public bdb dB() {
        return bdb.i;
    }

    @Override
    public chf l_() {
        return this.o;
    }
}

