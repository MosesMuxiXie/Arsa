/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fbj
extends fbo {
    public static final MapCodec<fbj> a = RecordCodecBuilder.mapCodec($$0 -> fbj.a($$0).apply((Applicative)$$0, fbj::new));
    protected final int b;

    protected static <P extends fbj> Products.P3<RecordCodecBuilder.Mu<P>, cch, cch, Integer> a(RecordCodecBuilder.Instance<P> $$02) {
        return fbj.b($$02).and((App)Codec.intRange((int)0, (int)16).fieldOf("height").forGetter($$0 -> $$0.b));
    }

    public fbj(cch $$0, cch $$1, int $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected fbp<?> a() {
        return fbp.a;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        for (int $$9 = $$8; $$9 >= $$8 - $$6; --$$9) {
            int $$10 = Math.max($$7 + $$5.b() - 1 - $$9 / 2, 0);
            this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
        }
    }

    @Override
    public int a(bgr $$0, int $$1, fay $$2) {
        return this.b;
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return $$1 == $$4 && $$3 == $$4 && ($$0.a(2) == 0 || $$2 == 0);
    }
}

