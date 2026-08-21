/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ilj {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 64;
    private static final int c = 64;
    private static final int d = 32;
    private final Proxy e;
    private final ilr f;
    private final Executor g;

    public ilj(Proxy $$0, ilr $$1, Executor $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public CompletableFuture<iu.c> a(amo $$0, Path $$12, String $$2, boolean $$3) {
        iu.a $$4 = new iu.a($$0, $$2);
        return CompletableFuture.supplyAsync(() -> {
            void $$5;
            try {
                fyh $$3 = this.a($$12, $$4.c());
            }
            catch (IOException $$4) {
                throw new UncheckedIOException($$4);
            }
            return $$3 ? ilj.a((fyh)$$5, $$4.c()) : $$5;
        }, bhs.j().a("downloadTexture")).thenCompose($$1 -> this.a((iu.c)$$4, (fyh)$$1));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private fyh a(Path $$0, String $$1) throws IOException {
        if (Files.isRegularFile($$0, new LinkOption[0])) {
            a.debug("Loading HTTP texture from local cache ({})", (Object)$$0);
            try (InputStream $$2 = Files.newInputStream($$0, new OpenOption[0]);){
                fyh fyh2 = fyh.a($$2);
                return fyh2;
            }
        }
        HttpURLConnection $$3 = null;
        a.debug("Downloading HTTP texture from {} to {}", (Object)$$1, (Object)$$0);
        URI $$4 = URI.create($$1);
        try {
            $$3 = (HttpURLConnection)$$4.toURL().openConnection(this.e);
            $$3.setDoInput(true);
            $$3.setDoOutput(false);
            $$3.connect();
            int $$5 = $$3.getResponseCode();
            if ($$5 / 100 != 2) {
                throw new IOException("Failed to open " + String.valueOf($$4) + ", HTTP error code: " + $$5);
            }
            byte[] $$6 = $$3.getInputStream().readAllBytes();
            try {
                bfp.c($$0.getParent());
                Files.write($$0, $$6, new OpenOption[0]);
            }
            catch (IOException $$7) {
                a.warn("Failed to cache texture {} in {}", (Object)$$1, (Object)$$0);
            }
            fyh fyh3 = fyh.a($$6);
            return fyh3;
        }
        finally {
            if ($$3 != null) {
                $$3.disconnect();
            }
        }
    }

    private CompletableFuture<iu.c> a(iu.c $$0, fyh $$1) {
        return CompletableFuture.supplyAsync(() -> {
            ilc $$2 = new ilc($$0.b()::toString, $$1);
            this.f.a($$0.b(), $$2);
            return $$0;
        }, this.g);
    }

    private static fyh a(fyh $$0, String $$1) {
        boolean $$4;
        int $$2 = $$0.b();
        int $$3 = $$0.a();
        if ($$3 != 64 || $$2 != 32 && $$2 != 64) {
            $$0.close();
            throw new IllegalStateException("Discarding incorrectly sized (" + $$3 + "x" + $$2 + ") skin texture from " + $$1);
        }
        boolean bl2 = $$4 = $$2 == 32;
        if ($$4) {
            fyh $$5 = new fyh(64, 64, true);
            $$5.a($$0);
            $$0.close();
            $$0 = $$5;
            $$0.a(0, 32, 64, 32, 0);
            $$0.a(4, 16, 16, 32, 4, 4, true, false);
            $$0.a(8, 16, 16, 32, 4, 4, true, false);
            $$0.a(0, 20, 24, 32, 4, 12, true, false);
            $$0.a(4, 20, 16, 32, 4, 12, true, false);
            $$0.a(8, 20, 8, 32, 4, 12, true, false);
            $$0.a(12, 20, 16, 32, 4, 12, true, false);
            $$0.a(44, 16, -8, 32, 4, 4, true, false);
            $$0.a(48, 16, -8, 32, 4, 4, true, false);
            $$0.a(40, 20, 0, 32, 4, 12, true, false);
            $$0.a(44, 20, -8, 32, 4, 12, true, false);
            $$0.a(48, 20, -16, 32, 4, 12, true, false);
            $$0.a(52, 20, -8, 32, 4, 12, true, false);
        }
        ilj.b($$0, 0, 0, 32, 16);
        if ($$4) {
            ilj.a($$0, 32, 0, 64, 32);
        }
        ilj.b($$0, 0, 16, 64, 32);
        ilj.b($$0, 16, 48, 48, 64);
        return $$0;
    }

    private static void a(fyh $$0, int $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = $$1; $$5 < $$3; ++$$5) {
            for (int $$6 = $$2; $$6 < $$4; ++$$6) {
                int $$7 = $$0.a($$5, $$6);
                if (bel.b($$7) >= 128) continue;
                return;
            }
        }
        for (int $$8 = $$1; $$8 < $$3; ++$$8) {
            for (int $$9 = $$2; $$9 < $$4; ++$$9) {
                $$0.b($$8, $$9, $$0.a($$8, $$9) & 0xFFFFFF);
            }
        }
    }

    private static void b(fyh $$0, int $$1, int $$2, int $$3, int $$4) {
        for (int $$5 = $$1; $$5 < $$3; ++$$5) {
            for (int $$6 = $$2; $$6 < $$4; ++$$6) {
                $$0.b($$5, $$6, bel.g($$0.a($$5, $$6)));
            }
        }
    }
}

