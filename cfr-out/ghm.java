/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record ghm(cbn<hqq> a) {
    private final cbn<hqq> a;

    public ghm {
        if ($$0.c()) {
            throw new IllegalArgumentException("Variant list must contain at least one element");
        }
    }

    public ghm a(hqr $$0) {
        return new ghm(this.a.a($$0));
    }

    public hqh.b a() {
        List<cbm<hqq>> $$0 = this.a.d();
        return $$0.size() == 1 ? new hqo.a($$0.getFirst().a()) : new ioj.a(this.a.a(hqo.a::new));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ghm.class, "variants", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ghm.class, "variants", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ghm.class, "variants", "a"}, this, $$0);
    }

    public cbn<hqq> b() {
        return this.a;
    }
}

