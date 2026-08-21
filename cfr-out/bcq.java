/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class bcq
implements Runnable {
    private static final Logger d = LogUtils.getLogger();
    private static final AtomicInteger e = new AtomicInteger(0);
    private static final int f = 5;
    protected volatile boolean a;
    protected final String b;
    protected @Nullable Thread c;

    protected bcq(String $$0) {
        this.b = $$0;
    }

    public synchronized boolean a() {
        if (this.a) {
            return true;
        }
        this.a = true;
        this.c = new Thread(this, this.b + " #" + e.incrementAndGet());
        this.c.setUncaughtExceptionHandler(new q(d));
        this.c.start();
        d.info("Thread {} started", (Object)this.b);
        return true;
    }

    public synchronized void b() {
        this.a = false;
        if (null == this.c) {
            return;
        }
        int $$0 = 0;
        while (this.c.isAlive()) {
            try {
                this.c.join(1000L);
                if (++$$0 >= 5) {
                    d.warn("Waited {} seconds attempting force stop!", (Object)$$0);
                    continue;
                }
                if (!this.c.isAlive()) continue;
                d.warn("Thread {} ({}) failed to exit after {} second(s)", new Object[]{this, this.c.getState(), $$0, new Exception("Stack:")});
                this.c.interrupt();
            }
            catch (InterruptedException interruptedException) {}
        }
        d.info("Thread {} stopped", (Object)this.b);
        this.c = null;
    }

    public boolean c() {
        return this.a;
    }
}

