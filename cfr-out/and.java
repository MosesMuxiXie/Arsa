/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class and {
    private static final Logger a = LogUtils.getLogger();
    private static final jp b = new jp(Optional.empty(), Lifecycle.experimental());

    public static CompletableFuture<b> a(jk<anc> $$0, List<jq.a<?>> $$1, baz $$22, Executor $$32) {
        List<jf.b<?>> $$4 = beg.a($$0.b(anc.d), $$1);
        jf.a $$5 = jf.a.a($$4.stream());
        ams $$6 = $$5.a(JsonOps.INSTANCE);
        List<CompletableFuture> $$7 = foc.a().map($$3 -> and.a($$3, $$6, $$22, $$32)).toList();
        CompletableFuture $$8 = bhs.c($$7);
        return $$8.thenApplyAsync($$2 -> and.a($$0, $$5, $$2), $$32);
    }

    private static <T> CompletableFuture<jz<?>> a(foc<T> $$0, ams<JsonElement> $$1, baz $$2, Executor $$3) {
        return CompletableFuture.supplyAsync(() -> {
            jl $$32 = new jl($$0.b(), Lifecycle.experimental());
            HashMap<amo, Object> $$4 = new HashMap<amo, Object>();
            bbd.a($$2, $$0.b(), (DynamicOps<JsonElement>)$$1, $$0.c(), $$4);
            $$4.forEach(($$2, $$3) -> $$32.a(amt.a($$0.b(), $$2), $$3, b));
            beg.a($$2, $$32);
            return $$32;
        }, $$3);
    }

    private static b a(jk<anc> $$0, jf.a $$1, List<jz<?>> $$2) {
        jk<anc> $$3 = and.a($$0, $$2);
        jf.a $$4 = and.a($$1, $$3.a(anc.d));
        and.a($$4);
        return new b($$3, $$4);
    }

    private static jf.a a(jf.a $$0, jf.a $$1) {
        return jf.a.a(Stream.concat($$0.c(), $$1.c()));
    }

    private static void a(jf.a $$02) {
        bgp.a $$12 = new bgp.a();
        fog $$22 = new fog($$12, fqw.q, $$02);
        foc.a().forEach($$2 -> and.a($$22, $$2, $$02));
        $$12.a(($$0, $$1) -> a.warn("Found loot table element validation problem in {}: {}", $$0, (Object)$$1.a()));
    }

    private static jk<anc> a(jk<anc> $$0, List<jz<?>> $$1) {
        return $$0.a(anc.d, new jr.c($$1).e());
    }

    private static <T> void a(fog $$0, foc<T> $$1, jf.a $$22) {
        jf.b<T> $$3 = $$22.e($$1.b());
        $$3.c().forEach($$2 -> $$1.a($$0, $$2.h(), $$2.a()));
    }

    public record b(jk<anc> a, jf.a b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "layers;lookupWithUpdatedTags", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "layers;lookupWithUpdatedTags", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "layers;lookupWithUpdatedTags", "a", "b"}, this, $$0);
        }
    }

    public static class a {
        private final jf.a a;

        public a(jf.a $$0) {
            this.a = $$0;
        }

        public jf.a a() {
            return this.a;
        }

        public fof a(amt<fof> $$0) {
            return this.a.a(mj.bG).flatMap($$1 -> $$1.a($$0)).map(jd::a).orElse(fof.f);
        }
    }
}

