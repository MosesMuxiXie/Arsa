/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface baz
extends bbc {
    public Set<String> a();

    public List<bax> a(amo var1);

    public Map<amo, bax> b(String var1, Predicate<amo> var2);

    public Map<amo, List<bax>> c(String var1, Predicate<amo> var2);

    public Stream<azl> b();

    public static final class a
    extends Enum<a>
    implements baz {
        public static final /* enum */ a a = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        @Override
        public Set<String> a() {
            return Set.of();
        }

        @Override
        public Optional<bax> getResource(amo $$0) {
            return Optional.empty();
        }

        @Override
        public List<bax> a(amo $$0) {
            return List.of();
        }

        @Override
        public Map<amo, bax> b(String $$0, Predicate<amo> $$1) {
            return Map.of();
        }

        @Override
        public Map<amo, List<bax>> c(String $$0, Predicate<amo> $$1) {
            return Map.of();
        }

        @Override
        public Stream<azl> b() {
            return Stream.of(new azl[0]);
        }

        private static /* synthetic */ a[] c() {
            return new a[]{a};
        }

        static {
            c = baz$a.c();
        }
    }
}

