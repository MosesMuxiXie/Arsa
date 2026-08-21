/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cxp
extends cxq {
    private static final alw<Integer> cD = ama.a(cxp.class, aly.b);
    private static final int cE = 0;

    public cxp(cgu<? extends cxp> $$0, dwo $$1) {
        super((cgu<? extends cxq>)$$0, $$1);
    }

    @Override
    protected lw p() {
        return ly.aT;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cD, 0);
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return cgu.al.a($$0, cgt.e);
    }

    @Override
    protected bcz gP() {
        return bda.mB;
    }

    @Override
    protected bcz W() {
        return bda.my;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.mA;
    }

    @Override
    protected bcz fd() {
        return bda.mz;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("DarkTicksRemaining", this.gQ());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.s($$0.a("DarkTicksRemaining", 0));
    }

    @Override
    public void d_() {
        super.d_();
        int $$0 = this.gQ();
        if ($$0 > 0) {
            this.s($$0 - 1);
        }
        this.ao().a(ly.aU, this.e(0.6), this.dS(), this.h(0.6), 0.0, 0.0, 0.0);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        if ($$3) {
            this.s(100);
        }
        return $$3;
    }

    private void s(int $$0) {
        this.az.a(cD, $$0);
    }

    public int gQ() {
        return this.az.a(cD);
    }

    public static boolean a(cgu<? extends chl> $$0, dxf $$1, cgt $$2, is $$3, bgr $$4) {
        return $$3.v() <= $$1.V() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dzs.J);
    }
}

