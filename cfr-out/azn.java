/*
 * Decompiled with CFR 0.152.
 */
public final class azn
extends Enum<azn> {
    public static final /* enum */ azn a = new azn("assets");
    public static final /* enum */ azn b = new azn("data");
    private final String c;
    private static final /* synthetic */ azn[] d;

    public static azn[] values() {
        return (azn[])d.clone();
    }

    public static azn valueOf(String $$0) {
        return Enum.valueOf(azn.class, $$0);
    }

    private azn(String $$0) {
        this.c = $$0;
    }

    public String a() {
        return this.c;
    }

    private static /* synthetic */ azn[] b() {
        return new azn[]{a, b};
    }

    static {
        d = azn.b();
    }
}

