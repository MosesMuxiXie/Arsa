/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class jp
extends Record {
    private final Optional<bag> b;
    private final Lifecycle c;
    public static final jp a = new jp(Optional.empty(), Lifecycle.stable());

    public jp(Optional<bag> $$0, Lifecycle $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{jp.class, "knownPackInfo;lifecycle", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jp.class, "knownPackInfo;lifecycle", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jp.class, "knownPackInfo;lifecycle", "b", "c"}, this, $$0);
    }

    public Optional<bag> a() {
        return this.b;
    }

    public Lifecycle b() {
        return this.c;
    }
}

