/*
 * Decompiled with CFR 0.152.
 */
public final class awt
extends Enum<awt> {
    public static final /* enum */ awt a = new awt();
    public static final /* enum */ awt b = new awt();
    public static final /* enum */ awt c = new awt();
    public static final /* enum */ awt d = new awt();
    private static final /* synthetic */ awt[] e;

    public static awt[] values() {
        return (awt[])e.clone();
    }

    public static awt valueOf(String $$0) {
        return Enum.valueOf(awt.class, $$0);
    }

    public boolean a(awt $$0) {
        return this.ordinal() >= $$0.ordinal();
    }

    private static /* synthetic */ awt[] a() {
        return new awt[]{a, b, c, d};
    }

    static {
        e = awt.a();
    }
}

