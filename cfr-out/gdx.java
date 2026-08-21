/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gdx {
    private static final String a = "realms_persistence.json";
    private static final gas b = new gas();
    private static final Logger c = LogUtils.getLogger();

    public a a() {
        return gdx.b();
    }

    public void a(a $$0) {
        gdx.b($$0);
    }

    public static a b() {
        Path $$0 = gdx.c();
        try {
            String $$1 = Files.readString($$0, StandardCharsets.UTF_8);
            a $$2 = b.a($$1, a.class);
            if ($$2 != null) {
                return $$2;
            }
        }
        catch (NoSuchFileException $$1) {
        }
        catch (Exception $$3) {
            c.warn("Failed to read Realms storage {}", (Object)$$0, (Object)$$3);
        }
        return new a();
    }

    public static void b(a $$0) {
        Path $$1 = gdx.c();
        try {
            Files.writeString($$1, (CharSequence)b.a($$0), StandardCharsets.UTF_8, new OpenOption[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static Path c() {
        return gfj.V().p.toPath().resolve(a);
    }

    public static class a
    implements gbp {
        @SerializedName(value="newsLink")
        public @Nullable String a;
        @SerializedName(value="hasUnreadNews")
        public boolean b;
    }
}

