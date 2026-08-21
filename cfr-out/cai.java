/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import jdk.jfr.consumer.RecordedEvent;

public record cai(Duration a, dvu b, awq c, erj d, String e) implements cat
{
    public static cai a(RecordedEvent $$0) {
        return new cai($$0.getDuration(), new dvu($$0.getInt("chunkPosX"), $$0.getInt("chunkPosX")), new awq($$0.getInt("worldPosX"), $$0.getInt("worldPosZ")), erj.a($$0.getString("status")), $$0.getString("level"));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cai.class, "duration;chunkPos;worldPos;status;level", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cai.class, "duration;chunkPos;worldPos;status;level", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cai.class, "duration;chunkPos;worldPos;status;level", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

