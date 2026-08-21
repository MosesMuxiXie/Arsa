/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dat
extends czz {
    private static final alw<Boolean> cy = ama.a(dat.class, aly.k);
    private static final alw<Boolean> cz = ama.a(dat.class, aly.k);
    private static final alw<Boolean> cA = ama.a(dat.class, aly.k);
    private static final alw<Optional<is>> cB = ama.a(dat.class, aly.p);
    private static final int cC = 15;
    private static final int cD = 1;
    private static final float cE = 3.0f;
    private static final float cF = 32.0f;
    private static final float cG = 144.0f;
    public static final int a = 40;
    private static final float cH = 0.4f;
    public static final float b = 0.3f;
    public static final int c = 16545810;
    public static final int d = 0x5F5F5F;
    public static final int e = 8;
    public static final int f = 45;
    private static final int cI = 4;
    private int cJ;
    public final cfz cv = new cfz();
    public final cfz cw = new cfz();
    public final cfz cx = new cfz();
    private int cK;
    private boolean cL;
    private int cM;
    private int cN;

    public dat(cgu<? extends dat> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.co = new c(this);
        this.cp = new d(this);
        this.cq = new b(this);
        crd $$2 = (crd)this.N();
        $$2.a(true);
        this.cn = 0;
    }

    public void h(is $$0) {
        this.i($$0);
        this.a(fls.q, 8.0f);
        this.a(fls.f, 8.0f);
        this.a(fls.i, 8.0f);
        this.a(fls.o, 0.0f);
        this.a(fls.n, 0.0f);
    }

    public boolean k() {
        return this.gS() != null;
    }

    @Override
    protected cnl I() {
        return new a(this);
    }

    protected cim.b<dat> ew() {
        return dau.a();
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return dau.b(this, this.ew().a($$0));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cy, true);
        $$0.a(cz, false);
        $$0.a(cA, false);
        $$0.a(cB, Optional.empty());
    }

    public static cir.a p() {
        return czz.gW().a(cis.u, 1.0).a(cis.x, 0.4f).a(cis.d, 3.0).a(cis.o, 32.0).a(cis.D, 1.0625);
    }

    public boolean gP() {
        return this.az.a(cy);
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        if (!($$1 instanceof chl)) {
            return false;
        }
        this.cJ = 15;
        this.ao().a((cgk)this, (byte)4);
        return super.c($$0, $$1);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        els $$6;
        is $$3 = this.gS();
        if ($$3 == null || $$1.a(bdq.d)) {
            return super.a($$0, $$1, $$2);
        }
        if (this.a($$0, $$1) || this.cK > 0 || this.fa()) {
            return false;
        }
        ddm $$4 = this.i($$1);
        cgk $$5 = $$1.c();
        if (!($$5 instanceof chl) && !($$5 instanceof dec) && $$4 == null) {
            return false;
        }
        this.cK = 8;
        this.ao().a((cgk)this, (byte)66);
        this.c(etk.u);
        elb elb2 = this.ao().c_($$3);
        if (elb2 instanceof els && ($$6 = (els)elb2).b(this)) {
            if ($$4 != null) {
                $$6.c();
            }
            this.g($$1);
        }
        return true;
    }

    public ddm i(cex $$0) {
        this.e($$0);
        return this.f($$0);
    }

    @Override
    public boolean bY() {
        return super.bY() && this.gP();
    }

    @Override
    public void i(double $$0, double $$1, double $$2) {
        if (!this.gP()) {
            return;
        }
        super.i($$0, $$1, $$2);
    }

    public cim<dat> ev() {
        return super.ev();
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("creakingBrain");
        this.ev().a((axf)this.ao(), this);
        $$1.c();
        dau.a(this);
    }

    @Override
    public void d_() {
        if (this.cK > 0) {
            --this.cK;
        }
        if (this.cJ > 0) {
            --this.cJ;
        }
        if (!this.ao().B_()) {
            boolean $$0 = this.az.a(cy);
            boolean $$1 = this.gZ();
            if ($$1 != $$0) {
                this.c(etk.u);
                if ($$1) {
                    this.b(bda.hu);
                } else {
                    this.X();
                    this.b(bda.ht);
                }
            }
            this.az.a(cy, $$1);
        }
        super.d_();
    }

    @Override
    public void g() {
        is $$0;
        if (!this.ao().B_() && ($$0 = this.gS()) != null) {
            els $$1;
            boolean $$2;
            elb elb2 = this.ao().c_($$0);
            boolean bl2 = $$2 = elb2 instanceof els && ($$1 = (els)elb2).b(this);
            if (!$$2) {
                this.x(0.0f);
            }
        }
        super.g();
        if (this.ao().B_()) {
            this.hc();
            this.gY();
        }
    }

    @Override
    protected void eH() {
        if (this.k() && this.gU()) {
            ++this.bw;
            if (!this.ao().B_() && this.bw > 45 && !this.eh()) {
                this.gQ();
            }
        } else {
            super.eH();
        }
    }

    @Override
    protected void B(float $$0) {
        float $$1 = Math.min($$0 * 25.0f, 3.0f);
        this.bB.a($$1, 0.4f, 1.0f);
    }

    private void hc() {
        this.cv.a(this.cJ > 0, this.at);
        this.cw.a(this.cK > 0, this.at);
        this.cx.a(this.gU(), this.at);
    }

    public void gQ() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            fth $$1 = this.dj();
            ftm $$2 = $$1.f();
            double $$3 = $$1.b() * 0.3;
            double $$4 = $$1.c() * 0.3;
            double $$5 = $$1.d() * 0.3;
            $$0.a(new lp(ly.bj, dzs.u.m()), $$2.g, $$2.h, $$2.i, 100, $$3, $$4, $$5, 0.0);
            $$0.a(new lp(ly.bj, (eoh)dzs.cQ.m().b(ebo.c, epb.c)), $$2.g, $$2.h, $$2.i, 10, $$3, $$4, $$5, 0.0);
        }
        this.b(this.fd());
        this.a(cgk.e.b);
    }

    public void j(cex $$0) {
        this.i($$0);
        this.a($$0);
        this.b(bda.hx);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 66) {
            this.cK = 8;
            this.g(this.en().p());
        } else if ($$0 == 4) {
            this.cJ = 15;
            this.fN();
        } else {
            super.b($$0);
        }
    }

    @Override
    public boolean bx() {
        return this.k() || super.bx();
    }

    @Override
    public boolean o(boolean $$0) {
        return !this.k() && super.o($$0);
    }

    @Override
    protected cre b(dwo $$0) {
        return new e(this, $$0);
    }

    public boolean gR() {
        List $$0 = this.ca.c(cqw.j).orElse(List.of());
        if ($$0.isEmpty()) {
            this.cN = 0;
            return false;
        }
        fth $$1 = this.dj();
        for (ddm $$2 : $$0) {
            if (!$$1.d($$2.bV())) continue;
            ++this.cN;
            return this.cN > 4;
        }
        this.cN = 0;
        return false;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        $$0.a("home_pos", is.a).ifPresent(this::h);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.b("home_pos", is.a, this.gS());
    }

    public void i(is $$0) {
        this.az.a(cB, Optional.of($$0));
    }

    public @Nullable is gS() {
        return this.az.a(cB).orElse(null);
    }

    public void gT() {
        this.az.a(cA, true);
    }

    public boolean gU() {
        return this.az.a(cA);
    }

    public boolean gX() {
        return this.cL;
    }

    public void gY() {
        if (this.bw > this.cM) {
            this.cM = this.bw + this.ep().a(this.cL ? 2 : this.bw / 4, this.cL ? 8 : this.bw / 2);
            this.cL = !this.cL;
        }
    }

    @Override
    public void fN() {
        this.b(bda.hq);
    }

    @Override
    protected bcz W() {
        if (this.hb()) {
            return null;
        }
        return bda.hn;
    }

    @Override
    protected bcz h(cex $$0) {
        return this.k() ? bda.hw : super.h($$0);
    }

    @Override
    protected bcz fd() {
        return bda.hr;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.hs, 0.15f, 1.0f);
    }

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }

    @Override
    public void o(double $$0, double $$1, double $$2) {
        if (!this.gP()) {
            return;
        }
        super.o($$0, $$1, $$2);
    }

    public boolean gZ() {
        List $$0 = this.ca.c(cqw.j).orElse(List.of());
        boolean $$1 = this.hb();
        if ($$0.isEmpty()) {
            if ($$1) {
                this.ha();
            }
            return true;
        }
        boolean $$2 = false;
        for (ddm $$3 : $$0) {
            if (!this.c((chl)$$3) || this.t($$3)) continue;
            $$2 = true;
            if ($$1 && !chl.bo.test($$3) || !this.a($$3, 0.5, false, true, this.dT(), this.dR() + 0.5 * (double)this.eF(), (this.dT() + this.dR()) / 2.0)) continue;
            if ($$1) {
                return false;
            }
            if (!($$3.g(this) < 144.0)) continue;
            this.g($$3);
            return false;
        }
        if (!$$2 && $$1) {
            this.ha();
        }
        return true;
    }

    public void g(ddm $$0) {
        this.ev().a(cqw.p, $$0);
        this.c(etk.u);
        this.b(bda.ho);
        this.x(true);
    }

    public void ha() {
        this.ev().b(cqw.p);
        this.c(etk.u);
        this.b(bda.hp);
        this.x(false);
    }

    public void x(boolean $$0) {
        this.az.a(cz, $$0);
    }

    public boolean hb() {
        return this.az.a(cz);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        return 0.0f;
    }

    class c
    extends cnp {
        public c(dat $$0) {
            super($$0);
        }

        @Override
        public void a() {
            if (dat.this.gP()) {
                super.a();
            }
        }
    }

    class d
    extends cnq {
        public d(dat $$0) {
            super($$0);
        }

        @Override
        public void a() {
            if (dat.this.gP()) {
                super.a();
            }
        }
    }

    class b
    extends cno {
        public b(dat $$0) {
            super($$0);
        }

        @Override
        public void b() {
            if (dat.this.gP()) {
                super.b();
            } else {
                dat.this.t(false);
            }
        }
    }

    class a
    extends cnl {
        public a(dat $$0) {
            super($$0);
        }

        @Override
        public void a() {
            if (dat.this.gP()) {
                super.a();
            }
        }
    }

    class e
    extends crd {
        e(dat $$0, dwo $$1) {
            super($$0, $$1);
        }

        @Override
        public void d() {
            if (dat.this.gP()) {
                super.d();
            }
        }

        @Override
        protected flr a(int $$0) {
            this.o = new f();
            this.o.a(true);
            return new flr(this.o, $$0);
        }
    }

    class f
    extends flx {
        private static final int m = 1024;

        f() {
        }

        @Override
        public fls a(flu $$0, int $$1, int $$2, int $$3) {
            is $$4 = dat.this.gS();
            if ($$4 == null) {
                return super.a($$0, $$1, $$2, $$3);
            }
            double $$5 = $$4.j(new jy($$1, $$2, $$3));
            if ($$5 > 1024.0 && $$5 >= $$4.j($$0.b())) {
                return fls.a;
            }
            return super.a($$0, $$1, $$2, $$3);
        }
    }
}

