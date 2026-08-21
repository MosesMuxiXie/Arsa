/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public record gbo(@SerializedName(value="seed") String a, @SerializedName(value="worldTemplateId") long b, @SerializedName(value="levelType") int c, @SerializedName(value="generateStructures") boolean d, @SerializedName(value="experiments") Set<String> e) implements gbp
{
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbo.class, "seed;worldTemplateId;levelType;generateStructures;experiments", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbo.class, "seed;worldTemplateId;levelType;generateStructures;experiments", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbo.class, "seed;worldTemplateId;levelType;generateStructures;experiments", "a", "b", "c", "d", "e"}, this, $$0);
    }
}

