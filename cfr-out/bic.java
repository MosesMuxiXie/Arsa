/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class bic {
    private static final String a = bic.a("");

    public static <T> Dynamic<T> a(DynamicOps<T> $$0, String $$1) {
        String $$2 = bic.a($$1);
        return new Dynamic($$0, $$0.createString($$2));
    }

    public static <T> Dynamic<T> a(DynamicOps<T> $$0) {
        return new Dynamic($$0, $$0.createString(a));
    }

    public static String a(String $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.addProperty("text", $$0);
        return bfv.e((JsonElement)$$1);
    }

    public static String b(String $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.addProperty("translate", $$0);
        return bfv.e((JsonElement)$$1);
    }

    public static <T> Dynamic<T> b(DynamicOps<T> $$0, String $$1) {
        String $$2 = bic.b($$1);
        return new Dynamic($$0, $$0.createString($$2));
    }

    public static String c(String $$0) {
        if ($$0.isEmpty() || $$0.equals("null")) {
            return a;
        }
        char $$1 = $$0.charAt(0);
        char $$2 = $$0.charAt($$0.length() - 1);
        if ($$1 == '\"' && $$2 == '\"' || $$1 == '{' && $$2 == '}' || $$1 == '[' && $$2 == ']') {
            try {
                JsonElement $$3 = bge.a($$0);
                if ($$3.isJsonPrimitive()) {
                    return bic.a($$3.getAsString());
                }
                return bfv.e($$3);
            }
            catch (JsonParseException jsonParseException) {
                // empty catch block
            }
        }
        return bic.a($$0);
    }

    public static boolean a(Dynamic<?> $$02) {
        return $$02.asString().result().filter($$0 -> {
            try {
                bhf.a($$0);
                return true;
            }
            catch (JsonParseException $$1) {
                return false;
            }
        }).isPresent();
    }

    public static Optional<String> d(String $$0) {
        try {
            JsonObject $$2;
            JsonElement $$3;
            JsonElement $$1 = bge.a($$0);
            if ($$1.isJsonObject() && ($$3 = ($$2 = $$1.getAsJsonObject()).get("translate")) != null && $$3.isJsonPrimitive()) {
                return Optional.of($$3.getAsString());
            }
        }
        catch (JsonParseException jsonParseException) {
            // empty catch block
        }
        return Optional.empty();
    }
}

