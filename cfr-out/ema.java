/*
 * Decompiled with CFR 0.152.
 */
public class ema
extends elb
implements emj {
    private final elk a = new elk();
    private final elp b = new elp(){

        @Override
        protected void a(dwo $$0, is $$1, eoh $$2) {
            $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, bda.jH, bdb.e, 0.5f, $$0.y.i() * 0.1f + 0.9f);
        }

        @Override
        protected void b(dwo $$0, is $$1, eoh $$2) {
            $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, bda.jG, bdb.e, 0.5f, $$0.y.i() * 0.1f + 0.9f);
        }

        @Override
        protected void a(dwo $$0, is $$1, eoh $$2, int $$3, int $$4) {
            $$0.a(ema.this.o, dzs.gv, 1, $$4);
        }

        @Override
        public boolean a(ddm $$0) {
            return $$0.gZ().b(ema.this);
        }
    };

    public ema(is $$0, eoh $$1) {
        super(eld.d, $$0, $$1);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, ema $$3) {
        $$3.a.a();
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if ($$0 == 1) {
            this.a.a($$1 > 0);
            return true;
        }
        return super.a_($$0, $$1);
    }

    public void a(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            this.b.a($$0.k_(), this.j(), this.aD_(), this.o(), $$0.ar());
        }
    }

    public void b(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            this.b.a($$0.k_(), this.j(), this.aD_(), this.o());
        }
    }

    public boolean a(ddm $$0) {
        return ccv.a(this, $$0);
    }

    public void a() {
        if (!this.p) {
            this.b.c(this.j(), this.aD_(), this.o());
        }
    }

    @Override
    public float a(float $$0) {
        return this.a.a($$0);
    }
}

