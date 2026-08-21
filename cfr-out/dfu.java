/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class dfu
extends Record {
    private final List<dfq.a<dft, dfr>> c;
    public static final dfu a = new dfu(List.of());
    public static final Codec<dfu> b = dfq.a.a(dfr.b).listOf().xmap(dfu::new, dfu::a);

    public dfu(List<dfq.a<dft, dfr>> $$0) {
        this.c = $$0;
    }

    public static dfu a(dfr $$0, int $$1) {
        return new dfu(dfq.a($$0, $$1));
    }

    public static dfu a(int $$0) {
        return new dfu(dfq.a($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dfu.class, "selectors", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dfu.class, "selectors", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dfu.class, "selectors", "c"}, this, $$0);
    }

    public List<dfq.a<dft, dfr>> a() {
        return this.c;
    }
}

