/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.server.MinecraftServer;

public record fge(baz a, jr b, fjr c) {
    public static fge a(axf $$0) {
        MinecraftServer $$1 = $$0.s();
        return new fge($$1.bg(), $$1.bc(), $$1.ba());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fge.class, "resourceManager;registryAccess;structureTemplateManager", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fge.class, "resourceManager;registryAccess;structureTemplateManager", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fge.class, "resourceManager;registryAccess;structureTemplateManager", "a", "b", "c"}, this, $$0);
    }
}

