/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record wi(List<String> a, wb<?> b, String c) {
    public wi(wb<?> $$0, String $$1) {
        this(List.of(), $$0, $$1);
    }

    public wi(String $$0, wb<?> $$1, String $$2) {
        this(List.of($$0), $$1, $$2);
    }

    public wi(String $$0, String $$1, wb<?> $$2, String $$3) {
        this(List.of($$0, $$1), $$2, $$3);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{wi.class, "path;type;name", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{wi.class, "path;type;name", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{wi.class, "path;type;name", "a", "b", "c"}, this, $$0);
    }
}

