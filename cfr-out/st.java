/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;

public record st(int a, Collection<ta> b, jd<tv> c) {
    public st {
        if ($$1.isEmpty()) {
            throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{st.class, "index;gameTestInfos;environment", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{st.class, "index;gameTestInfos;environment", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{st.class, "index;gameTestInfos;environment", "a", "b", "c"}, this, $$0);
    }
}

