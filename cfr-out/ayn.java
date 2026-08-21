/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.internal.Streams
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class ayn
implements AutoCloseable {
    protected static final Logger a = LogUtils.getLogger();
    private static final AtomicInteger b = new AtomicInteger(1);
    private static final ThreadFactory c = $$0 -> {
        Thread $$1 = new Thread($$0);
        $$1.setName("Chat-Filter-Worker-" + b.getAndIncrement());
        return $$1;
    };
    private final URL d;
    private final b e;
    final a f;
    final ExecutorService g;

    protected static ExecutorService a(int $$0) {
        return Executors.newFixedThreadPool($$0, c);
    }

    protected ayn(URL $$0, b $$1, a $$2, ExecutorService $$3) {
        this.f = $$2;
        this.g = $$3;
        this.d = $$0;
        this.e = $$1;
    }

    protected static URL a(URI $$0, @Nullable JsonObject $$1, String $$2, String $$3) throws MalformedURLException {
        String $$4 = ayn.a($$1, $$2, $$3);
        return $$0.resolve("/" + $$4).toURL();
    }

    protected static String a(@Nullable JsonObject $$0, String $$1, String $$2) {
        return $$0 != null ? bfv.a($$0, $$1, $$2) : $$2;
    }

    public static @Nullable ayn a(arz $$0) {
        String $$1 = $$0.Z;
        if (bhi.h($$1)) {
            return null;
        }
        return switch ($$0.aa) {
            case 0 -> ayb.a($$1);
            case 1 -> aye.a($$1);
            default -> {
                a.warn("Could not create text filter - unsupported text filtering version used");
                yield null;
            }
        };
    }

    protected CompletableFuture<axy> a(GameProfile $$0, String $$1, a $$2, Executor $$3) {
        if ($$1.isEmpty()) {
            return CompletableFuture.completedFuture(axy.a);
        }
        return CompletableFuture.supplyAsync(() -> {
            JsonObject $$3 = this.e.encode($$0, $$1);
            try {
                JsonObject $$4 = this.b($$3, this.d);
                return this.a($$1, $$2, $$4);
            }
            catch (Exception $$5) {
                a.warn("Failed to validate message '{}'", (Object)$$1, (Object)$$5);
                return axy.b($$1);
            }
        }, $$3);
    }

    protected abstract axy a(String var1, a var2, JsonObject var3);

    protected yl a(String $$0, JsonArray $$1, a $$2) {
        if ($$1.isEmpty()) {
            return yl.c;
        }
        if ($$2.shouldIgnore($$0, $$1.size())) {
            return yl.b;
        }
        yl $$3 = new yl($$0.length());
        for (int $$4 = 0; $$4 < $$1.size(); ++$$4) {
            $$3.a($$1.get($$4).getAsInt());
        }
        return $$3;
    }

    @Override
    public void close() {
        this.g.shutdownNow();
    }

    protected void a(InputStream $$0) throws IOException {
        byte[] $$1 = new byte[1024];
        while ($$0.read($$1) != -1) {
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private JsonObject b(JsonObject $$0, URL $$1) throws IOException {
        HttpURLConnection $$2 = this.a($$0, $$1);
        try (InputStream $$3 = $$2.getInputStream();){
            JsonObject jsonObject;
            if ($$2.getResponseCode() == 204) {
                JsonObject jsonObject2 = new JsonObject();
                return jsonObject2;
            }
            try {
                jsonObject = bge.a(new InputStreamReader($$3, StandardCharsets.UTF_8)).getAsJsonObject();
            }
            catch (Throwable throwable) {
                this.a($$3);
                throw throwable;
            }
            this.a($$3);
            return jsonObject;
        }
    }

    protected HttpURLConnection a(JsonObject $$0, URL $$1) throws IOException {
        HttpURLConnection $$2 = this.a($$1);
        this.a($$2);
        try (OutputStreamWriter $$3 = new OutputStreamWriter($$2.getOutputStream(), StandardCharsets.UTF_8);
             JsonWriter $$4 = new JsonWriter((Writer)$$3);){
            Streams.write((JsonElement)$$0, (JsonWriter)$$4);
        }
        int $$5 = $$2.getResponseCode();
        if ($$5 < 200 || $$5 >= 300) {
            throw new d($$5 + " " + $$2.getResponseMessage());
        }
        return $$2;
    }

    protected abstract void a(HttpURLConnection var1);

    protected int a() {
        return 2000;
    }

    protected HttpURLConnection a(URL $$0) throws IOException {
        HttpURLConnection $$1 = (HttpURLConnection)$$0.openConnection();
        $$1.setConnectTimeout(15000);
        $$1.setReadTimeout(this.a());
        $$1.setUseCaches(false);
        $$1.setDoOutput(true);
        $$1.setDoInput(true);
        $$1.setRequestMethod("POST");
        $$1.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        $$1.setRequestProperty("Accept", "application/json");
        $$1.setRequestProperty("User-Agent", "Minecraft server" + w.b().c());
        return $$1;
    }

    public ayo a(GameProfile $$0) {
        return new c($$0);
    }

    @FunctionalInterface
    public static interface a {
        public static final a a = ($$0, $$1) -> false;
        public static final a b = ($$0, $$1) -> $$0.length() == $$1;

        public static a ignoreOverThreshold(int $$0) {
            return ($$1, $$2) -> $$2 >= $$0;
        }

        public static a select(int $$0) {
            return switch ($$0) {
                case -1 -> a;
                case 0 -> b;
                default -> ayn$a.ignoreOverThreshold($$0);
            };
        }

        public boolean shouldIgnore(String var1, int var2);
    }

    @FunctionalInterface
    protected static interface b {
        public JsonObject encode(GameProfile var1, String var2);
    }

    protected static class d
    extends RuntimeException {
        protected d(String $$0) {
            super($$0);
        }
    }

    protected class c
    implements ayo {
        protected final GameProfile b;
        protected final Executor c;

        protected c(GameProfile $$1) {
            this.b = $$1;
            cbs $$2 = new cbs(ayn.this.g, "chat stream for " + $$1.name());
            this.c = $$2::a_;
        }

        @Override
        public CompletableFuture<List<axy>> a(List<String> $$02) {
            List $$1 = (List)$$02.stream().map($$0 -> ayn.this.a(this.b, (String)$$0, ayn.this.f, this.c)).collect(ImmutableList.toImmutableList());
            return bhs.d($$1).exceptionally($$0 -> ImmutableList.of());
        }

        @Override
        public CompletableFuture<axy> a(String $$0) {
            return ayn.this.a(this.b, $$0, ayn.this.f, this.c);
        }
    }
}

