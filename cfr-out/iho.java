/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record iho(boolean a, ilp b, hql c) {
    public static iho a(inw $$0, iof $$1, hqp $$2) {
        ilp $$3 = $$1.a($$2, $$0);
        return new iho($$1.d().a(), $$3, $$1.e());
    }

    public void a(ihm.b $$0, dlr $$1) {
        $$0.a(this.a);
        $$0.a(this.b);
        $$0.a(this.c.a($$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iho.class, "usesBlockLight;particleIcon;transforms", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iho.class, "usesBlockLight;particleIcon;transforms", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iho.class, "usesBlockLight;particleIcon;transforms", "a", "b", "c"}, this, $$0);
    }
}

