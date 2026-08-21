/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dyb
extends dxs {
    private static final MapCodec<jd<dxo>> d = dxo.c.fieldOf("biome");
    public static final MapCodec<dxx.c<jd<dxo>>> b = dxx.c.a(d).fieldOf("biomes");
    private static final MapCodec<jd<dyc>> e = dyc.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
    public static final MapCodec<dyb> c = Codec.mapEither(b, e).xmap(dyb::new, $$0 -> $$0.f);
    private final Either<dxx.c<jd<dxo>>, jd<dyc>> f;

    private dyb(Either<dxx.c<jd<dxo>>, jd<dyc>> $$0) {
        this.f = $$0;
    }

    public static dyb a(dxx.c<jd<dxo>> $$0) {
        return new dyb((Either<dxx.c<jd<dxo>>, jd<dyc>>)Either.left($$0));
    }

    public static dyb a(jd<dyc> $$0) {
        return new dyb((Either<dxx.c<jd<dxo>>, jd<dyc>>)Either.right($$0));
    }

    private dxx.c<jd<dxo>> d() {
        return (dxx.c)this.f.map($$0 -> $$0, $$0 -> ((dyc)$$0.a()).a());
    }

    @Override
    protected Stream<jd<dxo>> b() {
        return this.d().a().stream().map(Pair::getSecond);
    }

    @Override
    protected MapCodec<? extends dxs> a() {
        return c;
    }

    public boolean a(amt<dyc> $$0) {
        Optional $$1 = this.f.right();
        return $$1.isPresent() && ((jd)$$1.get()).a($$0);
    }

    @Override
    public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2, dxx.f $$3) {
        return this.a($$3.a($$0, $$1, $$2));
    }

    @bht
    public jd<dxo> a(dxx.h $$0) {
        return this.d().a($$0);
    }

    @Override
    public void a(List<String> $$0, is $$1, dxx.f $$2) {
        int $$3 = jo.a($$1.u());
        int $$4 = jo.a($$1.v());
        int $$5 = jo.a($$1.w());
        dxx.h $$6 = $$2.a($$3, $$4, $$5);
        float $$7 = dxx.a($$6.d());
        float $$8 = dxx.a($$6.e());
        float $$9 = dxx.a($$6.b());
        float $$10 = dxx.a($$6.c());
        float $$11 = dxx.a($$6.g());
        double $$12 = eux.a($$11);
        dye $$13 = new dye();
        $$0.add("Biome builder PV: " + dye.a($$12) + " C: " + $$13.b($$7) + " E: " + $$13.c($$8) + " T: " + $$13.d($$9) + " H: " + $$13.e($$10));
    }
}

