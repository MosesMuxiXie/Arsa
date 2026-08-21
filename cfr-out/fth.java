/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class fth {
    private static final double g = 1.0E-7;
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public fth(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        this.a = Math.min($$0, $$3);
        this.b = Math.min($$1, $$4);
        this.c = Math.min($$2, $$5);
        this.d = Math.max($$0, $$3);
        this.e = Math.max($$1, $$4);
        this.f = Math.max($$2, $$5);
    }

    public fth(is $$0) {
        this($$0.u(), $$0.v(), $$0.w(), $$0.u() + 1, $$0.v() + 1, $$0.w() + 1);
    }

    public fth(ftm $$0, ftm $$1) {
        this($$0.g, $$0.h, $$0.i, $$1.g, $$1.h, $$1.i);
    }

    public static fth a(ffg $$0) {
        return new fth($$0.h(), $$0.i(), $$0.j(), $$0.k() + 1, $$0.l() + 1, $$0.m() + 1);
    }

    public static fth a(ftm $$0) {
        return new fth($$0.g, $$0.h, $$0.i, $$0.g + 1.0, $$0.h + 1.0, $$0.i + 1.0);
    }

    public static fth a(is $$0, is $$1) {
        return new fth(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()), Math.max($$0.u(), $$1.u()) + 1, Math.max($$0.v(), $$1.v()) + 1, Math.max($$0.w(), $$1.w()) + 1);
    }

    public fth a(double $$0) {
        return new fth($$0, this.b, this.c, this.d, this.e, this.f);
    }

    public fth b(double $$0) {
        return new fth(this.a, $$0, this.c, this.d, this.e, this.f);
    }

    public fth c(double $$0) {
        return new fth(this.a, this.b, $$0, this.d, this.e, this.f);
    }

    public fth d(double $$0) {
        return new fth(this.a, this.b, this.c, $$0, this.e, this.f);
    }

    public fth e(double $$0) {
        return new fth(this.a, this.b, this.c, this.d, $$0, this.f);
    }

    public fth f(double $$0) {
        return new fth(this.a, this.b, this.c, this.d, this.e, $$0);
    }

    public double a(iz.a $$0) {
        return $$0.a(this.a, this.b, this.c);
    }

    public double b(iz.a $$0) {
        return $$0.a(this.d, this.e, this.f);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof fth)) {
            return false;
        }
        fth $$1 = (fth)$$0;
        if (Double.compare($$1.a, this.a) != 0) {
            return false;
        }
        if (Double.compare($$1.b, this.b) != 0) {
            return false;
        }
        if (Double.compare($$1.c, this.c) != 0) {
            return false;
        }
        if (Double.compare($$1.d, this.d) != 0) {
            return false;
        }
        if (Double.compare($$1.e, this.e) != 0) {
            return false;
        }
        return Double.compare($$1.f, this.f) == 0;
    }

    public int hashCode() {
        long $$0 = Double.doubleToLongBits(this.a);
        int $$1 = (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.b);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.c);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.d);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.e);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        $$0 = Double.doubleToLongBits(this.f);
        $$1 = 31 * $$1 + (int)($$0 ^ $$0 >>> 32);
        return $$1;
    }

    public fth a(double $$0, double $$1, double $$2) {
        double $$3 = this.a;
        double $$4 = this.b;
        double $$5 = this.c;
        double $$6 = this.d;
        double $$7 = this.e;
        double $$8 = this.f;
        if ($$0 < 0.0) {
            $$3 -= $$0;
        } else if ($$0 > 0.0) {
            $$6 -= $$0;
        }
        if ($$1 < 0.0) {
            $$4 -= $$1;
        } else if ($$1 > 0.0) {
            $$7 -= $$1;
        }
        if ($$2 < 0.0) {
            $$5 -= $$2;
        } else if ($$2 > 0.0) {
            $$8 -= $$2;
        }
        return new fth($$3, $$4, $$5, $$6, $$7, $$8);
    }

    public fth b(ftm $$0) {
        return this.b($$0.g, $$0.h, $$0.i);
    }

    public fth b(double $$0, double $$1, double $$2) {
        double $$3 = this.a;
        double $$4 = this.b;
        double $$5 = this.c;
        double $$6 = this.d;
        double $$7 = this.e;
        double $$8 = this.f;
        if ($$0 < 0.0) {
            $$3 += $$0;
        } else if ($$0 > 0.0) {
            $$6 += $$0;
        }
        if ($$1 < 0.0) {
            $$4 += $$1;
        } else if ($$1 > 0.0) {
            $$7 += $$1;
        }
        if ($$2 < 0.0) {
            $$5 += $$2;
        } else if ($$2 > 0.0) {
            $$8 += $$2;
        }
        return new fth($$3, $$4, $$5, $$6, $$7, $$8);
    }

    public fth c(double $$0, double $$1, double $$2) {
        double $$3 = this.a - $$0;
        double $$4 = this.b - $$1;
        double $$5 = this.c - $$2;
        double $$6 = this.d + $$0;
        double $$7 = this.e + $$1;
        double $$8 = this.f + $$2;
        return new fth($$3, $$4, $$5, $$6, $$7, $$8);
    }

    public fth g(double $$0) {
        return this.c($$0, $$0, $$0);
    }

    public fth a(fth $$0) {
        double $$1 = Math.max(this.a, $$0.a);
        double $$2 = Math.max(this.b, $$0.b);
        double $$3 = Math.max(this.c, $$0.c);
        double $$4 = Math.min(this.d, $$0.d);
        double $$5 = Math.min(this.e, $$0.e);
        double $$6 = Math.min(this.f, $$0.f);
        return new fth($$1, $$2, $$3, $$4, $$5, $$6);
    }

    public fth b(fth $$0) {
        double $$1 = Math.min(this.a, $$0.a);
        double $$2 = Math.min(this.b, $$0.b);
        double $$3 = Math.min(this.c, $$0.c);
        double $$4 = Math.max(this.d, $$0.d);
        double $$5 = Math.max(this.e, $$0.e);
        double $$6 = Math.max(this.f, $$0.f);
        return new fth($$1, $$2, $$3, $$4, $$5, $$6);
    }

    public fth d(double $$0, double $$1, double $$2) {
        return new fth(this.a + $$0, this.b + $$1, this.c + $$2, this.d + $$0, this.e + $$1, this.f + $$2);
    }

    public fth a(is $$0) {
        return new fth(this.a + (double)$$0.u(), this.b + (double)$$0.v(), this.c + (double)$$0.w(), this.d + (double)$$0.u(), this.e + (double)$$0.v(), this.f + (double)$$0.w());
    }

    public fth c(ftm $$0) {
        return this.d($$0.g, $$0.h, $$0.i);
    }

    public fth a(Vector3f $$0) {
        return this.d($$0.x, $$0.y, $$0.z);
    }

    public boolean c(fth $$0) {
        return this.a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
    }

    public boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        return this.a < $$3 && this.d > $$0 && this.b < $$4 && this.e > $$1 && this.c < $$5 && this.f > $$2;
    }

    public boolean a(ftm $$0, ftm $$1) {
        return this.a(Math.min($$0.g, $$1.g), Math.min($$0.h, $$1.h), Math.min($$0.i, $$1.i), Math.max($$0.g, $$1.g), Math.max($$0.h, $$1.h), Math.max($$0.i, $$1.i));
    }

    public boolean b(is $$0) {
        return this.a($$0.u(), $$0.v(), $$0.w(), $$0.u() + 1, $$0.v() + 1, $$0.w() + 1);
    }

    public boolean d(ftm $$0) {
        return this.e($$0.g, $$0.h, $$0.i);
    }

    public boolean e(double $$0, double $$1, double $$2) {
        return $$0 >= this.a && $$0 < this.d && $$1 >= this.b && $$1 < this.e && $$2 >= this.c && $$2 < this.f;
    }

    public double a() {
        double $$0 = this.b();
        double $$1 = this.c();
        double $$2 = this.d();
        return ($$0 + $$1 + $$2) / 3.0;
    }

    public double b() {
        return this.d - this.a;
    }

    public double c() {
        return this.e - this.b;
    }

    public double d() {
        return this.f - this.c;
    }

    public fth f(double $$0, double $$1, double $$2) {
        return this.c(-$$0, -$$1, -$$2);
    }

    public fth h(double $$0) {
        return this.g(-$$0);
    }

    public Optional<ftm> b(ftm $$0, ftm $$1) {
        return fth.a(this.a, this.b, this.c, this.d, this.e, this.f, $$0, $$1);
    }

    public static Optional<ftm> a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ftm $$6, ftm $$7) {
        double[] $$8 = new double[]{1.0};
        double $$9 = $$7.g - $$6.g;
        double $$10 = $$7.h - $$6.h;
        double $$11 = $$7.i - $$6.i;
        iz $$12 = fth.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, null, $$9, $$10, $$11);
        if ($$12 == null) {
            return Optional.empty();
        }
        double $$13 = $$8[0];
        return Optional.of($$6.b($$13 * $$9, $$13 * $$10, $$13 * $$11));
    }

    public static @Nullable fti a(Iterable<fth> $$0, ftm $$1, ftm $$2, is $$3) {
        double[] $$4 = new double[]{1.0};
        iz $$5 = null;
        double $$6 = $$2.g - $$1.g;
        double $$7 = $$2.h - $$1.h;
        double $$8 = $$2.i - $$1.i;
        for (fth $$9 : $$0) {
            $$5 = fth.a($$9.a($$3), $$1, $$4, $$5, $$6, $$7, $$8);
        }
        if ($$5 == null) {
            return null;
        }
        double $$10 = $$4[0];
        return new fti($$1.b($$10 * $$6, $$10 * $$7, $$10 * $$8), $$5, $$3, false);
    }

    private static @Nullable iz a(fth $$0, ftm $$1, double[] $$2, @Nullable iz $$3, double $$4, double $$5, double $$6) {
        return fth.a($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    private static @Nullable iz a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ftm $$6, double[] $$7, @Nullable iz $$8, double $$9, double $$10, double $$11) {
        if ($$9 > 1.0E-7) {
            $$8 = fth.a($$7, $$8, $$9, $$10, $$11, $$0, $$1, $$4, $$2, $$5, iz.e, $$6.g, $$6.h, $$6.i);
        } else if ($$9 < -1.0E-7) {
            $$8 = fth.a($$7, $$8, $$9, $$10, $$11, $$3, $$1, $$4, $$2, $$5, iz.f, $$6.g, $$6.h, $$6.i);
        }
        if ($$10 > 1.0E-7) {
            $$8 = fth.a($$7, $$8, $$10, $$11, $$9, $$1, $$2, $$5, $$0, $$3, iz.a, $$6.h, $$6.i, $$6.g);
        } else if ($$10 < -1.0E-7) {
            $$8 = fth.a($$7, $$8, $$10, $$11, $$9, $$4, $$2, $$5, $$0, $$3, iz.b, $$6.h, $$6.i, $$6.g);
        }
        if ($$11 > 1.0E-7) {
            $$8 = fth.a($$7, $$8, $$11, $$9, $$10, $$2, $$0, $$3, $$1, $$4, iz.c, $$6.i, $$6.g, $$6.h);
        } else if ($$11 < -1.0E-7) {
            $$8 = fth.a($$7, $$8, $$11, $$9, $$10, $$5, $$0, $$3, $$1, $$4, iz.d, $$6.i, $$6.g, $$6.h);
        }
        return $$8;
    }

    private static @Nullable iz a(double[] $$0, @Nullable iz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, double $$9, iz $$10, double $$11, double $$12, double $$13) {
        double $$14 = ($$5 - $$11) / $$2;
        double $$15 = $$12 + $$14 * $$3;
        double $$16 = $$13 + $$14 * $$4;
        if (0.0 < $$14 && $$14 < $$0[0] && $$6 - 1.0E-7 < $$15 && $$15 < $$7 + 1.0E-7 && $$8 - 1.0E-7 < $$16 && $$16 < $$9 + 1.0E-7) {
            $$0[0] = $$14;
            return $$10;
        }
        return $$1;
    }

    public boolean a(ftm $$0, List<fth> $$1) {
        ftm $$2 = this.f();
        ftm $$3 = $$2.e($$0);
        for (fth $$4 : $$1) {
            fth $$5 = $$4.c(this.b() * 0.5 - 1.0E-7, this.c() * 0.5 - 1.0E-7, this.d() * 0.5 - 1.0E-7);
            if ($$5.d($$3) || $$5.d($$2)) {
                return true;
            }
            if (!$$5.b($$2, $$3).isPresent()) continue;
            return true;
        }
        return false;
    }

    public double e(ftm $$0) {
        double $$1 = Math.max(Math.max(this.a - $$0.g, $$0.g - this.d), 0.0);
        double $$2 = Math.max(Math.max(this.b - $$0.h, $$0.h - this.e), 0.0);
        double $$3 = Math.max(Math.max(this.c - $$0.i, $$0.i - this.f), 0.0);
        return bgj.f($$1, $$2, $$3);
    }

    public double d(fth $$0) {
        double $$1 = Math.max(Math.max(this.a - $$0.d, $$0.a - this.d), 0.0);
        double $$2 = Math.max(Math.max(this.b - $$0.e, $$0.b - this.e), 0.0);
        double $$3 = Math.max(Math.max(this.c - $$0.f, $$0.c - this.f), 0.0);
        return bgj.f($$1, $$2, $$3);
    }

    public String toString() {
        return "AABB[" + this.a + ", " + this.b + ", " + this.c + "] -> [" + this.d + ", " + this.e + ", " + this.f + "]";
    }

    public boolean e() {
        return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
    }

    public ftm f() {
        return new ftm(bgj.d(0.5, this.a, this.d), bgj.d(0.5, this.b, this.e), bgj.d(0.5, this.c, this.f));
    }

    public ftm g() {
        return new ftm(bgj.d(0.5, this.a, this.d), this.b, bgj.d(0.5, this.c, this.f));
    }

    public ftm h() {
        return new ftm(this.a, this.b, this.c);
    }

    public ftm i() {
        return new ftm(this.d, this.e, this.f);
    }

    public static fth a(ftm $$0, double $$1, double $$2, double $$3) {
        return new fth($$0.g - $$1 / 2.0, $$0.h - $$2 / 2.0, $$0.i - $$3 / 2.0, $$0.g + $$1 / 2.0, $$0.h + $$2 / 2.0, $$0.i + $$3 / 2.0);
    }

    public static class a {
        private float a = Float.POSITIVE_INFINITY;
        private float b = Float.POSITIVE_INFINITY;
        private float c = Float.POSITIVE_INFINITY;
        private float d = Float.NEGATIVE_INFINITY;
        private float e = Float.NEGATIVE_INFINITY;
        private float f = Float.NEGATIVE_INFINITY;

        public void a(Vector3fc $$0) {
            this.a = Math.min(this.a, $$0.x());
            this.b = Math.min(this.b, $$0.y());
            this.c = Math.min(this.c, $$0.z());
            this.d = Math.max(this.d, $$0.x());
            this.e = Math.max(this.e, $$0.y());
            this.f = Math.max(this.f, $$0.z());
        }

        public fth a() {
            return new fth(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}

