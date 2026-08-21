/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eit
extends dzg {
    protected static final MapCodec<md> a = mi.j.q().comapFlatMap($$0 -> {
        DataResult dataResult;
        if ($$0 instanceof md) {
            md $$1 = (md)$$0;
            dataResult = DataResult.success((Object)$$1);
        } else {
            dataResult = DataResult.error(() -> "Not a SimpleParticleType: " + String.valueOf($$0));
        }
        return dataResult;
    }, $$0 -> $$0).fieldOf("particle_options");
    public static final MapCodec<eit> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)a.forGetter($$0 -> $$0.c), eit.x()).apply((Applicative)$$02, eit::new));
    protected final md c;

    public MapCodec<? extends eit> a() {
        return b;
    }

    protected eit(md $$0, eog.d $$1) {
        super($$1);
        this.c = $$0;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        double $$4 = (double)$$2.u() + 0.5;
        double $$5 = (double)$$2.v() + 0.7;
        double $$6 = (double)$$2.w() + 0.5;
        $$1.a(ly.ai, $$4, $$5, $$6, 0.0, 0.0, 0.0);
        $$1.a(this.c, $$4, $$5, $$6, 0.0, 0.0, 0.0);
    }
}

