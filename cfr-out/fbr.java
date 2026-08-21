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

public class fbr
extends fbo {
    public static final MapCodec<fbr> a = RecordCodecBuilder.mapCodec($$02 -> fbr.b($$02).and((App)cch.b(0, 24).fieldOf("crown_height").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fbr::new));
    private final cch b;

    public fbr(cch $$0, cch $$1, cch $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected fbp<?> a() {
        return fbp.h;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        is $$9 = $$5.a();
        int $$10 = 0;
        for (int $$11 = $$9.v() - $$6 + $$8; $$11 <= $$9.v() + $$8; ++$$11) {
            int $$15;
            int $$12 = $$9.v() - $$11;
            int $$13 = $$7 + $$5.b() + bgj.b((float)$$12 / (float)$$6 * 3.5f);
            if ($$12 > 0 && $$13 == $$10 && ($$11 & 1) == 0) {
                int $$14 = $$13 + 1;
            } else {
                $$15 = $$13;
            }
            this.a($$0, $$1, $$2, $$3, new is($$9.u(), $$11, $$9.w()), $$15, 0, $$5.c());
            $$10 = $$13;
        }
    }

    @Override
    public int a(bgr $$0, int $$1, fay $$2) {
        return this.b.a($$0);
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if ($$1 + $$3 >= 7) {
            return true;
        }
        return $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
    }
}

