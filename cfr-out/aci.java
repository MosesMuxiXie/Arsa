/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aci(String b) implements aay<ach>
{
    public static final aao<ByteBuf, aci> a = aao.a(aam.p, aci::b, aci::new);

    @Override
    public aba<aci> a() {
        return aco.a;
    }

    @Override
    public void a(ach $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aci.class, "codeOfConduct", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aci.class, "codeOfConduct", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aci.class, "codeOfConduct", "b"}, this, $$0);
    }
}

