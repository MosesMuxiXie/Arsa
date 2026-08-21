/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ael(dvu b) implements aay<adb>
{
    public static final aao<wx, ael> a = aay.a(ael::a, ael::new);

    private ael(wx $$0) {
        this($$0.f());
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<ael> a() {
        return ahz.J;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ael.class, "pos", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ael.class, "pos", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ael.class, "pos", "b"}, this, $$0);
    }
}

