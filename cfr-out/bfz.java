/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public final class bfz<T extends Comparable<T>>
extends Record {
    private final T b;
    private final T c;
    public static final Codec<bfz<Integer>> a = bfz.a(Codec.INT);

    public bfz(T $$0, T $$1) {
        if ($$0.compareTo($$1) > 0) {
            throw new IllegalArgumentException("min_inclusive must be less than or equal to max_inclusive");
        }
        this.b = $$0;
        this.c = $$1;
    }

    public bfz(T $$0) {
        this($$0, $$0);
    }

    public static <T extends Comparable<T>> Codec<bfz<T>> a(Codec<T> $$0) {
        return bfm.a($$0, "min_inclusive", "max_inclusive", bfz::a, bfz::a, bfz::b);
    }

    public static <T extends Comparable<T>> Codec<bfz<T>> a(Codec<T> $$0, T $$1, T $$22) {
        return bfz.a($$0).validate($$2 -> {
            if ($$2.a().compareTo($$1) < 0) {
                return DataResult.error(() -> "Range limit too low, expected at least " + String.valueOf($$1) + " [" + String.valueOf($$2.a()) + "-" + String.valueOf($$2.b()) + "]");
            }
            if ($$2.b().compareTo($$22) > 0) {
                return DataResult.error(() -> "Range limit too high, expected at most " + String.valueOf($$22) + " [" + String.valueOf($$2.a()) + "-" + String.valueOf($$2.b()) + "]");
            }
            return DataResult.success((Object)$$2);
        });
    }

    public static <T extends Comparable<T>> DataResult<bfz<T>> a(T $$0, T $$1) {
        if ($$0.compareTo($$1) <= 0) {
            return DataResult.success(new bfz<T>($$0, $$1));
        }
        return DataResult.error(() -> "min_inclusive must be less than or equal to max_inclusive");
    }

    public <S extends Comparable<S>> bfz<S> a(Function<? super T, ? extends S> $$0) {
        return new bfz<Comparable>((Comparable)$$0.apply(this.b), (Comparable)$$0.apply(this.c));
    }

    public boolean a(T $$0) {
        return $$0.compareTo(this.b) >= 0 && $$0.compareTo(this.c) <= 0;
    }

    public boolean a(bfz<T> $$0) {
        return $$0.a().compareTo(this.b) >= 0 && $$0.c.compareTo(this.c) <= 0;
    }

    @Override
    public String toString() {
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(this.c) + "]";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bfz.class, "minInclusive;maxInclusive", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bfz.class, "minInclusive;maxInclusive", "b", "c"}, this, $$0);
    }

    public T a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }
}

