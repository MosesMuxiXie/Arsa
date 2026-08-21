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

public final class dps
extends Record
implements dpp {
    private final float c;
    private static final float f = 16.0f;
    public static final MapCodec<dps> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.v.optionalFieldOf("diameter", (Object)Float.valueOf(16.0f)).forGetter(dps::b)).apply((Applicative)$$0, dps::new));
    public static final aao<xq, dps> b = aao.a(aam.l, dps::b, dps::new);

    public dps() {
        this(16.0f);
    }

    public dps(float $$0) {
        this.c = $$0;
    }

    public dpp.a<dps> a() {
        return dpp.a.d;
    }

    @Override
    public boolean a(dwo $$0, dlt $$1, chl $$2) {
        boolean $$3 = false;
        for (int $$4 = 0; $$4 < 16; ++$$4) {
            bdb $$12;
            bcz $$11;
            double $$5 = $$2.dP() + ($$2.ep().j() - 0.5) * (double)this.c;
            double $$6 = bgj.a($$2.dR() + ($$2.ep().j() - 0.5) * (double)this.c, (double)$$0.K_(), (double)($$0.K_() + ((axf)$$0).o() - 1));
            double $$7 = $$2.dV() + ($$2.ep().j() - 0.5) * (double)this.c;
            if ($$2.cq()) {
                $$2.cf();
            }
            ftm $$8 = $$2.dI();
            if (!$$2.b($$5, $$6, $$7, true)) continue;
            $$0.a(etk.R, $$8, etk.a.a($$2));
            if ($$2 instanceof cvo) {
                bcz $$9 = bda.ld;
                bdb $$10 = bdb.g;
            } else {
                $$11 = bda.fI;
                $$12 = bdb.h;
            }
            $$0.a(null, $$2.dP(), $$2.dR(), $$2.dV(), $$11, $$12);
            $$2.l();
            $$3 = true;
            break;
        }
        if ($$3 && $$2 instanceof ddm) {
            ddm $$13 = (ddm)$$2;
            $$13.hr();
        }
        return $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dps.class, "diameter", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dps.class, "diameter", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dps.class, "diameter", "c"}, this, $$0);
    }

    public float b() {
        return this.c;
    }
}

