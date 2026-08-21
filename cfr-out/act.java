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

public record act(List<bag> b) implements aay<acq>
{
    public static final aao<ByteBuf, act> a = aao.a(bag.a.a(aam.c(64)), act::b, act::new);

    @Override
    public aba<act> a() {
        return aco.i;
    }

    @Override
    public void a(acq $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{act.class, "knownPacks", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{act.class, "knownPacks", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{act.class, "knownPacks", "b"}, this, $$0);
    }
}

