/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aen
extends Record
implements aay<adb> {
    private final is b;
    private final is c;
    public static final aao<ByteBuf, aen> a = aao.a(is.b, aen::b, is.b, aen::e, aen::new);

    public aen(is $$0, is $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<aen> a() {
        return ahz.L;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aen.class, "absolutePos;relativePos", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aen.class, "absolutePos;relativePos", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aen.class, "absolutePos;relativePos", "b", "c"}, this, $$0);
    }

    public is b() {
        return this.b;
    }

    public is e() {
        return this.c;
    }
}

