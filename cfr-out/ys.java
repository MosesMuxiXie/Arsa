/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ys(yu a, boolean b) {
    private final yu a;
    private final boolean b;

    public ys a() {
        return this.b ? new ys(this.a, false) : this;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ys.class, "signature;pending", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ys.class, "signature;pending", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ys.class, "signature;pending", "a", "b"}, this, $$0);
    }

    public yu b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

