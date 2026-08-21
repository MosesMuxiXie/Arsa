/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ahe(yh b) implements aay<adb>
{
    public static final aao<xq, ahe> a = aao.a(yj.d, ahe::b, ahe::new);

    @Override
    public aba<ahe> a() {
        return ahz.aY;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahe.class, "text", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahe.class, "text", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahe.class, "text", "b"}, this, $$0);
    }
}

