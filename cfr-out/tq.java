/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class tq
extends Record {
    private final int a;
    private final boolean b;
    private static final tq c = new tq(1, true);

    public tq(int $$0, boolean $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public static tq a() {
        return c;
    }

    public boolean b() {
        return this.a < 1;
    }

    public boolean a(int $$0, int $$1) {
        boolean $$2 = $$0 != $$1;
        boolean $$3 = this.b() || $$0 < this.a;
        return $$3 && (!$$2 || !this.b);
    }

    public boolean c() {
        return this.a != 1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tq.class, "numberOfTries;haltOnFailure", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tq.class, "numberOfTries;haltOnFailure", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tq.class, "numberOfTries;haltOnFailure", "a", "b"}, this, $$0);
    }

    public int d() {
        return this.a;
    }

    public boolean e() {
        return this.b;
    }
}

