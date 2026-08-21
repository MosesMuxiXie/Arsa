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

public class eir
extends eei {
    public static final MapCodec<eir> g = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bfm.a(0.0f, 1.0f).fieldOf("leaf_particle_chance").forGetter($$0 -> Float.valueOf($$0.e)), eir.x()).apply((Applicative)$$02, eir::new));

    public eir(float $$0, eog.d $$1) {
        super($$0, $$1);
    }

    @Override
    protected void a(dwo $$0, is $$1, bgr $$2) {
        lq $$3 = lq.a(ly.K, $$0.x($$1));
        bgm.a($$0, $$1, $$2, (lw)$$3);
    }

    public MapCodec<? extends eir> a() {
        return g;
    }
}

