/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record agd(yh b) implements aay<adb>
{
    public static final aao<xq, agd> a = aao.a(yj.d, agd::b, agd::new);

    @Override
    public aba<agd> a() {
        return ahz.az;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{agd.class, "text", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{agd.class, "text", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{agd.class, "text", "b"}, this, $$0);
    }
}

