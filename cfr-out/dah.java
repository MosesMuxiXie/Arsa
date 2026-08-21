/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.LinkedHashSet;
import org.jspecify.annotations.Nullable;

public class dah
extends cth
implements chi {
    private static final amo cv = amo.b("suffocating");
    private static final ciq cw = new ciq(cv, -0.34f, ciq.a.b);
    private static final float cx = 0.35f;
    private static final float cz = 0.55f;
    private static final alw<Integer> cA = ama.a(dah.class, aly.b);
    private static final alw<Boolean> cB = ama.a(dah.class, aly.k);
    private final chg cC;
    private @Nullable cpy cD;

    public dah(cgu<? extends dah> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.cC = new chg(this.az, cA);
        this.W = true;
        this.a(fls.j, -1.0f);
        this.a(fls.i, 0.0f);
        this.a(fls.n, 0.0f);
        this.a(fls.o, 0.0f);
    }

    public static boolean c(cgu<dah> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        is.a $$5 = $$3.k();
        do {
            $$5.c(iz.b);
        } while ($$1.b_($$5).a(bdv.b));
        return $$1.a_($$5).l();
    }

    @Override
    public void a(alw<?> $$0) {
        if (cA.equals($$0) && this.ao().B_()) {
            this.cC.a();
        }
        super.a($$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cA, 0);
        $$0.a(cB, false);
    }

    @Override
    public boolean e(cgv $$0) {
        if ($$0 == cgv.h) {
            return this.cb() && !this.e_();
        }
        return super.e($$0);
    }

    @Override
    protected boolean f(cgv $$0) {
        return $$0 == cgv.h || super.f($$0);
    }

    @Override
    protected jd<bcz> a(cgv $$0, dlt $$1, dun $$2) {
        if ($$0 == cgv.h) {
            return bda.Bw;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void D() {
        this.cs.a(1, new cpi(this, 1.65));
        this.cs.a(2, new cnz(this, 1.0));
        this.cD = new cpy(this, 1.4, $$0 -> $$0.a(bdy.bd), false);
        this.cs.a(3, this.cD);
        this.cs.a(4, new a(this, 1.0));
        this.cs.a(5, new coo(this, 1.0));
        this.cs.a(7, new cpm(this, 1.0, 60));
        this.cs.a(8, new cox(this, ddm.class, 8.0f));
        this.cs.a(8, new cpk(this));
        this.cs.a(9, new cox(this, dah.class, 8.0f));
    }

    public void x(boolean $$0) {
        this.az.a(cB, $$0);
        cio $$1 = this.h(cis.x);
        if ($$1 != null) {
            if ($$0) {
                $$1.a(cw);
            } else {
                $$1.c(cv);
            }
        }
    }

    public boolean p() {
        return this.az.a(cB);
    }

    @Override
    public boolean a(flb $$0) {
        return $$0.a(bdv.b);
    }

    @Override
    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        if (!this.ao().B_()) {
            return super.a($$0, $$1, $$2);
        }
        float $$3 = Math.min(0.25f, this.bB.b());
        float $$4 = this.bB.c();
        float $$5 = 0.12f * bgj.b((double)($$4 * 1.5f)) * 2.0f * $$3;
        return super.a($$0, $$1, $$2).b(0.0, $$5 * $$2, 0.0);
    }

    @Override
    public boolean a(dwr $$0) {
        return $$0.f(this);
    }

    @Override
    public @Nullable chl dl() {
        ddm $$0;
        cgk cgk2;
        if (this.al() && (cgk2 = this.do()) instanceof ddm && ($$0 = (ddm)cgk2).b(dlx.po)) {
            return $$0;
        }
        return super.dl();
    }

    @Override
    public ftm b(chl $$0) {
        ftm[] $$1 = new ftm[]{dah.a(this.dF(), (double)$$0.dF(), $$0.ec()), dah.a(this.dF(), (double)$$0.dF(), $$0.ec() - 22.5f), dah.a(this.dF(), (double)$$0.dF(), $$0.ec() + 22.5f), dah.a(this.dF(), (double)$$0.dF(), $$0.ec() - 45.0f), dah.a(this.dF(), (double)$$0.dF(), $$0.ec() + 45.0f)};
        LinkedHashSet $$2 = Sets.newLinkedHashSet();
        double $$3 = this.dj().e;
        double $$4 = this.dj().b - 0.5;
        is.a $$5 = new is.a();
        for (ftm $$6 : $$1) {
            $$5.b(this.dP() + $$6.g, $$3, this.dV() + $$6.i);
            for (double $$7 = $$3; $$7 > $$4; $$7 -= 1.0) {
                $$2.add($$5.j());
                $$5.c(iz.a);
            }
        }
        for (is $$8 : $$2) {
            double $$9;
            if (this.ao().b_($$8).a(bdv.b) || !dfz.a($$9 = this.ao().m($$8))) continue;
            ftm $$10 = ftm.a($$8, $$9);
            for (chx $$11 : $$0.go()) {
                fth $$12 = $$0.f($$11);
                if (!dfz.a(this.ao(), $$0, $$12.c($$10))) continue;
                $$0.c($$11);
                return $$10;
            }
        }
        return new ftm(this.dP(), this.dj().e, this.dV());
    }

    @Override
    protected void a(ddm $$0, ftm $$1) {
        this.a($$0.ec(), $$0.ee() * 0.5f);
        this.bC = this.bE = this.ec();
        this.ab = this.bE;
        this.cC.b();
        super.a($$0, $$1);
    }

    @Override
    protected ftm b(ddm $$0, ftm $$1) {
        return new ftm(0.0, 0.0, 1.0);
    }

    @Override
    protected float f(ddm $$0) {
        return (float)(this.i(cis.x) * (double)(this.p() ? 0.35f : 0.55f) * (double)this.cC.c());
    }

    @Override
    protected float bj() {
        return this.al + 0.6f;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(this.bN() ? bda.Bu : bda.Bt, 1.0f, 1.0f);
    }

    @Override
    public boolean a() {
        return this.cC.a(this.ep());
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
        if (this.bN()) {
            this.l();
            return;
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void g() {
        if (this.gQ() && this.as.a(140) == 0) {
            this.b(bda.Bp);
        } else if (this.gM() && this.as.a(60) == 0) {
            this.b(bda.Bq);
        }
        if (!this.gG()) {
            dah $$3;
            eoh $$0 = this.ao().a_(this.dK());
            eoh $$1 = this.bJ();
            boolean $$2 = $$0.a(bdp.bg) || $$1.a(bdp.bg) || this.b(bdv.b) > 0.0;
            cgk cgk2 = this.dz();
            boolean $$4 = cgk2 instanceof dah && ($$3 = (dah)cgk2).p();
            this.x(!$$2 || $$4);
        }
        super.g();
        this.gR();
    }

    private boolean gQ() {
        return this.cD != null && this.cD.k();
    }

    @Override
    protected boolean F() {
        return true;
    }

    private void gR() {
        if (this.bN()) {
            ftr $$0 = ftr.a(this);
            if (!$$0.a(eeo.d, this.dK(), true) || this.ao().b_(this.dK().d()).a(bdv.b)) {
                this.k(this.dN().c(0.5).b(0.0, 0.05, 0.0));
            } else {
                this.e(true);
            }
        }
    }

    public static cir.a gP() {
        return cth.gW().a(cis.x, 0.175f);
    }

    @Override
    protected @Nullable bcz W() {
        if (this.gM() || this.gQ()) {
            return null;
        }
        return bda.Bo;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Bs;
    }

    @Override
    protected bcz fd() {
        return bda.Br;
    }

    @Override
    protected boolean s(cgk $$0) {
        return !this.cr() && !((cgk)this).a(bdv.b);
    }

    @Override
    public boolean fR() {
        return true;
    }

    @Override
    public boolean cp() {
        return false;
    }

    @Override
    protected cre b(dwo $$0) {
        return new b(this, $$0);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if ($$1.a_($$0).y().a(bdv.b)) {
            return 10.0f;
        }
        return this.bN() ? Float.NEGATIVE_INFINITY : 0.0f;
    }

    public @Nullable dah b(axf $$0, cfy $$1) {
        return cgu.bB.a($$0, cgt.e);
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.bc);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        boolean $$2 = this.j($$0.b($$1));
        if (!$$2 && this.al() && !this.cr() && !$$0.gA()) {
            if (!this.ao().B_()) {
                $$0.o(this);
            }
            return cdc.a;
        }
        cdc $$3 = super.b($$0, $$1);
        if (!$$3.a()) {
            dlt $$4 = $$0.b($$1);
            if (this.a($$4, cgv.h)) {
                return $$4.a($$0, (chl)this, $$1);
            }
            return cdc.e;
        }
        if ($$2 && !this.bq()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.Bv, this.dB(), 1.0f, 1.0f + (this.as.i() - this.as.i()) * 0.2f);
        }
        return $$3;
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.6f * this.dk(), this.dF() * 0.4f);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if (this.e_()) {
            return super.a($$0, $$1, $$2, $$3);
        }
        bgr $$4 = $$0.G_();
        if ($$4.a(30) == 0) {
            chn $$5 = cgu.ca.a($$0.a(), cgt.g);
            if ($$5 != null) {
                $$3 = this.a($$0, $$1, $$5, (cie)new dcn.b(dcn.a($$4), false));
                $$5.a(cgv.a, new dlt(dlx.po));
                this.a(cgv.h, new dlt(dlx.oR));
                this.g(cgv.h);
            }
        } else if ($$4.a(10) == 0) {
            cfy $$6 = cgu.bB.a($$0.a(), cgt.g);
            if ($$6 != null) {
                $$6.d_(-24000);
                $$3 = this.a($$0, $$1, $$6, null);
            }
        } else {
            $$3 = new cfy.a(0.5f);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    private cie a(dxf $$0, cda $$1, chn $$2, @Nullable cie $$3) {
        $$2.b(this.dP(), this.dR(), this.dV(), this.ec(), 0.0f);
        $$2.a($$0, $$1, cgt.g, $$3);
        $$2.a((cgk)this, true, false);
        return new cfy.a(0.0f);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    static class a
    extends cpc {
        private final dah g;

        a(dah $$0, double $$1) {
            super($$0, $$1, 8, 2);
            this.g = $$0;
        }

        @Override
        public is k() {
            return this.e;
        }

        @Override
        public boolean c() {
            return !this.g.bN() && this.a(this.g.ao(), this.e);
        }

        @Override
        public boolean b() {
            return !this.g.bN() && super.b();
        }

        @Override
        public boolean l() {
            return this.d % 20 == 0;
        }

        @Override
        protected boolean a(dwr $$0, is $$1) {
            return $$0.a_($$1).a(dzs.K) && $$0.a_($$1.d()).a(flq.a);
        }
    }

    static class b
    extends crd {
        b(dah $$0, dwo $$1) {
            super($$0, $$1);
        }

        @Override
        protected flr a(int $$0) {
            this.o = new flx();
            return new flr(this.o, $$0);
        }

        @Override
        protected boolean a(fls $$0) {
            if ($$0 == fls.i || $$0 == fls.o || $$0 == fls.n) {
                return true;
            }
            return super.a($$0);
        }

        @Override
        public boolean a(is $$0) {
            return this.b.a_($$0).a(dzs.K) || super.a($$0);
        }
    }
}

