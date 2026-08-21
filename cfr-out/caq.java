/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record caq(Duration a, dvu b, String c, String d, boolean e) implements cat
{
    public static caq a(RecordedEvent $$0) {
        return new caq($$0.getDuration(), new dvu($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")), $$0.getString("structure"), $$0.getString("level"), $$0.getBoolean("success"));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{caq.class, "duration;chunkPos;structureName;level;success", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{caq.class, "duration;chunkPos;structureName;level;success", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{caq.class, "duration;chunkPos;structureName;level;success", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

