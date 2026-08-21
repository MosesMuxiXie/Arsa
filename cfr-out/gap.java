/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gap
extends gbx {
    private static final Logger g = LogUtils.getLogger();
    public final String a;
    public final Instant b;
    public final long c;
    public boolean d;
    public final Map<String, String> e;
    public final Map<String, String> f = new HashMap<String, String>();

    private gap(String $$0, Instant $$1, long $$2, Map<String, String> $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.e = $$3;
    }

    public ZonedDateTime a() {
        return ZonedDateTime.ofInstant(this.b, ZoneId.systemDefault());
    }

    public static @Nullable gap a(JsonElement $$0) {
        JsonObject $$1 = $$0.getAsJsonObject();
        try {
            String $$2 = gdw.a("backupId", $$1, "");
            Instant $$3 = gdw.b("lastModifiedDate", $$1);
            long $$4 = gdw.a("size", $$1, 0L);
            HashMap<String, String> $$5 = new HashMap<String, String>();
            if ($$1.has("metadata")) {
                JsonObject $$6 = $$1.getAsJsonObject("metadata");
                Set $$7 = $$6.entrySet();
                for (Map.Entry $$8 : $$7) {
                    if (((JsonElement)$$8.getValue()).isJsonNull()) continue;
                    $$5.put((String)$$8.getKey(), ((JsonElement)$$8.getValue()).getAsString());
                }
            }
            return new gap($$2, $$3, $$4, $$5);
        }
        catch (Exception $$9) {
            g.error("Could not parse Backup", (Throwable)$$9);
            return null;
        }
    }
}

