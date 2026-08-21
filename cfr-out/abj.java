/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;

public record abj(Map<String, String> b) implements aay<abg>
{
    private static final int c = 128;
    private static final int d = 4096;
    private static final int e = 32;
    private static final aao<ByteBuf, Map<String, String>> f = aam.a(HashMap::new, aam.b(128), aam.b(4096), 32);
    public static final aao<ByteBuf, abj> a = aao.a(f, abj::b, abj::new);

    @Override
    public aba<abj> a() {
        return abu.c;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abj.class, "details", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abj.class, "details", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abj.class, "details", "b"}, this, $$0);
    }
}

