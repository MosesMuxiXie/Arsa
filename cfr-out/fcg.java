/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class fcg
extends fcd {
    protected final long c;
    protected final fke.a d;
    protected final float e;
    protected final fke f;

    protected static <P extends fcg> Products.P3<RecordCodecBuilder.Mu<P>, Long, fke.a, Float> a(RecordCodecBuilder.Instance<P> $$02) {
        return $$02.group((App)Codec.LONG.fieldOf("seed").forGetter($$0 -> $$0.c), (App)fke.a.a.fieldOf("noise").forGetter($$0 -> $$0.d), (App)bfm.v.fieldOf("scale").forGetter($$0 -> Float.valueOf($$0.e)));
    }

    protected fcg(long $$0, fke.a $$1, float $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = fke.b(new evp(new eur($$0)), $$1);
    }

    protected double a(is $$0, double $$1) {
        return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
    }
}

