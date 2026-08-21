/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public class dby
extends dbv {
    private static final int d = 300;
    private static final alw<Boolean> e = ama.a(dby.class, aly.k);
    public static final String c = "StrayConversionTime";
    private static final int f = -1;
    private int cv;
    private int cw;

    public dby(cgu<? extends dby> $$0, dwo $$1) {
        super((cgu<? extends dbv>)$$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(e, false);
    }

    public boolean gT() {
        return this.aD().a(e);
    }

    public void x(boolean $$0) {
        this.az.a(e, $$0);
    }

    @Override
    public boolean gS() {
        return this.gT();
    }

    @Override
    public void g() {
        if (!this.ao().B_() && this.cb() && !this.gG()) {
            if (this.aJ) {
                if (this.gT()) {
                    --this.cw;
                    if (this.cw < 0) {
                        this.gU();
                    }
                } else {
                    ++this.cv;
                    if (this.cv >= 140) {
                        this.a(300);
                    }
                }
            } else {
                this.cv = -1;
                this.x(false);
            }
        }
        super.g();
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(c, this.gT() ? this.cw : -1);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        int $$1 = $$0.a(c, -1);
        if ($$1 != -1) {
            this.a($$1);
        } else {
            this.x(false);
        }
    }

    @VisibleForTesting
    public void a(int $$0) {
        this.cw = $$0;
        this.x(true);
    }

    protected void gU() {
        this.a(cgu.bA, cge.a(this, true, true), (T $$0) -> {
            if (!this.bq()) {
                this.ao().a(null, 1048, this.dK(), 0);
            }
        });
    }

    @Override
    public boolean ea() {
        return false;
    }

    @Override
    protected bcz W() {
        return bda.Ai;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.At;
    }

    @Override
    protected bcz fd() {
        return bda.Ak;
    }

    @Override
    bcz p() {
        return bda.Av;
    }
}

