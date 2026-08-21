/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface dfq<Context, Condition extends b<Context>> {
    public List<a<Context, Condition>> a();

    public static <C, T> Stream<T> a(Stream<T> $$0, Function<T, dfq<C, ?>> $$1, C $$22) {
        ArrayList $$3 = new ArrayList();
        $$0.forEach($$2 -> {
            dfq $$3 = (dfq)$$1.apply($$2);
            for (a $$4 : $$3.a()) {
                $$3.add(new c($$2, $$4.b(), (b)DataFixUtils.orElseGet($$4.a(), b::alwaysTrue)));
            }
        });
        $$3.sort(c.a);
        Iterator $$4 = $$3.iterator();
        int $$5 = Integer.MIN_VALUE;
        while ($$4.hasNext()) {
            c $$6 = (c)$$4.next();
            if ($$6.c < $$5) {
                $$4.remove();
                continue;
            }
            if ($$6.d.test($$22)) {
                $$5 = $$6.c;
                continue;
            }
            $$4.remove();
        }
        return $$3.stream().map(c::a);
    }

    public static <C, T> Optional<T> a(Stream<T> $$0, Function<T, dfq<C, ?>> $$1, bgr $$2, C $$3) {
        List<T> $$4 = dfq.a($$0, $$1, $$3).toList();
        return bhs.b($$4, $$2);
    }

    public static <Context, Condition extends b<Context>> List<a<Context, Condition>> a(Condition $$0, int $$1) {
        return List.of(new a($$0, $$1));
    }

    public static <Context, Condition extends b<Context>> List<a<Context, Condition>> a(int $$0) {
        return List.of(new a(Optional.empty(), $$0));
    }

    public static final class c<C, T>
    extends Record {
        private final T b;
        final int c;
        final b<C> d;
        public static final Comparator<c<?, ?>> a = Comparator.comparingInt(c::b).reversed();

        public c(T $$0, int $$1, b<C> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "entry;priority;condition", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "entry;priority;condition", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "entry;priority;condition", "b", "c", "d"}, this, $$0);
        }

        public T a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public b<C> c() {
            return this.d;
        }
    }

    @FunctionalInterface
    public static interface b<C>
    extends Predicate<C> {
        public static <C> b<C> alwaysTrue() {
            return $$0 -> true;
        }
    }

    public record a<Context, Condition extends b<Context>>(Optional<Condition> a, int b) {
        public a(Condition $$0, int $$1) {
            this(Optional.of($$0), $$1);
        }

        public a(int $$0) {
            this(Optional.empty(), $$0);
        }

        public static <Context, Condition extends b<Context>> Codec<a<Context, Condition>> a(Codec<Condition> $$0) {
            return RecordCodecBuilder.create($$1 -> $$1.group((App)$$0.optionalFieldOf("condition").forGetter(a::a), (App)Codec.INT.fieldOf("priority").forGetter(a::b)).apply((Applicative)$$1, a::new));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "condition;priority", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "condition;priority", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "condition;priority", "a", "b"}, this, $$0);
        }
    }
}

