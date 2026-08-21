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

public record gbj(@SerializedName(value="name") String a, @SerializedName(value="value") String b) implements gbp
{
    public static gbj a(boolean $$0) {
        return new gbj("hardcore", Boolean.toString($$0));
    }

    public static boolean a(List<gbj> $$0) {
        for (gbj $$1 : $$0) {
            if (!$$1.a().equals("hardcore")) continue;
            return Boolean.parseBoolean($$1.b());
        }
        return false;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbj.class, "name;value", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbj.class, "name;value", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbj.class, "name;value", "a", "b"}, this, $$0);
    }
}

