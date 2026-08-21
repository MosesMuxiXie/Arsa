/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class azc
implements azl {
    private static final Logger c = LogUtils.getLogger();
    private final azk d;

    protected azc(azk $$0) {
        this.d = $$0;
    }

    @Override
    public <T> @Nullable T a(azy<T> $$0) throws IOException {
        bar<InputStream> $$1 = this.a("pack.mcmeta");
        if ($$1 == null) {
            return null;
        }
        try (InputStream $$2 = $$1.get();){
            T t2 = azc.a($$0, $$2, this.d);
            return t2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static <T> @Nullable T a(azy<T> $$0, InputStream $$1, azk $$22) {
        void $$7;
        try (BufferedReader $$3 = new BufferedReader(new InputStreamReader($$1, StandardCharsets.UTF_8));){
            JsonObject $$4 = bfv.a($$3);
        }
        catch (Exception $$6) {
            c.error("Couldn't load {} {} metadata: {}", new Object[]{$$22.a(), $$0.a(), $$6.getMessage()});
            return null;
        }
        if (!$$7.has($$0.a())) {
            return null;
        }
        return $$0.b().parse((DynamicOps)JsonOps.INSTANCE, (Object)$$7.get($$0.a())).ifError($$2 -> c.error("Couldn't load {} {} metadata: {}", new Object[]{$$22.a(), $$0.a(), $$2.message()})).result().orElse(null);
    }

    @Override
    public azk a() {
        return this.d;
    }
}

