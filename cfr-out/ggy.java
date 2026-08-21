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

public record ggy(float b, float c) implements ggz
{
    public static final MapCodec<ggy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.a(0.0f, 1.0f).fieldOf("temperature").forGetter(ggy::b), (App)bfm.a(0.0f, 1.0f).fieldOf("downfall").forGetter(ggy::c)).apply((Applicative)$$0, ggy::new));

    public ggy() {
        this(0.5f, 1.0f);
    }

    @Override
    public int a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2) {
        return dwm.a(this.b, this.c);
    }

    public MapCodec<ggy> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ggy.class, "temperature;downfall", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ggy.class, "temperature;downfall", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ggy.class, "temperature;downfall", "b", "c"}, this, $$0);
    }
}

