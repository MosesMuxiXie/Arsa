/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ne
implements mq {
    private final ms d;
    private final CompletableFuture<jf.a> e;

    public ne(ms $$0, CompletableFuture<jf.a> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        Path $$1 = this.d.a(ms.b.c).resolve("blocks.json");
        return this.e.thenCompose($$22 -> {
            JsonObject $$3 = new JsonObject();
            ams $$4 = $$22.a(JsonOps.INSTANCE);
            $$22.e(mj.i).c().forEach($$2 -> {
                JsonObject $$3 = new JsonObject();
                eoi<dzq, eoh> $$4 = ((dzq)$$2.a()).l();
                if (!$$4.d().isEmpty()) {
                    JsonObject $$5 = new JsonObject();
                    for (epk epk2 : $$4.d()) {
                        JsonArray $$7 = new JsonArray();
                        for (Comparable $$8 : epk2.a()) {
                            $$7.add(bhs.a(epk2, (Object)$$8));
                        }
                        $$5.add(epk2.f(), (JsonElement)$$7);
                    }
                    $$3.add("properties", (JsonElement)$$5);
                }
                JsonArray $$9 = new JsonArray();
                for (eoh eoh2 : $$4.a()) {
                    JsonObject $$11 = new JsonObject();
                    JsonObject $$122 = new JsonObject();
                    for (epk<?> $$13 : $$4.d()) {
                        $$122.addProperty($$13.f(), bhs.a($$13, eoh2.c($$13)));
                    }
                    if (!$$122.isEmpty()) {
                        $$11.add("properties", (JsonElement)$$122);
                    }
                    $$11.addProperty("id", (Number)dzq.j(eoh2));
                    if (eoh2 == ((dzq)$$2.a()).m()) {
                        $$11.addProperty("default", Boolean.valueOf(true));
                    }
                    $$9.add((JsonElement)$$11);
                }
                $$3.add("states", (JsonElement)$$9);
                String $$14 = $$2.g();
                JsonElement jsonElement = (JsonElement)dzr.a.codec().encodeStart((DynamicOps)$$4, (Object)((dzq)$$2.a())).getOrThrow($$1 -> new AssertionError((Object)("Failed to serialize block " + $$14 + " (is type registered in BlockTypes?): " + $$1)));
                $$3.add("definition", jsonElement);
                $$3.add($$14, (JsonElement)$$3);
            });
            return mq.a($$0, (JsonElement)$$3, $$1);
        });
    }

    @Override
    public final String a() {
        return "Block List";
    }
}

