/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aeo
extends Record
implements aay<adb> {
    private final int b;
    private final float c;
    public static final aao<wx, aeo> a = aay.a(aeo::a, aeo::new);

    public aeo(chl $$0) {
        this($$0.aA(), $$0.fg());
    }

    private aeo(wx $$0) {
        this($$0.l(), $$0.readFloat());
    }

    public aeo(int $$0, float $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<aeo> a() {
        return ahz.N;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aeo.class, "id;yaw", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aeo.class, "id;yaw", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aeo.class, "id;yaw", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public float e() {
        return this.c;
    }
}

