/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cuv
extends cup {
    private final cuw cv = new cuw(this);
    private static final int cw = 18000;
    private static final boolean cx = false;
    private static final int cz = 0;
    private static final cgn cA = cgu.bo.n().a(cgm.a().a(cgl.a, 0.0f, cgu.bo.m() - 0.03125f, 0.0f)).a(0.5f);
    private boolean cB = false;
    private int cC = 0;

    public cuv(cgu<? extends cuv> $$0, dwo $$1) {
        super((cgu<? extends cup>)$$0, $$1);
    }

    public static cir.a p() {
        return cuv.hx().a(cis.u, 15.0).a(cis.x, 0.2f);
    }

    public static boolean c(cgu<? extends cth> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        if (cgt.a($$2)) {
            return cgt.b($$2) || cuv.a($$1, $$3);
        }
        return cth.b($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected void a(bgr $$0) {
        this.h(cis.q).a(cuv.a($$0::j));
    }

    @Override
    protected void hp() {
    }

    @Override
    protected bcz W() {
        if (((cgk)this).a(bdv.a)) {
            return bda.Ap;
        }
        return bda.Al;
    }

    @Override
    protected bcz fd() {
        return bda.Am;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.An;
    }

    @Override
    protected bcz bk() {
        if (this.aV()) {
            if (this.cr()) {
                ++this.cR;
                if (this.cR > 5 && this.cR % 3 == 0) {
                    return bda.Aq;
                }
                if (this.cR <= 5) {
                    return bda.As;
                }
            } else {
                return bda.As;
            }
        }
        return bda.Ao;
    }

    @Override
    protected void g(float $$0) {
        if (this.aV()) {
            super.g(0.3f);
        } else {
            super.g(Math.min(0.1f, $$0 * 25.0f));
        }
    }

    @Override
    protected void hE() {
        if (this.by()) {
            this.a(bda.Ar, 0.4f, 1.0f);
        } else {
            super.hE();
        }
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cA : super.b($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (this.gP() && this.cC++ >= 18000) {
            this.aC();
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("SkeletonTrap", this.gP());
        $$0.a("SkeletonTrapTime", this.cC);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("SkeletonTrap", false));
        this.cC = $$0.a("SkeletonTrapTime", 0);
    }

    @Override
    protected float fI() {
        return 0.96f;
    }

    public boolean gP() {
        return this.cB;
    }

    public void x(boolean $$0) {
        if ($$0 == this.cB) {
            return;
        }
        this.cB = $$0;
        if ($$0) {
            this.cs.a(1, this.cv);
        } else {
            this.cs.a(this.cv);
        }
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return cgu.bo.a($$0, cgt.e);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        if (!this.hn()) {
            return cdc.e;
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean e(cgv $$0) {
        return true;
    }
}

