/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class deo
extends dem
implements dea {
    private static final float e = 12.25f;
    private static final alw<dlt> f = ama.a(deo.class, aly.h);

    public deo(cgu<? extends deo> $$0, dwo $$1) {
        super((cgu<? extends dem>)$$0, $$1);
    }

    public deo(cgu<? extends deo> $$0, double $$1, double $$2, double $$3, ftm $$4, dwo $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
    }

    public deo(cgu<? extends deo> $$0, chl $$1, ftm $$2, dwo $$3) {
        super($$0, $$1, $$2, $$3);
    }

    public void a(dlt $$0) {
        if ($$0.f()) {
            this.aD().a(f, this.u());
        } else {
            this.aD().a(f, $$0.c(1));
        }
    }

    @Override
    protected void bb() {
    }

    @Override
    public dlt e() {
        return this.aD().a(f);
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(f, this.u());
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Item", dlt.b, this.e());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("Item", dlt.b).orElse(this.u()));
    }

    private dlt u() {
        return new dlt(dlx.wi);
    }

    @Override
    public @Nullable cic a_(int $$0) {
        if ($$0 == 0) {
            return cic.a(this::e, this::a);
        }
        return super.a_($$0);
    }

    @Override
    public boolean a(double $$0) {
        if (this.at < 2 && $$0 < 12.25) {
            return false;
        }
        return super.a($$0);
    }
}

