/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public abstract class hlq {
    private static final fth a = new fth(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private static final double b = bgj.n(100.0);
    protected final hif j;
    protected double k;
    protected double l;
    protected double m;
    protected double n;
    protected double o;
    protected double p;
    protected double q;
    protected double r;
    protected double s;
    private fth c = a;
    protected boolean t;
    protected boolean u = true;
    private boolean d;
    protected boolean v;
    protected float w = 0.6f;
    protected float x = 1.8f;
    protected final bgr y = bgr.a();
    protected int z;
    protected int A;
    protected float B;
    protected float C = 0.98f;
    protected boolean D = false;

    protected hlq(hif $$0, double $$1, double $$2, double $$3) {
        this.j = $$0;
        this.b(0.2f, 0.2f);
        this.c($$1, $$2, $$3);
        this.k = $$1;
        this.l = $$2;
        this.m = $$3;
        this.A = (int)(4.0f / (this.y.i() * 0.9f + 0.1f));
    }

    public hlq(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        this($$0, $$1, $$2, $$3);
        this.q = $$4 + (double)((this.y.i() * 2.0f - 1.0f) * 0.4f);
        this.r = $$5 + (double)((this.y.i() * 2.0f - 1.0f) * 0.4f);
        this.s = $$6 + (double)((this.y.i() * 2.0f - 1.0f) * 0.4f);
        double $$7 = (this.y.i() + this.y.i() + 1.0f) * 0.15f;
        double $$8 = Math.sqrt(this.q * this.q + this.r * this.r + this.s * this.s);
        this.q = this.q / $$8 * $$7 * (double)0.4f;
        this.r = this.r / $$8 * $$7 * (double)0.4f + (double)0.1f;
        this.s = this.s / $$8 * $$7 * (double)0.4f;
    }

    public hlq c(float $$0) {
        this.q *= (double)$$0;
        this.r = (this.r - (double)0.1f) * (double)$$0 + (double)0.1f;
        this.s *= (double)$$0;
        return this;
    }

    public void b(double $$0, double $$1, double $$2) {
        this.q = $$0;
        this.r = $$1;
        this.s = $$2;
    }

    public hlq d(float $$0) {
        this.b(0.2f * $$0, 0.2f * $$0);
        return this;
    }

    public void a(int $$0) {
        this.A = $$0;
    }

    public int j() {
        return this.A;
    }

    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        this.r -= 0.04 * (double)this.B;
        this.a(this.q, this.r, this.s);
        if (this.D && this.o == this.l) {
            this.q *= 1.1;
            this.s *= 1.1;
        }
        this.q *= (double)this.C;
        this.r *= (double)this.C;
        this.s *= (double)this.C;
        if (this.t) {
            this.q *= (double)0.7f;
            this.s *= (double)0.7f;
        }
    }

    public abstract hlv bj_();

    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.n + "," + this.o + "," + this.p + "), Age " + this.z;
    }

    public void k() {
        this.v = true;
    }

    protected void b(float $$0, float $$1) {
        if ($$0 != this.w || $$1 != this.x) {
            this.w = $$0;
            this.x = $$1;
            fth $$2 = this.n();
            double $$3 = ($$2.a + $$2.d - (double)$$0) / 2.0;
            double $$4 = ($$2.c + $$2.f - (double)$$0) / 2.0;
            this.a(new fth($$3, $$2.b, $$4, $$3 + (double)this.w, $$2.b + (double)this.x, $$4 + (double)this.w));
        }
    }

    public void c(double $$0, double $$1, double $$2) {
        this.n = $$0;
        this.o = $$1;
        this.p = $$2;
        float $$3 = this.w / 2.0f;
        float $$4 = this.x;
        this.a(new fth($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3));
    }

    public void a(double $$0, double $$1, double $$2) {
        if (this.d) {
            return;
        }
        double $$3 = $$0;
        double $$4 = $$1;
        double $$5 = $$2;
        if (this.u && ($$0 != 0.0 || $$1 != 0.0 || $$2 != 0.0) && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 < b) {
            ftm $$6 = cgk.a(null, new ftm($$0, $$1, $$2), this.n(), this.j, List.of());
            $$0 = $$6.g;
            $$1 = $$6.h;
            $$2 = $$6.i;
        }
        if ($$0 != 0.0 || $$1 != 0.0 || $$2 != 0.0) {
            this.a(this.n().d($$0, $$1, $$2));
            this.l();
        }
        if (Math.abs($$4) >= (double)1.0E-5f && Math.abs($$1) < (double)1.0E-5f) {
            this.d = true;
        }
        boolean bl2 = this.t = $$4 != $$1 && $$4 < 0.0;
        if ($$3 != $$0) {
            this.q = 0.0;
        }
        if ($$5 != $$2) {
            this.s = 0.0;
        }
    }

    protected void l() {
        fth $$0 = this.n();
        this.n = ($$0.a + $$0.d) / 2.0;
        this.o = $$0.b;
        this.p = ($$0.c + $$0.f) / 2.0;
    }

    protected int a(float $$0) {
        is $$1 = is.a(this.n, this.o, this.p);
        if (this.j.H($$1)) {
            return hoh.a(this.j, $$1);
        }
        return 0;
    }

    public boolean m() {
        return !this.v;
    }

    public fth n() {
        return this.c;
    }

    public void a(fth $$0) {
        this.c = $$0;
    }

    public Optional<lv> o() {
        return Optional.empty();
    }

    public record a(float b, float c, float d, float e) {
        public static final a a = new a(1.0f, 1.0f, 0.0f, 1.0f);

        public boolean a() {
            return this.b >= 1.0f && this.c >= 1.0f;
        }

        public float a(int $$0, int $$1, float $$2) {
            if (bgj.b(this.b, this.c)) {
                return this.b;
            }
            float $$3 = bgj.f(((float)$$0 + $$2) / (float)$$1, this.d, this.e);
            return bgj.b($$3, this.b, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "startAlpha;endAlpha;startAtNormalizedAge;endAtNormalizedAge", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "startAlpha;endAlpha;startAtNormalizedAge;endAtNormalizedAge", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "startAlpha;endAlpha;startAtNormalizedAge;endAtNormalizedAge", "b", "c", "d", "e"}, this, $$0);
        }
    }
}

