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

class ewe
extends ewi {
    private final jh<fla> e;
    public static final MapCodec<ewe> a = RecordCodecBuilder.mapCodec($$02 -> ewe.a($$02).and((App)js.a(mj.L).fieldOf("fluids").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, ewe::new));

    public ewe(jy $$0, jh<fla> $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    protected boolean a(eoh $$0) {
        return $$0.y().a(this.e);
    }

    @Override
    public evy<?> a() {
        return evy.c;
    }
}

