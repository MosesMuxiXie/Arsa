/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ers
implements ess<cgk> {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "Entities";
    private static final String c = "Position";
    private final axf d;
    private final esd e;
    private final LongSet f = new LongOpenHashSet();
    private final cbs g;

    public ers(esd $$0, axf $$1, Executor $$2) {
        this.e = $$0;
        this.d = $$1;
        this.g = new cbs($$2, "entity-deserializer");
    }

    @Override
    public CompletableFuture<esn<cgk>> a(dvu $$0) {
        if (this.f.contains($$0.b())) {
            return CompletableFuture.completedFuture(ers.b($$0));
        }
        CompletableFuture<Optional<uz>> $$12 = this.e.d($$0);
        this.b($$12, $$0);
        return $$12.thenApplyAsync($$1 -> {
            if ($$1.isEmpty()) {
                this.f.add($$0.b());
                return ers.b($$0);
            }
            try {
                dvu $$2 = ((uz)$$1.get()).a(c, dvu.a).orElseThrow();
                if (!Objects.equals($$0, $$2)) {
                    a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
                    this.d.s().a($$2, $$0, this.e.n());
                }
            }
            catch (Exception $$3) {
                a.warn("Failed to parse chunk {} position info", (Object)$$0, (Object)$$3);
                this.d.s().a($$3, this.e.n(), $$0);
            }
            uz $$4 = this.e.a((uz)$$1.get(), -1);
            try (bgp.j $$5 = new bgp.j(eqf.a($$0), a);){
                fnq $$6 = fno.a((bgp)$$5, (jf.a)this.d.J_(), $$4);
                fnq.b $$7 = $$6.d(b);
                List<cgk> $$8 = cgu.a($$7, (dwo)this.d, cgt.r).toList();
                esn<cgk> esn2 = new esn<cgk>($$0, $$8);
                return esn2;
            }
        }, this.g::a_);
    }

    private static esn<cgk> b(dvu $$0) {
        return new esn<cgk>($$0, List.of());
    }

    @Override
    public void a(esn<cgk> $$0) {
        dvu $$1 = $$0.a();
        if ($$0.c()) {
            if (this.f.add($$1.b())) {
                this.a(this.e.a($$1, ert.a), $$1);
            }
            return;
        }
        try (bgp.j $$22 = new bgp.j(eqf.a($$1), a);){
            vf $$3 = new vf();
            $$0.b().forEach($$2 -> {
                fnp $$3 = fnp.a($$22.a($$2.es()), $$2.eo());
                if ($$2.c($$3)) {
                    uz $$4 = $$3.b();
                    $$3.add($$4);
                }
            });
            uz $$4 = vo.e(new uz());
            $$4.a(b, $$3);
            $$4.a(c, dvu.a, $$1);
            this.a(this.e.a($$1, $$4), $$1);
            this.f.remove($$1.b());
        }
    }

    private void a(CompletableFuture<?> $$0, dvu $$12) {
        $$0.exceptionally($$1 -> {
            a.error("Failed to store entity chunk {}", (Object)$$12, $$1);
            this.d.s().b((Throwable)$$1, this.e.n(), $$12);
            return null;
        });
    }

    private void b(CompletableFuture<?> $$0, dvu $$12) {
        $$0.exceptionally($$1 -> {
            a.error("Failed to load entity chunk {}", (Object)$$12, $$1);
            this.d.s().a((Throwable)$$1, this.e.n(), $$12);
            return null;
        });
    }

    @Override
    public void a(boolean $$0) {
        this.e.b($$0).join();
        this.g.a();
    }

    @Override
    public void close() throws IOException {
        this.e.close();
    }
}

