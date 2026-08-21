/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ekt
extends emm {
    private static final yh d = yh.c("container.barrel");
    private jm<dlt> e = jm.a(27, dlt.l);
    private final elp f = new elp(){

        @Override
        protected void a(dwo $$0, is $$1, eoh $$2) {
            ekt.this.a($$2, bda.bL);
            ekt.this.a($$2, true);
        }

        @Override
        protected void b(dwo $$0, is $$1, eoh $$2) {
            ekt.this.a($$2, bda.bK);
            ekt.this.a($$2, false);
        }

        @Override
        protected void a(dwo $$0, is $$1, eoh $$2, int $$3, int $$4) {
        }

        @Override
        public boolean a(ddm $$0) {
            if ($$0.cn instanceof dhs) {
                ccv $$1 = ((dhs)$$0.cn).l();
                return $$1 == ekt.this;
            }
            return false;
        }
    };

    public ekt(is $$0, eoh $$1) {
        super(eld.B, $$0, $$1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.d_($$0)) {
            ccw.a($$0, this.e);
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.e = jm.a(this.b(), dlt.l);
        if (!this.c_($$0)) {
            ccw.a($$0, this.e);
        }
    }

    @Override
    public int b() {
        return 27;
    }

    @Override
    protected jm<dlt> g() {
        return this.e;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.e = $$0;
    }

    @Override
    protected yh k() {
        return d;
    }

    @Override
    protected dhi a(int $$0, ddl $$1) {
        return dhs.a($$0, $$1, this);
    }

    @Override
    public void a(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            this.f.a($$0.k_(), this.j(), this.aD_(), this.o(), $$0.ar());
        }
    }

    @Override
    public void b(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            this.f.a($$0.k_(), this.j(), this.aD_(), this.o());
        }
    }

    @Override
    public List<cgd> am_() {
        return this.f.a(this.j(), this.aD_());
    }

    public void l() {
        if (!this.p) {
            this.f.c(this.j(), this.aD_(), this.o());
        }
    }

    void a(eoh $$0, boolean $$1) {
        this.n.a(this.aD_(), (eoh)$$0.b(dyw.c, $$1), 3);
    }

    void a(eoh $$0, bcz $$1) {
        jy $$2 = $$0.c(dyw.b).q();
        double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
        double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
        double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
        this.n.a(null, $$3, $$4, $$5, $$1, bdb.e, 0.5f, this.n.y.i() * 0.1f + 0.9f);
    }
}

