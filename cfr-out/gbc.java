/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record gbc(@SerializedName(value="address") @Nullable String a, @SerializedName(value="resourcePackUrl") @Nullable String b, @SerializedName(value="resourcePackHash") @Nullable String c, @SerializedName(value="sessionRegionData") @Nullable a d) implements gbp
{
    private static final Logger e = LogUtils.getLogger();
    private static final gbc f = new gbc(null, null, null, null);

    public static gbc a(gas $$0, String $$1) {
        try {
            gbc $$2 = $$0.a($$1, gbc.class);
            if ($$2 == null) {
                e.error("Could not parse RealmsServerAddress: {}", (Object)$$1);
                return f;
            }
            return $$2;
        }
        catch (Exception $$3) {
            e.error("Could not parse RealmsServerAddress", (Throwable)$$3);
            return f;
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbc.class, "address;resourcePackUrl;resourcePackHash;regionData", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbc.class, "address;resourcePackUrl;resourcePackHash;regionData", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbc.class, "address;resourcePackUrl;resourcePackHash;regionData", "a", "b", "c", "d"}, this, $$0);
    }

    public record a(@SerializedName(value="regionName") @JsonAdapter(value=gbf.a.class) @Nullable gbf a, @SerializedName(value="serviceQuality") @JsonAdapter(value=gbu.a.class) @Nullable gbu b) implements gbp
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "region;serviceQuality", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "region;serviceQuality", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "region;serviceQuality", "a", "b"}, this, $$0);
        }
    }
}

