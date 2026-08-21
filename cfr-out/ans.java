/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ans(bap a, ane b, jk<anc> c, fnt d) implements AutoCloseable
{
    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ans.class, "resourceManager;dataPackResources;registries;worldData", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ans.class, "resourceManager;dataPackResources;registries;worldData", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ans.class, "resourceManager;dataPackResources;registries;worldData", "a", "b", "c", "d"}, this, $$0);
    }
}

