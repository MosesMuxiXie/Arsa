/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ghv
implements ghx {
    private final amo a;

    public ghv(amo $$0) {
        this.a = $$0;
    }

    public JsonElement a() {
        JsonObject $$0 = new JsonObject();
        $$0.addProperty("parent", this.a.toString());
        return $$0;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.a();
    }
}

