/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public interface bgp {
    public static final bgp a = new bgp(){

        @Override
        public bgp a(f $$0) {
            return this;
        }

        @Override
        public void a(g $$0) {
        }
    };

    public bgp a(f var1);

    public void a(g var1);

    public static class j
    extends a
    implements AutoCloseable {
        private final Logger c;

        public j(Logger $$0) {
            this.c = $$0;
        }

        public j(f $$0, Logger $$1) {
            super($$0);
            this.c = $$1;
        }

        @Override
        public void close() {
            if (!this.a()) {
                this.c.warn("[{}] Serialization errors:\n{}", (Object)this.c.getName(), (Object)this.c());
            }
        }
    }

    public static class bgp$a
    implements bgp {
        public static final f b = () -> "";
        private final @Nullable bgp$a c;
        private final f d;
        private final Set<a> e;

        public bgp$a() {
            this(b);
        }

        public bgp$a(f $$0) {
            this.c = null;
            this.e = new LinkedHashSet<a>();
            this.d = $$0;
        }

        private bgp$a(bgp$a $$0, f $$1) {
            this.e = $$0.e;
            this.c = $$0;
            this.d = $$1;
        }

        @Override
        public bgp a(f $$0) {
            return new bgp$a(this, $$0);
        }

        @Override
        public void a(g $$0) {
            this.e.add(new a(this, $$0));
        }

        public boolean a() {
            return this.e.isEmpty();
        }

        public void a(BiConsumer<String, g> $$0) {
            ArrayList<f> $$1 = new ArrayList<f>();
            StringBuilder $$2 = new StringBuilder();
            for (a $$3 : this.e) {
                bgp$a $$4 = $$3.a;
                while ($$4 != null) {
                    $$1.add($$4.d);
                    $$4 = $$4.c;
                }
                for (int $$5 = $$1.size() - 1; $$5 >= 0; --$$5) {
                    $$2.append(((f)$$1.get($$5)).get());
                }
                $$0.accept($$2.toString(), $$3.b());
                $$2.setLength(0);
                $$1.clear();
            }
        }

        public String b() {
            HashMultimap $$02 = HashMultimap.create();
            this.a((arg_0, arg_1) -> ((Multimap)$$02).put(arg_0, arg_1));
            return $$02.asMap().entrySet().stream().map($$0 -> " at " + (String)$$0.getKey() + ": " + ((Collection)$$0.getValue()).stream().map(g::a).collect(Collectors.joining("; "))).collect(Collectors.joining("\n"));
        }

        public String c() {
            ArrayList<f> $$0 = new ArrayList<f>();
            b $$1 = new b(this.d);
            for (a $$2 : this.e) {
                bgp$a $$3 = $$2.a;
                while ($$3 != this) {
                    $$0.add($$3.d);
                    $$3 = $$3.c;
                }
                b $$4 = $$1;
                for (int $$5 = $$0.size() - 1; $$5 >= 0; --$$5) {
                    $$4 = $$4.a((f)$$0.get($$5));
                }
                $$0.clear();
                $$4.b.add($$2.b);
            }
            return String.join((CharSequence)"\n", $$1.a());
        }

        static final class a
        extends Record {
            final bgp$a a;
            final g b;

            a(bgp$a $$0, g $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "source;problem", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "source;problem", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "source;problem", "a", "b"}, this, $$0);
            }

            public bgp$a a() {
                return this.a;
            }

            public g b() {
                return this.b;
            }
        }

        static final class b
        extends Record {
            private final f a;
            final List<g> b;
            private final Map<f, b> c;

            public b(f $$0) {
                this($$0, new ArrayList<g>(), new LinkedHashMap<f, b>());
            }

            private b(f $$0, List<g> $$1, Map<f, b> $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            public b a(f $$0) {
                return this.c.computeIfAbsent($$0, b::new);
            }

            public List<String> a() {
                int $$02 = this.b.size();
                int $$12 = this.c.size();
                if ($$02 == 0 && $$12 == 0) {
                    return List.of();
                }
                if ($$02 == 0 && $$12 == 1) {
                    ArrayList<String> $$22 = new ArrayList<String>();
                    this.c.forEach(($$1, $$2) -> $$22.addAll($$2.a()));
                    $$22.set(0, this.a.get() + (String)$$22.get(0));
                    return $$22;
                }
                if ($$02 == 1 && $$12 == 0) {
                    return List.of(this.a.get() + ": " + this.b.getFirst().a());
                }
                ArrayList<String> $$3 = new ArrayList<String>();
                this.c.forEach(($$1, $$2) -> $$3.addAll($$2.a()));
                $$3.replaceAll($$0 -> "  " + $$0);
                for (g $$4 : this.b) {
                    $$3.add("  " + $$4.a());
                }
                $$3.addFirst(this.a.get() + ":");
                return $$3;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "element;problems;children", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "element;problems;children", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "element;problems;children", "a", "b", "c"}, this, $$0);
            }

            public f b() {
                return this.a;
            }

            public List<g> c() {
                return this.b;
            }

            public Map<f, b> d() {
                return this.c;
            }
        }
    }

    public record b(amt<?> a) implements f
    {
        @Override
        public String get() {
            return "->{" + String.valueOf(this.a.a()) + "@" + String.valueOf(this.a.b()) + "}";
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id", "a"}, this, $$0);
        }
    }

    public record e(int a) implements f
    {
        @Override
        public String get() {
            return "[" + this.a + "]";
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "index", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "index", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "index", "a"}, this, $$0);
        }
    }

    public record d(String a, int b) implements f
    {
        @Override
        public String get() {
            return "." + this.a + "[" + this.b + "]";
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "name;index", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "name;index", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "name;index", "a", "b"}, this, $$0);
        }
    }

    public record c(String a) implements f
    {
        @Override
        public String get() {
            return "." + this.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "name", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "name", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "name", "a"}, this, $$0);
        }
    }

    public record h(amt<?> a) implements f
    {
        @Override
        public String get() {
            return "{" + String.valueOf(this.a.a()) + "@" + String.valueOf(this.a.b()) + "}";
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "id", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "id", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "id", "a"}, this, $$0);
        }
    }

    public record i(String a) implements f
    {
        @Override
        public String get() {
            return this.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "name", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "name", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "name", "a"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface f {
        public String get();
    }

    public static interface g {
        public String a();
    }
}

