/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record cau<T extends cat>(T a, T b, @Nullable T c, int d, Map<Integer, Double> e, Duration f) {
    public static <T extends cat> Optional<cau<T>> a(List<T> $$02) {
        if ($$02.isEmpty()) {
            return Optional.empty();
        }
        List<cat> $$1 = $$02.stream().sorted(Comparator.comparing(cat::a)).toList();
        Duration $$2 = $$1.stream().map(cat::a).reduce(Duration::plus).orElse(Duration.ZERO);
        cat $$3 = $$1.getFirst();
        cat $$4 = $$1.getLast();
        cat $$5 = $$1.size() > 1 ? $$1.get($$1.size() - 2) : null;
        int $$6 = $$1.size();
        Map<Integer, Double> $$7 = bzv.a($$1.stream().mapToLong($$0 -> $$0.a().toNanos()).toArray());
        return Optional.of(new cau<cat>($$3, $$4, $$5, $$6, $$7, $$2));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cau.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cau.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cau.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "a", "b", "c", "d", "e", "f"}, this, $$0);
    }
}

