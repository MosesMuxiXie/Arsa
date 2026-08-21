/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class cuc
extends cth {
    private static final cgn cD = cgu.C.n().a(0.5f).b(0.2975f);
    private static final alw<jd<cud>> cE = ama.a(cuc.class, aly.x);
    private static final boolean cF = false;
    public float cv;
    public float cw;
    public float cx;
    public float cz;
    public float cA = 1.0f;
    private float cG = 1.0f;
    public int cB = this.as.a(6000) + 6000;
    public boolean cC = false;

    public cuc(cgu<? extends cuc> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.a(fls.j, 0.0f);
    }

    @Override
    protected void D() {
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cpi(this, 1.4));
        this.cs.a(2, new cnz(this, 1.0));
        this.cs.a(3, new cpy(this, 1.0, $$0 -> $$0.a(bdy.aS), false));
        this.cs.a(4, new coo(this, 1.1));
        this.cs.a(5, new cqd(this, 1.0));
        this.cs.a(6, new cox(this, ddm.class, 6.0f));
        this.cs.a(7, new cpk(this));
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cD : super.b($$0);
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 4.0).a(cis.x, 0.25);
    }

    @Override
    public void d_() {
        super.d_();
        this.cz = this.cv;
        this.cx = this.cw;
        this.cw += (this.aV() ? -1.0f : 4.0f) * 0.3f;
        this.cw = bgj.a(this.cw, 0.0f, 1.0f);
        if (!this.aV() && this.cA < 1.0f) {
            this.cA = 1.0f;
        }
        this.cA *= 0.9f;
        ftm $$0 = this.dN();
        if (!this.aV() && $$0.h < 0.0) {
            this.k($$0.d(1.0, 0.6, 1.0));
        }
        this.cv += this.cA * 2.0f;
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            if (this.cb() && !this.e_() && !this.gQ() && --this.cB <= 0) {
                if (this.a($$1, fnv.aI, this::a)) {
                    this.a(bda.fu, 1.0f, (this.as.i() - this.as.i()) * 0.2f + 1.0f);
                    this.c(etk.t);
                }
                this.cB = this.as.a(6000) + 6000;
            }
        }
    }

    @Override
    protected boolean bp() {
        return this.am > this.cG;
    }

    @Override
    protected void bo() {
        this.cG = this.am + this.cw / 2.0f;
    }

    @Override
    protected bcz W() {
        return bda.fs;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.fv;
    }

    @Override
    protected bcz fd() {
        return bda.ft;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.fw, 0.15f, 1.0f);
    }

    public @Nullable cuc b(axf $$0, cfy $$1) {
        cuc $$2 = cgu.C.a($$0, cgt.e);
        if ($$2 != null && $$1 instanceof cuc) {
            cuc $$3 = (cuc)$$1;
            $$2.b(this.as.h() ? this.gP() : $$3.gP());
        }
        return $$2;
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dfw.a(dft.a($$0, this.dK()), mj.aV).ifPresent(this::b);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aS);
    }

    @Override
    protected int f(axf $$0) {
        if (this.gQ()) {
            return 10;
        }
        return super.f($$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cE, dfw.a(this.eo(), cue.a));
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        this.cC = $$02.a("IsChickenJockey", false);
        $$02.e("EggLayTime").ifPresent($$0 -> {
            this.cB = $$0;
        });
        dfw.a($$02, mj.aV).ifPresent(this::b);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("IsChickenJockey", this.cC);
        $$0.a("EggLayTime", this.cB);
        dfw.a($$0, this.gP());
    }

    public void b(jd<cud> $$0) {
        this.az.a(cE, $$0);
    }

    public jd<cud> gP() {
        return this.az.a(cE);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aQ) {
            return cuc.c($$0, new dku<cud>(this.gP()));
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aQ);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aQ) {
            Optional<jd<cud>> $$2 = cuc.c(ki.aQ, $$1).a(this.eo());
            if ($$2.isPresent()) {
                this.b($$2.get());
                return true;
            }
            return false;
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean i(double $$0) {
        return this.gQ();
    }

    @Override
    protected void a(cgk $$0, cgk.b $$1) {
        super.a($$0, $$1);
        if ($$0 instanceof chl) {
            ((chl)$$0).bC = this.bC;
        }
    }

    public boolean gQ() {
        return this.cC;
    }

    public void x(boolean $$0) {
        this.cC = $$0;
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }
}

