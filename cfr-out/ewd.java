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

class ewd
extends ewi {
    private final jh<dzq> e;
    public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec($$02 -> ewd.a($$02).and((App)js.a(mj.i).fieldOf("blocks").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, ewd::new));

    public ewd(jy $$0, jh<dzq> $$1) {
        super($$0);
        this.e = $$1;
    }

    @Override
    protected boolean a(eoh $$0) {
        return $$0.a(this.e);
    }

    @Override
    public evy<?> a() {
        return evy.a;
    }
}

