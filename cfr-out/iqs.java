/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public final class iqs {
    private static @Nullable ipm a;
    private static @Nullable bdb b;

    public static void a(iqr $$0, bdb $$1, float $$2) {
        iqs.a($$0, $$1);
        if (iqs.a($$0)) {
            bcz $$3;
            switch ($$1) {
                case c: {
                    bcz bcz2 = bda.uz.a();
                    break;
                }
                case d: {
                    bcz bcz2 = bda.qg;
                    break;
                }
                case e: {
                    bcz bcz2 = bda.mX;
                    break;
                }
                case f: {
                    bcz bcz2 = bda.GG;
                    break;
                }
                case g: {
                    bcz bcz2 = bda.hg;
                    break;
                }
                case h: {
                    bcz bcz2 = bda.lR.a();
                    break;
                }
                case i: {
                    bcz bcz2 = bda.h.a();
                    break;
                }
                case k: {
                    bcz bcz2 = bda.DJ.a();
                    break;
                }
                default: {
                    bcz bcz2 = $$3 = bda.tA;
                }
            }
            if ($$3 != bda.tA) {
                a = iph.a($$3, 1.0f, $$2);
                $$0.a(a);
            }
        }
    }

    private static void a(iqr $$0, bdb $$1) {
        if (b != $$1) {
            b = $$1;
            if (a != null) {
                $$0.b(a);
            }
        }
    }

    private static boolean a(iqr $$0) {
        return a == null || !$$0.c(a);
    }
}

