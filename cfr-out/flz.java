/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Optional;

public class flz {
    public static final int a = 3;
    private static final int b = 16;
    private static final int c = 128;
    private static final int d = 5;
    private static final int e = 4;
    private static final int f = 3;
    private static final int g = -1;
    private static final int h = 4;
    private static final int i = -1;
    private static final int j = 3;
    private static final int k = -1;
    private static final int l = 2;
    private static final int m = -1;
    private final axf n;

    public flz(axf $$0) {
        this.n = $$0;
    }

    public Optional<is> a(is $$02, boolean $$12, eqa $$2) {
        csx $$3 = this.n.F();
        int $$4 = $$12 ? 16 : 128;
        $$3.a(this.n, $$02, $$4);
        return $$3.b($$0 -> $$0.a(ctb.r), $$02, $$4, csx.b.c).map(csy::g).filter($$2::a).filter($$0 -> this.n.a_((is)$$0).b(eox.J)).min(Comparator.comparingDouble($$1 -> $$1.j($$02)).thenComparingInt(jy::v));
    }

    public Optional<ber.a> a(is $$0, iz.a $$1) {
        iz $$2 = iz.a(iz.b.a, $$1);
        double $$3 = -1.0;
        is $$4 = null;
        double $$5 = -1.0;
        is $$6 = null;
        eqa $$7 = this.n.w();
        int $$8 = Math.min(this.n.aw(), this.n.K_() + this.n.o() - 1);
        boolean $$9 = true;
        is.a $$10 = $$0.k();
        for (is.a $$11 : is.a($$0, 16, iz.f, iz.d)) {
            int $$12 = Math.min($$8, this.n.a(euq.a.e, $$11.u(), $$11.w()));
            if (!$$7.a($$11) || !$$7.a($$11.c($$2, 1))) continue;
            $$11.c($$2.g(), 1);
            for (int $$13 = $$12; $$13 >= this.n.K_(); --$$13) {
                int $$15;
                $$11.q($$13);
                if (!this.a($$11)) continue;
                int $$14 = $$13;
                while ($$13 > this.n.K_() && this.a($$11.c(iz.a))) {
                    --$$13;
                }
                if ($$13 + 4 > $$8 || ($$15 = $$14 - $$13) > 0 && $$15 < 3) continue;
                $$11.q($$13);
                if (!this.a($$11, $$10, $$2, 0)) continue;
                double $$16 = $$0.j($$11);
                if (this.a($$11, $$10, $$2, -1) && this.a($$11, $$10, $$2, 1) && ($$3 == -1.0 || $$3 > $$16)) {
                    $$3 = $$16;
                    $$4 = $$11.j();
                }
                if ($$3 != -1.0 || $$5 != -1.0 && !($$5 > $$16)) continue;
                $$5 = $$16;
                $$6 = $$11.j();
            }
        }
        if ($$3 == -1.0 && $$5 != -1.0) {
            $$4 = $$6;
            $$3 = $$5;
        }
        if ($$3 == -1.0) {
            int $$18 = $$8 - 9;
            int $$17 = Math.max(this.n.K_() - -1, 70);
            if ($$18 < $$17) {
                return Optional.empty();
            }
            $$4 = new is($$0.u() - $$2.j() * 1, bgj.a($$0.v(), $$17, $$18), $$0.w() - $$2.l() * 1).j();
            $$4 = $$7.b($$4);
            iz $$19 = $$2.h();
            for (int $$20 = -1; $$20 < 2; ++$$20) {
                for (int $$21 = 0; $$21 < 2; ++$$21) {
                    for (int $$22 = -1; $$22 < 3; ++$$22) {
                        eoh $$23 = $$22 < 0 ? dzs.cK.m() : dzs.a.m();
                        $$10.a($$4, $$21 * $$2.j() + $$20 * $$19.j(), $$22, $$21 * $$2.l() + $$20 * $$19.l());
                        this.n.c((is)$$10, $$23);
                    }
                }
            }
        }
        for (int $$24 = -1; $$24 < 3; ++$$24) {
            for (int $$25 = -1; $$25 < 4; ++$$25) {
                if ($$24 != -1 && $$24 != 2 && $$25 != -1 && $$25 != 3) continue;
                $$10.a($$4, $$24 * $$2.j(), $$25, $$24 * $$2.l());
                this.n.a((is)$$10, dzs.cK.m(), 3);
            }
        }
        eoh $$26 = (eoh)dzs.eI.m().b(efd.b, $$1);
        for (int $$27 = 0; $$27 < 2; ++$$27) {
            for (int $$28 = 0; $$28 < 3; ++$$28) {
                $$10.a($$4, $$27 * $$2.j(), $$28, $$27 * $$2.l());
                this.n.a((is)$$10, $$26, 18);
            }
        }
        return Optional.of(new ber.a($$4.j(), 2, 3));
    }

    private boolean a(is.a $$0) {
        eoh $$1 = this.n.a_($$0);
        return $$1.v() && $$1.y().c();
    }

    private boolean a(is $$0, is.a $$1, iz $$2, int $$3) {
        iz $$4 = $$2.h();
        for (int $$5 = -1; $$5 < 3; ++$$5) {
            for (int $$6 = -1; $$6 < 4; ++$$6) {
                $$1.a($$0, $$2.j() * $$5 + $$4.j() * $$3, $$6, $$2.l() * $$5 + $$4.l() * $$3);
                if ($$6 < 0 && !this.n.a_($$1).e()) {
                    return false;
                }
                if ($$6 < 0 || this.a($$1)) continue;
                return false;
            }
        }
        return true;
    }
}

