/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ade(Object2IntMap<bdh<?>> b) implements aay<adb>
{
    private static final aao<xq, Object2IntMap<bdh<?>>> c = aam.a(Object2IntOpenHashMap::new, bdh.a, aam.h);
    public static final aao<xq, ade> a = c.a(ade::new, ade::b);

    @Override
    public aba<ade> a() {
        return ahz.e;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ade.class, "stats", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ade.class, "stats", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ade.class, "stats", "b"}, this, $$0);
    }
}

