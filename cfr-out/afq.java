/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class afq
extends Record
implements aay<adb> {
    private final float b;
    private final boolean c;
    private final float d;
    private final boolean e;
    public static final aao<wx, afq> a = aao.a(aam.l, afq::b, aam.b, afq::e, aam.l, afq::f, aam.b, afq::g, afq::new);

    public afq(float $$0, boolean $$1, float $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public aba<afq> a() {
        return ahz.ao;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afq.class, "yRot;relativeY;xRot;relativeX", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afq.class, "yRot;relativeY;xRot;relativeX", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afq.class, "yRot;relativeY;xRot;relativeX", "b", "c", "d", "e"}, this, $$0);
    }

    public float b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public float f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }
}

