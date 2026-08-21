/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.UUID;

public record hix(Map<amo, byte[]> a, Map<UUID, hiq> b, boolean c) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hix.class, "cookies;seenPlayers;seenInsecureChatWarning", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hix.class, "cookies;seenPlayers;seenInsecureChatWarning", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hix.class, "cookies;seenPlayers;seenInsecureChatWarning", "a", "b", "c"}, this, $$0);
    }
}

