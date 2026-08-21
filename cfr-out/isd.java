/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.RateLimiter
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import org.jspecify.annotations.Nullable;

public class isd {
    private final float a;
    private final AtomicReference<@Nullable a> b = new AtomicReference();

    public isd(Duration $$0) {
        this.a = 1000.0f / (float)$$0.toMillis();
    }

    public void a(gfa $$0, yh $$12) {
        a $$2 = this.b.updateAndGet($$1 -> {
            if ($$1 == null || !$$12.equals($$1.a)) {
                return new a($$12, RateLimiter.create((double)this.a));
            }
            return $$1;
        });
        if ($$2.b.tryAcquire(1)) {
            $$0.d($$12);
        }
    }

    static class a {
        final yh a;
        final RateLimiter b;

        a(yh $$0, RateLimiter $$1) {
            this.a = $$0;
            this.b = $$1;
        }
    }
}

