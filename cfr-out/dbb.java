/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dbb
extends dbe {
    private @Nullable cxj a;

    public dbb(cgu<? extends dbb> $$0, dwo $$1) {
        super((cgu<? extends dbe>)$$0, $$1);
        this.cn = 10;
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new coh(this));
        this.cs.a(1, new b());
        this.cs.a(2, new cnu<ddm>(this, ddm.class, 8.0f, 0.6, 1.0));
        this.cs.a(3, new cnu<dat>(this, dat.class, 8.0f, 0.6, 1.0));
        this.cs.a(4, new c());
        this.cs.a(5, new a());
        this.cs.a(6, new d());
        this.cs.a(8, new cpm(this, 0.6));
        this.cs.a(9, new cox(this, ddm.class, 3.0f, 1.0f));
        this.cs.a(10, new cox(this, chn.class, 8.0f));
        this.ct.a(1, new cqi(this, dfi.class).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true).c(300));
        this.ct.a(3, new cqj<dcw>((chn)this, dcw.class, false).c(300));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, false));
    }

    public static cir.a gP() {
        return czz.gW().a(cis.x, 0.5).a(cis.o, 12.0).a(cis.u, 24.0);
    }

    @Override
    public bcz gX() {
        return bda.kh;
    }

    @Override
    protected boolean u(cgk $$0) {
        dai $$1;
        if ($$0 == this) {
            return true;
        }
        if (super.u($$0)) {
            return true;
        }
        if ($$0 instanceof dai && ($$1 = (dai)$$0).gP() != null) {
            return this.u($$1.gP());
        }
        return false;
    }

    @Override
    protected bcz W() {
        return bda.kf;
    }

    @Override
    protected bcz fd() {
        return bda.ki;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.kk;
    }

    void a(@Nullable cxj $$0) {
        this.a = $$0;
    }

    @Nullable cxj hl() {
        return this.a;
    }

    @Override
    protected bcz gZ() {
        return bda.kg;
    }

    @Override
    public void a(axf $$0, int $$1, boolean $$2) {
    }

    class b
    extends dbe.b {
        b() {
            super(dbb.this);
        }

        @Override
        public void a() {
            if (dbb.this.ag_() != null) {
                dbb.this.J().a(dbb.this.ag_(), (float)dbb.this.ae(), (float)dbb.this.ac());
            } else if (dbb.this.hl() != null) {
                dbb.this.J().a(dbb.this.hl(), (float)dbb.this.ae(), (float)dbb.this.ac());
            }
        }
    }

    class c
    extends dbe.c {
        private final csk e;

        c() {
            super(dbb.this);
            this.e = csk.b().a(16.0).d().e();
        }

        @Override
        public boolean b() {
            if (!super.b()) {
                return false;
            }
            int $$0 = dbb$c.a(dbb.this.ao()).a(dai.class, this.e, dbb.this, dbb.this.dj().g(16.0)).size();
            return dbb.this.as.a(8) + 1 > $$0;
        }

        @Override
        protected int h() {
            return 100;
        }

        @Override
        protected int i() {
            return 340;
        }

        @Override
        protected void k() {
            axf $$0 = (axf)dbb.this.ao();
            fum $$1 = dbb.this.cI();
            for (int $$2 = 0; $$2 < 3; ++$$2) {
                is $$3 = dbb.this.dK().b(-2 + dbb.this.as.a(5), 1, -2 + dbb.this.as.a(5));
                dai $$4 = cgu.bK.a(dbb.this.ao(), cgt.f);
                if ($$4 == null) continue;
                $$4.a($$3, 0.0f, 0.0f);
                $$4.a((dxf)$$0, $$0.c($$3), cgt.f, null);
                $$4.a(dbb.this);
                $$4.h($$3);
                $$4.a(20 * (30 + dbb.this.as.a(90)));
                if ($$1 != null) {
                    $$0.i().a($$4.da(), $$1);
                }
                $$0.a_($$4);
                $$0.a(etk.t, $$3, etk.a.a(dbb.this));
            }
        }

        @Override
        protected bcz l() {
            return bda.km;
        }

        @Override
        protected dbe.a m() {
            return dbe.a.b;
        }
    }

    class a
    extends dbe.c {
        a() {
            super(dbb.this);
        }

        @Override
        protected int h() {
            return 40;
        }

        @Override
        protected int i() {
            return 100;
        }

        @Override
        protected void k() {
            chl $$0 = dbb.this.ag_();
            double $$1 = Math.min($$0.dR(), dbb.this.dR());
            double $$2 = Math.max($$0.dR(), dbb.this.dR()) + 1.0;
            float $$3 = (float)bgj.d($$0.dV() - dbb.this.dV(), $$0.dP() - dbb.this.dP());
            if (dbb.this.g((cgk)$$0) < 9.0) {
                for (int $$4 = 0; $$4 < 5; ++$$4) {
                    float $$5 = $$3 + (float)$$4 * (float)Math.PI * 0.4f;
                    this.a(dbb.this.dP() + (double)bgj.b((double)$$5) * 1.5, dbb.this.dV() + (double)bgj.a((double)$$5) * 1.5, $$1, $$2, $$5, 0);
                }
                for (int $$6 = 0; $$6 < 8; ++$$6) {
                    float $$7 = $$3 + (float)$$6 * (float)Math.PI * 2.0f / 8.0f + 1.2566371f;
                    this.a(dbb.this.dP() + (double)bgj.b((double)$$7) * 2.5, dbb.this.dV() + (double)bgj.a((double)$$7) * 2.5, $$1, $$2, $$7, 3);
                }
            } else {
                for (int $$8 = 0; $$8 < 16; ++$$8) {
                    double $$9 = 1.25 * (double)($$8 + 1);
                    int $$10 = 1 * $$8;
                    this.a(dbb.this.dP() + (double)bgj.b((double)$$3) * $$9, dbb.this.dV() + (double)bgj.a((double)$$3) * $$9, $$1, $$2, $$3, $$10);
                }
            }
        }

        private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
            is $$6 = is.a($$0, $$3, $$1);
            boolean $$7 = false;
            double $$8 = 0.0;
            do {
                eoh $$11;
                fug $$12;
                is $$9 = $$6.e();
                eoh $$10 = dbb.this.ao().a_($$9);
                if (!$$10.c((dvt)dbb.this.ao(), $$9, iz.b)) continue;
                if (!dbb.this.ao().A($$6) && !($$12 = ($$11 = dbb.this.ao().a_($$6)).g(dbb.this.ao(), $$6)).c()) {
                    $$8 = $$12.c(iz.a.b);
                }
                $$7 = true;
                break;
            } while (($$6 = $$6.e()).v() >= bgj.c($$2) - 1);
            if ($$7) {
                dbb.this.ao().b(new ddw(dbb.this.ao(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, dbb.this));
                dbb.this.ao().a(etk.t, new ftm($$0, (double)$$6.v() + $$8, $$1), etk.a.a(dbb.this));
            }
        }

        @Override
        protected bcz l() {
            return bda.kl;
        }

        @Override
        protected dbe.a m() {
            return dbe.a.c;
        }
    }

    public class d
    extends dbe.c {
        private final csk e;

        public d() {
            super(dbb.this);
            this.e = csk.b().a(16.0).a((chl $$0, axf $$1) -> ((cxj)$$0).gP() == dkr.l);
        }

        @Override
        public boolean b() {
            if (dbb.this.ag_() != null) {
                return false;
            }
            if (dbb.this.ha()) {
                return false;
            }
            if (dbb.this.at < this.c) {
                return false;
            }
            axf $$0 = dbb$d.a(dbb.this.ao());
            if (!$$0.U().a(eua.F).booleanValue()) {
                return false;
            }
            List<cxj> $$1 = $$0.a(cxj.class, this.e, dbb.this, dbb.this.dj().c(16.0, 4.0, 16.0));
            if ($$1.isEmpty()) {
                return false;
            }
            dbb.this.a($$1.get(dbb.this.as.a($$1.size())));
            return true;
        }

        @Override
        public boolean c() {
            return dbb.this.hl() != null && this.b > 0;
        }

        @Override
        public void e() {
            super.e();
            dbb.this.a((cxj)null);
        }

        @Override
        protected void k() {
            cxj $$0 = dbb.this.hl();
            if ($$0 != null && $$0.cb()) {
                $$0.a(dkr.o);
            }
        }

        @Override
        protected int n() {
            return 40;
        }

        @Override
        protected int h() {
            return 60;
        }

        @Override
        protected int i() {
            return 140;
        }

        @Override
        protected bcz l() {
            return bda.kn;
        }

        @Override
        protected dbe.a m() {
            return dbe.a.d;
        }
    }
}

