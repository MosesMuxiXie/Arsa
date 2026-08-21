/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.math.Fraction
 *  org.apache.commons.lang3.math.NumberUtils
 *  org.joml.Math
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 */
import java.util.Locale;
import java.util.UUID;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.NumberUtils;
import org.joml.Math;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class bgj {
    private static final long k = 61440L;
    private static final long l = 16384L;
    private static final long m = -4611686018427387904L;
    private static final long n = Long.MIN_VALUE;
    public static final float a = (float)java.lang.Math.PI;
    public static final float b = 1.5707964f;
    public static final float c = (float)java.lang.Math.PI * 2;
    public static final float d = (float)java.lang.Math.PI / 180;
    public static final float e = 57.295776f;
    public static final float f = 1.0E-5f;
    public static final float g = bgj.a(2.0f);
    public static final Vector3f h = new Vector3f(0.0f, 1.0f, 0.0f);
    public static final Vector3f i = new Vector3f(1.0f, 0.0f, 0.0f);
    public static final Vector3f j = new Vector3f(0.0f, 0.0f, 1.0f);
    private static final int o = 65536;
    private static final int p = 65535;
    private static final int q = 16384;
    private static final double r = 10430.378350470453;
    private static final float[] s = bhs.a(new float[65536], $$0 -> {
        for (int $$1 = 0; $$1 < ((float[])$$0).length; ++$$1) {
            $$0[$$1] = (float)java.lang.Math.sin((double)$$1 / 10430.378350470453);
        }
    });
    private static final bgr t = bgr.b();
    private static final int[] u = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
    private static final double v = 0.16666666666666666;
    private static final int w = 8;
    private static final int x = 257;
    private static final double y = Double.longBitsToDouble(4805340802404319232L);
    private static final double[] z = new double[257];
    private static final double[] A = new double[257];

    public static float a(double $$0) {
        return s[(int)((long)($$0 * 10430.378350470453) & 0xFFFFL)];
    }

    public static float b(double $$0) {
        return s[(int)((long)($$0 * 10430.378350470453 + 16384.0) & 0xFFFFL)];
    }

    public static float a(float $$0) {
        return (float)java.lang.Math.sqrt($$0);
    }

    public static int b(float $$0) {
        int $$1 = (int)$$0;
        return $$0 < (float)$$1 ? $$1 - 1 : $$1;
    }

    public static int c(double $$0) {
        int $$1 = (int)$$0;
        return $$0 < (double)$$1 ? $$1 - 1 : $$1;
    }

    public static long d(double $$0) {
        long $$1 = (long)$$0;
        return $$0 < (double)$$1 ? $$1 - 1L : $$1;
    }

    public static float c(float $$0) {
        return java.lang.Math.abs($$0);
    }

    public static int a(int $$0) {
        return java.lang.Math.abs($$0);
    }

    public static int d(float $$0) {
        int $$1 = (int)$$0;
        return $$0 > (float)$$1 ? $$1 + 1 : $$1;
    }

    public static int e(double $$0) {
        int $$1 = (int)$$0;
        return $$0 > (double)$$1 ? $$1 + 1 : $$1;
    }

    public static long f(double $$0) {
        long $$1 = (long)$$0;
        return $$0 > (double)$$1 ? $$1 + 1L : $$1;
    }

    public static int a(int $$0, int $$1, int $$2) {
        return java.lang.Math.min(java.lang.Math.max($$0, $$1), $$2);
    }

    public static long a(long $$0, long $$1, long $$2) {
        return java.lang.Math.min(java.lang.Math.max($$0, $$1), $$2);
    }

    public static float a(float $$0, float $$1, float $$2) {
        if ($$0 < $$1) {
            return $$1;
        }
        return java.lang.Math.min($$0, $$2);
    }

    public static double a(double $$0, double $$1, double $$2) {
        if ($$0 < $$1) {
            return $$1;
        }
        return java.lang.Math.min($$0, $$2);
    }

    public static double b(double $$0, double $$1, double $$2) {
        if ($$0 < 0.0) {
            return $$1;
        }
        if ($$0 > 1.0) {
            return $$2;
        }
        return bgj.d($$0, $$1, $$2);
    }

    public static float b(float $$0, float $$1, float $$2) {
        if ($$0 < 0.0f) {
            return $$1;
        }
        if ($$0 > 1.0f) {
            return $$2;
        }
        return bgj.h($$0, $$1, $$2);
    }

    public static int a(int $$0, int $$1) {
        return java.lang.Math.max(java.lang.Math.abs($$0), java.lang.Math.abs($$1));
    }

    public static float a(float $$0, float $$1) {
        return java.lang.Math.max(java.lang.Math.abs($$0), java.lang.Math.abs($$1));
    }

    public static double a(double $$0, double $$1) {
        return java.lang.Math.max(java.lang.Math.abs($$0), java.lang.Math.abs($$1));
    }

    public static int a(int $$0, int $$1, int $$2, int $$3) {
        return bgj.a($$2 - $$0, $$3 - $$1);
    }

    public static int b(int $$0, int $$1) {
        return java.lang.Math.floorDiv($$0, $$1);
    }

    public static int a(bgr $$0, int $$1, int $$2) {
        if ($$1 >= $$2) {
            return $$1;
        }
        return $$0.a($$2 - $$1 + 1) + $$1;
    }

    public static float a(bgr $$0, float $$1, float $$2) {
        if ($$1 >= $$2) {
            return $$1;
        }
        return $$0.i() * ($$2 - $$1) + $$1;
    }

    public static double a(bgr $$0, double $$1, double $$2) {
        if ($$1 >= $$2) {
            return $$1;
        }
        return $$0.j() * ($$2 - $$1) + $$1;
    }

    public static boolean b(float $$0, float $$1) {
        return java.lang.Math.abs($$1 - $$0) < 1.0E-5f;
    }

    public static boolean b(double $$0, double $$1) {
        return java.lang.Math.abs($$1 - $$0) < (double)1.0E-5f;
    }

    public static int c(int $$0, int $$1) {
        return java.lang.Math.floorMod($$0, $$1);
    }

    public static float c(float $$0, float $$1) {
        return ($$0 % $$1 + $$1) % $$1;
    }

    public static double c(double $$0, double $$1) {
        return ($$0 % $$1 + $$1) % $$1;
    }

    public static boolean d(int $$0, int $$1) {
        return $$0 % $$1 == 0;
    }

    public static byte e(float $$0) {
        return (byte)bgj.b($$0 * 256.0f / 360.0f);
    }

    public static float a(byte $$0) {
        return (float)($$0 * 360) / 256.0f;
    }

    public static int b(int $$0) {
        int $$1 = $$0 % 360;
        if ($$1 >= 180) {
            $$1 -= 360;
        }
        if ($$1 < -180) {
            $$1 += 360;
        }
        return $$1;
    }

    public static float a(long $$0) {
        float $$1 = $$0 % 360L;
        if ($$1 >= 180.0f) {
            $$1 -= 360.0f;
        }
        if ($$1 < -180.0f) {
            $$1 += 360.0f;
        }
        return $$1;
    }

    public static float f(float $$0) {
        float $$1 = $$0 % 360.0f;
        if ($$1 >= 180.0f) {
            $$1 -= 360.0f;
        }
        if ($$1 < -180.0f) {
            $$1 += 360.0f;
        }
        return $$1;
    }

    public static double g(double $$0) {
        double $$1 = $$0 % 360.0;
        if ($$1 >= 180.0) {
            $$1 -= 360.0;
        }
        if ($$1 < -180.0) {
            $$1 += 360.0;
        }
        return $$1;
    }

    public static float d(float $$0, float $$1) {
        return bgj.f($$1 - $$0);
    }

    public static float e(float $$0, float $$1) {
        return bgj.c(bgj.d($$0, $$1));
    }

    public static float c(float $$0, float $$1, float $$2) {
        float $$3 = bgj.d($$0, $$1);
        float $$4 = bgj.a($$3, -$$2, $$2);
        return $$1 - $$4;
    }

    public static float d(float $$0, float $$1, float $$2) {
        $$2 = bgj.c($$2);
        if ($$0 < $$1) {
            return bgj.a($$0 + $$2, $$0, $$1);
        }
        return bgj.a($$0 - $$2, $$1, $$0);
    }

    public static float e(float $$0, float $$1, float $$2) {
        float $$3 = bgj.d($$0, $$1);
        return bgj.d($$0, $$0 + $$3, $$2);
    }

    public static int a(String $$0, int $$1) {
        return NumberUtils.toInt((String)$$0, (int)$$1);
    }

    public static int c(int $$0) {
        int $$1 = $$0 - 1;
        $$1 |= $$1 >> 1;
        $$1 |= $$1 >> 2;
        $$1 |= $$1 >> 4;
        $$1 |= $$1 >> 8;
        $$1 |= $$1 >> 16;
        return $$1 + 1;
    }

    public static int d(int $$0) {
        if ($$0 < 0) {
            throw new IllegalArgumentException("itemCount must be greater than or equal to zero");
        }
        return bgj.e(java.lang.Math.sqrt($$0));
    }

    public static boolean e(int $$0) {
        return $$0 != 0 && ($$0 & $$0 - 1) == 0;
    }

    public static int f(int $$0) {
        $$0 = bgj.e($$0) ? $$0 : bgj.c($$0);
        return u[(int)((long)$$0 * 125613361L >> 27) & 0x1F];
    }

    public static int g(int $$0) {
        return bgj.f($$0) - (bgj.e($$0) ? 0 : 1);
    }

    public static float g(float $$0) {
        return $$0 - (float)bgj.b($$0);
    }

    public static double h(double $$0) {
        return $$0 - (double)bgj.d($$0);
    }

    @Deprecated
    public static long a(jy $$0) {
        return bgj.b($$0.u(), $$0.v(), $$0.w());
    }

    @Deprecated
    public static long b(int $$0, int $$1, int $$2) {
        long $$3 = (long)($$0 * 3129871) ^ (long)$$2 * 116129781L ^ (long)$$1;
        $$3 = $$3 * $$3 * 42317861L + $$3 * 11L;
        return $$3 >> 16;
    }

    public static UUID a(bgr $$0) {
        long $$1 = $$0.g() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long $$2 = $$0.g() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID($$1, $$2);
    }

    public static UUID a() {
        return bgj.a(t);
    }

    public static double c(double $$0, double $$1, double $$2) {
        return ($$0 - $$1) / ($$2 - $$1);
    }

    public static float f(float $$0, float $$1, float $$2) {
        return ($$0 - $$1) / ($$2 - $$1);
    }

    public static boolean a(ftm $$0, ftm $$1, fth $$2) {
        double $$3 = ($$2.a + $$2.d) * 0.5;
        double $$4 = ($$2.d - $$2.a) * 0.5;
        double $$5 = $$0.g - $$3;
        if (java.lang.Math.abs($$5) > $$4 && $$5 * $$1.g >= 0.0) {
            return false;
        }
        double $$6 = ($$2.b + $$2.e) * 0.5;
        double $$7 = ($$2.e - $$2.b) * 0.5;
        double $$8 = $$0.h - $$6;
        if (java.lang.Math.abs($$8) > $$7 && $$8 * $$1.h >= 0.0) {
            return false;
        }
        double $$9 = ($$2.c + $$2.f) * 0.5;
        double $$10 = ($$2.f - $$2.c) * 0.5;
        double $$11 = $$0.i - $$9;
        if (java.lang.Math.abs($$11) > $$10 && $$11 * $$1.i >= 0.0) {
            return false;
        }
        double $$12 = java.lang.Math.abs($$1.g);
        double $$13 = java.lang.Math.abs($$1.h);
        double $$14 = java.lang.Math.abs($$1.i);
        double $$15 = $$1.h * $$11 - $$1.i * $$8;
        if (java.lang.Math.abs($$15) > $$7 * $$14 + $$10 * $$13) {
            return false;
        }
        $$15 = $$1.i * $$5 - $$1.g * $$11;
        if (java.lang.Math.abs($$15) > $$4 * $$14 + $$10 * $$12) {
            return false;
        }
        $$15 = $$1.g * $$8 - $$1.h * $$5;
        return java.lang.Math.abs($$15) < $$4 * $$13 + $$7 * $$12;
    }

    public static double d(double $$0, double $$1) {
        boolean $$5;
        boolean $$4;
        boolean $$3;
        double $$2 = $$1 * $$1 + $$0 * $$0;
        if (Double.isNaN($$2)) {
            return Double.NaN;
        }
        boolean bl2 = $$3 = $$0 < 0.0;
        if ($$3) {
            $$0 = -$$0;
        }
        boolean bl3 = $$4 = $$1 < 0.0;
        if ($$4) {
            $$1 = -$$1;
        }
        boolean bl4 = $$5 = $$0 > $$1;
        if ($$5) {
            double $$6 = $$1;
            $$1 = $$0;
            $$0 = $$6;
        }
        double $$7 = bgj.j($$2);
        $$1 *= $$7;
        double $$8 = y + ($$0 *= $$7);
        int $$9 = (int)Double.doubleToRawLongBits($$8);
        double $$10 = z[$$9];
        double $$11 = A[$$9];
        double $$12 = $$8 - y;
        double $$13 = $$0 * $$11 - $$1 * $$12;
        double $$14 = (6.0 + $$13 * $$13) * $$13 * 0.16666666666666666;
        double $$15 = $$10 + $$14;
        if ($$5) {
            $$15 = 1.5707963267948966 - $$15;
        }
        if ($$4) {
            $$15 = java.lang.Math.PI - $$15;
        }
        if ($$3) {
            $$15 = -$$15;
        }
        return $$15;
    }

    public static float h(float $$0) {
        return Math.invsqrt((float)$$0);
    }

    public static double i(double $$0) {
        return Math.invsqrt((double)$$0);
    }

    @Deprecated
    public static double j(double $$0) {
        double $$1 = 0.5 * $$0;
        long $$2 = Double.doubleToRawLongBits($$0);
        $$2 = 6910469410427058090L - ($$2 >> 1);
        $$0 = Double.longBitsToDouble($$2);
        $$0 *= 1.5 - $$1 * $$0 * $$0;
        return $$0;
    }

    public static float i(float $$0) {
        int $$1 = Float.floatToIntBits($$0);
        $$1 = 1419967116 - $$1 / 3;
        float $$2 = Float.intBitsToFloat($$1);
        $$2 = 0.6666667f * $$2 + 1.0f / (3.0f * $$2 * $$2 * $$0);
        $$2 = 0.6666667f * $$2 + 1.0f / (3.0f * $$2 * $$2 * $$0);
        return $$2;
    }

    public static int g(float $$0, float $$1, float $$2) {
        return bgj.a($$0, $$1, $$2, 0);
    }

    /*
     * WARNING - void declaration
     */
    public static int a(float $$0, float $$1, float $$2, int $$3) {
        void $$29;
        void $$28;
        void $$27;
        int $$4 = (int)($$0 * 6.0f) % 6;
        float $$5 = $$0 * 6.0f - (float)$$4;
        float $$6 = $$2 * (1.0f - $$1);
        float $$7 = $$2 * (1.0f - $$5 * $$1);
        float $$8 = $$2 * (1.0f - (1.0f - $$5) * $$1);
        switch ($$4) {
            case 0: {
                float $$9 = $$2;
                float $$10 = $$8;
                float $$11 = $$6;
                break;
            }
            case 1: {
                float $$12 = $$7;
                float $$13 = $$2;
                float $$14 = $$6;
                break;
            }
            case 2: {
                float $$15 = $$6;
                float $$16 = $$2;
                float $$17 = $$8;
                break;
            }
            case 3: {
                float $$18 = $$6;
                float $$19 = $$7;
                float $$20 = $$2;
                break;
            }
            case 4: {
                float $$21 = $$8;
                float $$22 = $$6;
                float $$23 = $$2;
                break;
            }
            case 5: {
                float $$24 = $$2;
                float $$25 = $$6;
                float $$26 = $$7;
                break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + $$0 + ", " + $$1 + ", " + $$2);
            }
        }
        return bel.b($$3, bgj.a((int)($$27 * 255.0f), 0, 255), bgj.a((int)($$28 * 255.0f), 0, 255), bgj.a((int)($$29 * 255.0f), 0, 255));
    }

    public static int h(int $$0) {
        $$0 ^= $$0 >>> 16;
        $$0 *= -2048144789;
        $$0 ^= $$0 >>> 13;
        $$0 *= -1028477387;
        $$0 ^= $$0 >>> 16;
        return $$0;
    }

    public static int a(int $$0, int $$1, IntPredicate $$2) {
        int $$3 = $$1 - $$0;
        while ($$3 > 0) {
            int $$4 = $$3 / 2;
            int $$5 = $$0 + $$4;
            if ($$2.test($$5)) {
                $$3 = $$4;
                continue;
            }
            $$0 = $$5 + 1;
            $$3 -= $$4 + 1;
        }
        return $$0;
    }

    public static int a(float $$0, int $$1, int $$2) {
        return $$1 + bgj.b($$0 * (float)($$2 - $$1));
    }

    public static int b(float $$0, int $$1, int $$2) {
        int $$3 = $$2 - $$1;
        return $$1 + bgj.b($$0 * (float)($$3 - 1)) + ($$0 > 0.0f ? 1 : 0);
    }

    public static float h(float $$0, float $$1, float $$2) {
        return $$1 + $$0 * ($$2 - $$1);
    }

    public static ftm a(double $$0, ftm $$1, ftm $$2) {
        return new ftm(bgj.d($$0, $$1.g, $$2.g), bgj.d($$0, $$1.h, $$2.h), bgj.d($$0, $$1.i, $$2.i));
    }

    public static double d(double $$0, double $$1, double $$2) {
        return $$1 + $$0 * ($$2 - $$1);
    }

    public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        return bgj.d($$1, bgj.d($$0, $$2, $$3), bgj.d($$0, $$4, $$5));
    }

    public static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8, double $$9, double $$10) {
        return bgj.d($$2, bgj.a($$0, $$1, $$3, $$4, $$5, $$6), bgj.a($$0, $$1, $$7, $$8, $$9, $$10));
    }

    public static float a(float $$0, float $$1, float $$2, float $$3, float $$4) {
        return 0.5f * (2.0f * $$2 + ($$3 - $$1) * $$0 + (2.0f * $$1 - 5.0f * $$2 + 4.0f * $$3 - $$4) * $$0 * $$0 + (3.0f * $$2 - $$1 - 3.0f * $$3 + $$4) * $$0 * $$0 * $$0);
    }

    public static double k(double $$0) {
        return $$0 * $$0 * $$0 * ($$0 * ($$0 * 6.0 - 15.0) + 10.0);
    }

    public static double l(double $$0) {
        return 30.0 * $$0 * $$0 * ($$0 - 1.0) * ($$0 - 1.0);
    }

    public static int m(double $$0) {
        if ($$0 == 0.0) {
            return 0;
        }
        return $$0 > 0.0 ? 1 : -1;
    }

    public static float i(float $$0, float $$1, float $$2) {
        return $$1 + $$0 * bgj.f($$2 - $$1);
    }

    public static double e(double $$0, double $$1, double $$2) {
        return $$1 + $$0 * bgj.g($$2 - $$1);
    }

    public static float j(float $$0, float $$1, float $$2) {
        float $$3;
        for ($$3 = $$2 - $$1; $$3 < (float)(-java.lang.Math.PI); $$3 += (float)java.lang.Math.PI * 2) {
        }
        while ($$3 >= (float)java.lang.Math.PI) {
            $$3 -= (float)java.lang.Math.PI * 2;
        }
        return $$1 + $$0 * $$3;
    }

    public static float f(float $$0, float $$1) {
        return (java.lang.Math.abs($$0 % $$1 - $$1 * 0.5f) - $$1 * 0.25f) / ($$1 * 0.25f);
    }

    public static float j(float $$0) {
        return $$0 * $$0;
    }

    public static float k(float $$0) {
        return $$0 * $$0 * $$0;
    }

    public static double n(double $$0) {
        return $$0 * $$0;
    }

    public static int i(int $$0) {
        return $$0 * $$0;
    }

    public static long b(long $$0) {
        return $$0 * $$0;
    }

    public static double a(double $$0, double $$1, double $$2, double $$3, double $$4) {
        return bgj.b(bgj.c($$0, $$1, $$2), $$3, $$4);
    }

    public static float b(float $$0, float $$1, float $$2, float $$3, float $$4) {
        return bgj.b(bgj.f($$0, $$1, $$2), $$3, $$4);
    }

    public static double b(double $$0, double $$1, double $$2, double $$3, double $$4) {
        return bgj.d(bgj.c($$0, $$1, $$2), $$3, $$4);
    }

    public static float c(float $$0, float $$1, float $$2, float $$3, float $$4) {
        return bgj.h(bgj.f($$0, $$1, $$2), $$3, $$4);
    }

    public static double o(double $$0) {
        return $$0 + (2.0 * bgr.a(bgj.c($$0 * 3000.0)).j() - 1.0) * 1.0E-7 / 2.0;
    }

    public static int e(int $$0, int $$1) {
        return bgj.f($$0, $$1) * $$1;
    }

    public static int f(int $$0, int $$1) {
        return -java.lang.Math.floorDiv(-$$0, $$1);
    }

    public static int b(bgr $$0, int $$1, int $$2) {
        return $$0.a($$2 - $$1 + 1) + $$1;
    }

    public static float b(bgr $$0, float $$1, float $$2) {
        return $$0.i() * ($$2 - $$1) + $$1;
    }

    public static float c(bgr $$0, float $$1, float $$2) {
        return $$1 + (float)$$0.k() * $$2;
    }

    public static double e(double $$0, double $$1) {
        return $$0 * $$0 + $$1 * $$1;
    }

    public static double f(double $$0, double $$1) {
        return java.lang.Math.sqrt(bgj.e($$0, $$1));
    }

    public static float g(float $$0, float $$1) {
        return (float)java.lang.Math.sqrt(bgj.e((double)$$0, (double)$$1));
    }

    public static double f(double $$0, double $$1, double $$2) {
        return $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
    }

    public static double g(double $$0, double $$1, double $$2) {
        return java.lang.Math.sqrt(bgj.f($$0, $$1, $$2));
    }

    public static float k(float $$0, float $$1, float $$2) {
        return $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
    }

    public static int a(double $$0, int $$1) {
        return bgj.c($$0 / (double)$$1) * $$1;
    }

    public static IntStream c(int $$0, int $$1, int $$2) {
        return bgj.b($$0, $$1, $$2, 1);
    }

    public static IntStream b(int $$0, int $$1, int $$2, int $$32) {
        if ($$1 > $$2) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "upperBound %d expected to be > lowerBound %d", $$2, $$1));
        }
        if ($$32 < 1) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "step size expected to be >= 1, was %d", $$32));
        }
        int $$42 = bgj.a($$0, $$1, $$2);
        return IntStream.iterate($$42, $$3 -> {
            int $$4 = java.lang.Math.abs($$42 - $$3);
            return $$42 - $$4 >= $$1 || $$42 + $$4 <= $$2;
        }, $$4 -> {
            int $$8;
            boolean $$7;
            boolean $$5 = $$4 <= $$42;
            int $$6 = java.lang.Math.abs($$42 - $$4);
            boolean bl2 = $$7 = $$42 + $$6 + $$32 <= $$2;
            if (!($$5 && $$7 || ($$8 = $$42 - $$6 - ($$5 ? $$32 : 0)) < $$1)) {
                return $$8;
            }
            return $$42 + $$6 + $$32;
        });
    }

    public static Quaternionf a(Vector3f $$0, Quaternionf $$1, Quaternionf $$2) {
        float $$3 = $$0.dot($$1.x, $$1.y, $$1.z);
        return $$2.set($$0.x * $$3, $$0.y * $$3, $$0.z * $$3, $$1.w).normalize();
    }

    public static int a(Fraction $$0, int $$1) {
        return $$0.getNumerator() * $$1 / $$0.getDenominator();
    }

    static {
        for (int $$02 = 0; $$02 < 257; ++$$02) {
            double $$1 = (double)$$02 / 256.0;
            double $$2 = java.lang.Math.asin($$1);
            bgj.A[$$02] = java.lang.Math.cos($$2);
            bgj.z[$$02] = $$2;
        }
    }
}

