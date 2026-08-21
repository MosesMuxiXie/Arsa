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
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record gbv(Instant a, int b, a c) {
    private static final Logger d = LogUtils.getLogger();

    public static gbv a(String $$0) {
        try {
            JsonObject $$1 = bge.a($$0).getAsJsonObject();
            return new gbv(gdw.b("startDate", $$1), gdw.a("daysLeft", $$1, 0), gbv.b(gdw.a("subscriptionType", $$1, null)));
        }
        catch (Exception $$2) {
            d.error("Could not parse Subscription", (Throwable)$$2);
            return new gbv(Instant.EPOCH, 0, gbv$a.a);
        }
    }

    private static a b(@Nullable String $$0) {
        try {
            if ($$0 != null) {
                return gbv$a.valueOf($$0);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return gbv$a.a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbv.class, "startDate;daysLeft;type", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbv.class, "startDate;daysLeft;type", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbv.class, "startDate;daysLeft;type", "a", "b", "c"}, this, $$0);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = gbv$a.a();
        }
    }
}

