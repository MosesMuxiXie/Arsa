/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record axu(GameProfile a, int b, awp c, boolean d) {
    public static axu a(GameProfile $$0, boolean $$1) {
        return new axu($$0, 0, awp.a(), $$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{axu.class, "gameProfile;latency;clientInformation;transferred", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{axu.class, "gameProfile;latency;clientInformation;transferred", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{axu.class, "gameProfile;latency;clientInformation;transferred", "a", "b", "c", "d"}, this, $$0);
    }
}

