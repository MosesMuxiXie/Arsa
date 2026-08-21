/*
 * Decompiled with CFR 0.152.
 */
public final class gpj
extends Enum<gpj> {
    public static final /* enum */ gpj a = new gpj();
    public static final /* enum */ gpj b = new gpj();
    private static final /* synthetic */ gpj[] c;

    public static gpj[] values() {
        return (gpj[])c.clone();
    }

    public static gpj valueOf(String $$0) {
        return Enum.valueOf(gpj.class, $$0);
    }

    public gpj a() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> b;
            case 1 -> a;
        };
    }

    public gpk b() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> gpk.d;
            case 1 -> gpk.b;
        };
    }

    public gpk c() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> gpk.c;
            case 1 -> gpk.a;
        };
    }

    public gpk a(boolean $$0) {
        return $$0 ? this.b() : this.c();
    }

    private static /* synthetic */ gpj[] d() {
        return new gpj[]{a, b};
    }

    static {
        c = gpj.d();
    }
}

