/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;

public final class ahw
extends Record
implements aay<adb> {
    private final Map<amt<drb>, drb> b;
    private final drf.b<drs> c;
    public static final aao<xq, ahw> a = aao.a(aam.a(HashMap::new, amt.b(drb.a), drb.i), ahw::b, drf.b.b(), ahw::e, ahw::new);

    public ahw(Map<amt<drb>, drb> $$0, drf.b<drs> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ahw> a() {
        return ahz.bn;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahw.class, "itemSets;stonecutterRecipes", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahw.class, "itemSets;stonecutterRecipes", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahw.class, "itemSets;stonecutterRecipes", "b", "c"}, this, $$0);
    }

    public Map<amt<drb>, drb> b() {
        return this.b;
    }

    public drf.b<drs> e() {
        return this.c;
    }
}

