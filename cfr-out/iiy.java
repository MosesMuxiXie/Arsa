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

public record iiy(boolean b) implements iiv
{
    public static final MapCodec<iiy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("remaining", (Object)false).forGetter(iiy::b)).apply((Applicative)$$0, iiy::new));

    @Override
    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        chl $$4;
        chl chl2 = $$4 = $$2 == null ? null : $$2.et();
        if ($$4 == null || $$4.gb() != $$0) {
            return 0.0f;
        }
        return this.b ? (float)$$4.gc() : (float)iiy.a($$0, $$4);
    }

    public MapCodec<iiy> a() {
        return a;
    }

    public static int a(dlt $$0, chl $$1) {
        return $$0.a($$1) - $$1.gc();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iiy.class, "remaining", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iiy.class, "remaining", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iiy.class, "remaining", "b"}, this, $$0);
    }
}

