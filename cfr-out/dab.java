/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dab
extends chn
implements czu {
    public static final float a = 7.448451f;
    public static final int b = bgj.d(24.166098f);
    private static final alw<Integer> c = ama.a(dab.class, aly.b);
    ftm d = ftm.c;
    @Nullable is e;
    a f = dab$a.a;

    public dab(cgu<? extends dab> $$0, dwo $$1) {
        super((cgu<? extends chn>)$$0, $$1);
        this.cn = 5;
        this.cp = new g(this);
        this.co = new f(this);
    }

    @Override
    public boolean bp() {
        return (this.p() + this.at) % b == 0;
    }

    @Override
    protected cnl I() {
        return new d(this);
    }

    @Override
    protected void D() {
        this.cs.a(1, new c());
        this.cs.a(2, new i());
        this.cs.a(3, new e());
        this.ct.a(1, new b());
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, 0);
    }

    public void a(int $$0) {
        this.az.a(c, bgj.a($$0, 0, 64));
    }

    private void gL() {
        this.j_();
        this.h(cis.d).a(6 + this.k());
    }

    public int k() {
        return this.az.a(c);
    }

    @Override
    public void a(alw<?> $$0) {
        if (c.equals($$0)) {
            this.gL();
        }
        super.a($$0);
    }

    public int p() {
        return this.aA() * 3;
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            float $$0 = bgj.b((double)((float)(this.p() + this.at) * 7.448451f * ((float)Math.PI / 180) + (float)Math.PI));
            float $$1 = bgj.b((double)((float)(this.p() + this.at + 1) * 7.448451f * ((float)Math.PI / 180) + (float)Math.PI));
            if ($$0 > 0.0f && $$1 <= 0.0f) {
                this.ao().a(this.dP(), this.dR(), this.dV(), bda.wj, this.dB(), 0.95f + this.as.i() * 0.05f, 0.95f + this.as.i() * 0.05f, false);
            }
            float $$2 = this.dF() * 1.48f;
            float $$3 = bgj.b((double)(this.ec() * ((float)Math.PI / 180))) * $$2;
            float $$4 = bgj.a((double)(this.ec() * ((float)Math.PI / 180))) * $$2;
            float $$5 = (0.3f + $$0 * 0.45f) * this.dG() * 2.5f;
            this.ao().a(ly.ad, this.dP() + (double)$$3, this.dR() + (double)$$5, this.dV() + (double)$$4, 0.0, 0.0, 0.0);
            this.ao().a(ly.ad, this.dP() - (double)$$3, this.dR() + (double)$$5, this.dV() - (double)$$4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
    }

    @Override
    public boolean fl() {
        return false;
    }

    @Override
    public void m(ftm $$0) {
        this.a($$0, 0.2f);
    }

    @Override
    public cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.e = this.dK().b(5);
        this.a(0);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.e = $$0.a("anchor_pos", is.a).orElse(null);
        this.a($$0.a("size", 0));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.b("anchor_pos", is.a, this.e);
        $$0.a("size", this.k());
    }

    @Override
    public boolean a(double $$0) {
        return true;
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected bcz W() {
        return bda.wg;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.wk;
    }

    @Override
    protected bcz fd() {
        return bda.wi;
    }

    @Override
    protected float fC() {
        return 1.0f;
    }

    @Override
    public boolean a(cgu<?> $$0) {
        return true;
    }

    @Override
    public cgn b(chx $$0) {
        int $$1 = this.k();
        cgn $$2 = super.b($$0);
        return $$2.a(1.0f + 0.15f * (float)$$1);
    }

    boolean a(axf $$0, chl $$1, csk $$2) {
        return $$2.a($$0, this, $$1);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = dab$a.a();
        }
    }

    class g
    extends cnq {
        private float m;

        public g(chn $$0) {
            super($$0);
            this.m = 0.1f;
        }

        @Override
        public void a() {
            if (dab.this.ad) {
                dab.this.v(dab.this.ec() + 180.0f);
                this.m = 0.1f;
            }
            double $$0 = dab.this.d.g - dab.this.dP();
            double $$1 = dab.this.d.h - dab.this.dR();
            double $$2 = dab.this.d.i - dab.this.dV();
            double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            if (Math.abs($$3) > (double)1.0E-5f) {
                double $$4 = 1.0 - Math.abs($$1 * (double)0.7f) / $$3;
                $$3 = Math.sqrt(($$0 *= $$4) * $$0 + ($$2 *= $$4) * $$2);
                double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
                float $$6 = dab.this.ec();
                float $$7 = (float)bgj.d($$2, $$0);
                float $$8 = bgj.f(dab.this.ec() + 90.0f);
                float $$9 = bgj.f($$7 * 57.295776f);
                dab.this.v(bgj.e($$8, $$9, 4.0f) - 90.0f);
                dab.this.bC = dab.this.ec();
                this.m = bgj.e($$6, dab.this.ec()) < 3.0f ? bgj.d(this.m, 1.8f, 0.005f * (1.8f / this.m)) : bgj.d(this.m, 0.2f, 0.025f);
                float $$10 = (float)(-(bgj.d(-$$1, $$3) * 57.2957763671875));
                dab.this.w($$10);
                float $$11 = dab.this.ec() + 90.0f;
                double $$12 = (double)(this.m * bgj.b((double)($$11 * ((float)Math.PI / 180)))) * Math.abs($$0 / $$5);
                double $$13 = (double)(this.m * bgj.a((double)($$11 * ((float)Math.PI / 180)))) * Math.abs($$2 / $$5);
                double $$14 = (double)(this.m * bgj.a((double)($$10 * ((float)Math.PI / 180)))) * Math.abs($$1 / $$5);
                ftm $$15 = dab.this.dN();
                dab.this.k($$15.e(new ftm($$12, $$14, $$13).d($$15).c(0.2)));
            }
        }
    }

    static class f
    extends cnp {
        public f(chn $$0) {
            super($$0);
        }

        @Override
        public void a() {
        }
    }

    class d
    extends cnl {
        public d(chn $$0) {
            super($$0);
        }

        @Override
        public void a() {
            dab.this.bE = dab.this.bC;
            dab.this.bC = dab.this.ec();
        }
    }

    class c
    extends cop {
        private int b;

        c() {
        }

        @Override
        public boolean b() {
            chl $$0 = dab.this.ag_();
            if ($$0 != null) {
                return dab.this.a(dab$c.a(dab.this.ao()), $$0, csk.a);
            }
            return false;
        }

        @Override
        public void d() {
            this.b = this.a(10);
            dab.this.f = dab$a.a;
            this.h();
        }

        @Override
        public void e() {
            if (dab.this.e != null) {
                dab.this.e = dab.this.ao().a(euq.a.e, dab.this.e).b(10 + dab.this.as.a(20));
            }
        }

        @Override
        public void a() {
            if (dab.this.f == dab$a.a) {
                --this.b;
                if (this.b <= 0) {
                    dab.this.f = dab$a.b;
                    this.h();
                    this.b = this.a((8 + dab.this.as.a(4)) * 20);
                    dab.this.a(bda.wl, 10.0f, 0.95f + dab.this.as.i() * 0.1f);
                }
            }
        }

        private void h() {
            if (dab.this.e == null) {
                return;
            }
            dab.this.e = dab.this.ag_().dK().b(20 + dab.this.as.a(20));
            if (dab.this.e.v() < dab.this.ao().V()) {
                dab.this.e = new is(dab.this.e.u(), dab.this.ao().V() + 1, dab.this.e.w());
            }
        }
    }

    class i
    extends h {
        private static final int c = 20;
        private boolean d;
        private int e;

        i() {
        }

        @Override
        public boolean b() {
            return dab.this.ag_() != null && dab.this.f == dab$a.b;
        }

        @Override
        public boolean c() {
            chl $$0 = dab.this.ag_();
            if ($$0 == null) {
                return false;
            }
            if (!$$0.cb()) {
                return false;
            }
            if ($$0 instanceof ddm) {
                ddm $$1 = (ddm)$$0;
                if ($$0.au() || $$1.ha()) {
                    return false;
                }
            }
            if (!this.b()) {
                return false;
            }
            if (dab.this.at > this.e) {
                this.e = dab.this.at + 20;
                List<cgk> $$2 = dab.this.ao().a(cvb.class, dab.this.dj().g(16.0), cgs.a);
                for (cvb cvb2 : $$2) {
                    cvb2.hg();
                }
                this.d = !$$2.isEmpty();
            }
            return !this.d;
        }

        @Override
        public void d() {
        }

        @Override
        public void e() {
            dab.this.g((chl)null);
            dab.this.f = dab$a.a;
        }

        @Override
        public void a() {
            chl $$0 = dab.this.ag_();
            if ($$0 == null) {
                return;
            }
            dab.this.d = new ftm($$0.dP(), $$0.f(0.5), $$0.dV());
            if (dab.this.dj().g(0.2f).c($$0.dj())) {
                dab.this.c(i.a(dab.this.ao()), (cgk)$$0);
                dab.this.f = dab$a.a;
                if (!dab.this.bq()) {
                    dab.this.ao().c(1039, dab.this.dK(), 0);
                }
            } else if (dab.this.ad || dab.this.bu > 0) {
                dab.this.f = dab$a.a;
            }
        }
    }

    class e
    extends h {
        private float c;
        private float d;
        private float e;
        private float f;

        e() {
        }

        @Override
        public boolean b() {
            return dab.this.ag_() == null || dab.this.f == dab$a.a;
        }

        @Override
        public void d() {
            this.d = 5.0f + dab.this.as.i() * 10.0f;
            this.e = -4.0f + dab.this.as.i() * 9.0f;
            this.f = dab.this.as.h() ? 1.0f : -1.0f;
            this.i();
        }

        @Override
        public void a() {
            if (dab.this.as.a(this.a(350)) == 0) {
                this.e = -4.0f + dab.this.as.i() * 9.0f;
            }
            if (dab.this.as.a(this.a(250)) == 0) {
                this.d += 1.0f;
                if (this.d > 15.0f) {
                    this.d = 5.0f;
                    this.f = -this.f;
                }
            }
            if (dab.this.as.a(this.a(450)) == 0) {
                this.c = dab.this.as.i() * 2.0f * (float)Math.PI;
                this.i();
            }
            if (this.h()) {
                this.i();
            }
            if (dab.this.d.h < dab.this.dR() && !dab.this.ao().A(dab.this.dK().c(1))) {
                this.e = Math.max(1.0f, this.e);
                this.i();
            }
            if (dab.this.d.h > dab.this.dR() && !dab.this.ao().A(dab.this.dK().b(1))) {
                this.e = Math.min(-1.0f, this.e);
                this.i();
            }
        }

        private void i() {
            if (dab.this.e == null) {
                dab.this.e = dab.this.dK();
            }
            this.c += this.f * 15.0f * ((float)Math.PI / 180);
            dab.this.d = ftm.a(dab.this.e).b(this.d * bgj.b((double)this.c), -4.0f + this.e, this.d * bgj.a((double)this.c));
        }
    }

    class b
    extends cop {
        private final csk b = csk.a().a(64.0);
        private int c = dab$b.b(20);

        b() {
        }

        @Override
        public boolean b() {
            if (this.c > 0) {
                --this.c;
                return false;
            }
            this.c = dab$b.b(60);
            axf $$0 = dab$b.a(dab.this.ao());
            List<ddm> $$1 = $$0.a(this.b, dab.this, dab.this.dj().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
                $$1.sort(Comparator.comparing(cgk::dR).reversed());
                for (ddm $$2 : $$1) {
                    if (!dab.this.a($$0, (chl)$$2, csk.a)) continue;
                    dab.this.g($$2);
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean c() {
            chl $$0 = dab.this.ag_();
            if ($$0 != null) {
                return dab.this.a(dab$b.a(dab.this.ao()), $$0, csk.a);
            }
            return false;
        }
    }

    abstract class h
    extends cop {
        public h() {
            this.a(EnumSet.of(cop.a.a));
        }

        protected boolean h() {
            return dab.this.d.c(dab.this.dP(), dab.this.dR(), dab.this.dV()) < 4.0;
        }
    }
}

