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

public final class by
extends Record
implements bt {
    private final Optional<Boolean> d;
    public static final by b = new by(Optional.empty());
    public static final MapCodec<by> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("in_open_water").forGetter(by::b)).apply((Applicative)$$0, by::new));

    public by(Optional<Boolean> $$0) {
        this.d = $$0;
    }

    public static by a(boolean $$0) {
        return new by(Optional.of($$0));
    }

    public MapCodec<by> a() {
        return bu.b;
    }

    @Override
    public boolean a(cgk $$0, axf $$1, @Nullable ftm $$2) {
        if (this.d.isEmpty()) {
            return true;
        }
        if ($$0 instanceof ddz) {
            ddz $$3 = (ddz)$$0;
            return this.d.get().booleanValue() == $$3.f();
        }
        return false;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{by.class, "inOpenWater", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{by.class, "inOpenWater", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{by.class, "inOpenWater", "d"}, this, $$0);
    }

    public Optional<Boolean> b() {
        return this.d;
    }
}

