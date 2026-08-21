/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class hlr {
    private final List<amo> a;

    private hlr(List<amo> $$0) {
        this.a = $$0;
    }

    public List<amo> a() {
        return this.a;
    }

    public static hlr a(JsonObject $$02) {
        JsonArray $$1 = bfv.a($$02, "textures", null);
        if ($$1 == null) {
            return new hlr(List.of());
        }
        List $$2 = (List)Streams.stream((Iterable)$$1).map($$0 -> bfv.a($$0, "texture")).map(amo::a).collect(ImmutableList.toImmutableList());
        return new hlr($$2);
    }
}

