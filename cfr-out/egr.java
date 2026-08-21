/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class egr
extends ece
implements egq {
    public static final MapCodec<egr> b = egr.b(egr::new);

    public MapCodec<egr> a() {
        return b;
    }

    public egr(eog.d $$0) {
        super(cce.a(1), $$0);
    }

    @Override
    public int a(egv.a $$0, dwp $$1, is $$2, bgr $$3, egv $$4, boolean $$5) {
        int $$6 = $$0.b();
        if ($$6 == 0 || $$3.a($$4.f()) != 0) {
            return $$6;
        }
        is $$7 = $$0.a();
        boolean $$8 = $$7.a($$2, (double)$$4.e());
        if ($$8 || !egr.a($$1, $$7)) {
            if ($$3.a($$4.g()) != 0) {
                return $$6;
            }
            return $$6 - ($$8 ? 1 : egr.a($$4, $$7, $$2, $$6));
        }
        int $$9 = $$4.d();
        if ($$3.a($$9) < $$6) {
            is $$10 = $$7.d();
            eoh $$11 = this.a($$1, $$10, $$3, $$4.h());
            $$1.a($$10, $$11, 3);
            $$1.a(null, $$7, $$11.A().e(), bdb.e, 1.0f, 1.0f);
        }
        return Math.max(0, $$6 - $$9);
    }

    private static int a(egv $$0, is $$1, is $$2, int $$3) {
        int $$4 = $$0.e();
        float $$5 = bgj.j((float)Math.sqrt($$1.j($$2)) - (float)$$4);
        int $$6 = bgj.i(24 - $$4);
        float $$7 = Math.min(1.0f, $$5 / (float)$$6);
        return Math.max(1, (int)((float)$$3 * $$7 * 0.5f));
    }

    private eoh a(dwp $$0, is $$1, bgr $$2, boolean $$3) {
        eoh $$5;
        if ($$2.a(11) == 0) {
            eoh $$4 = (eoh)dzs.rV.m().b(egu.d, $$3);
        } else {
            $$5 = dzs.rQ.m();
        }
        if ($$5.b(eox.I) && !$$0.b_($$1).c()) {
            return (eoh)$$5.b(eox.I, true);
        }
        return $$5;
    }

    private static boolean a(dwp $$0, is $$1) {
        eoh $$2 = $$0.a_($$1.d());
        if (!($$2.l() || $$2.a(dzs.J) && $$2.y().b(flc.c))) {
            return false;
        }
        int $$3 = 0;
        for (is $$4 : is.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            eoh $$5 = $$0.a_($$4);
            if ($$5.a(dzs.rQ) || $$5.a(dzs.rV)) {
                ++$$3;
            }
            if ($$3 <= 2) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean d() {
        return false;
    }
}

