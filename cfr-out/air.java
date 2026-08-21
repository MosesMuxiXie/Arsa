/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class air
extends Record
implements aay<aib> {
    private final int b;
    private final int c;
    public static final aao<wx, air> a = aao.a(aam.x, air::b, aam.h, air::e, air::new);

    public air(int $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<air> a() {
        return ahz.bF;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{air.class, "containerId;buttonId", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{air.class, "containerId;buttonId", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{air.class, "containerId;buttonId", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

