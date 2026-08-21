/*
 * Decompiled with CFR 0.152.
 */
public class grq {
    private static final String[] a = new String[]{"O o o", "o O o", "o o O", "o O o"};
    private static final long b = 300L;

    public static String a(long $$0) {
        int $$1 = (int)($$0 / 300L % (long)a.length);
        return a[$$1];
    }
}

