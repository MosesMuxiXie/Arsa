/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class agy
extends Record
implements aay<adb> {
    private final int b;
    private final dlt c;
    public static final aao<xq, agy> a = aao.a(aam.h, agy::b, dlt.h, agy::e, agy::new);

    public agy(int $$0, dlt $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<agy> a() {
        return ahz.cA;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{agy.class, "slot;contents", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{agy.class, "slot;contents", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{agy.class, "slot;contents", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public dlt e() {
        return this.c;
    }
}

