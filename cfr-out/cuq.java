/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cuq
extends cuo {
    public cuq(cgu<? extends cuq> $$0, dwo $$1) {
        super((cgu<? extends cuo>)$$0, $$1);
    }

    @Override
    protected bcz W() {
        return bda.iE;
    }

    @Override
    protected bcz hw() {
        return bda.iF;
    }

    @Override
    protected bcz fd() {
        return bda.iH;
    }

    @Override
    protected bcz gV() {
        return bda.iI;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.iJ;
    }

    @Override
    public boolean a(cth $$0) {
        if ($$0 == this) {
            return false;
        }
        if ($$0 instanceof cuq || $$0 instanceof cur) {
            return this.hF() && ((cup)$$0).hF();
        }
        return false;
    }

    @Override
    protected void hE() {
        this.a(bda.iK, 0.4f, 1.0f);
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        cgu<cuo> $$2 = $$1 instanceof cur ? cgu.aL : cgu.M;
        cup $$3 = $$2.a($$0, cgt.e);
        if ($$3 != null) {
            this.a($$1, $$3);
        }
        return $$3;
    }
}

