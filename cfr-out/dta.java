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

public final class dta
extends Record
implements dth {
    private final ftm d;
    private final ftm e;
    private final dsv f;
    public static final MapCodec<dta> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ftm.a.fieldOf("direction").forGetter(dta::b), (App)ftm.a.fieldOf("coordinate_scale").forGetter(dta::c), (App)dsv.b.fieldOf("magnitude").forGetter(dta::d)).apply((Applicative)$$0, dta::new));
    private static final int g = 10;

    public dta(ftm $$0, ftm $$1, dsv $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        ftm $$5 = $$3.cj();
        ftm $$6 = $$5.j(this.d).h(this.e).c((double)this.f.a($$1));
        $$3.l($$6);
        $$3.ah = true;
        $$3.aF = true;
        if ($$3 instanceof ddm) {
            ddm $$7 = (ddm)$$3;
            $$7.s(10);
        }
    }

    public MapCodec<dta> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dta.class, "direction;coordinateScale;magnitude", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dta.class, "direction;coordinateScale;magnitude", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dta.class, "direction;coordinateScale;magnitude", "d", "e", "f"}, this, $$0);
    }

    public ftm b() {
        return this.d;
    }

    public ftm c() {
        return this.e;
    }

    public dsv d() {
        return this.f;
    }
}

