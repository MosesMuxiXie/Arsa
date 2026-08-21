/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anr {
    private static final Logger a = LogUtils.getLogger();

    public static <D, R> CompletableFuture<R> a(c $$0, f<D> $$12, e<D, R> $$22, Executor $$3, Executor $$42) {
        try {
            Pair<dxm, bap> $$5 = $$0.a.a();
            bap $$6 = (bap)$$5.getSecond();
            jk<anc> $$7 = anc.a();
            List<jq.a<?>> $$8 = beg.a((baz)$$6, $$7.a(anc.a));
            jr.b $$9 = $$7.b(anc.b);
            List<jf.b<?>> $$10 = beg.a($$9, $$8);
            jr.b $$11 = amp.a((baz)$$6, $$10, amp.a);
            List<jf.b<?>> $$122 = Stream.concat($$10.stream(), $$11.c()).toList();
            jr.b $$13 = amp.a((baz)$$6, $$122, amp.b);
            dxm $$14 = (dxm)$$5.getFirst();
            jf.a $$15 = jf.a.a($$122.stream());
            b<D> $$16 = $$12.get(new a($$6, $$14, $$15, $$13));
            jk<anc> $$17 = $$7.a(anc.b, $$11, $$16.b);
            return ((CompletableFuture)ane.a($$6, $$17, $$8, $$14.b(), $$0.b(), $$0.c(), $$3, $$42).whenComplete(($$1, $$2) -> {
                if ($$2 != null) {
                    $$6.close();
                }
            })).thenApplyAsync($$4 -> {
                $$4.g();
                return $$22.create($$6, (ane)$$4, $$17, $$3.a);
            }, $$42);
        }
        catch (Exception $$18) {
            return CompletableFuture.failedFuture($$18);
        }
    }

    public static final class c
    extends Record {
        final d a;
        private final ee.a b;
        private final bbn c;

        public c(d $$0, ee.a $$1, bbn $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "packConfig;commandSelection;functionCompilationPermissions", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "packConfig;commandSelection;functionCompilationPermissions", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "packConfig;commandSelection;functionCompilationPermissions", "a", "b", "c"}, this, $$0);
        }

        public d a() {
            return this.a;
        }

        public ee.a b() {
            return this.b;
        }

        public bbn c() {
            return this.c;
        }
    }

    public record d(bak a, dxm b, boolean c, boolean d) {
        private final bak a;
        private final dxm b;
        private final boolean c;
        private final boolean d;

        public Pair<dxm, bap> a() {
            dxm $$0 = MinecraftServer.a(this.a, this.b, this.d, this.c);
            List<azl> $$1 = this.a.h();
            bas $$2 = new bas(azn.b, $$1);
            return Pair.of((Object)$$0, (Object)$$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "packRepository;initialDataConfig;safeMode;initMode", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "packRepository;initialDataConfig;safeMode;initMode", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "packRepository;initialDataConfig;safeMode;initMode", "a", "b", "c", "d"}, this, $$0);
        }

        public bak b() {
            return this.a;
        }

        public dxm c() {
            return this.b;
        }

        public boolean d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    public record a(baz a, dxm b, jf.a c, jr.b d) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "resources;dataConfiguration;datapackWorldgen;datapackDimensions", "a", "b", "c", "d"}, this, $$0);
        }
    }

    @FunctionalInterface
    public static interface f<D> {
        public b<D> get(a var1);
    }

    public static final class b<D>
    extends Record {
        final D a;
        final jr.b b;

        public b(D $$0, jr.b $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "cookie;finalDimensions", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "cookie;finalDimensions", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "cookie;finalDimensions", "a", "b"}, this, $$0);
        }

        public D a() {
            return this.a;
        }

        public jr.b b() {
            return this.b;
        }
    }

    @FunctionalInterface
    public static interface e<D, R> {
        public R create(bap var1, ane var2, jk<anc> var3, D var4);
    }
}

