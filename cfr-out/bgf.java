/*
 * Decompiled with CFR 0.152.
 */
public class bgf {
    private static final long a = 6364136223846793005L;
    private static final long b = 1442695040888963407L;

    public static long a(long $$0, long $$1) {
        $$0 *= $$0 * 6364136223846793005L + 1442695040888963407L;
        return $$0 += $$1;
    }
}

