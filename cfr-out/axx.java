/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Function;

public record axx<T>(T a, Optional<T> b) {
    public static <T> Codec<axx<T>> a(Codec<T> $$0) {
        Codec $$12 = RecordCodecBuilder.create($$1 -> $$1.group((App)$$0.fieldOf("raw").forGetter(axx::a), (App)$$0.optionalFieldOf("filtered").forGetter(axx::b)).apply((Applicative)$$1, axx::new));
        Codec $$2 = $$0.xmap(axx::a, axx::a);
        return Codec.withAlternative((Codec)$$12, (Codec)$$2);
    }

    public static <B extends ByteBuf, T> aao<B, axx<T>> a(aao<B, T> $$0) {
        return aao.a($$0, axx::a, $$0.a(aam::a), axx::b, axx::new);
    }

    public static <T> axx<T> a(T $$0) {
        return new axx<T>($$0, Optional.empty());
    }

    public static axx<String> a(axy $$0) {
        return new axx<String>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
    }

    public T a(boolean $$0) {
        if ($$0) {
            return this.b.orElse(this.a);
        }
        return this.a;
    }

    public <U> axx<U> a(Function<T, U> $$0) {
        return new axx<U>($$0.apply(this.a), this.b.map($$0));
    }

    public <U> Optional<axx<U>> b(Function<T, Optional<U>> $$0) {
        Optional<U> $$1 = $$0.apply(this.a);
        if ($$1.isEmpty()) {
            return Optional.empty();
        }
        if (this.b.isPresent()) {
            Optional<U> $$2 = $$0.apply(this.b.get());
            if ($$2.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(new axx<U>($$1.get(), $$2));
        }
        return Optional.of(new axx<U>($$1.get(), Optional.empty()));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{axx.class, "raw;filtered", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{axx.class, "raw;filtered", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{axx.class, "raw;filtered", "a", "b"}, this, $$0);
    }
}

