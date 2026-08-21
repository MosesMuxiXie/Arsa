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
import java.util.List;

public class fcr
extends fcy {
    public static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.b)), (App)fcd.a.fieldOf("block_provider").forGetter($$0 -> $$0.c), (App)bfm.b(iz.g.listOf()).fieldOf("directions").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fcr::new));
    private final float b;
    private final fcd c;
    private final List<iz> d;

    public fcr(float $$0, fcd $$1, List<iz> $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public void a(fcy.a $$0) {
        bgr $$1 = $$0.b();
        for (is $$2 : bhs.a($$0.c(), $$1)) {
            iz $$3 = bhs.a(this.d, $$1);
            is $$4 = $$2.a($$3);
            if (!($$1.i() <= this.b) || !$$0.a($$4)) continue;
            $$0.a($$4, this.c.a($$1, $$4));
        }
    }

    @Override
    protected fcz<?> a() {
        return fcz.j;
    }
}

