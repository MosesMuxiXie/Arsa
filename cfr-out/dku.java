/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Function;

public record dku<T>(Either<jd<T>, amt<T>> a) {
    private final Either<jd<T>, amt<T>> a;

    public dku(jd<T> $$0) {
        this(Either.left($$0));
    }

    public dku(amt<T> $$0) {
        this(Either.right($$0));
    }

    public static <T> Codec<dku<T>> a(amt<jq<T>> $$02, Codec<jd<T>> $$1) {
        return Codec.either($$1, (Codec)amt.a($$02).comapFlatMap($$0 -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity())).xmap(dku::new, dku::b);
    }

    public static <T> aao<xq, dku<T>> a(amt<jq<T>> $$0, aao<xq, jd<T>> $$1) {
        return aao.a(aam.a($$1, amt.b($$0)), dku::b, dku::new);
    }

    public Optional<T> a(jq<T> $$02) {
        return (Optional)this.a.map($$0 -> Optional.of($$0.a()), $$02::f);
    }

    public Optional<jd<T>> a(jf.a $$0) {
        return (Optional)this.a.map(Optional::of, $$1 -> $$0.c($$1).map($$0 -> $$0));
    }

    public Optional<amt<T>> a() {
        return (Optional)this.a.map(jd::e, Optional::of);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dku.class, "contents", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dku.class, "contents", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dku.class, "contents", "a"}, this, $$0);
    }

    public Either<jd<T>, amt<T>> b() {
        return this.a;
    }
}

