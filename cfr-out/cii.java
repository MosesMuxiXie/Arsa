/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class cii
extends cth
implements chs {
    public static final int cv = 144;
    private static final int cz = 2;
    private static final int cA = 3;
    private static final int cB = 1;
    private static final boolean cC = false;
    protected static final alw<Byte> cw = ama.a(cii.class, aly.a);
    protected static final alw<Optional<cgr<chl>>> cx = ama.a(cii.class, aly.r);
    private boolean cD = false;

    protected cii(cgu<? extends cii> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cw, (byte)0);
        $$0.a(cx, Optional.empty());
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        cgr<chl> $$1 = this.ae_();
        cgr.a($$1, $$0, "Owner");
        $$0.a("Sitting", this.cD);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        cgr $$1 = cgr.a($$0, "Owner", this.ao());
        if ($$1 != null) {
            try {
                this.az.a(cx, Optional.of($$1));
                this.a(true, false);
            }
            catch (Throwable $$2) {
                this.a(false, true);
            }
        } else {
            this.az.a(cx, Optional.empty());
            this.a(false, true);
        }
        this.cD = $$0.a("Sitting", false);
        this.y(this.cD);
    }

    @Override
    public boolean aj_() {
        return true;
    }

    protected void x(boolean $$0) {
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

    @Override
    public void b(byte $$0) {
        if ($$0 == 7) {
            this.x(true);
        } else if ($$0 == 6) {
            this.x(false);
        } else {
            super.b($$0);
        }
    }

    public boolean p() {
        return (this.az.a(cw) & 4) != 0;
    }

    public void a(boolean $$0, boolean $$1) {
        byte $$2 = this.az.a(cw);
        if ($$0) {
            this.az.a(cw, (byte)($$2 | 4));
        } else {
            this.az.a(cw, (byte)($$2 & 0xFFFFFFFB));
        }
        if ($$1) {
            this.gP();
        }
    }

    protected void gP() {
    }

    public boolean gQ() {
        return (this.az.a(cw) & 1) != 0;
    }

    public void y(boolean $$0) {
        byte $$1 = this.az.a(cw);
        if ($$0) {
            this.az.a(cw, (byte)($$1 | 1));
        } else {
            this.az.a(cw, (byte)($$1 & 0xFFFFFFFE));
        }
    }

    @Override
    public @Nullable cgr<chl> ae_() {
        return this.az.a(cx).orElse(null);
    }

    public void i(@Nullable chl $$0) {
        this.az.a(cx, Optional.ofNullable($$0).map(cgr::a));
    }

    public void b(@Nullable cgr<chl> $$0) {
        this.az.a(cx, Optional.ofNullable($$0));
    }

    public void g(ddm $$0) {
        this.a(true, true);
        this.i($$0);
        if ($$0 instanceof axg) {
            axg $$1 = (axg)$$0;
            aj.y.a($$1, this);
        }
    }

    @Override
    public boolean c(chl $$0) {
        if (this.j($$0)) {
            return false;
        }
        return super.c($$0);
    }

    public boolean j(chl $$0) {
        return $$0 == this.U_();
    }

    public boolean a(chl $$0, chl $$1) {
        return true;
    }

    @Override
    public @Nullable fum cI() {
        chl $$1;
        fum $$0 = super.cI();
        if ($$0 != null) {
            return $$0;
        }
        if (this.p() && ($$1 = this.V_()) != null) {
            return $$1.cI();
        }
        return null;
    }

    @Override
    protected boolean u(cgk $$0) {
        if (this.p()) {
            chl $$1 = this.V_();
            if ($$0 == $$1) {
                return true;
            }
            if ($$1 != null) {
                return $$1.u($$0);
            }
        }
        return super.u($$0);
    }

    @Override
    public void a(cex $$0) {
        chl chl2;
        axf $$1;
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf && ($$1 = (axf)dwo2).U().a(eua.T).booleanValue() && (chl2 = this.U_()) instanceof axg) {
            axg $$2 = (axg)chl2;
            $$2.a(this.fo().a());
        }
        super.a($$0);
    }

    public boolean gR() {
        return this.cD;
    }

    public void z(boolean $$0) {
        this.cD = $$0;
    }

    public void gS() {
        chl $$0 = this.U_();
        if ($$0 != null) {
            this.h($$0.dK());
        }
    }

    public boolean gT() {
        chl $$0 = this.U_();
        return $$0 != null && this.g((cgk)this.U_()) >= 144.0;
    }

    private void h(is $$0) {
        for (int $$1 = 0; $$1 < 10; ++$$1) {
            int $$2 = this.as.a(-3, 3);
            int $$3 = this.as.a(-3, 3);
            if (Math.abs($$2) < 2 && Math.abs($$3) < 2) continue;
            int $$4 = this.as.a(-1, 1);
            if (!this.a($$0.u() + $$2, $$0.v() + $$4, $$0.w() + $$3)) continue;
            return;
        }
    }

    private boolean a(int $$0, int $$1, int $$2) {
        if (!this.i(new is($$0, $$1, $$2))) {
            return false;
        }
        this.b((double)$$0 + 0.5, $$1, (double)$$2 + 0.5, this.ec(), this.ee());
        this.cr.n();
        return true;
    }

    private boolean i(is $$0) {
        fls $$1 = flx.b(this, $$0);
        if ($$1 != fls.c) {
            return false;
        }
        eoh $$2 = this.ao().a_($$0.e());
        if (!this.gV() && $$2.b() instanceof eei) {
            return false;
        }
        is $$3 = $$0.b(this.dK());
        return this.ao().a((cgk)this, this.dj().a($$3));
    }

    public final boolean gU() {
        return this.gR() || this.cq() || this.ai_() || this.U_() != null && this.U_().au();
    }

    protected boolean gV() {
        return false;
    }

    public class a
    extends cpi {
        public a(double $$1, bef<cez> $$2) {
            super((cht)cii.this, $$1, $$2);
        }

        public a(double $$1) {
            super(cii.this, $$1);
        }

        @Override
        public void a() {
            if (!cii.this.gU() && cii.this.gT()) {
                cii.this.gS();
            }
            super.a();
        }
    }
}

