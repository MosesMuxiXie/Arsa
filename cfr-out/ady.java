/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ady
extends Record
implements aay<adb> {
    private final amo b;
    private final int c;
    public static final aao<xq, ady> a = aao.a(amo.b, ady::b, aam.h, ady::e, ady::new);

    public ady(amo $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ady> a() {
        return ahz.w;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ady.class, "cooldownGroup;duration", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ady.class, "cooldownGroup;duration", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ady.class, "cooldownGroup;duration", "b", "c"}, this, $$0);
    }

    public amo b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

