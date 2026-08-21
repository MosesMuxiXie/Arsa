/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aee(bxe.a<?> b) implements aay<adb>
{
    public static final aao<xq, aee> a = aao.a(bxe.a.a, aee::b, aee::new);

    @Override
    public aba<aee> a() {
        return ahz.C;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aee.class, "event", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aee.class, "event", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aee.class, "event", "b"}, this, $$0);
    }
}

