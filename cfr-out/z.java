/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 */
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public record z(ExecutorService a) implements Executor
{
    public Executor a(String $$0) {
        if (w.aX) {
            return $$1 -> this.a.execute(() -> {
                Thread $$2 = Thread.currentThread();
                String $$3 = $$2.getName();
                $$2.setName($$0);
                try (Zone $$4 = TracyClient.beginZone((String)$$0, (boolean)w.aX);){
                    $$1.run();
                }
                finally {
                    $$2.setName($$3);
                }
            });
        }
        if (TracyClient.isAvailable()) {
            return $$1 -> this.a.execute(() -> {
                try (Zone $$2 = TracyClient.beginZone((String)$$0, (boolean)w.aX);){
                    $$1.run();
                }
            });
        }
        return this.a;
    }

    @Override
    public void execute(Runnable $$0) {
        this.a.execute(z.a($$0));
    }

    public void a(long $$0, TimeUnit $$1) {
        boolean $$4;
        this.a.shutdown();
        try {
            boolean $$2 = this.a.awaitTermination($$0, $$1);
        }
        catch (InterruptedException $$3) {
            $$4 = false;
        }
        if (!$$4) {
            this.a.shutdownNow();
        }
    }

    private static Runnable a(Runnable $$0) {
        if (!TracyClient.isAvailable()) {
            return $$0;
        }
        return () -> {
            try (Zone $$1 = TracyClient.beginZone((String)"task", (boolean)w.aX);){
                $$0.run();
            }
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{z.class, "service", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z.class, "service", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z.class, "service", "a"}, this, $$0);
    }
}

