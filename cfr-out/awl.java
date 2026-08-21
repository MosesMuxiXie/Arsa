/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class awl
implements awg.a,
AutoCloseable {
    public static final int a = 4;
    private static final Logger c = LogUtils.getLogger();
    private final awm d;
    private final cbx<Runnable> e;
    private final cbu f;
    protected boolean b;

    public awl(cbx<Runnable> $$0, Executor $$1) {
        this.d = new awm($$0.z_() + "_queue");
        this.e = $$0;
        this.f = new cbu(4, $$1, "dispatcher");
        this.b = true;
    }

    public boolean a() {
        return this.f.c() || this.d.b();
    }

    @Override
    public void onLevelChange(dvu $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
        this.f.a_(new cbw.c(0, () -> {
            int $$4 = $$1.getAsInt();
            if (w.M) {
                c.debug("RES {} {} -> {}", new Object[]{$$0, $$4, $$2});
            }
            this.d.a($$4, $$0, $$2);
            $$3.accept($$2);
        }));
    }

    public void a(long $$0, Runnable $$1, boolean $$2) {
        this.f.a_(new cbw.c(1, () -> {
            this.d.a($$0, $$2);
            this.a($$0);
            if (this.b) {
                this.b = false;
                this.b();
            }
            $$1.run();
        }));
    }

    public void a(Runnable $$0, long $$1, IntSupplier $$2) {
        this.f.a_(new cbw.c(2, () -> {
            int $$3 = $$2.getAsInt();
            if (w.M) {
                c.debug("SUB {} {} {} {}", new Object[]{new dvu($$1), $$3, this.e, this.d});
            }
            this.d.a($$0, $$1, $$3);
            if (this.b) {
                this.b = false;
                this.b();
            }
        }));
    }

    protected void b() {
        this.f.a_(new cbw.c(3, () -> {
            awm.a $$0 = this.c();
            if ($$0 == null) {
                this.b = true;
            } else {
                this.a($$0);
            }
        }));
    }

    protected void a(awm.a $$02) {
        CompletableFuture.allOf((CompletableFuture[])$$02.b().stream().map($$0 -> this.e.a((CompletableFuture<Source> $$1) -> {
            $$0.run();
            $$1.complete(bhr.a);
        })).toArray(CompletableFuture[]::new)).thenAccept($$0 -> this.b());
    }

    protected void a(long $$0) {
    }

    protected @Nullable awm.a c() {
        return this.d.a();
    }

    @Override
    public void close() {
        this.e.close();
    }
}

