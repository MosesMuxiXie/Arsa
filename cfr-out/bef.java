/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Interner
 *  com.google.common.collect.Interners
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record bef<T>(amt<? extends jq<T>> a, amo b) {
    private static final Interner<bef<?>> c = Interners.newWeakInterner();

    public static <T> Codec<bef<T>> a(amt<? extends jq<T>> $$0) {
        return amo.a.xmap($$1 -> bef.a($$0, $$1), bef::b);
    }

    public static <T> Codec<bef<T>> b(amt<? extends jq<T>> $$02) {
        return Codec.STRING.comapFlatMap($$12 -> $$12.startsWith("#") ? amo.d($$12.substring(1)).map($$1 -> bef.a($$02, $$1)) : DataResult.error(() -> "Not a tag id"), $$0 -> "#" + String.valueOf($$0.b));
    }

    public static <T> aao<ByteBuf, bef<T>> c(amt<? extends jq<T>> $$0) {
        return amo.b.a($$1 -> bef.a($$0, $$1), bef::b);
    }

    public static <T> bef<T> a(amt<? extends jq<T>> $$0, amo $$1) {
        return (bef)c.intern(new bef<T>($$0, $$1));
    }

    public boolean d(amt<? extends jq<?>> $$0) {
        return this.a == $$0;
    }

    public <E> Optional<bef<E>> e(amt<? extends jq<E>> $$0) {
        return this.d($$0) ? Optional.of(this) : Optional.empty();
    }

    @Override
    public String toString() {
        return "TagKey[" + String.valueOf(this.a.a()) + " / " + String.valueOf(this.b) + "]";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bef.class, "registry;location", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bef.class, "registry;location", "a", "b"}, this, $$0);
    }
}

