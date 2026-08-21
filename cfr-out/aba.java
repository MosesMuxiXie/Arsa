/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aba<T extends aay<?>>(aaz a, amo b) {
    @Override
    public String toString() {
        return this.a.b() + "/" + String.valueOf(this.b);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aba.class, "flow;id", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aba.class, "flow;id", "a", "b"}, this, $$0);
    }
}

