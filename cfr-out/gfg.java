/*
 * Decompiled with CFR 0.152.
 */
public final class gfg
extends Enum<gfg> {
    public static final /* enum */ gfg a = new gfg();
    public static final /* enum */ gfg b = new gfg();
    public static final /* enum */ gfg c = new gfg();
    public static final /* enum */ gfg d = new gfg();
    private static final /* synthetic */ gfg[] e;

    public static gfg[] values() {
        return (gfg[])e.clone();
    }

    public static gfg valueOf(String $$0) {
        return Enum.valueOf(gfg.class, $$0);
    }

    public boolean a() {
        return this == b;
    }

    public boolean b() {
        return this == c || this == d;
    }

    private static /* synthetic */ gfg[] c() {
        return new gfg[]{a, b, c, d};
    }

    static {
        e = gfg.c();
    }
}

