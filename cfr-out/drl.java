/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record drl(dlt a) implements dqy
{
    private final dlt a;

    @Override
    public dlt a(int $$0) {
        if ($$0 != 0) {
            throw new IllegalArgumentException("No item for index " + $$0);
        }
        return this.a;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{drl.class, "item", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{drl.class, "item", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{drl.class, "item", "a"}, this, $$0);
    }

    public dlt c() {
        return this.a;
    }
}

