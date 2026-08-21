/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bxa
extends Record {
    private final dzq b;
    private final int c;
    private final int d;
    private final boolean e;
    public static final aao<xq, bxa> a = aao.a(aam.a(mj.i), bxa::a, aam.h, bxa::b, aam.h, bxa::c, aam.b, bxa::d, bxa::new);

    public bxa(dzq $$0, int $$1, int $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static bxa a(eky $$0) {
        return new bxa($$0.o().b(), $$0.f(), eky.a($$0.o()), $$0.h());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bxa.class, "type;occupantCount;honeyLevel;sedated", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bxa.class, "type;occupantCount;honeyLevel;sedated", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bxa.class, "type;occupantCount;honeyLevel;sedated", "b", "c", "d", "e"}, this, $$0);
    }

    public dzq a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }
}

