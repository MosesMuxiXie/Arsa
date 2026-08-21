/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class di
extends Record {
    private final Map<djj, cg> b;
    public static final Codec<di> a = Codec.unboundedMap(djk.a, cg.a).xmap(di::new, di::a);

    public di(Map<djj, cg> $$0) {
        this.b = $$0;
    }

    public boolean a(cid $$0) {
        for (Map.Entry<djj, cg> $$1 : this.b.entrySet()) {
            if (di.a($$0, $$1.getValue(), $$1.getKey().a())) continue;
            return false;
        }
        return true;
    }

    private static boolean a(cid $$0, cg $$1, IntList $$2) {
        for (int $$3 = 0; $$3 < $$2.size(); ++$$3) {
            int $$4 = $$2.getInt($$3);
            cic $$5 = $$0.a_($$4);
            if ($$5 == null || !$$1.a($$5.a())) continue;
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{di.class, "slots", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{di.class, "slots", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{di.class, "slots", "b"}, this, $$0);
    }

    public Map<djj, cg> a() {
        return this.b;
    }
}

