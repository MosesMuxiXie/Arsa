/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class afc
extends Record
implements aay<adb> {
    private final ftm b;
    private final float c;
    private final float d;
    public static final aao<wx, afc> a = aao.a(ftm.b, afc::b, aam.l, afc::e, aam.l, afc::f, afc::new);

    public afc(ftm $$0, float $$1, float $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public static afc a(cgk $$0) {
        return new afc($$0.dI(), $$0.ec(), $$0.ee());
    }

    @Override
    public aba<afc> a() {
        return ahz.aa;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afc.class, "position;yRot;xRot", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afc.class, "position;yRot;xRot", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afc.class, "position;yRot;xRot", "b", "c", "d"}, this, $$0);
    }

    public ftm b() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.d;
    }
}

