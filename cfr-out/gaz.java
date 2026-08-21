/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class gaz
extends Record
implements gbp {
    @SerializedName(value="regionDataList")
    private final List<gbq> a;

    public gaz(List<gbq> $$0) {
        this.a = $$0;
    }

    public static gaz a() {
        return new gaz(List.of());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gaz.class, "regionData", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gaz.class, "regionData", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gaz.class, "regionData", "a"}, this, $$0);
    }

    @SerializedName(value="regionDataList")
    public List<gbq> b() {
        return this.a;
    }
}

