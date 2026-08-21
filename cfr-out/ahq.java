/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ahq
extends Record
implements aay<adb> {
    private final float b;
    private final boolean c;
    public static final aao<wx, ahq> a = aay.a(ahq::a, ahq::new);

    private ahq(wx $$0) {
        this($$0.readFloat(), $$0.readBoolean());
    }

    public ahq(float $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static ahq a(cdo $$0) {
        return new ahq($$0.f(), $$0.l());
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.a(this.c);
    }

    @Override
    public aba<ahq> a() {
        return ahz.cx;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahq.class, "tickRate;isFrozen", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahq.class, "tickRate;isFrozen", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahq.class, "tickRate;isFrozen", "b", "c"}, this, $$0);
    }

    public float b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

