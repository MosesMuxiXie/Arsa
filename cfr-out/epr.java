/*
 * Decompiled with CFR 0.152.
 */
public final class epr
extends Enum<epr>
implements bhh {
    public static final /* enum */ epr a = new epr("straight");
    public static final /* enum */ epr b = new epr("inner_left");
    public static final /* enum */ epr c = new epr("inner_right");
    public static final /* enum */ epr d = new epr("outer_left");
    public static final /* enum */ epr e = new epr("outer_right");
    private final String f;
    private static final /* synthetic */ epr[] g;

    public static epr[] values() {
        return (epr[])g.clone();
    }

    public static epr valueOf(String $$0) {
        return Enum.valueOf(epr.class, $$0);
    }

    private epr(String $$0) {
        this.f = $$0;
    }

    public String toString() {
        return this.f;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ epr[] a() {
        return new epr[]{a, b, c, d, e};
    }

    static {
        g = epr.a();
    }
}

