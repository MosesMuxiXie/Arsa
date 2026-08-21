/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class cvo
extends cth {
    private static final alw<Integer> cz = ama.a(cvo.class, aly.b);
    private static final alw<Byte> cA = ama.a(cvo.class, aly.a);
    private static final int cB = 1;
    public static final int cv = 4;
    public static final int cw = 8;
    public static final int cx = 16;
    private static final int cC = 32;
    private static final int cD = 64;
    private static final int cE = 128;
    private static final alw<Optional<cgr<chl>>> cF = ama.a(cvo.class, aly.r);
    private static final alw<Optional<cgr<chl>>> cG = ama.a(cvo.class, aly.r);
    static final Predicate<czl> cH = $$0 -> !$$0.n() && $$0.cb();
    private static final Predicate<cgk> cI = $$0 -> {
        if ($$0 instanceof chl) {
            chl $$1 = (chl)$$0;
            return $$1.eN() != null && $$1.eO() < $$1.at + 600;
        }
        return false;
    };
    static final Predicate<cgk> cJ = $$0 -> $$0 instanceof cuc || $$0 instanceof cxh;
    private static final Predicate<cgk> cK = $$0 -> !$$0.cx() && cgs.e.test((cgk)$$0);
    private static final int cL = 600;
    private static final cgn cM = cgu.ae.n().a(0.5f).b(0.2975f);
    private static final Codec<List<cgr<chl>>> cN = cgr.a().listOf();
    private static final boolean cO = false;
    private static final boolean cP = false;
    private static final boolean cQ = false;
    private cop cR;
    private cop cU;
    private cop cV;
    private float cW;
    private float cX;
    float cY;
    float cZ;
    private int da;

    public cvo(cgu<? extends cvo> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.co = new k();
        this.cp = new m();
        this.a(fls.p, 0.0f);
        this.a(fls.q, 0.0f);
        this.b_(true);
        this.N().a(32.0f);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cF, Optional.empty());
        $$0.a(cG, Optional.empty());
        $$0.a(cz, cvo$v.c.a());
        $$0.a(cA, (byte)0);
    }

    @Override
    protected void D() {
        this.cR = new cqj<cth>(this, cth.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cuc || $$0 instanceof cxh);
        this.cU = new cqj<cxs>(this, cxs.class, 10, false, false, cxs.cv);
        this.cV = new cqj<cvg>(this, cvg.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cvh);
        this.cs.a(0, new g());
        this.cs.a(0, new coc(this, this.ao()));
        this.cs.a(1, new b());
        this.cs.a(2, new n(2.2));
        this.cs.a(3, new e(this, 1.0));
        this.cs.a(4, new cnu<ddm>(this, ddm.class, 16.0f, 1.6, 1.4, $$0 -> cK.test((cgk)$$0) && !this.j((chl)$$0) && !this.hf()));
        this.cs.a(4, new cnu<cxu>(this, cxu.class, 8.0f, 1.6, 1.4, $$0 -> !((cxu)$$0).p() && !this.hf()));
        this.cs.a(4, new cnu<cxf>(this, cxf.class, 8.0f, 1.6, 1.4, $$0 -> !this.hf()));
        this.cs.a(5, new u());
        this.cs.a(6, new o());
        this.cs.a(6, new s(1.25));
        this.cs.a(7, new l((double)1.2f, true));
        this.cs.a(7, new t());
        this.cs.a(8, new h(this, 1.25));
        this.cs.a(9, new q(32, 200));
        this.cs.a(10, new f((double)1.2f, 12, 1));
        this.cs.a(10, new cov(this, 0.4f));
        this.cs.a(11, new cqd(this, 1.0));
        this.cs.a(11, new p());
        this.cs.a(12, new j(this, ddm.class, 24.0f));
        this.cs.a(13, new r());
        this.ct.a(3, new a(chl.class, false, false, ($$0, $$1) -> cI.test($$0) && !this.j($$0)));
    }

    @Override
    public void d_() {
        if (!this.ao().B_() && this.cb() && this.dy()) {
            chl $$2;
            ++this.da;
            dlt $$0 = this.a(cgv.a);
            if (this.k($$0)) {
                if (this.da > 600) {
                    dlt $$1 = $$0.a(this.ao(), (chl)this);
                    if (!$$1.f()) {
                        this.a(cgv.a, $$1);
                    }
                    this.da = 0;
                } else if (this.da > 560 && this.as.i() < 0.1f) {
                    this.gX();
                    this.ao().a((cgk)this, (byte)45);
                }
            }
            if (($$2 = this.ag_()) == null || !$$2.cb()) {
                this.z(false);
                this.A(false);
            }
        }
        if (this.gr() || this.fE()) {
            this.bM = false;
            this.bN = 0.0f;
            this.bP = 0.0f;
        }
        super.d_();
        if (this.hf() && this.as.i() < 0.05f) {
            this.a(bda.kT, 1.0f, 1.0f);
        }
    }

    @Override
    protected boolean fE() {
        return this.fa();
    }

    private boolean k(dlt $$0) {
        return this.l($$0) && this.ag_() == null && this.aV() && !this.gr();
    }

    private boolean l(dlt $$0) {
        return $$0.c(ki.y) && $$0.c(ki.z);
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        if ($$0.i() < 0.2f) {
            dlt $$8;
            float $$2 = $$0.i();
            if ($$2 < 0.05f) {
                dlt $$3 = new dlt(dlx.qb);
            } else if ($$2 < 0.2f) {
                dlt $$4 = new dlt(dlx.sD);
            } else if ($$2 < 0.4f) {
                dlt $$5 = $$0.h() ? new dlt(dlx.wQ) : new dlt(dlx.wR);
            } else if ($$2 < 0.6f) {
                dlt $$6 = new dlt(dlx.rc);
            } else if ($$2 < 0.8f) {
                dlt $$7 = new dlt(dlx.sp);
            } else {
                $$8 = new dlt(dlx.qZ);
            }
            this.a(cgv.a, $$8);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 45) {
            dlt $$1 = this.a(cgv.a);
            if (!$$1.f()) {
                for (int $$2 = 0; $$2 < 8; ++$$2) {
                    ftm $$3 = new ftm(((double)this.as.i() - 0.5) * 0.1, (double)this.as.i() * 0.1 + 0.1, 0.0).a(-this.ee() * ((float)Math.PI / 180)).b(-this.ec() * ((float)Math.PI / 180));
                    this.ao().a(new lu(ly.V, $$1), this.dP() + this.cj().g / 2.0, this.dR(), this.dV() + this.cj().i / 2.0, $$3.g, $$3.h + 0.05, $$3.i);
                }
            }
        } else {
            super.b($$0);
        }
    }

    public static cir.a p() {
        return cth.gW().a(cis.x, 0.3f).a(cis.u, 10.0).a(cis.d, 2.0).a(cis.z, 5.0).a(cis.o, 32.0);
    }

    public @Nullable cvo b(axf $$0, cfy $$1) {
        cvo $$2 = cgu.ae.a($$0, cgt.e);
        if ($$2 != null) {
            $$2.a(this.as.h() ? this.gP() : ((cvo)$$1).gP());
        }
        return $$2;
    }

    public static boolean c(cgu<cvo> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.ct) && cvo.a($$1, $$3);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        jd<dxo> $$4 = $$0.z(this.dK());
        v $$5 = cvo$v.a($$4);
        boolean $$6 = false;
        if ($$3 instanceof i) {
            i $$7 = (i)$$3;
            $$5 = $$7.a;
            if ($$7.a() >= 2) {
                $$6 = true;
            }
        } else {
            $$3 = new i($$5);
        }
        this.a($$5);
        if ($$6) {
            this.d_(-24000);
        }
        if ($$0 instanceof axf) {
            this.gV();
        }
        this.a($$0.G_(), $$1);
        return super.a($$0, $$1, $$2, $$3);
    }

    private void gV() {
        if (this.gP() == cvo$v.a) {
            this.ct.a(4, this.cR);
            this.ct.a(4, this.cU);
            this.ct.a(6, this.cV);
        } else {
            this.ct.a(4, this.cV);
            this.ct.a(6, this.cR);
            this.ct.a(6, this.cU);
        }
    }

    @Override
    protected void gX() {
        this.a(bda.kX, 1.0f, 1.0f);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? cM : super.b($$0);
    }

    public v gP() {
        return cvo$v.a(this.az.a(cz));
    }

    private void a(v $$0) {
        this.az.a(cz, $$0.a());
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aG) {
            return cvo.c($$0, this.gP());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aG);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aG) {
            this.a(cvo.c(ki.aG, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    Stream<cgr<chl>> hd() {
        return Stream.concat(this.az.a(cF).stream(), this.az.a(cG).stream());
    }

    void i(chl $$0) {
        this.a(cgr.a($$0));
    }

    private void a(cgr<chl> $$0) {
        if (this.az.a(cF).isPresent()) {
            this.az.a(cG, Optional.of($$0));
        } else {
            this.az.a(cF, Optional.of($$0));
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Trusted", cN, this.hd().toList());
        $$0.a("Sleeping", this.gr());
        $$0.a("Type", cvo$v.d, this.gP());
        $$0.a("Sitting", this.gQ());
        $$0.a("Crouching", this.cz());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.he();
        $$0.a("Trusted", cN).orElse(List.of()).forEach(this::a);
        this.D($$0.a("Sleeping", false));
        this.a($$0.a("Type", cvo$v.d).orElse(cvo$v.c));
        this.x($$0.a("Sitting", false));
        this.z($$0.a("Crouching", false));
        if (this.ao() instanceof axf) {
            this.gV();
        }
    }

    private void he() {
        this.az.a(cF, Optional.empty());
        this.az.a(cG, Optional.empty());
    }

    public boolean gQ() {
        return this.s(1);
    }

    public void x(boolean $$0) {
        this.d(1, $$0);
    }

    public boolean gR() {
        return this.s(64);
    }

    void B(boolean $$0) {
        this.d(64, $$0);
    }

    boolean hf() {
        return this.s(128);
    }

    void C(boolean $$0) {
        this.d(128, $$0);
    }

    @Override
    public boolean gr() {
        return this.s(32);
    }

    void D(boolean $$0) {
        this.d(32, $$0);
    }

    private void d(int $$0, boolean $$1) {
        if ($$1) {
            this.az.a(cA, (byte)(this.az.a(cA) | $$0));
        } else {
            this.az.a(cA, (byte)(this.az.a(cA) & ~$$0));
        }
    }

    private boolean s(int $$0) {
        return (this.az.a(cA) & $$0) != 0;
    }

    @Override
    protected boolean f(cgv $$0) {
        return $$0 == cgv.a && this.gn();
    }

    @Override
    public boolean h(dlt $$0) {
        dlt $$1 = this.a(cgv.a);
        return $$1.f() || this.da > 0 && this.l($$0) && !this.l($$1);
    }

    private void m(dlt $$0) {
        if ($$0.f() || this.ao().B_()) {
            return;
        }
        czl $$1 = new czl(this.ao(), this.dP() + this.cj().g, this.dR() + 1.0, this.dV() + this.cj().i, $$0);
        $$1.a(40);
        $$1.b((cgk)this);
        this.a(bda.lc, 1.0f, 1.0f);
        this.ao().b($$1);
    }

    private void n(dlt $$0) {
        czl $$1 = new czl(this.ao(), this.dP(), this.dR(), this.dV(), $$0);
        this.ao().b($$1);
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        dlt $$2 = $$1.e();
        if (this.h($$2)) {
            int $$3 = $$2.N();
            if ($$3 > 1) {
                this.n($$2.a($$3 - 1));
            }
            this.m(this.a(cgv.a));
            this.a($$1);
            this.a(cgv.a, $$2.a(1));
            this.g(cgv.a);
            this.a((cgk)$$1, $$2.N());
            $$1.aC();
            this.da = 0;
        }
    }

    @Override
    public void g() {
        super.g();
        if (this.dy()) {
            boolean $$0 = this.by();
            if ($$0 || this.ag_() != null || this.ao().an()) {
                this.hg();
            }
            if ($$0 || this.gr()) {
                this.x(false);
            }
            if (this.gR() && this.ao().y.i() < 0.2f) {
                is $$1 = this.dK();
                eoh $$2 = this.ao().a_($$1);
                this.ao().c(2001, $$1, dzq.j($$2));
            }
        }
        this.cX = this.cW;
        this.cW = this.gU() ? (this.cW += (1.0f - this.cW) * 0.4f) : (this.cW += (0.0f - this.cW) * 0.4f);
        this.cZ = this.cY;
        if (this.cz()) {
            this.cY += 0.2f;
            if (this.cY > 3.0f) {
                this.cY = 3.0f;
            }
        } else {
            this.cY = 0.0f;
        }
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aD);
    }

    @Override
    protected void a(ddm $$0, chn $$1) {
        ((cvo)$$1).i($$0);
    }

    public boolean gS() {
        return this.s(16);
    }

    public void y(boolean $$0) {
        this.d(16, $$0);
    }

    public boolean gT() {
        return this.cY == 3.0f;
    }

    public void z(boolean $$0) {
        this.d(4, $$0);
    }

    @Override
    public boolean cz() {
        return this.s(4);
    }

    public void A(boolean $$0) {
        this.d(8, $$0);
    }

    public boolean gU() {
        return this.s(8);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cX, this.cW) * 0.11f * (float)Math.PI;
    }

    public float M(float $$0) {
        return bgj.h($$0, this.cZ, this.cY);
    }

    @Override
    public void g(@Nullable chl $$0) {
        if (this.hf() && $$0 == null) {
            this.C(false);
        }
        super.g($$0);
    }

    void hg() {
        this.D(false);
    }

    void hh() {
        this.A(false);
        this.z(false);
        this.x(false);
        this.D(false);
        this.C(false);
        this.B(false);
    }

    boolean hi() {
        return !this.gr() && !this.gQ() && !this.gR();
    }

    @Override
    public void T() {
        bcz $$0 = this.W();
        if ($$0 == bda.kZ) {
            this.a($$0, 2.0f, this.fD());
        } else {
            super.T();
        }
    }

    @Override
    protected @Nullable bcz W() {
        List<cgk> $$0;
        if (this.gr()) {
            return bda.la;
        }
        if (!this.ao().ag() && this.as.i() < 0.1f && ($$0 = this.ao().a(ddm.class, this.dj().c(16.0, 16.0, 16.0), cgs.f)).isEmpty()) {
            return bda.kZ;
        }
        return bda.kU;
    }

    @Override
    protected @Nullable bcz h(cex $$0) {
        return bda.kY;
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.kW;
    }

    boolean j(chl $$0) {
        return this.hd().anyMatch($$1 -> $$1.b($$0));
    }

    @Override
    protected void b(axf $$0, cex $$1) {
        dlt $$2 = this.a(cgv.a);
        if (!$$2.f()) {
            this.a($$0, $$2);
            this.a(cgv.a, dlt.l);
        }
        super.b($$0, $$1);
    }

    public static boolean a(cvo $$0, chl $$1) {
        double $$2 = $$1.dV() - $$0.dV();
        double $$3 = $$1.dP() - $$0.dP();
        double $$4 = $$2 / $$3;
        int $$5 = 6;
        for (int $$6 = 0; $$6 < 6; ++$$6) {
            double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0f);
            double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0f) : $$7 / $$4;
            for (int $$9 = 1; $$9 < 4; ++$$9) {
                if ($$0.ao().a_(is.a($$0.dP() + $$8, $$0.dR() + (double)$$9, $$0.dV() + $$7)).v()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.55f * this.dk(), this.dF() * 0.4f);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    public class k
    extends cnp {
        public k() {
            super(cvo.this);
        }

        @Override
        public void a() {
            if (!cvo.this.gr()) {
                super.a();
            }
        }

        @Override
        protected boolean c() {
            return !cvo.this.gS() && !cvo.this.cz() && !cvo.this.gU() && !cvo.this.gR();
        }
    }

    class m
    extends cnq {
        public m() {
            super(cvo.this);
        }

        @Override
        public void a() {
            if (cvo.this.hi()) {
                super.a();
            }
        }
    }

    public static final class v
    extends Enum<v>
    implements bhh {
        public static final /* enum */ v a = new v(0, "red");
        public static final /* enum */ v b = new v(1, "snow");
        public static final v c;
        public static final bhh.a<v> d;
        private static final IntFunction<v> f;
        public static final aao<ByteBuf, v> e;
        private final int g;
        private final String h;
        private static final /* synthetic */ v[] i;

        public static v[] values() {
            return (v[])i.clone();
        }

        public static v valueOf(String $$0) {
            return Enum.valueOf(v.class, $$0);
        }

        private v(int $$0, String $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        @Override
        public String c() {
            return this.h;
        }

        public int a() {
            return this.g;
        }

        public static v a(int $$0) {
            return f.apply($$0);
        }

        public static v a(jd<dxo> $$0) {
            return $$0.a(bdo.ao) ? b : a;
        }

        private static /* synthetic */ v[] b() {
            return new v[]{a, b};
        }

        static {
            i = cvo$v.b();
            c = a;
            d = bhh.a(v::values);
            f = beu.a(v::a, cvo$v.values(), beu.a.a);
            e = aam.a(f, v::a);
        }
    }

    class g
    extends coh {
        public g() {
            super(cvo.this);
        }

        @Override
        public void d() {
            super.d();
            cvo.this.hh();
        }

        @Override
        public boolean b() {
            return cvo.this.by() && cvo.this.b(bdv.a) > 0.25 || cvo.this.bN();
        }
    }

    class b
    extends cop {
        int a;

        public b() {
            this.a(EnumSet.of(cop.a.b, cop.a.c, cop.a.a));
        }

        @Override
        public boolean b() {
            return cvo.this.gR();
        }

        @Override
        public boolean c() {
            return this.b() && this.a > 0;
        }

        @Override
        public void d() {
            this.a = this.a(40);
        }

        @Override
        public void e() {
            cvo.this.B(false);
        }

        @Override
        public void a() {
            --this.a;
        }
    }

    class n
    extends cpi {
        public n(double $$0) {
            super(cvo.this, $$0);
        }

        @Override
        public boolean h() {
            return !cvo.this.hf() && super.h();
        }
    }

    class e
    extends cnz {
        public e(cvo cvo2, double $$0) {
            super(cvo2, $$0);
        }

        @Override
        public void d() {
            ((cvo)this.a).hh();
            ((cvo)this.c).hh();
            super.d();
        }

        @Override
        protected void g() {
            cvo $$0 = (cvo)this.a.a(this.b, (cfy)this.c);
            if ($$0 == null) {
                return;
            }
            axg $$1 = this.a.ha();
            axg $$2 = this.c.ha();
            axg $$3 = $$1;
            if ($$1 != null) {
                $$0.i($$1);
            } else {
                $$3 = $$2;
            }
            if ($$2 != null && $$1 != $$2) {
                $$0.i($$2);
            }
            if ($$3 != null) {
                $$3.a(bdk.R);
                aj.p.a($$3, this.a, this.c, $$0);
            }
            this.a.d_(6000);
            this.c.d_(6000);
            this.a.hc();
            this.c.hc();
            $$0.d_(-24000);
            $$0.b(this.a.dP(), this.a.dR(), this.a.dV(), 0.0f, 0.0f);
            this.b.a_($$0);
            this.b.a((cgk)this.a, (byte)18);
            if (this.b.U().a(eua.D).booleanValue()) {
                this.b.b(new cgz(this.b, this.a.dP(), this.a.dR(), this.a.dV(), this.a.ep().a(7) + 1));
            }
        }
    }

    class u
    extends cop {
        public u() {
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            if (cvo.this.gr()) {
                return false;
            }
            chl $$0 = cvo.this.ag_();
            return $$0 != null && $$0.cb() && cJ.test($$0) && cvo.this.g((cgk)$$0) > 36.0 && !cvo.this.cz() && !cvo.this.gU() && !cvo.this.bM;
        }

        @Override
        public void d() {
            cvo.this.x(false);
            cvo.this.B(false);
        }

        @Override
        public void e() {
            chl $$0 = cvo.this.ag_();
            if ($$0 != null && cvo.a(cvo.this, $$0)) {
                cvo.this.A(true);
                cvo.this.z(true);
                cvo.this.N().n();
                cvo.this.J().a($$0, (float)cvo.this.ae(), (float)cvo.this.ac());
            } else {
                cvo.this.A(false);
                cvo.this.z(false);
            }
        }

        @Override
        public void a() {
            chl $$0 = cvo.this.ag_();
            if ($$0 == null) {
                return;
            }
            cvo.this.J().a($$0, (float)cvo.this.ae(), (float)cvo.this.ac());
            if (cvo.this.g((cgk)$$0) <= 36.0) {
                cvo.this.A(true);
                cvo.this.z(true);
                cvo.this.N().n();
            } else {
                cvo.this.N().a((cgk)$$0, 1.5);
            }
        }
    }

    public class o
    extends cot {
        @Override
        public boolean b() {
            if (!cvo.this.gT()) {
                return false;
            }
            chl $$0 = cvo.this.ag_();
            if ($$0 == null || !$$0.cb()) {
                return false;
            }
            if ($$0.dh() != $$0.dg()) {
                return false;
            }
            boolean $$1 = cvo.a(cvo.this, $$0);
            if (!$$1) {
                cvo.this.N().a((cgk)$$0, 0);
                cvo.this.z(false);
                cvo.this.A(false);
            }
            return $$1;
        }

        @Override
        public boolean c() {
            chl $$0 = cvo.this.ag_();
            if ($$0 == null || !$$0.cb()) {
                return false;
            }
            double $$1 = cvo.this.dN().h;
            return !($$1 * $$1 < (double)0.05f && Math.abs(cvo.this.ee()) < 15.0f && cvo.this.aV() || cvo.this.gR());
        }

        @Override
        public boolean W_() {
            return false;
        }

        @Override
        public void d() {
            cvo.this.t(true);
            cvo.this.y(true);
            cvo.this.A(false);
            chl $$0 = cvo.this.ag_();
            if ($$0 != null) {
                cvo.this.J().a($$0, 60.0f, 30.0f);
                ftm $$1 = new ftm($$0.dP() - cvo.this.dP(), $$0.dR() - cvo.this.dR(), $$0.dV() - cvo.this.dV()).d();
                cvo.this.k(cvo.this.dN().b($$1.g * 0.8, 0.9, $$1.i * 0.8));
            }
            cvo.this.N().n();
        }

        @Override
        public void e() {
            cvo.this.z(false);
            cvo.this.cY = 0.0f;
            cvo.this.cZ = 0.0f;
            cvo.this.A(false);
            cvo.this.y(false);
        }

        @Override
        public void a() {
            chl $$0 = cvo.this.ag_();
            if ($$0 != null) {
                cvo.this.J().a($$0, 60.0f, 30.0f);
            }
            if (!cvo.this.gR()) {
                ftm $$1 = cvo.this.dN();
                if ($$1.h * $$1.h < (double)0.03f && cvo.this.ee() != 0.0f) {
                    cvo.this.w(bgj.i(0.2f, cvo.this.ee(), 0.0f));
                } else {
                    double $$2 = $$1.i();
                    double $$3 = Math.signum(-$$1.h) * Math.acos($$2 / $$1.g()) * 57.2957763671875;
                    cvo.this.w((float)$$3);
                }
            }
            if ($$0 != null && cvo.this.f((cgk)$$0) <= 2.0f) {
                cvo.this.c(o.a(cvo.this.ao()), (cgk)$$0);
            } else if (cvo.this.ee() > 0.0f && cvo.this.aV() && (float)cvo.this.dN().h != 0.0f && cvo.this.ao().a_(cvo.this.dK()).a(dzs.ep)) {
                cvo.this.w(60.0f);
                cvo.this.g((chl)null);
                cvo.this.B(true);
            }
        }
    }

    class s
    extends cog {
        private int c;

        public s(double $$0) {
            super(cvo.this, $$0);
            this.c = cvo$s.b(100);
        }

        @Override
        public boolean b() {
            if (cvo.this.gr() || this.a.ag_() != null) {
                return false;
            }
            if (cvo.this.ao().an() && cvo.this.ao().k(this.a.dK())) {
                return this.h();
            }
            if (this.c > 0) {
                --this.c;
                return false;
            }
            this.c = 100;
            is $$0 = this.a.dK();
            return cvo.this.ao().ag() && cvo.this.ao().k($$0) && !((axf)cvo.this.ao()).e($$0) && this.h();
        }

        @Override
        public void d() {
            cvo.this.hh();
            super.d();
        }
    }

    class l
    extends coz {
        public l(double $$0, boolean $$1) {
            super(cvo.this, $$0, $$1);
        }

        @Override
        protected void a(chl $$0) {
            if (this.b($$0)) {
                this.h();
                this.a.c(l.a(this.a), (cgk)$$0);
                cvo.this.a(bda.kV, 1.0f, 1.0f);
            }
        }

        @Override
        public void d() {
            cvo.this.A(false);
            super.d();
        }

        @Override
        public boolean b() {
            return !cvo.this.gQ() && !cvo.this.gr() && !cvo.this.cz() && !cvo.this.gR() && super.b();
        }
    }

    class t
    extends d {
        private static final int c = cvo$t.b(140);
        private int d;

        public t() {
            this.d = cvo.this.as.a(c);
            this.a(EnumSet.of(cop.a.a, cop.a.b, cop.a.c));
        }

        @Override
        public boolean b() {
            if (cvo.this.bN != 0.0f || cvo.this.bO != 0.0f || cvo.this.bP != 0.0f) {
                return false;
            }
            return this.k() || cvo.this.gr();
        }

        @Override
        public boolean c() {
            return this.k();
        }

        private boolean k() {
            if (this.d > 0) {
                --this.d;
                return false;
            }
            return cvo.this.ao().ag() && this.h() && !this.i() && !cvo.this.aJ;
        }

        @Override
        public void e() {
            this.d = cvo.this.as.a(c);
            cvo.this.hh();
        }

        @Override
        public void d() {
            cvo.this.x(false);
            cvo.this.z(false);
            cvo.this.A(false);
            cvo.this.t(false);
            cvo.this.D(true);
            cvo.this.N().n();
            cvo.this.K().a(cvo.this.dP(), cvo.this.dR(), cvo.this.dV(), 0.0);
        }
    }

    static class h
    extends coo {
        private final cvo d;

        public h(cvo $$0, double $$1) {
            super($$0, $$1);
            this.d = $$0;
        }

        @Override
        public boolean b() {
            return !this.d.hf() && super.b();
        }

        @Override
        public boolean c() {
            return !this.d.hf() && super.c();
        }

        @Override
        public void d() {
            this.d.hh();
            super.d();
        }
    }

    class q
    extends cpw {
        public q(int $$0, int $$1) {
            super(cvo.this, $$1);
        }

        @Override
        public void d() {
            cvo.this.hh();
            super.d();
        }

        @Override
        public boolean b() {
            return super.b() && this.h();
        }

        @Override
        public boolean c() {
            return super.c() && this.h();
        }

        private boolean h() {
            return !cvo.this.gr() && !cvo.this.gQ() && !cvo.this.hf() && cvo.this.ag_() == null;
        }
    }

    public class f
    extends cpc {
        private static final int i = 40;
        protected int g;

        public f(double $$1, int $$2, int $$3) {
            super(cvo.this, $$1, $$2, $$3);
        }

        @Override
        public double i() {
            return 2.0;
        }

        @Override
        public boolean l() {
            return this.d % 100 == 0;
        }

        @Override
        protected boolean a(dwr $$0, is $$1) {
            eoh $$2 = $$0.a_($$1);
            return $$2.a(dzs.pg) && $$2.c(eii.c) >= 2 || eao.j_($$2);
        }

        @Override
        public void a() {
            if (this.m()) {
                if (this.g >= 40) {
                    this.o();
                } else {
                    ++this.g;
                }
            } else if (!this.m() && cvo.this.as.i() < 0.05f) {
                cvo.this.a(bda.lb, 1.0f, 1.0f);
            }
            super.a();
        }

        protected void o() {
            if (!cvo$f.a(cvo.this.ao()).U().a(eua.F).booleanValue()) {
                return;
            }
            eoh $$0 = cvo.this.ao().a_(this.e);
            if ($$0.a(dzs.pg)) {
                this.b($$0);
            } else if (eao.j_($$0)) {
                this.a($$0);
            }
        }

        private void a(eoh $$0) {
            eao.a(cvo.this, $$0, cvo.this.ao(), this.e);
        }

        private void b(eoh $$0) {
            int $$1 = $$0.c(eii.c);
            $$0.b(eii.c, 1);
            int $$2 = 1 + cvo.this.ao().y.a(2) + ($$1 == 3 ? 1 : 0);
            dlt $$3 = cvo.this.a(cgv.a);
            if ($$3.f()) {
                cvo.this.a(cgv.a, new dlt(dlx.za));
                --$$2;
            }
            if ($$2 > 0) {
                dzq.a(cvo.this.ao(), this.e, new dlt(dlx.za, $$2));
            }
            cvo.this.a(bda.CK, 1.0f, 1.0f);
            cvo.this.ao().a(this.e, (eoh)$$0.b(eii.c, 1), 2);
            cvo.this.ao().a(etk.c, this.e, etk.a.a(cvo.this));
        }

        @Override
        public boolean b() {
            return !cvo.this.gr() && super.b();
        }

        @Override
        public void d() {
            this.g = 0;
            cvo.this.x(false);
            super.d();
        }
    }

    class p
    extends cop {
        public p() {
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            if (!cvo.this.a(cgv.a).f()) {
                return false;
            }
            if (cvo.this.ag_() != null || cvo.this.eK() != null) {
                return false;
            }
            if (!cvo.this.hi()) {
                return false;
            }
            if (cvo.this.ep().a(p.b(10)) != 0) {
                return false;
            }
            List<czl> $$0 = cvo.this.ao().a(czl.class, cvo.this.dj().c(8.0, 8.0, 8.0), cH);
            return !$$0.isEmpty() && cvo.this.a(cgv.a).f();
        }

        @Override
        public void a() {
            List<czl> $$0 = cvo.this.ao().a(czl.class, cvo.this.dj().c(8.0, 8.0, 8.0), cH);
            dlt $$1 = cvo.this.a(cgv.a);
            if ($$1.f() && !$$0.isEmpty()) {
                cvo.this.N().a((cgk)$$0.get(0), (double)1.2f);
            }
        }

        @Override
        public void d() {
            List<czl> $$0 = cvo.this.ao().a(czl.class, cvo.this.dj().c(8.0, 8.0, 8.0), cH);
            if (!$$0.isEmpty()) {
                cvo.this.N().a((cgk)$$0.get(0), (double)1.2f);
            }
        }
    }

    class j
    extends cox {
        public j(chn $$0, Class<? extends chl> $$1, float $$2) {
            super($$0, $$1, $$2);
        }

        @Override
        public boolean b() {
            return super.b() && !cvo.this.gR() && !cvo.this.gU();
        }

        @Override
        public boolean c() {
            return super.c() && !cvo.this.gR() && !cvo.this.gU();
        }
    }

    class r
    extends d {
        private double c;
        private double d;
        private int e;
        private int f;

        public r() {
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            return cvo.this.eK() == null && cvo.this.ep().i() < 0.02f && !cvo.this.gr() && cvo.this.ag_() == null && cvo.this.N().l() && !this.i() && !cvo.this.gS() && !cvo.this.cz();
        }

        @Override
        public boolean c() {
            return this.f > 0;
        }

        @Override
        public void d() {
            this.k();
            this.f = 2 + cvo.this.ep().a(3);
            cvo.this.x(true);
            cvo.this.N().n();
        }

        @Override
        public void e() {
            cvo.this.x(false);
        }

        @Override
        public void a() {
            --this.e;
            if (this.e <= 0) {
                --this.f;
                this.k();
            }
            cvo.this.J().a(cvo.this.dP() + this.c, cvo.this.dT(), cvo.this.dV() + this.d, cvo.this.ae(), cvo.this.ac());
        }

        private void k() {
            double $$0 = Math.PI * 2 * cvo.this.ep().j();
            this.c = Math.cos($$0);
            this.d = Math.sin($$0);
            this.e = this.a(80 + cvo.this.ep().a(20));
        }
    }

    class a
    extends cqj<chl> {
        private @Nullable chl j;
        private @Nullable chl k;
        private int l;

        public a(Class<chl> $$0, boolean $$1, @Nullable boolean $$2, csk.a $$3) {
            super(cvo.this, $$0, 10, $$1, $$2, $$3);
        }

        @Override
        public boolean b() {
            if (this.b > 0 && this.e.ep().a(this.b) != 0) {
                return false;
            }
            axf $$0 = cvo$a.a(cvo.this.ao());
            for (cgr<chl> $$1 : cvo.this.hd().toList()) {
                chl $$2 = $$1.a($$0, chl.class);
                if ($$2 == null) continue;
                this.k = $$2;
                this.j = $$2.eK();
                int $$3 = $$2.eM();
                return $$3 != this.l && this.a(this.j, this.d);
            }
            return false;
        }

        @Override
        public void d() {
            this.a(this.j);
            this.c = this.j;
            if (this.k != null) {
                this.l = this.k.eM();
            }
            cvo.this.a(bda.kT, 1.0f, 1.0f);
            cvo.this.C(true);
            cvo.this.hg();
            super.d();
        }
    }

    public static class i
    extends cfy.a {
        public final v a;

        public i(v $$0) {
            super(false);
            this.a = $$0;
        }
    }

    abstract class d
    extends cop {
        private final csk b;

        d() {
            this.b = csk.a().a(12.0).d().a(new c());
        }

        protected boolean h() {
            is $$0 = is.a(cvo.this.dP(), cvo.this.dj().e, cvo.this.dV());
            return !cvo.this.ao().k($$0) && cvo.this.c($$0) >= 0.0f;
        }

        protected boolean i() {
            return !cvo$d.a(cvo.this.ao()).a(chl.class, this.b, cvo.this, cvo.this.dj().c(12.0, 6.0, 12.0)).isEmpty();
        }
    }

    public class c
    implements csk.a {
        @Override
        public boolean test(chl $$0, axf $$1) {
            ddm $$2;
            if ($$0 instanceof cvo) {
                return false;
            }
            if ($$0 instanceof cuc || $$0 instanceof cxh || $$0 instanceof czz) {
                return true;
            }
            if ($$0 instanceof cii) {
                return !((cii)$$0).p();
            }
            if ($$0 instanceof ddm && (($$2 = (ddm)$$0).au() || $$2.ha())) {
                return false;
            }
            if (cvo.this.j($$0)) {
                return false;
            }
            return !$$0.gr() && !$$0.cx();
        }
    }
}

