/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.LinkedHashMultiset
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import org.jspecify.annotations.Nullable;

public class dmg
extends dlp {
    public static final int a = 128;
    public static final int b = 128;

    public dmg(dlp.a $$0) {
        super($$0);
    }

    public static dlt a(axf $$0, int $$1, int $$2, byte $$3, boolean $$4, boolean $$5) {
        dlt $$6 = new dlt(dlx.tY);
        fmu $$7 = dmg.a($$0, $$1, $$2, $$3, $$4, $$5, $$0.aq());
        $$6.b(ki.T, $$7);
        return $$6;
    }

    public static @Nullable fmw a(@Nullable fmu $$0, dwo $$1) {
        return $$0 == null ? null : $$1.a($$0);
    }

    public static @Nullable fmw b(dlt $$0, dwo $$1) {
        fmu $$2 = $$0.a(ki.T);
        return dmg.a($$2, $$1);
    }

    private static fmu a(axf $$0, int $$1, int $$2, int $$3, boolean $$4, boolean $$5, amt<dwo> $$6) {
        fmw $$7 = fmw.a($$1, $$2, (byte)$$3, $$4, $$5, $$6);
        fmu $$8 = $$0.B();
        $$0.a($$8, $$7);
        return $$8;
    }

    public void a(dwo $$0, cgk $$1, fmw $$2) {
        if ($$0.aq() != $$2.f || !($$1 instanceof ddm)) {
            return;
        }
        int $$3 = 1 << $$2.g;
        int $$4 = $$2.d;
        int $$5 = $$2.e;
        int $$6 = bgj.c($$1.dP() - (double)$$4) / $$3 + 64;
        int $$7 = bgj.c($$1.dV() - (double)$$5) / $$3 + 64;
        int $$8 = 128 / $$3;
        if ($$0.F_().f()) {
            $$8 /= 2;
        }
        fmw.a $$9 = $$2.a((ddm)$$1);
        ++$$9.b;
        is.a $$10 = new is.a();
        is.a $$11 = new is.a();
        boolean $$12 = false;
        for (int $$13 = $$6 - $$8 + 1; $$13 < $$6 + $$8; ++$$13) {
            if (($$13 & 0xF) != ($$9.b & 0xF) && !$$12) continue;
            $$12 = false;
            double $$14 = 0.0;
            for (int $$15 = $$7 - $$8 - 1; $$15 < $$7 + $$8; ++$$15) {
                flf.a $$40;
                if ($$13 < 0 || $$15 < -1 || $$13 >= 128 || $$15 >= 128) continue;
                int $$16 = bgj.i($$13 - $$6) + bgj.i($$15 - $$7);
                boolean $$17 = $$16 > ($$8 - 2) * ($$8 - 2);
                int $$18 = ($$4 / $$3 + $$13 - 64) * $$3;
                int $$19 = ($$5 / $$3 + $$15 - 64) * $$3;
                LinkedHashMultiset $$20 = LinkedHashMultiset.create();
                eqq $$21 = $$0.d(jw.a($$18), jw.a($$19));
                if ($$21.F()) continue;
                int $$22 = 0;
                double $$23 = 0.0;
                if ($$0.F_().f()) {
                    int $$24 = $$18 + $$19 * 231871;
                    if ((($$24 = $$24 * $$24 * 31287121 + $$24 * 11) >> 20 & 1) == 0) {
                        $$20.add((Object)dzs.j.m().a((dvt)$$0, is.c), 10);
                    } else {
                        $$20.add((Object)dzs.b.m().a((dvt)$$0, is.c), 100);
                    }
                    $$23 = 100.0;
                } else {
                    for (int $$25 = 0; $$25 < $$3; ++$$25) {
                        for (int $$26 = 0; $$26 < $$3; ++$$26) {
                            eoh $$31;
                            $$10.d($$18 + $$25, 0, $$19 + $$26);
                            int $$27 = $$21.a(euq.a.b, $$10.u(), $$10.w()) + 1;
                            if ($$27 > $$0.K_()) {
                                eoh $$28;
                                do {
                                    $$10.q(--$$27);
                                } while (($$28 = $$21.a_($$10)).a((dvt)$$0, (is)$$10) == flf.a && $$27 > $$0.K_());
                                if ($$27 > $$0.K_() && !$$28.y().c()) {
                                    eoh $$30;
                                    int $$29 = $$27 - 1;
                                    $$11.g($$10);
                                    do {
                                        $$11.q($$29--);
                                        $$30 = $$21.a_($$11);
                                        ++$$22;
                                    } while ($$29 > $$0.K_() && !$$30.y().c());
                                    $$28 = this.a($$0, $$28, $$10);
                                }
                            } else {
                                $$31 = dzs.I.m();
                            }
                            $$2.a($$0, $$10.u(), $$10.w());
                            $$23 += (double)$$27 / (double)($$3 * $$3);
                            $$20.add((Object)$$31.a((dvt)$$0, (is)$$10));
                        }
                    }
                }
                $$22 /= $$3 * $$3;
                flf $$32 = (flf)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)$$20), (Object)flf.a);
                if ($$32 == flf.m) {
                    double $$33 = (double)$$22 * 0.1 + (double)($$13 + $$15 & 1) * 0.2;
                    if ($$33 < 0.5) {
                        flf.a $$34 = flf.a.c;
                    } else if ($$33 > 0.9) {
                        flf.a $$35 = flf.a.a;
                    } else {
                        flf.a $$36 = flf.a.b;
                    }
                } else {
                    double $$37 = ($$23 - $$14) * 4.0 / (double)($$3 + 4) + ((double)($$13 + $$15 & 1) - 0.5) * 0.4;
                    if ($$37 > 0.6) {
                        flf.a $$38 = flf.a.c;
                    } else if ($$37 < -0.6) {
                        flf.a $$39 = flf.a.a;
                    } else {
                        $$40 = flf.a.b;
                    }
                }
                $$14 = $$23;
                if ($$15 < 0 || $$16 >= $$8 * $$8 || $$17 && ($$13 + $$15 & 1) == 0) continue;
                $$12 |= $$2.a($$13, $$15, $$32.b($$40));
            }
        }
    }

    private eoh a(dwo $$0, eoh $$1, is $$2) {
        flb $$3 = $$1.y();
        if (!$$3.c() && !$$1.c((dvt)$$0, $$2, iz.b)) {
            return $$3.g();
        }
        return $$1;
    }

    private static boolean a(boolean[] $$0, int $$1, int $$2) {
        return $$0[$$2 * 128 + $$1];
    }

    public static void a(axf $$0, dlt $$1) {
        fmw $$2 = dmg.b($$1, (dwo)$$0);
        if ($$2 == null) {
            return;
        }
        if ($$0.aq() != $$2.f) {
            return;
        }
        int $$3 = 1 << $$2.g;
        int $$4 = $$2.d;
        int $$5 = $$2.e;
        boolean[] $$6 = new boolean[16384];
        int $$7 = $$4 / $$3 - 64;
        int $$8 = $$5 / $$3 - 64;
        is.a $$9 = new is.a();
        for (int $$10 = 0; $$10 < 128; ++$$10) {
            for (int $$11 = 0; $$11 < 128; ++$$11) {
                jd<dxo> $$12 = $$0.z($$9.d(($$7 + $$11) * $$3, 0, ($$8 + $$10) * $$3));
                $$6[$$10 * 128 + $$11] = $$12.a(bdo.Z);
            }
        }
        for (int $$13 = 1; $$13 < 127; ++$$13) {
            for (int $$14 = 1; $$14 < 127; ++$$14) {
                int $$15 = 0;
                for (int $$16 = -1; $$16 < 2; ++$$16) {
                    for (int $$17 = -1; $$17 < 2; ++$$17) {
                        if ($$16 == 0 && $$17 == 0 || !dmg.a($$6, $$13 + $$16, $$14 + $$17)) continue;
                        ++$$15;
                    }
                }
                flf.a $$18 = flf.a.d;
                flf $$19 = flf.a;
                if (dmg.a($$6, $$13, $$14)) {
                    $$19 = flf.p;
                    if ($$15 > 7 && $$14 % 2 == 0) {
                        switch (($$13 + (int)(bgj.a((double)((float)$$14 + 0.0f)) * 7.0f)) / 8 % 5) {
                            case 0: 
                            case 4: {
                                $$18 = flf.a.a;
                                break;
                            }
                            case 1: 
                            case 3: {
                                $$18 = flf.a.b;
                                break;
                            }
                            case 2: {
                                $$18 = flf.a.c;
                            }
                        }
                    } else if ($$15 > 7) {
                        $$19 = flf.a;
                    } else if ($$15 > 5) {
                        $$18 = flf.a.b;
                    } else if ($$15 > 3) {
                        $$18 = flf.a.a;
                    } else if ($$15 > 1) {
                        $$18 = flf.a.a;
                    }
                } else if ($$15 > 0) {
                    $$19 = flf.A;
                    $$18 = $$15 > 3 ? flf.a.b : flf.a.d;
                }
                if ($$19 == flf.a) continue;
                $$2.b($$13, $$14, $$19.b($$18));
            }
        }
    }

    @Override
    public void a(dlt $$0, axf $$1, cgk $$2, @Nullable cgv $$3) {
        fmw $$4 = dmg.b($$0, (dwo)$$1);
        if ($$4 == null) {
            return;
        }
        if ($$2 instanceof ddm) {
            ddm $$5 = (ddm)$$2;
            $$4.a($$5, $$0);
        }
        if (!$$4.i && $$3 != null && $$3.a() == cgv.a.a) {
            this.a((dwo)$$1, $$2, $$4);
        }
    }

    @Override
    public void a(dlt $$0, dwo $$1) {
        dou $$2 = $$0.e(ki.V);
        if ($$2 == null) {
            return;
        }
        if ($$1 instanceof axf) {
            axf $$3 = (axf)$$1;
            switch ($$2) {
                case a: {
                    dmg.b($$0, $$3);
                    break;
                }
                case b: {
                    dmg.a($$0, $$3);
                }
            }
        }
    }

    private static void a(dlt $$0, axf $$1) {
        fmw $$2 = dmg.b($$0, (dwo)$$1);
        if ($$2 != null) {
            fmu $$3 = $$1.B();
            $$1.a($$3, $$2.c());
            $$0.b(ki.T, $$3);
        }
    }

    private static void b(dlt $$0, axf $$1) {
        fmw $$2 = dmg.b($$0, (dwo)$$1);
        if ($$2 != null) {
            fmu $$3 = $$1.B();
            fmw $$4 = $$2.b();
            $$1.a($$3, $$4);
            $$0.b(ki.T, $$3);
        }
    }

    @Override
    public cdc a(dpw $$0) {
        eoh $$1 = $$0.q().a_($$0.a());
        if ($$1.a(bdp.aw)) {
            fmw $$2;
            if (!$$0.q().B_() && ($$2 = dmg.b($$0.n(), $$0.q())) != null && !$$2.a((dwp)$$0.q(), $$0.a())) {
                return cdc.d;
            }
            return cdc.a;
        }
        return super.a($$0);
    }
}

