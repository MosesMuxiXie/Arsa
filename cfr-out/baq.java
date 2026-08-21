/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class baq
implements baz {
    static final Logger c = LogUtils.getLogger();
    protected final List<d> a = Lists.newArrayList();
    private final azn d;
    private final String e;

    public baq(azn $$0, String $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public void a(azl $$0) {
        this.a($$0.b(), $$0, null);
    }

    public void a(azl $$0, Predicate<amo> $$1) {
        this.a($$0.b(), $$0, $$1);
    }

    public void a(String $$0, Predicate<amo> $$1) {
        this.a($$0, null, $$1);
    }

    private void a(String $$0, @Nullable azl $$1, @Nullable Predicate<amo> $$2) {
        this.a.add(new d($$0, $$1, $$2));
    }

    @Override
    public Set<String> a() {
        return ImmutableSet.of((Object)this.e);
    }

    @Override
    public Optional<bax> getResource(amo $$0) {
        for (int $$1 = this.a.size() - 1; $$1 >= 0; --$$1) {
            bar<InputStream> $$4;
            d $$2 = this.a.get($$1);
            azl $$3 = $$2.b;
            if ($$3 != null && ($$4 = $$3.a(this.d, $$0)) != null) {
                bar<bbb> $$5 = this.a($$0, $$1);
                return Optional.of(baq.a($$3, $$0, $$4, $$5));
            }
            if (!$$2.a($$0)) continue;
            c.warn("Resource {} not found, but was filtered by pack {}", (Object)$$0, (Object)$$2.a);
            return Optional.empty();
        }
        return Optional.empty();
    }

    private static bax a(azl $$0, amo $$1, bar<InputStream> $$2, bar<bbb> $$3) {
        return new bax($$0, baq.a($$1, $$0, $$2), $$3);
    }

    private static bar<InputStream> a(amo $$0, azl $$1, bar<InputStream> $$2) {
        if (c.isDebugEnabled()) {
            return () -> new c((InputStream)$$2.get(), $$0, $$1.b());
        }
        return $$2;
    }

    @Override
    public List<bax> a(amo $$0) {
        amo $$1 = baq.d($$0);
        ArrayList<bax> $$2 = new ArrayList<bax>();
        boolean $$3 = false;
        String $$4 = null;
        for (int $$5 = this.a.size() - 1; $$5 >= 0; --$$5) {
            bar<InputStream> $$8;
            d $$6 = this.a.get($$5);
            azl $$7 = $$6.b;
            if ($$7 != null && ($$8 = $$7.a(this.d, $$0)) != null) {
                bar<bbb> $$10;
                if ($$3) {
                    bar<bbb> $$9 = bbb.b;
                } else {
                    $$10 = () -> {
                        bar<InputStream> $$2 = $$7.a(this.d, $$1);
                        return $$2 != null ? baq.b($$2) : bbb.a;
                    };
                }
                $$2.add(new bax($$7, $$8, $$10));
            }
            if ($$6.a($$0)) {
                $$4 = $$6.a;
                break;
            }
            if (!$$6.a($$1)) continue;
            $$3 = true;
        }
        if ($$2.isEmpty() && $$4 != null) {
            c.warn("Resource {} not found, but was filtered by pack {}", (Object)$$0, $$4);
        }
        return Lists.reverse($$2);
    }

    private static boolean b(amo $$0) {
        return $$0.a().endsWith(".mcmeta");
    }

    private static amo c(amo $$0) {
        String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
        return $$0.e($$1);
    }

    static amo d(amo $$0) {
        return $$0.e($$0.a() + ".mcmeta");
    }

    @Override
    public Map<amo, bax> b(String $$0, Predicate<amo> $$1) {
        final class A
        extends Record {
            final azl a;
            final bar<InputStream> b;
            final int c;

            A(azl $$0, bar<InputStream> $$1, int $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "packResources;resource;packIndex", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "packResources;resource;packIndex", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "packResources;resource;packIndex", "a", "b", "c"}, this, $$0);
            }

            public azl a() {
                return this.a;
            }

            public bar<InputStream> b() {
                return this.b;
            }

            public int c() {
                return this.c;
            }
        }
        HashMap<amo, A> $$22 = new HashMap<amo, A>();
        HashMap $$32 = new HashMap();
        int $$4 = this.a.size();
        for (int $$52 = 0; $$52 < $$4; ++$$52) {
            d $$62 = this.a.get($$52);
            $$62.a($$22.keySet());
            $$62.a($$32.keySet());
            azl $$7 = $$62.b;
            if ($$7 == null) continue;
            int $$8 = $$52;
            $$7.a(this.d, this.e, $$0, ($$5, $$6) -> {
                if (baq.b($$5)) {
                    if ($$1.test(baq.c($$5))) {
                        $$32.put($$5, new A($$7, (bar<InputStream>)$$6, $$8));
                    }
                } else if ($$1.test((amo)$$5)) {
                    $$22.put((amo)$$5, new A($$7, (bar<InputStream>)$$6, $$8));
                }
            });
        }
        TreeMap $$9 = Maps.newTreeMap();
        $$22.forEach(($$2, $$3) -> {
            bar<bbb> $$7;
            amo $$4 = baq.d($$2);
            A $$5 = (A)$$32.get($$4);
            if ($$5 != null && $$5.c >= $$3.c) {
                bar<bbb> $$6 = baq.a($$5.b);
            } else {
                $$7 = bbb.b;
            }
            $$9.put($$2, baq.a($$3.a, $$2, $$3.b, $$7));
        });
        return $$9;
    }

    private bar<bbb> a(amo $$0, int $$1) {
        return () -> {
            amo $$2 = baq.d($$0);
            for (int $$3 = this.a.size() - 1; $$3 >= $$1; --$$3) {
                bar<InputStream> $$6;
                d $$4 = this.a.get($$3);
                azl $$5 = $$4.b;
                if ($$5 != null && ($$6 = $$5.a(this.d, $$2)) != null) {
                    return baq.b($$6);
                }
                if ($$4.a($$2)) break;
            }
            return bbb.a;
        };
    }

    private static bar<bbb> a(bar<InputStream> $$0) {
        return () -> baq.b($$0);
    }

    private static bbb b(bar<InputStream> $$0) throws IOException {
        try (InputStream $$1 = $$0.get();){
            bbb bbb2 = bbb.a($$1);
            return bbb2;
        }
    }

    private static void a(d $$0, Map<amo, b> $$1) {
        for (b $$2 : $$1.values()) {
            if ($$0.a($$2.a)) {
                $$2.c.clear();
                continue;
            }
            if (!$$0.a($$2.b())) continue;
            $$2.d.clear();
        }
    }

    private void a(d $$0, String $$1, Predicate<amo> $$2, Map<amo, b> $$32) {
        azl $$42 = $$0.b;
        if ($$42 == null) {
            return;
        }
        $$42.a(this.d, this.e, $$1, ($$3, $$4) -> {
            if (baq.b($$3)) {
                amo $$5 = baq.c($$3);
                if (!$$2.test($$5)) {
                    return;
                }
                $$1.computeIfAbsent($$5, (Function<amo, b>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, <init>(amo ), (Lamo;)Lbaq$b;)()).d.put($$42, (bar<InputStream>)$$4);
            } else {
                if (!$$2.test((amo)$$3)) {
                    return;
                }
                $$1.computeIfAbsent($$3, (Function<amo, b>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, <init>(amo ), (Lamo;)Lbaq$b;)()).c.add(new e($$42, (bar<InputStream>)$$4));
            }
        });
    }

    @Override
    public Map<amo, List<bax>> c(String $$0, Predicate<amo> $$1) {
        HashMap $$2 = Maps.newHashMap();
        for (d $$3 : this.a) {
            baq.a($$3, $$2);
            this.a($$3, $$0, $$1, $$2);
        }
        TreeMap $$4 = Maps.newTreeMap();
        for (b $$5 : $$2.values()) {
            if ($$5.c.isEmpty()) continue;
            ArrayList<bax> $$6 = new ArrayList<bax>();
            for (e $$7 : $$5.c) {
                azl $$8 = $$7.a;
                bar<InputStream> $$9 = $$5.d.get($$8);
                bar<bbb> $$10 = $$9 != null ? baq.a($$9) : bbb.b;
                $$6.add(baq.a($$8, $$5.a, $$7.b, $$10));
            }
            $$4.put($$5.a, $$6);
        }
        return $$4;
    }

    @Override
    public Stream<azl> b() {
        return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
    }

    static final class d
    extends Record {
        final String a;
        final @Nullable azl b;
        private final @Nullable Predicate<amo> c;

        d(String $$0, @Nullable azl $$1, @Nullable Predicate<amo> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(Collection<amo> $$0) {
            if (this.c != null) {
                $$0.removeIf(this.c);
            }
        }

        public boolean a(amo $$0) {
            return this.c != null && this.c.test($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "name;resources;filter", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "name;resources;filter", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "name;resources;filter", "a", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public @Nullable azl b() {
            return this.b;
        }

        public @Nullable Predicate<amo> c() {
            return this.c;
        }
    }

    static final class b
    extends Record {
        final amo a;
        private final amo b;
        final List<e> c;
        final Map<azl, bar<InputStream>> d;

        b(amo $$0) {
            this($$0, baq.d($$0), new ArrayList<e>(), (Map<azl, bar<InputStream>>)new Object2ObjectArrayMap());
        }

        private b(amo $$0, amo $$1, List<e> $$2, Map<azl, bar<InputStream>> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "fileLocation;metadataLocation;fileSources;metaSources", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "fileLocation;metadataLocation;fileSources;metaSources", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "fileLocation;metadataLocation;fileSources;metaSources", "a", "b", "c", "d"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public amo b() {
            return this.b;
        }

        public List<e> c() {
            return this.c;
        }

        public Map<azl, bar<InputStream>> d() {
            return this.d;
        }
    }

    static final class e
    extends Record {
        final azl a;
        final bar<InputStream> b;

        e(azl $$0, bar<InputStream> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "source;resource", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "source;resource", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "source;resource", "a", "b"}, this, $$0);
        }

        public azl a() {
            return this.a;
        }

        public bar<InputStream> b() {
            return this.b;
        }
    }

    static class c
    extends FilterInputStream {
        private final Supplier<String> a;
        private boolean b;

        public c(InputStream $$0, amo $$1, String $$2) {
            super($$0);
            Exception $$3 = new Exception("Stacktrace");
            this.a = () -> {
                StringWriter $$3 = new StringWriter();
                $$3.printStackTrace(new PrintWriter($$3));
                return "Leaked resource: '" + String.valueOf($$1) + "' loaded from pack: '" + $$2 + "'\n" + String.valueOf($$3);
            };
        }

        @Override
        public void close() throws IOException {
            super.close();
            this.b = true;
        }

        protected void finalize() throws Throwable {
            if (!this.b) {
                c.warn("{}", (Object)this.a.get());
            }
            super.finalize();
        }
    }
}

