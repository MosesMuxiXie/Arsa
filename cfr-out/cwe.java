/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record cwe(bcz a, bcz b, bcz c, bcz d, amo e, amo f) {
    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cwe.class, "spinHeadSound;hurtSound;deathSound;stepSound;texture;eyeTexture", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cwe.class, "spinHeadSound;hurtSound;deathSound;stepSound;texture;eyeTexture", "a", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cwe.class, "spinHeadSound;hurtSound;deathSound;stepSound;texture;eyeTexture", "a", "b", "c", "d", "e", "f"}, this, $$0);
    }
}

