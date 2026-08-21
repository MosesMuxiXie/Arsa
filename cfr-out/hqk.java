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
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
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
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class hqk
extends Record {
    private final Vector3fc b;
    private final Vector3fc c;
    private final Vector3fc d;
    public static final hqk a = new hqk((Vector3fc)new Vector3f(), (Vector3fc)new Vector3f(), (Vector3fc)new Vector3f(1.0f, 1.0f, 1.0f));

    public hqk(Vector3fc $$0, Vector3fc $$1, Vector3fc $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public void a(boolean $$0, fzm.a $$1) {
        float $$7;
        float $$6;
        float $$5;
        if (this == a) {
            $$1.a(-0.5f, -0.5f, -0.5f);
            return;
        }
        if ($$0) {
            float $$2 = -this.c.x();
            float $$3 = -this.b.y();
            float $$4 = -this.b.z();
        } else {
            $$5 = this.c.x();
            $$6 = this.b.y();
            $$7 = this.b.z();
        }
        $$1.a($$5, this.c.y(), this.c.z());
        $$1.a((Quaternionfc)new Quaternionf().rotationXYZ(this.b.x() * ((float)Math.PI / 180), $$6 * ((float)Math.PI / 180), $$7 * ((float)Math.PI / 180)));
        $$1.b(this.d.x(), this.d.y(), this.d.z());
        $$1.a(-0.5f, -0.5f, -0.5f);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqk.class, "rotation;translation;scale", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqk.class, "rotation;translation;scale", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqk.class, "rotation;translation;scale", "b", "c", "d"}, this, $$0);
    }

    public Vector3fc a() {
        return this.b;
    }

    public Vector3fc b() {
        return this.c;
    }

    public Vector3fc c() {
        return this.d;
    }

    protected static class a
    implements JsonDeserializer<hqk> {
        private static final Vector3f c = new Vector3f(0.0f, 0.0f, 0.0f);
        private static final Vector3f d = new Vector3f(0.0f, 0.0f, 0.0f);
        private static final Vector3f e = new Vector3f(1.0f, 1.0f, 1.0f);
        public static final float a = 5.0f;
        public static final float b = 4.0f;

        protected a() {
        }

        public hqk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            Vector3f $$4 = this.a($$3, "rotation", c);
            Vector3f $$5 = this.a($$3, "translation", d);
            $$5.mul(0.0625f);
            $$5.set(bgj.a($$5.x, -5.0f, 5.0f), bgj.a($$5.y, -5.0f, 5.0f), bgj.a($$5.z, -5.0f, 5.0f));
            Vector3f $$6 = this.a($$3, "scale", e);
            $$6.set(bgj.a($$6.x, -4.0f, 4.0f), bgj.a($$6.y, -4.0f, 4.0f), bgj.a($$6.z, -4.0f, 4.0f));
            return new hqk((Vector3fc)$$4, (Vector3fc)$$5, (Vector3fc)$$6);
        }

        private Vector3f a(JsonObject $$0, String $$1, Vector3f $$2) {
            if (!$$0.has($$1)) {
                return $$2;
            }
            JsonArray $$3 = bfv.v($$0, $$1);
            if ($$3.size() != 3) {
                throw new JsonParseException("Expected 3 " + $$1 + " values, found: " + $$3.size());
            }
            float[] $$4 = new float[3];
            for (int $$5 = 0; $$5 < $$4.length; ++$$5) {
                $$4[$$5] = bfv.e($$3.get($$5), $$1 + "[" + $$5 + "]");
            }
            return new Vector3f($$4[0], $$4[1], $$4[2]);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

