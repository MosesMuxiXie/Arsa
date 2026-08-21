/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public final class wz
extends Record {
    private final Map<kh<?>, Integer> b;
    private final Set<kh<?>> c;
    public static final aao<xq, wz> a = aao.a(aam.a(HashMap::new, aam.a(mj.r), aam.g, 256), wz::a, aam.a(HashSet::new, aam.a(mj.r), 256), wz::b, wz::new);

    public wz(Map<kh<?>, Integer> $$0, Set<kh<?>> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static wz a(kg $$0, a $$1) {
        kg.d $$22 = $$0.e();
        IdentityHashMap $$3 = new IdentityHashMap($$22.a().d());
        $$22.a().forEach($$2 -> $$3.put($$2.a(), (Integer)$$1.apply($$2)));
        return new wz($$3, $$22.b());
    }

    public boolean b(kg $$0, a $$1) {
        kg.d $$2 = $$0.e();
        if (!$$2.b().equals(this.c)) {
            return false;
        }
        if (this.b.size() != $$2.a().d()) {
            return false;
        }
        for (kk<?> $$3 : $$2.a()) {
            Integer $$4 = this.b.get($$3.a());
            if ($$4 == null) {
                return false;
            }
            Integer $$5 = (Integer)$$1.apply($$3);
            if ($$5.equals($$4)) continue;
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{wz.class, "addedComponents;removedComponents", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{wz.class, "addedComponents;removedComponents", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{wz.class, "addedComponents;removedComponents", "b", "c"}, this, $$0);
    }

    public Map<kh<?>, Integer> a() {
        return this.b;
    }

    public Set<kh<?>> b() {
        return this.c;
    }

    @FunctionalInterface
    public static interface a
    extends Function<kk<?>, Integer> {
    }
}

