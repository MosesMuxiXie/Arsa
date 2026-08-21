/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.slf4j.Logger;

public record gbh(@SerializedName(value="servers") List<gbg> a) implements gbp
{
    private static final Logger b = LogUtils.getLogger();

    public static gbh a(gas $$0, String $$1) {
        try {
            gbh $$2 = $$0.a($$1, gbh.class);
            if ($$2 != null) {
                $$2.a.forEach(gbg::a);
                return $$2;
            }
            b.error("Could not parse McoServerList: {}", (Object)$$1);
        }
        catch (Exception $$3) {
            b.error("Could not parse McoServerList", (Throwable)$$3);
        }
        return new gbh(List.of());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbh.class, "servers", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbh.class, "servers", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbh.class, "servers", "a"}, this, $$0);
    }
}

