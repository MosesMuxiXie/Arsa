/*
 * Decompiled with CFR 0.152.
 */
public final class caw
extends Enum<caw> {
    public static final /* enum */ caw a = new caw("pathfinding");
    public static final /* enum */ caw b = new caw("event-loops");
    public static final /* enum */ caw c = new caw("consecutive-executors");
    public static final /* enum */ caw d = new caw("ticking");
    public static final /* enum */ caw e = new caw("jvm");
    public static final /* enum */ caw f = new caw("chunk rendering");
    public static final /* enum */ caw g = new caw("chunk rendering dispatching");
    public static final /* enum */ caw h = new caw("cpu");
    public static final /* enum */ caw i = new caw("gpu");
    private final String j;
    private static final /* synthetic */ caw[] k;

    public static caw[] values() {
        return (caw[])k.clone();
    }

    public static caw valueOf(String $$0) {
        return Enum.valueOf(caw.class, $$0);
    }

    private caw(String $$0) {
        this.j = $$0;
    }

    public String a() {
        return this.j;
    }

    private static /* synthetic */ caw[] b() {
        return new caw[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        k = caw.b();
    }
}

