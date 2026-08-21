/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class fzv
extends Enum<fzv> {
    public static final /* enum */ fzv a = new fzv();
    public static final /* enum */ fzv b = new fzv();
    public static final /* enum */ fzv c = new fzv();
    public static final /* enum */ fzv d = new fzv();
    private static final int e = 1024;
    private static final /* synthetic */ fzv[] f;

    public static fzv[] values() {
        return (fzv[])f.clone();
    }

    public static fzv valueOf(String $$0) {
        return Enum.valueOf(fzv.class, $$0);
    }

    public static fzv a(long $$0) {
        if ($$0 < 1024L) {
            return a;
        }
        try {
            int $$1 = (int)(Math.log($$0) / Math.log(1024.0));
            String $$2 = String.valueOf("KMGTPE".charAt($$1 - 1));
            return fzv.valueOf($$2 + "B");
        }
        catch (Exception $$3) {
            return d;
        }
    }

    public static double a(long $$0, fzv $$1) {
        if ($$1 == a) {
            return $$0;
        }
        return (double)$$0 / Math.pow(1024.0, $$1.ordinal());
    }

    public static String b(long $$0) {
        int $$1 = 1024;
        if ($$0 < 1024L) {
            return $$0 + " B";
        }
        int $$2 = (int)(Math.log($$0) / Math.log(1024.0));
        String $$3 = "" + "KMGTPE".charAt($$2 - 1);
        return String.format(Locale.ROOT, "%.1f %sB", (double)$$0 / Math.pow(1024.0, $$2), $$3);
    }

    public static String b(long $$0, fzv $$1) {
        return String.format(Locale.ROOT, "%." + ($$1 == d ? "1" : "0") + "f %s", fzv.a($$0, $$1), $$1.name());
    }

    private static /* synthetic */ fzv[] a() {
        return new fzv[]{a, b, c, d};
    }

    static {
        f = fzv.a();
    }
}

