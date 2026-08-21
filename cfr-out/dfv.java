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

public final class dfv
extends Record
implements dfr {
    private final jh<ffo> c;
    public static final MapCodec<dfv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.bs).fieldOf("structures").forGetter(dfv::b)).apply((Applicative)$$0, dfv::new));

    public dfv(jh<ffo> $$0) {
        this.c = $$0;
    }

    public boolean a(dft $$0) {
        return $$0.b().a().b().a($$0.a(), this.c).b();
    }

    public MapCodec<dfv> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dfv.class, "requiredStructures", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dfv.class, "requiredStructures", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dfv.class, "requiredStructures", "c"}, this, $$0);
    }

    public jh<ffo> b() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dft)object);
    }
}

