/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record adf(int b) implements aay<adb>
{
    public static final aao<wx, adf> a = aay.a(adf::a, adf::new);

    private adf(wx $$0) {
        this($$0.l());
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
    }

    @Override
    public aba<adf> a() {
        return ahz.f;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{adf.class, "sequence", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{adf.class, "sequence", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{adf.class, "sequence", "b"}, this, $$0);
    }
}

