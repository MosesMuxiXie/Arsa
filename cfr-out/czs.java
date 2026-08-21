/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class czs
extends czz
implements chq {
    private static final amo d = amo.b("attacking");
    private static final ciq e = new ciq(d, 0.15f, ciq.a.a);
    private static final int f = 400;
    private static final int cv = 600;
    private static final alw<Optional<eoh>> cw = ama.a(czs.class, aly.j);
    private static final alw<Boolean> cx = ama.a(czs.class, aly.k);
    private static final alw<Boolean> cy = ama.a(czs.class, aly.k);
    private int cz = Integer.MIN_VALUE;
    private int cA;
    private static final ccn cB = bhn.a(20, 39);
    private long cC;
    private @Nullable cgr<chl> cD;

    public czs(cgu<? extends czs> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.a(fls.j, -1.0f);
    }

    @Override
    protected void D() {
        this.cs.a(0, new coh(this));
        this.cs.a(1, new a(this));
        this.cs.a(2, new coz(this, 1.0, false));
        this.cs.a(7, new cqd((cht)this, 1.0, 0.0f));
        this.cs.a(8, new cox(this, ddm.class, 8.0f));
        this.cs.a(8, new cpk(this));
        this.cs.a(10, new b(this));
        this.cs.a(11, new d(this));
        this.ct.a(1, new c(this, this::a));
        this.ct.a(2, new cqi(this, new Class[0]));
        this.ct.a(3, new cqj<czt>((chn)this, czt.class, true, false));
        this.ct.a(4, new cqp<czs>(this, false));
    }

    @Override
    public float a(is $$0, dwr $$1) {
        return 0.0f;
    }

    public static cir.a k() {
        return czz.gW().a(cis.u, 40.0).a(cis.x, 0.3f).a(cis.d, 7.0).a(cis.o, 64.0).a(cis.D, 1.0);
    }

    @Override
    public void g(@Nullable chl $$0) {
        super.g($$0);
        cio $$1 = this.h(cis.x);
        if ($$0 == null) {
            this.cA = 0;
            this.az.a(cx, false);
            this.az.a(cy, false);
            $$1.c(d);
        } else {
            this.cA = this.at;
            this.az.a(cx, true);
            if (!$$1.b(d)) {
                $$1.b(e);
            }
        }
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cw, Optional.empty());
        $$0.a(cx, false);
        $$0.a(cy, false);
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

    public void p() {
        if (this.at >= this.cz + 400) {
            this.cz = this.at;
            if (!this.bq()) {
                this.ao().a(this.dP(), this.dT(), this.dV(), bda.jV, this.dB(), 2.5f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(alw<?> $$0) {
        if (cx.equals($$0) && this.gS() && this.ao().B_()) {
            this.p();
        }
        super.a($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        eoh $$1 = this.gQ();
        if ($$1 != null) {
            $$0.a("carriedBlockState", eoh.a, $$1);
        }
        this.b_($$0);
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        this.c((eoh)$$02.a("carriedBlockState", eoh.a).filter($$0 -> !$$0.l()).orElse(null));
        this.a(this.ao(), $$02);
    }

    boolean g(ddm $$0) {
        if (!chl.bo.test($$0)) {
            return false;
        }
        return this.a($$0, 0.025, true, false, this.dT());
    }

    @Override
    public void d_() {
        if (this.ao().B_()) {
            for (int $$0 = 0; $$0 < 2; ++$$0) {
                this.ao().a(ly.ag, this.e(0.5), this.dS() - 0.25, this.h(0.5), (this.as.j() - 0.5) * 2.0, -this.as.j(), (this.as.j() - 0.5) * 2.0);
            }
        }
        this.bM = false;
        if (!this.ao().B_()) {
            this.a((axf)this.ao(), true);
        }
        super.d_();
    }

    @Override
    public boolean fR() {
        return true;
    }

    @Override
    protected void a(axf $$0) {
        float $$1;
        if ($$0.ag() && this.at >= this.cA + 600 && ($$1 = this.bO()) > 0.5f && $$0.k(this.dK()) && this.as.i() * 30.0f < ($$1 - 0.4f) * 2.0f) {
            this.g((chl)null);
            this.gP();
        }
        super.a($$0);
    }

    protected boolean gP() {
        if (this.ao().B_() || !this.cb()) {
            return false;
        }
        double $$0 = this.dP() + (this.as.j() - 0.5) * 64.0;
        double $$1 = this.dR() + (double)(this.as.a(64) - 32);
        double $$2 = this.dV() + (this.as.j() - 0.5) * 64.0;
        return this.p($$0, $$1, $$2);
    }

    boolean H(cgk $$0) {
        ftm $$1 = new ftm(this.dP() - $$0.dP(), this.f(0.5) - $$0.dT(), this.dV() - $$0.dV());
        $$1 = $$1.d();
        double $$2 = 16.0;
        double $$3 = this.dP() + (this.as.j() - 0.5) * 8.0 - $$1.g * 16.0;
        double $$4 = this.dR() + (double)(this.as.a(16) - 8) - $$1.h * 16.0;
        double $$5 = this.dV() + (this.as.j() - 0.5) * 8.0 - $$1.i * 16.0;
        return this.p($$3, $$4, $$5);
    }

    private boolean p(double $$0, double $$1, double $$2) {
        is.a $$3 = new is.a($$0, $$1, $$2);
        while ($$3.v() > this.ao().K_() && !this.ao().a_($$3).d()) {
            $$3.c(iz.a);
        }
        eoh $$4 = this.ao().a_($$3);
        boolean $$5 = $$4.d();
        boolean $$6 = $$4.y().a(bdv.a);
        if (!$$5 || $$6) {
            return false;
        }
        ftm $$7 = this.dI();
        boolean $$8 = this.b($$0, $$1, $$2, true);
        if ($$8) {
            this.ao().a(etk.R, $$7, etk.a.a(this));
            if (!this.bq()) {
                this.ao().a(null, this.Y, this.Z, this.aa, bda.jW, this.dB(), 1.0f, 1.0f);
                this.a(bda.jW, 1.0f, 1.0f);
            }
        }
        return $$8;
    }

    @Override
    protected bcz W() {
        return this.gR() ? bda.jU : bda.jR;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.jT;
    }

    @Override
    protected bcz fd() {
        return bda.jS;
    }

    @Override
    protected void a(axf $$0, cex $$1, boolean $$2) {
        super.a($$0, $$1, $$2);
        eoh $$3 = this.gQ();
        if ($$3 != null) {
            dlt $$4 = new dlt(dlx.qP);
            dsq.a($$4, $$0.J_(), duf.g, $$0.c(this.dK()), this.ep());
            fod.a $$5 = new fod.a((axf)this.ao()).a(fqx.h, this.dI()).a(fqx.k, $$4).b(fqx.a, this);
            List<dlt> $$6 = $$3.a($$5);
            for (dlt $$7 : $$6) {
                this.a($$0, $$7);
            }
        }
    }

    public void c(@Nullable eoh $$0) {
        this.az.a(cw, Optional.ofNullable($$0));
    }

    public @Nullable eoh gQ() {
        return this.az.a(cw).orElse(null);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        dey $$3;
        dey $$4;
        if (this.a($$0, $$1)) {
            return false;
        }
        cgk cgk2 = $$1.c();
        dey dey2 = $$4 = cgk2 instanceof dey ? ($$3 = (dey)cgk2) : null;
        if ($$1.a(bdq.j) || $$4 != null) {
            boolean $$5 = $$4 != null && this.a($$0, $$1, $$4, $$2);
            for (int $$6 = 0; $$6 < 64; ++$$6) {
                if (!this.gP()) continue;
                return true;
            }
            return $$5;
        }
        boolean $$7 = super.a($$0, $$1, $$2);
        if (!($$1.d() instanceof chl) && this.as.a(10) != 0) {
            this.gP();
        }
        return $$7;
    }

    private boolean a(axf $$0, cex $$1, dey $$2, float $$3) {
        dlt $$4 = $$2.e();
        dnr $$5 = $$4.a(ki.Y, dnr.a);
        if ($$5.a(dns.a)) {
            return super.a($$0, $$1, $$3);
        }
        return false;
    }

    public boolean gR() {
        return this.az.a(cx);
    }

    public boolean gS() {
        return this.az.a(cy);
    }

    public void gT() {
        this.az.a(cy, true);
    }

    @Override
    public boolean ab() {
        return super.ab() || this.gQ() != null;
    }

    static class a
    extends cop {
        private final czs a;
        private @Nullable chl b;

        public a(czs $$0) {
            this.a = $$0;
            this.a(EnumSet.of(cop.a.c, cop.a.a));
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public boolean b() {
            void $$1;
            this.b = this.a.ag_();
            chl chl2 = this.b;
            if (!(chl2 instanceof ddm)) {
                return false;
            }
            ddm $$0 = (ddm)chl2;
            double $$2 = this.b.g(this.a);
            if ($$2 > 256.0) {
                return false;
            }
            return this.a.g((ddm)$$1);
        }

        @Override
        public void d() {
            this.a.N().n();
        }

        @Override
        public void a() {
            this.a.J().a(this.b.dP(), this.b.dT(), this.b.dV());
        }
    }

    static class b
    extends cop {
        private final czs a;

        public b(czs $$0) {
            this.a = $$0;
        }

        @Override
        public boolean b() {
            if (this.a.gQ() == null) {
                return false;
            }
            if (!b.a(this.a).U().a(eua.F).booleanValue()) {
                return false;
            }
            return this.a.ep().a(b.b(2000)) == 0;
        }

        @Override
        public void a() {
            bgr $$0 = this.a.ep();
            dwo $$1 = this.a.ao();
            int $$2 = bgj.c(this.a.dP() - 1.0 + $$0.j() * 2.0);
            int $$3 = bgj.c(this.a.dR() + $$0.j() * 2.0);
            int $$4 = bgj.c(this.a.dV() - 1.0 + $$0.j() * 2.0);
            is $$5 = new is($$2, $$3, $$4);
            eoh $$6 = $$1.a_($$5);
            is $$7 = $$5.e();
            eoh $$8 = $$1.a_($$7);
            eoh $$9 = this.a.gQ();
            if ($$9 == null) {
                return;
            }
            if (this.a($$1, $$5, $$9 = dzq.b($$9, (dwp)this.a.ao(), $$5), $$6, $$8, $$7)) {
                $$1.a($$5, $$9, 3);
                $$1.a(etk.i, $$5, etk.a.a(this.a, $$9));
                this.a.c((eoh)null);
            }
        }

        private boolean a(dwo $$0, is $$1, eoh $$2, eoh $$3, eoh $$4, is $$5) {
            return $$3.l() && !$$4.l() && !$$4.a(dzs.I) && $$4.m($$0, $$5) && $$2.a((dwr)$$0, $$1) && $$0.a_(this.a, fth.a(ftm.a($$1))).isEmpty();
        }
    }

    static class d
    extends cop {
        private final czs a;

        public d(czs $$0) {
            this.a = $$0;
        }

        @Override
        public boolean b() {
            if (this.a.gQ() != null) {
                return false;
            }
            if (!czs$d.a(this.a).U().a(eua.F).booleanValue()) {
                return false;
            }
            return this.a.ep().a(czs$d.b(20)) == 0;
        }

        @Override
        public void a() {
            bgr $$0 = this.a.ep();
            dwo $$1 = this.a.ao();
            int $$2 = bgj.c(this.a.dP() - 2.0 + $$0.j() * 4.0);
            int $$3 = bgj.c(this.a.dR() + $$0.j() * 3.0);
            int $$4 = bgj.c(this.a.dV() - 2.0 + $$0.j() * 4.0);
            is $$5 = new is($$2, $$3, $$4);
            eoh $$6 = $$1.a_($$5);
            ftm $$7 = new ftm((double)this.a.dO() + 0.5, (double)$$3 + 0.5, (double)this.a.dU() + 0.5);
            ftm $$8 = new ftm((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
            fti $$9 = $$1.a(new dvw($$7, $$8, dvw.a.b, dvw.b.a, this.a));
            boolean $$10 = $$9.b().equals($$5);
            if ($$6.a(bdp.aB) && $$10) {
                $$1.a($$5, false);
                $$1.a(etk.f, $$5, etk.a.a(this.a, $$6));
                this.a.c($$6.b().m());
            }
        }
    }

    static class c
    extends cqj<ddm> {
        private final czs i;
        private @Nullable ddm j;
        private int k;
        private int l;
        private final csk m;
        private final csk n = csk.a().d();
        private final csk.a o;

        public c(czs $$0, @Nullable csk.a $$12) {
            super($$0, ddm.class, 10, false, false, $$12);
            this.i = $$0;
            this.o = ($$1, $$2) -> ($$0.g((ddm)$$1) || $$0.a($$1, $$2)) && !$$0.B($$1);
            this.m = csk.a().a(this.l()).a(this.o);
        }

        @Override
        public boolean b() {
            this.j = c.a(this.i).a(this.m.a(this.l()), this.i);
            return this.j != null;
        }

        @Override
        public void d() {
            this.k = this.a(5);
            this.l = 0;
            this.i.gT();
        }

        @Override
        public void e() {
            this.j = null;
            super.e();
        }

        @Override
        public boolean c() {
            if (this.j != null) {
                if (!this.o.test(this.j, c.a(this.i))) {
                    return false;
                }
                this.i.a((cgk)this.j, 10.0f, 10.0f);
                return true;
            }
            if (this.c != null) {
                if (this.i.B(this.c)) {
                    return false;
                }
                if (this.n.a(c.a(this.i), this.i, this.c)) {
                    return true;
                }
            }
            return super.c();
        }

        @Override
        public void a() {
            if (this.i.ag_() == null) {
                super.a((chl)null);
            }
            if (this.j != null) {
                if (--this.k <= 0) {
                    this.c = this.j;
                    this.j = null;
                    super.d();
                }
            } else {
                if (this.c != null && !this.i.cq()) {
                    if (this.i.g((ddm)this.c)) {
                        if (this.c.g(this.i) < 16.0) {
                            this.i.gP();
                        }
                        this.l = 0;
                    } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.H(this.c)) {
                        this.l = 0;
                    }
                }
                super.a();
            }
        }
    }
}

