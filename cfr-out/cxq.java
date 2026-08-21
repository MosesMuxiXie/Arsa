/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class cxq
extends ctg {
    public float cv;
    public float cw;
    public float cx;
    public float cy;
    public float cz;
    public float cA;
    public float cB;
    public float cC;
    private float cD;
    private float cE;
    private float cF;
    ftm cG = ftm.c;

    public cxq(cgu<? extends cxq> $$0, dwo $$1) {
        super((cgu<? extends ctg>)$$0, $$1);
        this.as.b((long)this.aA());
        this.cE = 1.0f / (this.as.i() + 1.0f) * 0.2f;
    }

    @Override
    protected void D() {
        this.cs.a(0, new b(this));
        this.cs.a(1, new a());
    }

    public static cir.a gR() {
        return chn.E().a(cis.u, 10.0);
    }

    @Override
    protected bcz W() {
        return bda.Cr;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Ct;
    }

    @Override
    protected bcz fd() {
        return bda.Cs;
    }

    protected bcz gP() {
        return bda.Cu;
    }

    @Override
    public boolean aj_() {
        return true;
    }

    @Override
    protected float fC() {
        return 0.4f;
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return cgu.bz.a($$0, cgt.e);
    }

    @Override
    protected double bs() {
        return 0.08;
    }

    @Override
    public void d_() {
        super.d_();
        this.cw = this.cv;
        this.cy = this.cx;
        this.cA = this.cz;
        this.cC = this.cB;
        this.cz += this.cE;
        if ((double)this.cz > Math.PI * 2) {
            if (this.ao().B_()) {
                this.cz = (float)Math.PI * 2;
            } else {
                this.cz -= (float)Math.PI * 2;
                if (this.as.a(10) == 0) {
                    this.cE = 1.0f / (this.as.i() + 1.0f) * 0.2f;
                }
                this.ao().a((cgk)this, (byte)19);
            }
        }
        if (this.by()) {
            if (this.cz < (float)Math.PI) {
                float $$0 = this.cz / (float)Math.PI;
                this.cB = bgj.a((double)($$0 * $$0 * (float)Math.PI)) * (float)Math.PI * 0.25f;
                if ((double)$$0 > 0.75) {
                    if (this.dv()) {
                        this.k(this.cG);
                    }
                    this.cF = 1.0f;
                } else {
                    this.cF *= 0.8f;
                }
            } else {
                this.cB = 0.0f;
                if (this.dv()) {
                    this.k(this.dN().c(0.9));
                }
                this.cF *= 0.99f;
            }
            ftm $$1 = this.dN();
            double $$2 = $$1.i();
            this.bC += (-((float)bgj.d($$1.g, $$1.i)) * 57.295776f - this.bC) * 0.1f;
            this.v(this.bC);
            this.cx += (float)Math.PI * this.cF * 1.5f;
            this.cv += (-((float)bgj.d($$2, $$1.h)) * 57.295776f - this.cv) * 0.1f;
        } else {
            this.cB = bgj.c(bgj.a((double)this.cz)) * (float)Math.PI * 0.25f;
            if (!this.ao().B_()) {
                double $$3 = this.dN().h;
                $$3 = this.d(cfo.y) ? 0.05 * (double)(this.e(cfo.y).e() + 1) : ($$3 -= this.bt());
                this.m(0.0, $$3 * (double)0.98f, 0.0);
            }
            this.cv += (-90.0f - this.cv) * 0.02f;
        }
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (super.a($$0, $$1, $$2) && this.eK() != null) {
            this.gQ();
            return true;
        }
        return false;
    }

    private ftm o(ftm $$0) {
        ftm $$1 = $$0.a(this.cw * ((float)Math.PI / 180));
        $$1 = $$1.b(-this.bD * ((float)Math.PI / 180));
        return $$1;
    }

    private void gQ() {
        this.b(this.gP());
        ftm $$0 = this.o(new ftm(0.0, -1.0, 0.0)).b(this.dP(), this.dR(), this.dV());
        for (int $$1 = 0; $$1 < 30; ++$$1) {
            ftm $$2 = this.o(new ftm((double)this.as.i() * 0.6 - 0.3, -1.0, (double)this.as.i() * 0.6 - 0.3));
            float $$3 = this.e_() ? 0.1f : 0.3f;
            ftm $$4 = $$2.c((double)($$3 + this.as.i() * 2.0f));
            ((axf)this.ao()).a(this.p(), $$0.g, $$0.h + 0.5, $$0.i, 0, $$4.g, $$4.h, $$4.i, (double)0.1f);
        }
    }

    protected lw p() {
        return ly.am;
    }

    @Override
    public void m(ftm $$0) {
        this.a(chp.a, this.dN());
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 19) {
            this.cz = 0.0f;
        } else {
            super.b($$0);
        }
    }

    public boolean gS() {
        return this.cG.h() > (double)1.0E-5f;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        cie $$4 = Objects.requireNonNullElseGet($$3, () -> new cfy.a(0.05f));
        return super.a($$0, $$1, $$2, $$4);
    }

    static class b
    extends cop {
        private final cxq a;

        public b(cxq $$0) {
            this.a = $$0;
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public void a() {
            int $$0 = this.a.eP();
            if ($$0 > 100) {
                this.a.cG = ftm.c;
            } else if (this.a.ep().a(cxq$b.b(50)) == 0 || !this.a.au || !this.a.gS()) {
                float $$1 = this.a.ep().i() * ((float)Math.PI * 2);
                this.a.cG = new ftm(bgj.b((double)$$1) * 0.2f, -0.1f + this.a.ep().i() * 0.2f, bgj.a((double)$$1) * 0.2f);
            }
        }
    }

    class a
    extends cop {
        private static final float b = 3.0f;
        private static final float c = 5.0f;
        private static final float d = 10.0f;
        private int e;

        a() {
        }

        @Override
        public boolean b() {
            chl $$0 = cxq.this.eK();
            if (cxq.this.by() && $$0 != null) {
                return cxq.this.g((cgk)$$0) < 100.0;
            }
            return false;
        }

        @Override
        public void d() {
            this.e = 0;
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            ++this.e;
            chl $$0 = cxq.this.eK();
            if ($$0 == null) {
                return;
            }
            ftm $$1 = new ftm(cxq.this.dP() - $$0.dP(), cxq.this.dR() - $$0.dR(), cxq.this.dV() - $$0.dV());
            eoh $$2 = cxq.this.ao().a_(is.a(cxq.this.dP() + $$1.g, cxq.this.dR() + $$1.h, cxq.this.dV() + $$1.i));
            flb $$3 = cxq.this.ao().b_(is.a(cxq.this.dP() + $$1.g, cxq.this.dR() + $$1.h, cxq.this.dV() + $$1.i));
            if ($$3.a(bdv.a) || $$2.l()) {
                double $$4 = $$1.g();
                if ($$4 > 0.0) {
                    $$1.d();
                    double $$5 = 3.0;
                    if ($$4 > 5.0) {
                        $$5 -= ($$4 - 5.0) / 5.0;
                    }
                    if ($$5 > 0.0) {
                        $$1 = $$1.c($$5);
                    }
                }
                if ($$2.l()) {
                    $$1 = $$1.a(0.0, $$1.h, 0.0);
                }
                cxq.this.cG = new ftm($$1.g / 20.0, $$1.h / 20.0, $$1.i / 20.0);
            }
            if (this.e % 10 == 5) {
                cxq.this.ao().a(ly.d, cxq.this.dP(), cxq.this.dR(), cxq.this.dV(), 0.0, 0.0, 0.0);
            }
        }
    }
}

