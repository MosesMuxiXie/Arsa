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

public class fbu
extends fbo {
    public static final MapCodec<fbu> a = RecordCodecBuilder.mapCodec($$02 -> fbu.b($$02).and((App)cch.b(0, 24).fieldOf("trunk_height").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fbu::new));
    private final cch b;

    public fbu(cch $$0, cch $$1, cch $$2) {
        super($$0, $$1);
        this.b = $$2;
    }

    @Override
    protected fbp<?> a() {
        return fbp.b;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        is $$9 = $$5.a();
        int $$10 = $$2.a(2);
        int $$11 = 1;
        int $$12 = 0;
        for (int $$13 = $$8; $$13 >= -$$6; --$$13) {
            this.a($$0, $$1, $$2, $$3, $$9, $$10, $$13, $$5.c());
            if ($$10 >= $$11) {
                $$10 = $$12;
                $$12 = 1;
                $$11 = Math.min($$11 + 1, $$7 + $$5.b());
                continue;
            }
            ++$$10;
        }
    }

    @Override
    public int a(bgr $$0, int $$1, fay $$2) {
        return Math.max(4, $$1 - this.b.a($$0));
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
    }
}

