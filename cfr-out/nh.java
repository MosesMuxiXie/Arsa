/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class nh
implements mq {
    private final ms d;
    private final CompletableFuture<jf.a> e;

    public nh(ms $$0, CompletableFuture<jf.a> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        Path $$1 = this.d.a(ms.b.c).resolve("items.json");
        return this.e.thenCompose($$22 -> {
            JsonObject $$3 = new JsonObject();
            ams $$4 = $$22.a(JsonOps.INSTANCE);
            $$22.e(mj.R).c().forEach($$2 -> {
                JsonObject $$3 = new JsonObject();
                $$3.add("components", (JsonElement)kf.b.encodeStart((DynamicOps)$$4, (Object)((dlp)$$2.a()).f()).getOrThrow($$0 -> new IllegalStateException("Failed to encode components: " + $$0)));
                $$3.add($$2.g(), (JsonElement)$$3);
            });
            return mq.a($$0, (JsonElement)$$3, $$1);
        });
    }

    @Override
    public final String a() {
        return "Item List";
    }
}

