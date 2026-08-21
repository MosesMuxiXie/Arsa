/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;

public final class bzl {
    private static final ThreadLocal<bzq> a = ThreadLocal.withInitial(bzq::new);
    private static final ThreadLocal<@Nullable bzm> b = new ThreadLocal();
    private static final AtomicInteger c = new AtomicInteger();

    private bzl() {
    }

    public static a a(bzm $$0) {
        bzl.b($$0);
        return bzl::b;
    }

    private static void b(bzm $$0) {
        if (b.get() != null) {
            throw new IllegalStateException("Profiler is already active");
        }
        bzm $$1 = bzl.c($$0);
        b.set($$1);
        c.incrementAndGet();
        $$1.a();
    }

    private static void b() {
        bzm $$0 = b.get();
        if ($$0 == null) {
            throw new IllegalStateException("Profiler was not active");
        }
        b.remove();
        c.decrementAndGet();
        $$0.b();
    }

    private static bzm c(bzm $$0) {
        return bzm.a(bzl.c(), $$0);
    }

    public static bzm a() {
        if (c.get() == 0) {
            return bzl.c();
        }
        return Objects.requireNonNullElseGet(b.get(), bzl::c);
    }

    private static bzm c() {
        if (TracyClient.isAvailable()) {
            return a.get();
        }
        return bzi.a;
    }

    public static interface a
    extends AutoCloseable {
        @Override
        public void close();
    }
}

