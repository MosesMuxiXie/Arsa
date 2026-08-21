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

final class ewk
extends Record
implements evx {
    private final jy e;
    public static MapCodec<ewk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)jy.g.optionalFieldOf("offset", (Object)jy.i).forGetter(ewk::g)).apply((Applicative)$$0, ewk::new));

    ewk(jy $$0) {
        this.e = $$0;
    }

    @Override
    public evy<?> a() {
        return evy.m;
    }

    public boolean a(dxn $$0, is $$1) {
        return $$0.a(null, fud.b().a($$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ewk.class, "offset", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ewk.class, "offset", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ewk.class, "offset", "e"}, this, $$0);
    }

    public jy g() {
        return this.e;
    }

    @Override
    public /* synthetic */ boolean test(Object object, Object object2) {
        return this.a((dxn)object, (is)object2);
    }
}

