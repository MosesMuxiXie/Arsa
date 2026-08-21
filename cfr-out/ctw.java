/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ctw
extends cth
implements chq,
ctj {
    public static final float cv = 120.32113f;
    public static final int cw = bgj.d(1.4959966f);
    private static final alw<Byte> cG = ama.a(ctw.class, aly.a);
    private static final alw<Long> cH = ama.a(ctw.class, aly.c);
    private static final int cI = 2;
    private static final int cJ = 4;
    private static final int cK = 8;
    private static final int cL = 1200;
    private static final int cM = 600;
    private static final int cN = 3600;
    private static final int cO = 4;
    private static final int cP = 10;
    private static final int cQ = 10;
    private static final int cR = 18;
    private static final int cU = 48;
    private static final int cV = 2;
    private static final int cW = 24;
    private static final int cX = 16;
    private static final int cY = 16;
    private static final int cZ = 20;
    public static final String cx = "CropsGrownSincePollination";
    public static final String cz = "CannotEnterHiveTicks";
    public static final String cA = "TicksSincePollination";
    public static final String cB = "HasStung";
    public static final String cC = "HasNectar";
    public static final String cD = "flower_pos";
    public static final String cE = "hive_pos";
    public static final boolean cF = false;
    private static final boolean da = false;
    private static final int db = 0;
    private static final int dc = 0;
    private static final int dd = 0;
    private static final ccn de = bhn.a(20, 39);
    private @Nullable cgr<chl> df;
    private float dg;
    private float dh;
    private int di;
    int dj = 0;
    private int dk = 0;
    private int dl = 0;
    private static final int dm = 200;
    int dn;
    private static final int do = 200;
    private static final int dp = 20;
    private static final int dq = 60;
    int dr = bgj.a(this.as, 20, 60);
    @Nullable is ds;
    @Nullable is dt;
    k du;
    e dv;
    private f dw;
    private int dx;

    public ctw(cgu<? extends ctw> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.cp = new cnn(this, 20, true);
        this.co = new j(this);
        this.a(fls.n, -1.0f);
        this.a(fls.j, -1.0f);
        this.a(fls.k, 16.0f);
        this.a(fls.x, -1.0f);
        this.a(fls.h, -1.0f);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cG, (byte)0);
        $$0.a(cH, -1L);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if ($$1.a_($$0).l()) {
            return 10.0f;
        }
        return 0.0f;
    }

    @Override
    protected void D() {
        this.cs.a(0, new b(this, 1.4f, true));
        this.cs.a(1, new d());
        this.cs.a(2, new cnz(this, 1.0));
        this.cs.a(3, new cpy(this, 1.25, $$0 -> $$0.a(bdy.ar), false));
        this.cs.a(3, new n());
        this.cs.a(3, new m());
        this.du = new k();
        this.cs.a(4, this.du);
        this.cs.a(5, new coo(this, 1.25));
        this.cs.a(5, new i());
        this.dv = new e();
        this.cs.a(5, this.dv);
        this.dw = new f();
        this.cs.a(6, this.dw);
        this.cs.a(7, new g());
        this.cs.a(8, new l());
        this.cs.a(9, new coh(this));
        this.ct.a(1, new h(this).a(new Class[0]));
        this.ct.a(2, new c(this));
        this.ct.a(3, new cqp<ctw>(this, true));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.b(cE, is.a, this.dt);
        $$0.b(cD, is.a, this.ds);
        $$0.a(cC, this.hd());
        $$0.a(cB, this.he());
        $$0.a(cA, this.dj);
        $$0.a(cz, this.dk);
        $$0.a(cx, this.dl);
        this.b_($$0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a(cC, false));
        this.y($$0.a(cB, false));
        this.dj = $$0.a(cA, 0);
        this.dk = $$0.a(cz, 0);
        this.dl = $$0.a(cx, 0);
        this.dt = $$0.a(cE, is.a).orElse(null);
        this.ds = $$0.a(cD, is.a).orElse(null);
        this.a(this.ao(), $$0);
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        cex $$2 = this.en().a(this);
        boolean $$3 = $$1.a($$0, $$2, (float)((int)this.i(cis.d)));
        if ($$3) {
            dsq.a($$0, $$1, $$2);
            if ($$1 instanceof chl) {
                chl $$4 = (chl)$$1;
                $$4.p($$4.ft() + 1);
                int $$5 = 0;
                if (this.ao().av() == ccz.c) {
                    $$5 = 10;
                } else if (this.ao().av() == ccz.d) {
                    $$5 = 18;
                }
                if ($$5 > 0) {
                    $$4.b(new cfm(cfo.s, $$5 * 20, 0), (cgk)this);
                }
            }
            this.y(true);
            this.i();
            this.a(bda.ce, 1.0f, 1.0f);
        }
        return $$3;
    }

    @Override
    public void g() {
        super.g();
        if (this.hd() && this.hn() < 10 && this.as.i() < 0.05f) {
            for (int $$0 = 0; $$0 < this.as.a(2) + 1; ++$$0) {
                this.a(this.ao(), this.dP() - (double)0.3f, this.dP() + (double)0.3f, this.dV() - (double)0.3f, this.dV() + (double)0.3f, this.f(0.5), ly.aC);
            }
        }
        this.hl();
    }

    private void a(dwo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lw $$6) {
        $$0.a($$6, bgj.d($$0.y.j(), $$1, $$2), $$5, bgj.d($$0.y.j(), $$3, $$4), 0.0, 0.0, 0.0);
    }

    void j(is $$0) {
        ftm $$8;
        ftm $$1 = ftm.c($$0);
        int $$2 = 0;
        is $$3 = this.dK();
        int $$4 = (int)$$1.h - $$3.v();
        if ($$4 > 2) {
            $$2 = 4;
        } else if ($$4 < -2) {
            $$2 = -4;
        }
        int $$5 = 6;
        int $$6 = 8;
        int $$7 = $$3.k($$0);
        if ($$7 < 15) {
            $$5 = $$7 / 2;
            $$6 = $$7 / 2;
        }
        if (($$8 = csn.a(this, $$5, $$6, $$2, $$1, 0.3141592741012573)) == null) {
            return;
        }
        this.cr.b(0.5f);
        this.cr.a($$8.g, $$8.h, $$8.i, 1.0);
    }

    public @Nullable is p() {
        return this.ds;
    }

    public boolean gP() {
        return this.ds != null;
    }

    public void h(is $$0) {
        this.ds = $$0;
    }

    @bht
    public int gQ() {
        return Math.max(this.dv.d, this.dw.d);
    }

    @bht
    public List<is> gR() {
        return this.dv.f;
    }

    private boolean hh() {
        return this.dj > 3600;
    }

    void hi() {
        this.dt = null;
        this.dn = 200;
    }

    void hj() {
        this.ds = null;
        this.dr = bgj.a(this.as, 20, 60);
    }

    boolean hk() {
        if (this.dk > 0 || this.du.l() || this.he() || this.ag_() != null) {
            return false;
        }
        boolean $$0 = this.hd() || this.hh() || this.ao().c().a(ceg.O, this.dI()) != false;
        return $$0 && !this.hm();
    }

    public void s(int $$0) {
        this.dk = $$0;
    }

    public float L(float $$0) {
        return bgj.h($$0, this.dh, this.dg);
    }

    private void hl() {
        this.dh = this.dg;
        this.dg = this.hs() ? Math.min(1.0f, this.dg + 0.2f) : Math.max(0.0f, this.dg - 0.24f);
    }

    @Override
    protected void a(axf $$0) {
        boolean $$1 = this.he();
        this.dx = this.by() ? ++this.dx : 0;
        if (this.dx > 20) {
            this.a($$0, this.en().i(), 1.0f);
        }
        if ($$1) {
            ++this.di;
            if (this.di % 5 == 0 && this.as.a(bgj.a(1200 - this.di, 1, 1200)) == 0) {
                this.a($$0, this.en().p(), this.eZ());
            }
        }
        if (!this.hd()) {
            ++this.dj;
        }
        this.a($$0, false);
    }

    public void gS() {
        this.dj = 0;
    }

    private boolean hm() {
        eky $$0 = this.hq();
        return $$0 != null && $$0.a();
    }

    @Override
    public long a() {
        return this.az.a(cH);
    }

    @Override
    public void b(long $$0) {
        this.az.a(cH, $$0);
    }

    @Override
    public @Nullable cgr<chl> b() {
        return this.df;
    }

    @Override
    public void a(@Nullable cgr<chl> $$0) {
        this.df = $$0;
    }

    @Override
    public void c() {
        this.a(de.a(this.as));
    }

    private boolean k(is $$0) {
        elb $$1 = this.ao().c_($$0);
        if ($$1 instanceof eky) {
            return !((eky)$$1).d();
        }
        return false;
    }

    @bht
    public boolean gT() {
        return this.dt != null;
    }

    @bht
    public @Nullable is gU() {
        return this.dt;
    }

    @bht
    public coq gV() {
        return this.cs;
    }

    int hn() {
        return this.dl;
    }

    private void ho() {
        this.dl = 0;
    }

    void hp() {
        ++this.dl;
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.ao().B_()) {
            if (this.dk > 0) {
                --this.dk;
            }
            if (this.dn > 0) {
                --this.dn;
            }
            if (this.dr > 0) {
                --this.dr;
            }
            boolean $$0 = this.ab_() && !this.he() && this.ag_() != null && this.ag_().g(this) < 4.0;
            this.z($$0);
            if (this.at % 20 == 0 && !this.hr()) {
                this.dt = null;
            }
        }
    }

    @Nullable eky hq() {
        if (this.dt == null) {
            return null;
        }
        if (this.l(this.dt)) {
            return null;
        }
        return this.ao().a(this.dt, eld.I).orElse(null);
    }

    boolean hr() {
        return this.hq() != null;
    }

    public boolean hd() {
        return this.t(8);
    }

    void x(boolean $$0) {
        if ($$0) {
            this.gS();
        }
        this.d(8, $$0);
    }

    public boolean he() {
        return this.t(4);
    }

    private void y(boolean $$0) {
        this.d(4, $$0);
    }

    private boolean hs() {
        return this.t(2);
    }

    private void z(boolean $$0) {
        this.d(2, $$0);
    }

    boolean l(is $$0) {
        return !this.b($$0, 48);
    }

    private void d(int $$0, boolean $$1) {
        if ($$1) {
            this.az.a(cG, (byte)(this.az.a(cG) | $$0));
        } else {
            this.az.a(cG, (byte)(this.az.a(cG) & ~$$0));
        }
    }

    private boolean t(int $$0) {
        return (this.az.a(cG) & $$0) != 0;
    }

    public static cir.a hf() {
        return cth.gW().a(cis.u, 10.0).a(cis.n, 0.6f).a(cis.x, 0.3f).a(cis.d, 2.0);
    }

    @Override
    protected cre b(dwo $$0) {
        crc $$1 = new crc(this, $$0){

            @Override
            public boolean a(is $$0) {
                return !this.b.a_($$0.e()).l();
            }

            @Override
            public void d() {
                if (ctw.this.du.l()) {
                    return;
                }
                super.d();
            }
        };
        $$1.e(false);
        $$1.a(false);
        $$1.a(48.0f);
        return $$1;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        ecy $$4;
        cfm $$5;
        dkb $$3;
        dgw dgw2;
        dlt $$2 = $$0.b($$1);
        if (this.j($$2) && (dgw2 = $$2.h()) instanceof dkb && (dgw2 = ($$3 = (dkb)dgw2).c()) instanceof ecy && ($$5 = ($$4 = (ecy)dgw2).b()) != null) {
            this.a($$0, $$1, $$2);
            if (!this.ao().B_()) {
                this.a($$5);
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.ar);
    }

    @Override
    protected void b(is $$0, eoh $$1) {
    }

    @Override
    protected bcz W() {
        return null;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.cb;
    }

    @Override
    protected bcz fd() {
        return bda.ca;
    }

    @Override
    protected float fC() {
        return 0.4f;
    }

    public @Nullable ctw b(axf $$0, cfy $$1) {
        return cgu.n.a($$0, cgt.e);
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
    }

    @Override
    public boolean bp() {
        return this.d() && this.at % cw == 0;
    }

    @Override
    public boolean d() {
        return !this.aV();
    }

    public void hg() {
        this.x(false);
        this.ho();
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.a($$0, $$1)) {
            return false;
        }
        this.du.m();
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void c(bef<fla> $$0) {
        this.k(this.dN().b(0.0, 0.01, 0.0));
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.5f * this.dk(), this.dF() * 0.2f);
    }

    boolean b(is $$0, int $$1) {
        return $$0.a(this.dK(), (double)$$1);
    }

    public void i(is $$0) {
        this.dt = $$0;
    }

    public static boolean c(eoh $$0) {
        if ($$0.a(bdp.ar)) {
            if ($$0.a(eox.I, false).booleanValue()) {
                return false;
            }
            if ($$0.a(dzs.jv)) {
                return $$0.c(ecb.b) == epd.a;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(axf $$0, bxh.a $$1) {
        super.a($$0, $$1);
        $$1.a(bxf.b, () -> new bwt(Optional.ofNullable(this.gU()), Optional.ofNullable(this.p()), this.gQ(), this.gR()));
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    class j
    extends cnp {
        j(chn $$0) {
            super($$0);
        }

        @Override
        public void a() {
            if (ctw.this.ab_()) {
                return;
            }
            super.a();
        }

        @Override
        protected boolean c() {
            return !ctw.this.du.l();
        }
    }

    class b
    extends coz {
        b(cht $$0, double $$1, boolean $$2) {
            super($$0, $$1, $$2);
        }

        @Override
        public boolean b() {
            return super.b() && ctw.this.ab_() && !ctw.this.he();
        }

        @Override
        public boolean c() {
            return super.c() && ctw.this.ab_() && !ctw.this.he();
        }
    }

    class d
    extends a {
        d() {
        }

        @Override
        public boolean h() {
            eky $$0;
            if (ctw.this.dt != null && ctw.this.hk() && ctw.this.dt.a(ctw.this.dI(), 2.0) && ($$0 = ctw.this.hq()) != null) {
                if ($$0.d()) {
                    ctw.this.dt = null;
                } else {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean i() {
            return false;
        }

        @Override
        public void d() {
            eky $$0 = ctw.this.hq();
            if ($$0 != null) {
                $$0.a(ctw.this);
            }
        }
    }

    class n
    extends a {
        private final int c;
        private long d;

        n() {
            this.c = bgj.a(ctw.this.as, 20, 40);
            this.d = -1L;
        }

        @Override
        public void d() {
            if (ctw.this.dt != null && ctw.this.ao().t(ctw.this.dt) && !ctw.this.hr()) {
                ctw.this.hi();
            }
            this.d = ctw.this.ao().au();
        }

        @Override
        public boolean h() {
            return ctw.this.ao().au() > this.d + (long)this.c;
        }

        @Override
        public boolean i() {
            return false;
        }
    }

    class m
    extends a {
        private final int c;
        private long d;

        m() {
            this.c = bgj.a(ctw.this.as, 20, 40);
            this.d = -1L;
        }

        @Override
        public void d() {
            if (ctw.this.ds != null && ctw.this.ao().t(ctw.this.ds) && !this.a(ctw.this.ds)) {
                ctw.this.hj();
            }
            this.d = ctw.this.ao().au();
        }

        @Override
        public boolean h() {
            return ctw.this.ao().au() > this.d + (long)this.c;
        }

        @Override
        public boolean i() {
            return false;
        }

        private boolean a(is $$0) {
            return ctw.c(ctw.this.ao().a_($$0));
        }
    }

    class k
    extends a {
        private static final int c = 400;
        private static final double d = 0.1;
        private static final int e = 25;
        private static final float f = 0.35f;
        private static final float g = 0.6f;
        private static final float h = 0.33333334f;
        private static final int i = 5;
        private int j;
        private int k;
        private boolean l;
        private @Nullable ftm m;
        private int n;
        private static final int o = 600;
        private Long2LongOpenHashMap p;

        k() {
            this.p = new Long2LongOpenHashMap();
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean h() {
            if (ctw.this.dr > 0) {
                return false;
            }
            if (ctw.this.hd()) {
                return false;
            }
            if (ctw.this.ao().ao()) {
                return false;
            }
            Optional<is> $$0 = this.p();
            if ($$0.isPresent()) {
                ctw.this.ds = $$0.get();
                ctw.this.cr.a((double)ctw.this.ds.u() + 0.5, (double)ctw.this.ds.v() + 0.5, (double)ctw.this.ds.w() + 0.5, 1.2f);
                return true;
            }
            ctw.this.dr = bgj.a(ctw.this.as, 20, 60);
            return false;
        }

        @Override
        public boolean i() {
            if (!this.l) {
                return false;
            }
            if (!ctw.this.gP()) {
                return false;
            }
            if (ctw.this.ao().ao()) {
                return false;
            }
            if (this.k()) {
                return ctw.this.as.i() < 0.2f;
            }
            return true;
        }

        private boolean k() {
            return this.j > 400;
        }

        boolean l() {
            return this.l;
        }

        void m() {
            this.l = false;
        }

        @Override
        public void d() {
            this.j = 0;
            this.n = 0;
            this.k = 0;
            this.l = true;
            ctw.this.gS();
        }

        @Override
        public void e() {
            if (this.k()) {
                ctw.this.x(true);
            }
            this.l = false;
            ctw.this.cr.n();
            ctw.this.dr = 200;
        }

        @Override
        public boolean X_() {
            return true;
        }

        @Override
        public void a() {
            if (!ctw.this.gP()) {
                return;
            }
            ++this.n;
            if (this.n > 600) {
                ctw.this.hj();
                this.l = false;
                ctw.this.dr = 200;
                return;
            }
            ftm $$0 = ftm.c(ctw.this.ds).b(0.0, 0.6f, 0.0);
            if ($$0.f(ctw.this.dI()) > 1.0) {
                this.m = $$0;
                this.n();
                return;
            }
            if (this.m == null) {
                this.m = $$0;
            }
            boolean $$1 = ctw.this.dI().f(this.m) <= 0.1;
            boolean $$2 = true;
            if (!$$1 && this.n > 600) {
                ctw.this.hj();
                return;
            }
            if ($$1) {
                boolean $$3;
                boolean bl2 = $$3 = ctw.this.as.a(25) == 0;
                if ($$3) {
                    this.m = new ftm($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                    ctw.this.cr.n();
                } else {
                    $$2 = false;
                }
                ctw.this.J().a($$0.a(), $$0.b(), $$0.c());
            }
            if ($$2) {
                this.n();
            }
            ++this.j;
            if (ctw.this.as.i() < 0.05f && this.j > this.k + 60) {
                this.k = this.j;
                ctw.this.a(bda.cf, 1.0f, 1.0f);
            }
        }

        private void n() {
            ctw.this.K().a(this.m.a(), this.m.b(), this.m.c(), 0.35f);
        }

        private float o() {
            return (ctw.this.as.i() * 2.0f - 1.0f) * 0.33333334f;
        }

        private Optional<is> p() {
            Iterable<is> $$0 = is.a(ctw.this.dK(), 5, 5, 5);
            Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();
            for (is $$2 : $$0) {
                long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
                if (ctw.this.ao().au() < $$3) {
                    $$1.put($$2.a(), $$3);
                    continue;
                }
                if (!ctw.c(ctw.this.ao().a_($$2))) continue;
                flp $$4 = ctw.this.cr.a($$2, 1);
                if ($$4 != null && $$4.j()) {
                    return Optional.of($$2);
                }
                $$1.put($$2.a(), ctw.this.ao().au() + 600L);
            }
            this.p = $$1;
            return Optional.empty();
        }
    }

    class i
    extends a {
        i() {
        }

        @Override
        public boolean h() {
            return ctw.this.dn == 0 && !ctw.this.gT() && ctw.this.hk();
        }

        @Override
        public boolean i() {
            return false;
        }

        @Override
        public void d() {
            ctw.this.dn = 200;
            List<is> $$0 = this.k();
            if ($$0.isEmpty()) {
                return;
            }
            for (is $$1 : $$0) {
                if (ctw.this.dv.b($$1)) continue;
                ctw.this.dt = $$1;
                return;
            }
            ctw.this.dv.k();
            ctw.this.dt = $$0.get(0);
        }

        private List<is> k() {
            is $$02 = ctw.this.dK();
            csx $$12 = ((axf)ctw.this.ao()).F();
            Stream<csy> $$2 = $$12.c($$0 -> $$0.a(bea.c), $$02, 20, csx.b.c);
            return $$2.map(csy::g).filter(ctw.this::k).sorted(Comparator.comparingDouble($$1 -> $$1.j($$02))).collect(Collectors.toList());
        }
    }

    @bht
    public class e
    extends a {
        public static final int b = 2400;
        int d;
        private static final int e = 3;
        final List<is> f;
        private @Nullable flp g;
        private static final int h = 60;
        private int i;

        e() {
            this.f = Lists.newArrayList();
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean h() {
            return ctw.this.dt != null && !ctw.this.l(ctw.this.dt) && !ctw.this.gF() && ctw.this.hk() && !this.d(ctw.this.dt) && ctw.this.ao().a_(ctw.this.dt).a(bdp.aU);
        }

        @Override
        public boolean i() {
            return this.h();
        }

        @Override
        public void d() {
            this.d = 0;
            this.i = 0;
            super.d();
        }

        @Override
        public void e() {
            this.d = 0;
            this.i = 0;
            ctw.this.cr.n();
            ctw.this.cr.g();
        }

        @Override
        public void a() {
            if (ctw.this.dt == null) {
                return;
            }
            ++this.d;
            if (this.d > this.a(2400)) {
                this.l();
                return;
            }
            if (ctw.this.cr.m()) {
                return;
            }
            if (ctw.this.b(ctw.this.dt, 16)) {
                boolean $$0 = this.a(ctw.this.dt);
                if (!$$0) {
                    this.l();
                } else if (this.g != null && ctw.this.cr.j().a(this.g)) {
                    ++this.i;
                    if (this.i > 60) {
                        ctw.this.hi();
                        this.i = 0;
                    }
                } else {
                    this.g = ctw.this.cr.j();
                }
                return;
            }
            if (ctw.this.l(ctw.this.dt)) {
                ctw.this.hi();
                return;
            }
            ctw.this.j(ctw.this.dt);
        }

        private boolean a(is $$0) {
            int $$1 = ctw.this.b($$0, 3) ? 1 : 2;
            ctw.this.cr.b(10.0f);
            ctw.this.cr.a($$0.u(), (double)$$0.v(), $$0.w(), $$1, 1.0);
            return ctw.this.cr.j() != null && ctw.this.cr.j().j();
        }

        boolean b(is $$0) {
            return this.f.contains($$0);
        }

        private void c(is $$0) {
            this.f.add($$0);
            while (this.f.size() > 3) {
                this.f.remove(0);
            }
        }

        void k() {
            this.f.clear();
        }

        private void l() {
            if (ctw.this.dt != null) {
                this.c(ctw.this.dt);
            }
            ctw.this.hi();
        }

        private boolean d(is $$0) {
            if (ctw.this.b($$0, 2)) {
                return true;
            }
            flp $$1 = ctw.this.cr.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
        }
    }

    public class f
    extends a {
        private static final int c = 2400;
        int d;

        f() {
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean h() {
            return ctw.this.ds != null && !ctw.this.gF() && this.k() && !ctw.this.b(ctw.this.ds, 2);
        }

        @Override
        public boolean i() {
            return this.h();
        }

        @Override
        public void d() {
            this.d = 0;
            super.d();
        }

        @Override
        public void e() {
            this.d = 0;
            ctw.this.cr.n();
            ctw.this.cr.g();
        }

        @Override
        public void a() {
            if (ctw.this.ds == null) {
                return;
            }
            ++this.d;
            if (this.d > this.a(2400)) {
                ctw.this.hj();
                return;
            }
            if (ctw.this.cr.m()) {
                return;
            }
            if (ctw.this.l(ctw.this.ds)) {
                ctw.this.hj();
                return;
            }
            ctw.this.j(ctw.this.ds);
        }

        private boolean k() {
            return ctw.this.dj > 600;
        }
    }

    class g
    extends a {
        static final int b = 30;

        g() {
        }

        @Override
        public boolean h() {
            if (ctw.this.hn() >= 10) {
                return false;
            }
            if (ctw.this.as.i() < 0.3f) {
                return false;
            }
            return ctw.this.hd() && ctw.this.hr();
        }

        @Override
        public boolean i() {
            return this.h();
        }

        @Override
        public void a() {
            if (ctw.this.as.a(this.a(30)) != 0) {
                return;
            }
            for (int $$0 = 1; $$0 <= 2; ++$$0) {
                dzt $$8;
                is $$1 = ctw.this.dK().c($$0);
                eoh $$2 = ctw.this.ao().a_($$1);
                dzq $$3 = $$2.b();
                eoh $$4 = null;
                if (!$$2.a(bdp.aW)) continue;
                if ($$3 instanceof ebp) {
                    ebp $$5 = (ebp)$$3;
                    if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                    }
                } else if ($$3 instanceof eib) {
                    int $$6 = $$2.c(eib.c);
                    if ($$6 < 7) {
                        $$4 = (eoh)$$2.b(eib.c, $$6 + 1);
                    }
                } else if ($$2.a(dzs.pg)) {
                    int $$7 = $$2.c(eii.c);
                    if ($$7 < 3) {
                        $$4 = (eoh)$$2.b(eii.c, $$7 + 1);
                    }
                } else if (($$2.a(dzs.tS) || $$2.a(dzs.tT)) && ($$8 = (dzt)((Object)$$2.b())).a(ctw.this.ao(), $$1, $$2)) {
                    $$8.a((axf)ctw.this.ao(), ctw.this.as, $$1, $$2);
                    $$4 = ctw.this.ao().a_($$1);
                }
                if ($$4 == null) continue;
                ctw.this.ao().c(2011, $$1, 15);
                ctw.this.ao().c($$1, $$4);
                ctw.this.hp();
            }
        }
    }

    class l
    extends cop {
        l() {
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            return ctw.this.cr.l() && ctw.this.as.a(10) == 0;
        }

        @Override
        public boolean c() {
            return ctw.this.cr.m();
        }

        @Override
        public void d() {
            ftm $$0 = this.h();
            if ($$0 != null) {
                ctw.this.cr.a(ctw.this.cr.a(is.a($$0), 1), 1.0);
            }
        }

        private @Nullable ftm h() {
            ftm $$2;
            if (ctw.this.hr() && !ctw.this.b(ctw.this.dt, this.i())) {
                ftm $$0 = ftm.b(ctw.this.dt);
                ftm $$1 = $$0.d(ctw.this.dI()).d();
            } else {
                $$2 = ctw.this.h(0.0f);
            }
            int $$3 = 8;
            ftm $$4 = csq.a(ctw.this, 8, 7, $$2.g, $$2.i, 1.5707964f, 3, 1);
            if ($$4 != null) {
                return $$4;
            }
            return csm.a(ctw.this, 8, 4, -2, $$2.g, $$2.i, 1.5707963705062866);
        }

        private int i() {
            int $$0 = ctw.this.gT() || ctw.this.gP() ? 24 : 16;
            return 48 - $$0;
        }
    }

    class h
    extends cqi {
        h(ctw $$0) {
            super($$0, new Class[0]);
        }

        @Override
        public boolean c() {
            return ctw.this.ab_() && super.c();
        }

        @Override
        protected void a(chn $$0, chl $$1) {
            if ($$0 instanceof ctw && this.e.G($$1)) {
                $$0.g($$1);
            }
        }
    }

    static class c
    extends cqj<ddm> {
        c(ctw $$0) {
            super($$0, ddm.class, 10, true, false, $$0::a);
        }

        @Override
        public boolean b() {
            return this.i() && super.b();
        }

        @Override
        public boolean c() {
            boolean $$0 = this.i();
            if (!$$0 || this.e.ag_() == null) {
                this.g = null;
                return false;
            }
            return super.c();
        }

        private boolean i() {
            ctw $$0 = (ctw)this.e;
            return $$0.ab_() && !$$0.he();
        }
    }

    abstract class a
    extends cop {
        a() {
        }

        public abstract boolean h();

        public abstract boolean i();

        @Override
        public boolean b() {
            return this.h() && !ctw.this.ab_();
        }

        @Override
        public boolean c() {
            return this.i() && !ctw.this.ab_();
        }
    }
}

