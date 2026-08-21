/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Multimaps
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class iob
implements bat {
    public static final amo a = amo.b("block_or_item");
    private static final Logger b = LogUtils.getLogger();
    private static final amm c = amm.a("models");
    private Map<amo, ihj> d = Map.of();
    private Map<amo, ihf.a> e = Map.of();
    private final inl f;
    private final hou g;
    private final hpv h;
    private final ggr i;
    private hdc j = hdc.a;
    private hpl k = hpl.a;
    private inx.b l;
    private Object2IntMap<eoh> m = Object2IntMaps.emptyMap();

    public iob(ggr $$0, inl $$1, hou $$2) {
        this.i = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = new hpv(this);
    }

    public hqh a() {
        return this.l.b();
    }

    public ihj a(amo $$0) {
        return this.d.getOrDefault($$0, this.l.c());
    }

    public ihf.a b(amo $$0) {
        return this.e.getOrDefault($$0, ihf.a.a);
    }

    public hpv b() {
        return this.h;
    }

    @Override
    public final CompletableFuture<Void> reload(bat.b $$02, Executor $$1, bat.a $$2, Executor $$32) {
        baz $$4 = $$02.a();
        CompletableFuture<hdc> $$5 = CompletableFuture.supplyAsync(hdc::a, $$1);
        CompletionStage $$6 = $$5.thenApplyAsync($$0 -> hpl.a(new iki.a.a((hdc)$$0, this.f, this.g)), $$1);
        CompletableFuture<Map<amo, ioi>> $$7 = iob.a($$4, $$1);
        CompletableFuture<ino.b> $$8 = ino.a($$4, $$1);
        CompletableFuture<inp.a> $$9 = inp.a($$4, $$1);
        CompletionStage $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$3 -> iob.a((Map<amo, ioi>)((Map)$$7.join()), (ino.b)$$8.join(), (inp.a)$$9.join()), $$1);
        CompletionStage $$11 = $$8.thenApplyAsync($$0 -> iob.a(this.i, $$0), $$1);
        inl.d $$12 = $$02.a(inl.a);
        CompletableFuture<ill.a> $$13 = $$12.a(ml.d);
        CompletableFuture<ill.a> $$14 = $$12.a(ml.e);
        return ((CompletableFuture)((CompletableFuture)CompletableFuture.allOf(new CompletableFuture[]{$$13, $$14, $$10, $$11, $$8, $$9, $$5, $$6, $$7}).thenComposeAsync(arg_0 -> this.a($$13, $$14, (CompletableFuture)$$10, (CompletableFuture)$$11, $$7, $$5, $$8, $$9, (CompletableFuture)$$6, $$1, arg_0), $$1)).thenCompose($$2::wait)).thenAcceptAsync(this::a, $$32);
    }

    private static CompletableFuture<Map<amo, ioi>> a(baz $$0, Executor $$12) {
        return CompletableFuture.supplyAsync(() -> c.a($$0), $$12).thenCompose($$1 -> {
            ArrayList<CompletableFuture<@Nullable Pair>> $$2 = new ArrayList<CompletableFuture<Pair>>($$1.size());
            for (Map.Entry $$3 : $$1.entrySet()) {
                $$2.add(CompletableFuture.supplyAsync(() -> {
                    Pair pair;
                    block8: {
                        Object $$1 = c.b((amo)$$3.getKey());
                        @Nullable BufferedReader $$2 = ((bax)$$3.getValue()).e();
                        try {
                            pair = Pair.of((Object)$$1, (Object)hqe.a($$2));
                            if ($$2 == null) break block8;
                        }
                        catch (Throwable throwable) {
                            try {
                                if ($$2 != null) {
                                    try {
                                        ((Reader)$$2).close();
                                    }
                                    catch (Throwable throwable2) {
                                        throwable.addSuppressed(throwable2);
                                    }
                                }
                                throw throwable;
                            }
                            catch (Exception $$3) {
                                b.error("Failed to load model {}", $$3.getKey(), (Object)$$3);
                                return null;
                            }
                        }
                        ((Reader)$$2).close();
                    }
                    return pair;
                }, $$12));
            }
            return bhs.c($$2).thenApply($$0 -> $$0.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
        });
    }

    private static b a(Map<amo, ioi> $$0, ino.b $$12, inp.a $$2) {
        try (bzr $$3 = bzl.a().d("dependencies");){
            inz $$4 = new inz($$0, inv.a());
            $$4.a(hqj.a, new hqj());
            $$12.a().values().forEach($$4::a);
            $$2.a().values().forEach($$1 -> $$4.a($$1.a()));
            b b2 = new b($$4.a(), $$4.b());
            return b2;
        }
    }

    private static CompletableFuture<a> a(final ill.a $$0, final ill.a $$1, inx $$2, Object2IntMap<eoh> $$3, hdc $$4, hpl $$52, Executor $$6) {
        final Multimap $$7 = Multimaps.synchronizedMultimap((Multimap)HashMultimap.create());
        final Multimap $$8 = Multimaps.synchronizedMultimap((Multimap)HashMultimap.create());
        return $$2.a(new iog(){
            private final ilp e;
            private final ilp f;
            {
                this.e = $$0.d();
                this.f = $$1.d();
            }

            @Override
            public ilp a(ins $$02, iny $$12) {
                ilp $$72;
                ilp $$6;
                amo $$2 = $$02.a();
                boolean $$3 = $$2.equals(a);
                boolean $$4 = $$2.equals(ilo.e);
                boolean $$5 = $$2.equals(ilo.d);
                if (($$3 || $$4) && ($$6 = $$1.a($$02.b())) != null) {
                    return $$6;
                }
                if (($$3 || $$5) && ($$72 = $$0.a($$02.b())) != null) {
                    return $$72;
                }
                $$7.put((Object)$$12.debugName(), (Object)$$02);
                return $$4 ? this.f : this.e;
            }

            @Override
            public ilp a(String $$02, iny $$12) {
                $$8.put((Object)$$12.debugName(), (Object)$$02);
                return this.e;
            }
        }, $$6).thenApply($$5 -> {
            $$7.asMap().forEach(($$02, $$1) -> b.warn("Missing textures in model {}:\n{}", $$02, (Object)$$1.stream().sorted(ins.a).map($$0 -> "    " + String.valueOf($$0.a()) + ":" + String.valueOf($$0.b())).collect(Collectors.joining("\n"))));
            $$8.asMap().forEach(($$02, $$1) -> b.warn("Missing texture references in model {}:\n{}", $$02, (Object)$$1.stream().sorted().map($$0 -> "    " + $$0).collect(Collectors.joining("\n"))));
            Map<eoh, hqh> $$6 = iob.a($$5.b(), $$5.a().b());
            return new a((inx.a)$$5, $$3, $$6, $$4, $$52);
        });
    }

    private static Map<eoh, hqh> a(Map<eoh, hqh> $$0, hqh $$1) {
        try (bzr $$22 = bzl.a().d("block state dispatch");){
            IdentityHashMap<eoh, hqh> $$3 = new IdentityHashMap<eoh, hqh>($$0);
            for (dzq $$4 : mi.e) {
                $$4.l().a().forEach($$2 -> {
                    if ($$0.putIfAbsent((eoh)$$2, $$1) == null) {
                        b.warn("Missing model for variant: '{}'", $$2);
                    }
                });
            }
            IdentityHashMap<eoh, hqh> identityHashMap = $$3;
            return identityHashMap;
        }
    }

    private static Object2IntMap<eoh> a(ggr $$0, ino.b $$1) {
        try (bzr $$2 = bzl.a().d("block groups");){
            Object2IntMap<eoh> object2IntMap = ioa.a($$0, $$1);
            return object2IntMap;
        }
    }

    private void a(a $$0) {
        inx.a $$1 = $$0.a;
        this.d = $$1.c();
        this.e = $$1.d();
        this.m = $$0.b;
        this.l = $$1.a();
        this.h.a($$0.c);
        this.k = $$0.e;
        this.j = $$0.d;
    }

    public boolean a(eoh $$0, eoh $$1) {
        int $$3;
        if ($$0 == $$1) {
            return false;
        }
        int $$2 = this.m.getInt((Object)$$0);
        if ($$2 != -1 && $$2 == ($$3 = this.m.getInt((Object)$$1))) {
            flb $$5;
            flb $$4 = $$0.y();
            return $$4 != ($$5 = $$1.y());
        }
        return true;
    }

    public hpl c() {
        return this.k;
    }

    public Supplier<hdc> d() {
        return () -> this.j;
    }

    private /* synthetic */ CompletionStage a(CompletableFuture $$02, CompletableFuture $$1, CompletableFuture $$2, CompletableFuture $$3, CompletableFuture $$4, CompletableFuture $$5, CompletableFuture $$6, CompletableFuture $$7, CompletableFuture $$8, Executor $$9, Void $$10) {
        ill.a $$11 = (ill.a)$$02.join();
        ill.a $$12 = (ill.a)$$1.join();
        b $$13 = (b)$$2.join();
        Object2IntMap $$14 = (Object2IntMap)$$3.join();
        Sets.SetView $$15 = Sets.difference(((Map)$$4.join()).keySet(), $$13.b.keySet());
        if (!$$15.isEmpty()) {
            b.debug("Unreferenced models: \n{}", (Object)$$15.stream().sorted().map($$0 -> "\t" + String.valueOf($$0) + "\n").collect(Collectors.joining()));
        }
        inx $$16 = new inx((hdc)$$5.join(), this.f, this.g, ((ino.b)$$6.join()).a(), ((inp.a)$$7.join()).a(), $$13.b(), $$13.a());
        return iob.a($$11, $$12, $$16, (Object2IntMap<eoh>)$$14, (hdc)$$5.join(), (hpl)$$8.join(), $$9);
    }

    static final class b
    extends Record {
        private final iof a;
        final Map<amo, iof> b;

        b(iof $$0, Map<amo, iof> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "missing;models", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "missing;models", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "missing;models", "a", "b"}, this, $$0);
        }

        public iof a() {
            return this.a;
        }

        public Map<amo, iof> b() {
            return this.b;
        }
    }

    static final class a
    extends Record {
        final inx.a a;
        final Object2IntMap<eoh> b;
        final Map<eoh, hqh> c;
        final hdc d;
        final hpl e;

        a(inx.a $$0, Object2IntMap<eoh> $$1, Map<eoh, hqh> $$2, hdc $$3, hpl $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "bakedModels;modelGroups;modelCache;entityModelSet;specialBlockModelRenderer", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "bakedModels;modelGroups;modelCache;entityModelSet;specialBlockModelRenderer", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "bakedModels;modelGroups;modelCache;entityModelSet;specialBlockModelRenderer", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public inx.a a() {
            return this.a;
        }

        public Object2IntMap<eoh> b() {
            return this.b;
        }

        public Map<eoh, hqh> c() {
            return this.c;
        }

        public hdc d() {
            return this.d;
        }

        public hpl e() {
            return this.e;
        }
    }
}

