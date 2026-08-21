/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Type;
import java.lang.runtime.ObjectMethods;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public record hqb(Vector3fc a, Vector3fc b, Map<iz, hqc> c, @Nullable hqd d, boolean e, int f) {
    private static final boolean g = false;
    private static final float h = -16.0f;
    private static final float i = 32.0f;

    public hqb(Vector3fc $$0, Vector3fc $$1, Map<iz, hqc> $$2) {
        this($$0, $$1, $$2, null, true, 0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqb.class, "from;to;faces;rotation;shade;lightEmission", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqb.class, "from;to;faces;rotation;shade;lightEmission", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqb.class, "from;to;faces;rotation;shade;lightEmission", "a", "b", "c", "d", "e", "f"}, this, $$0);
    }

    protected static class a
    implements JsonDeserializer<hqb> {
        private static final boolean a = true;
        private static final int b = 0;
        private static final String c = "shade";
        private static final String d = "light_emission";
        private static final String e = "rotation";
        private static final String f = "origin";
        private static final String g = "angle";
        private static final String h = "x";
        private static final String i = "y";
        private static final String j = "z";
        private static final String k = "axis";
        private static final String l = "rescale";
        private static final String m = "faces";
        private static final String n = "to";
        private static final String o = "from";

        protected a() {
        }

        public hqb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            Vector3f $$4 = hqb$a.a($$3, o);
            Vector3f $$5 = hqb$a.a($$3, n);
            hqd $$6 = this.a($$3);
            Map<iz, hqc> $$7 = this.a($$2, $$3);
            if ($$3.has(c) && !bfv.c($$3, c)) {
                throw new JsonParseException("Expected 'shade' to be a Boolean");
            }
            boolean $$8 = bfv.a($$3, c, true);
            int $$9 = 0;
            if ($$3.has(d)) {
                boolean $$10 = bfv.b($$3, d);
                if ($$10) {
                    $$9 = bfv.o($$3, d);
                }
                if (!$$10 || $$9 < 0 || $$9 > 15) {
                    throw new JsonParseException("Expected 'light_emission' to be an Integer between (inclusive) 0 and 15");
                }
            }
            return new hqb((Vector3fc)$$4, (Vector3fc)$$5, $$7, $$6, $$8, $$9);
        }

        /*
         * WARNING - void declaration
         */
        private @Nullable hqd a(JsonObject $$0) {
            if ($$0.has(e)) {
                void $$10;
                JsonObject $$1 = bfv.u($$0, e);
                Vector3f $$2 = hqb$a.b($$1, f);
                $$2.mul(0.0625f);
                if ($$1.has(k) || $$1.has(g)) {
                    iz.a $$3 = this.b($$1);
                    float $$4 = bfv.m($$1, g);
                    hqd.c $$5 = new hqd.c($$3, $$4);
                } else if ($$1.has(h) || $$1.has(i) || $$1.has(j)) {
                    float $$6 = bfv.a($$1, h, 0.0f);
                    float $$7 = bfv.a($$1, i, 0.0f);
                    float $$8 = bfv.a($$1, j, 0.0f);
                    hqd.a $$9 = new hqd.a($$6, $$7, $$8);
                } else {
                    throw new JsonParseException("Missing rotation value, expected either 'axis' and 'angle' or 'x', 'y' and 'z'");
                }
                boolean $$11 = bfv.a($$1, l, false);
                return new hqd((Vector3fc)$$2, (hqd.b)$$10, $$11);
            }
            return null;
        }

        private iz.a b(JsonObject $$0) {
            String $$1 = bfv.i($$0, k);
            iz.a $$2 = iz.a.a($$1.toLowerCase(Locale.ROOT));
            if ($$2 == null) {
                throw new JsonParseException("Invalid rotation axis: " + $$1);
            }
            return $$2;
        }

        private Map<iz, hqc> a(JsonDeserializationContext $$0, JsonObject $$1) {
            Map<iz, hqc> $$2 = this.b($$0, $$1);
            if ($$2.isEmpty()) {
                throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
            }
            return $$2;
        }

        private Map<iz, hqc> b(JsonDeserializationContext $$0, JsonObject $$1) {
            EnumMap $$2 = Maps.newEnumMap(iz.class);
            JsonObject $$3 = bfv.u($$1, m);
            for (Map.Entry $$4 : $$3.entrySet()) {
                iz $$5 = this.a((String)$$4.getKey());
                $$2.put($$5, (hqc)$$0.deserialize((JsonElement)$$4.getValue(), hqc.class));
            }
            return $$2;
        }

        private iz a(String $$0) {
            iz $$1 = iz.a($$0);
            if ($$1 == null) {
                throw new JsonParseException("Unknown facing: " + $$0);
            }
            return $$1;
        }

        private static Vector3f a(JsonObject $$0, String $$1) {
            Vector3f $$2 = hqb$a.b($$0, $$1);
            if ($$2.x() < -16.0f || $$2.y() < -16.0f || $$2.z() < -16.0f || $$2.x() > 32.0f || $$2.y() > 32.0f || $$2.z() > 32.0f) {
                throw new JsonParseException("'" + $$1 + "' specifier exceeds the allowed boundaries: " + String.valueOf($$2));
            }
            return $$2;
        }

        private static Vector3f b(JsonObject $$0, String $$1) {
            JsonArray $$2 = bfv.v($$0, $$1);
            if ($$2.size() != 3) {
                throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$2.size());
            }
            float[] $$3 = new float[3];
            for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
                $$3[$$4] = bfv.e($$2.get($$4), $$1 + "[" + $$4 + "]");
            }
            return new Vector3f($$3[0], $$3[1], $$3[2]);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

