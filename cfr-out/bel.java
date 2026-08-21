/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
import org.joml.Vector3f;
import org.joml.Vector4f;

public class bel {
    private static final int a = 1024;
    private static final short[] b = bhs.a(new short[256], $$0 -> {
        for (int $$1 = 0; $$1 < ((short[])$$0).length; ++$$1) {
            float $$2 = (float)$$1 / 255.0f;
            $$0[$$1] = (short)Math.round(bel.e($$2) * 1023.0f);
        }
    });
    private static final byte[] c = bhs.a(new byte[1024], $$0 -> {
        for (int $$1 = 0; $$1 < ((byte[])$$0).length; ++$$1) {
            float $$2 = (float)$$1 / 1023.0f;
            $$0[$$1] = (byte)Math.round(bel.f($$2) * 255.0f);
        }
    });

    private static float e(float $$0) {
        if ($$0 >= 0.04045f) {
            return (float)Math.pow(((double)$$0 + 0.055) / 1.055, 2.4);
        }
        return $$0 / 12.92f;
    }

    private static float f(float $$0) {
        if ($$0 >= 0.0031308f) {
            return (float)(1.055 * Math.pow($$0, 0.4166666666666667) - 0.055);
        }
        return 12.92f * $$0;
    }

    public static float a(int $$0) {
        return (float)b[$$0] / 1023.0f;
    }

    public static int a(float $$0) {
        return c[bgj.b($$0 * 1023.0f)] & 0xFF;
    }

    public static int a(int $$0, int $$1, int $$2, int $$3) {
        return bel.b((bel.b($$0) + bel.b($$1) + bel.b($$2) + bel.b($$3)) / 4, bel.c(bel.c($$0), bel.c($$1), bel.c($$2), bel.c($$3)), bel.c(bel.d($$0), bel.d($$1), bel.d($$2), bel.d($$3)), bel.c(bel.e($$0), bel.e($$1), bel.e($$2), bel.e($$3)));
    }

    private static int c(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = (b[$$0] + b[$$1] + b[$$2] + b[$$3]) / 4;
        return c[$$4] & 0xFF;
    }

    public static int b(int $$0) {
        return $$0 >>> 24;
    }

    public static int c(int $$0) {
        return $$0 >> 16 & 0xFF;
    }

    public static int d(int $$0) {
        return $$0 >> 8 & 0xFF;
    }

    public static int e(int $$0) {
        return $$0 & 0xFF;
    }

    public static int b(int $$0, int $$1, int $$2, int $$3) {
        return ($$0 & 0xFF) << 24 | ($$1 & 0xFF) << 16 | ($$2 & 0xFF) << 8 | $$3 & 0xFF;
    }

    public static int a(int $$0, int $$1, int $$2) {
        return bel.b(255, $$0, $$1, $$2);
    }

    public static int a(ftm $$0) {
        return bel.a(bel.d((float)$$0.a()), bel.d((float)$$0.b()), bel.d((float)$$0.c()));
    }

    public static int a(int $$0, int $$1) {
        if ($$0 == -1) {
            return $$1;
        }
        if ($$1 == -1) {
            return $$0;
        }
        return bel.b(bel.b($$0) * bel.b($$1) / 255, bel.c($$0) * bel.c($$1) / 255, bel.d($$0) * bel.d($$1) / 255, bel.e($$0) * bel.e($$1) / 255);
    }

    public static int b(int $$0, int $$1) {
        return bel.b(bel.b($$0), Math.min(bel.c($$0) + bel.c($$1), 255), Math.min(bel.d($$0) + bel.d($$1), 255), Math.min(bel.e($$0) + bel.e($$1), 255));
    }

    public static int c(int $$0, int $$1) {
        return bel.b(bel.b($$0), Math.max(bel.c($$0) - bel.c($$1), 0), Math.max(bel.d($$0) - bel.d($$1), 0), Math.max(bel.e($$0) - bel.e($$1), 0));
    }

    public static int a(int $$0, float $$1) {
        if ($$0 == 0 || $$1 <= 0.0f) {
            return 0;
        }
        if ($$1 >= 1.0f) {
            return $$0;
        }
        return bel.a(bel.m($$0) * $$1, $$0);
    }

    public static int b(int $$0, float $$1) {
        return bel.a($$0, $$1, $$1, $$1);
    }

    public static int a(int $$0, float $$1, float $$2, float $$3) {
        return bel.b(bel.b($$0), Math.clamp((long)((int)((float)bel.c($$0) * $$1)), 0, 255), Math.clamp((long)((int)((float)bel.d($$0) * $$2)), 0, 255), Math.clamp((long)((int)((float)bel.e($$0) * $$3)), 0, 255));
    }

    public static int d(int $$0, int $$1) {
        return bel.b(bel.b($$0), Math.clamp((long)bel.c($$0) * (long)$$1 / 255L, 0, 255), Math.clamp((long)bel.d($$0) * (long)$$1 / 255L, 0, 255), Math.clamp((long)bel.e($$0) * (long)$$1 / 255L, 0, 255));
    }

    public static int f(int $$0) {
        int $$1 = (int)((float)bel.c($$0) * 0.3f + (float)bel.d($$0) * 0.59f + (float)bel.e($$0) * 0.11f);
        return bel.b(bel.b($$0), $$1, $$1, $$1);
    }

    public static int e(int $$0, int $$1) {
        int $$2 = bel.b($$0);
        int $$3 = bel.b($$1);
        if ($$3 == 255) {
            return $$1;
        }
        if ($$3 == 0) {
            return $$0;
        }
        int $$4 = $$3 + $$2 * (255 - $$3) / 255;
        return bel.b($$4, bel.d($$4, $$3, bel.c($$0), bel.c($$1)), bel.d($$4, $$3, bel.d($$0), bel.d($$1)), bel.d($$4, $$3, bel.e($$0), bel.e($$1)));
    }

    private static int d(int $$0, int $$1, int $$2, int $$3) {
        return ($$3 * $$1 + $$2 * ($$0 - $$1)) / $$0;
    }

    public static int a(float $$0, int $$1, int $$2) {
        int $$3 = bgj.a($$0, bel.b($$1), bel.b($$2));
        int $$4 = bgj.a($$0, bel.c($$1), bel.c($$2));
        int $$5 = bgj.a($$0, bel.d($$1), bel.d($$2));
        int $$6 = bgj.a($$0, bel.e($$1), bel.e($$2));
        return bel.b($$3, $$4, $$5, $$6);
    }

    public static int b(float $$0, int $$1, int $$2) {
        return bel.b(bgj.a($$0, bel.b($$1), bel.b($$2)), c[bgj.a($$0, (int)b[bel.c($$1)], (int)b[bel.c($$2)])] & 0xFF, c[bgj.a($$0, (int)b[bel.d($$1)], (int)b[bel.d($$2)])] & 0xFF, c[bgj.a($$0, (int)b[bel.e($$1)], (int)b[bel.e($$2)])] & 0xFF);
    }

    public static int g(int $$0) {
        return $$0 | 0xFF000000;
    }

    public static int h(int $$0) {
        return $$0 & 0xFFFFFF;
    }

    public static int f(int $$0, int $$1) {
        return $$0 << 24 | $$1 & 0xFFFFFF;
    }

    public static int a(float $$0, int $$1) {
        return bel.d($$0) << 24 | $$1 & 0xFFFFFF;
    }

    public static int b(float $$0) {
        return bel.d($$0) << 24 | 0xFFFFFF;
    }

    public static int i(int $$0) {
        return $$0 << 24 | 0xFFFFFF;
    }

    public static int c(float $$0) {
        return bel.d($$0) << 24;
    }

    public static int j(int $$0) {
        return $$0 << 24;
    }

    public static int a(float $$0, float $$1, float $$2, float $$3) {
        return bel.b(bel.d($$0), bel.d($$1), bel.d($$2), bel.d($$3));
    }

    public static Vector3f k(int $$0) {
        return new Vector3f(bel.n($$0), bel.o($$0), bel.p($$0));
    }

    public static Vector4f l(int $$0) {
        return new Vector4f(bel.n($$0), bel.o($$0), bel.p($$0), bel.m($$0));
    }

    public static int g(int $$0, int $$1) {
        return bel.b((bel.b($$0) + bel.b($$1)) / 2, (bel.c($$0) + bel.c($$1)) / 2, (bel.d($$0) + bel.d($$1)) / 2, (bel.e($$0) + bel.e($$1)) / 2);
    }

    public static int d(float $$0) {
        return bgj.b($$0 * 255.0f);
    }

    public static float m(int $$0) {
        return bel.s(bel.b($$0));
    }

    public static float n(int $$0) {
        return bel.s(bel.c($$0));
    }

    public static float o(int $$0) {
        return bel.s(bel.d($$0));
    }

    public static float p(int $$0) {
        return bel.s(bel.e($$0));
    }

    private static float s(int $$0) {
        return (float)$$0 / 255.0f;
    }

    public static int q(int $$0) {
        return $$0 & 0xFF00FF00 | ($$0 & 0xFF0000) >> 16 | ($$0 & 0xFF) << 16;
    }

    public static int r(int $$0) {
        return bel.q($$0);
    }

    public static int c(int $$0, float $$1) {
        float $$17;
        float $$10;
        int $$2 = bel.c($$0);
        int $$3 = bel.d($$0);
        int $$4 = bel.e($$0);
        int $$5 = bel.b($$0);
        int $$6 = Math.max(Math.max($$2, $$3), $$4);
        int $$7 = Math.min(Math.min($$2, $$3), $$4);
        float $$8 = $$6 - $$7;
        if ($$6 != 0) {
            float $$9 = $$8 / (float)$$6;
        } else {
            $$10 = 0.0f;
        }
        if ($$10 == 0.0f) {
            float $$11 = 0.0f;
        } else {
            float $$12 = (float)($$6 - $$2) / $$8;
            float $$13 = (float)($$6 - $$3) / $$8;
            float $$14 = (float)($$6 - $$4) / $$8;
            if ($$2 == $$6) {
                float $$15 = $$14 - $$13;
            } else if ($$3 == $$6) {
                float $$16 = 2.0f + $$12 - $$14;
            } else {
                $$17 = 4.0f + $$13 - $$12;
            }
            $$17 /= 6.0f;
            if ($$17 < 0.0f) {
                $$17 += 1.0f;
            }
        }
        if ($$10 == 0.0f) {
            $$3 = $$4 = Math.round($$1 * 255.0f);
            $$2 = $$4;
            return bel.b($$5, $$2, $$3, $$4);
        }
        void $$18 = ($$17 - (float)Math.floor($$17)) * 6.0f;
        void $$19 = $$18 - (float)Math.floor((double)$$18);
        float $$20 = $$1 * (1.0f - $$10);
        float $$21 = $$1 * (1.0f - $$10 * $$19);
        float $$22 = $$1 * (1.0f - $$10 * (1.0f - $$19));
        switch ((int)$$18) {
            case 0: {
                $$2 = Math.round($$1 * 255.0f);
                $$3 = Math.round($$22 * 255.0f);
                $$4 = Math.round($$20 * 255.0f);
                break;
            }
            case 1: {
                $$2 = Math.round($$21 * 255.0f);
                $$3 = Math.round($$1 * 255.0f);
                $$4 = Math.round($$20 * 255.0f);
                break;
            }
            case 2: {
                $$2 = Math.round($$20 * 255.0f);
                $$3 = Math.round($$1 * 255.0f);
                $$4 = Math.round($$22 * 255.0f);
                break;
            }
            case 3: {
                $$2 = Math.round($$20 * 255.0f);
                $$3 = Math.round($$21 * 255.0f);
                $$4 = Math.round($$1 * 255.0f);
                break;
            }
            case 4: {
                $$2 = Math.round($$22 * 255.0f);
                $$3 = Math.round($$20 * 255.0f);
                $$4 = Math.round($$1 * 255.0f);
                break;
            }
            case 5: {
                $$2 = Math.round($$1 * 255.0f);
                $$3 = Math.round($$20 * 255.0f);
                $$4 = Math.round($$21 * 255.0f);
            }
        }
        return bel.b($$5, $$2, $$3, $$4);
    }
}

