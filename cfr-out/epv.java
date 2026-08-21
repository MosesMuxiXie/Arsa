/*
 * Decompiled with CFR 0.152.
 */
public final class epv
extends Enum<epv>
implements bhh {
    public static final /* enum */ epv a = new epv("none");
    public static final /* enum */ epv b = new epv("low");
    public static final /* enum */ epv c = new epv("tall");
    private final String d;
    private static final /* synthetic */ epv[] e;

    public static epv[] values() {
        return (epv[])e.clone();
    }

    public static epv valueOf(String $$0) {
        return Enum.valueOf(epv.class, $$0);
    }

    private epv(String $$0) {
        this.d = $$0;
    }

    public String toString() {
        return this.c();
    }

    @Override
    public String c() {
        return this.d;
    }

    private static /* synthetic */ epv[] a() {
        return new epv[]{a, b, c};
    }

    static {
        e = epv.a();
    }
}

