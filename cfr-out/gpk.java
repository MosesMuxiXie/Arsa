/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntComparator
 */
import it.unimi.dsi.fastutil.ints.IntComparator;

public final class gpk
extends Enum<gpk> {
    public static final /* enum */ gpk a = new gpk();
    public static final /* enum */ gpk b = new gpk();
    public static final /* enum */ gpk c = new gpk();
    public static final /* enum */ gpk d = new gpk();
    private final IntComparator e = ($$0, $$1) -> $$0 == $$1 ? 0 : (this.b($$0, $$1) ? -1 : 1);
    private static final /* synthetic */ gpk[] f;

    public static gpk[] values() {
        return (gpk[])f.clone();
    }

    public static gpk valueOf(String $$0) {
        return Enum.valueOf(gpk.class, $$0);
    }

    public gpj a() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> gpj.b;
            case 2, 3 -> gpj.a;
        };
    }

    public gpk b() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> b;
            case 1 -> a;
            case 2 -> d;
            case 3 -> c;
        };
    }

    public boolean c() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 2 -> false;
            case 1, 3 -> true;
        };
    }

    public boolean a(int $$0, int $$1) {
        if (this.c()) {
            return $$0 > $$1;
        }
        return $$1 > $$0;
    }

    public boolean b(int $$0, int $$1) {
        if (this.c()) {
            return $$0 < $$1;
        }
        return $$1 < $$0;
    }

    public IntComparator d() {
        return this.e;
    }

    private static /* synthetic */ gpk[] e() {
        return new gpk[]{a, b, c, d};
    }

    static {
        f = gpk.e();
    }
}

