/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record abp(List<anl.c> b) implements aay<abg>
{
    public static final aao<ByteBuf, abp> a = aao.a(anl.c, abp::b, abp::new);

    @Override
    public aba<abp> a() {
        return abu.i;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abp.class, "links", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abp.class, "links", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abp.class, "links", "b"}, this, $$0);
    }
}

