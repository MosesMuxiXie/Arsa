/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezk
extends exx<faz> {
    public ezk(Codec<faz> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faz> $$0) {
        is $$2;
        dxn $$1 = $$0.b();
        if (ezk.a((dwp)$$1, $$2 = $$0.e())) {
            return false;
        }
        bgr $$3 = $$0.d();
        faz $$4 = $$0.f();
        int $$5 = $$4.a();
        int $$6 = $$4.b();
        int $$7 = $$4.c();
        is.a $$8 = new is.a();
        for (int $$9 = 0; $$9 < $$5 * $$5; ++$$9) {
            $$8.g($$2).e(bgj.a($$3, -$$5, $$5), bgj.a($$3, -$$6, $$6), bgj.a($$3, -$$5, $$5));
            if (!ezk.a((dwp)$$1, $$8) || ezk.a((dwp)$$1, (is)$$8)) continue;
            int $$10 = bgj.a($$3, 1, $$7);
            if ($$3.a(6) == 0) {
                $$10 *= 2;
            }
            if ($$3.a(5) == 0) {
                $$10 = 1;
            }
            int $$11 = 17;
            int $$12 = 25;
            ezk.a($$1, $$3, $$8, $$10, 17, 25);
        }
        return true;
    }

    private static boolean a(dwp $$0, is.a $$1) {
        do {
            $$1.e(0, -1, 0);
            if (!$$0.y($$1)) continue;
            return false;
        } while ($$0.a_($$1).l());
        $$1.e(0, 1, 0);
        return true;
    }

    public static void a(dwp $$0, bgr $$1, is.a $$2, int $$3, int $$4, int $$5) {
        for (int $$6 = 1; $$6 <= $$3; ++$$6) {
            if ($$0.A($$2)) {
                if ($$6 == $$3 || !$$0.A($$2.d())) {
                    $$0.a((is)$$2, (eoh)dzs.pz.m().b(edl.e, bgj.a($$1, $$4, $$5)), 2);
                    break;
                }
                $$0.a((is)$$2, dzs.pA.m(), 2);
            }
            $$2.c(iz.b);
        }
    }

    private static boolean a(dwp $$0, is $$1) {
        if (!$$0.A($$1)) {
            return true;
        }
        eoh $$2 = $$0.a_($$1.e());
        return !$$2.a(dzs.ey) && !$$2.a(dzs.pl) && !$$2.a(dzs.pn);
    }
}

