/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record cge(cgf a, boolean b, boolean c, @Nullable fum d) {
    public static cge a(chn $$0, boolean $$1, boolean $$2) {
        return new cge(cgf.a, $$1, $$2, $$0.cI());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cge.class, "type;keepEquipment;preserveCanPickUpLoot;team", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cge.class, "type;keepEquipment;preserveCanPickUpLoot;team", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cge.class, "type;keepEquipment;preserveCanPickUpLoot;team", "a", "b", "c", "d"}, this, $$0);
    }

    @FunctionalInterface
    public static interface a<T extends chn> {
        public void finalizeConversion(T var1);
    }
}

