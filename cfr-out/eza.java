/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class eza
extends exx<fak> {
    private static final int a = 7;

    eza(Codec<fak> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fak> $$0) {
        dxn $$1 = $$0.b();
        bgr $$2 = $$0.d();
        fak $$3 = $$0.f();
        is $$4 = $$0.e();
        int $$5 = $$2.a($$3.c + 1);
        is.a $$6 = new is.a();
        block0: for (int $$7 = 0; $$7 < $$5; ++$$7) {
            this.a($$6, $$2, $$4, Math.min($$7, 7));
            eoh $$8 = $$1.a_($$6);
            for (fak.a $$9 : $$3.b) {
                if (!eys.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) continue;
                $$1.a((is)$$6, $$9.c, 2);
                continue block0;
            }
        }
        return true;
    }

    private void a(is.a $$0, bgr $$1, is $$2, int $$3) {
        int $$4 = this.a($$1, $$3);
        int $$5 = this.a($$1, $$3);
        int $$6 = this.a($$1, $$3);
        $$0.a($$2, $$4, $$5, $$6);
    }

    private int a(bgr $$0, int $$1) {
        return Math.round(($$0.i() - $$0.i()) * (float)$$1);
    }
}

