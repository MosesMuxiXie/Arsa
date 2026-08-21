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

public class fbi
extends fbo {
    public static final MapCodec<fbi> a = RecordCodecBuilder.mapCodec($$0 -> fbi.b($$0).apply((Applicative)$$0, fbi::new));

    public fbi(cch $$0, cch $$1) {
        super($$0, $$1);
    }

    @Override
    protected fbp<?> a() {
        return fbp.d;
    }

    @Override
    protected void a(dwu $$0, fbo.b $$1, bgr $$2, fay $$3, int $$4, fbo.a $$5, int $$6, int $$7, int $$8) {
        boolean $$9 = $$5.c();
        is $$10 = $$5.a().b($$8);
        this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
        this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
        this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
    }

    @Override
    public int a(bgr $$0, int $$1, fay $$2) {
        return 0;
    }

    @Override
    protected boolean a(bgr $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        if ($$2 == 0) {
            return ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0;
        }
        return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
    }
}

