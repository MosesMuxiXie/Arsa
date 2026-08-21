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
import java.util.function.Consumer;

public final class dov
extends Record
implements doc,
dpe {
    private final int f;
    public static final int a = 120000;
    public static final int b = 0;
    public static final int c = 4;
    public static final Codec<dov> d = bfm.a(0, 4).xmap(dov::new, dov::a);
    public static final aao<xq, dov> e = aao.a(aam.h, dov::a, dov::new);

    public dov(int $$0) {
        this.f = $$0;
    }

    @Override
    public void a(dwo $$0, chl $$1, dlt $$2, dob $$3) {
        $$1.a(new cfm(cfo.E, 120000, this.f, false, false, true));
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        List<cfm> $$4 = List.of(new cfm(cfo.E, 120000, this.f, false, false, true));
        dnr.a($$4, $$1, 1.0f, $$0.b());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dov.class, "value", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dov.class, "value", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dov.class, "value", "f"}, this, $$0);
    }

    public int a() {
        return this.f;
    }
}

