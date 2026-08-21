/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cqy {
    private static final cqy a = new cqy();
    private final List<chl> b;
    private final Predicate<chl> c;

    private cqy() {
        this.b = List.of();
        this.c = $$0 -> false;
    }

    public cqy(axf $$0, chl $$1, List<chl> $$22) {
        this.b = $$22;
        Object2BooleanOpenHashMap $$3 = new Object2BooleanOpenHashMap($$22.size());
        Predicate<chl> $$4 = $$2 -> csd.b($$0, $$1, $$2);
        this.c = $$2 -> $$3.computeIfAbsent($$2, $$4);
    }

    public static cqy a() {
        return a;
    }

    public Optional<chl> a(Predicate<chl> $$0) {
        for (chl $$1 : this.b) {
            if (!$$0.test($$1) || !this.c.test($$1)) continue;
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    public Iterable<chl> b(Predicate<chl> $$0) {
        return Iterables.filter(this.b, $$1 -> $$0.test((chl)$$1) && this.c.test((chl)$$1));
    }

    public Stream<chl> c(Predicate<chl> $$0) {
        return this.b.stream().filter($$1 -> $$0.test((chl)$$1) && this.c.test((chl)$$1));
    }

    public boolean a(chl $$0) {
        return this.b.contains($$0) && this.c.test($$0);
    }

    public boolean d(Predicate<chl> $$0) {
        for (chl $$1 : this.b) {
            if (!$$0.test($$1) || !this.c.test($$1)) continue;
            return true;
        }
        return false;
    }
}

