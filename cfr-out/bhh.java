/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Keyable
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public interface bhh {
    public static final int af = 16;

    public String c();

    public static <E extends Enum<E>> a<E> a(Supplier<E[]> $$02) {
        return bhh.a($$02, (String $$0) -> $$0);
    }

    public static <E extends Enum<E>> a<E> a(Supplier<E[]> $$0, Function<String, String> $$12) {
        Enum[] $$2 = (Enum[])$$0.get();
        Function<String, Enum> $$3 = bhh.a($$2, (T $$1) -> (String)$$12.apply(((bhh)((Object)$$1)).c()));
        return new a($$2, $$3);
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    public static <T extends bhh> Codec<T> b(Supplier<T[]> $$0) {
        bhh[] $$1 = (bhh[])$$0.get();
        @Nullable Function $$2 = bhh.a((bhh[])$$1);
        ToIntFunction<bhh> $$3 = bhs.f(Arrays.asList($$1));
        return new b($$1, $$2, $$3);
    }

    public static <T extends bhh> Function<String, @Nullable T> a(T[] $$0) {
        return bhh.a($$0, bhh::c);
    }

    public static <T> Function<String, @Nullable T> a(T[] $$02, Function<T, String> $$1) {
        if ($$02.length > 16) {
            Map<String, Object> $$22 = Arrays.stream($$02).collect(Collectors.toMap($$1, $$0 -> $$0));
            return $$22::get;
        }
        return $$2 -> {
            for (Object $$3 : $$02) {
                if (!((String)$$1.apply($$3)).equals($$2)) continue;
                return $$3;
            }
            return null;
        };
    }

    public static Keyable b(final bhh[] $$0) {
        return new Keyable(){

            public <T> Stream<T> keys(DynamicOps<T> $$02) {
                return Arrays.stream($$0).map(bhh::c).map(arg_0 -> $$02.createString(arg_0));
            }
        };
    }

    public static class a<E extends Enum<E>>
    extends b<E> {
        private final Function<String, @Nullable E> a;

        public a(E[] $$02, Function<String, E> $$1) {
            super($$02, $$1, $$0 -> ((Enum)$$0).ordinal());
            this.a = $$1;
        }

        public @Nullable E a(String $$0) {
            return (E)((Enum)this.a.apply($$0));
        }

        public E a(String $$0, E $$1) {
            return (E)((Enum)Objects.requireNonNullElse(this.a($$0), $$1));
        }

        public E a(String $$0, Supplier<? extends E> $$1) {
            return (E)((Enum)Objects.requireNonNullElseGet(this.a($$0), $$1));
        }
    }

    public static class b<S extends bhh>
    implements Codec<S> {
        private final Codec<S> a;

        public b(S[] $$0, Function<String, @Nullable S> $$12, ToIntFunction<S> $$2) {
            this.a = bfm.a(Codec.stringResolver(bhh::c, $$12), bfm.a($$2, $$1 -> $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : null, -1));
        }

        public <T> DataResult<Pair<S, T>> decode(DynamicOps<T> $$0, T $$1) {
            return this.a.decode($$0, $$1);
        }

        public <T> DataResult<T> a(S $$0, DynamicOps<T> $$1, T $$2) {
            return this.a.encode($$0, $$1, $$2);
        }

        public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
            return this.a((bhh)object, dynamicOps, object2);
        }
    }
}

