/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record iif(gfh b) implements ihy
{
    private static final Codec<gfh> c = Codec.STRING.comapFlatMap($$0 -> {
        gfh $$1 = gfh.b($$0);
        return $$1 != null ? DataResult.success((Object)$$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
    }, gfh::k);
    public static final MapCodec<iif> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)c.fieldOf("keybind").forGetter(iif::b)).apply((Applicative)$$0, iif::new));

    @Override
    public boolean get(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return this.b.f();
    }

    public MapCodec<iif> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iif.class, "keybind", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iif.class, "keybind", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iif.class, "keybind", "b"}, this, $$0);
    }
}

