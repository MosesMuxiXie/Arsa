/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Type;
import java.lang.runtime.ObjectMethods;

public final class hql
extends Record {
    private final hqk b;
    private final hqk c;
    private final hqk d;
    private final hqk e;
    private final hqk f;
    private final hqk g;
    private final hqk h;
    private final hqk i;
    private final hqk j;
    public static final hql a = new hql(hqk.a, hqk.a, hqk.a, hqk.a, hqk.a, hqk.a, hqk.a, hqk.a, hqk.a);

    public hql(hqk $$0, hqk $$1, hqk $$2, hqk $$3, hqk $$4, hqk $$5, hqk $$6, hqk $$7, hqk $$8) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
    }

    public hqk a(dlr $$0) {
        return switch ($$0) {
            case dlr.b -> this.b;
            case dlr.c -> this.c;
            case dlr.d -> this.d;
            case dlr.e -> this.e;
            case dlr.f -> this.f;
            case dlr.g -> this.g;
            case dlr.h -> this.h;
            case dlr.i -> this.i;
            case dlr.j -> this.j;
            default -> hqk.a;
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hql.class, "thirdPersonLeftHand;thirdPersonRightHand;firstPersonLeftHand;firstPersonRightHand;head;gui;ground;fixed;fixedFromBottom", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hql.class, "thirdPersonLeftHand;thirdPersonRightHand;firstPersonLeftHand;firstPersonRightHand;head;gui;ground;fixed;fixedFromBottom", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hql.class, "thirdPersonLeftHand;thirdPersonRightHand;firstPersonLeftHand;firstPersonRightHand;head;gui;ground;fixed;fixedFromBottom", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public hqk a() {
        return this.b;
    }

    public hqk b() {
        return this.c;
    }

    public hqk c() {
        return this.d;
    }

    public hqk d() {
        return this.e;
    }

    public hqk e() {
        return this.f;
    }

    public hqk f() {
        return this.g;
    }

    public hqk g() {
        return this.h;
    }

    public hqk h() {
        return this.i;
    }

    public hqk i() {
        return this.j;
    }

    protected static class a
    implements JsonDeserializer<hql> {
        protected a() {
        }

        public hql a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
            JsonObject $$3 = $$0.getAsJsonObject();
            hqk $$4 = this.a($$2, $$3, dlr.c);
            hqk $$5 = this.a($$2, $$3, dlr.b);
            if ($$5 == hqk.a) {
                $$5 = $$4;
            }
            hqk $$6 = this.a($$2, $$3, dlr.e);
            hqk $$7 = this.a($$2, $$3, dlr.d);
            if ($$7 == hqk.a) {
                $$7 = $$6;
            }
            hqk $$8 = this.a($$2, $$3, dlr.f);
            hqk $$9 = this.a($$2, $$3, dlr.g);
            hqk $$10 = this.a($$2, $$3, dlr.h);
            hqk $$11 = this.a($$2, $$3, dlr.i);
            hqk $$12 = this.a($$2, $$3, dlr.j);
            return new hql($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11, $$12);
        }

        private hqk a(JsonDeserializationContext $$0, JsonObject $$1, dlr $$2) {
            String $$3 = $$2.c();
            if ($$1.has($$3)) {
                return (hqk)$$0.deserialize($$1.get($$3), hqk.class);
            }
            return hqk.a;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}

