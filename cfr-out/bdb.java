/*
 * Decompiled with CFR 0.152.
 */
public final class bdb
extends Enum<bdb> {
    public static final /* enum */ bdb a = new bdb("master");
    public static final /* enum */ bdb b = new bdb("music");
    public static final /* enum */ bdb c = new bdb("record");
    public static final /* enum */ bdb d = new bdb("weather");
    public static final /* enum */ bdb e = new bdb("block");
    public static final /* enum */ bdb f = new bdb("hostile");
    public static final /* enum */ bdb g = new bdb("neutral");
    public static final /* enum */ bdb h = new bdb("player");
    public static final /* enum */ bdb i = new bdb("ambient");
    public static final /* enum */ bdb j = new bdb("voice");
    public static final /* enum */ bdb k = new bdb("ui");
    private final String l;
    private static final /* synthetic */ bdb[] m;

    public static bdb[] values() {
        return (bdb[])m.clone();
    }

    public static bdb valueOf(String $$0) {
        return Enum.valueOf(bdb.class, $$0);
    }

    private bdb(String $$0) {
        this.l = $$0;
    }

    public String a() {
        return this.l;
    }

    private static /* synthetic */ bdb[] b() {
        return new bdb[]{a, b, c, d, e, f, g, h, i, j, k};
    }

    static {
        m = bdb.b();
    }
}

