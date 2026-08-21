/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public final class gbs
extends Enum<gbs> {
    public static final /* enum */ gbs a = new gbs(0, "realms.configuration.region_preference.automatic_player");
    public static final /* enum */ gbs b = new gbs(1, "realms.configuration.region_preference.automatic_owner");
    public static final /* enum */ gbs c = new gbs(2, "");
    public static final gbs d;
    public final int e;
    public final String f;
    private static final /* synthetic */ gbs[] g;

    public static gbs[] values() {
        return (gbs[])g.clone();
    }

    public static gbs valueOf(String $$0) {
        return Enum.valueOf(gbs.class, $$0);
    }

    private gbs(int $$0, String $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    private static /* synthetic */ gbs[] a() {
        return new gbs[]{a, b, c};
    }

    static {
        g = gbs.a();
        d = a;
    }

    public static class a
    extends TypeAdapter<gbs> {
        private static final Logger a = LogUtils.getLogger();

        public void a(JsonWriter $$0, gbs $$1) throws IOException {
            $$0.value((long)$$1.e);
        }

        public gbs a(JsonReader $$0) throws IOException {
            int $$1 = $$0.nextInt();
            for (gbs $$2 : gbs.values()) {
                if ($$2.e != $$1) continue;
                return $$2;
            }
            a.warn("Unsupported RegionSelectionPreference {}", (Object)$$1);
            return d;
        }

        public /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            return this.a(jsonReader);
        }

        public /* synthetic */ void write(JsonWriter jsonWriter, Object object) throws IOException {
            this.a(jsonWriter, (gbs)((Object)object));
        }
    }
}

