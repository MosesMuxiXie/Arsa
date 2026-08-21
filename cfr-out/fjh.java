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

public class fjh
extends fjk {
    public static final MapCodec<fjh> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.e.q().fieldOf("block").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, fjh::new));
    private final dzq b;
    private final float d;

    public fjh(dzq $$0, float $$1) {
        this.b = $$0;
        this.d = $$1;
    }

    @Override
    public boolean a(eoh $$0, bgr $$1) {
        return $$0.a(this.b) && $$1.i() < this.d;
    }

    @Override
    protected fjl<?> a() {
        return fjl.e;
    }
}

