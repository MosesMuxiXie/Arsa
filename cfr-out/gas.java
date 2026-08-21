/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.ExclusionStrategy
 *  com.google.gson.FieldAttributes
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.jspecify.annotations.Nullable;

public class gas {
    ExclusionStrategy a = new ExclusionStrategy(this){

        public boolean shouldSkipClass(Class<?> $$0) {
            return false;
        }

        public boolean shouldSkipField(FieldAttributes $$0) {
            return $$0.getAnnotation(gar.class) != null;
        }
    };
    private final Gson b = new GsonBuilder().addSerializationExclusionStrategy(this.a).addDeserializationExclusionStrategy(this.a).create();

    public String a(gbp $$0) {
        return this.b.toJson((Object)$$0);
    }

    public String a(JsonElement $$0) {
        return this.b.toJson($$0);
    }

    public <T extends gbp> @Nullable T a(String $$0, Class<T> $$1) {
        return (T)((gbp)this.b.fromJson($$0, $$1));
    }
}

