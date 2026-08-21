/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record alj(long b) implements aay<ali>
{
    public static final aao<wx, alj> a = aay.a(alj::a, alj::new);

    private alj(wx $$0) {
        this($$0.readLong());
    }

    @Override
    private void a(wx $$0) {
        $$0.b(this.b);
    }

    @Override
    public aba<alj> a() {
        return alk.a;
    }

    @Override
    public void a(ali $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{alj.class, "time", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{alj.class, "time", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{alj.class, "time", "b"}, this, $$0);
    }
}

