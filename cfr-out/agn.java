/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record agn(fne.a b) implements aay<adb>
{
    public static final aao<wx, agn> a = aao.a(fne.a.d, agn::b, agn::new);

    @Override
    public aba<agn> a() {
        return ahz.aI;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{agn.class, "respawnData", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{agn.class, "respawnData", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{agn.class, "respawnData", "b"}, this, $$0);
    }
}

