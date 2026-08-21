/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  com.google.common.math.DoubleMath
 *  com.google.common.math.IntMath
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final class fud {
    public static final double a = 1.0E-7;
    public static final double b = 1.0E-6;
    private static final fug d = bhs.a(() -> {
        ftp $$0 = new ftp(1, 1, 1);
        ((ftv)$$0).c(0, 0, 0);
        return new ftt($$0);
    });
    private static final ftm e = new ftm(0.5, 0.5, 0.5);
    public static final fug c = fud.a(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    private static final fug f = new fto((ftv)new ftp(0, 0, 0), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}), (DoubleList)new DoubleArrayList(new double[]{0.0}));

    public static fug a() {
        return f;
    }

    public static fug b() {
        return d;
    }

    public static fug a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        if ($$0 > $$3 || $$1 > $$4 || $$2 > $$5) {
            throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
        }
        return fud.b($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public static fug b(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        if ($$3 - $$0 < 1.0E-7 || $$4 - $$1 < 1.0E-7 || $$5 - $$2 < 1.0E-7) {
            return fud.a();
        }
        int $$6 = fud.a($$0, $$3);
        int $$7 = fud.a($$1, $$4);
        int $$8 = fud.a($$2, $$5);
        if ($$6 < 0 || $$7 < 0 || $$8 < 0) {
            return new fto(fud.d.a, (DoubleList)DoubleArrayList.wrap((double[])new double[]{$$0, $$3}), (DoubleList)DoubleArrayList.wrap((double[])new double[]{$$1, $$4}), (DoubleList)DoubleArrayList.wrap((double[])new double[]{$$2, $$5}));
        }
        if ($$6 == 0 && $$7 == 0 && $$8 == 0) {
            return fud.b();
        }
        int $$9 = 1 << $$6;
        int $$10 = 1 << $$7;
        int $$11 = 1 << $$8;
        ftp $$12 = ftp.a($$9, $$10, $$11, (int)Math.round($$0 * (double)$$9), (int)Math.round($$1 * (double)$$10), (int)Math.round($$2 * (double)$$11), (int)Math.round($$3 * (double)$$9), (int)Math.round($$4 * (double)$$10), (int)Math.round($$5 * (double)$$11));
        return new ftt($$12);
    }

    public static fug a(fth $$0) {
        return fud.b($$0.a, $$0.b, $$0.c, $$0.d, $$0.e, $$0.f);
    }

    @VisibleForTesting
    protected static int a(double $$0, double $$1) {
        if ($$0 < -1.0E-7 || $$1 > 1.0000001) {
            return -1;
        }
        for (int $$2 = 0; $$2 <= 3; ++$$2) {
            boolean $$7;
            int $$3 = 1 << $$2;
            double $$4 = $$0 * (double)$$3;
            double $$5 = $$1 * (double)$$3;
            boolean $$6 = Math.abs($$4 - (double)Math.round($$4)) < 1.0E-7 * (double)$$3;
            boolean bl2 = $$7 = Math.abs($$5 - (double)Math.round($$5)) < 1.0E-7 * (double)$$3;
            if (!$$6 || !$$7) continue;
            return $$2;
        }
        return -1;
    }

    protected static long a(int $$0, int $$1) {
        return (long)$$0 * (long)($$1 / IntMath.gcd((int)$$0, (int)$$1));
    }

    public static fug a(fug $$0, fug $$1) {
        return fud.a($$0, $$1, ftq.o);
    }

    public static fug a(fug $$0, fug ... $$1) {
        return Arrays.stream($$1).reduce($$0, fud::a);
    }

    public static fug a(fug $$0, fug $$1, ftq $$2) {
        return fud.b($$0, $$1, $$2).d();
    }

    public static fug b(fug $$0, fug $$1, ftq $$2) {
        if ($$2.apply(false, false)) {
            throw bhs.b(new IllegalArgumentException());
        }
        if ($$0 == $$1) {
            return $$2.apply(true, true) ? $$0 : fud.a();
        }
        boolean $$3 = $$2.apply(true, false);
        boolean $$4 = $$2.apply(false, true);
        if ($$0.c()) {
            return $$4 ? $$1 : fud.a();
        }
        if ($$1.c()) {
            return $$3 ? $$0 : fud.a();
        }
        fty $$5 = fud.a(1, $$0.a(iz.a.a), $$1.a(iz.a.a), $$3, $$4);
        fty $$6 = fud.a($$5.size() - 1, $$0.a(iz.a.b), $$1.a(iz.a.b), $$3, $$4);
        fty $$7 = fud.a(($$5.size() - 1) * ($$6.size() - 1), $$0.a(iz.a.c), $$1.a(iz.a.c), $$3, $$4);
        ftp $$8 = ftp.a($$0.a, $$1.a, $$5, $$6, $$7, $$2);
        if ($$5 instanceof ftu && $$6 instanceof ftu && $$7 instanceof ftu) {
            return new ftt($$8);
        }
        return new fto((ftv)$$8, $$5.a(), $$6.a(), $$7.a());
    }

    public static boolean c(fug $$0, fug $$1, ftq $$2) {
        if ($$2.apply(false, false)) {
            throw bhs.b(new IllegalArgumentException());
        }
        boolean $$3 = $$0.c();
        boolean $$4 = $$1.c();
        if ($$3 || $$4) {
            return $$2.apply(!$$3, !$$4);
        }
        if ($$0 == $$1) {
            return $$2.apply(true, true);
        }
        boolean $$5 = $$2.apply(true, false);
        boolean $$6 = $$2.apply(false, true);
        for (iz.a $$7 : ip.d) {
            if ($$0.c($$7) < $$1.b($$7) - 1.0E-7) {
                return $$5 || $$6;
            }
            if (!($$1.c($$7) < $$0.b($$7) - 1.0E-7)) continue;
            return $$5 || $$6;
        }
        fty $$8 = fud.a(1, $$0.a(iz.a.a), $$1.a(iz.a.a), $$5, $$6);
        fty $$9 = fud.a($$8.size() - 1, $$0.a(iz.a.b), $$1.a(iz.a.b), $$5, $$6);
        fty $$10 = fud.a(($$8.size() - 1) * ($$9.size() - 1), $$0.a(iz.a.c), $$1.a(iz.a.c), $$5, $$6);
        return fud.a($$8, $$9, $$10, $$0.a, $$1.a, $$2);
    }

    private static boolean a(fty $$0, fty $$1, fty $$2, ftv $$3, ftv $$4, ftq $$52) {
        return !$$0.a(($$5, $$62, $$7) -> $$1.a(($$6, $$72, $$82) -> $$2.a(($$7, $$8, $$9) -> !$$52.apply($$3.e($$5, $$6, $$7), $$4.e($$62, $$72, $$8)))));
    }

    public static double a(iz.a $$0, fth $$1, Iterable<fug> $$2, double $$3) {
        for (fug $$4 : $$2) {
            if (Math.abs($$3) < 1.0E-7) {
                return 0.0;
            }
            $$3 = $$4.a($$0, $$1, $$3);
        }
        return $$3;
    }

    public static boolean a(fug $$0, fug $$1, iz $$2) {
        if ($$0 == fud.b() && $$1 == fud.b()) {
            return true;
        }
        if ($$1.c()) {
            return false;
        }
        iz.a $$3 = $$2.o();
        iz.b $$4 = $$2.f();
        fug $$5 = $$4 == iz.b.a ? $$0 : $$1;
        fug $$6 = $$4 == iz.b.a ? $$1 : $$0;
        ftq $$7 = $$4 == iz.b.a ? ftq.e : ftq.c;
        return DoubleMath.fuzzyEquals((double)$$5.c($$3), (double)1.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)$$6.b($$3), (double)0.0, (double)1.0E-7) && !fud.c((fug)new fue($$5, $$3, $$5.a.c($$3) - 1), new fue($$6, $$3, 0), $$7);
    }

    public static boolean b(fug $$0, fug $$1, iz $$2) {
        fug $$6;
        if ($$0 == fud.b() || $$1 == fud.b()) {
            return true;
        }
        iz.a $$3 = $$2.o();
        iz.b $$4 = $$2.f();
        fug $$5 = $$4 == iz.b.a ? $$0 : $$1;
        fug fug2 = $$6 = $$4 == iz.b.a ? $$1 : $$0;
        if (!DoubleMath.fuzzyEquals((double)$$5.c($$3), (double)1.0, (double)1.0E-7)) {
            $$5 = fud.a();
        }
        if (!DoubleMath.fuzzyEquals((double)$$6.b($$3), (double)0.0, (double)1.0E-7)) {
            $$6 = fud.a();
        }
        return !fud.c(fud.b(), fud.b((fug)new fue($$5, $$3, $$5.a.c($$3) - 1), (fug)new fue($$6, $$3, 0), ftq.o), ftq.e);
    }

    public static boolean b(fug $$0, fug $$1) {
        if ($$0 == fud.b() || $$1 == fud.b()) {
            return true;
        }
        if ($$0.c() && $$1.c()) {
            return false;
        }
        return !fud.c(fud.b(), fud.b($$0, $$1, ftq.o), ftq.e);
    }

    @VisibleForTesting
    protected static fty a(int $$0, DoubleList $$1, DoubleList $$2, boolean $$3, boolean $$4) {
        long $$7;
        int $$5 = $$1.size() - 1;
        int $$6 = $$2.size() - 1;
        if ($$1 instanceof fts && $$2 instanceof fts && (long)$$0 * ($$7 = fud.a($$5, $$6)) <= 256L) {
            return new ftu($$5, $$6);
        }
        if ($$1.getDouble($$5) < $$2.getDouble(0) - 1.0E-7) {
            return new fub($$1, $$2, false);
        }
        if ($$2.getDouble($$6) < $$1.getDouble(0) - 1.0E-7) {
            return new fub($$2, $$1, true);
        }
        if ($$5 == $$6 && Objects.equals($$1, $$2)) {
            return new ftx($$1);
        }
        return new ftz($$1, $$2, $$3, $$4);
    }

    public static fug a(fug $$0, f $$1) {
        return fud.a($$0, $$1, e);
    }

    public static fug a(fug $$0, f $$1, ftm $$2) {
        if ($$1 == f.a) {
            return $$0;
        }
        ftv $$3 = $$0.a.a($$1);
        if ($$0 instanceof ftt && e.equals($$2)) {
            return new ftt($$3);
        }
        iz.a $$4 = $$1.d().a(iz.a.a);
        iz.a $$5 = $$1.d().a(iz.a.b);
        iz.a $$6 = $$1.d().a(iz.a.c);
        DoubleList $$7 = $$0.a($$4);
        DoubleList $$8 = $$0.a($$5);
        DoubleList $$9 = $$0.a($$6);
        boolean $$10 = $$1.a(iz.a.a);
        boolean $$11 = $$1.a(iz.a.b);
        boolean $$12 = $$1.a(iz.a.c);
        return new fto($$3, fud.a($$7, $$10, $$2.a($$4), $$2.g), fud.a($$8, $$11, $$2.a($$5), $$2.h), fud.a($$9, $$12, $$2.a($$6), $$2.i));
    }

    @VisibleForTesting
    static DoubleList a(DoubleList $$0, boolean $$1, double $$2, double $$3) {
        if (!$$1 && $$2 == $$3) {
            return $$0;
        }
        int $$4 = $$0.size();
        DoubleArrayList $$5 = new DoubleArrayList($$4);
        if ($$1) {
            for (int $$6 = $$4 - 1; $$6 >= 0; --$$6) {
                $$5.add(-($$0.getDouble($$6) - $$2) + $$3);
            }
        } else {
            for (int $$7 = 0; $$7 >= 0 && $$7 < $$4; ++$$7) {
                $$5.add($$0.getDouble($$7) - $$2 + $$3);
            }
        }
        return $$5;
    }

    public static boolean c(fug $$0, fug $$1) {
        return !fud.c($$0, $$1, ftq.g);
    }

    public static Map<iz.a, fug> a(fug $$0) {
        return fud.a($$0, e);
    }

    public static Map<iz.a, fug> a(fug $$0, ftm $$1) {
        return Maps.newEnumMap(Map.of(iz.a.c, $$0, iz.a.a, fud.a($$0, f.ab, $$1)));
    }

    public static Map<iz.a, fug> b(fug $$0) {
        return fud.b($$0, e);
    }

    public static Map<iz.a, fug> b(fug $$0, ftm $$1) {
        return Maps.newEnumMap(Map.of(iz.a.c, $$0, iz.a.a, fud.a($$0, f.ab, $$1), iz.a.b, fud.a($$0, f.Y, $$1)));
    }

    public static Map<iz, fug> c(fug $$0) {
        return fud.b($$0, f.a, e);
    }

    public static Map<iz, fug> b(fug $$0, f $$1) {
        return fud.b($$0, $$1, e);
    }

    public static Map<iz, fug> b(fug $$0, f $$1, ftm $$2) {
        return Maps.newEnumMap(Map.of(iz.c, fud.a($$0, $$1), iz.f, fud.a($$0, f.ab.a($$1), $$2), iz.d, fud.a($$0, f.aa.a($$1), $$2), iz.e, fud.a($$0, f.Z.a($$1), $$2)));
    }

    public static Map<iz, fug> d(fug $$0) {
        return fud.c($$0, f.a, e);
    }

    public static Map<iz, fug> c(fug $$0, ftm $$1) {
        return fud.c($$0, f.a, $$1);
    }

    public static Map<iz, fug> c(fug $$0, f $$1, ftm $$2) {
        return Maps.newEnumMap(Map.of(iz.c, fud.a($$0, $$1), iz.f, fud.a($$0, f.ab.a($$1), $$2), iz.d, fud.a($$0, f.aa.a($$1), $$2), iz.e, fud.a($$0, f.Z.a($$1), $$2), iz.b, fud.a($$0, f.W.a($$1), $$2), iz.a, fud.a($$0, f.Y.a($$1), $$2)));
    }

    public static Map<eos, Map<iz, fug>> e(fug $$0) {
        return fud.c($$0, f.a);
    }

    public static Map<eos, Map<iz, fug>> c(fug $$0, f $$1) {
        return Map.of(eos.b, fud.b($$0, $$1), eos.a, fud.b($$0, f.W.a($$1)), eos.c, fud.b($$0, f.aa.a(f.Y).a($$1)));
    }

    public static interface a {
        public void consume(double var1, double var3, double var5, double var7, double var9, double var11);
    }
}

