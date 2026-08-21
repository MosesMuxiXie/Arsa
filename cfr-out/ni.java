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
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ni
implements mq {
    private final ms d;

    public ni(ms $$0) {
        this.d = $$0;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        Path $$1 = this.d.a(ms.b.c).resolve("packets.json");
        return mq.a($$0, this.b(), $$1);
    }

    private JsonElement b() {
        JsonObject $$0 = new JsonObject();
        Stream.of(akl.a, alu.c, alu.a, akv.c, akv.a, acp.c, acp.a, aia.c, aia.b).map(xn.b::a).collect(Collectors.groupingBy(xn.a::a)).forEach(($$1, $$2) -> {
            JsonObject $$3 = new JsonObject();
            $$0.add($$1.a(), (JsonElement)$$3);
            $$2.forEach($$12 -> {
                JsonObject $$22 = new JsonObject();
                $$3.add($$12.b().b(), (JsonElement)$$22);
                $$12.a((aba<?> $$1, int $$2) -> {
                    JsonObject $$3 = new JsonObject();
                    $$3.addProperty("protocol_id", (Number)$$2);
                    $$22.add($$1.b().toString(), (JsonElement)$$3);
                });
            });
        });
        return $$0;
    }

    @Override
    public String a() {
        return "Packet Report";
    }
}

