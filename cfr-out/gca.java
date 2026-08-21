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

public record gca(List<gbz> a, int b, int c, int d) {
    private final List<gbz> a;
    private final int b;
    private final int c;
    private final int d;
    private static final Logger e = LogUtils.getLogger();

    public gca(int $$0) {
        this(List.of(), 0, $$0, -1);
    }

    public boolean a() {
        return this.b * this.c >= this.d && this.b > 0 && this.d > 0 && this.c > 0;
    }

    public static gca a(String $$0) {
        ArrayList<gbz> $$1 = new ArrayList<gbz>();
        int $$2 = 0;
        int $$3 = 0;
        int $$4 = 0;
        try {
            JsonObject $$5 = bge.a($$0).getAsJsonObject();
            if ($$5.get("templates").isJsonArray()) {
                for (JsonElement $$6 : $$5.get("templates").getAsJsonArray()) {
                    gbz $$7 = gbz.a($$6.getAsJsonObject());
                    if ($$7 == null) continue;
                    $$1.add($$7);
                }
            }
            $$2 = gdw.a("page", $$5, 0);
            $$3 = gdw.a("size", $$5, 0);
            $$4 = gdw.a("total", $$5, 0);
        }
        catch (Exception $$8) {
            e.error("Could not parse WorldTemplatePaginatedList", (Throwable)$$8);
        }
        return new gca($$1, $$2, $$3, $$4);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gca.class, "templates;page;size;total", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gca.class, "templates;page;size;total", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gca.class, "templates;page;size;total", "a", "b", "c", "d"}, this, $$0);
    }

    public List<gbz> b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }
}

