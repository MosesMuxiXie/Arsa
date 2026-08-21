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

class ewg
extends ewi {
    public static final MapCodec<ewg> a = RecordCodecBuilder.mapCodec($$0 -> ewg.a($$0).apply((Applicative)$$0, ewg::new));

    public ewg(jy $$0) {
        super($$0);
    }

    @Override
    protected boolean a(eoh $$0) {
        return $$0.v();
    }

    @Override
    public evy<?> a() {
        return evy.f;
    }
}

