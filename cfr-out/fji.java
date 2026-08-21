/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fji
extends fjk {
    public static final MapCodec<fji> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)eoh.a.fieldOf("block_state").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, fji::new));
    private final eoh b;
    private final float d;

    public fji(eoh $$0, float $$1) {
        this.b = $$0;
        this.d = $$1;
    }

    @Override
    public boolean a(eoh $$0, bgr $$1) {
        return $$0 == this.b && $$1.i() < this.d;
    }

    @Override
    protected fjl<?> a() {
        return fjl.f;
    }
}

