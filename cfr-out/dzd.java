/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dzd
extends dzq {
    private static final int b = 8;
    private static final int c = 1;
    private static final int d = 3;
    private final float e;
    protected static final fug a = dzq.b(16.0, 0.0, 1.0);

    public dzd(eog.d $$0, float $$1) {
        super($$0);
        this.e = $$1;
    }

    protected abstract MapCodec<? extends dzd> a();

    @Override
    public eoh a(dpu $$0) {
        return dzd.a($$0.q(), $$0.a());
    }

    public static eoh a(dvt $$0, is $$1) {
        is $$2 = $$1.e();
        eoh $$3 = $$0.a_($$2);
        if (ehq.p($$3)) {
            return dzs.cO.m();
        }
        return ((ecv)dzs.cN).b($$0, $$1);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return a;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        block12: {
            block11: {
                is $$4;
                eoh $$5;
                if ($$3.a(24) == 0) {
                    $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, bda.kH, bdb.e, 1.0f + $$3.i(), $$3.i() * 0.7f + 0.3f, false);
                }
                if (!this.g($$5 = $$1.a_($$4 = $$2.e())) && !$$5.c((dvt)$$1, $$4, iz.b)) break block11;
                for (int $$6 = 0; $$6 < 3; ++$$6) {
                    double $$7 = (double)$$2.u() + $$3.j();
                    double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
                    double $$9 = (double)$$2.w() + $$3.j();
                    $$1.a(ly.ab, $$7, $$8, $$9, 0.0, 0.0, 0.0);
                }
                break block12;
            }
            if (this.g($$1.a_($$2.h()))) {
                for (int $$10 = 0; $$10 < 2; ++$$10) {
                    double $$11 = (double)$$2.u() + $$3.j() * (double)0.1f;
                    double $$12 = (double)$$2.v() + $$3.j();
                    double $$13 = (double)$$2.w() + $$3.j();
                    $$1.a(ly.ab, $$11, $$12, $$13, 0.0, 0.0, 0.0);
                }
            }
            if (this.g($$1.a_($$2.i()))) {
                for (int $$14 = 0; $$14 < 2; ++$$14) {
                    double $$15 = (double)($$2.u() + 1) - $$3.j() * (double)0.1f;
                    double $$16 = (double)$$2.v() + $$3.j();
                    double $$17 = (double)$$2.w() + $$3.j();
                    $$1.a(ly.ab, $$15, $$16, $$17, 0.0, 0.0, 0.0);
                }
            }
            if (this.g($$1.a_($$2.f()))) {
                for (int $$18 = 0; $$18 < 2; ++$$18) {
                    double $$19 = (double)$$2.u() + $$3.j();
                    double $$20 = (double)$$2.v() + $$3.j();
                    double $$21 = (double)$$2.w() + $$3.j() * (double)0.1f;
                    $$1.a(ly.ab, $$19, $$20, $$21, 0.0, 0.0, 0.0);
                }
            }
            if (this.g($$1.a_($$2.g()))) {
                for (int $$22 = 0; $$22 < 2; ++$$22) {
                    double $$23 = (double)$$2.u() + $$3.j();
                    double $$24 = (double)$$2.v() + $$3.j();
                    double $$25 = (double)($$2.w() + 1) - $$3.j() * (double)0.1f;
                    $$1.a(ly.ab, $$23, $$24, $$25, 0.0, 0.0, 0.0);
                }
            }
            if (!this.g($$1.a_($$2.d()))) break block12;
            for (int $$26 = 0; $$26 < 2; ++$$26) {
                double $$27 = (double)$$2.u() + $$3.j();
                double $$28 = (double)($$2.v() + 1) - $$3.j() * (double)0.1f;
                double $$29 = (double)$$2.w() + $$3.j();
                $$1.a(ly.ab, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
        }
    }

    protected abstract boolean g(eoh var1);

    @Override
    protected void a(eoh $$02, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        $$4.a(chd.b);
        $$4.a(chd.c);
        $$4.b(chd.c, $$0 -> $$0.a($$0.ao().as().a(), this.e));
    }

    public static void a(cgk $$0) {
        if (!$$0.bx()) {
            if ($$0.aS() < 0) {
                $$0.h($$0.aS() + 1);
            } else if ($$0 instanceof axg) {
                int $$1 = $$0.ao().G_().b(1, 3);
                $$0.h($$0.aS() + $$1);
            }
            if ($$0.aS() >= 0) {
                $$0.e(8.0f);
            }
        }
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        Optional<fma> $$5;
        if ($$3.a($$0.b())) {
            return;
        }
        if (dzd.a($$1) && ($$5 = fma.a((dwp)$$1, $$2, iz.a.a)).isPresent()) {
            $$5.get().a($$1);
            return;
        }
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.a($$2, false);
        }
    }

    private static boolean a(dwo $$0) {
        return $$0.aq() == dwo.h || $$0.aq() == dwo.i;
    }

    @Override
    protected void a(dwo $$0, ddm $$1, is $$2, eoh $$3) {
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        if (!$$0.B_()) {
            $$0.a(null, 1009, $$1, 0);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public static boolean a(dwo $$0, is $$1, iz $$2) {
        eoh $$3 = $$0.a_($$1);
        if (!$$3.l()) {
            return false;
        }
        return dzd.a($$0, $$1).a((dwr)$$0, $$1) || dzd.b($$0, $$1, $$2);
    }

    private static boolean b(dwo $$0, is $$1, iz $$2) {
        if (!dzd.a($$0)) {
            return false;
        }
        is.a $$3 = $$1.k();
        boolean $$4 = false;
        for (iz $$5 : iz.values()) {
            if (!$$0.a_($$3.g($$1).c($$5)).a(dzs.cK)) continue;
            $$4 = true;
            break;
        }
        if (!$$4) {
            return false;
        }
        iz.a $$6 = $$2.o().d() ? $$2.i().o() : iz.c.a.b($$0.y);
        return fma.a((dwp)$$0, $$1, $$6).isPresent();
    }
}

