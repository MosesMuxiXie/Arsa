/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public class eyp
extends exx<fah> {
    public eyp(Codec<fah> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fah> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        bgr $$3 = $$0.d();
        fah $$4 = $$0.f();
        if (!eyp.c($$1.a_($$2))) {
            return false;
        }
        List<iz> $$5 = $$4.a($$3);
        if (eyp.a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
        }
        is.a $$6 = $$2.k();
        block0: for (iz $$7 : $$5) {
            $$6.g($$2);
            List<iz> $$8 = $$4.a($$3, $$7.g());
            for (int $$9 = 0; $$9 < $$4.c; ++$$9) {
                $$6.a((jy)$$2, $$7);
                eoh $$10 = $$1.a_($$6);
                if (!eyp.c($$10) && !$$10.a($$4.b)) continue block0;
                if (!eyp.a($$1, $$6, $$10, $$4, $$3, $$8)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean a(dxn $$0, is $$1, eoh $$2, fah $$3, bgr $$4, List<iz> $$5) {
        is.a $$6 = $$1.k();
        for (iz $$7 : $$5) {
            eoh $$8 = $$0.a_($$6.a((jy)$$1, $$7));
            if (!$$8.a($$3.h)) continue;
            eoh $$9 = $$3.b.c($$2, (dvt)$$0, $$1, $$7);
            if ($$9 == null) {
                return false;
            }
            $$0.a($$1, $$9, 3);
            $$0.E($$1).e($$1);
            if ($$4.i() < $$3.g) {
                $$3.b.c().a($$9, (dwp)$$0, $$1, $$7, $$4, true);
            }
            return true;
        }
        return false;
    }

    private static boolean c(eoh $$0) {
        return $$0.l() || $$0.a(dzs.J);
    }
}

