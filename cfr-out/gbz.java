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

public record gbz(String a, String b, String c, String d, String e, @Nullable String f, String g, String h, a i) {
    private static final Logger j = LogUtils.getLogger();

    public static @Nullable gbz a(JsonObject $$0) {
        try {
            String $$1 = gdw.a("type", $$0, null);
            return new gbz(gdw.a("id", $$0, ""), gdw.a("name", $$0, ""), gdw.a("version", $$0, ""), gdw.a("author", $$0, ""), gdw.a("link", $$0, ""), gdw.a("image", $$0, null), gdw.a("trailer", $$0, ""), gdw.a("recommendedPlayers", $$0, ""), $$1 == null ? gbz$a.a : gbz$a.valueOf($$1));
        }
        catch (Exception $$2) {
            j.error("Could not parse WorldTemplate", (Throwable)$$2);
            return null;
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbz.class, "id;name;version;author;link;image;trailer;recommendedPlayers;type", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbz.class, "id;name;version;author;link;image;trailer;recommendedPlayers;type", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbz.class, "id;name;version;author;link;image;trailer;recommendedPlayers;type", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = gbz$a.a();
        }
    }
}

