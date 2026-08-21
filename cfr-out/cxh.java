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
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class cxh
extends cth {
    public static final double cv = 0.6;
    public static final double cw = 0.8;
    public static final double cx = 1.0;
    public static final double cz = 2.2;
    public static final double cA = 1.4;
    private static final alw<Integer> cB = ama.a(cxh.class, aly.b);
    private static final int cC = 0;
    private static final amo cD = amo.b("killer_bunny");
    private static final int cE = 3;
    private static final int cF = 5;
    private static final amo cG = amo.b("evil");
    private static final int cH = 8;
    private static final int cI = 40;
    private int cJ;
    private int cK;
    private boolean cL;
    private int cM;
    int cN = 0;

    public cxh(cgu<? extends cxh> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
        this.cq = new c(this);
        this.cp = new d(this);
        this.k(0.0);
    }

    @Override
    protected void D() {
        this.cs.a(1, new coh(this));
        this.cs.a(1, new coc(this, this.ao()));
        this.cs.a(1, new e(this, 2.2));
        this.cs.a(2, new cnz(this, 0.8));
        this.cs.a(3, new cpy(this, 1.0, $$0 -> $$0.a(bdy.bb), false));
        this.cs.a(4, new a<ddm>(this, ddm.class, 8.0f, 2.2, 2.2));
        this.cs.a(4, new a<cxu>(this, cxu.class, 10.0f, 2.2, 2.2));
        this.cs.a(4, new a<czz>(this, czz.class, 4.0f, 2.2, 2.2));
        this.cs.a(5, new f(this));
        this.cs.a(6, new cqd(this, 0.6));
        this.cs.a(11, new cox(this, ddm.class, 10.0f));
    }

    @Override
    protected float fF() {
        flp $$1;
        float $$0 = 0.3f;
        if (this.cp.c() <= 0.6) {
            $$0 = 0.2f;
        }
        if (($$1 = this.cr.j()) != null && !$$1.c()) {
            ftm $$2 = $$1.a(this);
            if ($$2.h > this.dR() + 0.5) {
                $$0 = 0.5f;
            }
        }
        if (this.ad || this.bM && this.cp.e() > this.dR() + 0.5) {
            $$0 = 0.5f;
        }
        return super.A($$0 / 0.42f);
    }

    @Override
    public void u() {
        double $$1;
        super.u();
        double $$0 = this.cp.c();
        if ($$0 > 0.0 && ($$1 = this.dN().j()) < 0.01) {
            this.a(0.1f, new ftm(0.0, 0.0, 1.0));
        }
        if (!this.ao().B_()) {
            this.ao().a((cgk)this, (byte)1);
        }
    }

    public float L(float $$0) {
        if (this.cK == 0) {
            return 0.0f;
        }
        return ((float)this.cJ + $$0) / (float)this.cK;
    }

    public void k(double $$0) {
        this.N().a($$0);
        this.cp.a(this.cp.d(), this.cp.e(), this.cp.f(), $$0);
    }

    @Override
    public void t(boolean $$0) {
        super.t($$0);
        if ($$0) {
            this.a(this.gQ(), this.fC(), ((this.as.i() - this.as.i()) * 0.2f + 1.0f) * 0.8f);
        }
    }

    public void p() {
        this.t(true);
        this.cK = 10;
        this.cJ = 0;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cB, g.h.m);
    }

    @Override
    public void a(axf $$0) {
        if (this.cM > 0) {
            --this.cM;
        }
        if (this.cN > 0) {
            this.cN -= this.as.a(3);
            if (this.cN < 0) {
                this.cN = 0;
            }
        }
        if (this.aV()) {
            c $$2;
            chl $$1;
            if (!this.cL) {
                this.t(false);
                this.gV();
            }
            if (this.gR() == g.g && this.cM == 0 && ($$1 = this.ag_()) != null && this.g((cgk)$$1) < 16.0) {
                this.c($$1.dP(), $$1.dV());
                this.cp.a($$1.dP(), $$1.dR(), $$1.dV(), this.cp.c());
                this.p();
                this.cL = true;
            }
            if (!($$2 = (c)this.cq).c()) {
                if (this.cp.b() && this.cM == 0) {
                    flp $$3 = this.cr.j();
                    ftm $$4 = new ftm(this.cp.d(), this.cp.e(), this.cp.f());
                    if ($$3 != null && !$$3.c()) {
                        $$4 = $$3.a(this);
                    }
                    this.c($$4.g, $$4.i);
                    this.p();
                }
            } else if (!$$2.d()) {
                this.gS();
            }
        }
        this.cL = this.aV();
    }

    @Override
    public boolean bL() {
        return false;
    }

    private void c(double $$0, double $$1) {
        this.v((float)(bgj.d($$1 - this.dV(), $$0 - this.dP()) * 57.2957763671875) - 90.0f);
    }

    private void gS() {
        ((c)this.cq).a(true);
    }

    private void gT() {
        ((c)this.cq).a(false);
    }

    private void gU() {
        this.cM = this.cp.c() < 2.2 ? 10 : 1;
    }

    private void gV() {
        this.gU();
        this.gT();
    }

    @Override
    public void d_() {
        super.d_();
        if (this.cJ != this.cK) {
            ++this.cJ;
        } else if (this.cK != 0) {
            this.cJ = 0;
            this.cK = 0;
            this.t(false);
        }
    }

    public static cir.a gP() {
        return cth.gW().a(cis.u, 3.0).a(cis.x, 0.3f).a(cis.d, 3.0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("RabbitType", g.j, this.gR());
        $$0.a("MoreCarrotTicks", this.cN);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a($$0.a("RabbitType", g.j).orElse(g.h));
        this.cN = $$0.a("MoreCarrotTicks", 0);
    }

    protected bcz gQ() {
        return bda.xM;
    }

    @Override
    protected bcz W() {
        return bda.xI;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.xL;
    }

    @Override
    protected bcz fd() {
        return bda.xK;
    }

    @Override
    public void fN() {
        if (this.gR() == g.g) {
            this.a(bda.xJ, 1.0f, (this.as.i() - this.as.i()) * 0.2f + 1.0f);
        }
    }

    @Override
    public bdb dB() {
        return this.gR() == g.g ? bdb.f : bdb.g;
    }

    /*
     * Unable to fully structure code
     */
    public @Nullable cxh b(axf $$0, cfy $$1) {
        block2: {
            block3: {
                $$2 = cgu.bg.a($$0, cgt.e);
                if ($$2 == null) break block2;
                $$3 = cxh.a((dwp)$$0, this.dK());
                if (this.as.a(20) == 0) break block3;
                if (!($$1 instanceof cxh)) ** GOTO lbl-1000
                $$4 = (cxh)$$1;
                if (this.as.h()) {
                    $$3 = $$4.gR();
                } else lbl-1000:
                // 2 sources

                {
                    $$3 = this.gR();
                }
            }
            $$2.a($$3);
        }
        return $$2;
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.bb);
    }

    public g gR() {
        return g.a(this.az.a(cB));
    }

    private void a(g $$0) {
        if ($$0 == g.g) {
            this.h(cis.b).a(8.0);
            this.cs.a(4, new coz(this, 1.4, true));
            this.ct.a(1, new cqi(this, new Class[0]).a(new Class[0]));
            this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
            this.ct.a(2, new cqj<cxu>((chn)this, cxu.class, true));
            this.h(cis.d).a(new ciq(cG, 5.0, ciq.a.a));
            if (!this.i_()) {
                this.b(yh.c(bhs.a("entity", cD)));
            }
        } else {
            this.h(cis.d).c(cG);
        }
        this.az.a(cB, $$0.m);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aN) {
            return cxh.c($$0, this.gR());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aN);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aN) {
            this.a(cxh.c(ki.aN, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        g $$4 = cxh.a($$0, this.dK());
        if ($$3 instanceof b) {
            $$4 = ((b)$$3).a;
        } else {
            $$3 = new b($$4);
        }
        this.a($$4);
        return super.a($$0, $$1, $$2, $$3);
    }

    private static g a(dwp $$0, is $$1) {
        jd<dxo> $$2 = $$0.z($$1);
        int $$3 = $$0.G_().a(100);
        if ($$2.a(bdo.ai)) {
            return $$3 < 80 ? g.b : g.d;
        }
        if ($$2.a(bdo.ah)) {
            return g.e;
        }
        return $$3 < 50 ? g.a : ($$3 < 90 ? g.f : g.c);
    }

    public static boolean c(cgu<cxh> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.a_($$3.e()).a(bdp.cs) && cxh.a($$1, $$3);
    }

    boolean hd() {
        return this.cN <= 0;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 1) {
            this.bM();
            this.cK = 10;
            this.cJ = 0;
        } else {
            super.b($$0);
        }
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.6f * this.dk(), this.dF() * 0.4f);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    public static class c
    extends cno {
        private final cxh b;
        private boolean c;

        public c(cxh $$0) {
            super($$0);
            this.b = $$0;
        }

        public boolean c() {
            return this.a;
        }

        public boolean d() {
            return this.c;
        }

        public void a(boolean $$0) {
            this.c = $$0;
        }

        @Override
        public void b() {
            if (this.a) {
                this.b.p();
                this.a = false;
            }
        }
    }

    static class d
    extends cnq {
        private final cxh l;
        private double m;

        public d(cxh $$0) {
            super($$0);
            this.l = $$0;
        }

        @Override
        public void a() {
            if (this.l.aV() && !this.l.bM && !((c)this.l.cq).c()) {
                this.l.k(0.0);
            } else if (this.b() || this.k == cnq.a.d) {
                this.l.k(this.m);
            }
            super.a();
        }

        @Override
        public void a(double $$0, double $$1, double $$2, double $$3) {
            if (this.l.by()) {
                $$3 = 1.5;
            }
            super.a($$0, $$1, $$2, $$3);
            if ($$3 > 0.0) {
                this.m = $$3;
            }
        }
    }

    static class e
    extends cpi {
        private final cxh a;

        public e(cxh $$0, double $$1) {
            super($$0, $$1);
            this.a = $$0;
        }

        @Override
        public void a() {
            super.a();
            this.a.k(this.d);
        }
    }

    static class a<T extends chl>
    extends cnu<T> {
        private final cxh i;

        public a(cxh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
            super($$0, $$1, $$2, $$3, $$4);
            this.i = $$0;
        }

        @Override
        public boolean b() {
            return this.i.gR() != g.g && super.b();
        }
    }

    static class f
    extends cpc {
        private final cxh g;
        private boolean h;
        private boolean i;

        public f(cxh $$0) {
            super($$0, 0.7f, 16);
            this.g = $$0;
        }

        @Override
        public boolean b() {
            if (this.c <= 0) {
                if (!cxh$f.a(this.g).U().a(eua.F).booleanValue()) {
                    return false;
                }
                this.i = false;
                this.h = this.g.hd();
            }
            return super.b();
        }

        @Override
        public boolean c() {
            return this.i && super.c();
        }

        @Override
        public void a() {
            super.a();
            this.g.J().a((double)this.e.u() + 0.5, this.e.v() + 1, (double)this.e.w() + 0.5, 10.0f, this.g.ac());
            if (this.m()) {
                dwo $$0 = this.g.ao();
                is $$1 = this.e.d();
                eoh $$2 = $$0.a_($$1);
                dzq $$3 = $$2.b();
                if (this.i && $$3 instanceof eak) {
                    int $$4 = $$2.c(eak.f);
                    if ($$4 == 0) {
                        $$0.a($$1, dzs.a.m(), 2);
                        $$0.a($$1, true, this.g);
                    } else {
                        $$0.a($$1, (eoh)$$2.b(eak.f, $$4 - 1), 2);
                        $$0.a(etk.c, $$1, etk.a.a(this.g));
                        $$0.c(2001, $$1, dzq.j($$2));
                    }
                    this.g.cN = 40;
                }
                this.i = false;
                this.c = 10;
            }
        }

        @Override
        protected boolean a(dwr $$0, is $$1) {
            eoh $$2 = $$0.a_($$1);
            if ($$2.a(dzs.cZ) && this.h && !this.i && ($$2 = $$0.a_($$1.d())).b() instanceof eak && ((eak)$$2.b()).i($$2)) {
                this.i = true;
                return true;
            }
            return false;
        }
    }

    public static final class g
    extends Enum<g>
    implements bhh {
        public static final /* enum */ g a = new g(0, "brown");
        public static final /* enum */ g b = new g(1, "white");
        public static final /* enum */ g c = new g(2, "black");
        public static final /* enum */ g d = new g(3, "white_splotched");
        public static final /* enum */ g e = new g(4, "gold");
        public static final /* enum */ g f = new g(5, "salt");
        public static final /* enum */ g g = new g(99, "evil");
        public static final g h;
        private static final IntFunction<g> l;
        public static final Codec<g> i;
        @Deprecated
        public static final Codec<g> j;
        public static final aao<ByteBuf, g> k;
        final int m;
        private final String n;
        private static final /* synthetic */ g[] o;

        public static g[] values() {
            return (g[])o.clone();
        }

        public static g valueOf(String $$0) {
            return Enum.valueOf(g.class, $$0);
        }

        private g(int $$0, String $$1) {
            this.m = $$0;
            this.n = $$1;
        }

        @Override
        public String c() {
            return this.n;
        }

        public int a() {
            return this.m;
        }

        public static g a(int $$0) {
            return l.apply($$0);
        }

        private static /* synthetic */ g[] b() {
            return new g[]{a, b, c, d, e, f, g};
        }

        static {
            o = cxh$g.b();
            h = a;
            l = beu.a(g::a, cxh$g.values(), h);
            i = bhh.a(g::values);
            j = Codec.INT.xmap(l::apply, g::a);
            k = aam.a(l, g::a);
        }
    }

    public static class b
    extends cfy.a {
        public final g a;

        public b(g $$0) {
            super(1.0f);
            this.a = $$0;
        }
    }
}

