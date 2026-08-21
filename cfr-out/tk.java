/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.Consumer;

public record tk(Map<amo, tu<amt<tv>>> a, amt<Consumer<sz>> b, Consumer<sz> c) {
    public tk(Map<amo, tu<amt<tv>>> $$0, amo $$1, Consumer<sz> $$2) {
        this($$0, amt.a(mj.aG, $$1), $$2);
    }

    public tk(amo $$0, tu<amt<tv>> $$1, Consumer<sz> $$2) {
        this(Map.of($$0, $$1), $$0, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tk.class, "tests;functionKey;function", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tk.class, "tests;functionKey;function", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tk.class, "tests;functionKey;function", "a", "b", "c"}, this, $$0);
    }
}

