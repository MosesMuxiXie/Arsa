/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public record gaq(List<gap> a) {
    private static final Logger b = LogUtils.getLogger();

    public static gaq a(String $$0) {
        ArrayList<gap> $$1 = new ArrayList<gap>();
        try {
            JsonElement $$2 = bge.a($$0).getAsJsonObject().get("backups");
            if ($$2.isJsonArray()) {
                for (JsonElement $$3 : $$2.getAsJsonArray()) {
                    gap $$4 = gap.a($$3);
                    if ($$4 == null) continue;
                    $$1.add($$4);
                }
            }
        }
        catch (Exception $$5) {
            b.error("Could not parse BackupList", (Throwable)$$5);
        }
        return new gaq($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gaq.class, "backups", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gaq.class, "backups", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gaq.class, "backups", "a"}, this, $$0);
    }
}

