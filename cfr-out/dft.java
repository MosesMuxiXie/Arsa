/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record dft(is a, dxf b, cee c, jd<dxo> d) {
    public static dft a(dxf $$0, is $$1) {
        jd<dxo> $$2 = $$0.z($$1);
        return new dft($$1, $$0, $$0.ad(), $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dft.class, "pos;level;environmentAttributes;biome", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dft.class, "pos;level;environmentAttributes;biome", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dft.class, "pos;level;environmentAttributes;biome", "a", "b", "c", "d"}, this, $$0);
    }
}

