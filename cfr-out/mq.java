/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.google.gson.JsonElement
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.slf4j.Logger
 */
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import org.slf4j.Logger;

public interface mq {
    public static final ToIntFunction<String> a = (ToIntFunction)bhs.a(new Object2IntOpenHashMap(), (? super T $$0) -> {
        $$0.put((Object)"type", 0);
        $$0.put((Object)"parent", 1);
        $$0.defaultReturnValue(2);
    });
    public static final Comparator<String> b = Comparator.comparingInt(a).thenComparing($$0 -> $$0);
    public static final Logger c = LogUtils.getLogger();

    public CompletableFuture<?> a(mo var1);

    public String a();

    public static <T> CompletableFuture<?> a(mo $$0, Codec<T> $$1, ms.a $$2, Map<amo, T> $$3) {
        return mq.a($$0, $$1, $$2::a, $$3);
    }

    public static <T, E> CompletableFuture<?> a(mo $$0, Codec<E> $$12, Function<T, Path> $$2, Map<T, E> $$3) {
        return mq.a($$0, (E $$1) -> (JsonElement)$$12.encodeStart((DynamicOps)JsonOps.INSTANCE, $$1).getOrThrow(), $$2, $$3);
    }

    public static <T, E> CompletableFuture<?> a(mo $$0, Function<E, JsonElement> $$1, Function<T, Path> $$2, Map<T, E> $$32) {
        return CompletableFuture.allOf((CompletableFuture[])$$32.entrySet().stream().map($$3 -> {
            Path $$4 = (Path)$$2.apply($$3.getKey());
            JsonElement $$5 = (JsonElement)$$1.apply($$3.getValue());
            return mq.a($$0, $$5, $$4);
        }).toArray(CompletableFuture[]::new));
    }

    public static <T> CompletableFuture<?> a(mo $$0, jf.a $$1, Codec<T> $$2, T $$3, Path $$4) {
        ams<JsonElement> $$5 = $$1.a(JsonOps.INSTANCE);
        return mq.a($$0, $$5, $$2, $$3, $$4);
    }

    public static <T> CompletableFuture<?> a(mo $$0, Codec<T> $$1, T $$2, Path $$3) {
        return mq.a($$0, (DynamicOps<JsonElement>)JsonOps.INSTANCE, $$1, $$2, $$3);
    }

    private static <T> CompletableFuture<?> a(mo $$0, DynamicOps<JsonElement> $$1, Codec<T> $$2, T $$3, Path $$4) {
        JsonElement $$5 = (JsonElement)$$2.encodeStart($$1, $$3).getOrThrow();
        return mq.a($$0, $$5, $$4);
    }

    public static CompletableFuture<?> a(mo $$0, JsonElement $$1, Path $$2) {
        return CompletableFuture.runAsync(() -> {
            try {
                ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
                HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), (OutputStream)$$3);
                try (JsonWriter $$5 = new JsonWriter((Writer)new OutputStreamWriter((OutputStream)$$4, StandardCharsets.UTF_8));){
                    $$5.setSerializeNulls(false);
                    $$5.setIndent("  ");
                    bfv.a($$5, $$1, b);
                }
                $$0.writeIfNeeded($$2, $$3.toByteArray(), $$4.hash());
            }
            catch (IOException $$6) {
                c.error("Failed to save file to {}", (Object)$$2, (Object)$$6);
            }
        }, bhs.h().a("saveStable"));
    }

    @FunctionalInterface
    public static interface a<T extends mq> {
        public T create(ms var1);
    }
}

