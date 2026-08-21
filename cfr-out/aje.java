/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aje
extends Record
implements aay<aib> {
    private final is b;
    private final boolean c;
    public static final aao<ByteBuf, aje> a = aao.a(is.b, aje::b, aam.b, aje::e, aje::new);

    public aje(is $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<aje> a() {
        return ahz.bV;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aje.class, "pos;includeData", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aje.class, "pos;includeData", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aje.class, "pos;includeData", "b", "c"}, this, $$0);
    }

    public is b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

