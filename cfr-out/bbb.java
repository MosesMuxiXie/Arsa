/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface bbb {
    public static final bbb a = new bbb(){

        @Override
        public <T> Optional<T> a(azy<T> $$0) {
            return Optional.empty();
        }
    };
    public static final bar<bbb> b = () -> a;

    public static bbb a(InputStream $$0) throws IOException {
        try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8));){
            final JsonObject $$2 = bfv.a($$1);
            bbb bbb2 = new bbb(){

                @Override
                public <T> Optional<T> a(azy<T> $$0) {
                    String $$1 = $$0.a();
                    if ($$2.has($$1)) {
                        Object $$22 = $$0.b().parse((DynamicOps)JsonOps.INSTANCE, (Object)$$2.get($$1)).getOrThrow(JsonParseException::new);
                        return Optional.of($$22);
                    }
                    return Optional.empty();
                }
            };
            return bbb2;
        }
    }

    public <T> Optional<T> a(azy<T> var1);

    default public <T> Optional<azy.a<T>> b(azy<T> $$0) {
        return this.a($$0).map($$0::a);
    }

    default public List<azy.a<?>> a(Collection<azy<?>> $$0) {
        return $$0.stream().map(this::b).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
    }
}

