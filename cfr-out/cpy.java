/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cpy
extends cop {
    private static final csk d = csk.b().d();
    private static final double e = 2.5;
    private final csk f;
    protected final chn a;
    protected final double b;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    protected @Nullable ddm c;
    private int l;
    private boolean m;
    private final Predicate<dlt> n;
    private final boolean o;
    private final double p;

    public cpy(cht $$0, double $$1, Predicate<dlt> $$2, boolean $$3) {
        this((chn)$$0, $$1, $$2, $$3, 2.5);
    }

    public cpy(cht $$0, double $$1, Predicate<dlt> $$2, boolean $$3, double $$4) {
        this((chn)$$0, $$1, $$2, $$3, $$4);
    }

    cpy(chn $$02, double $$12, Predicate<dlt> $$2, boolean $$3, double $$4) {
        this.a = $$02;
        this.b = $$12;
        this.n = $$2;
        this.o = $$3;
        this.p = $$4;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
        this.f = d.c().a((chl $$0, axf $$1) -> this.a($$0));
    }

    @Override
    public boolean b() {
        if (this.l > 0) {
            --this.l;
            return false;
        }
        this.c = cpy.a(this.a).a(this.f.a(this.a.i(cis.G)), this.a);
        return this.c != null;
    }

    private boolean a(chl $$0) {
        return this.n.test($$0.fx()) || this.n.test($$0.fy());
    }

    @Override
    public boolean c() {
        if (this.h()) {
            if (this.a.g((cgk)this.c) < 36.0) {
                if (this.c.h(this.g, this.h, this.i) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs((double)this.c.ee() - this.j) > 5.0 || Math.abs((double)this.c.ec() - this.k) > 5.0) {
                    return false;
                }
            } else {
                this.g = this.c.dP();
                this.h = this.c.dR();
                this.i = this.c.dV();
            }
            this.j = this.c.ee();
            this.k = this.c.ec();
        }
        return this.b();
    }

    protected boolean h() {
        return this.o;
    }

    @Override
    public void d() {
        this.g = this.c.dP();
        this.h = this.c.dR();
        this.i = this.c.dV();
        this.m = true;
    }

    @Override
    public void e() {
        this.c = null;
        this.i();
        this.l = cpy.b(100);
        this.m = false;
    }

    @Override
    public void a() {
        this.a.J().a(this.c, (float)(this.a.ae() + 20), (float)this.a.ac());
        if (this.a.g((cgk)this.c) < this.p * this.p) {
            this.i();
        } else {
            this.a(this.c);
        }
    }

    protected void i() {
        this.a.N().n();
    }

    protected void a(ddm $$0) {
        this.a.N().a((cgk)$$0, this.b);
    }

    public boolean k() {
        return this.m;
    }

    public static class a
    extends cpy {
        public a(chn $$0, double $$1, Predicate<dlt> $$2, boolean $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        protected void i() {
            this.a.K().g();
        }

        @Override
        protected void a(ddm $$0) {
            ftm $$1 = $$0.bV().d(this.a.dI()).c(this.a.ep().j()).e(this.a.dI());
            this.a.K().a($$1.g, $$1.h, $$1.i, this.b);
        }
    }
}

