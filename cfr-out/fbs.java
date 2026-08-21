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

public class fbs
extends fbo {
    public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec($$02 -> fbs.b($$02).and((App)cch.b(0, 24).fieldOf("height").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fbs::new));
    private final cch b;

    public fbs(cch $$0, cch $$1, cch $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected fbp<?> a() {
        return fbp.c;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        int $$9 = 0;
        for (int $$10 = $$8; $$10 >= $$8 - $$6; --$$10) {
            this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
            if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
                --$$9;
                continue;
            }
            if ($$9 >= $$7 + $$5.b()) continue;
            ++$$9;
        }
    }

    @Override
    public int a(bgr $$0, int $$1) {
        return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
    }

    @Override
    public int a(bgr $$0, int $$1, fay $$2) {
        return this.b.a($$0);
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
    }
}

