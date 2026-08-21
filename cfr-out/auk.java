/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 */
import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class auk
implements mq {
    private final Path d;

    public auk(ms $$0) {
        this.d = $$0.a(ms.b.c).resolve("json-rpc-api-schema.json");
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        avi.c $$1 = avi.a(auh.c());
        return mq.a($$0, (JsonElement)avi.c.a.codec().encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)$$1).getOrThrow(), this.d);
    }

    @Override
    public String a() {
        return "Json RPC API schema";
    }
}

