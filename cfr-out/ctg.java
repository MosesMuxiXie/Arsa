/*
 * Decompiled with CFR 0.152.
 */
public abstract class ctg
extends cfy {
    protected ctg(cgu<? extends ctg> $$0, dwo $$1) {
        super((cgu<? extends cfy>)$$0, $$1);
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
    public int f(axf $$0) {
        return 1 + this.as.a(3);
    }

    protected void r(int $$0) {
        if (this.cb() && !this.by()) {
            this.j($$0 - 1);
            if (this.eA()) {
                this.j(0);
                this.a(this.en().i(), 2.0f);
            }
        } else {
            this.j(300);
        }
    }

    @Override
    public void aJ() {
        int $$0 = this.cK();
        super.aJ();
        this.r($$0);
    }

    @Override
    public boolean db() {
        return false;
    }

    @Override
    public boolean aj_() {
        return false;
    }

    public static boolean b(cgu<? extends ctg> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        int $$5 = $$1.V();
        int $$6 = $$5 - 13;
        return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(bdv.a) && $$1.a_($$3.d()).a(dzs.J);
    }
}

