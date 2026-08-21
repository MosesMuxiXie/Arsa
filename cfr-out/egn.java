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

public class egn
extends eaz {
    public static final MapCodec<egn> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bex.a.fieldOf("falling_dust_color").forGetter($$0 -> $$0.b), egn.x()).apply((Applicative)$$02, egn::new));

    public MapCodec<egn> a() {
        return c;
    }

    public egn(bex $$0, eog.d $$1) {
        super($$0, $$1);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        super.a($$0, $$1, $$2, $$3);
        eoe.a($$1, $$2, $$3);
    }
}

