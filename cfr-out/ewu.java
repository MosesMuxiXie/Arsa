/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;

public final class ewu<WC extends ewp>
extends Record {
    private final eww<WC> d;
    private final WC e;
    public static final Codec<ewu<?>> a = mi.N.q().dispatch($$0 -> $$0.d, eww::c);
    public static final Codec<jd<ewu<?>>> b = amq.a(mj.aX, a);
    public static final Codec<jh<ewu<?>>> c = js.a(mj.aX, a);

    public ewu(eww<WC> $$0, WC $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public boolean a(bgr $$0) {
        return this.d.a(this.e, $$0);
    }

    public boolean a(ewr $$0, eqf $$1, Function<is, jd<dxo>> $$2, bgr $$3, euc $$4, dvu $$5, eqe $$6) {
        if (w.a($$1.f())) {
            return false;
        }
        return this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ewu.class, "worldCarver;config", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ewu.class, "worldCarver;config", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ewu.class, "worldCarver;config", "d", "e"}, this, $$0);
    }

    public eww<WC> a() {
        return this.d;
    }

    public WC b() {
        return this.e;
    }
}

