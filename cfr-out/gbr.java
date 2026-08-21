/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;

public record gbr(@SerializedName(value="regionName") String a, @SerializedName(value="ping") int b) implements gbp
{
    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%s --> %.2f ms", this.a, Float.valueOf(this.b));
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbr.class, "regionName;ping", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbr.class, "regionName;ping", "a", "b"}, this, $$0);
    }
}

