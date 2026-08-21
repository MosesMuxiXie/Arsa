/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class ghr
implements gho {
    private final dzq a;
    private final List<b> b;
    private final Set<epk<?>> c;

    ghr(dzq $$0, List<b> $$1, Set<epk<?>> $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    static Set<epk<?>> a(Set<epk<?>> $$0, dzq $$1, ghs<?> $$22) {
        List<epk<?>> $$3 = $$22.b();
        $$3.forEach($$2 -> {
            if ($$1.l().a($$2.f()) != $$2) {
                throw new IllegalStateException("Property " + String.valueOf($$2) + " is not defined for block " + String.valueOf($$1));
            }
            if ($$0.contains($$2)) {
                throw new IllegalStateException("Values of property " + String.valueOf($$2) + " already defined for block " + String.valueOf($$1));
            }
        });
        HashSet $$4 = new HashSet($$0);
        $$4.addAll($$3);
        return $$4;
    }

    public ghr a(ghs<hqr> $$0) {
        Set<epk<?>> $$12 = ghr.a(this.c, this.a, $$0);
        List<b> $$2 = this.b.stream().flatMap($$1 -> $$1.a($$0)).toList();
        return new ghr(this.a, $$2, $$12);
    }

    public ghr a(hqr $$0) {
        List<b> $$12 = this.b.stream().flatMap($$1 -> $$1.a($$0)).toList();
        return new ghr(this.a, $$12, this.c);
    }

    @Override
    public hqf b() {
        HashMap<String, hqh.b> $$0 = new HashMap<String, hqh.b>();
        for (b $$1 : this.b) {
            $$0.put($$1.a.a(), $$1.b.a());
        }
        return new hqf(Optional.of(new hqf.b($$0)), Optional.empty());
    }

    @Override
    public dzq a() {
        return this.a;
    }

    public static a a(dzq $$0) {
        return new a($$0);
    }

    public static ghr a(dzq $$0, ghm $$1) {
        return new ghr($$0, List.of(new b(ght.a, $$1)), Set.of());
    }

    static final class b
    extends Record {
        final ght a;
        final ghm b;

        b(ght $$0, ghm $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public Stream<b> a(ghs<hqr> $$02) {
            return $$02.a().entrySet().stream().map($$0 -> {
                ght $$1 = this.a.a((ght)$$0.getKey());
                ghm $$2 = this.b.a((hqr)$$0.getValue());
                return new b($$1, $$2);
            });
        }

        public Stream<b> a(hqr $$0) {
            return Stream.of(new b(this.a, this.b.a($$0)));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "properties;variant", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "properties;variant", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "properties;variant", "a", "b"}, this, $$0);
        }

        public ght a() {
            return this.a;
        }

        public ghm b() {
            return this.b;
        }
    }

    public static class a {
        private final dzq a;

        public a(dzq $$0) {
            this.a = $$0;
        }

        public ghr a(ghs<ghm> $$02) {
            Set<epk<?>> $$1 = ghr.a(Set.of(), this.a, $$02);
            List<b> $$2 = $$02.a().entrySet().stream().map($$0 -> new b((ght)$$0.getKey(), (ghm)$$0.getValue())).toList();
            return new ghr(this.a, $$2, $$1);
        }
    }
}

