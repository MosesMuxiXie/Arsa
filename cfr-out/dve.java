/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface dve {
    public static final dve a = Stream::empty;

    public Stream<dlt> itemCopies();

    default public dve a(Predicate<dlt> $$0) {
        return new a(this, $$0);
    }

    default public dve a(Function<dlt, ? extends dve> $$0) {
        return new b(this, $$0);
    }

    default public dve a(int $$0) {
        return new c(this, $$0);
    }

    public static dve a(cic $$0) {
        return () -> Stream.of($$0.a().v());
    }

    public static dve a(Collection<? extends cic> $$0) {
        return switch ($$0.size()) {
            case 0 -> a;
            case 1 -> dve.a($$0.iterator().next());
            default -> () -> $$0.stream().map(cic::a).map(dlt::v);
        };
    }

    public static dve a(dve $$0, dve $$1) {
        return () -> Stream.concat($$0.itemCopies(), $$1.itemCopies());
    }

    public static dve a(List<? extends dve> $$0) {
        return switch ($$0.size()) {
            case 0 -> a;
            case 1 -> $$0.getFirst();
            case 2 -> dve.a($$0.get(0), $$0.get(1));
            default -> () -> $$0.stream().flatMap(dve::itemCopies);
        };
    }

    public static final class a
    extends Record
    implements dve {
        private final dve b;
        private final Predicate<dlt> c;

        public a(dve $$0, Predicate<dlt> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public Stream<dlt> itemCopies() {
            return this.b.itemCopies().filter(this.c);
        }

        @Override
        public dve a(Predicate<dlt> $$0) {
            return new a(this.b, this.c.and($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "slots;filter", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "slots;filter", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "slots;filter", "b", "c"}, this, $$0);
        }

        public dve a() {
            return this.b;
        }

        public Predicate<dlt> b() {
            return this.c;
        }
    }

    public static final class b
    extends Record
    implements dve {
        private final dve b;
        private final Function<dlt, ? extends dve> c;

        public b(dve $$0, Function<dlt, ? extends dve> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public Stream<dlt> itemCopies() {
            return this.b.itemCopies().map(this.c).flatMap(dve::itemCopies);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "slots;mapper", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "slots;mapper", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "slots;mapper", "b", "c"}, this, $$0);
        }

        public dve a() {
            return this.b;
        }

        public Function<dlt, ? extends dve> b() {
            return this.c;
        }
    }

    public static final class c
    extends Record
    implements dve {
        private final dve b;
        private final int c;

        public c(dve $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public Stream<dlt> itemCopies() {
            return this.b.itemCopies().limit(this.c);
        }

        @Override
        public dve a(int $$0) {
            return new c(this.b, Math.min(this.c, $$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "slots;limit", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "slots;limit", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "slots;limit", "b", "c"}, this, $$0);
        }

        public dve a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }
}

