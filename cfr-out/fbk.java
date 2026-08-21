/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fbk
extends fbj {
    public static final MapCodec<fbk> c = RecordCodecBuilder.mapCodec($$0 -> fbk.a($$0).apply((Applicative)$$0, fbk::new));

    public fbk(cch $$0, cch $$1, int $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected fbp<?> a() {
        return fbp.e;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        for (int $$9 = $$8; $$9 >= $$8 - $$6; --$$9) {
            int $$10 = $$7 + $$5.b() - 1 - $$9;
            this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
        }
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
    }
}

