/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record gbw(boolean a, @Nullable String b, URI c) {
    private static final Logger d = LogUtils.getLogger();
    private static final String e = "http://";
    private static final int f = 8080;
    private static final Pattern g = Pattern.compile("^[a-zA-Z][-a-zA-Z0-9+.]+:");

    public static @Nullable gbw a(String $$0) {
        try {
            int $$3;
            URI $$4;
            JsonObject $$1 = bge.a($$0).getAsJsonObject();
            String $$2 = gdw.a("uploadEndpoint", $$1, null);
            if ($$2 != null && ($$4 = gbw.a($$2, $$3 = gdw.a("port", $$1, -1))) != null) {
                boolean $$5 = gdw.a("worldClosed", $$1, false);
                String $$6 = gdw.a("token", $$1, null);
                return new gbw($$5, $$6, $$4);
            }
        }
        catch (Exception $$7) {
            d.error("Could not parse UploadInfo", (Throwable)$$7);
        }
        return null;
    }

    @VisibleForTesting
    public static @Nullable URI a(String $$0, int $$1) {
        Matcher $$2 = g.matcher($$0);
        String $$3 = gbw.a($$0, $$2);
        try {
            URI $$4 = new URI($$3);
            int $$5 = gbw.a($$1, $$4.getPort());
            if ($$5 != $$4.getPort()) {
                return new URI($$4.getScheme(), $$4.getUserInfo(), $$4.getHost(), $$5, $$4.getPath(), $$4.getQuery(), $$4.getFragment());
            }
            return $$4;
        }
        catch (URISyntaxException $$6) {
            d.warn("Failed to parse URI {}", (Object)$$3, (Object)$$6);
            return null;
        }
    }

    private static int a(int $$0, int $$1) {
        if ($$0 != -1) {
            return $$0;
        }
        if ($$1 != -1) {
            return $$1;
        }
        return 8080;
    }

    private static String a(String $$0, Matcher $$1) {
        if ($$1.find()) {
            return $$0;
        }
        return e + $$0;
    }

    public static String b(@Nullable String $$0) {
        JsonObject $$1 = new JsonObject();
        if ($$0 != null) {
            $$1.addProperty("token", $$0);
        }
        return $$1.toString();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbw.class, "worldClosed;token;uploadEndpoint", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbw.class, "worldClosed;token;uploadEndpoint", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbw.class, "worldClosed;token;uploadEndpoint", "a", "b", "c"}, this, $$0);
    }
}

