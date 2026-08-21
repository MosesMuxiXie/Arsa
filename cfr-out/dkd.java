/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dkd
extends dlp {
    public static final int a = 3;
    public static final int b = 1;
    public static final int c = 3;

    public dkd(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        is $$3 = $$2.a($$0.k());
        dlt $$4 = $$0.n();
        if (dkd.a($$4, $$1, $$2)) {
            if (!$$1.B_()) {
                $$4.a((cgk)$$0.o(), etk.C);
                $$1.c(1505, $$2, 15);
            }
            return cdc.a;
        }
        eoh $$5 = $$1.a_($$2);
        boolean $$6 = $$5.c((dvt)$$1, $$2, $$0.k());
        if ($$6 && dkd.a($$4, $$1, $$3, $$0.k())) {
            if (!$$1.B_()) {
                $$4.a((cgk)$$0.o(), etk.C);
                $$1.c(1505, $$3, 15);
            }
            return cdc.a;
        }
        return cdc.e;
    }

    public static boolean a(dlt $$0, dwo $$1, is $$2) {
        dzt $$4;
        eoh $$3 = $$1.a_($$2);
        dzq dzq2 = $$3.b();
        if (dzq2 instanceof dzt && ($$4 = (dzt)((Object)dzq2)).a($$1, $$2, $$3)) {
            if ($$1 instanceof axf) {
                if ($$4.a($$1, $$1.y, $$2, $$3)) {
                    $$4.a((axf)$$1, $$1.y, $$2, $$3);
                }
                $$0.h(1);
            }
            return true;
        }
        return false;
    }

    public static boolean a(dlt $$02, dwo $$1, is $$2, @Nullable iz $$3) {
        if (!$$1.a_($$2).a(dzs.J) || $$1.b_($$2).e() != 8) {
            return false;
        }
        if (!($$1 instanceof axf)) {
            return true;
        }
        bgr $$4 = $$1.G_();
        block0: for (int $$5 = 0; $$5 < 128; ++$$5) {
            is $$6 = $$2;
            eoh $$7 = dzs.bG.m();
            for (int $$8 = 0; $$8 < $$5 / 16; ++$$8) {
                if ($$1.a_($$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1)).m($$1, $$6)) continue block0;
            }
            jd<dxo> $$9 = $$1.z($$6);
            if ($$9.a(bdo.aa)) {
                if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                    $$7 = mi.e.a(bdp.aH, $$1.y).map($$0 -> ((dzq)$$0.a()).m()).orElse($$7);
                    if ($$7.b(dzb.d)) {
                        $$7 = (eoh)$$7.b(dzb.d, $$3);
                    }
                } else if ($$4.a(4) == 0) {
                    $$7 = mi.e.a(bdp.aF, $$1.y).map($$0 -> ((dzq)$$0.a()).m()).orElse($$7);
                }
            }
            if ($$7.a(bdp.aH, (eog.a $$0) -> $$0.b(dzb.d))) {
                for (int $$10 = 0; !$$7.a((dwr)$$1, $$6) && $$10 < 4; ++$$10) {
                    $$7 = (eoh)$$7.b(dzb.d, iz.c.a.a($$4));
                }
            }
            if (!$$7.a((dwr)$$1, $$6)) continue;
            eoh $$11 = $$1.a_($$6);
            if ($$11.a(dzs.J) && $$1.b_($$6).e() == 8) {
                $$1.a($$6, $$7, 3);
                continue;
            }
            if (!$$11.a(dzs.bG) || !((dzt)((Object)dzs.bG)).a($$1, $$6, $$11) || $$4.a(10) != 0) continue;
            ((dzt)((Object)dzs.bG)).a((axf)$$1, $$4, $$6, $$11);
        }
        $$02.h(1);
        return true;
    }

    public static void a(dwp $$0, is $$1, int $$2) {
        eoh $$3 = $$0.a_($$1);
        dzq dzq2 = $$3.b();
        if (dzq2 instanceof dzt) {
            dzt $$4 = (dzt)((Object)dzq2);
            is $$5 = $$4.a($$1);
            switch ($$4.as_()) {
                case a: {
                    bgm.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ly.R);
                    break;
                }
                case b: {
                    bgm.a($$0, $$5, $$2, (lw)ly.R);
                }
            }
        } else if ($$3.a(dzs.J)) {
            bgm.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ly.R);
        }
    }
}

