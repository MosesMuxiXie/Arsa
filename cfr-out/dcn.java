/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class dcn
extends czz {
    private static final amo a = amo.b("baby");
    private static final ciq f = new ciq(a, 0.5, ciq.a.b);
    private static final amo cv = amo.b("reinforcement_caller_charge");
    private static final ciq cw = new ciq(amo.b("reinforcement_callee_charge"), -0.05f, ciq.a.a);
    private static final amo cx = amo.b("leader_zombie_bonus");
    private static final amo cy = amo.b("zombie_random_spawn_bonus");
    private static final alw<Boolean> cz = ama.a(dcn.class, aly.k);
    private static final alw<Integer> cA = ama.a(dcn.class, aly.b);
    private static final alw<Boolean> cB = ama.a(dcn.class, aly.k);
    public static final float b = 0.05f;
    public static final int c = 50;
    public static final int d = 40;
    public static final int e = 7;
    private static final int cC = -1;
    private static final cgn cD = cgu.bW.n().a(0.5f).b(0.93f);
    private static final float cE = 0.1f;
    private static final Predicate<ccz> cF = $$0 -> $$0 == ccz.d;
    private static final boolean cG = false;
    private static final boolean cH = false;
    private static final int cI = 0;
    private final cnx cJ = new cnx(this, cF);
    private boolean cK = false;
    private int cL = 0;
    private int cM;

    public dcn(cgu<? extends dcn> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
    }

    public dcn(dwo $$0) {
        this((cgu<? extends dcn>)cgu.bW, $$0);
    }

    @Override
    protected void D() {
        this.cs.a(4, new a((cht)this, 1.0, 3));
        this.cs.a(8, new cox(this, ddm.class, 8.0f));
        this.cs.a(8, new cpk(this));
        this.p();
    }

    protected void p() {
        this.cs.a(2, new cpv<dcn>(this, 1.0, 1.0, 10.0f, 2.0f));
        this.cs.a(3, new cqf(this, 1.0, false));
        this.cs.a(6, new cpb(this, 1.0, true, 4, this::gX));
        this.cs.a(7, new cqd(this, 1.0));
        this.ct.a(1, new cqi(this, new Class[0]).a(dcp.class));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
        this.ct.a(3, new cqj<dcw>((chn)this, dcw.class, false));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, true));
        this.ct.a(5, new cqj<cxs>(this, cxs.class, 10, true, false, cxs.cv));
    }

    public static cir.a gT() {
        return czz.gW().a(cis.o, 35.0).a(cis.x, 0.23f).a(cis.d, 3.0).a(cis.b, 2.0).a(cis.C);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cz, false);
        $$0.a(cA, 0);
        $$0.a(cB, false);
    }

    public boolean gU() {
        return this.aD().a(cB);
    }

    public boolean gX() {
        return this.cK;
    }

    public void y(boolean $$0) {
        if (this.cr.c()) {
            if (this.cK != $$0) {
                this.cK = $$0;
                this.cr.e($$0);
                if ($$0) {
                    this.cs.a(1, this.cJ);
                } else {
                    this.cs.a(this.cJ);
                }
            }
        } else if (this.cK) {
            this.cs.a(this.cJ);
            this.cK = false;
        }
    }

    @Override
    public boolean e_() {
        return this.aD().a(cz);
    }

    @Override
    protected int f(axf $$0) {
        if (this.e_()) {
            this.cn = (int)((double)this.cn * 2.5);
        }
        return super.f($$0);
    }

    @Override
    public void a_(boolean $$0) {
        this.aD().a(cz, $$0);
        if (this.ao() != null && !this.ao().B_()) {
            cio $$1 = this.h(cis.x);
            $$1.c(a);
            if ($$0) {
                $$1.b(f);
            }
        }
    }

    @Override
    public void a(alw<?> $$0) {
        if (cz.equals($$0)) {
            this.j_();
        }
        super.a($$0);
    }

    protected boolean gR() {
        return true;
    }

    @Override
    public void g() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            if (this.cb() && !this.gG()) {
                if (this.gU()) {
                    --this.cM;
                    if (this.cM < 0) {
                        this.h($$0);
                    }
                } else if (this.gR()) {
                    if (((cgk)this).a(bdv.a)) {
                        ++this.cL;
                        if (this.cL >= 600) {
                            this.d(300);
                        }
                    } else {
                        this.cL = -1;
                    }
                }
            }
        }
        super.g();
    }

    private void d(int $$0) {
        this.cM = $$0;
        this.aD().a(cB, true);
    }

    protected void h(axf $$0) {
        this.a($$0, cgu.O);
        if (!this.bq()) {
            $$0.a(null, 1040, this.dK(), 0);
        }
    }

    protected void a(axf $$0, cgu<? extends dcn> $$12) {
        this.a($$12, cge.a(this, true, true), (T $$1) -> $$1.L($$0.c($$1.dK()).d()));
    }

    @VisibleForTesting
    public boolean a(axf $$0, dcx $$1) {
        dco $$22 = $$1.a(cgu.bZ, cge.a($$1, true, true), (T $$2) -> {
            $$2.a((dxf)$$0, $$0.c($$2.dK()), cgt.i, new b(false, true));
            $$2.a($$1.gZ());
            $$2.a($$1.he().d());
            $$2.a($$1.b().a());
            $$2.r($$1.d());
            if (!this.bq()) {
                $$0.a(null, 1026, this.dK(), 0);
            }
        });
        return $$22 != null;
    }

    protected boolean af_() {
        return true;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (!super.a($$0, $$1, $$2)) {
            return false;
        }
        chl $$3 = this.ag_();
        if ($$3 == null && $$1.d() instanceof chl) {
            $$3 = (chl)$$1.d();
        }
        if ($$3 != null && $$0.av() == ccz.d && (double)this.as.i() < this.i(cis.C) && $$0.O()) {
            int $$4 = bgj.c(this.dP());
            int $$5 = bgj.c(this.dR());
            int $$6 = bgj.c(this.dV());
            cgu<? extends dcn> $$7 = this.ay();
            dcn $$8 = $$7.a($$0, cgt.j);
            if ($$8 == null) {
                return true;
            }
            for (int $$9 = 0; $$9 < 50; ++$$9) {
                int $$12;
                int $$11;
                int $$10 = $$4 + bgj.a(this.as, 7, 40) * bgj.a(this.as, -1, 1);
                is $$13 = new is($$10, $$11 = $$5 + bgj.a(this.as, 7, 40) * bgj.a(this.as, -1, 1), $$12 = $$6 + bgj.a(this.as, 7, 40) * bgj.a(this.as, -1, 1));
                if (!cih.a($$7, $$0, $$13) || !cih.a($$7, $$0, cgt.j, $$13, $$0.y)) continue;
                $$8.a_($$10, $$11, $$12);
                if ($$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) || !$$0.f($$8) || !$$0.g($$8) || !$$8.gQ() && $$0.d($$8.dj())) continue;
                $$8.g($$3);
                $$8.a((dxf)$$0, $$0.c($$8.dK()), cgt.j, null);
                $$0.a_($$8);
                cio $$14 = this.h(cis.C);
                ciq $$15 = $$14.a(cv);
                double $$16 = $$15 != null ? $$15.b() : 0.0;
                $$14.c(cv);
                $$14.d(new ciq(cv, $$16 - 0.05, ciq.a.a));
                $$8.h(cis.C).d(cw);
                break;
            }
        }
        return true;
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        boolean $$2 = super.c($$0, $$1);
        if ($$2) {
            float $$3 = $$0.c(this.dK()).b();
            if (this.fx().f() && this.cp() && this.as.i() < $$3 * 0.3f) {
                $$1.e((float)(2 * (int)$$3));
            }
        }
        return $$2;
    }

    @Override
    protected bcz W() {
        return bda.GG;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.GS;
    }

    @Override
    protected bcz fd() {
        return bda.GL;
    }

    protected bcz gP() {
        return bda.Hk;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(this.gP(), 0.15f, 1.0f);
    }

    public cgu<? extends dcn> ay() {
        return super.ay();
    }

    protected boolean gQ() {
        return false;
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        super.a($$0, $$1);
        float f2 = $$0.i();
        float f3 = this.ao().av() == ccz.d ? 0.05f : 0.01f;
        if (f2 < f3) {
            int $$2 = $$0.a(6);
            if ($$2 == 0) {
                this.a(cgv.a, new dlt(dlx.qH));
            } else if ($$2 == 1) {
                this.a(cgv.a, new dlt(dlx.xL));
            } else {
                this.a(cgv.a, new dlt(dlx.qI));
            }
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("IsBaby", this.e_());
        $$0.a("CanBreakDoors", this.gX());
        $$0.a("InWaterTime", this.by() ? this.cL : -1);
        $$0.a("DrownedConversionTime", this.gU() ? this.cM : -1);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a_($$0.a("IsBaby", false));
        this.y($$0.a("CanBreakDoors", false));
        this.cL = $$0.a("InWaterTime", 0);
        int $$1 = $$0.a("DrownedConversionTime", -1);
        if ($$1 != -1) {
            this.d($$1);
        } else {
            this.aD().a(cB, false);
        }
    }

    @Override
    public boolean a(axf $$0, chl $$1, cex $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        if (($$0.av() == ccz.c || $$0.av() == ccz.d) && $$1 instanceof dcx) {
            dcx $$4 = (dcx)$$1;
            if ($$0.av() != ccz.d && this.as.h()) {
                return $$3;
            }
            if (this.a($$0, $$4)) {
                $$3 = false;
            }
        }
        return $$3;
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cD : super.b($$0);
    }

    @Override
    public boolean h(dlt $$0) {
        if ($$0.a(bdy.az) && this.e_() && this.cq()) {
            return false;
        }
        return super.h($$0);
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        if ($$1.a(dlx.tk)) {
            return false;
        }
        return super.c($$0, $$1);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        $$3 = super.a($$0, $$1, $$2, $$3);
        float $$5 = $$1.d();
        if ($$2 != cgt.i) {
            this.b_($$4.i() < 0.55f * $$5);
        }
        if ($$3 == null) {
            $$3 = new b(dcn.a($$4), true);
        }
        if ($$3 instanceof b) {
            b $$6 = (b)$$3;
            if ($$6.b) {
                this.a_(true);
                if ($$6.c) {
                    cuc $$9;
                    if ((double)$$4.i() < 0.05) {
                        List<cgk> $$7 = $$0.a(cuc.class, this.dj().c(5.0, 3.0, 5.0), cgs.c);
                        if (!$$7.isEmpty()) {
                            cuc $$8 = (cuc)$$7.get(0);
                            $$8.x(true);
                            this.a((cgk)$$8, false, false);
                        }
                    } else if ((double)$$4.i() < 0.05 && ($$9 = cgu.C.a(this.ao(), cgt.g)) != null) {
                        $$9.b(this.dP(), this.dR(), this.dV(), this.ec(), 0.0f);
                        $$9.a($$0, $$1, cgt.g, null);
                        $$9.x(true);
                        this.a((cgk)$$9, false, false);
                        $$0.b($$9);
                    }
                }
            }
            this.y($$4.i() < $$5 * 0.1f);
            if ($$2 != cgt.i) {
                this.a($$4, $$1);
                this.a($$0, $$4, $$1);
            }
        }
        if (this.a(cgv.f).f() && bhd.b() && $$4.i() < 0.25f) {
            this.a(cgv.f, new dlt($$4.i() < 0.1f ? dzs.eK : dzs.eJ));
            this.a(cgv.f, 0.0f);
        }
        this.L($$5);
        return $$3;
    }

    @VisibleForTesting
    public void a(int $$0) {
        this.cL = $$0;
    }

    @VisibleForTesting
    public void b(int $$0) {
        this.cM = $$0;
    }

    public static boolean a(bgr $$0) {
        return $$0.i() < 0.05f;
    }

    protected void L(float $$0) {
        this.gY();
        this.h(cis.r).c(new ciq(ch, this.as.j() * (double)0.05f, ciq.a.a));
        double $$1 = this.as.j() * 1.5 * (double)$$0;
        if ($$1 > 1.0) {
            this.h(cis.o).c(new ciq(cy, $$1, ciq.a.c));
        }
        if (this.as.i() < $$0 * 0.05f) {
            this.h(cis.C).c(new ciq(cx, this.as.j() * 0.25 + 0.5, ciq.a.a));
            this.h(cis.u).c(new ciq(cx, this.as.j() * 3.0 + 1.0, ciq.a.c));
            this.y(true);
        }
    }

    protected void gY() {
        this.h(cis.C).a(this.as.j() * (double)0.1f);
    }

    class a
    extends cpr {
        a(cht $$0, double $$1, int $$2) {
            super(dzs.nb, $$0, $$1, $$2);
        }

        @Override
        public void a(dwp $$0, is $$1) {
            $$0.a(null, $$1, bda.GM, bdb.f, 0.5f, 0.9f + dcn.this.as.i() * 0.2f);
        }

        @Override
        public void a(dwo $$0, is $$1) {
            $$0.a(null, $$1, bda.DA, bdb.e, 0.7f, 0.9f + $$0.y.i() * 0.2f);
        }

        @Override
        public double i() {
            return 1.14;
        }
    }

    public static class b
    implements cie {
        public final boolean b;
        public final boolean c;

        public b(boolean $$0, boolean $$1) {
            this.b = $$0;
            this.c = $$1;
        }
    }
}

