/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record byc<T>(String a) {
    @Override
    public String toString() {
        return "<" + this.a + ">";
    }

    public static <T> byc<T> a(String $$0) {
        return new byc<T>($$0);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{byc.class, "name", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{byc.class, "name", "a"}, this, $$0);
    }
}

