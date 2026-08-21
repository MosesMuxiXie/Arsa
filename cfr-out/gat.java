/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;

public record gat(Set<String> a) {
    private static final Logger b = LogUtils.getLogger();

    public static gat a(String $$0) {
        HashSet<String> $$1 = new HashSet<String>();
        try {
            JsonObject $$2 = bge.a($$0).getAsJsonObject();
            JsonElement $$3 = $$2.get("ops");
            if ($$3.isJsonArray()) {
                for (JsonElement $$4 : $$3.getAsJsonArray()) {
                    $$1.add($$4.getAsString());
                }
            }
        }
        catch (Exception $$5) {
            b.error("Could not parse Ops", (Throwable)$$5);
        }
        return new gat($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gat.class, "ops", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gat.class, "ops", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gat.class, "ops", "a"}, this, $$0);
    }
}

