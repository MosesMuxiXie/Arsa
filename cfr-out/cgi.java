/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;

public final class cgi
extends Record {
    private final Map<cgv, Float> f;
    public static final float a = 0.085f;
    public static final float b = 1.0f;
    public static final int c = 2;
    public static final cgi d = new cgi(bhs.a(cgv.class, (K $$0) -> Float.valueOf(0.085f)));
    public static final Codec<cgi> e = Codec.unboundedMap(cgv.l, bfm.u).xmap(cgi::b, cgi::a).xmap(cgi::new, cgi::a);

    public cgi(Map<cgv, Float> $$0) {
        this.f = $$0;
    }

    private static Map<cgv, Float> a(Map<cgv, Float> $$02) {
        HashMap<cgv, Float> $$1 = new HashMap<cgv, Float>($$02);
        $$1.values().removeIf($$0 -> $$0.floatValue() == 0.085f);
        return $$1;
    }

    private static Map<cgv, Float> b(Map<cgv, Float> $$0) {
        return bhs.a(cgv.class, (K $$1) -> $$0.getOrDefault($$1, Float.valueOf(0.085f)));
    }

    public cgi a(cgv $$0) {
        return this.a($$0, 2.0f);
    }

    public cgi a(cgv $$0, float $$1) {
        if ($$1 < 0.0f) {
            throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + String.valueOf($$0));
        }
        if (this.b($$0) == $$1) {
            return this;
        }
        return new cgi(bhs.a(cgv.class, (K $$2) -> Float.valueOf($$2 == $$0 ? $$1 : this.b((cgv)$$2))));
    }

    public float b(cgv $$0) {
        return this.f.getOrDefault($$0, Float.valueOf(0.085f)).floatValue();
    }

    public boolean c(cgv $$0) {
        return this.b($$0) > 1.0f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cgi.class, "byEquipment", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cgi.class, "byEquipment", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cgi.class, "byEquipment", "f"}, this, $$0);
    }

    public Map<cgv, Float> a() {
        return this.f;
    }
}

