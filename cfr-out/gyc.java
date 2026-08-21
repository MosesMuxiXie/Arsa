/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record gyc(gyj.a a, etx b, @Nullable amt<fdp> c) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gyc.class, "selectedGameMode;gameRuleOverwrites;flatLevelPreset", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gyc.class, "selectedGameMode;gameRuleOverwrites;flatLevelPreset", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gyc.class, "selectedGameMode;gameRuleOverwrites;flatLevelPreset", "a", "b", "c"}, this, $$0);
    }
}

