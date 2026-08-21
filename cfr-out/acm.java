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

public record acm(List<bag> b) implements aay<ach>
{
    public static final aao<ByteBuf, acm> a = aao.a(bag.a.a(aam.a()), acm::b, acm::new);

    @Override
    public aba<acm> a() {
        return aco.e;
    }

    @Override
    public void a(ach $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{acm.class, "knownPacks", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{acm.class, "knownPacks", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{acm.class, "knownPacks", "b"}, this, $$0);
    }
}

