/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class dae
extends cwb
implements czu {
    private static final amo d = amo.b("covered");
    private static final ciq e = new ciq(d, 20.0, ciq.a.a);
    protected static final alw<iz> a = ama.a(dae.class, aly.q);
    protected static final alw<Byte> b = ama.a(dae.class, aly.a);
    protected static final alw<Byte> c = ama.a(dae.class, aly.a);
    private static final int f = 6;
    private static final byte cv = 16;
    private static final byte cw = 16;
    private static final int cx = 8;
    private static final int cy = 8;
    private static final int cz = 5;
    private static final float cA = 0.05f;
    private static final byte cB = 0;
    private static final iz cC = iz.a;
    static final Vector3f cD = bhs.a(() -> {
        jy $$0 = iz.d.q();
        return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
    });
    private static final float cE = 3.0f;
    private float cF;
    private float cG;
    private @Nullable is cH;
    private int cI;
    private static final float cJ = 1.0f;

    public dae(cgu<? extends dae> $$0, dwo $$1) {
        super((cgu<? extends cwb>)$$0, $$1);
        this.cn = 5;
        this.co = new d(this);
    }

    @Override
    protected void D() {
        this.cs.a(1, new cox(this, ddm.class, 8.0f, 0.02f, true));
        this.cs.a(4, new a());
        this.cs.a(7, new f());
        this.cs.a(8, new cpk(this));
        this.ct.a(1, new cqi(this, this.getClass()).a(new Class[0]));
        this.ct.a(2, new e(this));
        this.ct.a(3, new c(this));
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected bcz W() {
        return bda.zS;
    }

    @Override
    public void T() {
        if (!this.gV()) {
            super.T();
        }
    }

    @Override
    protected bcz fd() {
        return bda.zY;
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.gV()) {
            return bda.Aa;
        }
        return bda.zZ;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, cC);
        $$0.a(b, (byte)0);
        $$0.a(c, (byte)16);
    }

    public static cir.a k() {
        return chn.E().a(cis.u, 30.0);
    }

    @Override
    protected cnl I() {
        return new b(this);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("AttachFace", iz.k).orElse(cC));
        this.az.a(b, $$0.a("Peek", (byte)0));
        this.az.a(c, $$0.a("Color", (byte)16));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("AttachFace", iz.k, this.gP());
        $$0.a("Peek", this.az.a(b));
        $$0.a("Color", this.az.a(c));
    }

    @Override
    public void g() {
        super.g();
        if (!(this.ao().B_() || this.cq() || this.a(this.dK(), this.gP()))) {
            this.gS();
        }
        if (this.gT()) {
            this.gU();
        }
        if (this.ao().B_()) {
            if (this.cI > 0) {
                --this.cI;
            } else {
                this.cH = null;
            }
        }
    }

    private void gS() {
        iz $$0 = this.h(this.dK());
        if ($$0 != null) {
            this.a($$0);
        } else {
            this.p();
        }
    }

    @Override
    protected fth c(ftm $$0) {
        float $$1 = dae.N(this.cG);
        iz $$2 = this.gP().g();
        return dae.a(this.eF(), $$2, $$1, $$0);
    }

    private static float N(float $$0) {
        return 0.5f - bgj.a((double)((0.5f + $$0) * (float)Math.PI)) * 0.5f;
    }

    private boolean gT() {
        this.cF = this.cG;
        float $$0 = (float)this.gX() * 0.01f;
        if (this.cG == $$0) {
            return false;
        }
        this.cG = this.cG > $$0 ? bgj.a(this.cG - 0.05f, $$0, 1.0f) : bgj.a(this.cG + 0.05f, 0.0f, $$0);
        return true;
    }

    private void gU() {
        this.aH();
        float $$02 = dae.N(this.cG);
        float $$1 = dae.N(this.cF);
        iz $$2 = this.gP().g();
        float $$3 = ($$02 - $$1) * this.eF();
        if ($$3 <= 0.0f) {
            return;
        }
        List<cgk> $$4 = this.ao().a((cgk)this, dae.a(this.eF(), $$2, $$1, $$02, this.dI()), cgs.f.and($$0 -> !$$0.A(this)));
        for (cgk $$5 : $$4) {
            if ($$5 instanceof dae || $$5.ar) continue;
            $$5.a(chp.e, new ftm($$3 * (float)$$2.j(), $$3 * (float)$$2.k(), $$3 * (float)$$2.l()));
        }
    }

    public static fth a(float $$0, iz $$1, float $$2, ftm $$3) {
        return dae.a($$0, $$1, -1.0f, $$2, $$3);
    }

    public static fth a(float $$0, iz $$1, float $$2, float $$3, ftm $$4) {
        fth $$5 = new fth((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, $$0, (double)$$0 * 0.5);
        double $$6 = Math.max($$2, $$3);
        double $$7 = Math.min($$2, $$3);
        fth $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0).a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
        return $$8.d($$4.g, $$4.h, $$4.i);
    }

    @Override
    public boolean a(cgk $$0, boolean $$1, boolean $$2) {
        if (this.ao().B_()) {
            this.cH = null;
            this.cI = 0;
        }
        this.a(iz.a);
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void cf() {
        super.cf();
        if (this.ao().B_()) {
            this.cH = this.dK();
        }
        this.bD = 0.0f;
        this.bC = 0.0f;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.v(0.0f);
        this.bE = this.ec();
        this.bP();
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(chp $$0, ftm $$1) {
        if ($$0 == chp.d) {
            this.p();
        } else {
            super.a($$0, $$1);
        }
    }

    @Override
    public ftm dN() {
        return ftm.c;
    }

    @Override
    public void k(ftm $$0) {
    }

    @Override
    public void a_(double $$0, double $$1, double $$2) {
        is $$3 = this.dK();
        if (this.cq()) {
            super.a_($$0, $$1, $$2);
        } else {
            super.a_((double)bgj.c($$0) + 0.5, bgj.c($$1 + 0.5), (double)bgj.c($$2) + 0.5);
        }
        if (this.at == 0) {
            return;
        }
        is $$4 = this.dK();
        if (!$$4.equals($$3)) {
            this.az.a(b, (byte)0);
            this.aF = true;
            if (this.ao().B_() && !this.cq() && !$$4.equals(this.cH)) {
                this.cH = $$3;
                this.cI = 6;
                this.ao = this.dP();
                this.ap = this.dR();
                this.aq = this.dV();
            }
        }
    }

    protected @Nullable iz h(is $$0) {
        for (iz $$1 : iz.values()) {
            if (!this.a($$0, $$1)) continue;
            return $$1;
        }
        return null;
    }

    boolean a(is $$0, iz $$1) {
        if (this.i($$0)) {
            return false;
        }
        iz $$2 = $$1.g();
        if (!this.ao().a($$0.a($$1), this, $$2)) {
            return false;
        }
        fth $$3 = dae.a(this.eF(), $$2, 1.0f, $$0.c()).h(1.0E-6);
        return this.ao().a((cgk)this, $$3);
    }

    private boolean i(is $$0) {
        eoh $$1 = this.ao().a_($$0);
        if ($$1.l()) {
            return false;
        }
        boolean $$2 = $$1.a(dzs.ca) && $$0.equals(this.dK());
        return !$$2;
    }

    protected boolean p() {
        if (this.gG() || !this.cb()) {
            return false;
        }
        is $$0 = this.dK();
        for (int $$1 = 0; $$1 < 5; ++$$1) {
            iz $$3;
            is $$2 = $$0.b(bgj.b(this.as, -8, 8), bgj.b(this.as, -8, 8), bgj.b(this.as, -8, 8));
            if ($$2.v() <= this.ao().K_() || !this.ao().A($$2) || !this.ao().w().a($$2) || !this.ao().a((cgk)this, new fth($$2).h(1.0E-6)) || ($$3 = this.h($$2)) == null) continue;
            this.aw();
            this.a($$3);
            this.a(bda.Ad, 1.0f, 1.0f);
            this.a_((double)$$2.u() + 0.5, $$2.v(), (double)$$2.w() + 0.5);
            this.ao().a(etk.R, $$0, etk.a.a(this));
            this.az.a(b, (byte)0);
            this.g((chl)null);
            return true;
        }
        return false;
    }

    @Override
    public chf l_() {
        return null;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk $$3;
        if (this.gV() && ($$3 = $$1.c()) instanceof deh) {
            return false;
        }
        if (super.a($$0, $$1, $$2)) {
            cgk $$4;
            if ((double)this.eZ() < (double)this.fq() * 0.5 && this.as.a(4) == 0) {
                this.p();
            } else if ($$1.a(bdq.j) && ($$4 = $$1.c()) != null && $$4.ay() == cgu.bl) {
                this.gW();
            }
            return true;
        }
        return false;
    }

    private boolean gV() {
        return this.gX() == 0;
    }

    private void gW() {
        ftm $$0 = this.dI();
        fth $$1 = this.dj();
        if (this.gV() || !this.p()) {
            return;
        }
        int $$2 = this.ao().a(cgu.bk, $$1.g(8.0), cgk::cb).size();
        float $$3 = (float)($$2 - 1) / 5.0f;
        if (this.ao().y.i() < $$3) {
            return;
        }
        dae $$4 = cgu.bk.a(this.ao(), cgt.e);
        if ($$4 != null) {
            $$4.a(this.gQ());
            $$4.f($$0);
            this.ao().b($$4);
        }
    }

    @Override
    public boolean j(@Nullable cgk $$0) {
        return this.cb();
    }

    public iz gP() {
        return this.az.a(a);
    }

    private void a(iz $$0) {
        this.az.a(a, $$0);
    }

    @Override
    public void a(alw<?> $$0) {
        if (a.equals($$0)) {
            this.a(this.aG());
        }
        super.a($$0);
    }

    private int gX() {
        return this.az.a(b).byteValue();
    }

    void a(int $$0) {
        if (!this.ao().B_()) {
            this.h(cis.b).c(d);
            if ($$0 == 0) {
                this.h(cis.b).d(e);
                this.a(bda.zX, 1.0f, 1.0f);
                this.c(etk.j);
            } else {
                this.a(bda.Ab, 1.0f, 1.0f);
                this.c(etk.k);
            }
        }
        this.az.a(b, (byte)$$0);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cF, this.cG);
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        this.bC = 0.0f;
        this.bD = 0.0f;
    }

    @Override
    public int ac() {
        return 180;
    }

    @Override
    public int ae() {
        return 180;
    }

    @Override
    public void h(cgk $$0) {
    }

    public @Nullable ftm M(float $$0) {
        if (this.cH == null || this.cI <= 0) {
            return null;
        }
        double $$1 = (double)((float)this.cI - $$0) / 6.0;
        $$1 *= $$1;
        is $$2 = this.dK();
        double $$3 = (double)($$2.u() - this.cH.u()) * ($$1 *= (double)this.eF());
        double $$4 = (double)($$2.v() - this.cH.v()) * $$1;
        double $$5 = (double)($$2.w() - this.cH.w()) * $$1;
        return new ftm(-$$3, -$$4, -$$5);
    }

    @Override
    protected float c(float $$0) {
        return Math.min($$0, 3.0f);
    }

    private void a(Optional<dkr> $$02) {
        this.az.a(c, $$02.map($$0 -> (byte)$$0.a()).orElse((byte)16));
    }

    public Optional<dkr> gQ() {
        return Optional.ofNullable(this.gR());
    }

    public @Nullable dkr gR() {
        byte $$0 = this.az.a(c);
        if ($$0 == 16 || $$0 > 15) {
            return null;
        }
        return dkr.a($$0);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.ba) {
            return dae.c($$0, this.gR());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.ba);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.ba) {
            this.a(Optional.of(dae.c(ki.ba, $$1)));
            return true;
        }
        return super.b($$0, $$1);
    }

    class d
    extends cnp {
        public d(chn $$0) {
            super($$0);
        }

        @Override
        protected void b() {
        }

        @Override
        protected Optional<Float> i() {
            iz $$0 = dae.this.gP().g();
            Vector3f $$1 = $$0.b().transform(new Vector3f((Vector3fc)cD));
            jy $$2 = $$0.q();
            Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
            $$3.cross((Vector3fc)$$1);
            double $$4 = this.e - this.a.dP();
            double $$5 = this.f - this.a.dT();
            double $$6 = this.g - this.a.dV();
            Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
            float $$8 = $$3.dot((Vector3fc)$$7);
            float $$9 = $$1.dot((Vector3fc)$$7);
            return Math.abs($$8) > 1.0E-5f || Math.abs($$9) > 1.0E-5f ? Optional.of(Float.valueOf((float)(bgj.d((double)(-$$8), (double)$$9) * 57.2957763671875))) : Optional.empty();
        }

        @Override
        protected Optional<Float> h() {
            return Optional.of(Float.valueOf(0.0f));
        }
    }

    class a
    extends cop {
        private int b;

        public a() {
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            chl $$0 = dae.this.ag_();
            if ($$0 == null || !$$0.cb()) {
                return false;
            }
            return dae.this.ao().av() != ccz.a;
        }

        @Override
        public void d() {
            this.b = 20;
            dae.this.a(100);
        }

        @Override
        public void e() {
            dae.this.a(0);
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            if (dae.this.ao().av() == ccz.a) {
                return;
            }
            --this.b;
            chl $$0 = dae.this.ag_();
            if ($$0 == null) {
                return;
            }
            dae.this.J().a($$0, 180.0f, 180.0f);
            double $$1 = dae.this.g((cgk)$$0);
            if ($$1 < 400.0) {
                if (this.b <= 0) {
                    this.b = 20 + dae.this.as.a(10) * 20 / 2;
                    dae.this.ao().b(new def(dae.this.ao(), dae.this, $$0, dae.this.gP().o()));
                    dae.this.a(bda.Ac, 2.0f, (dae.this.as.i() - dae.this.as.i()) * 0.2f + 1.0f);
                }
            } else {
                dae.this.g((chl)null);
            }
            super.a();
        }
    }

    class f
    extends cop {
        private int b;

        f() {
        }

        @Override
        public boolean b() {
            return dae.this.ag_() == null && dae.this.as.a(dae$f.b(40)) == 0 && dae.this.a(dae.this.dK(), dae.this.gP());
        }

        @Override
        public boolean c() {
            return dae.this.ag_() == null && this.b > 0;
        }

        @Override
        public void d() {
            this.b = this.a(20 * (1 + dae.this.as.a(3)));
            dae.this.a(30);
        }

        @Override
        public void e() {
            if (dae.this.ag_() == null) {
                dae.this.a(0);
            }
        }

        @Override
        public void a() {
            --this.b;
        }
    }

    class e
    extends cqj<ddm> {
        public e(dae $$0) {
            super((chn)$$0, ddm.class, true);
        }

        @Override
        public boolean b() {
            if (dae.this.ao().av() == ccz.a) {
                return false;
            }
            return super.b();
        }

        @Override
        protected fth a(double $$0) {
            iz $$1 = ((dae)this.e).gP();
            if ($$1.o() == iz.a.a) {
                return this.e.dj().c(4.0, $$0, $$0);
            }
            if ($$1.o() == iz.a.c) {
                return this.e.dj().c($$0, $$0, 4.0);
            }
            return this.e.dj().c($$0, 4.0, $$0);
        }
    }

    static class c
    extends cqj<chl> {
        public c(dae $$02) {
            super($$02, chl.class, 10, true, false, ($$0, $$1) -> $$0 instanceof czu);
        }

        @Override
        public boolean b() {
            if (this.e.cI() == null) {
                return false;
            }
            return super.b();
        }

        @Override
        protected fth a(double $$0) {
            iz $$1 = ((dae)this.e).gP();
            if ($$1.o() == iz.a.a) {
                return this.e.dj().c(4.0, $$0, $$0);
            }
            if ($$1.o() == iz.a.c) {
                return this.e.dj().c($$0, $$0, 4.0);
            }
            return this.e.dj().c($$0, 4.0, $$0);
        }
    }

    static class b
    extends cnl {
        public b(chn $$0) {
            super($$0);
        }

        @Override
        public void a() {
        }
    }
}

