/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record zm(zz b) implements yi
{
    private static final String c = Character.toString('\ufffc');
    public static final MapCodec<zm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)aaa.a.forGetter(zm::b)).apply((Applicative)$$0, zm::new));

    public MapCodec<zm> a() {
        return a;
    }

    @Override
    public <T> Optional<T> a(yn.a<T> $$0) {
        return $$0.accept(this.b.c());
    }

    @Override
    public <T> Optional<T> a(yn.b<T> $$0, zf $$1) {
        return $$0.accept($$1.a(this.b.b()), c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zm.class, "contents", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zm.class, "contents", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zm.class, "contents", "b"}, this, $$0);
    }
}

