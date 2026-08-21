/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gku(amo a, amo b, amo c, amo d) {
    public gku(amo $$0) {
        this($$0, $$0, $$0, $$0);
    }

    public gku(amo $$0, amo $$1) {
        this($$0, $$0, $$1, $$1);
    }

    public gku(amo $$0, amo $$1, amo $$2) {
        this($$0, $$1, $$2, $$1);
    }

    public amo a(boolean $$0, boolean $$1) {
        if ($$0) {
            return $$1 ? this.c : this.a;
        }
        return $$1 ? this.d : this.b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gku.class, "enabled;disabled;enabledFocused;disabledFocused", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gku.class, "enabled;disabled;enabledFocused;disabledFocused", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gku.class, "enabled;disabled;enabledFocused;disabledFocused", "a", "b", "c", "d"}, this, $$0);
    }
}

