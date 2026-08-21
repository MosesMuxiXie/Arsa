/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dfn
extends Record
implements dfr {
    private final jh<dxo> c;
    public static final MapCodec<dfn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.aS).fieldOf("biomes").forGetter(dfn::b)).apply((Applicative)$$0, dfn::new));

    public dfn(jh<dxo> $$0) {
        this.c = $$0;
    }

    public boolean a(dft $$0) {
        return this.c.a($$0.d());
    }

    public MapCodec<dfn> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dfn.class, "requiredBiomes", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dfn.class, "requiredBiomes", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dfn.class, "requiredBiomes", "c"}, this, $$0);
    }

    public jh<dxo> b() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dft)object);
    }
}

