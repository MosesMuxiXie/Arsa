/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.jspecify.annotations.Nullable;

public class glk
implements gly {
    private static final amo a = amo.b("memory");
    private final a b = new a();

    @Override
    public void a(glw $$0, @Nullable dwo $$1, @Nullable eqq $$2, @Nullable eqq $$3) {
        long $$4 = Runtime.getRuntime().maxMemory();
        long $$5 = Runtime.getRuntime().totalMemory();
        long $$6 = Runtime.getRuntime().freeMemory();
        long $$7 = $$5 - $$6;
        $$0.a(a, List.of(String.format(Locale.ROOT, "Mem: %2d%% %03d/%03dMB", $$7 * 100L / $$4, glk.a($$7), glk.a($$4)), String.format(Locale.ROOT, "Allocation rate: %03dMB/s", glk.a(this.b.a($$7))), String.format(Locale.ROOT, "Allocated: %2d%% %03dMB", $$5 * 100L / $$4, glk.a($$5))));
    }

    private static long a(long $$0) {
        return $$0 / 1024L / 1024L;
    }

    @Override
    public boolean a(boolean $$0) {
        return true;
    }

    static class a {
        private static final int a = 500;
        private static final List<GarbageCollectorMXBean> b = ManagementFactory.getGarbageCollectorMXBeans();
        private long c = 0L;
        private long d = -1L;
        private long e = -1L;
        private long f = 0L;

        a() {
        }

        long a(long $$0) {
            long $$1 = System.currentTimeMillis();
            if ($$1 - this.c < 500L) {
                return this.f;
            }
            long $$2 = glk$a.a();
            if (this.c != 0L && $$2 == this.e) {
                double $$3 = (double)TimeUnit.SECONDS.toMillis(1L) / (double)($$1 - this.c);
                long $$4 = $$0 - this.d;
                this.f = Math.round((double)$$4 * $$3);
            }
            this.c = $$1;
            this.d = $$0;
            this.e = $$2;
            return this.f;
        }

        private static long a() {
            long $$0 = 0L;
            for (GarbageCollectorMXBean $$1 : b) {
                $$0 += $$1.getCollectionCount();
            }
            return $$0;
        }
    }
}

