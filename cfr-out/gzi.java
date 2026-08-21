/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gzi<T extends gzp>(T a, T b) {
    public T a(boolean $$0) {
        return $$0 ? this.b : this.a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gzi.class, "adultModel;babyModel", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gzi.class, "adultModel;babyModel", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gzi.class, "adultModel;babyModel", "a", "b"}, this, $$0);
    }
}

