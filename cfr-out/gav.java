/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record gav(String a, String b, String c, UUID d, Instant e) {
    private static final Logger f = LogUtils.getLogger();

    public static @Nullable gav a(JsonObject $$0) {
        try {
            return new gav(gdw.a("invitationId", $$0, ""), gdw.a("worldName", $$0, ""), gdw.a("worldOwnerName", $$0, ""), gdw.a("worldOwnerUuid", $$0, bhs.e), gdw.b("date", $$0));
        }
        catch (Exception $$1) {
            f.error("Could not parse PendingInvite", (Throwable)$$1);
            return null;
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gav.class, "invitationId;realmName;realmOwnerName;realmOwnerUuid;date", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gav.class, "invitationId;realmName;realmOwnerName;realmOwnerUuid;date", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gav.class, "invitationId;realmName;realmOwnerName;realmOwnerUuid;date", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

