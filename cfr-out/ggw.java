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

public record ggw(int b) implements ggz
{
    public static final MapCodec<ggw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.l.fieldOf("default").forGetter(ggw::b)).apply((Applicative)$$0, ggw::new));

    @Override
    public int a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2) {
        return doj.a($$0, this.b);
    }

    public MapCodec<ggw> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ggw.class, "defaultColor", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ggw.class, "defaultColor", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ggw.class, "defaultColor", "b"}, this, $$0);
    }
}

