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
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record dc(Optional<Boolean> c) implements bt
{
    public static final MapCodec<dc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("sheared").forGetter(dc::c)).apply((Applicative)$$0, dc::new));

    public MapCodec<dc> a() {
        return bu.f;
    }

    @Override
    public boolean a(cgk $$0, axf $$1, @Nullable ftm $$2) {
        if ($$0 instanceof cxj) {
            cxj $$3 = (cxj)$$0;
            return !this.c.isPresent() || $$3.gQ() == this.c.get().booleanValue();
        }
        return false;
    }

    public static dc b() {
        return new dc(Optional.of(false));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dc.class, "sheared", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dc.class, "sheared", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dc.class, "sheared", "c"}, this, $$0);
    }
}

