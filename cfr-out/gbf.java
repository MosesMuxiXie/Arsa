/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class gbf
extends Enum<gbf> {
    public static final /* enum */ gbf a = new gbf("AustraliaEast", "realms.configuration.region.australia_east");
    public static final /* enum */ gbf b = new gbf("AustraliaSoutheast", "realms.configuration.region.australia_southeast");
    public static final /* enum */ gbf c = new gbf("BrazilSouth", "realms.configuration.region.brazil_south");
    public static final /* enum */ gbf d = new gbf("CentralIndia", "realms.configuration.region.central_india");
    public static final /* enum */ gbf e = new gbf("CentralUs", "realms.configuration.region.central_us");
    public static final /* enum */ gbf f = new gbf("EastAsia", "realms.configuration.region.east_asia");
    public static final /* enum */ gbf g = new gbf("EastUs", "realms.configuration.region.east_us");
    public static final /* enum */ gbf h = new gbf("EastUs2", "realms.configuration.region.east_us_2");
    public static final /* enum */ gbf i = new gbf("FranceCentral", "realms.configuration.region.france_central");
    public static final /* enum */ gbf j = new gbf("JapanEast", "realms.configuration.region.japan_east");
    public static final /* enum */ gbf k = new gbf("JapanWest", "realms.configuration.region.japan_west");
    public static final /* enum */ gbf l = new gbf("KoreaCentral", "realms.configuration.region.korea_central");
    public static final /* enum */ gbf m = new gbf("NorthCentralUs", "realms.configuration.region.north_central_us");
    public static final /* enum */ gbf n = new gbf("NorthEurope", "realms.configuration.region.north_europe");
    public static final /* enum */ gbf o = new gbf("SouthCentralUs", "realms.configuration.region.south_central_us");
    public static final /* enum */ gbf p = new gbf("SoutheastAsia", "realms.configuration.region.southeast_asia");
    public static final /* enum */ gbf q = new gbf("SwedenCentral", "realms.configuration.region.sweden_central");
    public static final /* enum */ gbf r = new gbf("UAENorth", "realms.configuration.region.uae_north");
    public static final /* enum */ gbf s = new gbf("UKSouth", "realms.configuration.region.uk_south");
    public static final /* enum */ gbf t = new gbf("WestCentralUs", "realms.configuration.region.west_central_us");
    public static final /* enum */ gbf u = new gbf("WestEurope", "realms.configuration.region.west_europe");
    public static final /* enum */ gbf v = new gbf("WestUs", "realms.configuration.region.west_us");
    public static final /* enum */ gbf w = new gbf("WestUs2", "realms.configuration.region.west_us_2");
    public static final /* enum */ gbf x = new gbf("invalid", "");
    public final String y;
    public final String z;
    private static final /* synthetic */ gbf[] A;

    public static gbf[] values() {
        return (gbf[])A.clone();
    }

    public static gbf valueOf(String $$0) {
        return Enum.valueOf(gbf.class, $$0);
    }

    private gbf(String $$0, String $$1) {
        this.y = $$0;
        this.z = $$1;
    }

    public static @Nullable gbf a(String $$0) {
        for (gbf $$1 : gbf.values()) {
            if (!$$1.y.equals($$0)) continue;
            return $$1;
        }
        return null;
    }

    private static /* synthetic */ gbf[] a() {
        return new gbf[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x};
    }

    static {
        A = gbf.a();
    }

    public static class a
    extends TypeAdapter<gbf> {
        private static final Logger a = LogUtils.getLogger();

        public void a(JsonWriter $$0, gbf $$1) throws IOException {
            $$0.value($$1.y);
        }

        public gbf a(JsonReader $$0) throws IOException {
            String $$1 = $$0.nextString();
            gbf $$2 = gbf.a($$1);
            if ($$2 == null) {
                a.warn("Unsupported RealmsRegion {}", (Object)$$1);
                return x;
            }
            return $$2;
        }

        public /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            return this.a(jsonReader);
        }

        public /* synthetic */ void write(JsonWriter jsonWriter, Object object) throws IOException {
            this.a(jsonWriter, (gbf)((Object)object));
        }
    }
}

