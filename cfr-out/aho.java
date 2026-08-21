/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public final class aho
extends Record
implements aay<adb> {
    private final int b;
    private final chy c;
    private final Set<chz> d;
    private final boolean e;
    public static final aao<wx, aho> a = aao.a(aam.h, aho::b, chy.a, aho::e, chz.m, aho::f, aam.b, aho::g, aho::new);

    public aho(int $$0, chy $$1, Set<chz> $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static aho a(int $$0, chy $$1, Set<chz> $$2, boolean $$3) {
        return new aho($$0, $$1, $$2, $$3);
    }

    @Override
    public aba<aho> a() {
        return ahz.bi;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aho.class, "id;change;relatives;onGround", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aho.class, "id;change;relatives;onGround", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aho.class, "id;change;relatives;onGround", "b", "c", "d", "e"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public chy e() {
        return this.c;
    }

    public Set<chz> f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }
}

