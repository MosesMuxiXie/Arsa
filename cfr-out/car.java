/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
import com.google.common.base.MoreObjects;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedThread;

public record car(Instant a, String b, long c) {
    private static final String d = "unknown";

    public static car a(RecordedEvent $$0) {
        RecordedThread $$1 = $$0.getThread("thread");
        String $$2 = $$1 == null ? d : (String)MoreObjects.firstNonNull((Object)$$1.getJavaName(), (Object)d);
        return new car($$0.getStartTime(), $$2, $$0.getLong("allocated"));
    }

    public static a a(List<car> $$02) {
        TreeMap<String, Double> $$12 = new TreeMap<String, Double>();
        Map<String, List<car>> $$22 = $$02.stream().collect(Collectors.groupingBy($$0 -> $$0.b));
        $$22.forEach(($$1, $$2) -> {
            if ($$2.size() < 2) {
                return;
            }
            car $$3 = (car)$$2.get(0);
            car $$4 = (car)$$2.get($$2.size() - 1);
            long $$5 = Duration.between($$3.a, $$4.a).getSeconds();
            long $$6 = $$4.c - $$3.c;
            $$12.put((String)$$1, (double)$$6 / (double)$$5);
        });
        return new a($$12);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{car.class, "timestamp;threadName;totalBytes", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{car.class, "timestamp;threadName;totalBytes", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{car.class, "timestamp;threadName;totalBytes", "a", "b", "c"}, this, $$0);
    }

    public record a(Map<String, Double> a) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "allocationsPerSecondByThread", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "allocationsPerSecondByThread", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "allocationsPerSecondByThread", "a"}, this, $$0);
        }
    }
}

