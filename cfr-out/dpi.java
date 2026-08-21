/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dpi
extends Record {
    private final dlt c;
    public static final Codec<dpi> a = dlt.b.xmap(dpi::new, dpi::a);
    public static final aao<xq, dpi> b = aao.a(dlt.j, dpi::a, dpi::new);

    public dpi(dlt $$0) {
        this.c = $$0;
    }

    public dlt a(dlt $$0, int $$1, boolean $$2, a $$3) {
        if ($$2) {
            return $$0;
        }
        if ($$0.N() >= $$1) {
            return $$0;
        }
        dlt $$4 = this.c.v();
        if ($$0.f()) {
            return $$4;
        }
        $$3.apply($$4);
        return $$0;
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        dpi $$1 = (dpi)$$0;
        return dlt.a(this.c, $$1.c);
    }

    @Override
    public int hashCode() {
        return dlt.b(this.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpi.class, "convertInto", "c"}, this);
    }

    public dlt a() {
        return this.c;
    }

    @FunctionalInterface
    public static interface a {
        public void apply(dlt var1);
    }
}

