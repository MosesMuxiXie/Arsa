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

public class eje
extends eei {
    public static final MapCodec<eje> f = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bfm.a(0.0f, 1.0f).fieldOf("leaf_particle_chance").forGetter($$0 -> Float.valueOf($$0.e)), (App)ly.bl.fieldOf("leaf_particle").forGetter($$0 -> $$0.g), eje.x()).apply((Applicative)$$02, eje::new));
    protected final lw g;

    public eje(float $$0, lw $$1, eog.d $$2) {
        super($$0, $$2);
        this.g = $$1;
    }

    @Override
    protected void a(dwo $$0, is $$1, bgr $$2) {
        bgm.a($$0, $$1, $$2, this.g);
    }

    public MapCodec<eje> a() {
        return f;
    }
}

