/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record ijc<T>(kh<T> a) implements ijl<T>
{
    private final kh<T> a;
    private static final ijl.a<? extends ijc<?>, ?> b = ijc.e();

    private static <T> ijl.a<ijc<T>, T> e() {
        Codec $$02;
        Codec $$1 = $$02 = mi.am.q().validate($$0 -> {
            if ($$0.d()) {
                return DataResult.error(() -> "Component can't be serialized");
            }
            return DataResult.success((Object)$$0);
        });
        MapCodec $$2 = $$1.dispatchMap("component", $$0 -> ((ijc)$$0.a()).a, $$0 -> ijl.a.a($$0.c()).xmap($$1 -> new ihq.d(new ijc($$0), $$1), ihq.d::b));
        return new ijl.a($$2);
    }

    public static <T> ijl.a<ijc<T>, T> c() {
        return b;
    }

    @Override
    public @Nullable T b(dlt $$0, @Nullable hif $$1, @Nullable chl $$2, int $$3, dlr $$4) {
        return $$0.a(this.a);
    }

    @Override
    public ijl.a<ijc<T>, T> a() {
        return ijc.c();
    }

    @Override
    public Codec<T> b() {
        return this.a.c();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ijc.class, "componentType", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ijc.class, "componentType", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ijc.class, "componentType", "a"}, this, $$0);
    }

    public kh<T> d() {
        return this.a;
    }
}

