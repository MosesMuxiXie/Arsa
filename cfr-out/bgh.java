/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class bgh {
    private static byte @Nullable [] a;

    public static void a() {
        a = new byte[0xA00000];
    }

    public static void b() {
        if (a != null) {
            a = null;
            try {
                System.gc();
                System.gc();
                System.gc();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }
}

