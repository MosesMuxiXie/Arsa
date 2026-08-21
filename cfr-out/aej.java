/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aej
extends Record
implements aay<adb> {
    private final int b;
    private final chy c;
    private final boolean d;
    public static final aao<wx, aej> a = aao.a(aam.h, aej::b, chy.a, aej::e, aam.b, aej::f, aej::new);

    public aej(int $$0, chy $$1, boolean $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public static aej a(cgk $$0) {
        return new aej($$0.aA(), new chy($$0.dJ(), $$0.dN(), $$0.ec(), $$0.ee()), $$0.aV());
    }

    @Override
    public aba<aej> a() {
        return ahz.H;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aej.class, "id;values;onGround", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aej.class, "id;values;onGround", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aej.class, "id;values;onGround", "b", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public chy e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}

