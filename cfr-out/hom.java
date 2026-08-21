/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record hom(amo a, String b) {
    public ins a(amo $$0) {
        return new ins(this.a, $$0.f(this.b + "/"));
    }

    public ins a(String $$0) {
        return this.a(amo.b($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hom.class, "sheet;prefix", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hom.class, "sheet;prefix", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hom.class, "sheet;prefix", "a", "b"}, this, $$0);
    }
}

