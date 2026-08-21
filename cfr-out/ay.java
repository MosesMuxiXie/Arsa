/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Predicate;

public interface ay<T, P extends Predicate<T>>
extends Predicate<Iterable<T>> {
    public List<a<T, P>> a();

    public static <T, P extends Predicate<T>> Codec<ay<T, P>> a(Codec<P> $$0) {
        return a.a($$0).listOf().xmap(ay::a, ay::a);
    }

    @SafeVarargs
    public static <T, P extends Predicate<T>> ay<T, P> a(a<T, P> ... $$0) {
        return ay.a(List.of($$0));
    }

    public static <T, P extends Predicate<T>> ay<T, P> a(List<a<T, P>> $$0) {
        return switch ($$0.size()) {
            case 0 -> new d();
            case 1 -> new c<T, P>($$0.getFirst());
            default -> new b<T, P>($$0);
        };
    }

    public record a<T, P extends Predicate<T>>(P a, cq.d b) {
        public static <T, P extends Predicate<T>> Codec<a<T, P>> a(Codec<P> $$0) {
            return RecordCodecBuilder.create($$1 -> $$1.group((App)$$0.fieldOf("test").forGetter(a::a), (App)cq.d.d.fieldOf("count").forGetter(a::b)).apply((Applicative)$$1, a::new));
        }

        public boolean a(Iterable<T> $$0) {
            int $$1 = 0;
            for (T $$2 : $$0) {
                if (!this.a.test($$2)) continue;
                ++$$1;
            }
            return this.b.d($$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "test;count", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "test;count", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "test;count", "a", "b"}, this, $$0);
        }
    }

    public static class d<T, P extends Predicate<T>>
    implements ay<T, P> {
        public boolean a(Iterable<T> $$0) {
            return true;
        }

        @Override
        public List<a<T, P>> a() {
            return List.of();
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((Iterable)object);
        }
    }

    public record c<T, P extends Predicate<T>>(a<T, P> a) implements ay<T, P>
    {
        private final a<T, P> a;

        public boolean a(Iterable<T> $$0) {
            return this.a.a($$0);
        }

        @Override
        public List<a<T, P>> a() {
            return List.of(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "entry", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "entry", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "entry", "a"}, this, $$0);
        }

        public a<T, P> b() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((Iterable)object);
        }
    }

    public record b<T, P extends Predicate<T>>(List<a<T, P>> a) implements ay<T, P>
    {
        public boolean a(Iterable<T> $$0) {
            for (a<T, P> $$1 : this.a) {
                if ($$1.a($$0)) continue;
                return false;
            }
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "entries", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "entries", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "entries", "a"}, this, $$0);
        }

        public List<a<T, P>> b() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((Iterable)object);
        }
    }
}

