/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;

public record bbm<T extends bbo>(bbj a) implements Predicate<T>
{
    public boolean a(T $$0) {
        return this.a.a($$0.d());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bbm.class, "test", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bbm.class, "test", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bbm.class, "test", "a"}, this, $$0);
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((bbo)object);
    }
}

