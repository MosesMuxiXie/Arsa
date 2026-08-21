/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import org.slf4j.Logger;

public record cbm<T>(T a, int b) {
    private static final Logger c = LogUtils.getLogger();

    public cbm {
        if ($$1 < 0) {
            throw bhs.b(new IllegalArgumentException("Weight should be >= 0"));
        }
        if ($$1 == 0 && w.aX) {
            c.warn("Found 0 weight, make sure this is intentional!");
        }
    }

    public static <E> Codec<cbm<E>> a(Codec<E> $$0) {
        return cbm.a($$0.fieldOf("data"));
    }

    public static <E> Codec<cbm<E>> a(MapCodec<E> $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)$$0.forGetter(cbm::a), (App)bfm.q.fieldOf("weight").forGetter(cbm::b)).apply((Applicative)$$1, cbm::new));
    }

    public static <B extends ByteBuf, T> aao<B, cbm<T>> a(aao<B, T> $$0) {
        return aao.a($$0, cbm::a, aam.h, cbm::b, cbm::new);
    }

    public <U> cbm<U> a(Function<T, U> $$0) {
        return new cbm<U>($$0.apply(this.a()), this.b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cbm.class, "value;weight", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cbm.class, "value;weight", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cbm.class, "value;weight", "a", "b"}, this, $$0);
    }
}

