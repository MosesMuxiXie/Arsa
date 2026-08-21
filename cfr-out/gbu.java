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

public final class gbu
extends Enum<gbu> {
    public static final /* enum */ gbu a = new gbu(1, "icon/ping_5");
    public static final /* enum */ gbu b = new gbu(2, "icon/ping_4");
    public static final /* enum */ gbu c = new gbu(3, "icon/ping_3");
    public static final /* enum */ gbu d = new gbu(4, "icon/ping_2");
    public static final /* enum */ gbu e = new gbu(5, "icon/ping_unknown");
    final int f;
    private final amo g;
    private static final /* synthetic */ gbu[] h;

    public static gbu[] values() {
        return (gbu[])h.clone();
    }

    public static gbu valueOf(String $$0) {
        return Enum.valueOf(gbu.class, $$0);
    }

    private gbu(int $$0, String $$1) {
        this.f = $$0;
        this.g = amo.b($$1);
    }

    public static @Nullable gbu a(int $$0) {
        for (gbu $$1 : gbu.values()) {
            if ($$1.a() != $$0) continue;
            return $$1;
        }
        return null;
    }

    public int a() {
        return this.f;
    }

    public amo b() {
        return this.g;
    }

    private static /* synthetic */ gbu[] c() {
        return new gbu[]{a, b, c, d, e};
    }

    static {
        h = gbu.c();
    }

    public static class a
    extends TypeAdapter<gbu> {
        private static final Logger a = LogUtils.getLogger();

        public void a(JsonWriter $$0, gbu $$1) throws IOException {
            $$0.value((long)$$1.f);
        }

        public gbu a(JsonReader $$0) throws IOException {
            int $$1 = $$0.nextInt();
            gbu $$2 = gbu.a($$1);
            if ($$2 == null) {
                a.warn("Unsupported ServiceQuality {}", (Object)$$1);
                return e;
            }
            return $$2;
        }

        public /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            return this.a(jsonReader);
        }

        public /* synthetic */ void write(JsonWriter jsonWriter, Object object) throws IOException {
            this.a(jsonWriter, (gbu)((Object)object));
        }
    }
}

