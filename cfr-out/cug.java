/*
 * Decompiled with CFR 0.152.
 */
public abstract class cug
extends cth {
    private static final cgn cv = cgu.G.n().a(0.5f).b(0.665f);

    public cug(cgu<? extends cug> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cpi(this, 2.0));
        this.cs.a(2, new cnz(this, 1.0));
        this.cs.a(3, new cpy(this, 1.25, $$0 -> $$0.a(bdy.aE), false));
        this.cs.a(4, new coo(this, 1.25));
        this.cs.a(5, new cqd(this, 1.0));
        this.cs.a(6, new cox(this, ddm.class, 6.0f));
        this.cs.a(7, new cpk(this));
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aE);
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 10.0).a(cis.x, 0.2f);
    }

    @Override
    protected bcz W() {
        return bda.hg;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.hi;
    }

    @Override
    protected bcz fd() {
        return bda.hh;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.hk, 0.15f, 1.0f);
    }

    @Override
    protected float fC() {
        return 0.4f;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.sk) && !this.e_()) {
            $$0.a(bda.hj, 1.0f, 1.0f);
            dlt $$3 = dlw.a($$2, $$0, dlx.sq.m());
            $$0.a($$1, $$3);
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cv : super.b($$0);
    }
}

