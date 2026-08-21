/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record dfo<T>(T a, iu.b b) {
    public dfo(T $$0, amo $$1) {
        this($$0, new iu.b($$1));
    }

    public static <T> MapCodec<dfo<T>> a(Codec<T> $$0, T $$1) {
        return RecordCodecBuilder.mapCodec($$2 -> $$2.group((App)$$0.optionalFieldOf("model", $$1).forGetter(dfo::a), (App)iu.b.b.forGetter(dfo::b)).apply((Applicative)$$2, dfo::new));
    }

    public static <T> aao<xq, dfo<T>> a(aao<? super xq, T> $$0) {
        return aao.a($$0, dfo::a, iu.b.c, dfo::b, dfo::new);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dfo.class, "model;asset", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dfo.class, "model;asset", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dfo.class, "model;asset", "a", "b"}, this, $$0);
    }
}

