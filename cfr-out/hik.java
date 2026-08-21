/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record hik(hin a, GameProfile b, irf c, jr.b d, dgz e, @Nullable String f, @Nullable hit g, @Nullable gsb h, Map<amo, byte[]> i, @Nullable gjf.j j, Map<String, String> k, anl l, Map<UUID, hiq> m, boolean n) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hik.class, "levelLoadTracker;localGameProfile;telemetryManager;receivedRegistries;enabledFeatures;serverBrand;serverData;postDisconnectScreen;serverCookies;chatState;customReportDetails;serverLinks;seenPlayers;seenInsecureChatWarning", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hik.class, "levelLoadTracker;localGameProfile;telemetryManager;receivedRegistries;enabledFeatures;serverBrand;serverData;postDisconnectScreen;serverCookies;chatState;customReportDetails;serverLinks;seenPlayers;seenInsecureChatWarning", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hik.class, "levelLoadTracker;localGameProfile;telemetryManager;receivedRegistries;enabledFeatures;serverBrand;serverData;postDisconnectScreen;serverCookies;chatState;customReportDetails;serverLinks;seenPlayers;seenInsecureChatWarning", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this, $$0);
    }
}

