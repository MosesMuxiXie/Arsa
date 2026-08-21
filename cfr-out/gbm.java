/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class gbm {
    private static final String a = "translationKey";
    private static final String b = "args";
    private final String c;
    private final String @Nullable [] d;

    private gbm(String $$0, String @Nullable [] $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public yh a(yh $$0) {
        return Objects.requireNonNullElse(this.a(), $$0);
    }

    public @Nullable yh a() {
        if (!imu.a(this.c)) {
            return null;
        }
        if (this.d == null) {
            return yh.c(this.c);
        }
        return yh.a(this.c, this.d);
    }

    public static gbm a(JsonObject $$0) {
        String[] $$5;
        String $$1 = gdw.a(a, $$0);
        JsonElement $$2 = $$0.get(b);
        if ($$2 == null || $$2.isJsonNull()) {
            Object $$3 = null;
        } else {
            JsonArray $$4 = $$2.getAsJsonArray();
            $$5 = new String[$$4.size()];
            for (int $$6 = 0; $$6 < $$4.size(); ++$$6) {
                $$5[$$6] = $$4.get($$6).getAsString();
            }
        }
        return new gbm($$1, $$5);
    }

    public String toString() {
        return this.c;
    }
}

