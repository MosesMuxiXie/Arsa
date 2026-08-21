/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class nj
implements mq {
    private final ms d;

    public nj(ms $$0) {
        this.d = $$0;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        JsonObject $$12 = new JsonObject();
        mi.aR.c().forEach($$1 -> $$12.add($$1.h().a().toString(), nj.a((jq)$$1.a())));
        Path $$2 = this.d.a(ms.b.c).resolve("registries.json");
        return mq.a($$0, (JsonElement)$$12, $$2);
    }

    private static <T> JsonElement a(jq<T> $$0) {
        JsonObject $$1 = new JsonObject();
        if ($$0 instanceof iy) {
            amo $$22 = ((iy)$$0).b();
            $$1.addProperty("default", $$22.toString());
        }
        int $$3 = mi.aR.a($$0);
        $$1.addProperty("protocol_id", (Number)$$3);
        JsonObject $$4 = new JsonObject();
        $$0.c().forEach($$2 -> {
            Object $$3 = $$2.a();
            int $$4 = $$0.a($$3);
            JsonObject $$5 = new JsonObject();
            $$5.addProperty("protocol_id", (Number)$$4);
            $$4.add($$2.h().a().toString(), (JsonElement)$$5);
        });
        $$1.add("entries", (JsonElement)$$4);
        return $$1;
    }

    @Override
    public final String a() {
        return "Registry Dump";
    }
}

