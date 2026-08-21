/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record fmp(is b, dkr c, Optional<yh> d) {
    private final is b;
    private final dkr c;
    private final Optional<yh> d;
    public static final Codec<fmp> a = RecordCodecBuilder.create($$0 -> $$0.group((App)is.a.fieldOf("pos").forGetter(fmp::c), (App)dkr.q.lenientOptionalFieldOf("color", dkr.a).forGetter(fmp::d), (App)yj.a.lenientOptionalFieldOf("name").forGetter(fmp::e)).apply((Applicative)$$0, fmp::new));

    public static @Nullable fmp a(dvt $$0, is $$1) {
        elb $$2 = $$0.c_($$1);
        if ($$2 instanceof ekp) {
            ekp $$3 = (ekp)$$2;
            dkr $$4 = $$3.f();
            Optional<yh> $$5 = Optional.ofNullable($$3.as());
            return new fmp($$1, $$4, $$5);
        }
        return null;
    }

    public jd<fmr> a() {
        return switch (this.c) {
            default -> throw new MatchException(null, null);
            case dkr.a -> fms.k;
            case dkr.b -> fms.l;
            case dkr.c -> fms.m;
            case dkr.d -> fms.n;
            case dkr.e -> fms.o;
            case dkr.f -> fms.p;
            case dkr.g -> fms.q;
            case dkr.h -> fms.r;
            case dkr.i -> fms.s;
            case dkr.j -> fms.t;
            case dkr.k -> fms.u;
            case dkr.l -> fms.v;
            case dkr.m -> fms.w;
            case dkr.n -> fms.x;
            case dkr.o -> fms.y;
            case dkr.p -> fms.z;
        };
    }

    public String b() {
        return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fmp.class, "pos;color;name", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fmp.class, "pos;color;name", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fmp.class, "pos;color;name", "b", "c", "d"}, this, $$0);
    }

    public is c() {
        return this.b;
    }

    public dkr d() {
        return this.c;
    }

    public Optional<yh> e() {
        return this.d;
    }
}

