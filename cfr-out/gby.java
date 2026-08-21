/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.slf4j.Logger;

public record gby(String a, String b, String c) {
    private static final Logger d = LogUtils.getLogger();

    public static gby a(String $$0) {
        JsonObject $$1 = bge.a($$0).getAsJsonObject();
        try {
            return new gby(gdw.a("downloadLink", $$1, ""), gdw.a("resourcePackUrl", $$1, ""), gdw.a("resourcePackHash", $$1, ""));
        }
        catch (Exception $$2) {
            d.error("Could not parse WorldDownload", (Throwable)$$2);
            return new gby("", "", "");
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gby.class, "downloadLink;resourcePackUrl;resourcePackHash", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gby.class, "downloadLink;resourcePackUrl;resourcePackHash", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gby.class, "downloadLink;resourcePackUrl;resourcePackHash", "a", "b", "c"}, this, $$0);
    }
}

