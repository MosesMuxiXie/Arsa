/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 */
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public record aiv(Set<bxe<?>> b) implements aay<aib>
{
    private static final aao<xq, Set<bxe<?>>> c = aam.a(mj.t).a(aam.a(ReferenceOpenHashSet::new));
    public static final aao<xq, aiv> a = c.a(aiv::new, aiv::b);

    @Override
    public aba<aiv> a() {
        return ahz.bJ;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aiv.class, "subscriptions", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aiv.class, "subscriptions", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aiv.class, "subscriptions", "b"}, this, $$0);
    }
}

