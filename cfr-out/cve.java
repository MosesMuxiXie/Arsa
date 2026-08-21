/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cve
extends cth {
    public static final double cv = 0.6;
    public static final double cw = 0.8;
    public static final double cx = 1.33;
    private static final alw<Boolean> cz = ama.a(cve.class, aly.k);
    private static final boolean cA = false;
    private @Nullable a<ddm> cB;
    private @Nullable b cC;

    public cve(cgu<? extends cve> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.gP();
    }

    boolean gQ() {
        return this.az.a(cz);
    }

    private void x(boolean $$0) {
        this.az.a(cz, $$0);
        this.gP();
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Trusting", this.gQ());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("Trusting", false));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cz, false);
    }

    @Override
    protected void D() {
        this.cC = new b(this, 0.6, $$0 -> $$0.a(bdy.aX), true);
        this.cs.a(1, new coh(this));
        this.cs.a(3, this.cC);
        this.cs.a(7, new cov(this, 0.3f));
        this.cs.a(8, new cpf(this));
        this.cs.a(9, new cnz(this, 0.8));
        this.cs.a(10, new cqd((cht)this, 0.8, 1.0000001E-5f));
        this.cs.a(11, new cox(this, ddm.class, 10.0f));
        this.ct.a(1, new cqj<cuc>((chn)this, cuc.class, false));
        this.ct.a(1, new cqj<cxs>(this, cxs.class, 10, false, false, cxs.cv));
    }

    @Override
    public void a(axf $$0) {
        if (this.K().b()) {
            double $$1 = this.K().c();
            if ($$1 == 0.6) {
                this.c(chx.f);
                this.i(false);
            } else if ($$1 == 1.33) {
                this.c(chx.a);
                this.i(true);
            } else {
                this.c(chx.a);
                this.i(false);
            }
        } else {
            this.c(chx.a);
            this.i(false);
        }
    }

    @Override
    public boolean i(double $$0) {
        return !this.gQ() && this.at > 2400;
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 10.0).a(cis.x, 0.3f).a(cis.d, 3.0);
    }

    @Override
    protected @Nullable bcz W() {
        return bda.uR;
    }

    @Override
    public int S() {
        return 900;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.uQ;
    }

    @Override
    protected bcz fd() {
        return bda.uS;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ((this.cC == null || this.cC.k()) && !this.gQ() && this.j($$2) && $$0.g(this) < 9.0) {
            this.a($$0, $$1, $$2);
            if (!this.ao().B_()) {
                if (this.as.a(3) == 0) {
                    this.x(true);
                    this.y(true);
                    this.ao().a((cgk)this, (byte)41);
                } else {
                    this.y(false);
                    this.ao().a((cgk)this, (byte)40);
                }
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 41) {
            this.y(true);
        } else if ($$0 == 40) {
            this.y(false);
        } else {
            super.b($$0);
        }
    }

    private void y(boolean $$0) {
        md $$1 = ly.T;
        if (!$$0) {
            $$1 = ly.ai;
        }
        for (int $$2 = 0; $$2 < 7; ++$$2) {
            double $$3 = this.as.k() * 0.02;
            double $$4 = this.as.k() * 0.02;
            double $$5 = this.as.k() * 0.02;
            this.ao().a($$1, this.e(1.0), this.dS() + 0.5, this.h(1.0), $$3, $$4, $$5);
        }
    }

    protected void gP() {
        if (this.cB == null) {
            this.cB = new a<ddm>(this, ddm.class, 16.0f, 0.8, 1.33);
        }
        this.cs.a(this.cB);
        if (!this.gQ()) {
            this.cs.a(4, this.cB);
        }
    }

    public @Nullable cve b(axf $$0, cfy $$1) {
        return cgu.aP.a($$0, cgt.e);
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aX);
    }

    public static boolean c(cgu<cve> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$4.a(3) != 0;
    }

    @Override
    public boolean a(dwr $$0) {
        if ($$0.f(this) && !$$0.d(this.dj())) {
            is $$1 = this.dK();
            if ($$1.v() < $$0.V()) {
                return false;
            }
            eoh $$2 = $$0.a_($$1.e());
            if ($$2.a(dzs.i) || $$2.a(bdp.M)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$3 == null) {
            $$3 = new cfy.a(1.0f);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.5f * this.dk(), this.dF() * 0.4f);
    }

    @Override
    public boolean cv() {
        return this.cz() || super.cv();
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    static class b
    extends cpy {
        private final cve d;

        public b(cve $$0, double $$1, Predicate<dlt> $$2, boolean $$3) {
            super($$0, $$1, $$2, $$3);
            this.d = $$0;
        }

        @Override
        protected boolean h() {
            return super.h() && !this.d.gQ();
        }
    }

    static class a<T extends chl>
    extends cnu<T> {
        private final cve i;

        public a(cve $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4, cgs.e);
            this.i = $$0;
        }

        @Override
        public boolean b() {
            return !this.i.gQ() && super.b();
        }

        @Override
        public boolean c() {
            return !this.i.gQ() && super.c();
        }
    }
}

