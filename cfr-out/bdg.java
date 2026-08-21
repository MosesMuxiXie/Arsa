/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bdg
extends bdl {
    private static final Gson b = new GsonBuilder().setPrettyPrinting().create();
    private static final Logger c = LogUtils.getLogger();
    private static final Codec<Map<bdh<?>, Integer>> d = Codec.dispatchedMap(mi.w.q(), bhs.b(bdg::a)).xmap($$0 -> {
        HashMap $$12 = new HashMap();
        $$0.forEach(($$1, $$2) -> $$12.putAll($$2));
        return $$12;
    }, $$02 -> $$02.entrySet().stream().collect(Collectors.groupingBy($$0 -> ((bdh)$$0.getKey()).a(), bhs.a())));
    private final Path e;
    private final Set<bdh<?>> f = Sets.newHashSet();

    private static <T> Codec<Map<bdh<?>, Integer>> a(bdj<T> $$0) {
        Codec<T> $$12 = $$0.b().q();
        Codec $$2 = $$12.flatComapMap($$0::b, $$1 -> {
            if ($$1.a() == $$0) {
                return DataResult.success($$1.b());
            }
            return DataResult.error(() -> "Expected type " + String.valueOf($$0) + ", but got " + String.valueOf($$1.a()));
        });
        return Codec.unboundedMap((Codec)$$2, (Codec)Codec.INT);
    }

    public bdg(MinecraftServer $$0, Path $$1) {
        this.e = $$1;
        if (Files.isRegularFile($$1, new LinkOption[0])) {
            try (BufferedReader $$2 = Files.newBufferedReader($$1, StandardCharsets.UTF_8);){
                JsonElement $$3 = bhf.a($$2);
                this.a($$0.aA(), $$3);
            }
            catch (IOException $$4) {
                c.error("Couldn't read statistics file {}", (Object)$$1, (Object)$$4);
            }
            catch (JsonParseException $$5) {
                c.error("Couldn't parse statistics file {}", (Object)$$1, (Object)$$5);
            }
        }
    }

    public void a() {
        try {
            bfp.c(this.e.getParent());
            try (BufferedWriter $$0 = Files.newBufferedWriter(this.e, StandardCharsets.UTF_8, new OpenOption[0]);){
                b.toJson(this.b(), b.newJsonWriter((Writer)$$0));
            }
        }
        catch (JsonIOException | IOException $$1) {
            c.error("Couldn't save stats to {}", (Object)this.e, (Object)$$1);
        }
    }

    @Override
    public void a(ddm $$0, bdh<?> $$1, int $$2) {
        super.a($$0, $$1, $$2);
        this.f.add($$1);
    }

    private Set<bdh<?>> d() {
        HashSet $$0 = Sets.newHashSet(this.f);
        this.f.clear();
        return $$0;
    }

    public void a(DataFixer $$02, JsonElement $$1) {
        Dynamic $$2 = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)$$1);
        $$2 = bhz.h.a($$02, $$2, vo.b($$2, 1343));
        this.a.putAll(d.parse($$2.get("stats").orElseEmptyMap()).resultOrPartial($$0 -> c.error("Failed to parse statistics for {}: {}", (Object)this.e, $$0)).orElse(Map.of()));
    }

    protected JsonElement b() {
        JsonObject $$0 = new JsonObject();
        $$0.add("stats", (JsonElement)d.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)this.a).getOrThrow());
        $$0.addProperty("DataVersion", (Number)w.b().a().b());
        return $$0;
    }

    public void c() {
        this.f.addAll((Collection<bdh<?>>)this.a.keySet());
    }

    public void a(axg $$0) {
        Object2IntOpenHashMap $$1 = new Object2IntOpenHashMap();
        for (bdh<?> $$2 : this.d()) {
            $$1.put($$2, this.a($$2));
        }
        $$0.g.b(new ade((Object2IntMap<bdh<?>>)$$1));
    }
}

