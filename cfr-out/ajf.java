/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ajf
extends Record
implements aay<aib> {
    private final int b;
    private final boolean c;
    public static final aao<ByteBuf, ajf> a = aao.a(aam.h, ajf::b, aam.b, ajf::e, ajf::new);

    public ajf(int $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ajf> a() {
        return ahz.bW;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajf.class, "id;includeData", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajf.class, "id;includeData", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajf.class, "id;includeData", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

