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

public record iir(int b) implements iiv
{
    public static final MapCodec<iir> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.q.optionalFieldOf("index", (Object)0).forGetter(iir::b)).apply((Applicative)$$0, iir::new));

    @Override
    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        Float $$5;
        dof $$4 = $$0.a(ki.s);
        if ($$4 != null && ($$5 = $$4.a(this.b)) != null) {
            return $$5.floatValue();
        }
        return 0.0f;
    }

    public MapCodec<iir> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iir.class, "index", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iir.class, "index", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iir.class, "index", "b"}, this, $$0);
    }
}

