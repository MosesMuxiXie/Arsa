/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ajn(dsa b) implements aay<aib>
{
    public static final aao<wx, ajn> a = aao.a(dsa.a, ajn::b, ajn::new);

    @Override
    public aba<ajn> a() {
        return ahz.ce;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajn.class, "recipe", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajn.class, "recipe", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajn.class, "recipe", "b"}, this, $$0);
    }
}

