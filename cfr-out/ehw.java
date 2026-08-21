/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class ehw
extends ehp {
    protected ehw(eog.d $$0) {
        super($$0);
    }

    private static boolean b(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.d();
        eoh $$4 = $$1.a_($$3);
        if ($$4.a(dzs.ep) && $$4.c(eho.c) == 1) {
            return true;
        }
        if ($$4.y().e() == 8) {
            return false;
        }
        int $$5 = fks.a($$0, $$4, iz.b, $$4.g());
        return $$5 < 15;
    }

    protected abstract MapCodec<? extends ehw> a();

    private static boolean c(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.d();
        return ehw.b($$0, $$1, $$2) && !$$1.b_($$3).a(bdv.a);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!ehw.b($$0, (dwr)$$1, $$2)) {
            $$1.c($$2, dzs.j.m());
            return;
        }
        if ($$1.G($$2.d()) >= 9) {
            eoh $$4 = this.m();
            for (int $$5 = 0; $$5 < 4; ++$$5) {
                is $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
                if (!$$1.a_($$6).a(dzs.j) || !ehw.c($$4, $$1, $$6)) continue;
                $$1.c($$6, (eoh)$$4.b(c, ehw.p($$1.a_($$6.d()))));
            }
        }
    }
}

