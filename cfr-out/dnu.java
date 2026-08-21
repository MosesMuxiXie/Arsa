/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public final class dnu
extends Record {
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    public static final Codec<dnu> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.a(0.0f, 64.0f).optionalFieldOf("min_reach", (Object)Float.valueOf(0.0f)).forGetter(dnu::a), (App)bfm.a(0.0f, 64.0f).optionalFieldOf("max_reach", (Object)Float.valueOf(3.0f)).forGetter(dnu::b), (App)bfm.a(0.0f, 64.0f).optionalFieldOf("min_creative_reach", (Object)Float.valueOf(0.0f)).forGetter(dnu::c), (App)bfm.a(0.0f, 64.0f).optionalFieldOf("max_creative_reach", (Object)Float.valueOf(5.0f)).forGetter(dnu::d), (App)bfm.a(0.0f, 1.0f).optionalFieldOf("hitbox_margin", (Object)Float.valueOf(0.3f)).forGetter(dnu::e), (App)Codec.floatRange((float)0.0f, (float)2.0f).optionalFieldOf("mob_factor", (Object)Float.valueOf(1.0f)).forGetter(dnu::f)).apply((Applicative)$$0, dnu::new));
    public static final aao<ByteBuf, dnu> b = aao.a(aam.l, dnu::a, aam.l, dnu::b, aam.l, dnu::c, aam.l, dnu::d, aam.l, dnu::e, aam.l, dnu::f, dnu::new);

    public dnu(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
    }

    public static dnu a(chl $$0) {
        return new dnu(0.0f, (float)$$0.i(cis.l), 0.0f, (float)$$0.i(cis.l), 0.0f, 1.0f);
    }

    public ftk a(cgk $$0, float $$1, Predicate<cgk> $$2) {
        Either<fti, Collection<ftj>> $$3 = dee.a($$0, this, $$2, dvw.a.b);
        if ($$3.left().isPresent()) {
            return (ftk)$$3.left().get();
        }
        Collection $$4 = (Collection)$$3.right().get();
        ftj $$5 = null;
        ftm $$6 = $$0.n($$1);
        double $$7 = Double.MAX_VALUE;
        for (ftj $$8 : $$4) {
            double $$9 = $$6.g($$8.g());
            if (!($$9 < $$7)) continue;
            $$7 = $$9;
            $$5 = $$8;
        }
        if ($$5 != null) {
            return $$5;
        }
        ftm $$10 = $$0.ck();
        ftm $$11 = $$0.n($$1).e($$10);
        return fti.a($$11, iz.a($$10), is.a($$11));
    }

    public float a(cgk $$0) {
        if ($$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            if ($$1.au()) {
                return 0.0f;
            }
            return $$1.ha() ? this.e : this.c;
        }
        return this.c * this.h;
    }

    public float b(cgk $$0) {
        if ($$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            return $$1.ha() ? this.f : this.d;
        }
        return this.d * this.h;
    }

    public boolean a(chl $$0, ftm $$1) {
        return this.a($$0, $$1::g, 0.0);
    }

    public boolean a(chl $$0, fth $$1, double $$2) {
        return this.a($$0, $$1::e, $$2);
    }

    private boolean a(chl $$0, ToDoubleFunction<ftm> $$1, double $$2) {
        double $$3 = Math.sqrt($$1.applyAsDouble($$0.bV()));
        double $$4 = (double)(this.a($$0) - this.g) - $$2;
        double $$5 = (double)(this.b($$0) + this.g) + $$2;
        return $$3 >= $$4 && $$3 <= $$5;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnu.class, "minRange;maxRange;minCreativeRange;maxCreativeRange;hitboxMargin;mobFactor", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnu.class, "minRange;maxRange;minCreativeRange;maxCreativeRange;hitboxMargin;mobFactor", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnu.class, "minRange;maxRange;minCreativeRange;maxCreativeRange;hitboxMargin;mobFactor", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public float a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    public float d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.h;
    }
}

