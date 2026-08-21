/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record dsr(jd<dso> a, int b) {
    private final jd<dso> a;
    private final int b;

    public int a() {
        return this.b().a().b();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsr.class, "enchantment;level", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsr.class, "enchantment;level", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsr.class, "enchantment;level", "a", "b"}, this, $$0);
    }

    public jd<dso> b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}

