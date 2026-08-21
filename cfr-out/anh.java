/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class anh
implements bat {
    private static final Logger b = LogUtils.getLogger();
    public static final amt<jq<ht<ed>>> a = amt.a(amo.b("function"));
    private static final amm c = new amm(mj.c(a), ".mcfunction");
    private volatile Map<amo, ht<ed>> d = ImmutableMap.of();
    private final beg<ht<ed>> e = new beg(($$0, $$1) -> this.a($$0), mj.d(a));
    private volatile Map<amo, List<ht<ed>>> f = Map.of();
    private final bbn g;
    private final CommandDispatcher<ed> h;

    public Optional<ht<ed>> a(amo $$0) {
        return Optional.ofNullable(this.d.get($$0));
    }

    public Map<amo, ht<ed>> a() {
        return this.d;
    }

    public List<ht<ed>> b(amo $$0) {
        return this.f.getOrDefault($$0, List.of());
    }

    public Iterable<amo> b() {
        return this.f.keySet();
    }

    public anh(bbn $$02, CommandDispatcher<ed> $$12) {
        this.g = $$02;
        this.h = $$12;
    }

    @Override
    public CompletableFuture<Void> reload(bat.b $$02, Executor $$1, bat.a $$2, Executor $$3) {
        baz $$4 = $$02.a();
        CompletableFuture<Map> $$5 = CompletableFuture.supplyAsync(() -> this.e.a($$4), $$1);
        CompletionStage $$6 = CompletableFuture.supplyAsync(() -> c.a($$4), $$1).thenCompose($$12 -> {
            HashMap $$22 = Maps.newHashMap();
            ed $$3 = ee.a(this.g);
            for (Map.Entry $$4 : $$12.entrySet()) {
                amo $$5 = (amo)$$4.getKey();
                amo $$6 = c.b($$5);
                $$22.put($$6, CompletableFuture.supplyAsync(() -> {
                    List<String> $$3 = anh.a((bax)$$4.getValue());
                    return ht.a($$6, this.h, $$3, $$3);
                }, $$1));
            }
            CompletableFuture[] $$7 = $$22.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf($$7).handle(($$1, $$2) -> $$22);
        });
        return ((CompletableFuture)((CompletableFuture)$$5.thenCombine($$6, Pair::of)).thenCompose($$2::wait)).thenAcceptAsync($$0 -> {
            Map $$12 = (Map)$$0.getSecond();
            ImmutableMap.Builder $$2 = ImmutableMap.builder();
            $$12.forEach(($$1, $$22) -> ((CompletableFuture)$$22.handle(($$2, $$3) -> {
                if ($$3 != null) {
                    b.error("Failed to load function {}", $$1, $$3);
                } else {
                    $$2.put($$1, $$2);
                }
                return null;
            })).join());
            this.d = $$2.build();
            this.f = this.e.a((Map)$$0.getFirst());
        }, $$3);
    }

    private static List<String> a(bax $$0) {
        List<String> list;
        block8: {
            BufferedReader $$1 = $$0.e();
            try {
                list = $$1.lines().toList();
                if ($$1 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$1 != null) {
                        try {
                            $$1.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$2) {
                    throw new CompletionException($$2);
                }
            }
            $$1.close();
        }
        return list;
    }
}

