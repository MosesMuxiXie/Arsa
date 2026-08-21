/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.time.Clock;
import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class irc
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = ".json";
    private static final int c = 7;
    private final bxu d;
    private @Nullable CompletableFuture<Optional<iqy>> e;

    private irc(bxu $$0) {
        this.d = $$0;
    }

    public static CompletableFuture<Optional<irc>> a(Path $$0) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                bxu $$1 = bxu.a($$0, b);
                $$1.a().a(LocalDate.now(Clock.systemDefaultZone()), 7).a();
                return Optional.of(new irc($$1));
            }
            catch (Exception $$2) {
                a.error("Failed to create telemetry log manager", (Throwable)$$2);
                return Optional.empty();
            }
        }, bhs.h());
    }

    public CompletableFuture<Optional<iqz>> a() {
        if (this.e == null) {
            this.e = CompletableFuture.supplyAsync(() -> {
                try {
                    bxu.e $$0 = this.d.a(LocalDate.now(Clock.systemDefaultZone()));
                    FileChannel $$1 = $$0.e();
                    return Optional.of(new iqy($$1, bhs.h()));
                }
                catch (IOException $$2) {
                    a.error("Failed to open channel for telemetry event log", (Throwable)$$2);
                    return Optional.empty();
                }
            }, bhs.h());
        }
        return this.e.thenApply($$0 -> $$0.map(iqy::a));
    }

    @Override
    public void close() {
        if (this.e != null) {
            this.e.thenAccept($$0 -> $$0.ifPresent(iqy::close));
        }
    }
}

