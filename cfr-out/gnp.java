/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gnp
implements bat,
AutoCloseable {
    static final Logger b = LogUtils.getLogger();
    private static final String c = "fonts.json";
    public static final amo a = amo.b("missing");
    private static final amm d = amm.a("font");
    private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    final gnr f;
    private final List<fwq> g = new ArrayList<fwq>();
    private final Map<amo, gnr> h = new HashMap<amo, gnr>();
    private final ilr i;
    private final c j = new c(false);
    private final c k = new c(true);
    private final inl l;
    private final Map<amo, gnm> m = new HashMap<amo, gnm>();
    final gnw n;

    public gnp(ilr $$0, inl $$1, hou $$2) {
        this.i = $$0;
        this.l = $$1;
        this.f = this.a(a, List.of(gnp.c()), Set.of());
        this.n = new gnw($$2);
    }

    private gnr a(amo $$0, List<fwq.a> $$1, Set<gnq> $$2) {
        gnu $$3 = new gnu(this.i, $$0);
        gnr $$4 = new gnr($$3);
        $$4.a($$1, $$2);
        return $$4;
    }

    private static fwq.a c() {
        return new fwq.a(new gnl(), gnq.a.b);
    }

    @Override
    public CompletableFuture<Void> reload(bat.b $$02, Executor $$1, bat.a $$2, Executor $$3) {
        return ((CompletableFuture)this.a($$02.a(), $$1).thenCompose($$2::wait)).thenAcceptAsync($$0 -> this.a((e)$$0, bzl.a()), $$3);
    }

    private CompletableFuture<e> a(baz $$0, Executor $$12) {
        ArrayList<CompletableFuture<f>> $$2 = new ArrayList<CompletableFuture<f>>();
        for (Map.Entry<amo, List<bax>> $$3 : d.b($$0).entrySet()) {
            amo $$4 = d.b($$3.getKey());
            $$2.add(CompletableFuture.supplyAsync(() -> {
                List<Pair<a, goj.a>> $$4 = gnp.a((List<bax>)((List)$$3.getValue()), $$4);
                f $$52 = new f($$4);
                for (Pair<a, goj.a> $$6 : $$4) {
                    a $$7 = (a)$$6.getFirst();
                    gnq.a $$8 = ((goj.a)$$6.getSecond()).b();
                    ((goj.a)$$6.getSecond()).a().b().ifLeft($$5 -> {
                        CompletableFuture<Optional<fwq>> $$6 = this.a($$7, (goj.b)$$5, $$0, $$12);
                        $$52.a($$7, $$8, $$6);
                    }).ifRight($$3 -> $$52.a($$7, $$8, (goj.c)$$3));
                }
                return $$52;
            }, $$12));
        }
        return bhs.c($$2).thenCompose($$1 -> {
            List $$2 = $$1.stream().flatMap(f::d).collect(bhs.b());
            fwq.a $$32 = gnp.c();
            $$2.add(CompletableFuture.completedFuture(Optional.of($$32.a())));
            return bhs.c($$2).thenCompose($$3 -> {
                Map<amo, List<fwq.a>> $$4 = this.a((List<f>)$$1);
                CompletableFuture[] $$5 = (CompletableFuture[])$$4.values().stream().map($$2 -> CompletableFuture.runAsync(() -> this.a((List<fwq.a>)$$2, $$32), $$12)).toArray(CompletableFuture[]::new);
                return CompletableFuture.allOf($$5).thenApply($$2 -> {
                    List<fwq> $$3 = $$3.stream().flatMap(Optional::stream).toList();
                    return new e($$4, $$3);
                });
            });
        });
    }

    private CompletableFuture<Optional<fwq>> a(a $$0, goj.b $$1, baz $$2, Executor $$3) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return Optional.of($$1.load($$2));
            }
            catch (Exception $$3) {
                b.warn("Failed to load builder {}, rejecting", (Object)$$0, (Object)$$3);
                return Optional.empty();
            }
        }, $$3);
    }

    private Map<amo, List<fwq.a>> a(List<f> $$0) {
        HashMap<amo, List<fwq.a>> $$12 = new HashMap<amo, List<fwq.a>>();
        bfg<amo, f> $$2 = new bfg<amo, f>();
        $$0.forEach($$1 -> $$2.a($$1.a, (f)$$1));
        $$2.a((K $$1, V $$22) -> $$22.a($$12::get).ifPresent($$2 -> $$12.put((amo)$$1, (List<fwq.a>)$$2)));
        return $$12;
    }

    private void a(List<fwq.a> $$0, fwq.a $$12) {
        $$0.add(0, $$12);
        IntOpenHashSet $$2 = new IntOpenHashSet();
        for (fwq.a $$3 : $$0) {
            $$2.addAll((IntCollection)$$3.a().a());
        }
        $$2.forEach($$1 -> {
            fwq.a $$2;
            if ($$1 == 32) {
                return;
            }
            Iterator iterator = Lists.reverse((List)$$0).iterator();
            while (iterator.hasNext() && ($$2 = (fwq.a)iterator.next()).a().a($$1) == null) {
            }
        });
    }

    private static Set<gnq> b(gfo $$0) {
        EnumSet<gnq> $$1 = EnumSet.noneOf(gnq.class);
        if ($$0.ac().b().booleanValue()) {
            $$1.add(gnq.a);
        }
        if ($$0.ad().b().booleanValue()) {
            $$1.add(gnq.b);
        }
        return $$1;
    }

    private void a(e $$02, bzm $$12) {
        $$12.a("closing");
        this.j.b();
        this.k.b();
        this.h.values().forEach(gnr::close);
        this.h.clear();
        this.g.forEach(fwq::close);
        this.g.clear();
        Set<gnq> $$22 = gnp.b(gfj.V().k);
        $$12.b("reloading");
        $$02.a().forEach(($$1, $$2) -> this.h.put((amo)$$1, this.a((amo)$$1, Lists.reverse((List)$$2), $$22)));
        this.g.addAll($$02.b);
        $$12.c();
        if (!this.h.containsKey(gfj.a)) {
            throw new IllegalStateException("Default font failed to load");
        }
        this.m.clear();
        this.l.a((amo $$0, ilo $$1) -> this.m.put((amo)$$0, new gnm((ilo)$$1)));
    }

    public void a(gfo $$0) {
        Set<gnq> $$1 = gnp.b($$0);
        for (gnr $$2 : this.h.values()) {
            $$2.a($$1);
        }
    }

    private static List<Pair<a, goj.a>> a(List<bax> $$0, amo $$1) {
        ArrayList<Pair<a, goj.a>> $$2 = new ArrayList<Pair<a, goj.a>>();
        for (bax $$3 : $$0) {
            try {
                BufferedReader $$4 = $$3.e();
                try {
                    JsonElement $$5 = (JsonElement)e.fromJson((Reader)$$4, JsonElement.class);
                    d $$6 = (d)gnp$d.a.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$5).getOrThrow(JsonParseException::new);
                    List<goj.a> $$7 = $$6.b;
                    for (int $$8 = $$7.size() - 1; $$8 >= 0; --$$8) {
                        a $$9 = new a($$1, $$3.b(), $$8);
                        $$2.add((Pair<a, goj.a>)Pair.of((Object)$$9, (Object)$$7.get($$8)));
                    }
                }
                finally {
                    if ($$4 == null) continue;
                    ((Reader)$$4).close();
                }
            }
            catch (Exception $$10) {
                b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, c, $$3.b(), $$10});
            }
        }
        return $$2;
    }

    public gio a() {
        return new gio(this.j);
    }

    public gio b() {
        return new gio(this.k);
    }

    gnr a(amo $$0) {
        return this.h.getOrDefault($$0, this.f);
    }

    gip a(ym.a $$0) {
        gnm $$1 = this.m.get($$0.a());
        if ($$1 == null) {
            return this.f.a(false);
        }
        return $$1.a($$0.b());
    }

    @Override
    public void close() {
        this.j.close();
        this.k.close();
        this.h.values().forEach(gnr::close);
        this.g.forEach(fwq::close);
        this.f.close();
    }

    class c
    implements gio.e,
    AutoCloseable {
        private final boolean b;
        private volatile @Nullable a c;
        private volatile @Nullable goc d;

        c(boolean $$0) {
            this.b = $$0;
        }

        public void b() {
            this.c = null;
            this.d = null;
        }

        @Override
        public void close() {
            this.b();
        }

        private gip b(ym $$0) {
            ym ym2 = $$0;
            Objects.requireNonNull(ym2);
            ym ym3 = ym2;
            int n2 = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ym.c.class, ym.a.class, ym.b.class}, (Object)ym3, n2)) {
                case 0 -> {
                    ym.c $$1 = (ym.c)ym3;
                    yield gnp.this.a($$1.a()).a(this.b);
                }
                case 1 -> {
                    ym.a $$2 = (ym.a)ym3;
                    yield gnp.this.a($$2);
                }
                case 2 -> {
                    ym.b $$3 = (ym.b)ym3;
                    yield gnp.this.n.a($$3);
                }
                default -> gnp.this.f.a(this.b);
            };
        }

        @Override
        public gip a(ym $$0) {
            a $$1 = this.c;
            if ($$1 != null && $$0.equals($$1.a)) {
                return $$1.b;
            }
            gip $$2 = this.b($$0);
            this.c = new a($$0, $$2);
            return $$2;
        }

        @Override
        public goc a() {
            goc $$0 = this.d;
            if ($$0 == null) {
                this.d = $$0 = gnp.this.a(ym.b.a()).a();
            }
            return $$0;
        }

        static final class a
        extends Record {
            final ym a;
            final gip b;

            a(ym $$0, gip $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "description;source", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "description;source", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "description;source", "a", "b"}, this, $$0);
            }

            public ym a() {
                return this.a;
            }

            public gip b() {
                return this.b;
            }
        }
    }

    record a(amo a, String b, int c) {
        @Override
        public String toString() {
            return "(" + String.valueOf(this.a) + ": builder #" + this.c + " from pack " + this.b + ")";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "fontId;pack;index", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "fontId;pack;index", "a", "b", "c"}, this, $$0);
        }
    }

    static final class e
    extends Record {
        private final Map<amo, List<fwq.a>> a;
        final List<fwq> b;

        e(Map<amo, List<fwq.a>> $$0, List<fwq> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "fontSets;allProviders", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "fontSets;allProviders", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "fontSets;allProviders", "a", "b"}, this, $$0);
        }

        public Map<amo, List<fwq.a>> a() {
            return this.a;
        }

        public List<fwq> b() {
            return this.b;
        }
    }

    static final class d
    extends Record {
        final List<goj.a> b;
        public static final Codec<d> a = RecordCodecBuilder.create($$0 -> $$0.group((App)goj.a.a.listOf().fieldOf("providers").forGetter(d::a)).apply((Applicative)$$0, d::new));

        private d(List<goj.a> $$0) {
            this.b = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "providers", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "providers", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "providers", "b"}, this, $$0);
        }

        public List<goj.a> a() {
            return this.b;
        }
    }

    static final class f
    extends Record
    implements bfg.a<amo> {
        final amo a;
        private final List<b> b;
        private final Set<amo> c;

        public f(amo $$0) {
            this($$0, new ArrayList<b>(), new HashSet<amo>());
        }

        private f(amo $$0, List<b> $$1, Set<amo> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(a $$0, gnq.a $$1, goj.c $$2) {
            this.b.add(new b($$0, $$1, (Either<CompletableFuture<Optional<fwq>>, amo>)Either.right((Object)$$2.a())));
            this.c.add($$2.a());
        }

        public void a(a $$0, gnq.a $$1, CompletableFuture<Optional<fwq>> $$2) {
            this.b.add(new b($$0, $$1, (Either<CompletableFuture<Optional<fwq>>, amo>)Either.left($$2)));
        }

        private Stream<CompletableFuture<Optional<fwq>>> d() {
            return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
        }

        public Optional<List<fwq.a>> a(Function<amo, List<fwq.a>> $$0) {
            ArrayList $$1 = new ArrayList();
            for (b $$2 : this.b) {
                Optional<List<fwq.a>> $$3 = $$2.a($$0);
                if ($$3.isPresent()) {
                    $$1.addAll($$3.get());
                    continue;
                }
                return Optional.empty();
            }
            return Optional.of($$1);
        }

        @Override
        public void a(Consumer<amo> $$0) {
            this.c.forEach($$0);
        }

        @Override
        public void b(Consumer<amo> $$0) {
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "fontId;builders;dependencies", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "fontId;builders;dependencies", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "fontId;builders;dependencies", "a", "b", "c"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public List<b> b() {
            return this.b;
        }

        public Set<amo> c() {
            return this.c;
        }
    }

    static final class b
    extends Record {
        private final a a;
        private final gnq.a b;
        final Either<CompletableFuture<Optional<fwq>>, amo> c;

        b(a $$0, gnq.a $$1, Either<CompletableFuture<Optional<fwq>>, amo> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public Optional<List<fwq.a>> a(Function<amo, @Nullable List<fwq.a>> $$0) {
            return (Optional)this.c.map($$02 -> ((Optional)$$02.join()).map($$0 -> List.of(new fwq.a((fwq)$$0, this.b))), $$1 -> {
                List $$2 = (List)$$0.apply((amo)$$1);
                if ($$2 == null) {
                    b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, (Object)this.a);
                    return Optional.empty();
                }
                return Optional.of($$2.stream().map(this::a).toList());
            });
        }

        private fwq.a a(fwq.a $$0) {
            return new fwq.a($$0.a(), this.b.a($$0.b()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;filter;result", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;filter;result", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;filter;result", "a", "b", "c"}, this, $$0);
        }

        public a a() {
            return this.a;
        }

        public gnq.a b() {
            return this.b;
        }

        public Either<CompletableFuture<Optional<fwq>>, amo> c() {
            return this.c;
        }
    }
}

