/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record abk(yh b) implements aay<abg>
{
    public static final aao<ByteBuf, abk> a = yj.f.a(abk::new, abk::b);

    @Override
    public aba<abk> a() {
        return abu.d;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abk.class, "reason", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abk.class, "reason", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abk.class, "reason", "b"}, this, $$0);
    }
}

