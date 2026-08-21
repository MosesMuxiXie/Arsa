/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Type;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public final class hqe
extends Record
implements ioi {
    private final @Nullable ioh b;
    private final @Nullable ioi.a d;
    private final @Nullable Boolean e;
    private final @Nullable hql f;
    private final hqp.a g;
    private final @Nullable amo h;
    @VisibleForTesting
    static final Gson a = new GsonBuilder().registerTypeAdapter(hqe.class, (Object)new a()).registerTypeAdapter(hqb.class, (Object)new hqb.a()).registerTypeAdapter(hqc.class, (Object)new hqc.a()).registerTypeAdapter(hqk.class, (Object)new hqk.a()).registerTypeAdapter(hql.class, (Object)new hql.a()).create();

    public hqe(@Nullable ioh $$0, @Nullable ioi.a $$1, @Nullable Boolean $$2, @Nullable hql $$3, hqp.a $$4, @Nullable amo $$5) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
    }

    public static hqe a(Reader $$0) {
        return bfv.a(a, $$0, hqe.class);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqe.class, "geometry;guiLight;ambientOcclusion;transforms;textureSlots;parent", "b", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqe.class, "geometry;guiLight;ambientOcclusion;transforms;textureSlots;parent", "b", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqe.class, "geometry;guiLight;ambientOcclusion;transforms;textureSlots;parent", "b", "d", "e", "f", "g", "h"}, this, $$0);
    }

    @Override
    public @Nullable ioh a() {
        return this.b;
    }

    @Override
    public @Nullable ioi.a b() {
        return this.d;
    }

    @Override
    public @Nullable Boolean c() {
        return this.e;
    }

    @Override
    public @Nullable hql d() {
        return this.f;
    }

    @Override
    public hqp.a e() {
        return this.g;
    }

    @Override
    public @Nullable amo f() {
        return this.h;
    }

    public static class a
    implements JsonDeserializer<hqe> {
        public hqe a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            ioh $$4 = this.a($$2, $$3);
            String $$5 = this.c($$3);
            hqp.a $$6 = this.b($$3);
            Boolean $$7 = this.a($$3);
            hql $$8 = null;
            if ($$3.has("display")) {
                JsonObject $$9 = bfv.u($$3, "display");
                $$8 = (hql)$$2.deserialize((JsonElement)$$9, hql.class);
            }
            ioi.a $$10 = null;
            if ($$3.has("gui_light")) {
                $$10 = ioi.a.a(bfv.i($$3, "gui_light"));
            }
            amo $$11 = $$5.isEmpty() ? null : amo.a($$5);
            return new hqe($$4, $$10, $$7, $$8, $$6, $$11);
        }

        private hqp.a b(JsonObject $$0) {
            if ($$0.has("textures")) {
                JsonObject $$1 = bfv.u($$0, "textures");
                return hqp.a($$1);
            }
            return hqp.a.a;
        }

        private String c(JsonObject $$0) {
            return bfv.a($$0, "parent", "");
        }

        protected @Nullable Boolean a(JsonObject $$0) {
            if ($$0.has("ambientocclusion")) {
                return bfv.k($$0, "ambientocclusion");
            }
            return null;
        }

        protected @Nullable ioh a(JsonDeserializationContext $$0, JsonObject $$1) {
            if ($$1.has("elements")) {
                ArrayList<hqb> $$2 = new ArrayList<hqb>();
                for (JsonElement $$3 : bfv.v($$1, "elements")) {
                    $$2.add((hqb)$$0.deserialize($$3, hqb.class));
                }
                return new hqn($$2);
            }
            return null;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

