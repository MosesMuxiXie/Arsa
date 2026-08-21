/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public final class aiw
extends Record
implements aay<aib> {
    private final int b;
    private final List<String> c;
    private final Optional<String> d;
    public static final aao<wx, aiw> a = aao.a(aam.h, aiw::b, aam.b(1024).a(aam.c(100)), aiw::e, aam.b(32).a(aam::a), aiw::f, aiw::new);

    public aiw(int $$0, List<String> $$1, Optional<String> $$2) {
        $$1 = List.copyOf($$1);
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public aba<aiw> a() {
        return ahz.bK;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aiw.class, "slot;pages;title", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aiw.class, "slot;pages;title", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aiw.class, "slot;pages;title", "b", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public List<String> e() {
        return this.c;
    }

    public Optional<String> f() {
        return this.d;
    }
}

