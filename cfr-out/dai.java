/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class dai
extends czz
implements cik {
    public static final float a = 45.836624f;
    public static final int b = bgj.d(3.9269907f);
    protected static final alw<Byte> c = ama.a(dai.class, aly.a);
    private static final int d = 1;
    private @Nullable cgr<chn> e;
    private @Nullable is f;
    private boolean cv;
    private int cw;

    public dai(cgu<? extends dai> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.cp = new c(this);
        this.cn = 3;
    }

    @Override
    public boolean bp() {
        return this.at % b == 0;
    }

    @Override
    protected boolean ba() {
        return !this.eh();
    }

    @Override
    public void g() {
        this.ar = true;
        super.g();
        this.ar = false;
        this.g(true);
        if (this.cv && --this.cw <= 0) {
            this.cw = 20;
            this.a(this.en().j(), 1.0f);
        }
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new coh(this));
        this.cs.a(4, new a());
        this.cs.a(8, new d());
        this.cs.a(9, new cox(this, ddm.class, 3.0f, 1.0f));
        this.cs.a(10, new cox(this, chn.class, 8.0f));
        this.ct.a(1, new cqi(this, dfi.class).a(new Class[0]));
        this.ct.a(2, new b(this));
        this.ct.a(3, new cqj<ddm>((chn)this, ddm.class, true));
    }

    public static cir.a k() {
        return czz.gW().a(cis.u, 14.0).a(cis.d, 4.0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, (byte)0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = $$0.a("bound_pos", is.a).orElse(null);
        $$0.e("life_ticks").ifPresentOrElse(this::a, () -> {
            this.cv = false;
        });
        this.e = cgr.a($$0, "owner");
    }

    @Override
    public void y(cgk $$0) {
        super.y($$0);
        if ($$0 instanceof dai) {
            dai $$1 = (dai)$$0;
            this.e = $$1.e;
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.b("bound_pos", is.a, this.f);
        if (this.cv) {
            $$0.a("life_ticks", this.cw);
        }
        cgr.a(this.e, $$0, "owner");
    }

    public @Nullable chn gP() {
        return cgr.a(this.e, this.ao(), chn.class);
    }

    public @Nullable is gQ() {
        return this.f;
    }

    public void h(@Nullable is $$0) {
        this.f = $$0;
    }

    private boolean b(int $$0) {
        byte $$1 = this.az.a(c);
        return ($$1 & $$0) != 0;
    }

    private void a(int $$0, boolean $$1) {
        int $$2 = this.az.a(c).byteValue();
        $$2 = $$1 ? ($$2 |= $$0) : ($$2 &= ~$$0);
        this.az.a(c, (byte)($$2 & 0xFF));
    }

    public boolean gR() {
        return this.b(1);
    }

    public void x(boolean $$0) {
        this.a(1, $$0);
    }

    public void a(chn $$0) {
        this.e = cgr.a($$0);
    }

    public void a(int $$0) {
        this.cv = true;
        this.cw = $$0;
    }

    @Override
    protected bcz W() {
        return bda.Eg;
    }

    @Override
    protected bcz fd() {
        return bda.Ei;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Ej;
    }

    @Override
    public float bO() {
        return 1.0f;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        this.a($$4, $$1);
        this.a($$0, $$4, $$1);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        this.a(cgv.a, new dlt(dlx.qH));
        this.a(cgv.a, 0.0f);
    }

    @Override
    public /* synthetic */ @Nullable cgk p() {
        return this.gP();
    }

    class c
    extends cnq {
        public c(dai $$0) {
            super($$0);
        }

        @Override
        public void a() {
            if (this.k != cnq.a.b) {
                return;
            }
            ftm $$0 = new ftm(this.e - dai.this.dP(), this.f - dai.this.dR(), this.g - dai.this.dV());
            double $$1 = $$0.g();
            if ($$1 < dai.this.dj().a()) {
                this.k = cnq.a.a;
                dai.this.k(dai.this.dN().c(0.5));
            } else {
                dai.this.k(dai.this.dN().e($$0.c(this.h * 0.05 / $$1)));
                if (dai.this.ag_() == null) {
                    ftm $$2 = dai.this.dN();
                    dai.this.v(-((float)bgj.d($$2.g, $$2.i)) * 57.295776f);
                    dai.this.bC = dai.this.ec();
                } else {
                    double $$3 = dai.this.ag_().dP() - dai.this.dP();
                    double $$4 = dai.this.ag_().dV() - dai.this.dV();
                    dai.this.v(-((float)bgj.d($$3, $$4)) * 57.295776f);
                    dai.this.bC = dai.this.ec();
                }
            }
        }
    }

    class a
    extends cop {
        public a() {
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            chl $$0 = dai.this.ag_();
            if ($$0 != null && $$0.cb() && !dai.this.K().b() && dai.this.as.a(dai$a.b(7)) == 0) {
                return dai.this.g((cgk)$$0) > 4.0;
            }
            return false;
        }

        @Override
        public boolean c() {
            return dai.this.K().b() && dai.this.gR() && dai.this.ag_() != null && dai.this.ag_().cb();
        }

        @Override
        public void d() {
            chl $$0 = dai.this.ag_();
            if ($$0 != null) {
                ftm $$1 = $$0.bV();
                dai.this.cp.a($$1.g, $$1.h, $$1.i, 1.0);
            }
            dai.this.x(true);
            dai.this.a(bda.Eh, 1.0f, 1.0f);
        }

        @Override
        public void e() {
            dai.this.x(false);
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            chl $$0 = dai.this.ag_();
            if ($$0 == null) {
                return;
            }
            if (dai.this.dj().c($$0.dj())) {
                dai.this.c(dai$a.a(dai.this.ao()), (cgk)$$0);
                dai.this.x(false);
            } else {
                double $$1 = dai.this.g((cgk)$$0);
                if ($$1 < 9.0) {
                    ftm $$2 = $$0.bV();
                    dai.this.cp.a($$2.g, $$2.h, $$2.i, 1.0);
                }
            }
        }
    }

    class d
    extends cop {
        public d() {
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            return !dai.this.K().b() && dai.this.as.a(dai$d.b(7)) == 0;
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public void a() {
            is $$0 = dai.this.gQ();
            if ($$0 == null) {
                $$0 = dai.this.dK();
            }
            for (int $$1 = 0; $$1 < 3; ++$$1) {
                is $$2 = $$0.b(dai.this.as.a(15) - 7, dai.this.as.a(11) - 5, dai.this.as.a(15) - 7);
                if (!dai.this.ao().A($$2)) continue;
                dai.this.cp.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
                if (dai.this.ag_() != null) break;
                dai.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0f, 20.0f);
                break;
            }
        }
    }

    class b
    extends cqq {
        private final csk b;

        public b(cht $$0) {
            super($$0, false);
            this.b = csk.b().d().e();
        }

        @Override
        public boolean b() {
            chn $$0 = dai.this.gP();
            return $$0 != null && $$0.ag_() != null && this.a($$0.ag_(), this.b);
        }

        @Override
        public void d() {
            chn $$0 = dai.this.gP();
            dai.this.g($$0 != null ? $$0.ag_() : null);
            super.d();
        }
    }
}

