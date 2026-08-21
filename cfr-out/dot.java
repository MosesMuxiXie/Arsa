/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dot
extends Record {
    private final int d;
    public static final Codec<dot> a = Codec.INT.xmap(dot::new, dot::a);
    public static final aao<ByteBuf, dot> b = aam.g.a(dot::new, dot::a);
    public static final dot c = new dot(4603950);

    public dot(int $$0) {
        this.d = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dot.class, "rgb", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dot.class, "rgb", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dot.class, "rgb", "d"}, this, $$0);
    }

    public int a() {
        return this.d;
    }
}

