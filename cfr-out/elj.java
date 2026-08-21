/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class elj
extends emm
implements emj {
    private static final int d = 1;
    private static final yh e = yh.c("container.chest");
    private jm<dlt> f = jm.a(27, dlt.l);
    private final elp g = new elp(){

        @Override
        protected void a(dwo $$0, is $$1, eoh $$2) {
            dzq dzq2 = $$2.b();
            if (dzq2 instanceof eau) {
                eau $$3 = (eau)dzq2;
                elj.a($$0, $$1, $$2, $$3.r());
            }
        }

        @Override
        protected void b(dwo $$0, is $$1, eoh $$2) {
            dzq dzq2 = $$2.b();
            if (dzq2 instanceof eau) {
                eau $$3 = (eau)dzq2;
                elj.a($$0, $$1, $$2, $$3.s());
            }
        }

        @Override
        protected void a(dwo $$0, is $$1, eoh $$2, int $$3, int $$4) {
            elj.this.a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public boolean a(ddm $$0) {
            if ($$0.cn instanceof dhs) {
                ccv $$1 = ((dhs)$$0.cn).l();
                return $$1 == elj.this || $$1 instanceof ccu && ((ccu)$$1).a(elj.this);
            }
            return false;
        }
    };
    private final elk h = new elk();

    protected elj(eld<?> $$0, is $$1, eoh $$2) {
        super($$0, $$1, $$2);
    }

    public elj(is $$0, eoh $$1) {
        this(eld.b, $$0, $$1);
    }

    @Override
    public int b() {
        return 27;
    }

    @Override
    protected yh k() {
        return e;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = jm.a(this.b(), dlt.l);
        if (!this.c_($$0)) {
            ccw.a($$0, this.f);
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.d_($$0)) {
            ccw.a($$0, this.f);
        }
    }

    public static void a(dwo $$0, is $$1, eoh $$2, elj $$3) {
        $$3.h.a();
    }

    static void a(dwo $$0, is $$1, eoh $$2, bcz $$3) {
        eoz $$4 = $$2.c(eau.d);
        if ($$4 == eoz.b) {
            return;
        }
        double $$5 = (double)$$1.u() + 0.5;
        double $$6 = (double)$$1.v() + 0.5;
        double $$7 = (double)$$1.w() + 0.5;
        if ($$4 == eoz.c) {
            iz $$8 = eau.n($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
        }
        $$0.a(null, $$5, $$6, $$7, $$3, bdb.e, 0.5f, $$0.y.i() * 0.1f + 0.9f);
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if ($$0 == 1) {
            this.h.a($$1 > 0);
            return true;
        }
        return super.a_($$0, $$1);
    }

    @Override
    public void a(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            this.g.a($$0.k_(), this.j(), this.aD_(), this.o(), $$0.ar());
        }
    }

    @Override
    public void b(cgd $$0) {
        if (!this.p && !$$0.k_().au()) {
            this.g.a($$0.k_(), this.j(), this.aD_(), this.o());
        }
    }

    @Override
    public List<cgd> am_() {
        return this.g.a(this.j(), this.aD_());
    }

    @Override
    protected jm<dlt> g() {
        return this.f;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.f = $$0;
    }

    @Override
    public float a(float $$0) {
        return this.h.a($$0);
    }

    public static int a(dvt $$0, is $$1) {
        elb $$3;
        eoh $$2 = $$0.a_($$1);
        if ($$2.x() && ($$3 = $$0.c_($$1)) instanceof elj) {
            return ((elj)$$3).g.a();
        }
        return 0;
    }

    public static void a(elj $$0, elj $$1) {
        jm<dlt> $$2 = $$0.g();
        $$0.a($$1.g());
        $$1.a($$2);
    }

    @Override
    protected dhi a(int $$0, ddl $$1) {
        return dhs.a($$0, $$1, this);
    }

    public void l() {
        if (!this.p) {
            this.g.c(this.j(), this.aD_(), this.o());
        }
    }

    protected void a(dwo $$0, is $$1, eoh $$2, int $$3, int $$4) {
        dzq $$5 = $$2.b();
        $$0.a($$1, $$5, 1, $$4);
    }
}

