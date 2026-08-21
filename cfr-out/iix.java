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

public record iix(float b) implements iiv
{
    public static final MapCodec<iix> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.v.optionalFieldOf("period", (Object)Float.valueOf(1.0f)).forGetter(iix::b)).apply((Applicative)$$0, iix::new));

    @Override
    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        chl $$4;
        chl chl2 = $$4 = $$2 == null ? null : $$2.et();
        if ($$4 == null || $$4.gb() != $$0) {
            return 0.0f;
        }
        return (float)$$4.gc() % this.b;
    }

    public MapCodec<iix> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iix.class, "period", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iix.class, "period", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iix.class, "period", "b"}, this, $$0);
    }
}

