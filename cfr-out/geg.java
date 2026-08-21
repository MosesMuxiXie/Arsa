/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class geg
extends geh {
    private static final yh b = yh.c("multiplayer.applyingPack");
    private static final Logger c = LogUtils.getLogger();
    private static final yh d = yh.c("mco.connect.connecting");
    private final gbg e;
    private final gsb f;

    public geg(gsb $$0, gbg $$1) {
        this.f = $$0;
        this.e = $$1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void run() {
        void $$6;
        try {
            gbc $$0 = this.f();
        }
        catch (CancellationException $$1) {
            c.info("User aborted connecting to realms");
            return;
        }
        catch (gce $$2) {
            switch ($$2.a.a()) {
                case 6002: {
                    geg.a(new gdc(this.f, this.e));
                    return;
                }
                case 6006: {
                    boolean $$3 = gfj.V().b(this.e.h);
                    geg.a($$3 ? new gcn(this.f, this.e.b, this.e.j()) : new gcs(yh.c("mco.brokenworld.nonowner.title"), yh.c("mco.brokenworld.nonowner.error"), this.f));
                    return;
                }
            }
            this.a($$2);
            c.error("Couldn't connect to world", (Throwable)$$2);
            return;
        }
        catch (TimeoutException $$4) {
            this.a(yh.c("mco.errorMessage.connectionFailure"));
            return;
        }
        catch (Exception $$5) {
            c.error("Couldn't connect to world", (Throwable)$$5);
            this.a($$5);
            return;
        }
        if ($$6.a() == null) {
            this.a(yh.c("mco.errorMessage.connectionFailure"));
            return;
        }
        boolean $$7 = $$6.b() != null && $$6.c() != null;
        gcu $$8 = $$7 ? this.a((gbc)$$6, geg.a(this.e), this::a) : this.a((gbc)$$6);
        geg.a($$8);
    }

    private static UUID a(gbg $$0) {
        if ($$0.r != null) {
            return UUID.nameUUIDFromBytes(("minigame:" + $$0.r).getBytes(StandardCharsets.UTF_8));
        }
        return UUID.nameUUIDFromBytes(("realms:" + Objects.requireNonNullElse($$0.d, "") + ":" + $$0.q).getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public yh a() {
        return d;
    }

    private gbc f() throws gce, TimeoutException, CancellationException {
        fzz $$0 = fzz.a();
        for (int $$1 = 0; $$1 < 40; ++$$1) {
            if (this.d()) {
                throw new CancellationException();
            }
            try {
                return $$0.b(this.e.b);
            }
            catch (gcf $$2) {
                geg.a($$2.c);
                continue;
            }
        }
        throw new TimeoutException();
    }

    public gcu a(gbc $$0) {
        return new gct(this.f, $$0, (geh)new gee(this.f, this.e, $$0));
    }

    private gkh a(gbc $$0, UUID $$1, Function<gbc, gsb> $$2) {
        yw $$32 = yh.c("mco.configure.world.resourcepack.question");
        return gcy.a(this.f, $$32, $$3 -> {
            geg.a(new grm(b));
            ((CompletableFuture)this.a($$0, $$1).thenRun(() -> geg.a((gsb)$$2.apply($$0)))).exceptionally($$1 -> {
                gfj.V().ak().i();
                c.error("Failed to download resource pack from {}", (Object)$$0, $$1);
                geg.a(new gcs(yh.c("mco.download.resourcePack.fail"), this.f));
                return null;
            });
        });
    }

    private CompletableFuture<?> a(gbc $$0, UUID $$1) {
        try {
            if ($$0.b() == null) {
                return CompletableFuture.failedFuture(new IllegalStateException("resourcePackUrl was null"));
            }
            if ($$0.c() == null) {
                return CompletableFuture.failedFuture(new IllegalStateException("resourcePackHash was null"));
            }
            iom $$2 = gfj.V().ak();
            CompletableFuture<Void> $$3 = $$2.b($$1);
            $$2.g();
            $$2.a($$1, new URL($$0.b()), $$0.c());
            return $$3;
        }
        catch (Exception $$4) {
            return CompletableFuture.failedFuture($$4);
        }
    }
}

