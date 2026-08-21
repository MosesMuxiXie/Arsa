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

public class eki
extends dze {
    public static final MapCodec<eki> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.intRange((int)1, (int)1024).fieldOf("max_weight").forGetter($$0 -> $$0.e), (App)eow.a.fieldOf("block_set_type").forGetter($$0 -> $$0.b), eki.x()).apply((Applicative)$$02, eki::new));
    public static final eph d = eox.aX;
    private final int e;

    public MapCodec<eki> a() {
        return c;
    }

    protected eki(int $$0, eow $$1, eog.d $$2) {
        super($$2, $$1);
        this.l((eoh)((eoh)this.C.b()).b(d, 0));
        this.e = $$0;
    }

    @Override
    protected int b(dwo $$0, is $$1) {
        int $$2 = Math.min(eki.a($$0, a.a($$1), cgk.class), this.e);
        if ($$2 > 0) {
            float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
            return bgj.d($$3 * 15.0f);
        }
        return 0;
    }

    @Override
    protected int h(eoh $$0) {
        return $$0.c(d);
    }

    @Override
    protected eoh a(eoh $$0, int $$1) {
        return (eoh)$$0.b(d, $$1);
    }

    @Override
    protected int b() {
        return 10;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{d});
    }
}

