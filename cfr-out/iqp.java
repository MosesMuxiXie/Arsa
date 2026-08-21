/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.LockSupport;

public class iqp
extends cbr<Runnable> {
    private Thread a = this.c();
    private volatile boolean b;

    public iqp() {
        super("Sound executor");
    }

    private Thread c() {
        Thread $$02 = new Thread(this::d);
        $$02.setDaemon(true);
        $$02.setName("Sound engine");
        $$02.setUncaughtExceptionHandler(($$0, $$1) -> gfj.V().a(m.a($$1, "Uncaught exception on thread: " + $$0.getName())));
        $$02.start();
        return $$02;
    }

    @Override
    public Runnable f(Runnable $$0) {
        return $$0;
    }

    @Override
    public void a_(Runnable $$0) {
        if (!this.b) {
            super.a_($$0);
        }
    }

    @Override
    protected boolean e(Runnable $$0) {
        return !this.b;
    }

    @Override
    protected Thread aw() {
        return this.a;
    }

    private void d() {
        while (!this.b) {
            this.b(() -> this.b);
        }
    }

    @Override
    protected void D() {
        LockSupport.park("waiting for tasks");
    }

    public void a() {
        this.b = true;
        this.bM();
        this.a.interrupt();
        try {
            this.a.join();
        }
        catch (InterruptedException $$0) {
            Thread.currentThread().interrupt();
        }
    }

    public void b() {
        this.b = false;
        this.a = this.c();
    }
}

