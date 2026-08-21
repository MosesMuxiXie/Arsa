/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gvm {
    private static final amo f = amo.b("tooltip/background");
    private static final amo g = amo.b("tooltip/frame");
    public static final int a = 12;
    private static final int h = 3;
    public static final int b = 3;
    public static final int c = 3;
    public static final int d = 3;
    public static final int e = 3;
    private static final int i = 9;

    public static void a(gir $$0, int $$1, int $$2, int $$3, int $$4, @Nullable amo $$5) {
        int $$6 = $$1 - 3 - 9;
        int $$7 = $$2 - 3 - 9;
        int $$8 = $$3 + 3 + 3 + 18;
        int $$9 = $$4 + 3 + 3 + 18;
        $$0.a(hpa.at, gvm.a($$5), $$6, $$7, $$8, $$9);
        $$0.a(hpa.at, gvm.b($$5), $$6, $$7, $$8, $$9);
    }

    private static amo a(@Nullable amo $$02) {
        if ($$02 == null) {
            return f;
        }
        return $$02.a($$0 -> "tooltip/" + $$0 + "_background");
    }

    private static amo b(@Nullable amo $$02) {
        if ($$02 == null) {
            return g;
        }
        return $$02.a($$0 -> "tooltip/" + $$0 + "_frame");
    }
}

