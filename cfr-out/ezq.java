/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezq
extends exx<faj> {
    private static final iz[] a = iz.values();

    public ezq(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        bgr $$3 = $$0.d();
        if (!$$1.A($$2)) {
            return false;
        }
        eoh $$4 = $$1.a_($$2.d());
        if (!$$4.a(dzs.ey) && !$$4.a(dzs.lG)) {
            return false;
        }
        this.a($$1, $$3, $$2);
        this.b($$1, $$3, $$2);
        return true;
    }

    private void a(dwp $$0, bgr $$1, is $$2) {
        $$0.a($$2, dzs.lG.m(), 2);
        is.a $$3 = new is.a();
        is.a $$4 = new is.a();
        for (int $$5 = 0; $$5 < 200; ++$$5) {
            $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
            if (!$$0.A($$3)) continue;
            int $$6 = 0;
            for (iz $$7 : a) {
                eoh $$8 = $$0.a_($$4.a((jy)$$3, $$7));
                if ($$8.a(dzs.ey) || $$8.a(dzs.lG)) {
                    ++$$6;
                }
                if ($$6 > 1) break;
            }
            if ($$6 != true) continue;
            $$0.a((is)$$3, dzs.lG.m(), 2);
        }
    }

    private void b(dwp $$0, bgr $$1, is $$2) {
        is.a $$3 = new is.a();
        for (int $$4 = 0; $$4 < 100; ++$$4) {
            eoh $$5;
            $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
            if (!$$0.A($$3) || !($$5 = $$0.a_($$3.d())).a(dzs.ey) && !$$5.a(dzs.lG)) continue;
            int $$6 = bgj.a($$1, 1, 8);
            if ($$1.a(6) == 0) {
                $$6 *= 2;
            }
            if ($$1.a(5) == 0) {
                $$6 = 1;
            }
            int $$7 = 17;
            int $$8 = 25;
            ezq.a($$0, $$1, $$3, $$6, 17, 25);
        }
    }

    public static void a(dwp $$0, bgr $$1, is.a $$2, int $$3, int $$4, int $$5) {
        for (int $$6 = 0; $$6 <= $$3; ++$$6) {
            if ($$0.A($$2)) {
                if ($$6 == $$3 || !$$0.A($$2.e())) {
                    $$0.a((is)$$2, (eoh)dzs.px.m().b(edl.e, bgj.a($$1, $$4, $$5)), 2);
                    break;
                }
                $$0.a((is)$$2, dzs.py.m(), 2);
            }
            $$2.c(iz.a);
        }
    }
}

