/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public abstract class dgb
extends dga
implements chj {
    private static final alw<Boolean> s = ama.a(dgb.class, aly.k);
    private static final alw<Boolean> t = ama.a(dgb.class, aly.k);
    private static final alw<Integer> u = ama.a(dgb.class, aly.b);
    public static final int d = 0;
    public static final int e = 1;
    private static final int aN = 60;
    private static final float aO = 0.3926991f;
    public static final double f = 0.7853981852531433;
    public static final int r = 60;
    private final float[] aP = new float[2];
    private float aQ;
    private float aR;
    private final chf aS = new chf((cgk)this, 3);
    private boolean aT;
    private boolean aU;
    private boolean aV;
    private boolean aW;
    private double aX;
    private float aY;
    private a aZ;
    private a ba;
    private double bb;
    private boolean bc;
    private boolean bd;
    private float be;
    private float bf;
    private float bg;
    private @Nullable chj.a bh;
    private final Supplier<dlp> bi;

    public dgb(cgu<? extends dgb> $$0, dwo $$1, Supplier<dlp> $$2) {
        super($$0, $$1);
        this.bi = $$2;
        this.W = true;
    }

    public void o(double $$0, double $$1, double $$2) {
        this.a_($$0, $$1, $$2);
        this.Y = $$0;
        this.Z = $$1;
        this.aa = $$2;
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(s, false);
        $$0.a(t, false);
        $$0.a(u, 0);
    }

    @Override
    public boolean i(cgk $$0) {
        return dgb.a((cgk)this, $$0);
    }

    public static boolean a(cgk $$0, cgk $$1) {
        return ($$1.j($$0) || $$1.bY()) && !$$0.A($$1);
    }

    @Override
    public boolean j(@Nullable cgk $$0) {
        return true;
    }

    @Override
    public boolean bY() {
        return true;
    }

    @Override
    public ftm a(iz.a $$0, ber.a $$1) {
        return chl.n(super.a($$0, $$1));
    }

    protected abstract double b(cgn var1);

    @Override
    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        float $$3 = this.E();
        if (this.dn().size() > 1) {
            int $$4 = this.dn().indexOf($$0);
            $$3 = $$4 == 0 ? 0.2f : -0.6f;
            if ($$0 instanceof cth) {
                $$3 += 0.2f;
            }
        }
        return new ftm(0.0, this.b($$1), $$3).b(-this.ec() * ((float)Math.PI / 180));
    }

    @Override
    public void a(boolean $$0, is $$1) {
        if (this.ao() instanceof axf) {
            this.bc = true;
            this.bd = $$0;
            if (this.M() == 0) {
                this.n(60);
            }
        }
        if (!this.bC() && this.as.a(100) == 0) {
            this.ao().a(this.dP(), this.dR(), this.dV(), this.bl(), this.dB(), 1.0f, 0.8f + 0.4f * this.as.i(), false);
            this.ao().a(ly.aq, this.dP() + (double)this.as.i(), this.dR() + 0.7, this.dV() + (double)this.as.i(), 0.0, 0.0, 0.0);
            this.a(etk.O, this.dl());
        }
    }

    @Override
    public void h(cgk $$0) {
        if ($$0 instanceof dgb) {
            if ($$0.dj().b < this.dj().e) {
                super.h($$0);
            }
        } else if ($$0.dj().b <= this.dj().b) {
            super.h($$0);
        }
    }

    @Override
    public void q(float $$0) {
        this.l(-this.n());
        this.d(10);
        this.a(this.f() * 11.0f);
    }

    @Override
    public boolean bX() {
        return !this.eh();
    }

    @Override
    public chf l_() {
        return this.aS;
    }

    @Override
    public iz dh() {
        return this.dg().h();
    }

    @Override
    public void g() {
        this.ba = this.aZ;
        this.aZ = this.H();
        this.aQ = this.aZ == dgb$a.b || this.aZ == dgb$a.c ? (this.aQ += 1.0f) : 0.0f;
        if (!this.ao().B_() && this.aQ >= 60.0f) {
            this.ce();
        }
        if (this.m() > 0) {
            this.d(this.m() - 1);
        }
        if (this.f() > 0.0f) {
            this.a(this.f() - 1.0f);
        }
        super.g();
        this.aS.e();
        if (this.dv()) {
            if (!(this.do() instanceof ddm)) {
                this.a(false, false);
            }
            this.K();
            if (this.ao().B_()) {
                this.L();
                this.ao().a(new ajd(this.m(0), this.m(1)));
            }
            this.a(chp.a, this.dN());
        } else {
            this.k(ftm.c);
        }
        this.aW();
        this.aW();
        this.G();
        for (int $$0 = 0; $$0 <= 1; ++$$0) {
            if (this.m($$0)) {
                bcz $$1;
                if (!this.bq() && (double)(this.aP[$$0] % ((float)Math.PI * 2)) <= 0.7853981852531433 && (double)((this.aP[$$0] + 0.3926991f) % ((float)Math.PI * 2)) >= 0.7853981852531433 && ($$1 = this.q()) != null) {
                    ftm $$2 = this.h(1.0f);
                    double $$3 = $$0 == 1 ? -$$2.i : $$2.i;
                    double $$4 = $$0 == 1 ? $$2.g : -$$2.g;
                    this.ao().a(null, this.dP() + $$3, this.dR(), this.dV() + $$4, $$1, this.dB(), 1.0f, 0.8f + 0.4f * this.as.i());
                }
                int n2 = $$0;
                this.aP[n2] = this.aP[n2] + 0.3926991f;
                continue;
            }
            this.aP[$$0] = 0.0f;
        }
        List<cgk> $$5 = this.ao().a((cgk)this, this.dj().c(0.2f, -0.01f, 0.2f), cgs.a(this));
        if (!$$5.isEmpty()) {
            boolean $$6 = !this.ao().B_() && !(this.dl() instanceof ddm);
            for (cgk $$7 : $$5) {
                if ($$7.z(this)) continue;
                if ($$6 && this.dn().size() < this.F() && !$$7.cq() && this.C($$7) && $$7 instanceof chl && !$$7.ay().a(bdt.P)) {
                    $$7.o(this);
                    continue;
                }
                this.h($$7);
            }
        }
    }

    private void G() {
        if (this.ao().B_()) {
            int $$02 = this.M();
            this.be = $$02 > 0 ? (this.be += 0.05f) : (this.be -= 0.1f);
            this.be = bgj.a(this.be, 0.0f, 1.0f);
            this.bg = this.bf;
            this.bf = 10.0f * (float)Math.sin(0.5 * (double)this.at) * this.be;
        } else {
            int $$1;
            if (!this.bc) {
                this.n(0);
            }
            if (($$1 = this.M()) > 0) {
                this.n(--$$1);
                int $$2 = 60 - $$1 - 1;
                if ($$2 > 0 && $$1 == 0) {
                    this.n(0);
                    ftm $$3 = this.dN();
                    if (this.bd) {
                        this.k($$3.b(0.0, -0.7, 0.0));
                        this.ce();
                    } else {
                        this.m($$3.g, this.a((cgk $$0) -> $$0 instanceof ddm) ? 2.7 : 0.6, $$3.i);
                    }
                }
                this.bc = false;
            }
        }
    }

    protected @Nullable bcz q() {
        return switch (this.H().ordinal()) {
            case 0, 1, 2 -> bda.cy;
            case 3 -> bda.cx;
            default -> null;
        };
    }

    public void a(boolean $$0, boolean $$1) {
        this.az.a(s, $$0);
        this.az.a(t, $$1);
    }

    public float a(int $$0, float $$1) {
        if (this.m($$0)) {
            return bgj.b($$1, this.aP[$$0] - 0.3926991f, this.aP[$$0]);
        }
        return 0.0f;
    }

    @Override
    public @Nullable chj.a T_() {
        return this.bh;
    }

    @Override
    public void a(@Nullable chj.a $$0) {
        this.bh = $$0;
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.88f * this.dG(), 0.64f * this.dF());
    }

    @Override
    public boolean z() {
        return true;
    }

    @Override
    public ftm[] A() {
        return chj.a(this, 0.0, 0.64, 0.382, 0.88);
    }

    private a H() {
        a $$0 = this.J();
        if ($$0 != null) {
            this.aX = this.dj().e;
            return $$0;
        }
        if (this.I()) {
            return dgb$a.a;
        }
        float $$1 = this.D();
        if ($$1 > 0.0f) {
            this.aY = $$1;
            return dgb$a.d;
        }
        return dgb$a.e;
    }

    public float u() {
        fth $$0 = this.dj();
        int $$1 = bgj.c($$0.a);
        int $$2 = bgj.e($$0.d);
        int $$3 = bgj.c($$0.e);
        int $$4 = bgj.e($$0.e - this.bb);
        int $$5 = bgj.c($$0.c);
        int $$6 = bgj.e($$0.f);
        is.a $$7 = new is.a();
        block0: for (int $$8 = $$3; $$8 < $$4; ++$$8) {
            float $$9 = 0.0f;
            for (int $$10 = $$1; $$10 < $$2; ++$$10) {
                for (int $$11 = $$5; $$11 < $$6; ++$$11) {
                    $$7.d($$10, $$8, $$11);
                    flb $$12 = this.ao().b_($$7);
                    if ($$12.a(bdv.a)) {
                        $$9 = Math.max($$9, $$12.a(this.ao(), $$7));
                    }
                    if ($$9 >= 1.0f) continue block0;
                }
            }
            if (!($$9 < 1.0f)) continue;
            return (float)$$7.v() + $$9;
        }
        return $$4 + 1;
    }

    public float D() {
        fth $$0 = this.dj();
        fth $$1 = new fth($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
        int $$2 = bgj.c($$1.a) - 1;
        int $$3 = bgj.e($$1.d) + 1;
        int $$4 = bgj.c($$1.b) - 1;
        int $$5 = bgj.e($$1.e) + 1;
        int $$6 = bgj.c($$1.c) - 1;
        int $$7 = bgj.e($$1.f) + 1;
        fug $$8 = fud.a($$1);
        float $$9 = 0.0f;
        int $$10 = 0;
        is.a $$11 = new is.a();
        for (int $$12 = $$2; $$12 < $$3; ++$$12) {
            for (int $$13 = $$6; $$13 < $$7; ++$$13) {
                int $$14 = ($$12 == $$2 || $$12 == $$3 - 1 ? 1 : 0) + ($$13 == $$6 || $$13 == $$7 - 1 ? 1 : 0);
                if ($$14 == 2) continue;
                for (int $$15 = $$4; $$15 < $$5; ++$$15) {
                    if ($$14 > 0 && ($$15 == $$4 || $$15 == $$5 - 1)) continue;
                    $$11.d($$12, $$15, $$13);
                    eoh $$16 = this.ao().a_($$11);
                    if ($$16.b() instanceof ejo || !fud.c($$16.g(this.ao(), $$11).a($$11), $$8, ftq.i)) continue;
                    $$9 += $$16.b().g();
                    ++$$10;
                }
            }
        }
        return $$9 / (float)$$10;
    }

    private boolean I() {
        fth $$0 = this.dj();
        int $$1 = bgj.c($$0.a);
        int $$2 = bgj.e($$0.d);
        int $$3 = bgj.c($$0.b);
        int $$4 = bgj.e($$0.b + 0.001);
        int $$5 = bgj.c($$0.c);
        int $$6 = bgj.e($$0.f);
        boolean $$7 = false;
        this.aX = -1.7976931348623157E308;
        is.a $$8 = new is.a();
        for (int $$9 = $$1; $$9 < $$2; ++$$9) {
            for (int $$10 = $$3; $$10 < $$4; ++$$10) {
                for (int $$11 = $$5; $$11 < $$6; ++$$11) {
                    $$8.d($$9, $$10, $$11);
                    flb $$12 = this.ao().b_($$8);
                    if (!$$12.a(bdv.a)) continue;
                    float $$13 = (float)$$10 + $$12.a(this.ao(), $$8);
                    this.aX = Math.max((double)$$13, this.aX);
                    $$7 |= $$0.b < (double)$$13;
                }
            }
        }
        return $$7;
    }

    private @Nullable a J() {
        fth $$0 = this.dj();
        double $$1 = $$0.e + 0.001;
        int $$2 = bgj.c($$0.a);
        int $$3 = bgj.e($$0.d);
        int $$4 = bgj.c($$0.e);
        int $$5 = bgj.e($$1);
        int $$6 = bgj.c($$0.c);
        int $$7 = bgj.e($$0.f);
        boolean $$8 = false;
        is.a $$9 = new is.a();
        for (int $$10 = $$2; $$10 < $$3; ++$$10) {
            for (int $$11 = $$4; $$11 < $$5; ++$$11) {
                for (int $$12 = $$6; $$12 < $$7; ++$$12) {
                    $$9.d($$10, $$11, $$12);
                    flb $$13 = this.ao().b_($$9);
                    if (!$$13.a(bdv.a) || !($$1 < (double)((float)$$9.v() + $$13.a(this.ao(), $$9)))) continue;
                    if ($$13.b()) {
                        $$8 = true;
                        continue;
                    }
                    return dgb$a.c;
                }
            }
        }
        return $$8 ? dgb$a.b : null;
    }

    @Override
    protected double bs() {
        return 0.04;
    }

    private void K() {
        double $$0 = -this.bt();
        double $$1 = 0.0;
        float $$2 = 0.05f;
        if (this.ba == dgb$a.e && this.aZ != dgb$a.e && this.aZ != dgb$a.d) {
            this.aX = this.f(1.0);
            double $$3 = (double)(this.u() - this.dG()) + 0.101;
            if (this.ao().a((cgk)this, this.dj().d(0.0, $$3 - this.dR(), 0.0))) {
                this.a_(this.dP(), $$3, this.dV());
                this.k(this.dN().d(1.0, 0.0, 1.0));
                this.bb = 0.0;
            }
            this.aZ = dgb$a.a;
        } else {
            if (this.aZ == dgb$a.a) {
                $$1 = (this.aX - this.dR()) / (double)this.dG();
                $$2 = 0.9f;
            } else if (this.aZ == dgb$a.c) {
                $$0 = -7.0E-4;
                $$2 = 0.9f;
            } else if (this.aZ == dgb$a.b) {
                $$1 = 0.01f;
                $$2 = 0.45f;
            } else if (this.aZ == dgb$a.e) {
                $$2 = 0.9f;
            } else if (this.aZ == dgb$a.d) {
                $$2 = this.aY;
                if (this.dl() instanceof ddm) {
                    this.aY /= 2.0f;
                }
            }
            ftm $$4 = this.dN();
            this.m($$4.g * (double)$$2, $$4.h + $$0, $$4.i * (double)$$2);
            this.aR *= $$2;
            if ($$1 > 0.0) {
                ftm $$5 = this.dN();
                this.m($$5.g, ($$5.h + $$1 * (this.bs() / 0.65)) * 0.75, $$5.i);
            }
        }
    }

    private void L() {
        if (!this.cr()) {
            return;
        }
        float $$0 = 0.0f;
        if (this.aT) {
            this.aR -= 1.0f;
        }
        if (this.aU) {
            this.aR += 1.0f;
        }
        if (this.aU != this.aT && !this.aV && !this.aW) {
            $$0 += 0.005f;
        }
        this.v(this.ec() + this.aR);
        if (this.aV) {
            $$0 += 0.04f;
        }
        if (this.aW) {
            $$0 -= 0.005f;
        }
        this.k(this.dN().b(bgj.a((double)(-this.ec() * ((float)Math.PI / 180))) * $$0, 0.0, bgj.b((double)(this.ec() * ((float)Math.PI / 180))) * $$0));
        this.a(this.aU && !this.aT || this.aV, this.aT && !this.aU || this.aV);
    }

    protected float E() {
        return 0.0f;
    }

    public boolean C(cgk $$0) {
        return $$0.dF() < this.dF();
    }

    @Override
    protected void a(cgk $$0, cgk.b $$1) {
        super.a($$0, $$1);
        if ($$0.ay().a(bdt.t)) {
            return;
        }
        $$0.v($$0.ec() + this.aR);
        $$0.r($$0.cS() + this.aR);
        this.D($$0);
        if ($$0 instanceof cth && this.dn().size() == this.F()) {
            int $$2 = $$0.aA() % 2 == 0 ? 90 : 270;
            $$0.s(((cth)$$0).bC + (float)$$2);
            $$0.r($$0.cS() + (float)$$2);
        }
    }

    @Override
    public ftm b(chl $$0) {
        ftm $$1 = dgb.a(this.dF() * bgj.g, (double)$$0.dF(), $$0.ec());
        double $$2 = this.dP() + $$1.g;
        double $$3 = this.dV() + $$1.i;
        is $$4 = is.a($$2, this.dj().e, $$3);
        is $$5 = $$4.e();
        if (!this.ao().F($$5)) {
            double $$8;
            ArrayList $$6 = Lists.newArrayList();
            double $$7 = this.ao().m($$4);
            if (dfz.a($$7)) {
                $$6.add(new ftm($$2, (double)$$4.v() + $$7, $$3));
            }
            if (dfz.a($$8 = this.ao().m($$5))) {
                $$6.add(new ftm($$2, (double)$$5.v() + $$8, $$3));
            }
            for (chx $$9 : $$0.go()) {
                for (ftm $$10 : $$6) {
                    if (!dfz.a(this.ao(), $$10, $$0, $$9)) continue;
                    $$0.c($$9);
                    return $$10;
                }
            }
        }
        return super.b($$0);
    }

    protected void D(cgk $$0) {
        $$0.s(this.ec());
        float $$1 = bgj.f($$0.ec() - this.ec());
        float $$2 = bgj.a($$1, -105.0f, 105.0f);
        $$0.ab += $$2 - $$1;
        $$0.v($$0.ec() + $$2 - $$1);
        $$0.r($$0.ec());
    }

    @Override
    public void l(cgk $$0) {
        this.D($$0);
    }

    @Override
    protected void a(fns $$0) {
        this.a($$0, this.bh);
    }

    @Override
    protected void a(fnq $$0) {
        this.b($$0);
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        cdc $$2 = super.a($$0, $$1);
        if ($$2 != cdc.e) {
            return $$2;
        }
        if (!$$0.gA() && this.aQ < 60.0f && (this.ao().B_() || $$0.o(this))) {
            return cdc.a;
        }
        return cdc.e;
    }

    @Override
    public void a(cgk.e $$0) {
        if (!this.ao().B_() && $$0.a() && this.S_()) {
            this.o();
        }
        super.a($$0);
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
        this.bb = this.dN().h;
        if (this.cq()) {
            return;
        }
        if ($$1) {
            this.l();
        } else if (!this.ao().b_(this.dK().e()).a(bdv.a) && $$0 < 0.0) {
            this.an -= (double)((float)$$0);
        }
    }

    public boolean m(int $$0) {
        return this.az.a($$0 == 0 ? s : t) != false && this.dl() != null;
    }

    private void n(int $$0) {
        this.az.a(u, $$0);
    }

    private int M() {
        return this.az.a(u);
    }

    public float b(float $$0) {
        return bgj.h($$0, this.bg, this.bf);
    }

    @Override
    protected boolean s(cgk $$0) {
        return this.dn().size() < this.F() && !this.a(bdv.a);
    }

    protected int F() {
        return 2;
    }

    @Override
    public @Nullable chl dl() {
        chl $$0;
        cgk cgk2 = this.do();
        return cgk2 instanceof chl ? ($$0 = (chl)cgk2) : super.dl();
    }

    public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
        this.aT = $$0;
        this.aU = $$1;
        this.aV = $$2;
        this.aW = $$3;
    }

    @Override
    public boolean bC() {
        return this.aZ == dgb$a.b || this.aZ == dgb$a.c;
    }

    @Override
    protected final dlp p() {
        return this.bi.get();
    }

    @Override
    public final dlt dZ() {
        return new dlt(this.bi.get());
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = dgb$a.a();
        }
    }
}

