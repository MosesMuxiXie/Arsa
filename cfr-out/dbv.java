/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class dbv
extends czz
implements dac {
    private static final int c = 20;
    private static final int d = 40;
    protected static final int a = 50;
    protected static final int b = 70;
    private final cpp<dbv> e = new cpp<dbv>(this, 1.0, 20, 15.0f);
    private final coz f = new coz(this, 1.2, false){

        @Override
        public void e() {
            super.e();
            dbv.this.w(false);
        }

        @Override
        public void d() {
            super.d();
            dbv.this.w(true);
        }
    };

    protected dbv(cgu<? extends dbv> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.gP();
    }

    @Override
    protected void D() {
        this.cs.a(2, new cps(this));
        this.cs.a(3, new cog(this, 1.0));
        this.cs.a(3, new cnu<cxu>(this, cxu.class, 6.0f, 1.0, 1.2));
        this.cs.a(5, new cqd(this, 1.0));
        this.cs.a(6, new cox(this, ddm.class, 8.0f));
        this.cs.a(6, new cpk(this));
        this.ct.a(1, new cqi(this, new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, true));
        this.ct.a(3, new cqj<cxs>(this, cxs.class, 10, true, false, cxs.cv));
    }

    public static cir.a k() {
        return czz.gW().a(cis.x, 0.25);
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(this.p(), 0.15f, 1.0f);
    }

    abstract bcz p();

    @Override
    public void t() {
        super.t();
        cgk cgk2 = this.dA();
        if (cgk2 instanceof cht) {
            cht $$0 = (cht)cgk2;
            this.bC = $$0.bC;
        }
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        super.a($$0, $$1);
        this.a(cgv.a, new dlt(dlx.pW));
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        $$3 = super.a($$0, $$1, $$2, $$3);
        bgr $$4 = $$0.G_();
        this.a($$4, $$1);
        this.a($$0, $$4, $$1);
        this.gP();
        this.b_($$4.i() < 0.55f * $$1.d());
        if (this.a(cgv.f).f() && bhd.b() && $$4.i() < 0.25f) {
            this.a(cgv.f, new dlt($$4.i() < 0.1f ? dzs.eK : dzs.eJ));
            this.a(cgv.f, 0.0f);
        }
        return $$3;
    }

    public void gP() {
        if (this.ao() == null || this.ao().B_()) {
            return;
        }
        this.cs.a(this.f);
        this.cs.a(this.e);
        dlt $$0 = this.b(dee.a(this, dlx.pW));
        if ($$0.a(dlx.pW)) {
            int $$1 = this.gQ();
            if (this.ao().av() != ccz.d) {
                $$1 = this.gR();
            }
            this.e.c($$1);
            this.cs.a(4, this.e);
        } else {
            this.cs.a(4, this.f);
        }
    }

    protected int gQ() {
        return 20;
    }

    protected int gR() {
        return 40;
    }

    @Override
    public void a(chl $$0, float $$1) {
        dlt $$2 = this.b(dee.a(this, dlx.pW));
        dlt $$3 = this.d($$2);
        deh $$4 = this.a($$3, $$1, $$2);
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

    protected deh a(dlt $$0, float $$1, @Nullable dlt $$2) {
        return dee.a(this, $$0, $$1, $$2);
    }

    @Override
    public boolean g(dlt $$0) {
        return $$0.h() == dlx.pW;
    }

    @Override
    public bef<dlp> aa() {
        return bdy.cn;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.gP();
    }

    @Override
    public void a(cgv $$0, dlt $$1, dlt $$2) {
        super.a($$0, $$1, $$2);
        if (!this.ao().B_()) {
            this.gP();
        }
    }

    public boolean gS() {
        return this.cO();
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        if ($$1.a(bdy.cf)) {
            return false;
        }
        return super.c($$0, $$1);
    }
}

