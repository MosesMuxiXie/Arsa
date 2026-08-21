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

public final class mf
extends Record
implements lw {
    private final ftm c;
    private final int d;
    private final int e;
    public static final MapCodec<mf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ftm.a.fieldOf("target").forGetter(mf::b), (App)bfm.l.fieldOf("color").forGetter(mf::c), (App)bfm.r.fieldOf("duration").forGetter(mf::d)).apply((Applicative)$$0, mf::new));
    public static final aao<xq, mf> b = aao.a(ftm.b, mf::b, aam.g, mf::c, aam.h, mf::d, mf::new);

    public mf(ftm $$0, int $$1, int $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public lx<mf> a() {
        return ly.X;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{mf.class, "target;color;duration", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mf.class, "target;color;duration", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mf.class, "target;color;duration", "c", "d", "e"}, this, $$0);
    }

    public ftm b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}

