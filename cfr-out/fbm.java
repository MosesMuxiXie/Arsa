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

public class fbm
extends fbo {
    public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec($$0 -> fbm.b($$0).apply((Applicative)$$0, fbm::new));

    public fbm(cch $$0, cch $$1) {
        super($$0, $$1);
    }

    @Override
    protected fbp<?> a() {
        return fbp.i;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        is $$9 = $$5.a().b($$8);
        boolean $$10 = $$5.c();
        if ($$10) {
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, -1, $$10);
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 3, 0, $$10);
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, 1, $$10);
            if ($$2.h()) {
                this.a($$0, $$1, $$2, $$3, $$9, $$7, 2, $$10);
            }
        } else {
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 2, -1, $$10);
            this.a($$0, $$1, $$2, $$3, $$9, $$7 + 1, 0, $$10);
        }
    }

    @Override
    public int a(bgr $$0, int $$1, fay $$2) {
        return 4;
    }

    @Override
    protected boolean b(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if (!($$2 != 0 || !$$5 || $$1 != -$$4 && $$1 < $$4 || $$3 != -$$4 && $$3 < $$4)) {
            return true;
        }
        return super.b($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if ($$2 == -1 && !$$5) {
            return $$1 == $$4 && $$3 == $$4;
        }
        if ($$2 == 1) {
            return $$1 + $$3 > $$4 * 2 - 2;
        }
        return false;
    }
}

