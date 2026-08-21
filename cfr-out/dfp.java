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

public final class dfp
extends Record
implements dfr {
    private final cq.b c;
    public static final MapCodec<dfp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cq.b.d.fieldOf("range").forGetter(dfp::b)).apply((Applicative)$$0, dfp::new));

    public dfp(cq.b $$0) {
        this.c = $$0;
    }

    public boolean a(dft $$0) {
        dwy $$1 = $$0.c().a(ceg.p, ftm.b($$0.a()));
        float $$2 = esh.k[$$1.a()];
        return this.c.d($$2);
    }

    public MapCodec<dfp> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dfp.class, "range", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dfp.class, "range", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dfp.class, "range", "c"}, this, $$0);
    }

    public cq.b b() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dft)object);
    }
}

