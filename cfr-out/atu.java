/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import org.jspecify.annotations.Nullable;

public final class atu
extends Enum<atu> {
    public static final /* enum */ atu a = new atu(-32700, "Parse error");
    public static final /* enum */ atu b = new atu(-32600, "Invalid Request");
    public static final /* enum */ atu c = new atu(-32601, "Method not found");
    public static final /* enum */ atu d = new atu(-32602, "Invalid params");
    public static final /* enum */ atu e = new atu(-32603, "Internal error");
    private final int f;
    private final String g;
    private static final /* synthetic */ atu[] h;

    public static atu[] values() {
        return (atu[])h.clone();
    }

    public static atu valueOf(String $$0) {
        return Enum.valueOf(atu.class, $$0);
    }

    private atu(int $$0, String $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    public JsonObject a(@Nullable String $$0) {
        return atv.a((JsonElement)JsonNull.INSTANCE, this.g, this.f, $$0);
    }

    public JsonObject a(JsonElement $$0) {
        return atv.a($$0, this.g, this.f, null);
    }

    public JsonObject a(JsonElement $$0, String $$1) {
        return atv.a($$0, this.g, this.f, $$1);
    }

    private static /* synthetic */ atu[] a() {
        return new atu[]{a, b, c, d, e};
    }

    static {
        h = atu.a();
    }
}

