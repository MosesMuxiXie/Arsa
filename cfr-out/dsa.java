/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dsa
extends Record {
    private final int b;
    public static final aao<ByteBuf, dsa> a = aao.a(aam.h, dsa::a, dsa::new);

    public dsa(int $$0) {
        this.b = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsa.class, "index", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsa.class, "index", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsa.class, "index", "b"}, this, $$0);
    }

    public int a() {
        return this.b;
    }
}

