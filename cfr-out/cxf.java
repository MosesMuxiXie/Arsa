/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class cxf
extends cth
implements chq {
    private static final alw<Boolean> cv = ama.a(cxf.class, aly.k);
    private static final float cw = 6.0f;
    private float cx;
    private float cz;
    private int cA;
    private static final ccn cB = bhn.a(20, 39);
    private long cC;
    private @Nullable cgr<chl> cD;

    public cxf(cgu<? extends cxf> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return cgu.bc.a($$0, cgt.e);
    }

    @Override
    public boolean j(dlt $$0) {
        return false;
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new coh(this));
        this.cs.a(1, new c());
        this.cs.a(1, new cpi((cht)this, 2.0, $$0 -> $$0.e_() ? bdq.F : bdq.G));
        this.cs.a(4, new coo(this, 1.25));
        this.cs.a(5, new cpm(this, 1.0));
        this.cs.a(6, new cox(this, ddm.class, 6.0f));
        this.cs.a(7, new cpk(this));
        this.ct.a(1, new b());
        this.ct.a(2, new a());
        this.ct.a(3, new cqj<ddm>(this, ddm.class, 10, true, false, this::a));
        this.ct.a(4, new cqj<cvo>(this, cvo.class, 10, true, true, null));
        this.ct.a(5, new cqp<cxf>(this, false));
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 30.0).a(cis.o, 20.0).a(cis.x, 0.25).a(cis.d, 6.0);
    }

    public static boolean c(cgu<cxf> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        jd<dxo> $$5 = $$1.z($$3);
        if ($$5.a(bdo.al)) {
            return cxf.a($$1, $$3) && $$1.a_($$3.e()).a(bdp.cr);
        }
        return cxf.b($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a(this.ao(), $$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.b_($$0);
    }

    @Override
    public void c() {
        this.a(cB.a(this.as));
    }

    @Override
    public void b(long $$0) {
        this.cC = $$0;
    }

    @Override
    public long a() {
        return this.cC;
    }

    @Override
    public void a(@Nullable cgr<chl> $$0) {
        this.cD = $$0;
    }

    @Override
    public @Nullable cgr<chl> b() {
        return this.cD;
    }

    @Override
    protected bcz W() {
        if (this.e_()) {
            return bda.xj;
        }
        return bda.xi;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.xl;
    }

    @Override
    protected bcz fd() {
        return bda.xk;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.xm, 0.15f, 1.0f);
    }

    protected void gP() {
        if (this.cA <= 0) {
            this.b(bda.xn);
            this.cA = 40;
        }
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, false);
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            if (this.cz != this.cx) {
                this.j_();
            }
            this.cx = this.cz;
            this.cz = this.gQ() ? bgj.a(this.cz + 1.0f, 0.0f, 6.0f) : bgj.a(this.cz - 1.0f, 0.0f, 6.0f);
        }
        if (this.cA > 0) {
            --this.cA;
        }
        if (!this.ao().B_()) {
            this.a((axf)this.ao(), true);
        }
    }

    @Override
    public cgn b(chx $$0) {
        if (this.cz > 0.0f) {
            float $$1 = this.cz / 6.0f;
            float $$2 = 1.0f + $$1;
            return super.b($$0).a(1.0f, $$2);
        }
        return super.b($$0);
    }

    public boolean gQ() {
        return this.az.a(cv);
    }

    public void x(boolean $$0) {
        this.az.a(cv, $$0);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cx, this.cz) / 6.0f;
    }

    @Override
    protected float fI() {
        return 0.98f;
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$3 == null) {
            $$3 = new cfy.a(1.0f);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    class c
    extends coz {
        public c() {
            super(cxf.this, 1.25, true);
        }

        @Override
        protected void a(chl $$0) {
            if (this.b($$0)) {
                this.h();
                this.a.c(cxf$c.a(this.a), (cgk)$$0);
                cxf.this.x(false);
            } else if (this.a.g((cgk)$$0) < (double)(($$0.dF() + 3.0f) * ($$0.dF() + 3.0f))) {
                if (this.i()) {
                    cxf.this.x(false);
                    this.h();
                }
                if (this.k() <= 10) {
                    cxf.this.x(true);
                    cxf.this.gP();
                }
            } else {
                this.h();
                cxf.this.x(false);
            }
        }

        @Override
        public void e() {
            cxf.this.x(false);
            super.e();
        }
    }

    class b
    extends cqi {
        public b() {
            super(cxf.this, new Class[0]);
        }

        @Override
        public void d() {
            super.d();
            if (cxf.this.e_()) {
                this.h();
                this.e();
            }
        }

        @Override
        protected void a(chn $$0, chl $$1) {
            if ($$0 instanceof cxf && !$$0.e_()) {
                super.a($$0, $$1);
            }
        }
    }

    class a
    extends cqj<ddm> {
        public a() {
            super(cxf.this, ddm.class, 20, true, true, null);
        }

        @Override
        public boolean b() {
            if (cxf.this.e_()) {
                return false;
            }
            if (super.b()) {
                List<cxf> $$0 = cxf.this.ao().a(cxf.class, cxf.this.dj().c(8.0, 4.0, 8.0));
                for (cxf $$1 : $$0) {
                    if (!$$1.e_()) continue;
                    return true;
                }
            }
            return false;
        }

        @Override
        protected double l() {
            return super.l() * 0.5;
        }
    }
}

