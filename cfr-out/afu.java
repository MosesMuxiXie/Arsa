/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record afu(bde b) implements aay<adb>
{
    public static final aao<wx, afu> a = aao.a(bde.a, afu::b, afu::new);

    @Override
    public aba<afu> a() {
        return ahz.ar;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afu.class, "bookSettings", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afu.class, "bookSettings", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afu.class, "bookSettings", "b"}, this, $$0);
    }
}

