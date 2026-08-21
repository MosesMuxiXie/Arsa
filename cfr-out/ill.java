/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ill {
    private static final Logger a = LogUtils.getLogger();
    private final amo b;
    private final int c;

    public ill(amo $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static ill a(ilo $$0) {
        return new ill($$0.h(), $$0.i());
    }

    private a a(List<ilk> $$02, int $$1, Executor $$2) {
        try (bzr $$3 = bzl.a().c(() -> "stitch " + String.valueOf(this.b));){
            int $$12;
            int $$4 = this.c;
            int $$5 = Integer.MAX_VALUE;
            int $$6 = 1 << $$1;
            for (ilk $$7 : $$02) {
                $$5 = Math.min($$5, Math.min($$7.b(), $$7.c()));
                int $$8 = Math.min(Integer.lowestOneBit($$7.b()), Integer.lowestOneBit($$7.c()));
                if ($$8 >= $$6) continue;
                a.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{$$7.d(), $$7.b(), $$7.c(), bgj.g($$6), bgj.g($$8)});
                $$6 = $$8;
            }
            int $$9 = Math.min($$5, $$6);
            int $$10 = bgj.g($$9);
            if ($$10 < $$1) {
                a.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.b, $$1, $$10, $$9});
                int $$11 = $$10;
            } else {
                $$12 = $$1;
            }
            gfo $$13 = gfj.V().k;
            int $$14 = $$12 == 0 || $$13.N().b() != gfv.c ? 0 : $$13.L().b();
            ilm<ilk> $$15 = new ilm<ilk>($$4, $$4, $$12, $$14);
            for (ilk $$16 : $$02) {
                $$15.a($$16);
            }
            try {
                $$15.c();
            }
            catch (iln $$17) {
                m $$18 = m.a($$17, "Stitching");
                n $$19 = $$18.a("Stitcher");
                $$19.a("Sprites", $$17.a().stream().map($$0 -> String.format(Locale.ROOT, "%s[%dx%d]", $$0.d(), $$0.b(), $$0.c())).collect(Collectors.joining(",")));
                $$19.a("Max Texture Size", $$4);
                throw new v($$18);
            }
            int $$20 = $$15.a();
            int $$21 = $$15.b();
            Map<amo, ilp> $$22 = this.a($$15, $$20, $$21);
            ilp $$23 = $$22.get(ilf.c());
            CompletableFuture<Void> $$24 = CompletableFuture.runAsync(() -> $$22.values().forEach($$1 -> $$1.e().a($$12)), $$2);
            a a2 = new a($$20, $$21, $$12, $$23, $$22, $$24);
            return a2;
        }
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    private static CompletableFuture<List<ilk>> a(ilt $$02, List<ilu.b> $$1, Executor $$22) {
        List<@Nullable CompletableFuture> $$3 = $$1.stream().map($$2 -> CompletableFuture.supplyAsync(() -> $$2.get($$02), $$22)).toList();
        return bhs.c($$3).thenApply($$0 -> $$0.stream().filter(Objects::nonNull).toList());
    }

    public CompletableFuture<a> a(baz $$0, amo $$1, int $$22, Executor $$3, Set<azy<?>> $$4) {
        ilt $$5 = ilt.create($$4);
        return ((CompletableFuture)CompletableFuture.supplyAsync(() -> ilv.a($$0, $$1).a($$0), $$3).thenCompose($$2 -> ill.a($$5, $$2, $$3))).thenApply($$2 -> this.a((List<ilk>)$$2, $$22, $$3));
    }

    private Map<amo, ilp> a(ilm<ilk> $$0, int $$1, int $$2) {
        HashMap<amo, ilp> $$32 = new HashMap<amo, ilp>();
        $$0.a(($$3, $$4, $$5, $$6) -> $$32.put($$3.d(), new ilp(this.b, (ilk)$$3, $$1, $$2, $$4, $$5, $$6)));
        return $$32;
    }

    public record a(int a, int b, int c, ilp d, Map<amo, ilp> e, CompletableFuture<Void> f) {
        public @Nullable ilp a(amo $$0) {
            return this.e.get($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "width;height;mipLevel;missing;regions;readyForUpload", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "width;height;mipLevel;missing;regions;readyForUpload", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "width;height;mipLevel;missing;regions;readyForUpload", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }
    }
}

