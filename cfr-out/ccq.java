/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Reference2FloatMap
 *  it.unimi.dsi.fastutil.objects.Reference2FloatMaps
 *  it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Reference2FloatMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadFactory;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ccq
implements AutoCloseable {
    static final Logger a = LogUtils.getLogger();
    private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
    private static final String c = "new_";
    static final yh d = yh.c("optimizeWorld.stage.upgrading.poi");
    static final yh e = yh.c("optimizeWorld.stage.finished.poi");
    static final yh f = yh.c("optimizeWorld.stage.upgrading.entities");
    static final yh g = yh.c("optimizeWorld.stage.finished.entities");
    static final yh h = yh.c("optimizeWorld.stage.upgrading.chunks");
    static final yh i = yh.c("optimizeWorld.stage.finished.chunks");
    final jq<esi> j;
    final Set<amt<dwo>> k;
    final boolean l;
    final boolean m;
    final fni.c n;
    private final Thread o;
    final DataFixer p;
    volatile boolean q = true;
    private volatile boolean r;
    volatile float s;
    volatile int t;
    volatile int u;
    volatile int v;
    volatile int w;
    final Reference2FloatMap<amt<dwo>> x = Reference2FloatMaps.synchronize((Reference2FloatMap)new Reference2FloatOpenHashMap());
    volatile yh y = yh.c("optimizeWorld.stage.counting");
    static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
    final fnc A;

    public ccq(fni.c $$02, DataFixer $$12, fnt $$2, jr $$3, boolean $$4, boolean $$5) {
        this.j = $$3.f(mj.bF);
        this.k = this.j.j().stream().map(mj::a).collect(Collectors.toUnmodifiableSet());
        this.l = $$4;
        this.p = $$12;
        this.n = $$02;
        this.A = new fnc(this.n.a(dwo.h).resolve("data"), $$12, $$3);
        this.m = $$5;
        this.o = b.newThread(this::i);
        this.o.setUncaughtExceptionHandler(($$0, $$1) -> {
            a.error("Error upgrading world", $$1);
            this.y = yh.c("optimizeWorld.stage.failed");
            this.r = true;
        });
        this.o.start();
    }

    public void a() {
        this.q = false;
        try {
            this.o.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    private void i() {
        long $$0 = bhs.c();
        a.info("Upgrading entities");
        new d(this).a();
        a.info("Upgrading POIs");
        new f(this).a();
        a.info("Upgrading blocks");
        new b().a();
        this.A.b();
        $$0 = bhs.c() - $$0;
        a.info("World optimizaton finished after {} seconds", (Object)($$0 / 1000L));
        this.r = true;
    }

    public boolean b() {
        return this.r;
    }

    public Set<amt<dwo>> c() {
        return this.k;
    }

    public float a(amt<dwo> $$0) {
        return this.x.getFloat($$0);
    }

    public float d() {
        return this.s;
    }

    public int e() {
        return this.t;
    }

    public int f() {
        return this.v;
    }

    public int g() {
        return this.w;
    }

    public yh h() {
        return this.y;
    }

    @Override
    public void close() {
        this.A.close();
    }

    static Path a(Path $$0) {
        return $$0.resolveSibling(c + $$0.getFileName().toString());
    }

    class d
    extends g {
        d(ccq ccq2) {
            super(bhz.v, "entities", f, g);
        }

        @Override
        protected uz a(esd $$0, uz $$1) {
            return $$0.a($$1, -1);
        }
    }

    class f
    extends g {
        f(ccq ccq2) {
            super(bhz.t, "poi", d, e);
        }

        @Override
        protected uz a(esd $$0, uz $$1) {
            return $$0.a($$1, 1945);
        }
    }

    class b
    extends a {
        b() {
            super(bhz.d, "chunk", "region", h, i);
        }

        @Override
        protected boolean a(esd $$0, dvu $$1, amt<dwo> $$2) {
            uz $$3 = $$0.d($$1).join().orElse(null);
            if ($$3 != null) {
                boolean $$8;
                int $$4 = vo.f($$3);
                eqg $$5 = ccq.this.j.g(mj.b($$2)).b();
                uz $$6 = $$0.a($$3, -1, awj.a($$2, $$5.c()));
                dvu $$7 = new dvu($$6.b("xPos", 0), $$6.b("zPos", 0));
                if (!$$7.equals($$1)) {
                    a.warn("Chunk {} has invalid position {}", (Object)$$1, (Object)$$7);
                }
                boolean bl2 = $$8 = $$4 < w.b().a().b();
                if (ccq.this.l) {
                    $$8 = $$8 || $$6.b("Heightmaps");
                    $$6.r("Heightmaps");
                    $$8 = $$8 || $$6.b("isLightOn");
                    $$6.r("isLightOn");
                    vf $$9 = $$6.p("sections");
                    for (int $$10 = 0; $$10 < $$9.size(); ++$$10) {
                        Optional<uz> $$11 = $$9.a($$10);
                        if ($$11.isEmpty()) continue;
                        uz $$12 = $$11.get();
                        $$8 = $$8 || $$12.b("BlockLight");
                        $$12.r("BlockLight");
                        $$8 = $$8 || $$12.b("SkyLight");
                        $$12.r("SkyLight");
                    }
                }
                if ($$8 || ccq.this.m) {
                    if (this.a != null) {
                        this.a.join();
                    }
                    this.a = $$0.a($$1, $$6);
                    return true;
                }
            }
            return false;
        }

        @Override
        protected esd a(esa $$0, Path $$1) {
            Supplier<eru> $$2 = ffj.a($$0.b(), () -> ccq.this.A, ccq.this.p);
            return ccq.this.m ? new erv($$0.a("source"), $$1, $$0.a("target"), ccq.a($$1), ccq.this.p, true, bhz.d, $$2) : new esd($$0, $$1, ccq.this.p, true, bhz.d, $$2);
        }
    }

    abstract class g
    extends a {
        g(bhz $$0, String $$1, yh $$2, yh $$3) {
            super($$0, $$1, $$1, $$2, $$3);
        }

        @Override
        protected esd a(esa $$0, Path $$1) {
            return ccq.this.m ? new erv($$0.a("source"), $$1, $$0.a("target"), ccq.a($$1), ccq.this.p, true, this.b, eru.a) : new esd($$0, $$1, ccq.this.p, true, this.b);
        }

        @Override
        protected boolean a(esd $$0, dvu $$1, amt<dwo> $$2) {
            uz $$3 = $$0.d($$1).join().orElse(null);
            if ($$3 != null) {
                boolean $$6;
                int $$4 = vo.f($$3);
                uz $$5 = this.a($$0, $$3);
                boolean bl2 = $$6 = $$4 < w.b().a().b();
                if ($$6 || ccq.this.m) {
                    if (this.a != null) {
                        this.a.join();
                    }
                    this.a = $$0.a($$1, $$5);
                    return true;
                }
            }
            return false;
        }

        protected abstract uz a(esd var1, uz var2);
    }

    abstract class a {
        private final yh d;
        private final yh e;
        private final String f;
        private final String g;
        protected @Nullable CompletableFuture<Void> a;
        protected final bhz b;

        a(bhz $$0, String $$1, String $$2, yh $$3, yh $$4) {
            this.b = $$0;
            this.f = $$1;
            this.g = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        public void a() {
            ccq.this.u = 0;
            ccq.this.t = 0;
            ccq.this.v = 0;
            ccq.this.w = 0;
            List<c> $$0 = this.b();
            if (ccq.this.t == 0) {
                return;
            }
            float $$1 = ccq.this.u;
            ccq.this.y = this.d;
            while (ccq.this.q) {
                boolean $$2 = false;
                float $$3 = 0.0f;
                for (c $$4 : $$0) {
                    amt<dwo> $$5 = $$4.a;
                    ListIterator<e> $$6 = $$4.c;
                    esd $$7 = $$4.b;
                    if ($$6.hasNext()) {
                        e $$8 = $$6.next();
                        boolean $$9 = true;
                        for (dvu $$10 : $$8.b) {
                            $$9 = $$9 && this.a($$5, $$7, $$10);
                            $$2 = true;
                        }
                        if (ccq.this.m) {
                            if ($$9) {
                                this.a($$8.a);
                            } else {
                                a.error("Failed to convert region file {}", (Object)$$8.a.a());
                            }
                        }
                    }
                    float $$11 = (float)$$6.nextIndex() / $$1;
                    ccq.this.x.put($$5, $$11);
                    $$3 += $$11;
                }
                ccq.this.s = $$3;
                if ($$2) continue;
                break;
            }
            ccq.this.y = this.e;
            for (c $$12 : $$0) {
                try {
                    $$12.b.close();
                }
                catch (Exception $$13) {
                    a.error("Error upgrading chunk", (Throwable)$$13);
                }
            }
        }

        private List<c> b() {
            ArrayList $$0 = Lists.newArrayList();
            for (amt<dwo> $$1 : ccq.this.k) {
                esa $$2 = new esa(ccq.this.n.f(), $$1, this.f);
                Path $$3 = ccq.this.n.a($$1).resolve(this.g);
                esd $$4 = this.a($$2, $$3);
                ListIterator<e> $$5 = this.b($$2, $$3);
                $$0.add(new c($$1, $$4, $$5));
            }
            return $$0;
        }

        protected abstract esd a(esa var1, Path var2);

        private ListIterator<e> b(esa $$02, Path $$1) {
            List<e> $$2 = ccq$a.c($$02, $$1);
            ccq.this.u += $$2.size();
            ccq.this.t += $$2.stream().mapToInt($$0 -> $$0.b.size()).sum();
            return $$2.listIterator();
        }

        private static List<e> c(esa $$02, Path $$12) {
            File[] $$2 = $$12.toFile().listFiles(($$0, $$1) -> $$1.endsWith(".mca"));
            if ($$2 == null) {
                return List.of();
            }
            ArrayList $$3 = Lists.newArrayList();
            for (File $$4 : $$2) {
                Matcher $$5 = z.matcher($$4.getName());
                if (!$$5.matches()) continue;
                int $$6 = Integer.parseInt($$5.group(1)) << 5;
                int $$7 = Integer.parseInt($$5.group(2)) << 5;
                ArrayList $$8 = Lists.newArrayList();
                try (erx $$9 = new erx($$02, $$4.toPath(), $$12, true);){
                    for (int $$10 = 0; $$10 < 32; ++$$10) {
                        for (int $$11 = 0; $$11 < 32; ++$$11) {
                            dvu $$122 = new dvu($$10 + $$6, $$11 + $$7);
                            if (!$$9.b($$122)) continue;
                            $$8.add($$122);
                        }
                    }
                    if ($$8.isEmpty()) continue;
                    $$3.add(new e($$9, $$8));
                }
                catch (Throwable $$13) {
                    a.error("Failed to read chunks from region file {}", (Object)$$4.toPath(), (Object)$$13);
                }
            }
            return $$3;
        }

        private boolean a(amt<dwo> $$0, esd $$1, dvu $$2) {
            boolean $$3 = false;
            try {
                $$3 = this.a($$1, $$2, $$0);
            }
            catch (CompletionException | v $$4) {
                Throwable $$5 = $$4.getCause();
                if ($$5 instanceof IOException) {
                    a.error("Error upgrading chunk {}", (Object)$$2, (Object)$$5);
                }
                throw $$4;
            }
            if ($$3) {
                ++ccq.this.v;
            } else {
                ++ccq.this.w;
            }
            return $$3;
        }

        protected abstract boolean a(esd var1, dvu var2, amt<dwo> var3);

        private void a(erx $$0) {
            if (!ccq.this.m) {
                return;
            }
            if (this.a != null) {
                this.a.join();
            }
            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = ccq.a($$2).resolve($$1.getFileName().toString());
            try {
                if ($$3.toFile().exists()) {
                    Files.delete($$1);
                    Files.move($$3, $$1, new CopyOption[0]);
                } else {
                    a.error("Failed to replace an old region file. New file {} does not exist.", (Object)$$3);
                }
            }
            catch (IOException $$4) {
                a.error("Failed to replace an old region file", (Throwable)$$4);
            }
        }
    }

    static final class e
    extends Record {
        final erx a;
        final List<dvu> b;

        e(erx $$0, List<dvu> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "file;chunksToUpgrade", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "file;chunksToUpgrade", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "file;chunksToUpgrade", "a", "b"}, this, $$0);
        }

        public erx a() {
            return this.a;
        }

        public List<dvu> b() {
            return this.b;
        }
    }

    static final class c
    extends Record {
        final amt<dwo> a;
        final esd b;
        final ListIterator<e> c;

        c(amt<dwo> $$0, esd $$1, ListIterator<e> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "dimensionKey;storage;files", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "dimensionKey;storage;files", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "dimensionKey;storage;files", "a", "b", "c"}, this, $$0);
        }

        public amt<dwo> a() {
            return this.a;
        }

        public esd b() {
            return this.b;
        }

        public ListIterator<e> c() {
            return this.c;
        }
    }
}

