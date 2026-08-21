/*
 * Decompiled with CFR 0.152.
 */
public abstract class cvm
extends cht {
    public static final int d = 120;

    protected cvm(cgu<? extends cvm> $$0, dwo $$1) {
        super((cgu<? extends cht>)$$0, $$1);
        this.a(fls.j, 0.0f);
    }

    @Override
    public boolean a(dwr $$0) {
        return $$0.f(this);
    }

    @Override
    public int S() {
        return 120;
    }

    @Override
    protected int f(axf $$0) {
        return 1 + this.as.a(3);
    }

    protected void a(axf $$0, int $$1) {
        if (this.cb() && !this.by()) {
            this.j($$1 - 1);
            if (this.eA()) {
                this.j(0);
                this.a($$0, this.en().i(), 2.0f);
            }
        } else {
            this.j(300);
        }
    }

    @Override
    public void aJ() {
        int $$0 = this.cK();
        super.aJ();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.a($$1, $$0);
        }
    }

    @Override
    public boolean db() {
        return false;
    }

    @Override
    public boolean aj_() {
        return false;
    }

    public static boolean c(cgu<? extends cvm> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        int $$5 = $$1.V();
        int $$6 = $$5 - 13;
        return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(bdv.a) && $$1.a_($$3.d()).a(dzs.J);
    }
}

