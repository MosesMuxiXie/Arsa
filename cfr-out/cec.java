/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public final class cec {
    public static final cec a = new cec(Map.of());
    public static final Codec<cec> b = Codec.lazyInitialized(() -> Codec.dispatchedMap(ceg.T, bhs.b(b::a)).xmap(cec::new, $$0 -> $$0.e));
    public static final Codec<cec> c = b.xmap(cec::a, cec::a);
    public static final Codec<cec> d = b.validate($$02 -> {
        List<cea> $$1 = $$02.b().stream().filter($$0 -> !$$0.e()).toList();
        if (!$$1.isEmpty()) {
            return DataResult.error(() -> "The following attributes cannot be positional: " + String.valueOf($$1));
        }
        return DataResult.success((Object)$$02);
    });
    final Map<cea<?>, b<?, ?>> e;

    private static cec a(cec $$0) {
        return new cec(Map.copyOf(Maps.filterKeys($$0.e, cea::d)));
    }

    cec(Map<cea<?>, b<?, ?>> $$0) {
        this.e = $$0;
    }

    public static a a() {
        return new a();
    }

    public <Value> @Nullable b<Value, ?> a(cea<Value> $$0) {
        return this.e.get($$0);
    }

    public <Value> Value a(cea<Value> $$0, Value $$1) {
        b<Value, ?> $$2 = this.a($$0);
        return $$2 != null ? $$2.a($$1) : $$1;
    }

    public boolean b(cea<?> $$0) {
        return this.e.containsKey($$0);
    }

    public Set<cea<?>> b() {
        return this.e.keySet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if (!($$0 instanceof cec)) return false;
        cec $$1 = (cec)$$0;
        if (!this.e.equals($$1.e)) return false;
        return true;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return this.e.toString();
    }

    public static class a {
        private final Map<cea<?>, b<?, ?>> a = new HashMap();

        a() {
        }

        public a a(cec $$0) {
            this.a.putAll($$0.e);
            return this;
        }

        public <Value, Parameter> a a(cea<Value> $$0, cel<Value, Parameter> $$1, Parameter $$2) {
            $$0.a().a($$1);
            this.a.put($$0, new b<Value, Parameter>($$2, $$1));
            return this;
        }

        public <Value> a a(cea<Value> $$0, Value $$1) {
            return this.a($$0, cel.a(), $$1);
        }

        public cec a() {
            if (this.a.isEmpty()) {
                return a;
            }
            return new cec(Map.copyOf(this.a));
        }
    }

    public record b<Value, Argument>(Argument a, cel<Value, Argument> b) {
        private static <Value> Codec<b<Value, ?>> a(cea<Value> $$03) {
            Codec $$12 = $$03.a().c().dispatch("modifier", b::b, bhs.b((T $$1) -> cec$b.a($$03, $$1)));
            return Codec.either($$03.c(), (Codec)$$12).xmap($$02 -> (b)$$02.map($$0 -> new b($$0, cel.a()), $$0 -> $$0), $$0 -> {
                if ($$0.b == cel.a()) {
                    return Either.left($$0.a());
                }
                return Either.right((Object)$$0);
            });
        }

        private static <Value, Argument> MapCodec<b<Value, Argument>> a(cea<Value> $$0, cel<Value, Argument> $$1) {
            return RecordCodecBuilder.mapCodec($$2 -> $$2.group((App)$$1.argumentCodec($$0).fieldOf("argument").forGetter(b::a)).apply((Applicative)$$2, $$1 -> new b($$1, $$1)));
        }

        public Value a(Value $$0) {
            return this.b.apply($$0, this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "argument;modifier", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "argument;modifier", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "argument;modifier", "a", "b"}, this, $$0);
        }
    }
}

