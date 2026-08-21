/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aih(int b) implements aay<aib>
{
    public static final aao<wx, aih> a = aay.a(aih::a, aih::new);

    private aih(wx $$0) {
        this($$0.l());
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
    }

    @Override
    public aba<aih> a() {
        return ahz.bv;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aih.class, "offset", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aih.class, "offset", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aih.class, "offset", "b"}, this, $$0);
    }
}

