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

public final class dpq
extends Record
implements dpp {
    private final jd<bcz> c;
    public static final MapCodec<dpq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bcz.b.fieldOf("sound").forGetter(dpq::b)).apply((Applicative)$$0, dpq::new));
    public static final aao<xq, dpq> b = aao.a(bcz.d, dpq::b, dpq::new);

    public dpq(jd<bcz> $$0) {
        this.c = $$0;
    }

    public dpp.a<dpq> a() {
        return dpp.a.e;
    }

    @Override
    public boolean a(dwo $$0, dlt $$1, chl $$2) {
        $$0.a(null, $$2.dK(), this.c.a(), $$2.dB(), 1.0f, 1.0f);
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpq.class, "sound", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpq.class, "sound", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpq.class, "sound", "c"}, this, $$0);
    }

    public jd<bcz> b() {
        return this.c;
    }
}

