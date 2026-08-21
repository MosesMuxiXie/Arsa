/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Queues
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 *  com.mojang.logging.LogUtils
 *  javax.annotation.CheckReturnValue
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.CheckReturnValue;
import org.slf4j.Logger;

public abstract class cbr<R extends Runnable>
implements cba,
cbx<R>,
Executor {
    public static final long l = 100000L;
    private final String b;
    private static final Logger c = LogUtils.getLogger();
    private final Queue<R> d = Queues.newConcurrentLinkedQueue();
    private int e;

    protected cbr(String $$0) {
        this.b = $$0;
        cay.a.a(this);
    }

    protected abstract boolean e(R var1);

    public boolean bK() {
        return Thread.currentThread() == this.aw();
    }

    protected abstract Thread aw();

    protected boolean av() {
        return !this.bK();
    }

    public int bL() {
        return this.d.size();
    }

    @Override
    public String z_() {
        return this.b;
    }

    public <V> CompletableFuture<V> a(Supplier<V> $$0) {
        if (this.av()) {
            return CompletableFuture.supplyAsync($$0, this);
        }
        return CompletableFuture.completedFuture($$0.get());
    }

    private CompletableFuture<Void> b(Runnable $$0) {
        return CompletableFuture.supplyAsync(() -> {
            $$0.run();
            return null;
        }, this);
    }

    @CheckReturnValue
    public CompletableFuture<Void> g(Runnable $$0) {
        if (this.av()) {
            return this.b($$0);
        }
        $$0.run();
        return CompletableFuture.completedFuture(null);
    }

    public void h(Runnable $$0) {
        if (!this.bK()) {
            this.b($$0).join();
        } else {
            $$0.run();
        }
    }

    @Override
    public void a_(R $$0) {
        this.d.add($$0);
        LockSupport.unpark(this.aw());
    }

    @Override
    public void execute(Runnable $$0) {
        Object $$1 = this.f($$0);
        if (this.av()) {
            this.a_($$1);
        } else {
            this.d($$1);
        }
    }

    public void c(Runnable $$0) {
        this.execute($$0);
    }

    protected void bM() {
        this.d.clear();
    }

    protected void bN() {
        while (this.E()) {
        }
    }

    protected boolean bO() {
        return this.e > 0;
    }

    public boolean E() {
        Runnable $$0 = (Runnable)this.d.peek();
        if ($$0 == null) {
            return false;
        }
        if (!this.bO() && !this.e($$0)) {
            return false;
        }
        this.d((Runnable)this.d.remove());
        return true;
    }

    public void b(BooleanSupplier $$0) {
        ++this.e;
        try {
            while (!$$0.getAsBoolean()) {
                if (this.E()) continue;
                this.D();
            }
        }
        finally {
            --this.e;
        }
    }

    protected void D() {
        Thread.yield();
        LockSupport.parkNanos("waiting for tasks", 100000L);
    }

    protected void d(R $$0) {
        block8: {
            try (Zone $$1 = TracyClient.beginZone((String)"Task", (boolean)w.aX);){
                $$0.run();
            }
            catch (Exception $$2) {
                c.error(LogUtils.FATAL_MARKER, "Error executing task on {}", (Object)this.z_(), (Object)$$2);
                if (!cbr.a($$2)) break block8;
                throw $$2;
            }
        }
    }

    @Override
    public List<cax> bJ() {
        return ImmutableList.of((Object)cax.a(this.b + "-pending-tasks", caw.b, this::bL));
    }

    public static boolean a(Throwable $$0) {
        if ($$0 instanceof v) {
            v $$1 = (v)$$0;
            return cbr.a($$1.getCause());
        }
        return $$0 instanceof OutOfMemoryError || $$0 instanceof StackOverflowError;
    }
}

