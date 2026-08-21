/*
 * Decompiled with CFR 0.152.
 */
public final class aki
extends Enum<aki> {
    public static final /* enum */ aki a = new aki();
    public static final /* enum */ aki b = new aki();
    public static final /* enum */ aki c = new aki();
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final /* synthetic */ aki[] g;

    public static aki[] values() {
        return (aki[])g.clone();
    }

    public static aki valueOf(String $$0) {
        return Enum.valueOf(aki.class, $$0);
    }

    public static aki a(int $$0) {
        return switch ($$0) {
            case 1 -> a;
            case 2 -> b;
            case 3 -> c;
            default -> throw new IllegalArgumentException("Unknown connection intent: " + $$0);
        };
    }

    public int a() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> 1;
            case 1 -> 2;
            case 2 -> 3;
        };
    }

    private static /* synthetic */ aki[] b() {
        return new aki[]{a, b, c};
    }

    static {
        g = aki.b();
    }
}

