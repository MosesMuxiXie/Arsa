/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class geh
implements Runnable {
    protected static final int a = 25;
    private static final Logger b = LogUtils.getLogger();
    private boolean c = false;

    protected static void a(long $$0) {
        try {
            Thread.sleep($$0 * 1000L);
        }
        catch (InterruptedException $$1) {
            Thread.currentThread().interrupt();
            b.error("", (Throwable)$$1);
        }
    }

    public static void a(gsb $$0) {
        gfj $$1 = gfj.V();
        $$1.execute(() -> $$1.a($$0));
    }

    protected void a(yh $$0) {
        this.b();
        gfj $$1 = gfj.V();
        $$1.execute(() -> $$1.a(new gcs($$0, (gsb)new fzu(new gsd()))));
    }

    protected void a(Exception $$0) {
        if ($$0 instanceof gce) {
            gce $$1 = (gce)$$0;
            this.a($$1.a.b());
        } else {
            this.a(yh.b($$0.getMessage()));
        }
    }

    protected void a(gce $$0) {
        this.a($$0.a.b());
    }

    public abstract yh a();

    public boolean d() {
        return this.c;
    }

    public void c() {
    }

    public void e() {
    }

    public void b() {
        this.c = true;
    }
}

