/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record hi(int a, ea b, a c) {
    private final int a;
    private final ea b;
    private final a c;

    public void a(int $$0) {
        this.b.onSuccess($$0);
    }

    public void a() {
        this.b.onFailure();
    }

    public void b() {
        this.c.discard();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hi.class, "depth;returnValueConsumer;frameControl", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hi.class, "depth;returnValueConsumer;frameControl", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hi.class, "depth;returnValueConsumer;frameControl", "a", "b", "c"}, this, $$0);
    }

    public int c() {
        return this.a;
    }

    public ea d() {
        return this.b;
    }

    public a e() {
        return this.c;
    }

    @FunctionalInterface
    public static interface a {
        public void discard();
    }
}

