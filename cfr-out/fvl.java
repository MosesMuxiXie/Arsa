/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.LongSupplier;

public record fvl<Value, Argument>(cel<Value, Argument> a, bgc<Argument> b) {
    public static <Value> Codec<fvl<Value, ?>> a(cea<Value> $$0) {
        MapCodec $$12 = $$0.a().c().optionalFieldOf("modifier", cel.a());
        return $$12.dispatch(fvl::a, bhs.b($$1 -> fvl.a($$0, $$1)));
    }

    private static <Value, Argument> MapCodec<fvl<Value, Argument>> a(cea<Value> $$0, cel<Value, Argument> $$12) {
        return bgc.a($$12.argumentCodec($$0)).xmap($$1 -> new fvl($$12, $$1), fvl::b);
    }

    public fvm<Value, Argument> a(cea<Value> $$0, Optional<Integer> $$1, LongSupplier $$2) {
        return new fvm<Value, Argument>($$1, this.a, this.b, this.a.argumentKeyframeLerp($$0), $$2);
    }

    public static DataResult<fvl<?, ?>> a(fvl<?, ?> $$0, int $$12) {
        return bgc.a($$0.b(), $$12).map($$1 -> $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fvl.class, "modifier;argumentTrack", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fvl.class, "modifier;argumentTrack", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fvl.class, "modifier;argumentTrack", "a", "b"}, this, $$0);
    }
}

