/*
 * Decompiled with CFR 0.152.
 */
public class dgn
extends dgi {
    static final alw<String> e = ama.a(dgn.class, aly.e);
    static final alw<yh> f = ama.a(dgn.class, aly.f);
    private final dvo g = new a();
    private static final int h = 4;
    private int i;

    public dgn(cgu<? extends dgn> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    protected dlp p() {
        return dlx.pi;
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.xb);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(e, "");
        $$0.a(f, yg.a);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.g.a($$0);
        this.aD().a(e, this.e().d());
        this.aD().a(f, this.e().c());
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.g.a($$0);
    }

    @Override
    public eoh w() {
        return dzs.gC.m();
    }

    public dvo e() {
        return this.g;
    }

    @Override
    public void a(axf $$0, int $$1, int $$2, int $$3, boolean $$4) {
        if ($$4 && this.at - this.i >= 4) {
            this.e().b($$0);
            this.i = this.at;
        }
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        if (!$$0.hi()) {
            return cdc.e;
        }
        if ($$0.ao().B_()) {
            $$0.a(this);
        }
        return cdc.a;
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (f.equals($$0)) {
            try {
                this.g.b(this.aD().a(f));
            }
            catch (Throwable throwable) {}
        } else if (e.equals($$0)) {
            this.g.a(this.aD().a(e));
        }
    }

    class a
    extends dvo {
        a() {
        }

        @Override
        public void a(axf $$0) {
            dgn.this.aD().a(e, this.d());
            dgn.this.aD().a(f, this.c());
        }

        @Override
        public ed a(axf $$0, ec $$1) {
            return new ed($$1, dgn.this.dI(), dgn.this.cl(), $$0, bbh.c, this.e().getString(), dgn.this.R_(), $$0.s(), dgn.this);
        }

        @Override
        public boolean a() {
            return !dgn.this.eh();
        }
    }
}

