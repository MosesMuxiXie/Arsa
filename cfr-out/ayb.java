/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jspecify.annotations.Nullable;

public class ayb
extends ayn {
    private static final String b = "v1/chat";
    final URL c;
    final a d;
    final URL e;
    final a f;
    private final String g;

    private ayb(URL $$0, ayn.b $$1, URL $$2, a $$3, URL $$4, a $$5, String $$6, ayn.a $$7, ExecutorService $$8) {
        super($$0, $$1, $$7, $$8);
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
    }

    public static @Nullable ayn a(String $$0) {
        try {
            ayn.b $$18;
            JsonObject $$1 = bfv.a($$0);
            URI $$22 = new URI(bfv.i($$1, "apiServer"));
            String $$32 = bfv.i($$1, "apiKey");
            if ($$32.isEmpty()) {
                throw new IllegalArgumentException("Missing API key");
            }
            int $$42 = bfv.a($$1, "ruleId", 1);
            String $$5 = bfv.a($$1, "serverId", "");
            String $$6 = bfv.a($$1, "roomId", "Java:Chat");
            int $$7 = bfv.a($$1, "hashesToDrop", -1);
            int $$8 = bfv.a($$1, "maxConcurrentRequests", 7);
            JsonObject $$9 = bfv.a($$1, "endpoints", null);
            String $$10 = ayb.a($$9, "chat", b);
            boolean $$11 = $$10.equals(b);
            URL $$12 = $$22.resolve("/" + $$10).toURL();
            URL $$13 = ayb.a($$22, $$9, "join", "v1/join");
            URL $$14 = ayb.a($$22, $$9, "leave", "v1/leave");
            a $$15 = $$2 -> {
                JsonObject $$3 = new JsonObject();
                $$3.addProperty("server", $$5);
                $$3.addProperty("room", $$6);
                $$3.addProperty("user_id", $$2.id().toString());
                $$3.addProperty("user_display_name", $$2.name());
                return $$3;
            };
            if ($$11) {
                ayn.b $$16 = ($$3, $$4) -> {
                    JsonObject $$5 = new JsonObject();
                    $$5.addProperty("rule", (Number)$$42);
                    $$5.addProperty("server", $$5);
                    $$5.addProperty("room", $$6);
                    $$5.addProperty("player", $$3.id().toString());
                    $$5.addProperty("player_display_name", $$3.name());
                    $$5.addProperty("text", $$4);
                    $$5.addProperty("language", "*");
                    return $$5;
                };
            } else {
                String $$17 = String.valueOf($$42);
                $$18 = ($$3, $$4) -> {
                    JsonObject $$5 = new JsonObject();
                    $$5.addProperty("rule_id", $$17);
                    $$5.addProperty("category", $$5);
                    $$5.addProperty("subcategory", $$6);
                    $$5.addProperty("user_id", $$3.id().toString());
                    $$5.addProperty("user_display_name", $$3.name());
                    $$5.addProperty("text", $$4);
                    $$5.addProperty("language", "*");
                    return $$5;
                };
            }
            ayn.a $$19 = ayn.a.select($$7);
            ExecutorService $$20 = ayb.a($$8);
            String $$21 = Base64.getEncoder().encodeToString($$32.getBytes(StandardCharsets.US_ASCII));
            return new ayb($$12, $$18, $$13, $$15, $$14, $$15, $$21, $$19, $$20);
        }
        catch (Exception $$22) {
            a.warn("Failed to parse chat filter config {}", (Object)$$0, (Object)$$22);
            return null;
        }
    }

    @Override
    public ayo a(GameProfile $$0) {
        return new ayn.c($$0){

            @Override
            public void a() {
                ayb.this.a(this.b, ayb.this.c, ayb.this.d, this.c);
            }

            @Override
            public void b() {
                ayb.this.a(this.b, ayb.this.e, ayb.this.f, this.c);
            }
        };
    }

    void a(GameProfile $$0, URL $$1, a $$2, Executor $$3) {
        $$3.execute(() -> {
            JsonObject $$3 = $$2.encode($$0);
            try {
                this.b($$3, $$1);
            }
            catch (Exception $$4) {
                a.warn("Failed to send join/leave packet to {} for player {}", new Object[]{$$1, $$0, $$4});
            }
        });
    }

    private void b(JsonObject $$0, URL $$1) throws IOException {
        HttpURLConnection $$2 = this.a($$0, $$1);
        try (InputStream $$3 = $$2.getInputStream();){
            this.a($$3);
        }
    }

    @Override
    protected void a(HttpURLConnection $$0) {
        $$0.setRequestProperty("Authorization", "Basic " + this.g);
    }

    @Override
    protected axy a(String $$0, ayn.a $$1, JsonObject $$2) {
        boolean $$3 = bfv.a($$2, "response", false);
        if ($$3) {
            return axy.a($$0);
        }
        String $$4 = bfv.a($$2, "hashed", null);
        if ($$4 == null) {
            return axy.b($$0);
        }
        JsonArray $$5 = bfv.v($$2, "hashes");
        yl $$6 = this.a($$0, $$5, $$1);
        return new axy($$0, $$6);
    }

    @FunctionalInterface
    static interface a {
        public JsonObject encode(GameProfile var1);
    }
}

