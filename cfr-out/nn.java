/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.slf4j.Logger;

public class nn
implements mq {
    private static final Logger d = LogUtils.getLogger();
    private final ms.a e;
    private final Set<amt<fof>> f;
    private final List<b> g;
    private final CompletableFuture<jf.a> h;

    public nn(ms $$0, Set<amt<fof>> $$1, List<b> $$2, CompletableFuture<jf.a> $$3) {
        this.e = $$0.a(mj.bG);
        this.g = $$2;
        this.f = $$1;
        this.h = $$3;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        return this.h.thenCompose($$1 -> this.a($$0, (jf.a)$$1));
    }

    private CompletableFuture<?> a(mo $$02, jf.a $$12) {
        jl<fof> $$22 = new jl<fof>(mj.bG, Lifecycle.experimental());
        Object2ObjectOpenHashMap $$3 = new Object2ObjectOpenHashMap();
        this.g.forEach(arg_0 -> nn.a($$12, (Map)$$3, $$22, arg_0));
        $$22.n();
        bgp.a $$4 = new bgp.a();
        jr.b $$5 = new jr.c(List.of($$22)).e();
        fog $$6 = new fog($$4, fqw.q, $$5);
        Sets.SetView $$7 = Sets.difference(this.f, $$22.j());
        for (amt $$8 : $$7) {
            $$4.a(new a($$8));
        }
        $$22.c().forEach($$1 -> ((fof)$$1.a()).a($$6.a(((fof)$$1.a()).a()).a(new bgp.h($$1.h()), $$1.h())));
        if (!$$4.a()) {
            $$4.a((String $$0, bgp.g $$1) -> d.warn("Found validation problem in {}: {}", $$0, (Object)$$1.a()));
            throw new IllegalStateException("Failed to validate loot tables, see logs");
        }
        return CompletableFuture.allOf((CompletableFuture[])$$22.k().stream().map($$2 -> {
            amt $$3 = (amt)$$2.getKey();
            fof $$4 = (fof)$$2.getValue();
            Path $$5 = this.e.a($$3.a());
            return mq.a($$02, $$12, fof.d, $$4, $$5);
        }).toArray(CompletableFuture[]::new));
    }

    private static amo a(amt<fof> $$0) {
        return $$0.a();
    }

    @Override
    public final String a() {
        return "Loot Tables";
    }

    private static /* synthetic */ void a(jf.a $$0, Map $$1, jz $$2, b $$32) {
        $$32.a().apply($$0).generate(($$3, $$4) -> {
            amo $$5 = nn.a($$3);
            amo $$6 = $$1.put(cdh.a($$5), $$5);
            if ($$6 != null) {
                bhs.b("Loot table random sequence seed collision on " + String.valueOf($$6) + " and " + String.valueOf($$3.a()));
            }
            $$4.a($$5);
            fof $$7 = $$4.a($$1.b).b();
            $$2.a($$3, $$7, jp.a);
        });
    }

    public record a(amt<fof> a) implements bgp.g
    {
        private final amt<fof> a;

        @Override
        public String a() {
            return "Missing built-in table: " + String.valueOf(this.a.a());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id", "a"}, this, $$0);
        }

        public amt<fof> b() {
            return this.a;
        }
    }

    public static final class b
    extends Record {
        private final Function<jf.a, no> a;
        final bhw b;

        public b(Function<jf.a, no> $$0, bhw $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "provider;paramSet", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "provider;paramSet", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "provider;paramSet", "a", "b"}, this, $$0);
        }

        public Function<jf.a, no> a() {
            return this.a;
        }

        public bhw b() {
            return this.b;
        }
    }
}

