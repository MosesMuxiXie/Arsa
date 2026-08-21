/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class gzc
extends Record
implements gza {
    private final double b;
    private final double c;
    private final gzd d;

    public gzc(double $$0, double $$1, gzd $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public int a() {
        return this.t();
    }

    @gzd.b
    public int t() {
        return this.w().t();
    }

    @Override
    @gza.a
    public int b() {
        return this.w().b();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gzc.class, "x;y;buttonInfo", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gzc.class, "x;y;buttonInfo", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gzc.class, "x;y;buttonInfo", "b", "c", "d"}, this, $$0);
    }

    public double u() {
        return this.b;
    }

    public double v() {
        return this.c;
    }

    public gzd w() {
        return this.d;
    }
}

