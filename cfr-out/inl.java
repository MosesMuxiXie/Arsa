/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class inl
implements bat,
inu,
AutoCloseable {
    private static final Logger b = LogUtils.getLogger();
    private static final List<a> c = List.of(new a(hpj.g, ml.a, false), new a(hpj.c, ml.b, false), new a(hpj.b, ml.c, false), new a(ilo.d, ml.d, true), new a(ilo.e, ml.e, false), new a(hpj.f, ml.f, false), new a(hpj.h, ml.g, false), new a(hpj.i, ml.h, false, Set.of(ind.c)), new a(hpj.j, ml.i, false), new a(hpj.k, ml.j, false), new a(ilo.f, ml.k, false), new a(hpj.d, ml.l, false), new a(hpj.a, ml.m, false), new a(hpj.e, ml.n, false), new a(hpj.l, ml.o, false));
    public static final bat.c<d> a = new bat.c();
    private final Map<amo, b> d = new HashMap<amo, b>();
    private final Map<amo, b> e = new HashMap<amo, b>();
    private Map<ins, ilp> f = Map.of();
    private int g;

    public inl(ilr $$0, int $$1) {
        for (a $$2 : c) {
            ilo $$3 = new ilo($$2.a);
            $$0.a($$2.a, $$3);
            b $$4 = new b($$3, $$2);
            this.d.put($$2.a, $$4);
            this.e.put($$2.b, $$4);
        }
        this.g = $$1;
    }

    public ilo a(amo $$0) {
        b $$1 = this.e.get($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("Invalid atlas id: " + String.valueOf($$0));
        }
        return $$1.a();
    }

    public void a(BiConsumer<amo, ilo> $$0) {
        this.e.forEach(($$1, $$2) -> $$0.accept((amo)$$1, $$2.a));
    }

    public void a(int $$0) {
        this.g = $$0;
    }

    @Override
    public void close() {
        this.f = Map.of();
        this.e.values().forEach(b::close);
        this.e.clear();
        this.d.clear();
    }

    @Override
    public ilp a(ins $$0) {
        ilp $$1 = this.f.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        amo $$2 = $$0.a();
        b $$3 = this.d.get($$2);
        if ($$3 == null) {
            throw new IllegalArgumentException("Invalid atlas texture id: " + String.valueOf($$2));
        }
        return $$3.a().f();
    }

    @Override
    public void prepareSharedState(bat.b $$0) {
        int $$1 = this.e.size();
        ArrayList<c> $$2 = new ArrayList<c>($$1);
        HashMap<amo, CompletableFuture<ill.a>> $$32 = new HashMap<amo, CompletableFuture<ill.a>>($$1);
        ArrayList $$42 = new ArrayList($$1);
        this.e.forEach(($$3, $$4) -> {
            CompletableFuture<ill.a> $$5 = new CompletableFuture<ill.a>();
            $$32.put((amo)$$3, $$5);
            $$2.add(new c((b)$$4, $$5));
            $$42.add($$5.thenCompose(ill.a::f));
        });
        CompletableFuture<Void> $$5 = CompletableFuture.allOf((CompletableFuture[])$$42.toArray(CompletableFuture[]::new));
        $$0.a(a, new d($$2, $$32, $$5));
    }

    @Override
    public CompletableFuture<Void> reload(bat.b $$0, Executor $$12, bat.a $$2, Executor $$3) {
        d $$4 = $$0.a(a);
        baz $$5 = $$0.a();
        $$4.a.forEach($$22 -> $$22.a.a($$5, $$12, this.g).whenComplete(($$1, $$2) -> {
            if ($$1 != null) {
                $$0.b.complete((ill.a)$$1);
            } else {
                $$0.b.completeExceptionally((Throwable)$$2);
            }
        }));
        return ((CompletableFuture)$$4.c.thenCompose($$2::wait)).thenAcceptAsync($$1 -> this.a($$4), $$3);
    }

    private void a(d $$0) {
        this.f = $$0.a();
        HashMap $$12 = new HashMap();
        this.f.forEach(($$1, $$2) -> {
            ilp $$3;
            if (!$$1.b().equals(ilf.c()) && ($$3 = $$12.putIfAbsent($$1.b(), $$2)) != null) {
                b.warn("Duplicate sprite {} from atlas {}, already defined in atlas {}. This will be rejected in a future version", new Object[]{$$1.b(), $$1.a(), $$3.h()});
            }
        });
    }

    public static final class a
    extends Record {
        final amo a;
        final amo b;
        final boolean c;
        final Set<azy<?>> d;

        public a(amo $$0, amo $$1, boolean $$2) {
            this($$0, $$1, $$2, Set.of());
        }

        public a(amo $$0, amo $$1, boolean $$2, Set<azy<?>> $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "textureId;definitionLocation;createMipmaps;additionalMetadata", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "textureId;definitionLocation;createMipmaps;additionalMetadata", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "textureId;definitionLocation;createMipmaps;additionalMetadata", "a", "b", "c", "d"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public amo b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }

        public Set<azy<?>> d() {
            return this.d;
        }
    }

    static final class b
    extends Record
    implements AutoCloseable {
        final ilo a;
        final a b;

        b(ilo $$0, a $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void close() {
            this.a.g();
        }

        CompletableFuture<ill.a> a(baz $$0, Executor $$1, int $$2) {
            return ill.a(this.a).a($$0, this.b.b, this.b.c ? $$2 : 0, $$1, this.b.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "atlas;config", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "atlas;config", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "atlas;config", "a", "b"}, this, $$0);
        }

        public ilo a() {
            return this.a;
        }

        public a b() {
            return this.b;
        }
    }

    public static class d {
        final List<c> a;
        private final Map<amo, CompletableFuture<ill.a>> b;
        final CompletableFuture<?> c;

        d(List<c> $$0, Map<amo, CompletableFuture<ill.a>> $$1, CompletableFuture<?> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public Map<ins, ilp> a() {
            HashMap<ins, ilp> $$0 = new HashMap<ins, ilp>();
            this.a.forEach($$1 -> $$1.a($$0));
            return $$0;
        }

        public CompletableFuture<ill.a> a(amo $$0) {
            return Objects.requireNonNull(this.b.get($$0));
        }
    }

    static final class c
    extends Record {
        final b a;
        final CompletableFuture<ill.a> b;

        c(b $$0, CompletableFuture<ill.a> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public void a(Map<ins, ilp> $$0) {
            ill.a $$12 = this.b.join();
            this.a.a.a($$12);
            $$12.e().forEach(($$1, $$2) -> $$0.put(new ins(this.a.b.a, (amo)$$1), (ilp)$$2));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "entry;preparations", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "entry;preparations", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "entry;preparations", "a", "b"}, this, $$0);
        }

        public b a() {
            return this.a;
        }

        public CompletableFuture<ill.a> b() {
            return this.b;
        }
    }
}

