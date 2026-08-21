/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.input.CountingInputStream
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.apache.commons.io.input.CountingInputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fzx
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 5;
    private static final String c = "/upload";
    private final File d;
    private final long e;
    private final int f;
    private final gbw g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final gad l;
    private final HttpClient m;

    public fzx(File $$0, long $$1, int $$2, gbw $$3, gfx $$4, String $$5, String $$6, gad $$7) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4.a();
        this.i = $$4.c();
        this.j = $$5;
        this.k = $$6;
        this.l = $$7;
        this.m = HttpClient.newBuilder().executor(bhs.j()).connectTimeout(Duration.ofSeconds(15L)).build();
    }

    @Override
    public void close() {
        this.m.close();
    }

    public CompletableFuture<gde> a() {
        long $$0 = this.d.length();
        this.l.a($$0);
        return this.a(0, $$0);
    }

    private CompletableFuture<gde> a(int $$0, long $$1) {
        HttpRequest.BodyPublisher $$22 = fzx.a(() -> {
            try {
                return new a(new FileInputStream(this.d), this.l);
            }
            catch (IOException $$0) {
                a.warn("Failed to open file {}", (Object)this.d, (Object)$$0);
                return null;
            }
        }, $$1);
        HttpRequest $$3 = HttpRequest.newBuilder(this.g.c().resolve("/upload/" + this.e + "/" + this.f)).timeout(Duration.ofMinutes(10L)).setHeader("Cookie", this.b()).setHeader("Content-Type", "application/octet-stream").POST($$22).build();
        return this.m.sendAsync($$3, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)).thenCompose($$2 -> {
            long $$3 = this.b((HttpResponse<?>)$$2);
            if (this.a($$3, $$0)) {
                this.l.a();
                try {
                    Thread.sleep(Duration.ofSeconds($$3));
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                return this.a($$0 + 1, $$1);
            }
            return CompletableFuture.completedFuture(this.a((HttpResponse<String>)$$2));
        });
    }

    private static HttpRequest.BodyPublisher a(Supplier<@Nullable InputStream> $$0, long $$1) {
        return HttpRequest.BodyPublishers.fromPublisher(HttpRequest.BodyPublishers.ofInputStream($$0), $$1);
    }

    private String b() {
        return "sid=" + this.h + ";token=" + this.g.b() + ";user=" + this.i + ";version=" + this.j + ";worldVersion=" + this.k;
    }

    private gde a(HttpResponse<String> $$0) {
        int $$1 = $$0.statusCode();
        if ($$1 == 401) {
            a.debug("Realms server returned 401: {}", $$0.headers().firstValue("WWW-Authenticate"));
        }
        String $$2 = null;
        String $$3 = $$0.body();
        if ($$3 != null && !$$3.isBlank()) {
            try {
                JsonElement $$4 = bge.a($$3).getAsJsonObject().get("errorMsg");
                if ($$4 != null) {
                    $$2 = $$4.getAsString();
                }
            }
            catch (Exception $$5) {
                a.warn("Failed to parse response {}", (Object)$$3, (Object)$$5);
            }
        }
        return new gde($$1, $$2);
    }

    private boolean a(long $$0, int $$1) {
        return $$0 > 0L && $$1 + 1 < 5;
    }

    private long b(HttpResponse<?> $$0) {
        return $$0.headers().firstValueAsLong("Retry-After").orElse(0L);
    }

    static class a
    extends CountingInputStream {
        private final gad a;

        a(InputStream $$0, gad $$1) {
            super($$0);
            this.a = $$1;
        }

        protected void afterRead(int $$0) throws IOException {
            super.afterRead($$0);
            this.a.b(this.getByteCount());
        }
    }
}

