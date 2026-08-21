/*
 * Decompiled with CFR 0.152.
 */
public final class epz
extends Enum<epz> {
    public static final /* enum */ epz a = new epz(4259712);
    public static final /* enum */ epz b = new epz(0xFF3030);
    public static final /* enum */ epz c = new epz(2138367);
    private final int d;
    private static final /* synthetic */ epz[] e;

    public static epz[] values() {
        return (epz[])e.clone();
    }

    public static epz valueOf(String $$0) {
        return Enum.valueOf(epz.class, $$0);
    }

    private epz(int $$0) {
        this.d = $$0;
    }

    public int a() {
        return this.d;
    }

    private static /* synthetic */ epz[] b() {
        return new epz[]{a, b, c};
    }

    static {
        e = epz.b();
    }
}

