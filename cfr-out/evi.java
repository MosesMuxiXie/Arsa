/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class evi {
    private static final eoh a = dzs.ia.m();
    private static final eoh b = dzs.ib.m();
    private static final eoh c = dzs.js.m();
    private static final eoh d = dzs.ie.m();
    private static final eoh e = dzs.im.m();
    private static final eoh f = dzs.io.m();
    private static final eoh g = dzs.ii.m();
    private static final eoh h = dzs.ju.m();
    private static final eoh i = dzs.er.m();
    private final eoh j;
    private final int k;
    private final eoh[] l;
    private final fke m;
    private final fke n;
    private final fke o;
    private final fke p;
    private final fke q;
    private final fke r;
    private final fke s;
    private final evd t;
    private final fke u;
    private final fke v;

    public evi(eve $$0, eoh $$1, int $$2, evd $$3) {
        this.j = $$1;
        this.k = $$2;
        this.t = $$3;
        this.m = $$0.a(euz.P);
        this.l = evi.a($$3.a(amo.b("clay_bands")));
        this.u = $$0.a(euz.N);
        this.v = $$0.a(euz.O);
        this.n = $$0.a(euz.Q);
        this.o = $$0.a(euz.R);
        this.p = $$0.a(euz.S);
        this.q = $$0.a(euz.T);
        this.r = $$0.a(euz.U);
        this.s = $$0.a(euz.V);
    }

    public void a(eve $$0, dxq $$1, jq<dxo> $$2, boolean $$3, evn $$4, final eqf $$5, euu $$6, evh.o $$7) {
        final is.a $$8 = new is.a();
        final dvu $$9 = $$5.f();
        int $$10 = $$9.e();
        int $$11 = $$9.f();
        eqc $$12 = new eqc(){

            @Override
            public eoh a(int $$0) {
                return $$5.a_($$8.q($$0));
            }

            @Override
            public void a(int $$0, eoh $$1) {
                dwq $$2 = $$5.B();
                if ($$2.d($$0)) {
                    $$5.a((is)$$8.q($$0), $$1);
                    if (!$$1.y().c()) {
                        $$5.e($$8);
                    }
                }
            }

            public String toString() {
                return "ChunkBlockColumn " + String.valueOf($$9);
            }
        };
        evh.g $$13 = new evh.g(this, $$0, $$5, $$6, $$1::a, $$2, $$4);
        evh.u $$14 = (evh.u)$$7.apply($$13);
        is.a $$15 = new is.a();
        for (int $$16 = 0; $$16 < 16; ++$$16) {
            for (int $$17 = 0; $$17 < 16; ++$$17) {
                int $$18 = $$10 + $$16;
                int $$19 = $$11 + $$17;
                int $$20 = $$5.a(euq.a.a, $$16, $$17) + 1;
                $$8.p($$18).r($$19);
                jd<dxo> $$21 = $$1.a($$15.d($$18, $$3 ? 0 : $$20, $$19));
                if ($$21.a(dxv.C)) {
                    this.a($$12, $$18, $$19, $$20, $$5);
                }
                int $$22 = $$5.a(euq.a.a, $$16, $$17) + 1;
                $$13.a($$18, $$19);
                int $$23 = 0;
                int $$24 = Integer.MIN_VALUE;
                int $$25 = Integer.MAX_VALUE;
                int $$26 = $$5.K_();
                for (int $$27 = $$22; $$27 >= $$26; --$$27) {
                    eoh $$32;
                    eoh $$28 = $$12.a($$27);
                    if ($$28.l()) {
                        $$23 = 0;
                        $$24 = Integer.MIN_VALUE;
                        continue;
                    }
                    if (!$$28.y().c()) {
                        if ($$24 != Integer.MIN_VALUE) continue;
                        $$24 = $$27 + 1;
                        continue;
                    }
                    if ($$25 >= $$27) {
                        $$25 = esh.g;
                        for (int $$29 = $$27 - 1; $$29 >= $$26 - 1; --$$29) {
                            eoh $$30 = $$12.a($$29);
                            if (this.a($$30)) continue;
                            $$25 = $$29 + 1;
                            break;
                        }
                    }
                    int $$31 = $$27 - $$25 + 1;
                    $$13.a(++$$23, $$31, $$24, $$18, $$27, $$19);
                    if ($$28 != this.j || ($$32 = $$14.tryApply($$18, $$27, $$19)) == null) continue;
                    $$12.a($$27, $$32);
                }
                if (!$$21.a(dxv.X) && !$$21.a(dxv.Y)) continue;
                this.a($$13.c(), $$21.a(), $$12, $$15, $$18, $$19, $$20);
            }
        }
    }

    protected int a(int $$0, int $$1) {
        double $$2 = this.u.a($$0, 0.0, $$1);
        return (int)($$2 * 2.75 + 3.0 + this.t.a($$0, 0, $$1).j() * 0.25);
    }

    protected double b(int $$0, int $$1) {
        return this.v.a($$0, 0.0, $$1);
    }

    private boolean a(eoh $$0) {
        return !$$0.l() && $$0.y().c();
    }

    public int a() {
        return this.k;
    }

    @Deprecated
    public Optional<eoh> a(evh.o $$0, ewr $$1, Function<is, jd<dxo>> $$2, eqf $$3, euu $$4, is $$5, boolean $$6) {
        evh.g $$7 = new evh.g(this, $$1.d(), $$3, $$4, $$2, $$1.c().f(mj.aS), $$1);
        evh.u $$8 = (evh.u)$$0.apply($$7);
        int $$9 = $$5.u();
        int $$10 = $$5.v();
        int $$11 = $$5.w();
        $$7.a($$9, $$11);
        $$7.a(1, 1, $$6 ? $$10 + 1 : Integer.MIN_VALUE, $$9, $$10, $$11);
        eoh $$12 = $$8.tryApply($$9, $$10, $$11);
        return Optional.ofNullable($$12);
    }

    private void a(eqc $$0, int $$1, int $$2, int $$3, dwq $$4) {
        eoh $$13;
        double $$5 = 0.2;
        double $$6 = Math.min(Math.abs(this.p.a($$1, 0.0, $$2) * 8.25), this.n.a((double)$$1 * 0.2, 0.0, (double)$$2 * 0.2) * 15.0);
        if ($$6 <= 0.0) {
            return;
        }
        double $$7 = 0.75;
        double $$8 = 1.5;
        double $$9 = Math.abs(this.o.a((double)$$1 * 0.75, 0.0, (double)$$2 * 0.75) * 1.5);
        double $$10 = 64.0 + Math.min($$6 * $$6 * 2.5, Math.ceil($$9 * 50.0) + 24.0);
        int $$11 = bgj.c($$10);
        if ($$3 > $$11) {
            return;
        }
        for (int $$12 = $$11; $$12 >= $$4.K_() && !($$13 = $$0.a($$12)).a(this.j.b()); --$$12) {
            if (!$$13.a(dzs.J)) continue;
            return;
        }
        for (int $$14 = $$11; $$14 >= $$4.K_() && $$0.a($$14).l(); --$$14) {
            $$0.a($$14, this.j);
        }
    }

    private void a(int $$0, dxo $$1, eqc $$2, is.a $$3, int $$4, int $$5, int $$6) {
        double $$14;
        double $$7 = 1.28;
        double $$8 = Math.min(Math.abs(this.s.a($$4, 0.0, $$5) * 8.25), this.q.a((double)$$4 * 1.28, 0.0, (double)$$5 * 1.28) * 15.0);
        if ($$8 <= 1.8) {
            return;
        }
        double $$9 = 1.17;
        double $$10 = 1.5;
        double $$11 = Math.abs(this.r.a((double)$$4 * 1.17, 0.0, (double)$$5 * 1.17) * 1.5);
        double $$12 = Math.min($$8 * $$8 * 1.2, Math.ceil($$11 * 40.0) + 14.0);
        if ($$1.d($$3.d($$4, this.k, $$5), this.k)) {
            $$12 -= 2.0;
        }
        if ($$12 > 2.0) {
            double $$13 = (double)this.k - $$12 - 7.0;
            $$12 += (double)this.k;
        } else {
            $$12 = 0.0;
            $$14 = 0.0;
        }
        double $$15 = $$12;
        bgr $$16 = this.t.a($$4, 0, $$5);
        int $$17 = 2 + $$16.a(4);
        int $$18 = this.k + 18 + $$16.a(10);
        int $$19 = 0;
        for (int $$20 = Math.max($$6, (int)$$15 + 1); $$20 >= $$0; --$$20) {
            if (!($$2.a($$20).l() && $$20 < (int)$$15 && $$16.j() > 0.01) && (!$$2.a($$20).a(dzs.J) || $$20 <= (int)$$14 || $$20 >= this.k || $$14 == 0.0 || !($$16.j() > 0.15))) continue;
            if ($$19 <= $$17 && $$20 > $$18) {
                $$2.a($$20, i);
                ++$$19;
                continue;
            }
            $$2.a($$20, h);
        }
    }

    private static eoh[] a(bgr $$0) {
        Object[] $$1 = new eoh[192];
        Arrays.fill($$1, c);
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if (($$2 += $$0.a(5) + 1) >= $$1.length) continue;
            $$1[$$2] = b;
        }
        evi.a($$0, (eoh[])$$1, 1, d);
        evi.a($$0, (eoh[])$$1, 2, e);
        evi.a($$0, (eoh[])$$1, 1, f);
        int $$3 = $$0.a(9, 15);
        int $$4 = 0;
        for (int $$5 = 0; $$4 < $$3 && $$5 < $$1.length; ++$$4, $$5 += $$0.a(16) + 4) {
            $$1[$$5] = a;
            if ($$5 - 1 > 0 && $$0.h()) {
                $$1[$$5 - 1] = g;
            }
            if ($$5 + 1 >= $$1.length || !$$0.h()) continue;
            $$1[$$5 + 1] = g;
        }
        return $$1;
    }

    private static void a(bgr $$0, eoh[] $$1, int $$2, eoh $$3) {
        int $$4 = $$0.a(6, 15);
        for (int $$5 = 0; $$5 < $$4; ++$$5) {
            int $$6 = $$2 + $$0.a(3);
            int $$7 = $$0.a($$1.length);
            for (int $$8 = 0; $$7 + $$8 < $$1.length && $$8 < $$6; ++$$8) {
                $$1[$$7 + $$8] = $$3;
            }
        }
    }

    protected eoh a(int $$0, int $$1, int $$2) {
        int $$3 = (int)Math.round(this.m.a($$0, 0.0, $$2) * 4.0);
        return this.l[($$1 + $$3 + this.l.length) % this.l.length];
    }
}

