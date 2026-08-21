/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class awh {
    private static final int c = 33;
    private static final int d = 32;
    private static final int e = 31;
    private static final erm f = eri.a.a(erj.n);
    public static final int a = f.c().c();
    public static final int b = 33 + a;

    public static @Nullable erj a(int $$0) {
        return awh.a($$0 - 33, null);
    }

    @Contract(value="_,!null->!null;_,_->_")
    public static @Nullable erj a(int $$0, @Nullable erj $$1) {
        if ($$0 > a) {
            return $$1;
        }
        if ($$0 <= 0) {
            return erj.n;
        }
        return f.c().a($$0);
    }

    public static erj b(int $$0) {
        return awh.a($$0, erj.c);
    }

    public static int a(erj $$0) {
        return 33 + f.a($$0);
    }

    public static awt c(int $$0) {
        if ($$0 <= 31) {
            return awt.d;
        }
        if ($$0 <= 32) {
            return awt.c;
        }
        if ($$0 <= 33) {
            return awt.b;
        }
        return awt.a;
    }

    public static int a(awt $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case awt.a -> b;
            case awt.b -> 33;
            case awt.c -> 32;
            case awt.d -> 31;
        };
    }

    public static boolean d(int $$0) {
        return $$0 <= 31;
    }

    public static boolean e(int $$0) {
        return $$0 <= 32;
    }

    public static boolean f(int $$0) {
        return $$0 <= b;
    }
}

