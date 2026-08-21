/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public interface ax<T, P extends Predicate<T>>
extends Predicate<Iterable<T>> {
    public List<P> a();

    public static <T, P extends Predicate<T>> Codec<ax<T, P>> a(Codec<P> $$0) {
        return $$0.listOf().xmap(ax::a, ax::a);
    }

    @SafeVarargs
    public static <T, P extends Predicate<T>> ax<T, P> a(P ... $$0) {
        return ax.a(List.of($$0));
    }

    public static <T, P extends Predicate<T>> ax<T, P> a(List<P> $$0) {
        return switch ($$0.size()) {
            case 0 -> new c();
            case 1 -> new b((Predicate)$$0.getFirst());
            default -> new a($$0);
        };
    }

    public static class c<T, P extends Predicate<T>>
    implements ax<T, P> {
        public boolean a(Iterable<T> $$0) {
            return true;
        }

        @Override
        public List<P> a() {
            return List.of();
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((Iterable)object);
        }
    }

    public record b<T, P extends Predicate<T>>(P a) implements ax<T, P>
    {
        private final P a;

        public boolean a(Iterable<T> $$0) {
            for (T $$1 : $$0) {
                if (!this.a.test($$1)) continue;
                return true;
            }
            return false;
        }

        @Override
        public List<P> a() {
            return List.of(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "test", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "test", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "test", "a"}, this, $$0);
        }

        public P b() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((Iterable)object);
        }
    }

    public record a<T, P extends Predicate<T>>(List<P> a) implements ax<T, P>
    {
        public boolean a(Iterable<T> $$0) {
            ArrayList<P> $$12 = new ArrayList<P>(this.a);
            for (Object $$2 : $$0) {
                $$12.removeIf($$1 -> $$1.test($$2));
                if (!$$12.isEmpty()) continue;
                return true;
            }
            return false;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "tests", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "tests", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "tests", "a"}, this, $$0);
        }

        public List<P> b() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((Iterable)object);
        }
    }
}

