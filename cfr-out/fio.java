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

public class fio
extends fjd {
    public static final MapCodec<fio> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.FLOAT.fieldOf("min_chance").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.FLOAT.fieldOf("max_chance").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.d)), (App)Codec.INT.fieldOf("min_dist").orElse((Object)0).forGetter($$0 -> $$0.e), (App)Codec.INT.fieldOf("max_dist").orElse((Object)0).forGetter($$0 -> $$0.f), (App)iz.a.e.fieldOf("axis").orElse((Object)iz.a.b).forGetter($$0 -> $$0.g)).apply((Applicative)$$02, fio::new));
    private final float b;
    private final float d;
    private final int e;
    private final int f;
    private final iz.a g;

    public fio(float $$0, float $$1, int $$2, int $$3, iz.a $$4) {
        if ($$2 >= $$3) {
            throw new IllegalArgumentException("Invalid range: [" + $$2 + "," + $$3 + "]");
        }
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    @Override
    public boolean a(is $$0, is $$1, is $$2, bgr $$3) {
        iz $$4 = iz.a(iz.b.a, this.g);
        float $$5 = Math.abs(($$1.u() - $$2.u()) * $$4.j());
        float $$6 = Math.abs(($$1.v() - $$2.v()) * $$4.k());
        float $$7 = Math.abs(($$1.w() - $$2.w()) * $$4.l());
        int $$8 = (int)($$5 + $$6 + $$7);
        float $$9 = $$3.i();
        return $$9 <= bgj.b(bgj.f($$8, this.e, this.f), this.b, this.d);
    }

    @Override
    protected fje<?> a() {
        return fje.c;
    }
}

