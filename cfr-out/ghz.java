/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ghz {
    private final Optional<amo> a;
    private final Set<gic> b;
    private final Optional<String> c;

    public ghz(Optional<amo> $$0, Optional<String> $$1, gic ... $$2) {
        this.a = $$0;
        this.c = $$1;
        this.b = ImmutableSet.copyOf((Object[])$$2);
    }

    public amo a(dzq $$0) {
        return ghy.a($$0, this.c.orElse(""));
    }

    public amo a(dzq $$0, gib $$1, BiConsumer<amo, ghx> $$2) {
        return this.a(ghy.a($$0, this.c.orElse("")), $$1, $$2);
    }

    public amo a(dzq $$0, String $$1, gib $$2, BiConsumer<amo, ghx> $$3) {
        return this.a(ghy.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
    }

    public amo b(dzq $$0, String $$1, gib $$2, BiConsumer<amo, ghx> $$3) {
        return this.a(ghy.a($$0, $$1), $$2, $$3);
    }

    public amo a(dlp $$0, gib $$1, BiConsumer<amo, ghx> $$2) {
        return this.a(ghy.a($$0, this.c.orElse("")), $$1, $$2);
    }

    public amo a(amo $$0, gib $$1, BiConsumer<amo, ghx> $$2) {
        Map<gic, amo> $$3 = this.a($$1);
        $$2.accept($$0, () -> {
            JsonObject $$12 = new JsonObject();
            this.a.ifPresent($$1 -> $$12.addProperty("parent", $$1.toString()));
            if (!$$3.isEmpty()) {
                JsonObject $$22 = new JsonObject();
                $$3.forEach(($$1, $$2) -> $$22.addProperty($$1.a(), $$2.toString()));
                $$12.add("textures", (JsonElement)$$22);
            }
            return $$12;
        });
        return $$0;
    }

    private Map<gic, amo> a(gib $$0) {
        return (Map)Streams.concat((Stream[])new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
    }
}

