/*
 * Decompiled with CFR 0.152.
 */
public class daj
extends dfi
implements dac {
    private static final amo a = amo.b("drinking");
    private static final ciq b = new ciq(a, -0.25, ciq.a.a);
    private static final alw<Boolean> e = ama.a(daj.class, aly.k);
    private int f;
    private cql<dfi> cv;
    private cqk<ddm> cw;

    public daj(cgu<? extends daj> $$0, dwo $$1) {
        super((cgu<? extends dfi>)$$0, $$1);
    }

    @Override
    protected void D() {
        super.D();
        this.cv = new cql<dfi>(this, dfi.class, true, ($$0, $$1) -> this.hh() && $$0.ay() != cgu.bQ);
        this.cw = new cqk<ddm>(this, ddm.class, 10, true, false, null);
        this.cs.a(1, new coh(this));
        this.cs.a(2, new cpo(this, 1.0, 60, 10.0f));
        this.cs.a(2, new cqd(this, 1.0));
        this.cs.a(3, new cox(this, ddm.class, 8.0f));
        this.cs.a(3, new cpk(this));
        this.ct.a(1, new cqi(this, dfi.class));
        this.ct.a(2, this.cv);
        this.ct.a(3, this.cw);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(e, false);
    }

    @Override
    protected bcz W() {
        return bda.FL;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.FP;
    }

    @Override
    protected bcz fd() {
        return bda.FN;
    }

    public void z(boolean $$0) {
        this.aD().a(e, $$0);
    }

    public boolean gP() {
        return this.aD().a(e);
    }

    public static cir.a gY() {
        return czz.gW().a(cis.u, 26.0).a(cis.x, 0.25);
    }

    @Override
    public void d_() {
        if (!this.ao().B_() && this.cb()) {
            this.cv.k();
            if (this.cv.i() <= 0) {
                this.cw.a(true);
            } else {
                this.cw.a(false);
            }
            if (this.gP()) {
                if (this.f-- <= 0) {
                    this.z(false);
                    dlt $$0 = this.fx();
                    this.a(cgv.a, dlt.l);
                    dnr $$1 = $$0.a(ki.Y);
                    if ($$0.a(dlx.up) && $$1 != null) {
                        $$1.a(this::a, $$0.a(ki.Z, Float.valueOf(1.0f)).floatValue());
                    }
                    this.c(etk.l);
                    this.h(cis.x).c(b.a());
                }
            } else {
                jd<dnp> $$2 = null;
                if (this.as.i() < 0.15f && ((cgk)this).a(bdv.a) && !this.d(cfo.m)) {
                    $$2 = dns.w;
                } else if (this.as.i() < 0.15f && (this.cp() || this.fb() != null && this.fb().a(bdq.i)) && !this.d(cfo.l)) {
                    $$2 = dns.l;
                } else if (this.as.i() < 0.05f && this.eZ() < this.fq()) {
                    $$2 = dns.y;
                } else if (this.as.i() < 0.5f && this.ag_() != null && !this.d(cfo.a) && this.ag_().g(this) > 121.0) {
                    $$2 = dns.n;
                }
                if ($$2 != null) {
                    this.a(cgv.a, dnr.a(dlx.up, $$2));
                    this.f = this.fx().a(this);
                    this.z(true);
                    if (!this.bq()) {
                        this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.FO, this.dB(), 1.0f, 0.8f + this.as.i() * 0.4f);
                    }
                    cio $$3 = this.h(cis.x);
                    $$3.c(a);
                    $$3.b(b);
                }
            }
            if (this.as.i() < 7.5E-4f) {
                this.ao().a((cgk)this, (byte)15);
            }
        }
        super.d_();
    }

    @Override
    public bcz gX() {
        return bda.FM;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 15) {
            for (int $$1 = 0; $$1 < this.as.a(35) + 10; ++$$1) {
                this.ao().a(ly.ar, this.dP() + this.as.k() * (double)0.13f, this.dj().e + 0.5 + this.as.k() * (double)0.13f, this.dV() + this.as.k() * (double)0.13f, 0.0, 0.0, 0.0);
            }
        } else {
            super.b($$0);
        }
    }

    @Override
    protected float f(cex $$0, float $$1) {
        $$1 = super.f($$0, $$1);
        if ($$0.d() == this) {
            $$1 = 0.0f;
        }
        if ($$0.a(bdq.k)) {
            $$1 *= 0.15f;
        }
        return $$1;
    }

    @Override
    public void a(chl $$0, float $$1) {
        if (this.gP()) {
            return;
        }
        ftm $$2 = $$0.dN();
        double $$3 = $$0.dP() + $$2.g - this.dP();
        double $$4 = $$0.dT() - (double)1.1f - this.dR();
        double $$5 = $$0.dV() + $$2.i - this.dV();
        double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
        jd<dnp> $$7 = dns.A;
        if ($$0 instanceof dfi) {
            $$7 = $$0.eZ() <= 4.0f ? dns.y : dns.F;
            this.g((chl)null);
        } else if ($$6 >= 8.0 && !$$0.d(cfo.b)) {
            $$7 = dns.q;
        } else if ($$0.eZ() >= 8.0f && !$$0.d(cfo.s)) {
            $$7 = dns.C;
        } else if ($$6 <= 3.0 && !$$0.d(cfo.r) && this.as.i() < 0.25f) {
            $$7 = dns.L;
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$8 = (axf)dwo2;
            dlt $$9 = dnr.a(dlx.xD, $$7);
            dec.a(dff::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75f, 8.0f);
        }
        if (!this.bq()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.FQ, this.dB(), 1.0f, 0.8f + this.as.i() * 0.4f);
        }
    }

    @Override
    public void a(axf $$0, int $$1, boolean $$2) {
    }

    @Override
    public boolean k() {
        return false;
    }
}

