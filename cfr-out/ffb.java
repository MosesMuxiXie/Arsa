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

public class ffb
extends feu {
    public static final MapCodec<ffb> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.INT.fieldOf("max_water_depth").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, ffb::new));
    private final int c;

    private ffb(int $$0) {
        this.c = $$0;
    }

    public static ffb a(int $$0) {
        return new ffb($$0);
    }

    @Override
    protected boolean a(fet $$0, bgr $$1, is $$2) {
        int $$3 = $$0.a(euq.a.d, $$2.u(), $$2.w());
        int $$4 = $$0.a(euq.a.b, $$2.u(), $$2.w());
        return $$4 - $$3 <= this.c;
    }

    @Override
    public few<?> b() {
        return few.d;
    }
}

