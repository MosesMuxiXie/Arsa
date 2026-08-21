/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dca
extends dbv {
    public dca(cgu<? extends dca> $$0, dwo $$1) {
        super((cgu<? extends dbv>)$$0, $$1);
        this.a(fls.i, 8.0f);
    }

    @Override
    protected void D() {
        this.ct.a(3, new cqj<dbi>((chn)this, dbi.class, true));
        super.D();
    }

    @Override
    protected bcz W() {
        return bda.FW;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.FY;
    }

    @Override
    protected bcz fd() {
        return bda.FX;
    }

    @Override
    bcz p() {
        return bda.FZ;
    }

    @Override
    public bef<dlp> aa() {
        return null;
    }

    @Override
    public boolean h(dlt $$0) {
        return !$$0.a(bdy.cr) && super.h($$0);
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        this.a(cgv.a, new dlt(dlx.qx));
    }

    @Override
    protected void a(dxf $$0, bgr $$1, cda $$2) {
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        cie $$4 = super.a($$0, $$1, $$2, $$3);
        this.h(cis.d).a(4.0);
        this.gP();
        return $$4;
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        if (!super.c($$0, $$1)) {
            return false;
        }
        if ($$1 instanceof chl) {
            ((chl)$$1).b(new cfm(cfo.t, 200), (cgk)this);
        }
        return true;
    }

    @Override
    protected deh a(dlt $$0, float $$1, @Nullable dlt $$2) {
        deh $$3 = super.a($$0, $$1, $$2);
        $$3.e(100.0f);
        return $$3;
    }

    @Override
    public boolean b(cfm $$0) {
        if ($$0.a(cfo.t)) {
            return false;
        }
        return super.b($$0);
    }
}

