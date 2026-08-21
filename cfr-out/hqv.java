/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.slf4j.Logger
 */
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import org.slf4j.Logger;

public final class hqv
extends Record
implements hqu {
    private final Map<String, b> c;
    static final Logger d = LogUtils.getLogger();
    public static final Codec<hqv> b = bfm.d(Codec.unboundedMap((Codec)Codec.STRING, hqv$b.a)).xmap(hqv::new, hqv::a);

    public hqv(Map<String, b> $$0) {
        this.c = $$0;
    }

    @Override
    public <O, S extends eoj<O, S>> Predicate<S> instantiate(eoi<O, S> $$0) {
        ArrayList $$1 = new ArrayList(this.c.size());
        this.c.forEach(($$2, $$3) -> $$1.add(hqv.a($$0, $$2, $$3)));
        return bhs.a($$1);
    }

    private static <O, S extends eoj<O, S>> Predicate<S> a(eoi<O, S> $$0, String $$1, b $$2) {
        epk<?> $$3 = $$0.a($$1);
        if ($$3 == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Unknown property '%s' on '%s'", $$1, $$0.c()));
        }
        return $$2.a($$0.c(), $$3);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqv.class, "tests", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqv.class, "tests", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqv.class, "tests", "c"}, this, $$0);
    }

    public Map<String, b> a() {
        return this.c;
    }

    public static final class b
    extends Record {
        private final List<a> b;
        private static final char c = '|';
        private static final Joiner d = Joiner.on((char)'|');
        private static final Splitter e = Splitter.on((char)'|');
        private static final Codec<String> f = Codec.either((Codec)Codec.INT, (Codec)Codec.BOOL).flatComapMap($$0 -> (String)$$0.map(String::valueOf, String::valueOf), $$0 -> DataResult.error(() -> "This codec can't be used for encoding"));
        public static final Codec<b> a = Codec.withAlternative((Codec)Codec.STRING, f).comapFlatMap(b::a, b::toString);

        public b(List<a> $$0) {
            if ($$0.isEmpty()) {
                throw new IllegalArgumentException("Empty value for property");
            }
            this.b = $$0;
        }

        public static DataResult<b> a(String $$0) {
            List<a> $$1 = e.splitToStream((CharSequence)$$0).map(a::a).toList();
            if ($$1.isEmpty()) {
                return DataResult.error(() -> "Empty value for property");
            }
            for (a $$2 : $$1) {
                if (!$$2.a.isEmpty()) continue;
                return DataResult.error(() -> "Empty term in value '" + $$0 + "'");
            }
            return DataResult.success((Object)new b($$1));
        }

        @Override
        public String toString() {
            return d.join(this.b);
        }

        public <O, S extends eoj<O, S>, T extends Comparable<T>> Predicate<S> a(O $$02, epk<T> $$1) {
            ArrayList $$11;
            boolean $$9;
            List $$22 = bhs.b(Lists.transform(this.b, $$2 -> this.a($$02, $$1, (a)$$2)));
            ArrayList<T> $$32 = new ArrayList<T>($$1.a());
            int $$4 = $$32.size();
            $$32.removeIf($$22.negate());
            int $$5 = $$32.size();
            if ($$5 == 0) {
                d.warn("Condition {} for property {} on {} is always false", new Object[]{this, $$1.f(), $$02});
                return $$0 -> false;
            }
            int $$6 = $$4 - $$5;
            if ($$6 == 0) {
                d.warn("Condition {} for property {} on {} is always true", new Object[]{this, $$1.f(), $$02});
                return $$0 -> true;
            }
            if ($$5 <= $$6) {
                boolean $$7 = false;
                ArrayList<T> $$8 = $$32;
            } else {
                $$9 = true;
                ArrayList $$10 = new ArrayList($$1.a());
                $$10.removeIf((Predicate<T>)((Object)$$22));
                $$11 = $$10;
            }
            if ($$11.size() == 1) {
                Comparable $$12 = (Comparable)$$11.getFirst();
                return $$3 -> {
                    Object $$4 = $$3.c($$1);
                    return $$12.equals($$4) ^ $$9;
                };
            }
            return $$3 -> {
                Object $$4 = $$3.c($$1);
                return $$11.contains($$4) ^ $$9;
            };
        }

        private <T extends Comparable<T>> T a(Object $$0, epk<T> $$1, String $$2) {
            Optional<T> $$3 = $$1.b($$2);
            if ($$3.isEmpty()) {
                throw new RuntimeException(String.format(Locale.ROOT, "Unknown value '%s' for property '%s' on '%s' in '%s'", $$2, $$1, $$0, this));
            }
            return (T)((Comparable)$$3.get());
        }

        private <T extends Comparable<T>> Predicate<T> a(Object $$0, epk<T> $$12, a $$2) {
            Object $$3 = this.a($$0, $$12, $$2.a);
            if ($$2.b) {
                return $$1 -> !$$1.equals($$3);
            }
            return $$1 -> $$1.equals($$3);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "entries", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "entries", "b"}, this, $$0);
        }

        public List<a> a() {
            return this.b;
        }
    }

    public static final class a
    extends Record {
        final String a;
        final boolean b;
        private static final String c = "!";

        public a(String $$0, boolean $$1) {
            if ($$0.isEmpty()) {
                throw new IllegalArgumentException("Empty term");
            }
            this.a = $$0;
            this.b = $$1;
        }

        public static a a(String $$0) {
            if ($$0.startsWith(c)) {
                return new a($$0.substring(1), true);
            }
            return new a($$0, false);
        }

        @Override
        public String toString() {
            return this.b ? c + this.a : this.a;
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value;negated", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value;negated", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }
}

