/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record cas(Instant a, Duration b) {
    public static cas a(RecordedEvent $$0) {
        return new cas($$0.getStartTime(), $$0.getDuration("averageTickDuration"));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cas.class, "timestamp;currentAverage", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cas.class, "timestamp;currentAverage", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cas.class, "timestamp;currentAverage", "a", "b"}, this, $$0);
    }
}

