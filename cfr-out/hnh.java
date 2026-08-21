/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hnh
extends hne {
    public static final Logger a = LogUtils.getLogger();
    private static final int cC = 20;
    private static final int cD = 600;
    private static final int cE = 100;
    private static final float cF = 0.6f;
    private static final double cG = 0.35;
    private static final double cH = 0.13962633907794952;
    public final hig b;
    private final bdl cI;
    private final geu cJ;
    private final bhl cK = new bhl(20, 1280);
    private final List<iou> cL = Lists.newArrayList();
    private bbn cM = bbn.g;
    private double cN;
    private double cO;
    private double cP;
    private float cQ;
    private float cR;
    private boolean cU;
    private boolean cV;
    private boolean cW;
    private boolean cX;
    private int cY;
    private boolean cZ;
    public hnf c = new hnf();
    private ddk da;
    protected final gfj d;
    protected int e;
    private static final int db = Integer.MIN_VALUE;
    private static final int dc = -2147483647;
    public int f = Integer.MIN_VALUE;
    public float g;
    public float h;
    public float i;
    public float j;
    private int dd;
    private float de;
    public float k;
    public float cB;
    private boolean df;
    private @Nullable cdb dg;
    private boolean dh;
    private boolean di = true;
    private int dj;
    private boolean dk;
    private int dl;
    private boolean dm = true;
    private boolean dn = false;

    public hnh(gfj $$0, hif $$1, hig $$2, bdl $$3, geu $$4, ddk $$5, boolean $$6) {
        super($$1, $$2.r());
        this.d = $$0;
        this.b = $$2;
        this.cI = $$3;
        this.cJ = $$4;
        this.da = $$5;
        this.cX = $$6;
        this.cL.add(new ipo(this, $$0.ap()));
        this.cL.add(new ioz(this));
        this.cL.add(new ioy(this, $$0.ap()));
    }

    @Override
    public void d(float $$0) {
    }

    @Override
    public boolean a(cgk $$0, boolean $$1, boolean $$2) {
        if (!super.a($$0, $$1, $$2)) {
            return false;
        }
        if ($$0 instanceof dgi) {
            dgi $$3 = (dgi)$$0;
            this.d.ap().a((ipm)new ipg(this, $$3, true, bda.qZ, 0.0f, 0.75f, 1.0f));
            this.d.ap().a((ipm)new ipg(this, $$3, false, bda.ra, 0.0f, 0.75f, 1.0f));
        } else if ($$0 instanceof cwk) {
            cwk $$4 = (cwk)$$0;
            this.d.ap().a((ipm)new ipf(this, $$4, false, bda.nB, $$4.dB(), 0.0f, 1.0f, 5.0f));
        } else if ($$0 instanceof cwn) {
            cwn $$5 = (cwn)$$0;
            this.d.ap().a((ipm)new ipf(this, $$5, true, bda.bl, $$5.dB(), 0.0f, 1.0f, 5.0f));
        }
        return true;
    }

    @Override
    public void ad() {
        super.ad();
        this.dh = false;
    }

    @Override
    public float i(float $$0) {
        return this.ee();
    }

    @Override
    public float j(float $$0) {
        if (this.cq()) {
            return super.j($$0);
        }
        return this.ec();
    }

    @Override
    public void g() {
        if (!this.b.K()) {
            return;
        }
        this.cK.b();
        super.g();
        if (!this.da.equals(this.c.a)) {
            this.b.b(new ajk(this.c.a));
            this.da = this.c.a;
        }
        if (this.cq()) {
            this.b.b(new ajb.c(this.ec(), this.ee(), this.aV(), this.ad));
            cgk $$0 = this.du();
            if ($$0 != this && $$0.dv()) {
                this.b.b(ajc.a($$0));
                this.R();
            }
        } else {
            this.Q();
        }
        for (iou $$1 : this.cL) {
            $$1.a();
        }
    }

    public float n() {
        for (iou $$0 : this.cL) {
            if (!($$0 instanceof ioy)) continue;
            return ((ioy)$$0).b();
        }
        return 0.0f;
    }

    private void Q() {
        this.R();
        if (this.F()) {
            boolean $$6;
            double $$0 = this.dP() - this.cN;
            double $$1 = this.dR() - this.cO;
            double $$2 = this.dV() - this.cP;
            double $$3 = this.ec() - this.cQ;
            double $$4 = this.ee() - this.cR;
            ++this.cY;
            boolean $$5 = bgj.f($$0, $$1, $$2) > bgj.n(2.0E-4) || this.cY >= 20;
            boolean bl2 = $$6 = $$3 != 0.0 || $$4 != 0.0;
            if ($$5 && $$6) {
                this.b.b(new ajb.b(this.dI(), this.ec(), this.ee(), this.aV(), this.ad));
            } else if ($$5) {
                this.b.b(new ajb.a(this.dI(), this.aV(), this.ad));
            } else if ($$6) {
                this.b.b(new ajb.c(this.ec(), this.ee(), this.aV(), this.ad));
            } else if (this.cU != this.aV() || this.cV != this.ad) {
                this.b.b(new ajb.d(this.aV(), this.ad));
            }
            if ($$5) {
                this.cN = this.dP();
                this.cO = this.dR();
                this.cP = this.dV();
                this.cY = 0;
            }
            if ($$6) {
                this.cQ = this.ec();
                this.cR = this.ee();
            }
            this.cU = this.aV();
            this.cV = this.ad;
            this.di = this.d.k.T().b();
        }
    }

    private void R() {
        boolean $$0 = this.cA();
        if ($$0 != this.cX) {
            ajj.a $$1 = $$0 ? ajj.a.b : ajj.a.c;
            this.b.b(new ajj(this, $$1));
            this.cX = $$0;
        }
    }

    public boolean b(boolean $$0) {
        aji.a $$1 = $$0 ? aji.a.d : aji.a.e;
        dlt $$2 = this.gK().a($$0);
        this.b.b(new aji($$1, is.c, iz.a));
        return !$$2.f();
    }

    @Override
    public void a(cdb $$0) {
        super.a($$0);
        this.b.b(new akb($$0));
    }

    public void o() {
        this.b.b(new ain(ain.a.a));
        gfh.d();
    }

    @Override
    public void r() {
        this.b.b(new ait(this.cn.l));
        this.p();
    }

    public void p() {
        super.r();
        this.d.a((gsb)null);
    }

    public void L(float $$0) {
        if (this.cZ) {
            float $$1 = this.eZ() - $$0;
            if ($$1 <= 0.0f) {
                this.x($$0);
                if ($$1 < 0.0f) {
                    this.ax = 10;
                }
            } else {
                this.bL = $$1;
                this.ax = 20;
                this.x($$0);
                this.bu = this.bv = 10;
            }
        } else {
            this.x($$0);
            this.cZ = true;
        }
    }

    @Override
    public void z() {
        this.b.b(new ajh(this.gL()));
    }

    @Override
    public void v(boolean $$0) {
        super.v($$0);
        this.d.m.e();
    }

    @Override
    public boolean gH() {
        return true;
    }

    @Override
    public boolean gi() {
        return !this.gL().b && super.gi();
    }

    @Override
    public boolean bL() {
        return !this.gL().b && super.bL();
    }

    protected void v() {
        this.b.b(new ajj(this, ajj.a.d, bgj.b(this.D() * 100.0f)));
    }

    public void w() {
        this.b.b(new ajj(this, ajj.a.f));
    }

    public bdl x() {
        return this.cI;
    }

    public geu y() {
        return this.cJ;
    }

    public void a(dsa $$0) {
        if (this.cJ.b($$0)) {
            this.cJ.c($$0);
            this.b.b(new ajn($$0));
        }
    }

    @Override
    public bbn I() {
        return this.cM;
    }

    public void a(bbn $$0) {
        this.cM = $$0;
    }

    @Override
    public void a(yh $$0, boolean $$1) {
        this.d.ba().a($$0, $$1);
    }

    private void c(double $$0, double $$1) {
        iz[] $$7;
        is $$2 = is.a($$0, this.dR(), $$1);
        if (!this.c($$2)) {
            return;
        }
        double $$3 = $$0 - (double)$$2.u();
        double $$4 = $$1 - (double)$$2.w();
        iz $$5 = null;
        double $$6 = Double.MAX_VALUE;
        for (iz $$8 : $$7 = new iz[]{iz.e, iz.f, iz.c, iz.d}) {
            double $$10;
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double d2 = $$10 = $$8.f() == iz.b.a ? 1.0 - $$9 : $$9;
            if (!($$10 < $$6) || this.c($$2.a($$8))) continue;
            $$6 = $$10;
            $$5 = $$8;
        }
        if ($$5 != null) {
            ftm $$11 = this.dN();
            if ($$5.o() == iz.a.a) {
                this.m(0.1 * (double)$$5.j(), $$11.h, $$11.i);
            } else {
                this.m($$11.g, $$11.h, 0.1 * (double)$$5.l());
            }
        }
    }

    private boolean c(is $$0) {
        fth $$1 = this.dj();
        fth $$2 = new fth($$0.u(), $$1.b, $$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
        return this.ao().i(this, $$2);
    }

    public void a(float $$0, int $$1, int $$2) {
        if ($$0 != this.cu) {
            this.S();
        }
        this.cu = $$0;
        this.ct = $$1;
        this.cs = $$2;
    }

    private void S() {
        this.f = this.f == Integer.MIN_VALUE ? -2147483647 : this.at;
    }

    @Override
    public void b(byte $$0) {
        switch ($$0) {
            case 24: {
                this.a(bbn.g);
                break;
            }
            case 25: {
                this.a(bbh.b);
                break;
            }
            case 26: {
                this.a(bbh.c);
                break;
            }
            case 27: {
                this.a(bbh.d);
                break;
            }
            case 28: {
                this.a(bbh.e);
                break;
            }
            default: {
                super.b($$0);
            }
        }
    }

    public void x(boolean $$0) {
        this.dm = $$0;
    }

    public boolean A() {
        return this.dm;
    }

    public void y(boolean $$0) {
        this.dn = $$0;
    }

    public boolean B() {
        return this.dn;
    }

    @Override
    public void a(bcz $$0, float $$1, float $$2) {
        this.ao().a(this.dP(), this.dR(), this.dV(), $$0, this.dB(), $$1, $$2, false);
    }

    @Override
    public void c(cdb $$0) {
        dlt $$1 = this.b($$0);
        if ($$1.f() || this.fZ()) {
            return;
        }
        super.c($$0);
        this.df = true;
        this.dg = $$0;
    }

    @Override
    public boolean fZ() {
        return this.df;
    }

    private boolean T() {
        return this.fZ() && !this.bT.a(ki.g, dph.a).a();
    }

    private float U() {
        return this.bT.a(ki.g, dph.a).c();
    }

    @Override
    public void gf() {
        super.gf();
        this.df = false;
    }

    @Override
    public cdb ga() {
        return Objects.requireNonNullElse(this.dg, cdb.a);
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (bk.equals($$0)) {
            cdb $$2;
            boolean $$1 = ((Byte)this.az.a(bk) & 1) > 0;
            cdb cdb2 = $$2 = ((Byte)this.az.a(bk) & 2) > 0 ? cdb.b : cdb.a;
            if ($$1 && !this.df) {
                this.c($$2);
            } else if (!$$1 && this.df) {
                this.gf();
            }
        }
        if (aA.equals($$0) && this.gj() && !this.dk) {
            this.d.ap().a((ipm)new ipb(this));
        }
    }

    public @Nullable chv C() {
        chv $$0;
        cgk cgk2 = this.dA();
        return cgk2 instanceof chv && ($$0 = (chv)((Object)cgk2)).a() ? $$0 : null;
    }

    public float D() {
        return this.de;
    }

    @Override
    public boolean Z() {
        return this.d.aW();
    }

    @Override
    public void a(ems $$0, boolean $$1) {
        if ($$0 instanceof emd) {
            emd $$2 = (emd)$$0;
            this.d.a(new gui($$2, $$1, this.d.aW()));
        } else {
            this.d.a(new guw($$0, $$1, this.d.aW()));
        }
    }

    @Override
    public void a(dgn $$0) {
        this.d.a(new gus($$0));
    }

    @Override
    public void a(elm $$0) {
        this.d.a(new gtv($$0));
    }

    @Override
    public void a(emx $$0) {
        this.d.a(new gva($$0));
    }

    @Override
    public void a(emy $$0) {
        this.d.a(new gvb($$0));
    }

    @Override
    public void a(emz $$0) {
        this.d.a(new gvc($$0));
    }

    @Override
    public void a(emg $$0) {
        this.d.a(new gun($$0));
    }

    @Override
    public void b(jd<asj> $$0) {
        this.b.a($$0, this.d.x);
    }

    @Override
    public void a(dlt $$0, cdb $$1) {
        dpk $$2 = $$0.a(ki.ab);
        if ($$2 != null) {
            this.d.a(new gtq(this, $$0, $$1, $$2));
        }
    }

    @Override
    public void b(cgk $$0) {
        this.d.f.a($$0, ly.g);
    }

    @Override
    public void c(cgk $$0) {
        this.d.f.a($$0, ly.s);
    }

    @Override
    public boolean cu() {
        return this.c.a.f();
    }

    @Override
    public boolean cz() {
        return this.cW;
    }

    public boolean E() {
        return this.cz() || this.cD();
    }

    @Override
    public void fQ() {
        if (this.F()) {
            ftl $$0 = this.a(this.c.b());
            this.bN = $$0.j;
            this.bP = $$0.k;
            this.bM = this.c.a.e();
            this.i = this.g;
            this.j = this.h;
            this.h += (this.ee() - this.h) * 0.5f;
            this.g += (this.ec() - this.g) * 0.5f;
        } else {
            super.fQ();
        }
    }

    private ftl a(ftl $$0) {
        if ($$0.c() == 0.0f) {
            return $$0;
        }
        ftl $$1 = $$0.a(0.98f);
        if (this.fZ() && !this.cq()) {
            $$1 = $$1.a(this.U());
        }
        if (this.E()) {
            float $$2 = (float)this.i(cis.B);
            $$1 = $$1.a($$2);
        }
        return hnh.b($$1);
    }

    private static ftl b(ftl $$0) {
        float $$1 = $$0.b();
        if ($$1 <= 0.0f) {
            return $$0;
        }
        ftl $$2 = $$0.a(1.0f / $$1);
        float $$3 = hnh.c($$2);
        float $$4 = Math.min($$1 * $$3, 1.0f);
        return $$2.a($$4);
    }

    private static float c(ftl $$0) {
        float $$1 = Math.abs($$0.j);
        float $$2 = Math.abs($$0.k);
        float $$3 = $$2 > $$1 ? $$1 / $$2 : $$2 / $$1;
        return bgj.a(1.0f + bgj.j($$3));
    }

    protected boolean F() {
        return this.d.au() == this;
    }

    public void G() {
        this.c(chx.a);
        if (this.ao() != null) {
            for (double $$0 = this.dR(); $$0 > (double)this.ao().K_() && $$0 <= (double)this.ao().aw(); $$0 += 1.0) {
                this.a_(this.dP(), $$0, this.dV());
                if (this.ao().g(this)) break;
            }
            this.k(ftm.c);
            this.w(0.0f);
        }
        this.x(this.fq());
        this.bw = 0;
    }

    @Override
    public void d_() {
        chv $$8;
        if (this.e > 0) {
            --this.e;
        }
        if (!(this.d.x instanceof grp)) {
            this.z(this.H() == efr.a.a);
            this.O();
        }
        boolean $$0 = this.c.a.e();
        boolean $$1 = this.c.a.f();
        boolean $$2 = this.c.c();
        ddi $$3 = this.gL();
        this.cW = !$$3.b && !this.cB() && !this.cq() && this.h(chx.f) && (this.cu() || !this.gr() && !this.h(chx.a));
        this.c.a();
        this.d.aH().a(this.c);
        boolean $$4 = false;
        if (this.dj > 0) {
            --this.dj;
            $$4 = true;
            this.c.d();
        }
        if (!this.ar) {
            this.c(this.dP() - (double)this.dF() * 0.35, this.dV() + (double)this.dF() * 0.35);
            this.c(this.dP() - (double)this.dF() * 0.35, this.dV() - (double)this.dF() * 0.35);
            this.c(this.dP() + (double)this.dF() * 0.35, this.dV() - (double)this.dF() * 0.35);
            this.c(this.dP() + (double)this.dF() * 0.35, this.dV() + (double)this.dF() * 0.35);
        }
        if ($$1 || this.T() && !this.cq() || this.c.a.b()) {
            this.e = 0;
        }
        if (this.aa()) {
            if (!$$2) {
                if (this.e > 0) {
                    this.i(true);
                } else {
                    this.e = this.d.k.au().b();
                }
            }
            if (this.c.a.g()) {
                this.i(true);
            }
        }
        if (this.cA()) {
            if (this.cB()) {
                if (this.W()) {
                    this.i(false);
                }
            } else if (this.V()) {
                this.i(false);
            }
        }
        boolean $$5 = false;
        if ($$3.c) {
            if (this.d.q.g()) {
                if (!$$3.b) {
                    $$3.b = true;
                    $$5 = true;
                    this.z();
                }
            } else if (!$$0 && this.c.a.e() && !$$4) {
                if (this.cp == 0) {
                    this.cp = 7;
                } else if (!(this.cB() || this.dz() != null && this.C() == null)) {
                    boolean bl2 = $$3.b = !$$3.b;
                    if ($$3.b && this.aV()) {
                        this.u();
                    }
                    $$5 = true;
                    this.z();
                    this.cp = 0;
                }
            }
        }
        if (this.c.a.e() && !$$5 && !$$0 && !this.fl() && this.gR()) {
            this.b.b(new ajj(this, ajj.a.g));
        }
        this.dk = this.gj();
        if (this.by() && this.c.a.f() && this.eG()) {
            this.fH();
        }
        if (((cgk)this).a(bdv.a)) {
            int $$6 = this.au() ? 10 : 1;
            this.dl = bgj.a(this.dl + $$6, 0, 600);
        } else if (this.dl > 0) {
            ((cgk)this).a(bdv.a);
            this.dl = bgj.a(this.dl - 10, 0, 600);
        }
        if ($$3.b && this.F()) {
            int $$7 = 0;
            if (this.c.a.f()) {
                --$$7;
            }
            if (this.c.a.e()) {
                ++$$7;
            }
            if ($$7 != 0) {
                this.k(this.dN().b(0.0, (float)$$7 * $$3.a() * 3.0f, 0.0));
            }
        }
        if (($$8 = this.C()) != null && $$8.c() == 0) {
            if (this.dd < 0) {
                ++this.dd;
                if (this.dd == 0) {
                    this.de = 0.0f;
                }
            }
            if ($$0 && !this.c.a.e()) {
                this.dd = -10;
                $$8.a(bgj.b(this.D() * 100.0f));
                this.v();
            } else if (!$$0 && this.c.a.e()) {
                this.dd = 0;
                this.de = 0.0f;
            } else if ($$0) {
                ++this.dd;
                this.de = this.dd < 10 ? (float)this.dd * 0.1f : 0.8f + 2.0f / (float)(this.dd - 9) * 0.1f;
            }
        } else {
            this.de = 0.0f;
        }
        super.d_();
        if (this.aV() && $$3.b && !this.d.q.g()) {
            $$3.b = false;
            this.z();
        }
    }

    private boolean V() {
        return !this.A(this.gL().b) || !this.c.c() || this.ad && !this.ag;
    }

    private boolean W() {
        return !this.A(true) || !this.by() || !this.c.c() && !this.aV() && !this.c.a.f();
    }

    public efr.a H() {
        return this.aG == null ? efr.a.b : this.aG.a();
    }

    @Override
    protected void eH() {
        ++this.bw;
        if (this.bw == 20) {
            this.a(cgk.e.a);
        }
    }

    private void z(boolean $$0) {
        this.cB = this.k;
        float $$1 = 0.0f;
        if ($$0 && this.aG != null && this.aG.e()) {
            if (this.d.x != null && !this.d.x.bb_()) {
                if (this.d.x instanceof gti) {
                    this.r();
                }
                this.d.a((gsb)null);
            }
            if (this.k == 0.0f) {
                this.d.ap().a(iph.b(bda.xv, this.as.i() * 0.4f + 0.8f, 0.25f));
            }
            $$1 = 0.0125f;
            this.aG.a(false);
        } else if (this.k > 0.0f) {
            $$1 = -0.05f;
        }
        this.k = bgj.a(this.k + $$1, 0.0f, 1.0f);
    }

    @Override
    public void t() {
        super.t();
        this.dh = false;
        cgk cgk2 = this.dA();
        if (cgk2 instanceof dgb) {
            dgb $$0 = (dgb)cgk2;
            $$0.a(this.c.a.c(), this.c.a.d(), this.c.a.a(), this.c.a.b());
            this.dh |= this.c.a.c() || this.c.a.d() || this.c.a.a() || this.c.a.b();
        }
    }

    public boolean J() {
        return this.dh;
    }

    @Override
    public void a(chp $$0, ftm $$1) {
        double $$2 = this.dP();
        double $$3 = this.dV();
        super.a($$0, $$1);
        float $$4 = (float)(this.dP() - $$2);
        float $$5 = (float)(this.dV() - $$3);
        this.f($$4, $$5);
        this.K(bgj.g($$4, $$5) * 0.6f);
    }

    public boolean K() {
        return this.di;
    }

    @Override
    public boolean hs() {
        return this.d.k.U().b();
    }

    protected void f(float $$02, float $$1) {
        if (!this.X()) {
            return;
        }
        ftm $$2 = this.dI();
        ftm $$3 = $$2.b($$02, 0.0, $$1);
        ftm $$4 = new ftm($$02, 0.0, $$1);
        float $$5 = this.fM();
        float $$6 = (float)$$4.h();
        if ($$6 <= 0.001f) {
            ftl $$7 = this.c.b();
            float $$8 = $$5 * $$7.j;
            float $$9 = $$5 * $$7.k;
            float $$10 = bgj.a((double)(this.ec() * ((float)Math.PI / 180)));
            float $$11 = bgj.b((double)(this.ec() * ((float)Math.PI / 180)));
            $$4 = new ftm($$8 * $$11 - $$9 * $$10, $$4.h, $$9 * $$11 + $$8 * $$10);
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001f) {
                return;
            }
        }
        float $$12 = bgj.h($$6);
        ftm $$13 = $$4.c((double)$$12);
        ftm $$14 = this.cm();
        float $$15 = (float)($$14.g * $$13.g + $$14.i * $$13.i);
        if ($$15 < -0.15f) {
            return;
        }
        ftr $$16 = ftr.a((cgk)this);
        is $$17 = is.a(this.dP(), this.dj().e, this.dV());
        eoh $$18 = this.ao().a_($$17);
        if (!$$18.b((dvt)this.ao(), $$17, $$16).c()) {
            return;
        }
        $$17 = $$17.d();
        eoh $$19 = this.ao().a_($$17);
        if (!$$19.b((dvt)this.ao(), $$17, $$16).c()) {
            return;
        }
        float $$20 = 7.0f;
        float $$21 = 1.2f;
        if (this.d(cfo.h)) {
            $$21 += (float)(this.e(cfo.h).e() + 1) * 0.75f;
        }
        float $$22 = Math.max($$5 * 7.0f, 1.0f / $$12);
        ftm $$23 = $$2;
        ftm $$24 = $$3.e($$13.c((double)$$22));
        float $$25 = this.dF();
        float $$26 = this.dG();
        fth $$27 = new fth($$23, $$24.b(0.0, $$26, 0.0)).c($$25, 0.0, $$25);
        $$23 = $$23.b(0.0, 0.51f, 0.0);
        $$24 = $$24.b(0.0, 0.51f, 0.0);
        ftm $$28 = $$13.c(new ftm(0.0, 1.0, 0.0));
        ftm $$29 = $$28.c((double)($$25 * 0.5f));
        ftm $$30 = $$23.d($$29);
        ftm $$31 = $$24.d($$29);
        ftm $$32 = $$23.e($$29);
        ftm $$33 = $$24.e($$29);
        Iterable<fug> $$34 = this.ao().f(this, $$27);
        Iterator $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0 -> $$0.e().stream()).iterator();
        float $$36 = Float.MIN_VALUE;
        while ($$35.hasNext()) {
            fth $$37 = (fth)$$35.next();
            if (!$$37.a($$30, $$31) && !$$37.a($$32, $$33)) continue;
            $$36 = (float)$$37.e;
            ftm $$38 = $$37.f();
            is $$39 = is.a($$38);
            int $$40 = 1;
            while ((float)$$40 < $$21) {
                is $$41 = $$39.b($$40);
                eoh $$42 = this.ao().a_($$41);
                fug $$43 = $$42.b((dvt)this.ao(), $$41, $$16);
                if (!$$43.c() && (double)($$36 = (float)$$43.c(iz.a.b) + (float)$$41.v()) - this.dR() > (double)$$21) {
                    return;
                }
                if ($$40 > 1) {
                    $$17 = $$17.d();
                    eoh $$44 = this.ao().a_($$17);
                    if (!$$44.b((dvt)this.ao(), $$17, $$16).c()) {
                        return;
                    }
                }
                ++$$40;
            }
            break block0;
        }
        if ($$36 == Float.MIN_VALUE) {
            return;
        }
        float $$45 = (float)((double)$$36 - this.dR());
        if ($$45 <= 0.5f || $$45 > $$21) {
            return;
        }
        this.dj = 1;
    }

    @Override
    protected boolean d(ftm $$0) {
        float $$1 = this.ec() * ((float)Math.PI / 180);
        double $$2 = bgj.a((double)$$1);
        double $$3 = bgj.b((double)$$1);
        double $$4 = (double)this.bN * $$3 - (double)this.bP * $$2;
        double $$5 = (double)this.bP * $$3 + (double)this.bN * $$2;
        double $$6 = bgj.n($$4) + bgj.n($$5);
        double $$7 = bgj.n($$0.g) + bgj.n($$0.i);
        if ($$6 < (double)1.0E-5f || $$7 < (double)1.0E-5f) {
            return false;
        }
        double $$8 = $$4 * $$0.g + $$5 * $$0.i;
        double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
        return $$9 < 0.13962633907794952;
    }

    private boolean X() {
        return this.K() && this.dj <= 0 && this.aV() && !this.gC() && !this.cq() && this.Y() && (double)this.bh() >= 1.0;
    }

    private boolean Y() {
        return this.c.b().c() > 0.0f;
    }

    private boolean A(boolean $$0) {
        return !this.hl() && (this.cq() ? this.d(this.dz()) : this.gV()) && ($$0 || !this.bD());
    }

    private boolean aa() {
        return !(this.cA() || !this.c.c() || !this.A(this.gL().b) || this.T() || this.gj() && !this.bC() || this.E() && !this.bC());
    }

    private boolean d(cgk $$0) {
        return $$0.ef() && $$0.dv();
    }

    public float L() {
        if (!((cgk)this).a(bdv.a)) {
            return 0.0f;
        }
        float $$0 = 600.0f;
        float $$1 = 100.0f;
        if ((float)this.dl >= 600.0f) {
            return 1.0f;
        }
        float $$2 = bgj.a((float)this.dl / 100.0f, 0.0f, 1.0f);
        float $$3 = (float)this.dl < 100.0f ? 0.0f : bgj.a(((float)this.dl - 100.0f) / 500.0f, 0.0f, 1.0f);
        return $$2 * 0.6f + $$3 * 0.39999998f;
    }

    public void a(dwl $$0) {
        if ($$0 == dwl.d) {
            this.k(this.dN().a(iz.a.b, 0.0));
        }
    }

    @Override
    public boolean bC() {
        return this.cr;
    }

    @Override
    protected boolean gD() {
        boolean $$0 = this.cr;
        boolean $$1 = super.gD();
        if (this.au()) {
            return this.cr;
        }
        if (!$$0 && $$1) {
            this.ao().a(this.dP(), this.dR(), this.dV(), bda.x, bdb.i, 1.0f, 1.0f, false);
            this.d.ap().a((ipm)new ipp.b(this));
        }
        if ($$0 && !$$1) {
            this.ao().a(this.dP(), this.dR(), this.dV(), bda.y, bdb.i, 1.0f, 1.0f, false);
        }
        return this.cr;
    }

    @Override
    public ftm u(float $$0) {
        if (this.d.k.aV().a()) {
            float $$1 = bgj.h($$0 * 0.5f, this.ec(), this.ab) * ((float)Math.PI / 180);
            float $$2 = bgj.h($$0 * 0.5f, this.ee(), this.ac) * ((float)Math.PI / 180);
            double $$3 = this.at() == chb.b ? -1.0 : 1.0;
            ftm $$4 = new ftm(0.39 * $$3, -0.6, 0.3);
            return $$4.a(-$$2).b(-$$1).e(this.n($$0));
        }
        return super.u($$0);
    }

    @Override
    public void a(dlt $$0, dlt $$1, dht $$2) {
        this.d.aH().a($$0, $$1, $$2);
    }

    @Override
    public float ed() {
        return this.ec();
    }

    @Override
    public void g(dlt $$0) {
        this.d.q.a($$0);
    }

    @Override
    public boolean gO() {
        return this.cK.c();
    }

    public bhl N() {
        return this.cK;
    }

    public ddk P() {
        return this.da;
    }

    public ftk a(float $$0, cgk $$1) {
        dlt $$2 = this.fA();
        dnu $$3 = $$2.a(ki.F);
        double $$4 = this.hm();
        ftk $$5 = null;
        if ($$3 != null && ($$5 = $$3.a($$1, $$0, cgs.h)) instanceof fti) {
            $$5 = hnh.a($$5, $$1.n($$0), $$4);
        }
        if ($$5 == null || $$5.d() == ftk.a.a) {
            double $$6 = this.hn();
            $$5 = hnh.a($$1, $$4, $$6, $$0);
        }
        return $$5;
    }

    private static ftk a(cgk $$0, double $$1, double $$2, float $$3) {
        double $$4 = Math.max($$1, $$2);
        double $$5 = bgj.n($$4);
        ftm $$6 = $$0.n($$3);
        ftk $$7 = $$0.a($$4, $$3, false);
        double $$8 = $$7.g().g($$6);
        if ($$7.d() != ftk.a.a) {
            $$5 = $$8;
            $$4 = Math.sqrt($$5);
        }
        ftm $$9 = $$0.h($$3);
        ftm $$10 = $$6.b($$9.g * $$4, $$9.h * $$4, $$9.i * $$4);
        float $$11 = 1.0f;
        fth $$12 = $$0.dj().b($$9.c($$4)).c(1.0, 1.0, 1.0);
        ftj $$13 = dee.a($$0, $$6, $$10, $$12, cgs.h, $$5);
        if ($$13 != null && $$13.g().g($$6) < $$8) {
            return hnh.a($$13, $$6, $$2);
        }
        return hnh.a($$7, $$6, $$1);
    }

    private static ftk a(ftk $$0, ftm $$1, double $$2) {
        ftm $$3 = $$0.g();
        if (!$$3.a((jn)$$1, $$2)) {
            ftm $$4 = $$0.g();
            iz $$5 = iz.a($$4.g - $$1.g, $$4.h - $$1.h, $$4.i - $$1.i);
            return fti.a($$4, $$5, is.a($$4));
        }
        return $$0;
    }
}

