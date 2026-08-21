/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aig(dwl b) implements aay<aib>
{
    public static final aao<ByteBuf, aig> a = aao.a(dwl.g, aig::b, aig::new);

    @Override
    public aba<aig> a() {
        return ahz.bu;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aig.class, "mode", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aig.class, "mode", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aig.class, "mode", "b"}, this, $$0);
    }
}

