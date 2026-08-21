/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;

public class cbo {
    private cbo() {
    }

    public static <T> int a(List<T> $$0, ToIntFunction<T> $$1) {
        long $$2 = 0L;
        for (T $$3 : $$0) {
            $$2 += (long)$$1.applyAsInt($$3);
        }
        if ($$2 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Sum of weights must be <= 2147483647");
        }
        return (int)$$2;
    }

    public static <T> Optional<T> a(bgr $$0, List<T> $$1, int $$2, ToIntFunction<T> $$3) {
        if ($$2 < 0) {
            throw bhs.b(new IllegalArgumentException("Negative total weight in getRandomItem"));
        }
        if ($$2 == 0) {
            return Optional.empty();
        }
        int $$4 = $$0.a($$2);
        return cbo.a($$1, $$4, $$3);
    }

    public static <T> Optional<T> a(List<T> $$0, int $$1, ToIntFunction<T> $$2) {
        for (T $$3 : $$0) {
            if (($$1 -= $$2.applyAsInt($$3)) >= 0) continue;
            return Optional.of($$3);
        }
        return Optional.empty();
    }

    public static <T> Optional<T> a(bgr $$0, List<T> $$1, ToIntFunction<T> $$2) {
        return cbo.a($$0, $$1, cbo.a($$1, $$2), $$2);
    }
}

