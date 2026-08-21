/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class eqh {
    private static final Logger a = LogUtils.getLogger();
    private final eve b;
    private final dxs c;
    private final long d;
    private final long e;
    private final Map<ffo, List<fgl>> f = new Object2ObjectOpenHashMap();
    private final Map<fgi, CompletableFuture<List<dvu>>> g = new Object2ObjectArrayMap();
    private boolean h;
    private final List<jd<ffu>> i;

    public static eqh a(eve $$0, long $$12, dxs $$2, Stream<jd<ffu>> $$3) {
        List<jd<ffu>> $$4 = $$3.filter($$1 -> eqh.a((ffu)$$1.a(), $$2)).toList();
        return new eqh($$0, $$2, $$12, 0L, $$4);
    }

    public static eqh a(eve $$0, long $$12, dxs $$2, jf<ffu> $$3) {
        List<jd<ffu>> $$4 = $$3.c().filter($$1 -> eqh.a((ffu)$$1.a(), $$2)).collect(Collectors.toUnmodifiableList());
        return new eqh($$0, $$2, $$12, $$12, $$4);
    }

    private static boolean a(ffu $$02, dxs $$1) {
        Stream $$2 = $$02.a().stream().flatMap($$0 -> {
            ffo $$1 = $$0.a().a();
            return $$1.a().a();
        });
        return $$2.anyMatch($$1.c()::contains);
    }

    private eqh(eve $$0, dxs $$1, long $$2, long $$3, List<jd<ffu>> $$4) {
        this.b = $$0;
        this.d = $$2;
        this.c = $$1;
        this.e = $$3;
        this.i = $$4;
    }

    public List<jd<ffu>> a() {
        return this.i;
    }

    private void e() {
        Set<jd<dxo>> $$0 = this.c.c();
        this.a().forEach($$1 -> {
            fgl $$6;
            ffu $$2 = (ffu)$$1.a();
            boolean $$3 = false;
            for (ffu.a $$4 : $$2.a()) {
                ffo $$5 = $$4.a().a();
                if (!$$5.a().a().anyMatch($$0::contains)) continue;
                this.f.computeIfAbsent($$5, $$0 -> new ArrayList()).add($$2.b());
                $$3 = true;
            }
            if ($$3 && ($$6 = $$2.b()) instanceof fgi) {
                fgi $$7 = (fgi)$$6;
                this.g.put($$7, this.a((jd<ffu>)$$1, $$7));
            }
        });
    }

    private CompletableFuture<List<dvu>> a(jd<ffu> $$0, fgi $$1) {
        if ($$1.c() == 0) {
            return CompletableFuture.completedFuture(List.of());
        }
        Stopwatch $$22 = Stopwatch.createStarted((Ticker)bhs.d);
        int $$3 = $$1.a();
        int $$4 = $$1.c();
        ArrayList<CompletableFuture<dvu>> $$5 = new ArrayList<CompletableFuture<dvu>>($$4);
        int $$6 = $$1.b();
        jh<dxo> $$7 = $$1.d();
        bgr $$8 = bgr.a();
        $$8.b(this.e);
        double $$9 = $$8.j() * Math.PI * 2.0;
        int $$10 = 0;
        int $$11 = 0;
        for (int $$12 = 0; $$12 < $$4; ++$$12) {
            double $$13 = (double)(4 * $$3 + $$3 * $$11 * 6) + ($$8.j() - 0.5) * ((double)$$3 * 2.5);
            int $$14 = (int)Math.round(Math.cos($$9) * $$13);
            int $$15 = (int)Math.round(Math.sin($$9) * $$13);
            bgr $$16 = $$8.d();
            $$5.add(CompletableFuture.supplyAsync(() -> {
                Pair<is, jd<dxo>> $$4 = this.c.a(jw.a($$14, 8), 0, jw.a($$15, 8), 112, $$7::a, $$16, this.b.b());
                if ($$4 != null) {
                    is $$5 = (is)$$4.getFirst();
                    return new dvu(jw.a($$5.u()), jw.a($$5.w()));
                }
                return new dvu($$14, $$15);
            }, bhs.h().a("structureRings")));
            $$9 += Math.PI * 2 / (double)$$6;
            if (++$$10 != $$6) continue;
            $$10 = 0;
            $$6 += 2 * $$6 / (++$$11 + 1);
            $$6 = Math.min($$6, $$4 - $$12);
            $$9 += $$8.j() * Math.PI * 2.0;
        }
        return bhs.c($$5).thenApply($$2 -> {
            double $$3 = (double)$$22.stop().elapsed(TimeUnit.MILLISECONDS) / 1000.0;
            a.debug("Calculation for {} took {}s", (Object)$$0, (Object)$$3);
            return $$2;
        });
    }

    public void b() {
        if (!this.h) {
            this.e();
            this.h = true;
        }
    }

    public @Nullable List<dvu> a(fgi $$0) {
        this.b();
        CompletableFuture<List<dvu>> $$1 = this.g.get($$0);
        return $$1 != null ? $$1.join() : null;
    }

    public List<fgl> a(jd<ffo> $$0) {
        this.b();
        return this.f.getOrDefault($$0.a(), List.of());
    }

    public eve c() {
        return this.b;
    }

    public boolean a(jd<ffu> $$0, int $$1, int $$2, int $$3) {
        fgl $$4 = $$0.a().b();
        for (int $$5 = $$1 - $$3; $$5 <= $$1 + $$3; ++$$5) {
            for (int $$6 = $$2 - $$3; $$6 <= $$2 + $$3; ++$$6) {
                if (!$$4.b(this, $$5, $$6)) continue;
                return true;
            }
        }
        return false;
    }

    public long d() {
        return this.d;
    }
}

