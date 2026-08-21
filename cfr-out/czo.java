/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class czo
extends czz {
    private float a = 0.5f;
    private int b;
    private static final alw<Byte> c = ama.a(czo.class, aly.a);

    public czo(cgu<? extends czo> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.a(fls.j, -1.0f);
        this.a(fls.i, 8.0f);
        this.a(fls.n, 0.0f);
        this.a(fls.o, 0.0f);
        this.cn = 10;
    }

    @Override
    protected void D() {
        this.cs.a(4, new a(this));
        this.cs.a(5, new cpd(this, 1.0));
        this.cs.a(7, new cqd((cht)this, 1.0, 0.0f));
        this.cs.a(8, new cox(this, ddm.class, 8.0f));
        this.cs.a(8, new cpk(this));
        this.ct.a(1, new cqi(this, new Class[0]).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
    }

    public static cir.a k() {
        return czz.gW().a(cis.d, 6.0).a(cis.x, 0.23f).a(cis.o, 48.0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, (byte)0);
    }

    @Override
    protected bcz W() {
        return bda.cs;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.cv;
    }

    @Override
    protected bcz fd() {
        return bda.cu;
    }

    @Override
    public float bO() {
        return 1.0f;
    }

    @Override
    public void d_() {
        if (!this.aV() && this.dN().h < 0.0) {
            this.k(this.dN().d(1.0, 0.6, 1.0));
        }
        if (this.ao().B_()) {
            if (this.as.a(24) == 0 && !this.bq()) {
                this.ao().a(this.dP() + 0.5, this.dR() + 0.5, this.dV() + 0.5, bda.ct, this.dB(), 1.0f + this.as.i(), this.as.i() * 0.7f + 0.3f, false);
            }
            for (int $$0 = 0; $$0 < 2; ++$$0) {
                this.ao().a(ly.ab, this.e(0.5), this.dS(), this.h(0.5), 0.0, 0.0, 0.0);
            }
        }
        super.d_();
    }

    @Override
    public boolean fR() {
        return true;
    }

    @Override
    protected void a(axf $$0) {
        chl $$1;
        --this.b;
        if (this.b <= 0) {
            this.b = 100;
            this.a = (float)this.as.a(0.5, 6.891);
        }
        if (($$1 = this.ag_()) != null && $$1.dT() > this.dT() + (double)this.a && this.c($$1)) {
            ftm $$2 = this.dN();
            this.k(this.dN().b(0.0, ((double)0.3f - $$2.h) * (double)0.3f, 0.0));
            this.aF = true;
        }
        super.a($$0);
    }

    @Override
    public boolean cp() {
        return this.p();
    }

    private boolean p() {
        return (this.az.a(c) & 1) != 0;
    }

    void x(boolean $$0) {
        byte $$1 = this.az.a(c);
        $$1 = $$0 ? (byte)($$1 | 1) : (byte)($$1 & 0xFFFFFFFE);
        this.az.a(c, $$1);
    }

    static class a
    extends cop {
        private final czo a;
        private int b;
        private int c;
        private int d;

        public a(czo $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            chl $$0 = this.a.ag_();
            return $$0 != null && $$0.cb() && this.a.c($$0);
        }

        @Override
        public void d() {
            this.b = 0;
        }

        @Override
        public void e() {
            this.a.x(false);
            this.d = 0;
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            --this.c;
            chl $$0 = this.a.ag_();
            if ($$0 == null) {
                return;
            }
            boolean $$1 = this.a.P().a($$0);
            this.d = $$1 ? 0 : ++this.d;
            double $$2 = this.a.g((cgk)$$0);
            if ($$2 < 4.0) {
                if (!$$1) {
                    return;
                }
                if (this.c <= 0) {
                    this.c = 20;
                    this.a.c(czo$a.a(this.a), (cgk)$$0);
                }
                this.a.K().a($$0.dP(), $$0.dR(), $$0.dV(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
                double $$3 = $$0.dP() - this.a.dP();
                double $$4 = $$0.f(0.5) - this.a.f(0.5);
                double $$5 = $$0.dV() - this.a.dV();
                if (this.c <= 0) {
                    ++this.b;
                    if (this.b == 1) {
                        this.c = 60;
                        this.a.x(true);
                    } else if (this.b <= 4) {
                        this.c = 6;
                    } else {
                        this.c = 100;
                        this.b = 0;
                        this.a.x(false);
                    }
                    if (this.b > 1) {
                        double $$6 = Math.sqrt(Math.sqrt($$2)) * 0.5;
                        if (!this.a.bq()) {
                            this.a.ao().a(null, 1018, this.a.dK(), 0);
                        }
                        for (int $$7 = 0; $$7 < 1; ++$$7) {
                            ftm $$8 = new ftm(this.a.ep().a($$3, 2.297 * $$6), $$4, this.a.ep().a($$5, 2.297 * $$6));
                            deq $$9 = new deq(this.a.ao(), this.a, $$8.d());
                            $$9.a_($$9.dP(), this.a.f(0.5) + 0.5, $$9.dV());
                            this.a.ao().b($$9);
                        }
                    }
                }
                this.a.J().a($$0, 10.0f, 10.0f);
            } else if (this.d < 5) {
                this.a.K().a($$0.dP(), $$0.dR(), $$0.dV(), 1.0);
            }
            super.a();
        }

        private double h() {
            return this.a.i(cis.o);
        }
    }
}

