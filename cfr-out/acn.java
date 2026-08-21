/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.Set;

public record acn(Set<amo> b) implements aay<ach>
{
    public static final aao<wx, acn> a = aay.a(acn::a, acn::new);

    private acn(wx $$0) {
        this((Set)((Object)$$0.a(HashSet::new, wx::q)));
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b, wx::a);
    }

    @Override
    public aba<acn> a() {
        return aco.f;
    }

    @Override
    public void a(ach $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{acn.class, "features", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{acn.class, "features", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{acn.class, "features", "b"}, this, $$0);
    }
}

