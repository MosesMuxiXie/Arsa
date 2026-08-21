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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class oh
implements mq {
    private final ms d;
    private final Map<String, Supplier<JsonElement>> e = new HashMap<String, Supplier<JsonElement>>();

    public oh(ms $$0) {
        this.d = $$0;
    }

    public <T> oh a(azy<T> $$0, T $$1) {
        this.e.put($$0.a(), () -> ((JsonElement)$$0.b().encodeStart((DynamicOps)JsonOps.INSTANCE, $$1).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
        return this;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        JsonObject $$12 = new JsonObject();
        this.e.forEach(($$1, $$2) -> $$12.add($$1, (JsonElement)$$2.get()));
        return mq.a($$0, (JsonElement)$$12, this.d.a().resolve("pack.mcmeta"));
    }

    @Override
    public final String a() {
        return "Pack Metadata";
    }

    public static oh a(ms $$0, yh $$1) {
        return new oh($$0).a(baa.b, new baa($$1, r.a.a(azn.b).a()));
    }

    public static oh a(ms $$0, yh $$1, dgz $$2) {
        return oh.a($$0, $$1).a(azh.a, new azh($$2));
    }
}

