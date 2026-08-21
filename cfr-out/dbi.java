/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import org.jspecify.annotations.Nullable;

public abstract class dbi
extends czz {
    protected static final alw<Boolean> a = ama.a(dbi.class, aly.k);
    public static final int b = 300;
    private static final boolean d = false;
    private static final boolean e = true;
    private static final int f = 0;
    protected int c = 0;

    public dbi(cgu<? extends dbi> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.b_(true);
        this.gP();
        this.a(fls.n, 16.0f);
        this.a(fls.o, -1.0f);
    }

    private void gP() {
        if (csp.a(this)) {
            this.N().e(true);
        }
    }

    protected abstract boolean k();

    public void x(boolean $$0) {
        this.aD().a(a, $$0);
    }

    protected boolean p() {
        return this.aD().a(a);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("IsImmuneToZombification", this.p());
        $$0.a("TimeInOverworld", this.c);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.b_($$0.a("CanPickUpLoot", true));
        this.x($$0.a("IsImmuneToZombification", false));
        this.c = $$0.a("TimeInOverworld", 0);
    }

    @Override
    protected void a(axf $$0) {
        super.a($$0);
        this.c = this.gQ() ? ++this.c : 0;
        if (this.c > 300) {
            this.gU();
            this.h($$0);
        }
    }

    @VisibleForTesting
    public void a(int $$0) {
        this.c = $$0;
    }

    public boolean gQ() {
        return !this.p() && !this.gG() && this.ao().c().a(ceg.J, this.dI()) != false;
    }

    protected void h(axf $$02) {
        this.a(cgu.ca, cge.a(this, true, true), (T $$0) -> $$0.a(new cfm(cfo.i, 200, 0)));
    }

    public boolean gR() {
        return !this.e_();
    }

    public abstract dbl gS();

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }

    protected boolean gT() {
        return this.fx().c(ki.D);
    }

    @Override
    public void T() {
        if (dbk.c(this)) {
            super.T();
        }
    }

    protected abstract void gU();
}

