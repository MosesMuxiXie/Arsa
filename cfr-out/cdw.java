/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableBiMap
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public record cdw<Value>(Codec<Value> a, Map<cel.a, cel<Value, ?>> b, Codec<cel<Value, ?>> c, cei<Value> d, cei<Value> e, cei<Value> f, cei<Value> g) {
    public static <Value> cdw<Value> a(Codec<Value> $$0, Map<cel.a, cel<Value, ?>> $$1, cei<Value> $$2) {
        return cdw.a($$0, $$1, $$2, $$2);
    }

    public static <Value> cdw<Value> a(Codec<Value> $$0, Map<cel.a, cel<Value, ?>> $$1, cei<Value> $$2, cei<Value> $$3) {
        return new cdw<Value>($$0, $$1, cdw.a($$1), $$2, $$2, $$2, $$3);
    }

    public static <Value> cdw<Value> a(Codec<Value> $$0, Map<cel.a, cel<Value, ?>> $$1) {
        return new cdw<Value>($$0, $$1, cdw.a($$1), cei.b(1.0f), cei.b(0.0f), cei.b(0.5f), cei.b(0.0f));
    }

    public static <Value> cdw<Value> a(Codec<Value> $$0) {
        return cdw.a($$0, Map.of());
    }

    private static <Value> Codec<cel<Value, ?>> a(Map<cel.a, cel<Value, ?>> $$0) {
        ImmutableBiMap $$1 = ImmutableBiMap.builder().put((Object)cel.a.a, cel.a()).putAll($$0).buildOrThrow();
        return bfm.a(cel.a.o, arg_0 -> ((ImmutableBiMap)$$1).get(arg_0), arg_0 -> ((ImmutableBiMap)$$1.inverse()).get(arg_0));
    }

    public void a(cel<Value, ?> $$0) {
        if ($$0 != cel.a() && !this.b.containsValue($$0)) {
            throw new IllegalArgumentException("Modifier " + String.valueOf($$0) + " is not valid for " + String.valueOf(this));
        }
    }

    @Override
    public String toString() {
        return bhs.a(mi.aO, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdw.class, "valueCodec;modifierLibrary;modifierCodec;keyframeLerp;stateChangeLerp;spatialLerp;partialTickLerp", "a", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdw.class, "valueCodec;modifierLibrary;modifierCodec;keyframeLerp;stateChangeLerp;spatialLerp;partialTickLerp", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
    }
}

