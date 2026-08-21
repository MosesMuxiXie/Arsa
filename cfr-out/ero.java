/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.Executor;

public record ero(axf a, eqg b, fjr c, axj d, Executor e, eqq.e f) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ero.class, "level;generator;structureManager;lightEngine;mainThreadExecutor;unsavedListener", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ero.class, "level;generator;structureManager;lightEngine;mainThreadExecutor;unsavedListener", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ero.class, "level;generator;structureManager;lightEngine;mainThreadExecutor;unsavedListener", "a", "b", "c", "d", "e", "f"}, this, $$0);
    }
}

