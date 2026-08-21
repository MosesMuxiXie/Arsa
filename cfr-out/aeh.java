/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aeh(yh b, yd.a c) implements aay<adb>
{
    private final yd.a c;
    public static final aao<xq, aeh> a = aao.a(yj.d, aeh::b, yd.a.a, aeh::e, aeh::new);

    @Override
    public aba<aeh> a() {
        return ahz.F;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aeh.class, "message;chatType", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aeh.class, "message;chatType", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aeh.class, "message;chatType", "b", "c"}, this, $$0);
    }

    public yd.a e() {
        return this.c;
    }
}

