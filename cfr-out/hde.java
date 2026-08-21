/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record hde(amo a, String b) {
    @Override
    public String toString() {
        return String.valueOf(this.a) + "#" + this.b;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hde.class, "model;layer", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hde.class, "model;layer", "a", "b"}, this, $$0);
    }
}

