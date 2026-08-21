/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ajk(ddk b) implements aay<aib>
{
    public static final aao<wx, ajk> a = aao.a(ddk.a, ajk::b, ajk::new);

    @Override
    public aba<ajk> a() {
        return ahz.cb;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajk.class, "input", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajk.class, "input", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajk.class, "input", "b"}, this, $$0);
    }
}

