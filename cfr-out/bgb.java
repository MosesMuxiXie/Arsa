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

public record bgb<T>(int a, T b) {
    public static <T> Codec<bgb<T>> a(Codec<T> $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)bfm.q.fieldOf("ticks").forGetter(bgb::a), (App)$$0.fieldOf("value").forGetter(bgb::b)).apply((Applicative)$$1, bgb::new));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bgb.class, "ticks;value", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bgb.class, "ticks;value", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bgb.class, "ticks;value", "a", "b"}, this, $$0);
    }
}

