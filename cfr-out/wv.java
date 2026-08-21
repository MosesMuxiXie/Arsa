/*
 * Decompiled with CFR 0.152.
 */
public final class wv
extends Enum<wv> {
    public static final /* enum */ wv a = new wv("handshake");
    public static final /* enum */ wv b = new wv("play");
    public static final /* enum */ wv c = new wv("status");
    public static final /* enum */ wv d = new wv("login");
    public static final /* enum */ wv e = new wv("configuration");
    private final String f;
    private static final /* synthetic */ wv[] g;

    public static wv[] values() {
        return (wv[])g.clone();
    }

    public static wv valueOf(String $$0) {
        return Enum.valueOf(wv.class, $$0);
    }

    private wv(String $$0) {
        this.f = $$0;
    }

    public String a() {
        return this.f;
    }

    private static /* synthetic */ wv[] b() {
        return new wv[]{a, b, c, d, e};
    }

    static {
        g = wv.b();
    }
}

