/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ajz
extends Record
implements aay<aib> {
    private final is b;
    private final ept c;
    private final String d;
    public static final aao<wx, ajz> a = aao.a(is.b, ajz::b, ept.f, ajz::e, aam.p, ajz::f, ajz::new);

    public ajz(is $$0, ept $$1, String $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public aba<ajz> a() {
        return ahz.cp;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajz.class, "position;mode;message", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajz.class, "position;mode;message", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajz.class, "position;mode;message", "b", "c", "d"}, this, $$0);
    }

    public is b() {
        return this.b;
    }

    public ept e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }
}

