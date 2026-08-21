/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gdz {
    private static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("mco.util.time.now");
    private static final int c = 60;
    private static final int d = 3600;
    private static final int e = 86400;

    public static yh a(long $$0) {
        if ($$0 < 0L) {
            return b;
        }
        long $$1 = $$0 / 1000L;
        if ($$1 < 60L) {
            return yh.a("mco.time.secondsAgo", $$1);
        }
        if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return yh.a("mco.time.minutesAgo", $$2);
        }
        if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return yh.a("mco.time.hoursAgo", $$3);
        }
        long $$4 = $$1 / 86400L;
        return yh.a("mco.time.daysAgo", $$4);
    }

    public static yh a(Instant $$0) {
        return gdz.a(System.currentTimeMillis() - $$0.toEpochMilli());
    }

    public static void a(gir $$0, int $$1, int $$2, int $$3, UUID $$4) {
        hou.a $$5 = gfj.V().bg().a(doy.a($$4));
        gke.a($$0, $$5.b(), $$1, $$2, $$3);
    }

    public static <T> CompletableFuture<T> a(b<T> $$0, @Nullable Consumer<gce> $$1) {
        return CompletableFuture.supplyAsync(() -> {
            fzz $$2 = fzz.a();
            try {
                return $$0.apply($$2);
            }
            catch (Throwable $$3) {
                if ($$3 instanceof gce) {
                    gce $$4 = (gce)$$3;
                    if ($$1 != null) {
                        $$1.accept($$4);
                    }
                } else {
                    a.error("Unhandled exception", $$3);
                }
                throw new RuntimeException($$3);
            }
        }, bhs.j());
    }

    public static CompletableFuture<Void> a(a $$0, @Nullable Consumer<gce> $$1) {
        return gdz.a($$0, $$1);
    }

    public static Consumer<gce> a(Function<gce, gsb> $$0) {
        gfj $$1 = gfj.V();
        return $$2 -> $$1.execute(() -> $$1.a((gsb)$$0.apply((gce)$$2)));
    }

    public static Consumer<gce> a(Function<gce, gsb> $$0, String $$12) {
        return gdz.a($$0).andThen($$1 -> a.error($$12, (Throwable)$$1));
    }

    @FunctionalInterface
    public static interface b<T> {
        public T apply(fzz var1) throws gce;
    }

    @FunctionalInterface
    public static interface a
    extends b<Void> {
        public void accept(fzz var1) throws gce;

        @Override
        default public Void apply(fzz $$0) throws gce {
            this.accept($$0);
            return null;
        }
    }
}

