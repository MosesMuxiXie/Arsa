/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dxm
extends Record {
    private final dwc e;
    private final dgz f;
    public static final String a = "enabled_features";
    public static final MapCodec<dxm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dwc.b.lenientOptionalFieldOf("DataPacks", (Object)dwc.a).forGetter(dxm::a), (App)dhb.f.lenientOptionalFieldOf(a, (Object)dhb.h).forGetter(dxm::b)).apply((Applicative)$$0, dxm::new));
    public static final Codec<dxm> c = b.codec();
    public static final dxm d = new dxm(dwc.a, dhb.h);

    public dxm(dwc $$0, dgz $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    public dxm a(dgz $$0) {
        return new dxm(this.e, this.f.c($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dxm.class, "dataPacks;enabledFeatures", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dxm.class, "dataPacks;enabledFeatures", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dxm.class, "dataPacks;enabledFeatures", "e", "f"}, this, $$0);
    }

    public dwc a() {
        return this.e;
    }

    public dgz b() {
        return this.f;
    }
}

