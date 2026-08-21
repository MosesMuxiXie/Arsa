/*
 * Decompiled with CFR 0.152.
 */
public class evc
implements dwb {
    private int a;

    @Override
    public void a(axf $$0, boolean $$1) {
        if (!$$1) {
            return;
        }
        if (!$$0.U().a(eua.Y).booleanValue()) {
            return;
        }
        bgr $$2 = $$0.y;
        --this.a;
        if (this.a > 0) {
            return;
        }
        this.a += (60 + $$2.a(60)) * 20;
        if ($$0.E_() < 5 && $$0.F_().e()) {
            return;
        }
        for (axg $$3 : $$0.E()) {
            flb $$11;
            eoh $$10;
            is $$9;
            cda $$5;
            if ($$3.au()) continue;
            is $$4 = $$3.dK();
            if ($$0.F_().e() && ($$4.v() < $$0.V() || !$$0.k($$4)) || !($$5 = $$0.c($$4)).a($$2.i() * 3.0f)) continue;
            bdg $$6 = $$3.K();
            int $$7 = bgj.a($$6.a(bdk.i.b(bdk.n)), 1, Integer.MAX_VALUE);
            int $$8 = 24000;
            if ($$2.a($$7) < 72000 || !dwz.a($$0, $$9 = $$4.b(20 + $$2.a(15)).g(-10 + $$2.a(21)).e(-10 + $$2.a(21)), $$10 = $$0.a_($$9), $$11 = $$0.b_($$9), cgu.aX)) continue;
            cie $$12 = null;
            int $$13 = 1 + $$2.a($$5.a().a() + 1);
            for (int $$14 = 0; $$14 < $$13; ++$$14) {
                dab $$15 = cgu.aX.a($$0, cgt.a);
                if ($$15 == null) continue;
                $$15.a($$9, 0.0f, 0.0f);
                $$12 = $$15.a((dxf)$$0, $$5, cgt.a, $$12);
                $$0.a_($$15);
            }
        }
    }
}

