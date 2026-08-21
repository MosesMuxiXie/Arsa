/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class hxp {
    public static final amo a = amo.b("textures/misc/enchanted_glint_armor.png");
    public static final amo b = amo.b("textures/misc/enchanted_glint_item.png");
    public static final float c = 0.5f;
    public static final float d = 0.75f;
    public static final float e = 0.0078125f;
    public static final int f = -1;

    public static void a(dlr $$0, fzm $$1, hon $$2, int $$3, int $$4, int[] $$5, List<hqa> $$6, ijs $$7, ihm.a $$8) {
        fzp $$11;
        if ($$8 == ihm.a.c) {
            fzm.a $$9 = $$1.c().d();
            if ($$0 == dlr.g) {
                e.a($$9.a(), 0.5f);
            } else if ($$0.b()) {
                e.a($$9.a(), 0.75f);
            }
            fzp $$10 = hxp.a($$2, $$7, $$9);
        } else {
            $$11 = hxp.a($$2, $$7, true, $$8 != ihm.a.a);
        }
        hxp.a($$1, $$11, $$6, $$5, $$3, $$4);
    }

    private static fzp a(hon $$0, ijs $$1, fzm.a $$2) {
        return fzq.a((fzp)new fzn($$0.a(hxp.a($$1) ? ijt.g() : ijt.h()), $$2, 0.0078125f), $$0.a($$1));
    }

    public static fzp a(hon $$0, ijs $$1, boolean $$2, boolean $$3) {
        if ($$3) {
            if (hxp.a($$1)) {
                return fzq.a($$0.a(ijt.g()), $$0.a($$1));
            }
            return fzq.a($$0.a($$2 ? ijt.h() : ijt.i()), $$0.a($$1));
        }
        return $$0.a($$1);
    }

    public static List<ijs> a(ijs $$0, boolean $$1, boolean $$2) {
        if ($$2) {
            if (hxp.a($$0)) {
                return List.of($$0, ijt.g());
            }
            return List.of($$0, $$1 ? ijt.h() : ijt.i());
        }
        return List.of($$0);
    }

    private static boolean a(ijs $$0) {
        return gfj.T() && ($$0 == hpj.j() || $$0 == hpj.k());
    }

    private static int a(int[] $$0, int $$1) {
        if ($$1 < 0 || $$1 >= $$0.length) {
            return -1;
        }
        return $$0[$$1];
    }

    private static void a(fzm $$0, fzp $$1, List<hqa> $$2, int[] $$3, int $$4, int $$5) {
        fzm.a $$6 = $$0.c();
        for (hqa $$7 : $$2) {
            float $$16;
            float $$15;
            float $$14;
            float $$13;
            if ($$7.a()) {
                int $$8 = hxp.a($$3, $$7.j());
                float $$9 = (float)bel.b($$8) / 255.0f;
                float $$10 = (float)bel.c($$8) / 255.0f;
                float $$11 = (float)bel.d($$8) / 255.0f;
                float $$12 = (float)bel.e($$8) / 255.0f;
            } else {
                $$13 = 1.0f;
                $$14 = 1.0f;
                $$15 = 1.0f;
                $$16 = 1.0f;
            }
            $$1.a($$6, $$7, $$14, $$15, $$16, $$13, $$4, $$5);
        }
    }
}

