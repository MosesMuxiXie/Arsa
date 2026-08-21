/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ak<T extends an>
extends Record {
    private final am<T> b;
    private final T c;
    private static final MapCodec<ak<?>> d = bfm.a("trigger", "conditions", aj.a, ak::a, ak::a);
    public static final Codec<ak<?>> a = d.codec();

    public ak(am<T> $$0, T $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    private static <T extends an> Codec<ak<T>> a(am<T> $$0) {
        return $$0.a().xmap($$1 -> new ak<an>($$0, (an)$$1), ak::b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ak.class, "trigger;triggerInstance", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ak.class, "trigger;triggerInstance", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ak.class, "trigger;triggerInstance", "b", "c"}, this, $$0);
    }

    public am<T> a() {
        return this.b;
    }

    public T b() {
        return this.c;
    }
}

