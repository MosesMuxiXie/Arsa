/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record iid(kh<?> b, boolean c) implements ihy
{
    public static final MapCodec<iid> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)mi.am.q().fieldOf("component").forGetter(iid::b), (App)Codec.BOOL.optionalFieldOf("ignore_default", (Object)false).forGetter(iid::c)).apply((Applicative)$$0, iid::new));

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return this.c ? $$0.d(this.b) : $$0.c(this.b);
    }

    public MapCodec<iid> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iid.class, "componentType;ignoreDefault", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iid.class, "componentType;ignoreDefault", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iid.class, "componentType;ignoreDefault", "b", "c"}, this, $$0);
    }
}

