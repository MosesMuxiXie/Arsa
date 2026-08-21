/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record gba(@SerializedName(value="options") gbl a, @SerializedName(value="settings") List<gbj> b, @SerializedName(value="regionSelectionPreference") @Nullable gbt c, @SerializedName(value="description") @Nullable gbb d) implements gbp
{
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gba.class, "options;settings;regionSelectionPreference;description", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gba.class, "options;settings;regionSelectionPreference;description", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gba.class, "options;settings;regionSelectionPreference;description", "a", "b", "c", "d"}, this, $$0);
    }
}

