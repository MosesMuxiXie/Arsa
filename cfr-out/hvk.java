/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public record hvk<T>(T a, T b, T c, T d) {
    public T a(cgv $$0) {
        return switch ($$0) {
            case cgv.f -> this.a;
            case cgv.e -> this.b;
            case cgv.d -> this.c;
            case cgv.c -> this.d;
            default -> throw new IllegalStateException("No model for slot: " + String.valueOf($$0));
        };
    }

    public <U> hvk<U> a(Function<? super T, ? extends U> $$0) {
        return new hvk<U>($$0.apply(this.a), $$0.apply(this.b), $$0.apply(this.c), $$0.apply(this.d));
    }

    public void a(hvk<hdm> $$0, ImmutableMap.Builder<T, hdm> $$1) {
        $$1.put(this.a, (Object)((hdm)$$0.a));
        $$1.put(this.b, (Object)((hdm)$$0.b));
        $$1.put(this.c, (Object)((hdm)$$0.c));
        $$1.put(this.d, (Object)((hdm)$$0.d));
    }

    public static <M extends gzo<?>> hvk<M> a(hvk<hde> $$0, hdc $$1, Function<hdg, M> $$22) {
        return $$0.a((? super T $$2) -> (gzo)$$22.apply($$1.a((hde)$$2)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hvk.class, "head;chest;legs;feet", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hvk.class, "head;chest;legs;feet", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hvk.class, "head;chest;legs;feet", "a", "b", "c", "d"}, this, $$0);
    }
}

