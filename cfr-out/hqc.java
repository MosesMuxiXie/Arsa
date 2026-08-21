/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Type;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class hqc
extends Record {
    private final @Nullable iz b;
    private final int c;
    private final String d;
    private final @Nullable b e;
    private final g f;
    public static final int a = -1;

    public hqc(@Nullable iz $$0, int $$1, String $$2, @Nullable b $$3, g $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    public static float a(b $$0, g $$1, int $$2) {
        return $$0.a($$1.b($$2)) / 16.0f;
    }

    public static float b(b $$0, g $$1, int $$2) {
        return $$0.b($$1.b($$2)) / 16.0f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqc.class, "cullForDirection;tintIndex;texture;uvs;rotation", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqc.class, "cullForDirection;tintIndex;texture;uvs;rotation", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqc.class, "cullForDirection;tintIndex;texture;uvs;rotation", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public @Nullable iz a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public @Nullable b d() {
        return this.e;
    }

    public g e() {
        return this.f;
    }

    public record b(float a, float b, float c, float d) {
        public float a(int $$0) {
            return $$0 == 0 || $$0 == 1 ? this.a : this.c;
        }

        public float b(int $$0) {
            return $$0 == 0 || $$0 == 3 ? this.b : this.d;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "minU;minV;maxU;maxV", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "minU;minV;maxU;maxV", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "minU;minV;maxU;maxV", "a", "b", "c", "d"}, this, $$0);
        }
    }

    protected static class a
    implements JsonDeserializer<hqc> {
        private static final int a = -1;
        private static final int b = 0;

        protected a() {
        }

        public hqc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            iz $$4 = hqc$a.c($$3);
            int $$5 = hqc$a.a($$3);
            String $$6 = hqc$a.b($$3);
            b $$7 = hqc$a.e($$3);
            g $$8 = hqc$a.d($$3);
            return new hqc($$4, $$5, $$6, $$7, $$8);
        }

        private static int a(JsonObject $$0) {
            return bfv.a($$0, "tintindex", -1);
        }

        private static String b(JsonObject $$0) {
            return bfv.i($$0, "texture");
        }

        private static @Nullable iz c(JsonObject $$0) {
            String $$1 = bfv.a($$0, "cullface", "");
            return iz.a($$1);
        }

        private static g d(JsonObject $$0) {
            int $$1 = bfv.a($$0, "rotation", 0);
            return g.a($$1);
        }

        private static @Nullable b e(JsonObject $$0) {
            if (!$$0.has("uv")) {
                return null;
            }
            JsonArray $$1 = bfv.v($$0, "uv");
            if ($$1.size() != 4) {
                throw new JsonParseException("Expected 4 uv values, found: " + $$1.size());
            }
            float $$2 = bfv.e($$1.get(0), "minU");
            float $$3 = bfv.e($$1.get(1), "minV");
            float $$4 = bfv.e($$1.get(2), "maxU");
            float $$5 = bfv.e($$1.get(3), "maxV");
            return new b($$2, $$3, $$4, $$5);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

