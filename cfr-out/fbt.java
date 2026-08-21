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

public class fbt
extends fbo {
    public static final MapCodec<fbt> a = RecordCodecBuilder.mapCodec($$02 -> fbt.b($$02).and($$02.group((App)cch.b(1, 512).fieldOf("foliage_height").forGetter($$0 -> $$0.b), (App)Codec.intRange((int)0, (int)256).fieldOf("leaf_placement_attempts").forGetter($$0 -> $$0.c))).apply((Applicative)$$02, fbt::new));
    private final cch b;
    private final int c;

    public fbt(cch $$0, cch $$1, cch $$2, int $$3) {
        super($$0, $$1);
        this.b = $$2;
        this.c = $$3;
    }

    @Override
    protected fbp<?> a() {
        return fbp.j;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        is $$9 = $$5.a();
        is.a $$10 = $$9.k();
        for (int $$11 = 0; $$11 < this.c; ++$$11) {
            $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
            fbt.a($$0, $$1, $$2, $$3, $$10);
        }
    }

    @Override
    public int a(bgr $$0, int $$1, fay $$2) {
        return this.b.a($$0);
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return false;
    }
}

