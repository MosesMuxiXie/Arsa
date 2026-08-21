/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dej
extends deh {
    private static final int e = 200;
    private int f = 200;

    public dej(cgu<? extends dej> $$0, dwo $$1) {
        super((cgu<? extends deh>)$$0, $$1);
    }

    public dej(dwo $$0, chl $$1, dlt $$2, @Nullable dlt $$3) {
        super(cgu.bv, $$1, $$0, $$2, $$3);
    }

    public dej(dwo $$0, double $$1, double $$2, double $$3, dlt $$4, @Nullable dlt $$5) {
        super(cgu.bv, $$1, $$2, $$3, $$0, $$4, $$5);
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_() && !this.f()) {
            this.ao().a(me.a(ly.q, -1, 1.0f), this.dP(), this.dR(), this.dV(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void a(chl $$0) {
        super.a($$0);
        cfm $$1 = new cfm(cfo.x, this.f, 0);
        $$0.b($$1, this.m());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = $$0.a("Duration", 200);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Duration", this.f);
    }

    @Override
    protected dlt u() {
        return new dlt(dlx.xE);
    }
}

