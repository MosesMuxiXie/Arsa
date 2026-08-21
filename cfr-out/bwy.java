/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bwy
extends Record {
    private final int b;
    public static final aao<xq, bwy> a = aao.a(aam.h, bwy::a, bwy::new);

    public bwy(int $$0) {
        this.b = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bwy.class, "listenerRadius", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bwy.class, "listenerRadius", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bwy.class, "listenerRadius", "b"}, this, $$0);
    }

    public int a() {
        return this.b;
    }
}

