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

public final class dpr
extends Record
implements dpp {
    private final jh<cfk> c;
    public static final MapCodec<dpr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.ae).fieldOf("effects").forGetter(dpr::b)).apply((Applicative)$$0, dpr::new));
    public static final aao<xq, dpr> b = aao.a(aam.c(mj.ae), dpr::b, dpr::new);

    public dpr(jd<cfk> $$0) {
        this(jh.a($$0));
    }

    public dpr(jh<cfk> $$0) {
        this.c = $$0;
    }

    public dpp.a<dpr> a() {
        return dpp.a.b;
    }

    @Override
    public boolean a(dwo $$0, dlt $$1, chl $$2) {
        boolean $$3 = false;
        for (jd jd2 : this.c) {
            if (!$$2.g(jd2)) continue;
            $$3 = true;
        }
        return $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpr.class, "effects", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpr.class, "effects", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpr.class, "effects", "c"}, this, $$0);
    }

    public jh<cfk> b() {
        return this.c;
    }
}

