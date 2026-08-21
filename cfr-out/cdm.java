/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record cdm(long a, long b) {
    public cdm(long $$0) {
        this($$0, 0L);
    }

    public long a(long $$0) {
        long $$1 = $$0 - this.a;
        return this.b + $$1;
    }

    public double b(long $$0) {
        return (double)this.a($$0) / 1000.0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cdm.class, "creationTime;accumulatedElapsedTime", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdm.class, "creationTime;accumulatedElapsedTime", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdm.class, "creationTime;accumulatedElapsedTime", "a", "b"}, this, $$0);
    }
}

