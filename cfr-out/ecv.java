/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;

public class ecv
extends dzd {
    public static final MapCodec<ecv> b = ecv.b(ecv::new);
    public static final int c = 15;
    public static final eph d = eox.aA;
    public static final eoy e = efm.b;
    public static final eoy f = efm.c;
    public static final eoy g = efm.d;
    public static final eoy h = efm.e;
    public static final eoy i = efm.f;
    public static final Map<iz, eoy> D = efm.h.entrySet().stream().filter($$0 -> $$0.getKey() != iz.a).collect(bhs.a());
    private final Function<eoh, fug> R;
    private static final int S = 60;
    private static final int T = 30;
    private static final int U = 15;
    private static final int V = 5;
    private static final int W = 100;
    private static final int X = 60;
    private static final int Y = 20;
    private static final int Z = 5;
    private final Object2IntMap<dzq> aa = new Object2IntOpenHashMap();
    private final Object2IntMap<dzq> ab = new Object2IntOpenHashMap();

    public MapCodec<ecv> a() {
        return b;
    }

    public ecv(eog.d $$0) {
        super($$0, 1.0f);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(d, 0)).b(e, false)).b(f, false)).b(g, false)).b(h, false)).b(i, false));
        this.R = this.q();
    }

    private Function<eoh, fug> q() {
        Map<iz, fug> $$0 = fud.d(dzq.c(16.0, 0.0, 1.0));
        return this.a((eoh $$1) -> {
            fug $$2 = fud.a();
            for (Map.Entry<iz, eoy> $$3 : D.entrySet()) {
                if (!((Boolean)$$1.c($$3.getValue())).booleanValue()) continue;
                $$2 = fud.a($$2, (fug)$$0.get($$3.getKey()));
            }
            return $$2.c() ? a : $$2;
        }, d);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (this.a($$0, $$1, $$3)) {
            return this.a($$1, $$3, (int)$$0.c(d));
        }
        return dzs.a.m();
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.R.apply($$0);
    }

    @Override
    public eoh a(dpu $$0) {
        return this.b($$0.q(), $$0.a());
    }

    protected eoh b(dvt $$0, is $$1) {
        is $$2 = $$1.e();
        eoh $$3 = $$0.a_($$2);
        if (this.g($$3) || $$3.c($$0, $$2, iz.b)) {
            return this.m();
        }
        eoh $$4 = this.m();
        for (iz $$5 : iz.values()) {
            eoy $$6 = D.get($$5);
            if ($$6 == null) continue;
            $$4 = (eoh)$$4.b($$6, this.g($$0.a_($$1.a($$5))));
        }
        return $$4;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        return $$1.a_($$3).c((dvt)$$1, $$3, iz.b) || this.d($$1, $$2);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        boolean $$9;
        $$1.a($$2, (dzq)this, ecv.a($$1.y));
        if (!$$1.j($$2)) {
            return;
        }
        if (!$$0.a((dwr)$$1, $$2)) {
            $$1.a($$2, false);
        }
        eoh $$4 = $$1.a_($$2.e());
        boolean $$5 = $$4.a($$1.F_().k());
        int $$6 = $$0.c(d);
        if (!$$5 && $$1.ao() && this.a($$1, $$2) && $$3.i() < 0.2f + (float)$$6 * 0.03f) {
            $$1.a($$2, false);
            return;
        }
        int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
        if ($$6 != $$7) {
            $$0 = (eoh)$$0.b(d, $$7);
            $$1.a($$2, $$0, 260);
        }
        if (!$$5) {
            if (!this.d($$1, $$2)) {
                is $$8 = $$2.e();
                if (!$$1.a_($$8).c((dvt)$$1, $$8, iz.b) || $$6 > 3) {
                    $$1.a($$2, false);
                }
                return;
            }
            if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                $$1.a($$2, false);
                return;
            }
        }
        int $$10 = ($$9 = $$1.c().a(ceg.G, $$2).booleanValue()) ? -50 : 0;
        this.a((dwo)$$1, $$2.i(), 300 + $$10, $$3, $$6);
        this.a((dwo)$$1, $$2.h(), 300 + $$10, $$3, $$6);
        this.a((dwo)$$1, $$2.e(), 250 + $$10, $$3, $$6);
        this.a((dwo)$$1, $$2.d(), 250 + $$10, $$3, $$6);
        this.a((dwo)$$1, $$2.f(), 300 + $$10, $$3, $$6);
        this.a((dwo)$$1, $$2.g(), 300 + $$10, $$3, $$6);
        is.a $$11 = new is.a();
        for (int $$12 = -1; $$12 <= 1; ++$$12) {
            for (int $$13 = -1; $$13 <= 1; ++$$13) {
                for (int $$14 = -1; $$14 <= 4; ++$$14) {
                    if ($$12 == 0 && $$14 == 0 && $$13 == 0) continue;
                    int $$15 = 100;
                    if ($$14 > 1) {
                        $$15 += ($$14 - 1) * 100;
                    }
                    $$11.a($$2, $$12, $$14, $$13);
                    int $$16 = this.a((dwr)$$1, (is)$$11);
                    if ($$16 <= 0) continue;
                    int $$17 = ($$16 + 40 + $$1.av().a() * 7) / ($$6 + 30);
                    if ($$9) {
                        $$17 /= 2;
                    }
                    if ($$17 <= 0 || $$3.a($$15) > $$17 || $$1.ao() && this.a($$1, (is)$$11)) continue;
                    int $$18 = Math.min(15, $$6 + $$3.a(5) / 4);
                    $$1.a((is)$$11, this.a((dwr)$$1, (is)$$11, $$18), 3);
                }
            }
        }
    }

    protected boolean a(dwo $$0, is $$1) {
        return $$0.v($$1) || $$0.v($$1.h()) || $$0.v($$1.i()) || $$0.v($$1.f()) || $$0.v($$1.g());
    }

    private int p(eoh $$0) {
        if ($$0.b(eox.I) && $$0.c(eox.I).booleanValue()) {
            return 0;
        }
        return this.ab.getInt((Object)$$0.b());
    }

    private int r(eoh $$0) {
        if ($$0.b(eox.I) && $$0.c(eox.I).booleanValue()) {
            return 0;
        }
        return this.aa.getInt((Object)$$0.b());
    }

    private void a(dwo $$0, is $$1, int $$2, bgr $$3, int $$4) {
        int $$5 = this.p($$0.a_($$1));
        if ($$3.a($$2) < $$5) {
            eoh $$6 = $$0.a_($$1);
            if ($$3.a($$4 + 10) < 5 && !$$0.v($$1)) {
                int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
                $$0.a($$1, this.a((dwr)$$0, $$1, $$7), 3);
            } else {
                $$0.a($$1, false);
            }
            dzq $$8 = $$6.b();
            if ($$8 instanceof eis) {
                eis.a($$0, $$1);
            }
        }
    }

    private eoh a(dwr $$0, is $$1, int $$2) {
        eoh $$3 = ecv.a($$0, $$1);
        if ($$3.a(dzs.cN)) {
            return (eoh)$$3.b(d, $$2);
        }
        return $$3;
    }

    private boolean d(dvt $$0, is $$1) {
        for (iz $$2 : iz.values()) {
            if (!this.g($$0.a_($$1.a($$2)))) continue;
            return true;
        }
        return false;
    }

    private int a(dwr $$0, is $$1) {
        if (!$$0.A($$1)) {
            return 0;
        }
        int $$2 = 0;
        for (iz $$3 : iz.values()) {
            eoh $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
        }
        return $$2;
    }

    @Override
    protected boolean g(eoh $$0) {
        return this.r($$0) > 0;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        $$1.a($$2, (dzq)this, ecv.a($$1.y));
    }

    private static int a(bgr $$0) {
        return 30 + $$0.a(10);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(d, e, f, g, h, i);
    }

    public void a(dzq $$0, int $$1, int $$2) {
        this.aa.put((Object)$$0, $$1);
        this.ab.put((Object)$$0, $$2);
    }

    public static void b() {
        ecv $$0 = (ecv)dzs.cN;
        $$0.a(dzs.n, 5, 20);
        $$0.a(dzs.o, 5, 20);
        $$0.a(dzs.p, 5, 20);
        $$0.a(dzs.q, 5, 20);
        $$0.a(dzs.r, 5, 20);
        $$0.a(dzs.s, 5, 20);
        $$0.a(dzs.t, 5, 20);
        $$0.a(dzs.v, 5, 20);
        $$0.a(dzs.w, 5, 20);
        $$0.a(dzs.x, 5, 20);
        $$0.a(dzs.y, 5, 20);
        $$0.a(dzs.kl, 5, 20);
        $$0.a(dzs.km, 5, 20);
        $$0.a(dzs.kn, 5, 20);
        $$0.a(dzs.ko, 5, 20);
        $$0.a(dzs.kp, 5, 20);
        $$0.a(dzs.kq, 5, 20);
        $$0.a(dzs.kr, 5, 20);
        $$0.a(dzs.ks, 5, 20);
        $$0.a(dzs.kt, 5, 20);
        $$0.a(dzs.ku, 5, 20);
        $$0.a(dzs.kv, 5, 20);
        $$0.a(dzs.fQ, 5, 20);
        $$0.a(dzs.kO, 5, 20);
        $$0.a(dzs.kP, 5, 20);
        $$0.a(dzs.kQ, 5, 20);
        $$0.a(dzs.kR, 5, 20);
        $$0.a(dzs.kS, 5, 20);
        $$0.a(dzs.kT, 5, 20);
        $$0.a(dzs.kU, 5, 20);
        $$0.a(dzs.kV, 5, 20);
        $$0.a(dzs.kW, 5, 20);
        $$0.a(dzs.ex, 5, 20);
        $$0.a(dzs.kX, 5, 20);
        $$0.a(dzs.kY, 5, 20);
        $$0.a(dzs.kZ, 5, 20);
        $$0.a(dzs.la, 5, 20);
        $$0.a(dzs.lb, 5, 20);
        $$0.a(dzs.lc, 5, 20);
        $$0.a(dzs.ld, 5, 20);
        $$0.a(dzs.le, 5, 20);
        $$0.a(dzs.lf, 5, 20);
        $$0.a(dzs.cR, 5, 20);
        $$0.a(dzs.gA, 5, 20);
        $$0.a(dzs.gz, 5, 20);
        $$0.a(dzs.gB, 5, 20);
        $$0.a(dzs.iG, 5, 20);
        $$0.a(dzs.iH, 5, 20);
        $$0.a(dzs.iI, 5, 20);
        $$0.a(dzs.iJ, 5, 20);
        $$0.a(dzs.iK, 5, 20);
        $$0.a(dzs.iL, 5, 20);
        $$0.a(dzs.iM, 5, 20);
        $$0.a(dzs.X, 5, 5);
        $$0.a(dzs.Y, 5, 5);
        $$0.a(dzs.Z, 5, 5);
        $$0.a(dzs.aa, 5, 5);
        $$0.a(dzs.ab, 5, 5);
        $$0.a(dzs.ac, 5, 5);
        $$0.a(dzs.ae, 5, 5);
        $$0.a(dzs.ad, 5, 5);
        $$0.a(dzs.af, 5, 5);
        $$0.a(dzs.ai, 5, 5);
        $$0.a(dzs.aq, 5, 5);
        $$0.a(dzs.aj, 5, 5);
        $$0.a(dzs.ak, 5, 5);
        $$0.a(dzs.al, 5, 5);
        $$0.a(dzs.am, 5, 5);
        $$0.a(dzs.an, 5, 5);
        $$0.a(dzs.ao, 5, 5);
        $$0.a(dzs.ap, 5, 5);
        $$0.a(dzs.ar, 5, 5);
        $$0.a(dzs.as, 5, 5);
        $$0.a(dzs.aB, 5, 5);
        $$0.a(dzs.aC, 5, 5);
        $$0.a(dzs.aD, 5, 5);
        $$0.a(dzs.aE, 5, 5);
        $$0.a(dzs.aF, 5, 5);
        $$0.a(dzs.aG, 5, 5);
        $$0.a(dzs.aH, 5, 5);
        $$0.a(dzs.aI, 5, 5);
        $$0.a(dzs.aJ, 5, 5);
        $$0.a(dzs.at, 5, 5);
        $$0.a(dzs.au, 5, 5);
        $$0.a(dzs.av, 5, 5);
        $$0.a(dzs.aw, 5, 5);
        $$0.a(dzs.ax, 5, 5);
        $$0.a(dzs.ay, 5, 5);
        $$0.a(dzs.u, 5, 5);
        $$0.a(dzs.az, 5, 5);
        $$0.a(dzs.aA, 5, 5);
        $$0.a(dzs.ag, 5, 20);
        $$0.a(dzs.aK, 30, 60);
        $$0.a(dzs.aL, 30, 60);
        $$0.a(dzs.aM, 30, 60);
        $$0.a(dzs.aN, 30, 60);
        $$0.a(dzs.aO, 30, 60);
        $$0.a(dzs.aP, 30, 60);
        $$0.a(dzs.aQ, 30, 60);
        $$0.a(dzs.aR, 30, 60);
        $$0.a(dzs.aS, 30, 60);
        $$0.a(dzs.cv, 30, 20);
        $$0.a(dzs.cu, 15, 100);
        $$0.a(dzs.bA, 60, 100);
        $$0.a(dzs.bB, 60, 100);
        $$0.a(dzs.bC, 60, 100);
        $$0.a(dzs.bE, 60, 100);
        $$0.a(dzs.bF, 60, 100);
        $$0.a(dzs.jv, 60, 100);
        $$0.a(dzs.jw, 60, 100);
        $$0.a(dzs.jx, 60, 100);
        $$0.a(dzs.jy, 60, 100);
        $$0.a(dzs.jz, 60, 100);
        $$0.a(dzs.jA, 60, 100);
        $$0.a(dzs.cb, 60, 100);
        $$0.a(dzs.cd, 60, 100);
        $$0.a(dzs.uW, 60, 100);
        $$0.a(dzs.uX, 60, 100);
        $$0.a(dzs.ce, 60, 100);
        $$0.a(dzs.cf, 60, 100);
        $$0.a(dzs.cg, 60, 100);
        $$0.a(dzs.ch, 60, 100);
        $$0.a(dzs.ci, 60, 100);
        $$0.a(dzs.cj, 60, 100);
        $$0.a(dzs.ck, 60, 100);
        $$0.a(dzs.cl, 60, 100);
        $$0.a(dzs.cm, 60, 100);
        $$0.a(dzs.co, 60, 100);
        $$0.a(dzs.cc, 60, 100);
        $$0.a(dzs.ly, 60, 100);
        $$0.a(dzs.cn, 60, 100);
        $$0.a(dzs.tY, 60, 100);
        $$0.a(dzs.tZ, 60, 100);
        $$0.a(dzs.ua, 60, 100);
        $$0.a(dzs.et, 60, 100);
        $$0.a(dzs.bK, 30, 60);
        $$0.a(dzs.bL, 30, 60);
        $$0.a(dzs.bM, 30, 60);
        $$0.a(dzs.bN, 30, 60);
        $$0.a(dzs.bO, 30, 60);
        $$0.a(dzs.bP, 30, 60);
        $$0.a(dzs.bQ, 30, 60);
        $$0.a(dzs.bR, 30, 60);
        $$0.a(dzs.bS, 30, 60);
        $$0.a(dzs.bT, 30, 60);
        $$0.a(dzs.bU, 30, 60);
        $$0.a(dzs.bV, 30, 60);
        $$0.a(dzs.bW, 30, 60);
        $$0.a(dzs.bX, 30, 60);
        $$0.a(dzs.bY, 30, 60);
        $$0.a(dzs.bZ, 30, 60);
        $$0.a(dzs.fN, 15, 100);
        $$0.a(dzs.jt, 5, 5);
        $$0.a(dzs.jb, 60, 20);
        $$0.a(dzs.qd, 15, 20);
        $$0.a(dzs.jc, 60, 20);
        $$0.a(dzs.jd, 60, 20);
        $$0.a(dzs.je, 60, 20);
        $$0.a(dzs.jf, 60, 20);
        $$0.a(dzs.jg, 60, 20);
        $$0.a(dzs.jh, 60, 20);
        $$0.a(dzs.ji, 60, 20);
        $$0.a(dzs.jj, 60, 20);
        $$0.a(dzs.jk, 60, 20);
        $$0.a(dzs.jl, 60, 20);
        $$0.a(dzs.jm, 60, 20);
        $$0.a(dzs.jn, 60, 20);
        $$0.a(dzs.jo, 60, 20);
        $$0.a(dzs.jp, 60, 20);
        $$0.a(dzs.jq, 60, 20);
        $$0.a(dzs.jr, 60, 20);
        $$0.a(dzs.uT, 5, 100);
        $$0.a(dzs.uU, 5, 100);
        $$0.a(dzs.uV, 5, 100);
        $$0.a(dzs.na, 30, 60);
        $$0.a(dzs.nW, 60, 60);
        $$0.a(dzs.oP, 60, 60);
        $$0.a(dzs.oX, 30, 20);
        $$0.a(dzs.qc, 5, 20);
        $$0.a(dzs.pg, 60, 100);
        $$0.a(dzs.qf, 5, 20);
        $$0.a(dzs.qe, 30, 20);
        $$0.a(dzs.aT, 30, 60);
        $$0.a(dzs.aU, 30, 60);
        $$0.a(dzs.tS, 15, 60);
        $$0.a(dzs.tT, 15, 60);
        $$0.a(dzs.tU, 60, 100);
        $$0.a(dzs.tV, 30, 60);
        $$0.a(dzs.tW, 30, 60);
        $$0.a(dzs.uc, 60, 100);
        $$0.a(dzs.ud, 60, 100);
        $$0.a(dzs.ue, 60, 100);
        $$0.a(dzs.uf, 30, 60);
        $$0.a(dzs.fO, 15, 100);
        $$0.a(dzs.va, 60, 100);
        $$0.a(dzs.bD, 60, 100);
        $$0.a(dzs.cx, 30, 20);
        $$0.a(dzs.cy, 30, 20);
        $$0.a(dzs.cz, 30, 20);
        $$0.a(dzs.cA, 30, 20);
        $$0.a(dzs.cC, 30, 20);
        $$0.a(dzs.cD, 30, 20);
        $$0.a(dzs.cE, 30, 20);
        $$0.a(dzs.cF, 30, 20);
        $$0.a(dzs.cG, 30, 20);
        $$0.a(dzs.cH, 30, 20);
    }
}

