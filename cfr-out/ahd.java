/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ahd
extends Record
implements aay<adb> {
    private final long b;
    private final long c;
    private final boolean d;
    public static final aao<wx, ahd> a = aao.a(aam.j, ahd::b, aam.j, ahd::e, aam.b, ahd::f, ahd::new);

    public ahd(long $$0, long $$1, boolean $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public aba<ahd> a() {
        return ahz.aX;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahd.class, "gameTime;dayTime;tickDayTime", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahd.class, "gameTime;dayTime;tickDayTime", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahd.class, "gameTime;dayTime;tickDayTime", "b", "c", "d"}, this, $$0);
    }

    public long b() {
        return this.b;
    }

    public long e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}

