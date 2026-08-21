/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public record cal(Duration a, @Nullable String b, long c) {
    public static a a(Duration $$02, List<cal> $$1) {
        long $$2 = $$1.stream().mapToLong($$0 -> $$0.c).sum();
        return new a($$2, (double)$$2 / (double)$$02.getSeconds(), $$1.size(), (double)$$1.size() / (double)$$02.getSeconds(), $$1.stream().map(cal::a).reduce(Duration.ZERO, Duration::plus), $$1.stream().filter($$0 -> $$0.b != null).collect(Collectors.groupingBy($$0 -> $$0.b, Collectors.summingLong($$0 -> $$0.c))).entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).map($$0 -> Pair.of((Object)((String)$$0.getKey()), (Object)((Long)$$0.getValue()))).limit(10L).toList());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cal.class, "duration;path;bytes", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cal.class, "duration;path;bytes", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cal.class, "duration;path;bytes", "a", "b", "c"}, this, $$0);
    }

    public record a(long a, double b, long c, double d, Duration e, List<Pair<String, Long>> f) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "totalBytes;bytesPerSecond;counts;countsPerSecond;timeSpentInIO;topTenContributorsByTotalBytes", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "totalBytes;bytesPerSecond;counts;countsPerSecond;timeSpentInIO;topTenContributorsByTotalBytes", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "totalBytes;bytesPerSecond;counts;countsPerSecond;timeSpentInIO;topTenContributorsByTotalBytes", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }
    }
}

