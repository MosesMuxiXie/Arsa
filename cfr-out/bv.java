/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bv
extends Record {
    private final jh<cgu<?>> b;
    public static final Codec<bv> a = js.a(mj.F).xmap(bv::new, bv::a);

    public bv(jh<cgu<?>> $$0) {
        this.b = $$0;
    }

    public static bv a(je<cgu<?>> $$0, cgu<?> $$1) {
        return new bv(jh.a($$1.r()));
    }

    public static bv a(je<cgu<?>> $$0, bef<cgu<?>> $$1) {
        return new bv($$0.b($$1));
    }

    public boolean a(cgu<?> $$0) {
        return $$0.a(this.b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bv.class, "types", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bv.class, "types", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bv.class, "types", "b"}, this, $$0);
    }

    public jh<cgu<?>> a() {
        return this.b;
    }
}

