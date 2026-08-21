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
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record gbd(@Nullable String a) {
    private static final Logger b = LogUtils.getLogger();

    public static gbd a(String $$0) {
        String $$1 = null;
        try {
            JsonObject $$2 = bge.a($$0).getAsJsonObject();
            $$1 = gdw.a("newsLink", $$2, null);
        }
        catch (Exception $$3) {
            b.error("Could not parse RealmsNews", (Throwable)$$3);
        }
        return new gbd($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbd.class, "newsLink", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbd.class, "newsLink", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbd.class, "newsLink", "a"}, this, $$0);
    }
}

