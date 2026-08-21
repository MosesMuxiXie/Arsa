/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record ihw(ks.c<?> b) implements ihy
{
    public static final MapCodec<ihw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ks.a("predicate").forGetter(ihw::b)).apply((Applicative)$$0, ihw::new));

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return this.b.b().a($$0);
    }

    public MapCodec<ihw> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ihw.class, "predicate", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ihw.class, "predicate", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ihw.class, "predicate", "b"}, this, $$0);
    }
}

