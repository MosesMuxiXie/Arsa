/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class dad
extends dfi {
    private static final Predicate<cgk> e = $$0 -> !($$0 instanceof dad) && $$0.cb();
    private static final Predicate<cgk> f = $$0 -> e.test((cgk)$$0) && !$$0.ay().equals(cgu.h);
    private static final Predicate<chl> cv = $$0 -> !($$0 instanceof dad) && $$0.cb() && $$0.dv();
    private static final double cw = 0.3;
    private static final double cx = 0.35;
    private static final int cy = 8356754;
    private static final float cz = 0.57254905f;
    private static final float cA = 0.5137255f;
    private static final float cB = 0.49803922f;
    public static final int a = 10;
    public static final int b = 40;
    private static final int cC = 0;
    private static final int cD = 0;
    private static final int cE = 0;
    private int cF = 0;
    private int cG = 0;
    private int cH = 0;

    public dad(cgu<? extends dad> $$0, dwo $$1) {
        super((cgu<? extends dfi>)$$0, $$1);
        this.cn = 20;
        this.a(fls.v, 0.0f);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new coh(this));
        this.cs.a(4, new coz(this, 1.0, true));
        this.cs.a(5, new cqd(this, 0.4));
        this.cs.a(6, new cox(this, ddm.class, 6.0f));
        this.cs.a(10, new cox(this, chn.class, 8.0f));
        this.ct.a(2, new cqi(this, dfi.class).a(new Class[0]));
        this.ct.a(3, new cqj<ddm>((chn)this, ddm.class, true));
        this.ct.a(4, new cqj<dcw>((chn)this, dcw.class, true, ($$0, $$1) -> !$$0.e_()));
        this.ct.a(4, new cqj<cwh>((chn)this, cwh.class, true));
    }

    @Override
    protected void V() {
        boolean $$0 = !(this.dl() instanceof chn) || this.dl().ay().a(bdt.c);
        boolean $$1 = !(this.dz() instanceof dgb);
        this.cs.a(cop.a.a, $$0);
        this.cs.a(cop.a.c, $$0 && $$1);
        this.cs.a(cop.a.b, $$0);
        this.cs.a(cop.a.d, $$0);
    }

    public static cir.a gP() {
        return czz.gW().a(cis.u, 100.0).a(cis.x, 0.3).a(cis.r, 0.75).a(cis.d, 12.0).a(cis.e, 1.5).a(cis.o, 32.0).a(cis.D, 1.0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("AttackTick", this.cF);
        $$0.a("StunTick", this.cG);
        $$0.a("RoarTick", this.cH);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.cF = $$0.a("AttackTick", 0);
        this.cG = $$0.a("StunTick", 0);
        this.cH = $$0.a("RoarTick", 0);
    }

    @Override
    public bcz gX() {
        return bda.xQ;
    }

    @Override
    public int ae() {
        return 45;
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.cb()) {
            return;
        }
        if (this.fE()) {
            this.h(cis.x).a(0.0);
        } else {
            double $$0 = this.ag_() != null ? 0.35 : 0.3;
            double $$1 = this.h(cis.x).b();
            this.h(cis.x).a(bgj.d(0.1, $$1, $$0));
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            if (this.ad && $$2.U().a(eua.F).booleanValue()) {
                boolean $$3 = false;
                fth $$4 = this.dj().g(0.2);
                for (is $$5 : is.b(bgj.c($$4.a), bgj.c($$4.b), bgj.c($$4.c), bgj.c($$4.d), bgj.c($$4.e), bgj.c($$4.f))) {
                    eoh $$6 = $$2.a_($$5);
                    dzq $$7 = $$6.b();
                    if (!($$7 instanceof eei)) continue;
                    $$3 = $$2.a($$5, true, (cgk)this) || $$3;
                }
                if (!$$3 && this.aV()) {
                    this.u();
                }
            }
        }
        if (this.cH > 0) {
            --this.cH;
            if (this.cH == 10) {
                this.hc();
            }
        }
        if (this.cF > 0) {
            --this.cF;
        }
        if (this.cG > 0) {
            --this.cG;
            this.hb();
            if (this.cG == 0) {
                this.a(bda.xV, 1.0f, 1.0f);
                this.cH = 20;
            }
        }
    }

    private void hb() {
        if (this.as.a(6) == 0) {
            double $$0 = this.dP() - (double)this.dF() * Math.sin(this.bC * ((float)Math.PI / 180)) + (this.as.j() * 0.6 - 0.3);
            double $$1 = this.dR() + (double)this.dG() - 0.3;
            double $$2 = this.dV() + (double)this.dF() * Math.cos(this.bC * ((float)Math.PI / 180)) + (this.as.j() * 0.6 - 0.3);
            this.ao().a(lq.a(ly.v, 0.49803922f, 0.5137255f, 0.57254905f), $$0, $$1, $$2, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected boolean fE() {
        return super.fE() || this.cF > 0 || this.cG > 0 || this.cH > 0;
    }

    @Override
    public boolean G(cgk $$0) {
        if (this.cG > 0 || this.cH > 0) {
            return false;
        }
        return super.G($$0);
    }

    @Override
    protected void d(chl $$0) {
        if (this.cH == 0) {
            if (this.as.j() < 0.5) {
                this.cG = 40;
                this.a(bda.xU, 1.0f, 1.0f);
                this.ao().a((cgk)this, (byte)39);
                $$0.h(this);
            } else {
                this.H($$0);
            }
            $$0.ah = true;
        }
    }

    private void hc() {
        dwo dwo2;
        if (this.cb() && (dwo2 = this.ao()) instanceof axf) {
            axf $$0 = (axf)dwo2;
            Predicate<cgk> $$1 = $$0.U().a(eua.F) != false ? e : f;
            List<cgk> $$2 = this.ao().a(chl.class, this.dj().g(4.0), $$1);
            for (chl chl2 : $$2) {
                if (!(chl2 instanceof dba)) {
                    chl2.a($$0, this.en().b(this), 6.0f);
                }
                if (chl2 instanceof ddm) continue;
                this.H(chl2);
            }
            this.c(etk.u);
            $$0.a((cgk)this, (byte)69);
        }
    }

    private void hl() {
        List<chl> $$0 = this.ao().a(chl.class, this.dj().g(4.0), cv);
        for (chl $$1 : $$0) {
            this.H($$1);
        }
    }

    private void H(cgk $$0) {
        double $$1 = $$0.dP() - this.dP();
        double $$2 = $$0.dV() - this.dV();
        double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
        $$0.i($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.cF = 10;
            this.a(bda.xP, 1.0f, 1.0f);
        } else if ($$0 == 39) {
            this.cG = 40;
        } else if ($$0 == 69) {
            this.hm();
            this.hl();
        }
        super.b($$0);
    }

    private void hm() {
        ftm $$0 = this.dj().f();
        for (int $$1 = 0; $$1 < 40; ++$$1) {
            double $$2 = this.as.k() * 0.2;
            double $$3 = this.as.k() * 0.2;
            double $$4 = this.as.k() * 0.2;
            this.ao().a(ly.af, $$0.g, $$0.h, $$0.i, $$2, $$3, $$4);
        }
    }

    public int gY() {
        return this.cF;
    }

    public int gZ() {
        return this.cG;
    }

    public int ha() {
        return this.cH;
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        this.cF = 10;
        $$0.a((cgk)this, (byte)4);
        this.a(bda.xP, 1.0f, 1.0f);
        return super.c($$0, $$1);
    }

    @Override
    protected @Nullable bcz W() {
        return bda.xO;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.xS;
    }

    @Override
    protected bcz fd() {
        return bda.xR;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.xT, 0.15f, 1.0f);
    }

    @Override
    public boolean a(dwr $$0) {
        return !$$0.d(this.dj());
    }

    @Override
    public void a(axf $$0, int $$1, boolean $$2) {
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    protected fth j(double $$0) {
        fth $$1 = super.j($$0);
        return $$1.f(0.05, 0.0, 0.05);
    }
}

