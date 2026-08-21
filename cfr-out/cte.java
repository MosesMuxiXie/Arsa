/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cte
extends ctd {
    public static final float a = 0.5f;
    public static final float b = 10.0f;
    private static final alw<Byte> e = ama.a(cte.class, aly.a);
    private static final int f = 1;
    private static final csk cu = csk.b().a(4.0);
    private static final byte cv = 0;
    public final cfz c = new cfz();
    public final cfz d = new cfz();
    private @Nullable is cw;

    public cte(cgu<? extends cte> $$0, dwo $$1) {
        super((cgu<? extends ctd>)$$0, $$1);
        if (!$$1.B_()) {
            this.x(true);
        }
    }

    @Override
    public boolean bp() {
        return !this.p() && (float)this.at % 10.0f == 0.0f;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(e, (byte)0);
    }

    @Override
    protected float fC() {
        return 0.1f;
    }

    @Override
    public float fD() {
        return super.fD() * 0.95f;
    }

    @Override
    public @Nullable bcz W() {
        if (this.p() && this.as.a(4) != 0) {
            return null;
        }
        return bda.bR;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.bT;
    }

    @Override
    protected bcz fd() {
        return bda.bS;
    }

    @Override
    public boolean bY() {
        return false;
    }

    @Override
    protected void F(cgk $$0) {
    }

    @Override
    protected void q() {
    }

    public static cir.a k() {
        return chn.E().a(cis.u, 6.0);
    }

    public boolean p() {
        return (this.az.a(e) & 1) != 0;
    }

    public void x(boolean $$0) {
        byte $$1 = this.az.a(e);
        if ($$0) {
            this.az.a(e, (byte)($$1 | 1));
        } else {
            this.az.a(e, (byte)($$1 & 0xFFFFFFFE));
        }
    }

    @Override
    public void g() {
        super.g();
        if (this.p()) {
            this.k(ftm.c);
            this.n(this.dP(), (double)bgj.c(this.dR()) + 1.0 - (double)this.dG(), this.dV());
        } else {
            this.k(this.dN().d(1.0, 0.6, 1.0));
        }
        this.gL();
    }

    @Override
    protected void a(axf $$0) {
        super.a($$0);
        is $$1 = this.dK();
        is $$2 = $$1.d();
        if (this.p()) {
            boolean $$3 = this.bq();
            if ($$0.a_($$2).d($$0, $$1)) {
                if (this.as.a(200) == 0) {
                    this.bE = this.as.a(360);
                }
                if ($$0.a(cu, this) != null) {
                    this.x(false);
                    if (!$$3) {
                        $$0.a(null, 1025, $$1, 0);
                    }
                }
            } else {
                this.x(false);
                if (!$$3) {
                    $$0.a(null, 1025, $$1, 0);
                }
            }
        } else {
            if (!(this.cw == null || $$0.A(this.cw) && this.cw.v() > $$0.K_())) {
                this.cw = null;
            }
            if (this.cw == null || this.as.a(30) == 0 || this.cw.a(this.dI(), 2.0)) {
                this.cw = is.a(this.dP() + (double)this.as.a(7) - (double)this.as.a(7), this.dR() + (double)this.as.a(6) - 2.0, this.dV() + (double)this.as.a(7) - (double)this.as.a(7));
            }
            double $$4 = (double)this.cw.u() + 0.5 - this.dP();
            double $$5 = (double)this.cw.v() + 0.1 - this.dR();
            double $$6 = (double)this.cw.w() + 0.5 - this.dV();
            ftm $$7 = this.dN();
            ftm $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.g) * (double)0.1f, (Math.signum($$5) * (double)0.7f - $$7.h) * (double)0.1f, (Math.signum($$6) * 0.5 - $$7.i) * (double)0.1f);
            this.k($$8);
            float $$9 = (float)(bgj.d($$8.i, $$8.g) * 57.2957763671875) - 90.0f;
            float $$10 = bgj.f($$9 - this.ec());
            this.bP = 0.5f;
            this.v(this.ec() + $$10);
            if (this.as.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
                this.x(true);
            }
        }
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
    }

    @Override
    public boolean m_() {
        return true;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.a($$0, $$1)) {
            return false;
        }
        if (this.p()) {
            this.x(false);
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.az.a(e, $$0.a("BatFlags", (byte)0));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("BatFlags", this.az.a(e));
    }

    public static boolean b(cgu<cte> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        if ($$3.v() >= $$1.a(euq.a.b, $$3).v()) {
            return false;
        }
        if ($$4.h()) {
            return false;
        }
        if ($$1.G($$3) > $$4.a(4)) {
            return false;
        }
        if (!$$1.a_($$3.e()).a(bdp.cw)) {
            return false;
        }
        return cte.a($$0, $$1, $$2, $$3, $$4);
    }

    private void gL() {
        if (this.p()) {
            this.c.a();
            this.d.b(this.at);
        } else {
            this.d.a();
            this.c.b(this.at);
        }
    }
}

