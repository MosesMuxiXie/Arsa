/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;

public record gbi(Map<Long, List<doy>> a) {
    private static final Logger b = LogUtils.getLogger();

    public static gbi a(String $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        try {
            JsonObject $$2 = bfv.a($$0);
            if (bfv.d($$2, "lists")) {
                JsonArray $$3 = $$2.getAsJsonArray("lists");
                for (JsonElement $$4 : $$3) {
                    ArrayList $$10;
                    JsonObject $$5 = $$4.getAsJsonObject();
                    String $$6 = gdw.a("playerList", $$5, null);
                    if ($$6 != null) {
                        JsonElement $$7 = bge.a($$6);
                        if ($$7.isJsonArray()) {
                            List<doy> $$8 = gbi.a($$7.getAsJsonArray());
                        } else {
                            ArrayList $$9 = Lists.newArrayList();
                        }
                    } else {
                        $$10 = Lists.newArrayList();
                    }
                    $$1.put((Object)gdw.a("serverId", $$5, -1L), (Object)$$10);
                }
            }
        }
        catch (Exception $$11) {
            b.error("Could not parse RealmsServerPlayerLists", (Throwable)$$11);
        }
        return new gbi((Map<Long, List<doy>>)$$1.build());
    }

    private static List<doy> a(JsonArray $$0) {
        ArrayList<doy> $$1 = new ArrayList<doy>($$0.size());
        for (JsonElement $$2 : $$0) {
            UUID $$3;
            if (!$$2.isJsonObject() || ($$3 = gdw.a("playerId", $$2.getAsJsonObject(), null)) == null || gfj.V().b($$3)) continue;
            $$1.add(doy.a($$3));
        }
        return $$1;
    }

    public List<doy> a(long $$0) {
        List<doy> $$1 = this.a.get($$0);
        if ($$1 != null) {
            return $$1;
        }
        return List.of();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbi.class, "servers", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbi.class, "servers", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbi.class, "servers", "a"}, this, $$0);
    }
}

