/*
 * Decompiled with CFR 0.152.
 */
public abstract class dfa
extends deg
implements dea {
    private static final alw<dlt> b = ama.a(dfa.class, aly.h);

    public dfa(cgu<? extends dfa> $$0, dwo $$1) {
        super((cgu<? extends deg>)$$0, $$1);
    }

    public dfa(cgu<? extends dfa> $$0, double $$1, double $$2, double $$3, dwo $$4, dlt $$5) {
        super($$0, $$1, $$2, $$3, $$4);
        this.a($$5);
    }

    public dfa(cgu<? extends dfa> $$0, chl $$1, dwo $$2, dlt $$3) {
        this($$0, $$1.dP(), $$1.dT() - (double)0.1f, $$1.dV(), $$2, $$3);
        this.d($$1);
    }

    public void a(dlt $$0) {
        this.aD().a(b, $$0.c(1));
    }

    protected abstract dlp f();

    @Override
    public dlt e() {
        return this.aD().a(b);
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(b, new dlt(this.f()));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Item", dlt.b, this.e());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("Item", dlt.b).orElseGet(() -> new dlt(this.f())));
    }
}

