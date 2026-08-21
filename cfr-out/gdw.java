/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.util.UndashedUuid
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.util.UndashedUuid;
import java.time.Instant;
import java.util.UUID;
import java.util.function.Function;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class gdw {
    public static <T> T a(String $$0, JsonObject $$1, Function<JsonObject, T> $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 == null || $$3.isJsonNull()) {
            throw new IllegalStateException("Missing required property: " + $$0);
        }
        if (!$$3.isJsonObject()) {
            throw new IllegalStateException("Required property " + $$0 + " was not a JsonObject as espected");
        }
        return $$2.apply($$3.getAsJsonObject());
    }

    public static <T> @Nullable T b(String $$0, JsonObject $$1, Function<JsonObject, T> $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 == null || $$3.isJsonNull()) {
            return null;
        }
        if (!$$3.isJsonObject()) {
            throw new IllegalStateException("Required property " + $$0 + " was not a JsonObject as espected");
        }
        return $$2.apply($$3.getAsJsonObject());
    }

    public static String a(String $$0, JsonObject $$1) {
        String $$2 = gdw.a($$0, $$1, null);
        if ($$2 == null) {
            throw new IllegalStateException("Missing required property: " + $$0);
        }
        return $$2;
    }

    @Contract(value="_,_,!null->!null;_,_,null->_")
    public static @Nullable String a(String $$0, JsonObject $$1, @Nullable String $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsString();
        }
        return $$2;
    }

    @Contract(value="_,_,!null->!null;_,_,null->_")
    public static @Nullable UUID a(String $$0, JsonObject $$1, @Nullable UUID $$2) {
        String $$3 = gdw.a($$0, $$1, null);
        if ($$3 == null) {
            return $$2;
        }
        return UndashedUuid.fromStringLenient((String)$$3);
    }

    public static int a(String $$0, JsonObject $$1, int $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsInt();
        }
        return $$2;
    }

    public static long a(String $$0, JsonObject $$1, long $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsLong();
        }
        return $$2;
    }

    public static boolean a(String $$0, JsonObject $$1, boolean $$2) {
        JsonElement $$3 = $$1.get($$0);
        if ($$3 != null) {
            return $$3.isJsonNull() ? $$2 : $$3.getAsBoolean();
        }
        return $$2;
    }

    public static Instant b(String $$0, JsonObject $$1) {
        JsonElement $$2 = $$1.get($$0);
        if ($$2 != null) {
            return Instant.ofEpochMilli(Long.parseLong($$2.getAsString()));
        }
        return Instant.EPOCH;
    }
}

