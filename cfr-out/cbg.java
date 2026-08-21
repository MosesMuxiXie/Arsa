/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.slf4j.Logger
 *  oshi.SystemInfo
 *  oshi.hardware.CentralProcessor
 */
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class cbg
implements caz {
    private static final Logger a = LogUtils.getLogger();
    private final Set<cax> b = new ObjectOpenHashSet();
    private final cbf c = new cbf();

    public cbg(LongSupplier $$0, boolean $$1) {
        this.b.add(cbg.a($$0));
        if ($$1) {
            this.b.addAll(cbg.a());
        }
    }

    public static Set<cax> a() {
        ImmutableSet.Builder $$0 = ImmutableSet.builder();
        try {
            a $$12 = new a();
            IntStream.range(0, $$12.a).mapToObj($$1 -> cax.a("cpu#" + $$1, caw.h, () -> $$12.a($$1))).forEach(arg_0 -> ((ImmutableSet.Builder)$$0).add(arg_0));
        }
        catch (Throwable $$2) {
            a.warn("Failed to query cpu, no cpu stats will be recorded", $$2);
        }
        $$0.add((Object)cax.a("heap MiB", caw.e, () -> y.a(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())));
        $$0.addAll(cay.a.a());
        return $$0.build();
    }

    @Override
    public Set<cax> a(Supplier<bzj> $$0) {
        this.b.addAll(this.c.a($$0));
        return this.b;
    }

    public static cax a(final LongSupplier $$02) {
        Stopwatch $$1 = Stopwatch.createUnstarted((Ticker)new Ticker(){

            public long read() {
                return $$02.getAsLong();
            }
        });
        ToDoubleFunction<Stopwatch> $$2 = $$0 -> {
            if ($$0.isRunning()) {
                $$0.stop();
            }
            long $$1 = $$0.elapsed(TimeUnit.NANOSECONDS);
            $$0.reset();
            return $$1;
        };
        cax.d $$3 = new cax.d(2.0f);
        return cax.a("ticktime", caw.d, $$2, $$1).a(Stopwatch::start).a($$3).a();
    }

    static class a {
        private final SystemInfo b = new SystemInfo();
        private final CentralProcessor c = this.b.getHardware().getProcessor();
        public final int a = this.c.getLogicalProcessorCount();
        private long[][] d = this.c.getProcessorCpuLoadTicks();
        private double[] e = this.c.getProcessorCpuLoadBetweenTicks(this.d);
        private long f;

        a() {
        }

        public double a(int $$0) {
            long $$1 = System.currentTimeMillis();
            if (this.f == 0L || this.f + 501L < $$1) {
                this.e = this.c.getProcessorCpuLoadBetweenTicks(this.d);
                this.d = this.c.getProcessorCpuLoadTicks();
                this.f = $$1;
            }
            return this.e[$$0] * 100.0;
        }
    }
}

