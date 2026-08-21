/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;

public final class exi<FC extends fac, F extends exx<FC>>
extends Record {
    private final F d;
    private final FC e;
    public static final Codec<exi<?, ?>> a = mi.O.q().dispatch($$0 -> $$0.d, exx::a);
    public static final Codec<jd<exi<?, ?>>> b = amq.a(mj.aY, a);
    public static final Codec<jh<exi<?, ?>>> c = js.a(mj.aY, a);

    public exi(F $$0, FC $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public boolean a(dxn $$0, eqg $$1, bgr $$2, is $$3) {
        return ((exx)this.d).a(this.e, $$0, $$1, $$2, $$3);
    }

    public Stream<exi<?, ?>> a() {
        return Stream.concat(Stream.of(this), this.e.e());
    }

    @Override
    public String toString() {
        return "Configured: " + String.valueOf(this.d) + ": " + String.valueOf(this.e);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{exi.class, "feature;config", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{exi.class, "feature;config", "d", "e"}, this, $$0);
    }

    public F b() {
        return this.d;
    }

    public FC c() {
        return this.e;
    }
}

