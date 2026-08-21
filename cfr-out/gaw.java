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
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public record gaw(List<gav> a) {
    private static final Logger b = LogUtils.getLogger();

    public static gaw a(String $$0) {
        ArrayList<gav> $$1 = new ArrayList<gav>();
        try {
            JsonObject $$2 = bge.a($$0).getAsJsonObject();
            if ($$2.get("invites").isJsonArray()) {
                for (JsonElement $$3 : $$2.get("invites").getAsJsonArray()) {
                    gav $$4 = gav.a($$3.getAsJsonObject());
                    if ($$4 == null) continue;
                    $$1.add($$4);
                }
            }
        }
        catch (Exception $$5) {
            b.error("Could not parse PendingInvitesList", (Throwable)$$5);
        }
        return new gaw($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gaw.class, "pendingInvites", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gaw.class, "pendingInvites", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gaw.class, "pendingInvites", "a"}, this, $$0);
    }
}

