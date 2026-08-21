/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyf
extends dxs {
    public static final MapCodec<dyf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ams.d(dxv.ai), ams.d(dxv.aj), ams.d(dxv.ak), ams.d(dxv.al), ams.d(dxv.am)).apply((Applicative)$$0, $$0.stable(dyf::new)));
    private final jd<dxo> c;
    private final jd<dxo> d;
    private final jd<dxo> e;
    private final jd<dxo> f;
    private final jd<dxo> g;

    public static dyf a(je<dxo> $$0) {
        return new dyf($$0.b(dxv.ai), $$0.b(dxv.aj), $$0.b(dxv.ak), $$0.b(dxv.al), $$0.b(dxv.am));
    }

    private dyf(jd<dxo> $$0, jd<dxo> $$1, jd<dxo> $$2, jd<dxo> $$3, jd<dxo> $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    @Override
    protected Stream<jd<dxo>> b() {
        return Stream.of(this.c, this.d, this.e, this.f, this.g);
    }

    @Override
    protected MapCodec<? extends dxs> a() {
        return b;
    }

    @Override
    public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2, dxx.f $$3) {
        int $$8;
        int $$4 = jo.c($$0);
        int $$5 = jo.c($$1);
        int $$6 = jo.c($$2);
        int $$7 = jw.a($$4);
        if ((long)$$7 * (long)$$7 + (long)($$8 = jw.a($$6)) * (long)$$8 <= 4096L) {
            return this.c;
        }
        int $$9 = (jw.a($$4) * 2 + 1) * 8;
        int $$10 = (jw.a($$6) * 2 + 1) * 8;
        double $$11 = $$3.e().a(new euj.e($$9, $$5, $$10));
        if ($$11 > 0.25) {
            return this.d;
        }
        if ($$11 >= -0.0625) {
            return this.e;
        }
        if ($$11 < -0.21875) {
            return this.f;
        }
        return this.g;
    }
}

