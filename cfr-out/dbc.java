/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dbc
extends dbe
implements dac {
    private static final int e = 4;
    private static final int f = 3;
    public static final int a = 3;
    private int cv;
    private final ftm[][] cw;

    public dbc(cgu<? extends dbc> $$0, dwo $$1) {
        super((cgu<? extends dbe>)$$0, $$1);
        this.cn = 5;
        this.cw = new ftm[2][4];
        for (int $$2 = 0; $$2 < 4; ++$$2) {
            this.cw[0][$$2] = ftm.c;
            this.cw[1][$$2] = ftm.c;
        }
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new coh(this));
        this.cs.a(1, new dbe.b(this));
        this.cs.a(3, new cnu<dat>(this, dat.class, 8.0f, 1.0, 1.2));
        this.cs.a(4, new b());
        this.cs.a(5, new a());
        this.cs.a(6, new cpp<dbc>(this, 0.5, 20, 15.0f));
        this.cs.a(8, new cpm(this, 0.6));
        this.cs.a(9, new cox(this, ddm.class, 3.0f, 1.0f));
        this.cs.a(10, new cox(this, chn.class, 8.0f));
        this.ct.a(1, new cqi(this, dfi.class).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true).c(300));
        this.ct.a(3, new cqj<dcw>((chn)this, dcw.class, false).c(300));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, false).c(300));
    }

    public static cir.a gP() {
        return czz.gW().a(cis.x, 0.5).a(cis.o, 18.0).a(cis.u, 32.0);
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.a(cgv.a, new dlt(dlx.pW));
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void d_() {
        super.d_();
        if (this.ao().B_() && this.cG()) {
            --this.cv;
            if (this.cv < 0) {
                this.cv = 0;
            }
            if (this.bu == 1 || this.at % 1200 == 0) {
                this.cv = 3;
                float $$0 = -6.0f;
                int $$1 = 13;
                for (int $$2 = 0; $$2 < 4; ++$$2) {
                    this.cw[0][$$2] = this.cw[1][$$2];
                    this.cw[1][$$2] = new ftm((double)(-6.0f + (float)this.as.a(13)) * 0.5, Math.max(0, this.as.a(6) - 4), (double)(-6.0f + (float)this.as.a(13)) * 0.5);
                }
                for (int $$3 = 0; $$3 < 16; ++$$3) {
                    this.ao().a(ly.e, this.e(0.5), this.dS(), this.g(0.5), 0.0, 0.0, 0.0);
                }
                this.ao().a(this.dP(), this.dR(), this.dV(), bda.ph, this.dB(), 1.0f, 1.0f, false);
            } else if (this.bu == this.bv - 1) {
                this.cv = 3;
                for (int $$4 = 0; $$4 < 4; ++$$4) {
                    this.cw[0][$$4] = this.cw[1][$$4];
                    this.cw[1][$$4] = new ftm(0.0, 0.0, 0.0);
                }
            }
        }
    }

    @Override
    public bcz gX() {
        return bda.pd;
    }

    public ftm[] L(float $$0) {
        if (this.cv <= 0) {
            return this.cw[1];
        }
        double $$1 = ((float)this.cv - $$0) / 3.0f;
        $$1 = Math.pow($$1, 0.25);
        ftm[] $$2 = new ftm[4];
        for (int $$3 = 0; $$3 < 4; ++$$3) {
            $$2[$$3] = this.cw[1][$$3].c(1.0 - $$1).e(this.cw[0][$$3].c($$1));
        }
        return $$2;
    }

    @Override
    protected bcz W() {
        return bda.pd;
    }

    @Override
    protected bcz fd() {
        return bda.pf;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.pg;
    }

    @Override
    protected bcz gZ() {
        return bda.pe;
    }

    @Override
    public void a(axf $$0, int $$1, boolean $$2) {
    }

    @Override
    public void a(chl $$0, float $$1) {
        dlt $$2 = this.b(dee.a(this, dlx.pW));
        dlt $$3 = this.d($$2);
        deh $$4 = dee.a(this, $$3, $$1, $$2);
        double $$5 = $$0.dP() - this.dP();
        double $$6 = $$0.f(0.3333333333333333) - $$4.dR();
        double $$7 = $$0.dV() - this.dV();
        double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$9 = (axf)dwo2;
            dec.a($$4, $$9, $$3, $$5, $$6 + $$8 * (double)0.2f, $$7, 1.6f, 14 - $$9.av().a() * 4);
        }
        this.a(bda.Au, 1.0f, 1.0f / (this.ep().i() * 0.4f + 0.8f));
    }

    @Override
    public dba.a gY() {
        if (this.ha()) {
            return dba.a.c;
        }
        if (this.gI()) {
            return dba.a.d;
        }
        return dba.a.a;
    }

    class b
    extends dbe.c {
        b() {
            super(dbc.this);
        }

        @Override
        public boolean b() {
            if (!super.b()) {
                return false;
            }
            return !dbc.this.d(cfo.n);
        }

        @Override
        protected int h() {
            return 20;
        }

        @Override
        protected int i() {
            return 340;
        }

        @Override
        protected void k() {
            dbc.this.a(new cfm(cfo.n, 1200));
        }

        @Override
        protected @Nullable bcz l() {
            return bda.pj;
        }

        @Override
        protected dbe.a m() {
            return dbe.a.e;
        }
    }

    class a
    extends dbe.c {
        private int e;

        a() {
            super(dbc.this);
        }

        @Override
        public boolean b() {
            if (!super.b()) {
                return false;
            }
            if (dbc.this.ag_() == null) {
                return false;
            }
            if (dbc.this.ag_().aA() == this.e) {
                return false;
            }
            return dbc$a.a(dbc.this).c(dbc.this.dK()).a(ccz.c.ordinal());
        }

        @Override
        public void d() {
            super.d();
            chl $$0 = dbc.this.ag_();
            if ($$0 != null) {
                this.e = $$0.aA();
            }
        }

        @Override
        protected int h() {
            return 20;
        }

        @Override
        protected int i() {
            return 180;
        }

        @Override
        protected void k() {
            dbc.this.ag_().b(new cfm(cfo.o, 400), (cgk)dbc.this);
        }

        @Override
        protected bcz l() {
            return bda.pi;
        }

        @Override
        protected dbe.a m() {
            return dbe.a.f;
        }
    }
}

