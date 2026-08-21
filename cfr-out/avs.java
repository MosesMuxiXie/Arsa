/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class avs
extends RuntimeException {
    private final JsonElement a;
    private final JsonObject b;

    public avs(JsonElement $$0, JsonObject $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    private JsonObject a() {
        return this.b;
    }

    private JsonElement b() {
        return this.a;
    }
}

