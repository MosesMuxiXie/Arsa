/*
 * Decompiled with CFR 0.152.
 */
public final class fyz
extends Enum<fyz> {
    public static final /* enum */ fyz a = new fyz("ubo");
    public static final /* enum */ fyz b = new fyz("utb");
    final String c;
    private static final /* synthetic */ fyz[] d;

    public static fyz[] values() {
        return (fyz[])d.clone();
    }

    public static fyz valueOf(String $$0) {
        return Enum.valueOf(fyz.class, $$0);
    }

    private fyz(String $$0) {
        this.c = $$0;
    }

    private static /* synthetic */ fyz[] a() {
        return new fyz[]{a, b};
    }

    static {
        d = fyz.a();
    }
}

