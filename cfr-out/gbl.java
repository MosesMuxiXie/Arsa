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
import org.jspecify.annotations.Nullable;

public record gbl(@SerializedName(value="slotId") int a, @SerializedName(value="spawnProtection") int b, @SerializedName(value="forceGameMode") boolean c, @SerializedName(value="difficulty") int d, @SerializedName(value="gameMode") int e, @SerializedName(value="slotName") String f, @SerializedName(value="version") String g, @SerializedName(value="compatibility") gbg.a h, @SerializedName(value="worldTemplateId") long i, @SerializedName(value="worldTemplateImage") @Nullable String j, @SerializedName(value="hardcore") boolean k) implements gbp
{
    public gbl(int $$0, gbn $$1, boolean $$2) {
        this($$0, $$1.a, $$1.b, $$1.c, $$1.d, $$1.a($$0), $$1.e, $$1.f, $$1.g, $$1.h, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gbl.class, "slotId;spawnProtection;forceGameMode;difficulty;gameMode;slotName;version;compatibility;templateId;templateImage;hardcore", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gbl.class, "slotId;spawnProtection;forceGameMode;difficulty;gameMode;slotName;version;compatibility;templateId;templateImage;hardcore", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gbl.class, "slotId;spawnProtection;forceGameMode;difficulty;gameMode;slotName;version;compatibility;templateId;templateImage;hardcore", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this, $$0);
    }
}

