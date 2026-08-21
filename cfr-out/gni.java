/*
 * Decompiled with CFR 0.152.
 */
public class gni
implements gnf {
    private static final amo e = amo.b("hud/locator_bar_background");
    private static final amo f = amo.b("hud/locator_bar_arrow_up");
    private static final amo g = amo.b("hud/locator_bar_arrow_down");
    private static final int h = 9;
    private static final int i = 60;
    private static final int j = 7;
    private static final int k = 5;
    private static final int l = 1;
    private static final int m = 1;
    private final gfj n;

    public gni(gfj $$0) {
        this.n = $$0;
    }

    @Override
    public void a(gir $$0, gez $$1) {
        $$0.a(hpa.at, e, this.a(this.n.aR()), this.b(this.n.aR()), 182, 5);
    }

    @Override
    public void b(gir $$0, gez $$1) {
        int $$22 = this.b(this.n.aR());
        cgk $$3 = this.n.au();
        if ($$3 == null) {
            return;
        }
        dwo $$4 = $$3.ao();
        cdo $$52 = $$4.y();
        fvq $$6 = $$2 -> $$1.a(!$$52.a($$2));
        this.n.s.b.I().a($$3, (fvr $$5) -> {
            if ($$5.a().left().map($$1 -> $$1.equals($$3.cY())).orElse(false).booleanValue()) {
                return;
            }
            double $$6 = $$5.a($$4, this.n.i.p(), $$6);
            if ($$6 <= -60.0 || $$6 > 60.0) {
                return;
            }
            int $$7 = bgj.d((float)($$0.a() - 9) / 2.0f);
            fvt.a $$8 = $$5.b();
            imq $$9 = this.n.aN().a($$8.d);
            float $$10 = bgj.a((float)$$5.a($$3));
            amo $$11 = $$9.a($$10);
            int $$122 = $$8.e.orElseGet(() -> (Integer)$$5.a().map($$0 -> bel.c(bel.f(255, $$0.hashCode()), 0.9f), $$0 -> bel.c(bel.f(255, $$0.hashCode()), 0.9f)));
            int $$13 = bgj.c($$6 * 173.0 / 2.0 / 60.0);
            $$0.a(hpa.at, $$11, $$7 + $$13, $$22 - 2, 9, 9, $$122);
            fvr.e $$14 = $$5.a($$4, this.n.i, $$6);
            if ($$14 != fvr.e.a) {
                amo $$18;
                int $$17;
                if ($$14 == fvr.e.c) {
                    int $$15 = 6;
                    amo $$16 = g;
                } else {
                    $$17 = -6;
                    $$18 = f;
                }
                $$0.a(hpa.at, $$18, $$7 + $$13 + 1, $$22 + $$17, 7, 5);
            }
        });
    }
}

