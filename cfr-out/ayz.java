/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class ayz {
    private final long a;
    private final AtomicLong b = new AtomicLong();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final ayx d;

    public ayz(ayx $$0, int $$1) {
        this.d = $$0;
        this.a = TimeUnit.SECONDS.toMillis($$1);
    }

    public void a() {
        this.c();
    }

    public void b() {
        this.c.set(true);
        this.c();
    }

    private void c() {
        long $$0 = bhs.c();
        if (this.c.get() && $$0 - this.b.get() >= this.a) {
            this.d.e();
            this.b.set(bhs.c());
        }
        this.c.set(false);
    }
}

