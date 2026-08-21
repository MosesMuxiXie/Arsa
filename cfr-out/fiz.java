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

public class fiz
extends fjd {
    public static final MapCodec<fiz> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("min_chance").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("max_chance").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.d)), (App)Codec.INT.fieldOf("min_dist").orElse((Object)0).forGetter($$0 -> $$0.e), (App)Codec.INT.fieldOf("max_dist").orElse((Object)0).forGetter($$0 -> $$0.f)).apply((Applicative)$$02, fiz::new));
    private final float b;
    private final float d;
    private final int e;
    private final int f;

    public fiz(float $$0, float $$1, int $$2, int $$3) {
        if ($$2 >= $$3) {
            throw new IllegalArgumentException("Invalid range: [" + $$2 + "," + $$3 + "]");
        }
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    @Override
    public boolean a(is $$0, is $$1, is $$2, bgr $$3) {
        int $$4 = $$1.k($$2);
        float $$5 = $$3.i();
        return $$5 <= bgj.b(bgj.f($$4, this.e, this.f), this.b, this.d);
    }

    @Override
    protected fje<?> a() {
        return fje.b;
    }
}

