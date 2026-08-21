/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ado(int b) implements aay<adb>
{
    public static final aao<wx, ado> a = aay.a(ado::a, ado::new);

    private ado(wx $$0) {
        this($$0.l());
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
    }

    @Override
    public aba<ado> a() {
        return ahz.m;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ado.class, "batchSize", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ado.class, "batchSize", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ado.class, "batchSize", "b"}, this, $$0);
    }
}

