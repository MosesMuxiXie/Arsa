/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.Dynamic
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class dch
extends czz
implements ett {
    private static final int cv = 40;
    private static final int cw = 200;
    private static final int cx = 500;
    private static final float cy = 0.3f;
    private static final float cz = 1.0f;
    private static final float cA = 1.5f;
    private static final int cB = 30;
    private static final int cC = 24;
    private static final alw<Integer> cD = ama.a(dch.class, aly.b);
    private static final int cE = 200;
    private static final int cF = 260;
    private static final int cG = 20;
    private static final int cH = 120;
    private static final int cI = 20;
    private static final int cJ = 35;
    private static final int cK = 10;
    private static final int cL = 20;
    private static final int cM = 100;
    private static final int cN = 20;
    private static final int cO = 30;
    private static final float cP = 4.5f;
    private static final float cQ = 0.7f;
    private static final int cR = 30;
    private int cU;
    private int cV;
    private int cW;
    private int cX;
    public cfz a = new cfz();
    public cfz b = new cfz();
    public cfz c = new cfz();
    public cfz d = new cfz();
    public cfz e = new cfz();
    public cfz f = new cfz();
    private final eth<ett.b> cY;
    private final ett.d cZ;
    private ett.a da;
    dcg db = new dcg(this::H, Collections.emptyList());

    public dch(cgu<? extends czz> $$0, dwo $$1) {
        super($$0, $$1);
        this.cZ = new a();
        this.da = new ett.a();
        this.cY = new eth<ett.b>(new ett.b(this));
        this.cn = 5;
        this.N().a(true);
        this.a(fls.m, 0.0f);
        this.a(fls.q, 8.0f);
        this.a(fls.f, 8.0f);
        this.a(fls.i, 8.0f);
        this.a(fls.o, 0.0f);
        this.a(fls.n, 0.0f);
    }

    @Override
    public aay<adb> a(axd $$0) {
        return new adc((cgk)this, $$0, this.d(chx.n) ? 1 : 0);
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        if ($$0.n() == 1) {
            this.c(chx.n);
        }
    }

    @Override
    public boolean a(dwr $$0) {
        return super.a($$0) && $$0.a((cgk)this, this.ay().n().a(this.dI()));
    }

    @Override
    public float a(is $$0, dwr $$1) {
        return 0.0f;
    }

    @Override
    public boolean a(axf $$0, cex $$1) {
        if (this.gU() && !$$1.a(bdq.d)) {
            return true;
        }
        return super.a($$0, $$1);
    }

    boolean gU() {
        return this.d(chx.o) || this.d(chx.n);
    }

    @Override
    protected boolean p(cgk $$0) {
        return false;
    }

    @Override
    public float gu() {
        return 5.0f;
    }

    @Override
    protected float bj() {
        return this.al + 0.55f;
    }

    public static cir.a k() {
        return czz.gW().a(cis.u, 500.0).a(cis.x, 0.3f).a(cis.r, 1.0).a(cis.e, 1.5).a(cis.d, 30.0).a(cis.o, 24.0);
    }

    @Override
    public boolean bw() {
        return true;
    }

    @Override
    protected float fC() {
        return 4.0f;
    }

    @Override
    protected @Nullable bcz W() {
        if (this.d(chx.l) || this.gU()) {
            return null;
        }
        return this.gP().b();
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Fg;
    }

    @Override
    protected bcz fd() {
        return bda.Fc;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.Fq, 10.0f, 1.0f);
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        $$0.a((cgk)this, (byte)4);
        this.a(bda.Fb, 10.0f, this.fD());
        cni.a((chl)this, 40);
        return super.c($$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cD, 0);
    }

    public int p() {
        return this.az.a(cD);
    }

    private void gX() {
        this.az.a(cD, this.ha());
    }

    @Override
    public void g() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            ett.c.a((dwo)$$0, this.da, this.cZ);
            if (this.gA() || this.ab()) {
                dci.a((chl)this);
            }
        }
        super.g();
        if (this.ao().B_()) {
            if (this.at % this.gY() == 0) {
                this.cW = 10;
                if (!this.bq()) {
                    this.ao().a(this.dP(), this.dR(), this.dV(), bda.Ff, this.dB(), 5.0f, this.fD(), false);
                }
            }
            this.cV = this.cU;
            if (this.cU > 0) {
                --this.cU;
            }
            this.cX = this.cW;
            if (this.cW > 0) {
                --this.cW;
            }
            switch (this.aF()) {
                case n: {
                    this.a(this.c);
                    break;
                }
                case o: {
                    this.a(this.d);
                }
            }
        }
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("wardenBrain");
        this.ev().a($$0, this);
        $$1.c();
        super.a($$0);
        if ((this.at + this.aA()) % 120 == 0) {
            dch.a($$0, this.dI(), this, 20);
        }
        if (this.at % 20 == 0) {
            this.db.a($$0, this::H);
            this.gX();
        }
        dci.a(this);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.a.a();
            this.e.a(this.at);
        } else if ($$0 == 61) {
            this.cU = 10;
        } else if ($$0 == 62) {
            this.f.a(this.at);
        } else {
            super.b($$0);
        }
    }

    private int gY() {
        float $$0 = (float)this.p() / (float)dcf.c.a();
        return 40 - bgj.b(bgj.a($$0, 0.0f, 1.0f) * 30.0f);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cV, this.cU) / 10.0f;
    }

    public float M(float $$0) {
        return bgj.h($$0, this.cX, this.cW) / 10.0f;
    }

    private void a(cfz $$0) {
        if ((float)$$0.a((float)this.at) < 4500.0f) {
            bgr $$1 = this.ep();
            eoh $$2 = this.bK();
            if ($$2.o() != egf.a) {
                for (int $$3 = 0; $$3 < 30; ++$$3) {
                    double $$4 = this.dP() + (double)bgj.b($$1, -0.7f, 0.7f);
                    double $$5 = this.dR();
                    double $$6 = this.dV() + (double)bgj.b($$1, -0.7f, 0.7f);
                    this.ao().a(new lp(ly.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
                }
            }
        }
    }

    @Override
    public void a(alw<?> $$0) {
        if (aE.equals($$0)) {
            switch (this.aF()) {
                case l: {
                    this.a.a(this.at);
                    break;
                }
                case m: {
                    this.b.a(this.at);
                    break;
                }
                case n: {
                    this.c.a(this.at);
                    break;
                }
                case o: {
                    this.d.a(this.at);
                }
            }
        }
        super.a($$0);
    }

    @Override
    public boolean a(dwi $$0) {
        return this.gU();
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return dci.a(this, $$0);
    }

    public cim<dch> ev() {
        return super.ev();
    }

    @Override
    public void a(BiConsumer<eth<?>, axf> $$0) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            $$0.accept(this.cY, $$1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Contract(value="null->false")
    public boolean H(@Nullable cgk $$0) {
        if (!($$0 instanceof chl)) return false;
        chl $$1 = (chl)$$0;
        if (this.ao() != $$0.ao()) return false;
        if (!cgs.e.test($$0)) return false;
        if (this.t($$0)) return false;
        if ($$1.ay() == cgu.h) return false;
        if ($$1.ay() == cgu.bO) return false;
        if ($$1.cU()) return false;
        if ($$1.fa()) return false;
        if (!this.ao().w().a($$1.dj())) return false;
        return true;
    }

    public static void a(axf $$0, ftm $$1, @Nullable cgk $$2, int $$3) {
        cfm $$4 = new cfm(cfo.G, 260, 0, false, false);
        cfn.a($$0, $$2, $$1, $$3, $$4, 200);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("anger", dcg.a(this::H), this.db);
        $$0.a("listener", ett.a.a, this.da);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.db = $$0.a("anger", dcg.a(this::H)).orElseGet(() -> new dcg(this::H, Collections.emptyList()));
        this.gX();
        this.da = $$0.a("listener", ett.a.a).orElseGet(ett.a::new);
    }

    private void gZ() {
        if (!this.d(chx.l)) {
            this.a(this.gP().c(), 10.0f, this.fD());
        }
    }

    public dcf gP() {
        return dcf.a(this.ha());
    }

    private int ha() {
        return this.db.b(this.ag_());
    }

    public void I(cgk $$0) {
        this.db.a($$0);
    }

    public void J(@Nullable cgk $$0) {
        this.a($$0, 35, true);
    }

    @VisibleForTesting
    public void a(@Nullable cgk $$0, int $$1, boolean $$2) {
        if (!this.gG() && this.H($$0)) {
            dci.a((chl)this);
            boolean $$3 = !(this.ag_() instanceof ddm);
            int $$4 = this.db.a($$0, $$1);
            if ($$0 instanceof ddm && $$3 && dcf.a($$4).d()) {
                this.ev().b(cqw.p);
            }
            if ($$2) {
                this.gZ();
            }
        }
    }

    public Optional<chl> gQ() {
        if (this.gP().d()) {
            return this.db.a();
        }
        return Optional.empty();
    }

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }

    @Override
    public boolean i(double $$0) {
        return false;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.ev().a(cqw.aP, bhr.a, 1200L);
        if ($$2 == cgt.k) {
            this.c(chx.n);
            this.ev().a(cqw.aN, bhr.a, dci.a);
            this.a(bda.EY, 5.0f, 1.0f);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        if (!this.gG() && !this.gU()) {
            cgk $$4 = $$1.d();
            this.a($$4, dcf.c.a() + 20, false);
            if (this.ca.c(cqw.p).isEmpty() && $$4 instanceof chl) {
                chl $$5 = (chl)$$4;
                if ($$1.b() || this.a((cgk)$$5, 5.0)) {
                    this.i($$5);
                }
            }
        }
        return $$3;
    }

    public void i(chl $$0) {
        this.ev().b(cqw.aJ);
        this.ev().a(cqw.p, $$0);
        this.ev().b(cqw.F);
        cni.a((chl)this, 200);
    }

    @Override
    public cgn b(chx $$0) {
        cgn $$1 = super.b($$0);
        if (this.gU()) {
            return cgn.c($$1.a(), 1.0f);
        }
        return $$1;
    }

    @Override
    public boolean bY() {
        return !this.gU() && super.bY();
    }

    @Override
    protected void F(cgk $$0) {
        if (!this.gG() && !this.ev().a(cqw.aS)) {
            this.ev().a(cqw.aS, bhr.a, 20L);
            this.J($$0);
            dci.a(this, $$0.dK());
        }
        super.F($$0);
    }

    @VisibleForTesting
    public dcg gR() {
        return this.db;
    }

    @Override
    protected cre b(dwo $$0) {
        return new crd(this, this, $$0){

            @Override
            protected flr a(int $$0) {
                this.o = new flx();
                return new flr(this, this.o, $$0){

                    @Override
                    protected float a(fln $$0, fln $$1) {
                        return $$0.b($$1);
                    }
                };
            }
        };
    }

    @Override
    public ett.a gS() {
        return this.da;
    }

    @Override
    public ett.d gT() {
        return this.cZ;
    }

    class a
    implements ett.d {
        private static final int b = 16;
        private final eto c;

        a() {
            this.c = new eti(dch.this, dch.this.dk());
        }

        @Override
        public int a() {
            return 16;
        }

        @Override
        public eto b() {
            return this.c;
        }

        @Override
        public bef<etk> c() {
            return bdw.b;
        }

        @Override
        public boolean d() {
            return true;
        }

        @Override
        public boolean a(axf $$0, is $$1, jd<etk> $$2, etk.a $$3) {
            chl $$4;
            if (dch.this.gG() || dch.this.fa() || dch.this.ev().a(cqw.aT) || dch.this.gU() || !$$0.w().a($$1)) {
                return false;
            }
            cgk cgk2 = $$3.a();
            return !(cgk2 instanceof chl) || dch.this.H($$4 = (chl)cgk2);
        }

        @Override
        public void a(axf $$0, is $$1, jd<etk> $$2, @Nullable cgk $$3, @Nullable cgk $$4, float $$5) {
            if (dch.this.fa()) {
                return;
            }
            dch.this.ca.a(cqw.aT, bhr.a, 40L);
            $$0.a((cgk)dch.this, (byte)61);
            dch.this.a(bda.Fr, 5.0f, dch.this.fD());
            is $$6 = $$1;
            if ($$4 != null) {
                if (dch.this.a($$4, 30.0)) {
                    if (dch.this.ev().a(cqw.aL)) {
                        if (dch.this.H($$4)) {
                            $$6 = $$4.dK();
                        }
                        dch.this.J($$4);
                    } else {
                        dch.this.a($$4, 10, true);
                    }
                }
                dch.this.ev().a(cqw.aL, bhr.a, 100L);
            } else {
                dch.this.J($$3);
            }
            if (!dch.this.gP().d()) {
                Optional<chl> $$7 = dch.this.db.a();
                if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                    dci.a(dch.this, $$6);
                }
            }
        }
    }
}

