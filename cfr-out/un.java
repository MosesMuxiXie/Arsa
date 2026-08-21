/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class un
extends Record
implements uh {
    private final ftm b;
    private final ftm c;
    private final int d;
    private final float e;
    public static final float a = 3.0f;

    public un(ftm $$0, ftm $$1, int $$2, float $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public void a(uj $$0, float $$1) {
        $$0.a(this.b, this.c, bel.a(this.d, $$1), this.e);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{un.class, "start;end;color;width", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{un.class, "start;end;color;width", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{un.class, "start;end;color;width", "b", "c", "d", "e"}, this, $$0);
    }

    public ftm a() {
        return this.b;
    }

    public ftm b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }
}

