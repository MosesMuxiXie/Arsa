/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.authlib.minecraft.TelemetrySession
 *  com.mojang.authlib.minecraft.UserApiService
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class iqw
implements AutoCloseable {
    private static final AtomicInteger a = new AtomicInteger(1);
    private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
        Thread $$1 = new Thread($$0);
        $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
        return $$1;
    });
    private final gfj c;
    private final UserApiService d;
    private final ire e;
    private final Path f;
    private final CompletableFuture<Optional<irc>> g;
    private final Supplier<ira> h = Suppliers.memoize(this::c);

    public iqw(gfj $$0, UserApiService $$12, gfx $$2) {
        this.c = $$0;
        this.d = $$12;
        ire.a $$3 = ire.a();
        $$2.f().ifPresent($$1 -> $$3.a(ird.a, $$1));
        $$2.e().ifPresent($$1 -> $$3.a(ird.b, $$1));
        $$3.a(ird.c, UUID.randomUUID());
        $$3.a(ird.d, w.b().b());
        $$3.a(ird.e, bhs.n().a());
        $$3.a(ird.f, System.getProperty("os.name"));
        $$3.a(ird.g, gfj.i().a());
        $$3.b(ird.h, gfj.bj());
        this.e = $$3.a();
        this.f = $$0.p.toPath().resolve("logs/telemetry");
        this.g = irc.a(this.f);
    }

    public irf a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
        return new irf(this.c(), $$0, $$1, $$2);
    }

    public ira a() {
        return this.h.get();
    }

    private ira c() {
        if (!this.c.J()) {
            return ira.a;
        }
        TelemetrySession $$02 = this.d.newTelemetrySession(b);
        if (!$$02.isEnabled()) {
            return ira.a;
        }
        CompletionStage $$1 = this.g.thenCompose($$0 -> $$0.map(irc::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
        return (arg_0, arg_1) -> this.a((CompletableFuture)$$1, $$02, arg_0, arg_1);
    }

    public Path b() {
        return this.f;
    }

    @Override
    public void close() {
        this.g.thenAccept($$0 -> $$0.ifPresent(irc::close));
    }

    private /* synthetic */ void a(CompletableFuture $$0, TelemetrySession $$1, irb $$22, Consumer $$3) {
        if ($$22.d() && !gfj.V().H()) {
            return;
        }
        ire.a $$4 = ire.a();
        $$4.a(this.e);
        $$4.a(ird.m, Instant.now());
        $$4.a(ird.l, $$22.d());
        $$3.accept($$4);
        iqx $$5 = new iqx($$22, $$4.a());
        $$0.thenAccept($$2 -> {
            if ($$2.isEmpty()) {
                return;
            }
            ((iqz)$$2.get()).log($$5);
            if (!w.aX || !w.aR) {
                $$5.a($$1).send();
            }
        });
    }
}

