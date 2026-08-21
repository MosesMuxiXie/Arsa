/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;

public final class afp
extends Record
implements aay<adb> {
    private final int b;
    private final chy c;
    private final Set<chz> d;
    public static final aao<wx, afp> a = aao.a(aam.h, afp::b, chy.a, afp::e, chz.m, afp::f, afp::new);

    public afp(int $$0, chy $$1, Set<chz> $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public static afp a(int $$0, chy $$1, Set<chz> $$2) {
        return new afp($$0, $$1, $$2);
    }

    @Override
    public aba<afp> a() {
        return ahz.an;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afp.class, "id;change;relatives", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afp.class, "id;change;relatives", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afp.class, "id;change;relatives", "b", "c", "d"}, this, $$0);
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
}

