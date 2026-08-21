/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;

public record can(Instant a, long b, b c) {
    public static can a(RecordedEvent $$0) {
        return new can($$0.getStartTime(), $$0.getLong("heapUsed"), $$0.getString("when").equalsIgnoreCase("before gc") ? can$b.a : can$b.b);
    }

    public static a a(Duration $$0, List<can> $$1, Duration $$2, int $$3) {
        return new a($$0, $$2, $$3, can.a($$1));
    }

    private static double a(List<can> $$02) {
        long $$1 = 0L;
        Map<b, List<can>> $$2 = $$02.stream().collect(Collectors.groupingBy($$0 -> $$0.c));
        List<can> $$3 = $$2.get((Object)can$b.a);
        List<can> $$4 = $$2.get((Object)can$b.b);
        for (int $$5 = 1; $$5 < $$3.size(); ++$$5) {
            can $$6 = $$3.get($$5);
            can $$7 = $$4.get($$5 - 1);
            $$1 += $$6.b - $$7.b;
        }
        Duration $$8 = Duration.between($$02.get((int)1).a, $$02.get((int)($$02.size() - 1)).a);
        return (double)$$1 / (double)$$8.getSeconds();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{can.class, "timestamp;heapUsed;timing", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{can.class, "timestamp;heapUsed;timing", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{can.class, "timestamp;heapUsed;timing", "a", "b", "c"}, this, $$0);
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = can$b.a();
        }
    }

    public record a(Duration a, Duration b, int c, double d) {
        private final Duration a;
        private final Duration b;
        private final int c;
        private final double d;

        public float a() {
            return (float)this.b.toMillis() / (float)this.a.toMillis();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "duration;gcTotalDuration;totalGCs;allocationRateBytesPerSecond", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "duration;gcTotalDuration;totalGCs;allocationRateBytesPerSecond", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "duration;gcTotalDuration;totalGCs;allocationRateBytesPerSecond", "a", "b", "c", "d"}, this, $$0);
        }

        public Duration b() {
            return this.a;
        }

        public Duration c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        public double e() {
            return this.d;
        }
    }
}

