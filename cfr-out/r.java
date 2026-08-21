/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class r {
    private static final Logger b = LogUtils.getLogger();
    public static final aa a = r.a(UUID.randomUUID().toString().replaceAll("-", ""), "Development Version");

    public static aa a(String $$0, String $$1) {
        return r.a($$0, $$1, true);
    }

    public static aa a(String $$0, String $$1, boolean $$2) {
        return new aa.a($$0, $$1, new fna(4671, "main"), w.c(), azz.a(75, 0), azz.a(94, 1), new Date(), $$2);
    }

    private static aa a(JsonObject $$0) {
        JsonObject $$1 = bfv.u($$0, "pack_version");
        return new aa.a(bfv.i($$0, "id"), bfv.i($$0, "name"), new fna(bfv.o($$0, "world_version"), bfv.a($$0, "series_id", "main")), bfv.o($$0, "protocol_version"), azz.a(bfv.o($$1, "resource_major"), bfv.o($$1, "resource_minor")), azz.a(bfv.o($$1, "data_major"), bfv.o($$1, "data_minor")), Date.from(ZonedDateTime.parse(bfv.i($$0, "build_time")).toInstant()), bfv.k($$0, "stable"));
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static aa a() {
        try (InputStream $$0 = r.class.getResourceAsStream("/version.json");){
            aa aa2;
            if ($$0 == null) {
                b.warn("Missing version information!");
                aa aa3 = a;
                return aa3;
            }
            try (InputStreamReader $$1 = new InputStreamReader($$0, StandardCharsets.UTF_8);){
                aa2 = r.a(bfv.a($$1));
            }
            return aa2;
        }
        catch (JsonParseException | IOException $$2) {
            throw new IllegalStateException("Game version information is corrupt", $$2);
        }
    }
}

