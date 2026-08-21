/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record iko(is a, boolean b, boolean c, fug d, @Nullable fug e, @Nullable fug f, @Nullable fug g) {
    public iko(is $$0, boolean $$1, boolean $$2, fug $$3) {
        this($$0, $$1, $$2, $$3, null, null, null);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iko.class, "pos;isTranslucent;highContrast;shape;collisionShape;occlusionShape;interactionShape", "a", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iko.class, "pos;isTranslucent;highContrast;shape;collisionShape;occlusionShape;interactionShape", "a", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iko.class, "pos;isTranslucent;highContrast;shape;collisionShape;occlusionShape;interactionShape", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
    }
}

