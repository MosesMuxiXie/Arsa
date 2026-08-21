/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gbq(@SerializedName(value="regionName") @JsonAdapter(value=gbf.a.class) gbf a, @SerializedName(value="serviceQuality") @JsonAdapter(value=gbu.a.class) gbu b) implements gbp
{
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbq.class, "region;serviceQuality", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbq.class, "region;serviceQuality", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbq.class, "region;serviceQuality", "a", "b"}, this, $$0);
    }
}

