/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cxb
extends cth
implements chi {
    private static final alw<Integer> cv = ama.a(cxb.class, aly.b);
    private static final alw<jd<cxc>> cw = ama.a(cxb.class, aly.C);
    private final chg cx;

    public cxb(cgu<? extends cxb> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.cx = new chg(this.az, cv);
    }

    @Override
    protected void D() {
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cpi(this, 1.25));
        this.cs.a(3, new cnz(this, 1.0));
        this.cs.a(4, new cpy(this, 1.2, $$0 -> $$0.a(dlx.pn), false));
        this.cs.a(4, new cpy(this, 1.2, $$0 -> $$0.a(bdy.ba), false));
        this.cs.a(5, new coo(this, 1.1));
        this.cs.a(6, new cqd(this, 1.0));
        this.cs.a(7, new cox(this, ddm.class, 6.0f));
        this.cs.a(8, new cpk(this));
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 10.0).a(cis.x, 0.25);
    }

    @Override
    public @Nullable chl dl() {
        ddm $$0;
        cgk cgk2;
        if (this.al() && (cgk2 = this.do()) instanceof ddm && ($$0 = (ddm)cgk2).b(dlx.pn)) {
            return $$0;
        }
        return super.dl();
    }

    @Override
    public void a(alw<?> $$0) {
        if (cv.equals($$0) && this.ao().B_()) {
            this.cx.a();
        }
        super.a($$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, 0);
        $$0.a(cw, dfw.a(this.eo(), cxd.d));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        dfw.a($$0, this.gP());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        dfw.a($$0, mj.bo).ifPresent(this::b);
    }

    @Override
    protected bcz W() {
        return bda.wm;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.wo;
    }

    @Override
    protected bcz fd() {
        return bda.wn;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.wq, 0.15f, 1.0f);
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
        return $$3;
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
            return bda.wp;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(axf $$0, chk $$12) {
        if ($$0.av() != ccz.a) {
            dcp $$2 = this.a(cgu.ca, cge.a(this, false, true), (T $$1) -> {
                $$1.a(this.ep(), $$0.c(this.dK()));
                $$1.gz();
            });
            if ($$2 == null) {
                super.a($$0, $$12);
            }
        } else {
            super.a($$0, $$12);
        }
    }

    @Override
    protected void a(ddm $$0, ftm $$1) {
        super.a($$0, $$1);
        this.a($$0.ec(), $$0.ee() * 0.5f);
        this.bC = this.bE = this.ec();
        this.ab = this.bE;
        this.cx.b();
    }

    @Override
    protected ftm b(ddm $$0, ftm $$1) {
        return new ftm(0.0, 0.0, 1.0);
    }

    @Override
    protected float f(ddm $$0) {
        return (float)(this.i(cis.x) * 0.225 * (double)this.cx.c());
    }

    @Override
    public boolean a() {
        return this.cx.a(this.ep());
    }

    public @Nullable cxb b(axf $$0, cfy $$1) {
        cxb $$2 = cgu.aY.a($$0, cgt.e);
        if ($$2 != null && $$1 instanceof cxb) {
            cxb $$3 = (cxb)$$1;
            $$2.b(this.as.h() ? this.gP() : $$3.gP());
        }
        return $$2;
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.ba);
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.6f * this.dk(), this.dF() * 0.4f);
    }

    private void b(jd<cxc> $$0) {
        this.az.a(cw, $$0);
    }

    public jd<cxc> gP() {
        return this.az.a(cw);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aO) {
            return cxb.c($$0, this.gP());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aO);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aO) {
            this.b(cxb.c(ki.aO, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dfw.a(dft.a($$0, this.dK()), mj.bo).ifPresent(this::b);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }
}

