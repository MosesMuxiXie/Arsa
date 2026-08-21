/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class chn
extends chl
implements cgy,
chj,
cij {
    private static final alw<Byte> a = ama.a(chn.class, aly.a);
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    protected static final int r = 1;
    private static final jy e = new jy(1, 0, 1);
    private static final List<cgv> cu = List.of(cgv.f, cgv.e, cgv.d, cgv.c);
    public static final float s = 0.15f;
    public static final float t = 0.1087f;
    public static final float cc = 3.0f;
    public static final float cd = 0.55f;
    public static final float ce = 0.5f;
    public static final float cf = 0.25f;
    public static final int cg = 2;
    private static final double cv = Math.sqrt(2.04f) - (double)0.6f;
    private static final boolean cw = false;
    private static final boolean cx = false;
    private static final boolean cy = false;
    private static final boolean cz = false;
    protected static final amo ch = amo.b("random_spawn_bonus");
    public static final String ci = "drop_chances";
    public static final String cj = "LeftHanded";
    public static final String ck = "CanPickUpLoot";
    public static final String cl = "NoAI";
    public int cm;
    protected int cn;
    protected cnp co;
    protected cnq cp;
    protected cno cq;
    private final cnl cA;
    protected cre cr;
    protected final coq cs;
    protected final coq ct;
    private @Nullable chl cB;
    private final csc cC;
    private cgi cD = cgi.d;
    private boolean cE = false;
    private boolean cF = false;
    private final Map<fls, Float> cG = Maps.newEnumMap(fls.class);
    private Optional<amt<fof>> cH = Optional.empty();
    private long cI;
    private @Nullable chj.a cJ;
    private is cK = is.c;
    private int cL = -1;

    protected chn(cgu<? extends chn> $$0, dwo $$1) {
        super((cgu<? extends chl>)$$0, $$1);
        this.cs = new coq();
        this.ct = new coq();
        this.co = new cnp(this);
        this.cp = new cnq(this);
        this.cq = new cno(this);
        this.cA = this.I();
        this.cr = this.b($$1);
        this.cC = new csc(this);
        if ($$1 instanceof axf) {
            this.D();
        }
    }

    protected void D() {
    }

    public static cir.a E() {
        return chl.ex().a(cis.o, 16.0);
    }

    protected cre b(dwo $$0) {
        return new crd(this, $$0);
    }

    protected boolean F() {
        return false;
    }

    public float a(fls $$0) {
        chn $$3;
        chn $$1;
        cgk cgk2 = this.dA();
        if (cgk2 instanceof chn && ($$1 = (chn)cgk2).F()) {
            chn $$2 = $$1;
        } else {
            $$3 = this;
        }
        Float $$4 = $$3.cG.get((Object)$$0);
        return $$4 == null ? $$0.a() : $$4.floatValue();
    }

    public void a(fls $$0, float $$1) {
        this.cG.put($$0, Float.valueOf($$1));
    }

    public void G() {
    }

    public void H() {
    }

    protected cnl I() {
        return new cnl(this);
    }

    public cnp J() {
        return this.co;
    }

    public cnq K() {
        cgk cgk2 = this.dA();
        if (cgk2 instanceof chn) {
            chn $$0 = (chn)cgk2;
            return $$0.K();
        }
        return this.cp;
    }

    public cno L() {
        return this.cq;
    }

    public cre N() {
        cgk cgk2 = this.dA();
        if (cgk2 instanceof chn) {
            chn $$0 = (chn)cgk2;
            return $$0.N();
        }
        return this.cr;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public @Nullable chl dl() {
        cgk $$0 = this.do();
        if (this.gG()) return null;
        if (!($$0 instanceof chn)) return null;
        chn $$1 = (chn)$$0;
        if (!$$0.ct()) return null;
        chn chn2 = $$1;
        return chn2;
    }

    public csc P() {
        return this.cC;
    }

    @Override
    public @Nullable chl ag_() {
        return this.cB;
    }

    protected final @Nullable chl Q() {
        return this.ev().c(cqw.p).orElse(null);
    }

    public void g(@Nullable chl $$0) {
        this.cB = $$0;
    }

    @Override
    public boolean a(cgu<?> $$0) {
        return $$0 != cgu.ah;
    }

    public boolean g(dlt $$0) {
        return false;
    }

    public void R() {
        this.c(etk.m);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, (byte)0);
    }

    public int S() {
        return 80;
    }

    public void T() {
        this.b(this.W());
    }

    @Override
    public void aJ() {
        super.aJ();
        bzm $$0 = bzl.a();
        $$0.a("mobBaseTick");
        if (this.cb() && this.as.a(1000) < this.cm++) {
            this.k();
            this.T();
        }
        $$0.c();
    }

    @Override
    protected void g(cex $$0) {
        this.k();
        super.g($$0);
    }

    private void k() {
        this.cm = -this.S();
    }

    @Override
    protected int f(axf $$0) {
        if (this.cn > 0) {
            int $$1 = this.cn;
            for (cgv $$2 : cgv.j) {
                dlt $$3;
                if (!$$2.g() || ($$3 = this.a($$2)).f() || !(this.cD.b($$2) <= 1.0f)) continue;
                $$1 += 1 + this.as.a(3);
            }
            return $$1;
        }
        return this.cn;
    }

    public void U() {
        if (this.ao().B_()) {
            this.fu();
        } else {
            this.ao().a((cgk)this, (byte)20);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 20) {
            this.U();
        } else {
            super.b($$0);
        }
    }

    @Override
    public void g() {
        super.g();
        if (!this.ao().B_() && this.at % 5 == 0) {
            this.V();
        }
    }

    protected void V() {
        boolean $$0 = !(this.dl() instanceof chn);
        boolean $$1 = !(this.dz() instanceof dgb);
        this.cs.a(cop.a.a, $$0);
        this.cs.a(cop.a.c, $$0 && $$1);
        this.cs.a(cop.a.b, $$0);
    }

    @Override
    protected void D(float $$0) {
        this.cA.a();
    }

    protected @Nullable bcz W() {
        return null;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(ck, this.gn());
        $$0.a("PersistenceRequired", this.cF);
        if (!this.cD.equals(cgi.d)) {
            $$0.a(ci, cgi.e, this.cD);
        }
        this.a($$0, this.cJ);
        if (this.gF()) {
            $$0.a("home_radius", this.cL);
            $$0.a("home_pos", is.a, this.cK);
        }
        $$0.a(cj, this.gH());
        this.cH.ifPresent($$1 -> $$0.a("DeathLootTable", fof.a, $$1));
        if (this.cI != 0L) {
            $$0.a("DeathLootTableSeed", this.cI);
        }
        if (this.gG()) {
            $$0.a(cl, this.gG());
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.b_($$0.a(ck, false));
        this.cF = $$0.a("PersistenceRequired", false);
        this.cD = $$0.a(ci, cgi.e).orElse(cgi.d);
        this.b($$0);
        this.cL = $$0.a("home_radius", -1);
        if (this.cL >= 0) {
            this.cK = $$0.a("home_pos", is.a).orElse(is.c);
        }
        this.v($$0.a(cj, false));
        this.cH = $$0.a("DeathLootTable", fof.a);
        this.cI = $$0.a("DeathLootTableSeed", 0L);
        this.u($$0.a(cl, false));
    }

    @Override
    protected void b(axf $$0, cex $$1, boolean $$2) {
        super.b($$0, $$1, $$2);
        this.cH = Optional.empty();
    }

    @Override
    public final Optional<amt<fof>> er() {
        if (this.cH.isPresent()) {
            return this.cH;
        }
        return super.er();
    }

    @Override
    public long fc() {
        return this.cI;
    }

    public void I(float $$0) {
        this.bP = $$0;
    }

    public void J(float $$0) {
        this.bO = $$0;
    }

    public void K(float $$0) {
        this.bN = $$0;
    }

    @Override
    public void C(float $$0) {
        super.C($$0);
        this.I($$0);
    }

    public void X() {
        this.N().n();
        this.K(0.0f);
        this.J(0.0f);
        this.C(0.0f);
        this.m(0.0, 0.0, 0.0);
        this.gM();
    }

    @Override
    public void d_() {
        super.d_();
        if (this.ay().a(bdt.e)) {
            this.p();
        }
        bzm $$0 = bzl.a();
        $$0.a("looting");
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            if (this.gn() && this.cb() && !this.bJ && $$1.U().a(eua.F).booleanValue()) {
                jy $$2 = this.Z();
                List<czl> $$3 = this.ao().a(czl.class, this.dj().c($$2.u(), $$2.v(), $$2.w()));
                for (czl $$4 : $$3) {
                    if ($$4.eh() || $$4.e().f() || $$4.n() || !this.c($$1, $$4.e())) continue;
                    this.a($$1, $$4);
                }
            }
        }
        $$0.c();
    }

    protected cgv Y() {
        return cgv.f;
    }

    private void p() {
        if (!this.cb() || !this.gL()) {
            return;
        }
        cgv $$0 = this.Y();
        dlt $$1 = this.a($$0);
        if (!$$1.f()) {
            if ($$1.m()) {
                dlp $$2 = $$1.h();
                $$1.b($$1.o() + this.as.a(2));
                if ($$1.o() >= $$1.p()) {
                    this.a($$2, $$0);
                    this.a($$0, dlt.l);
                }
            }
            return;
        }
        this.e(8.0f);
    }

    private boolean gL() {
        if (!this.ao().B_() && this.ao().c().a(ceg.P, this.dI()).booleanValue()) {
            boolean $$2;
            float $$0 = this.bO();
            is $$1 = is.a(this.dP(), this.dT(), this.dV());
            boolean bl2 = $$2 = this.bA() || this.aJ || this.aK;
            if ($$0 > 0.5f && this.as.i() * 30.0f < ($$0 - 0.4f) * 2.0f && !$$2 && this.ao().k($$1)) {
                return true;
            }
        }
        return false;
    }

    protected jy Z() {
        return e;
    }

    protected void a(axf $$0, czl $$1) {
        dlt $$2 = $$1.e();
        dlt $$3 = this.b($$0, $$2.v());
        if (!$$3.f()) {
            this.a($$1);
            this.a((cgk)$$1, $$3.N());
            $$2.h($$3.N());
            if ($$2.f()) {
                $$1.aC();
            }
        }
    }

    public dlt b(axf $$0, dlt $$1) {
        cgv $$2 = this.f($$1);
        if (!this.a($$1, $$2)) {
            return dlt.l;
        }
        dlt $$3 = this.a($$2);
        boolean $$4 = this.a($$1, $$3, $$2);
        if ($$2.f() && !$$4) {
            $$2 = cgv.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
        }
        if ($$4 && this.h($$1)) {
            double $$5 = this.cD.b($$2);
            if (!$$3.f() && (double)Math.max(this.as.i() - 0.1f, 0.0f) < $$5) {
                this.a($$0, $$3);
            }
            dlt $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
        }
        return dlt.l;
    }

    protected void b(cgv $$0, dlt $$1) {
        this.a($$0, $$1);
        this.g($$0);
        this.cF = true;
    }

    protected boolean b_(ddm $$0) {
        return !this.cr();
    }

    public void g(cgv $$0) {
        this.cD = this.cD.a($$0);
    }

    protected boolean a(dlt $$0, dlt $$1, cgv $$2) {
        if ($$1.f()) {
            return true;
        }
        if ($$2.f()) {
            return this.b($$0, $$1, $$2);
        }
        if ($$2 == cgv.a) {
            return this.c($$0, $$1, $$2);
        }
        return false;
    }

    private boolean b(dlt $$0, dlt $$1, cgv $$2) {
        if (dsq.a($$1, dsp.F)) {
            return false;
        }
        double $$3 = this.a($$0, cis.b, $$2);
        double $$4 = this.a($$1, cis.b, $$2);
        double $$5 = this.a($$0, cis.c, $$2);
        double $$6 = this.a($$1, cis.c, $$2);
        if ($$3 != $$4) {
            return $$3 > $$4;
        }
        if ($$5 != $$6) {
            return $$5 > $$6;
        }
        return this.b($$0, $$1);
    }

    private boolean c(dlt $$0, dlt $$1, cgv $$2) {
        double $$5;
        double $$4;
        bef<dlp> $$3 = this.aa();
        if ($$3 != null) {
            if ($$1.a($$3) && !$$0.a($$3)) {
                return false;
            }
            if (!$$1.a($$3) && $$0.a($$3)) {
                return true;
            }
        }
        if (($$4 = this.a($$0, cis.d, $$2)) != ($$5 = this.a($$1, cis.d, $$2))) {
            return $$4 > $$5;
        }
        return this.b($$0, $$1);
    }

    private double a(dlt $$0, jd<cin> $$1, cgv $$2) {
        double $$3 = this.fw().b($$1) ? this.j($$1) : 0.0;
        don $$4 = $$0.a(ki.r, don.a);
        return $$4.a($$1, $$3, $$2);
    }

    public boolean b(dlt $$0, dlt $$1) {
        int $$5;
        Set<Object2IntMap.Entry<jd<dso>>> $$2 = $$1.a(ki.o, dsu.a).b();
        Set<Object2IntMap.Entry<jd<dso>>> $$3 = $$0.a(ki.o, dsu.a).b();
        if ($$3.size() != $$2.size()) {
            return $$3.size() > $$2.size();
        }
        int $$4 = $$0.o();
        if ($$4 != ($$5 = $$1.o())) {
            return $$4 < $$5;
        }
        return $$0.c(ki.h) && !$$1.c(ki.h);
    }

    public boolean h(dlt $$0) {
        return true;
    }

    public boolean c(axf $$0, dlt $$1) {
        return this.h($$1);
    }

    public @Nullable bef<dlp> aa() {
        return null;
    }

    public boolean i(double $$0) {
        return true;
    }

    public boolean ab() {
        return this.cq();
    }

    @Override
    public void dW() {
        if (this.ao().av() == ccz.a && !this.ay().s()) {
            this.aC();
            return;
        }
        if (this.gA() || this.ab()) {
            this.bK = 0;
            return;
        }
        ddm $$0 = this.ao().a((cgk)this, -1.0);
        if ($$0 != null) {
            int $$2;
            int $$3;
            double $$1 = $$0.g(this);
            if ($$1 > (double)($$3 = ($$2 = this.ay().f().f()) * $$2) && this.i($$1)) {
                this.aC();
            }
            int $$4 = this.ay().f().g();
            int $$5 = $$4 * $$4;
            if (this.bK > 600 && this.as.a(800) == 0 && $$1 > (double)$$5 && this.i($$1)) {
                this.aC();
            } else if ($$1 < (double)$$5) {
                this.bK = 0;
            }
        }
    }

    @Override
    protected final void fV() {
        ++this.bK;
        bzm $$0 = bzl.a();
        $$0.a("sensing");
        this.cC.a();
        $$0.c();
        int $$1 = this.at + this.aA();
        if ($$1 % 2 == 0 || this.at <= 1) {
            $$0.a("targetSelector");
            this.ct.a();
            $$0.c();
            $$0.a("goalSelector");
            this.cs.a();
            $$0.c();
        } else {
            $$0.a("targetSelector");
            this.ct.a(false);
            $$0.c();
            $$0.a("goalSelector");
            this.cs.a(false);
            $$0.c();
        }
        $$0.a("navigation");
        this.cr.d();
        $$0.c();
        $$0.a("mob tick");
        this.a((axf)this.ao());
        $$0.c();
        $$0.a("controls");
        $$0.a("move");
        this.cp.a();
        $$0.b("look");
        this.co.a();
        $$0.b("jump");
        this.cq.b();
        $$0.c();
        $$0.c();
    }

    protected void a(axf $$0) {
    }

    public int ac() {
        return 40;
    }

    public int ae() {
        return 75;
    }

    protected void af() {
        float $$0 = this.ae();
        float $$1 = this.cS();
        float $$2 = bgj.f(this.bC - $$1);
        float $$3 = bgj.a(bgj.f(this.bC - $$1), -$$0, $$0);
        float $$4 = $$1 + $$2 - $$3;
        this.r($$4);
    }

    public int ai() {
        return 10;
    }

    public void a(cgk $$0, float $$1, float $$2) {
        double $$7;
        double $$3 = $$0.dP() - this.dP();
        double $$4 = $$0.dV() - this.dV();
        if ($$0 instanceof chl) {
            chl $$5 = (chl)$$0;
            double $$6 = $$5.dT() - this.dT();
        } else {
            $$7 = ($$0.dj().b + $$0.dj().e) / 2.0 - this.dT();
        }
        double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
        float $$9 = (float)(bgj.d($$4, $$3) * 57.2957763671875) - 90.0f;
        float $$10 = (float)(-(bgj.d($$7, $$8) * 57.2957763671875));
        this.w(this.a(this.ee(), $$10, $$2));
        this.v(this.a(this.ec(), $$9, $$1));
    }

    private float a(float $$0, float $$1, float $$2) {
        float $$3 = bgj.f($$1 - $$0);
        if ($$3 > $$2) {
            $$3 = $$2;
        }
        if ($$3 < -$$2) {
            $$3 = -$$2;
        }
        return $$0 + $$3;
    }

    public static boolean a(cgu<? extends chn> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        is $$5 = $$3.e();
        return cgt.a($$2) || $$1.a_($$5).a((dvt)$$1, $$5, $$0);
    }

    public boolean a(dwp $$0, cgt $$1) {
        return true;
    }

    public boolean a(dwr $$0) {
        return !$$0.d(this.dj()) && $$0.f(this);
    }

    public int aj() {
        return 4;
    }

    public boolean q(int $$0) {
        return false;
    }

    @Override
    public int cW() {
        if (this.ag_() == null) {
            return this.y(0.0f);
        }
        int $$0 = (int)(this.eZ() - this.fq() * 0.33f);
        if (($$0 -= (3 - this.ao().av().a()) * 4) < 0) {
            $$0 = 0;
        }
        return this.y($$0);
    }

    public dlt ak() {
        return this.a(cgv.g);
    }

    public boolean al() {
        return this.i(cgv.h);
    }

    public boolean am() {
        return this.i(cgv.g);
    }

    private boolean i(cgv $$0) {
        return this.d($$0) && this.a(this.a($$0), $$0);
    }

    public void i(dlt $$0) {
        this.b(cgv.g, $$0);
    }

    public ccv h(final cgv $$0) {
        return new fuy(){

            @Override
            public dlt g() {
                return chn.this.a($$0);
            }

            @Override
            public void b(dlt $$02) {
                chn.this.a($$0, $$02);
                if (!$$02.f()) {
                    chn.this.g($$0);
                    chn.this.gz();
                }
            }

            @Override
            public void e() {
            }

            @Override
            public boolean a(ddm $$02) {
                return $$02.dz() == chn.this || $$02.b((cgk)chn.this, 4.0);
            }
        };
    }

    @Override
    protected void a(axf $$0, cex $$1, boolean $$2) {
        super.a($$0, $$1, $$2);
        for (cgv $$3 : cgv.j) {
            dlt $$4 = this.a($$3);
            float $$5 = this.cD.b($$3);
            if ($$5 == 0.0f) continue;
            boolean $$6 = this.cD.c($$3);
            Object object = $$1.d();
            if (object instanceof chl) {
                chl $$7 = (chl)object;
                object = this.ao();
                if (object instanceof axf) {
                    axf $$8 = (axf)object;
                    $$5 = dsq.a($$8, $$7, $$1, $$5);
                }
            }
            if ($$4.f() || dsq.a($$4, dsp.E) || !$$2 && !$$6 || !(this.as.i() < $$5)) continue;
            if (!$$6 && $$4.m()) {
                $$4.b($$4.p() - this.as.a(1 + this.as.a(Math.max($$4.p() - 3, 1))));
            }
            this.a($$0, $$4);
            this.a($$3, dlt.l);
        }
    }

    public cgi an() {
        return this.cD;
    }

    public void b(axf $$02) {
        this.a($$02, (dlt $$0) -> true);
    }

    public Set<cgv> a(axf $$0, Predicate<dlt> $$1) {
        HashSet<cgv> $$2 = new HashSet<cgv>();
        for (cgv $$3 : cgv.j) {
            dlt $$4 = this.a($$3);
            if ($$4.f()) continue;
            if (!$$1.test($$4)) {
                $$2.add($$3);
                continue;
            }
            if (!this.cD.c($$3)) continue;
            this.a($$3, dlt.l);
            this.a($$0, $$4);
        }
        return $$2;
    }

    private fod h(axf $$0) {
        return new fod.a($$0).a(fqx.h, this.dI()).a(fqx.a, this).a(fqw.h);
    }

    public void a(cgx $$0) {
        this.a($$0.a(), $$0.b());
    }

    public void a(amt<fof> $$0, Map<cgv, Float> $$1) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            this.a($$0, this.h($$2), $$1);
        }
    }

    protected void a(bgr $$0, cda $$1) {
        if ($$0.i() < 0.15f * $$1.d()) {
            int $$2 = $$0.a(3);
            int $$3 = 1;
            while ((float)$$3 <= 3.0f) {
                if ($$0.i() < 0.1087f) {
                    ++$$2;
                }
                ++$$3;
            }
            float $$4 = this.ao().av() == ccz.d ? 0.1f : 0.25f;
            boolean $$5 = true;
            for (cgv $$6 : cu) {
                dlp $$8;
                dlt $$7 = this.a($$6);
                if (!$$5 && $$0.i() < $$4) break;
                $$5 = false;
                if (!$$7.f() || ($$8 = chn.a($$6, $$2)) == null) continue;
                this.a($$6, new dlt($$8));
            }
        }
    }

    public static @Nullable dlp a(cgv $$0, int $$1) {
        switch ($$0) {
            case f: {
                if ($$1 == 0) {
                    return dlx.re;
                }
                if ($$1 == 1) {
                    return dlx.ri;
                }
                if ($$1 == 2) {
                    return dlx.ry;
                }
                if ($$1 == 3) {
                    return dlx.rm;
                }
                if ($$1 == 4) {
                    return dlx.rq;
                }
                if ($$1 == 5) {
                    return dlx.ru;
                }
            }
            case e: {
                if ($$1 == 0) {
                    return dlx.rf;
                }
                if ($$1 == 1) {
                    return dlx.rj;
                }
                if ($$1 == 2) {
                    return dlx.rz;
                }
                if ($$1 == 3) {
                    return dlx.rn;
                }
                if ($$1 == 4) {
                    return dlx.rr;
                }
                if ($$1 == 5) {
                    return dlx.rv;
                }
            }
            case d: {
                if ($$1 == 0) {
                    return dlx.rg;
                }
                if ($$1 == 1) {
                    return dlx.rk;
                }
                if ($$1 == 2) {
                    return dlx.rA;
                }
                if ($$1 == 3) {
                    return dlx.ro;
                }
                if ($$1 == 4) {
                    return dlx.rs;
                }
                if ($$1 == 5) {
                    return dlx.rw;
                }
            }
            case c: {
                if ($$1 == 0) {
                    return dlx.rh;
                }
                if ($$1 == 1) {
                    return dlx.rl;
                }
                if ($$1 == 2) {
                    return dlx.rB;
                }
                if ($$1 == 3) {
                    return dlx.rp;
                }
                if ($$1 == 4) {
                    return dlx.rt;
                }
                if ($$1 != 5) break;
                return dlx.rx;
            }
        }
        return null;
    }

    protected void a(dxf $$0, bgr $$1, cda $$2) {
        this.b($$0, $$1, $$2);
        for (cgv $$3 : cgv.j) {
            if ($$3.a() != cgv.a.b) continue;
            this.a($$0, $$1, $$3, $$2);
        }
    }

    protected void b(dxf $$0, bgr $$1, cda $$2) {
        this.a($$0, cgv.a, $$1, 0.25f, $$2);
    }

    protected void a(dxf $$0, bgr $$1, cgv $$2, cda $$3) {
        this.a($$0, $$2, $$1, 0.5f, $$3);
    }

    private void a(dxf $$0, cgv $$1, bgr $$2, float $$3, cda $$4) {
        dlt $$5 = this.a($$1);
        if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
            dsq.a($$5, $$0.J_(), duf.a, $$4, $$2);
            this.a($$1, $$5);
        }
    }

    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        cio $$5 = Objects.requireNonNull(this.h(cis.o));
        if (!$$5.b(ch)) {
            $$5.d(new ciq(ch, $$4.a(0.0, 0.11485000000000001), ciq.a.b));
        }
        this.v($$4.i() < 0.05f);
        return $$3;
    }

    public void gz() {
        this.cF = true;
    }

    @Override
    public void a(cgv $$0, float $$1) {
        this.cD = this.cD.a($$0, $$1);
    }

    @Override
    public boolean gn() {
        return this.cE;
    }

    public void b_(boolean $$0) {
        this.cE = $$0;
    }

    @Override
    protected boolean f(cgv $$0) {
        return this.gn();
    }

    public boolean gA() {
        return this.cF;
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        if (!this.cb()) {
            return cdc.e;
        }
        cdc $$2 = this.c($$0, $$1);
        if ($$2.a()) {
            this.a(etk.r, (cgk)$$0);
            return $$2;
        }
        cdc $$3 = super.a($$0, $$1);
        if ($$3 != cdc.e) {
            return $$3;
        }
        $$2 = this.b($$0, $$1);
        if ($$2.a()) {
            this.a(etk.r, (cgk)$$0);
            return $$2;
        }
        return cdc.e;
    }

    private cdc c(ddm $$0, cdb $$12) {
        cdc $$3;
        dlt $$2 = $$0.b($$12);
        if ($$2.a(dlx.xa) && ($$3 = $$2.a($$0, (chl)this, $$12)).a()) {
            return $$3;
        }
        dlp dlp2 = $$2.h();
        if (dlp2 instanceof dna) {
            dna $$4 = (dna)dlp2;
            if (this.ao() instanceof axf) {
                Optional<chn> $$5 = $$4.a($$0, this, this.ay(), (axf)this.ao(), this.dI(), $$2);
                $$5.ifPresent($$1 -> this.a($$0, (chn)$$1));
                if ($$5.isEmpty()) {
                    return cdc.e;
                }
            }
            return cdc.b;
        }
        return cdc.e;
    }

    protected void a(ddm $$0, chn $$1) {
    }

    protected cdc b(ddm $$0, cdb $$1) {
        return cdc.e;
    }

    protected void a(ddm $$0, cdb $$1, dlt $$2) {
        int $$3 = $$2.N();
        dpi $$4 = $$2.a(ki.A);
        $$2.a(1, (chl)$$0);
        if ($$4 != null) {
            dlt $$5 = $$4.a($$2, $$3, $$0.gv(), $$0::b);
            $$0.a($$1, $$5);
        }
    }

    public boolean gB() {
        return this.a(this.dK());
    }

    public boolean a(is $$0) {
        if (this.cL == -1) {
            return true;
        }
        return this.cK.j($$0) < (double)(this.cL * this.cL);
    }

    public boolean a(ftm $$0) {
        if (this.cL == -1) {
            return true;
        }
        return this.cK.b($$0) < (double)(this.cL * this.cL);
    }

    public void a(is $$0, int $$1) {
        this.cK = $$0;
        this.cL = $$1;
    }

    public is gC() {
        return this.cK;
    }

    public int gD() {
        return this.cL;
    }

    public void gE() {
        this.cL = -1;
    }

    public boolean gF() {
        return this.cL != -1;
    }

    public <T extends chn> @Nullable T a(cgu<T> $$0, cge $$1, cgt $$2, cge.a<T> $$3) {
        if (this.eh()) {
            return null;
        }
        chn $$4 = (chn)$$0.a(this.ao(), $$2);
        if ($$4 == null) {
            return null;
        }
        $$1.a().a(this, $$4, $$1);
        $$3.finalizeConversion($$4);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$5 = (axf)dwo2;
            $$5.b($$4);
        }
        if ($$1.a().a()) {
            this.aC();
        }
        return (T)$$4;
    }

    public <T extends chn> @Nullable T a(cgu<T> $$0, cge $$1, cge.a<T> $$2) {
        return this.a($$0, $$1, cgt.i, $$2);
    }

    @Override
    public @Nullable chj.a T_() {
        return this.cJ;
    }

    private void gM() {
        if (this.cJ != null) {
            this.cJ.d = 0.0;
        }
    }

    @Override
    public void a(@Nullable chj.a $$0) {
        this.cJ = $$0;
    }

    @Override
    public void s() {
        if (this.T_() == null) {
            this.gE();
        }
    }

    @Override
    public void y() {
        chj.super.y();
        this.cs.a(cop.a.a);
    }

    @Override
    public boolean aj_() {
        return !(this instanceof czu);
    }

    @Override
    public boolean a(cgk $$0, boolean $$1, boolean $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        if ($$3 && this.S_()) {
            this.o();
        }
        return $$3;
    }

    @Override
    public boolean dy() {
        return super.dy() && !this.gG();
    }

    public void u(boolean $$0) {
        byte $$1 = this.az.a(a);
        this.az.a(a, $$0 ? (byte)($$1 | 1) : (byte)($$1 & 0xFFFFFFFE));
    }

    public void v(boolean $$0) {
        byte $$1 = this.az.a(a);
        this.az.a(a, $$0 ? (byte)($$1 | 2) : (byte)($$1 & 0xFFFFFFFD));
    }

    public void w(boolean $$0) {
        byte $$1 = this.az.a(a);
        this.az.a(a, $$0 ? (byte)($$1 | 4) : (byte)($$1 & 0xFFFFFFFB));
    }

    public boolean gG() {
        return (this.az.a(a) & 1) != 0;
    }

    public boolean gH() {
        return (this.az.a(a) & 2) != 0;
    }

    public boolean gI() {
        return (this.az.a(a) & 4) != 0;
    }

    public void a_(boolean $$0) {
    }

    @Override
    public chb at() {
        return this.gH() ? chb.a : chb.b;
    }

    public boolean h(chl $$0) {
        double $$5;
        double $$4;
        dnu $$1 = this.fA().a(ki.F);
        if ($$1 == null) {
            double $$2 = cv;
            double $$3 = 0.0;
        } else {
            $$4 = $$1.b(this);
            $$5 = $$1.a(this);
        }
        fth $$6 = $$0.fh();
        return this.j($$4).c($$6) && ($$5 <= 0.0 || !this.j($$5).c($$6));
    }

    protected fth j(double $$0) {
        fth $$5;
        cgk $$1 = this.dz();
        if ($$1 != null) {
            fth $$2 = $$1.dj();
            fth $$3 = this.dj();
            fth $$4 = new fth(Math.min($$3.a, $$2.a), $$3.b, Math.min($$3.c, $$2.c), Math.max($$3.d, $$2.d), $$3.e, Math.max($$3.f, $$2.f));
        } else {
            $$5 = this.dj();
        }
        return $$5.c($$0, 0.0, $$0);
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        float $$2 = (float)this.i(cis.d);
        dlt $$3 = this.eq();
        cex $$4 = $$3.a((chl)this, () -> this.en().b(this));
        $$2 = dsq.a($$0, $$3, $$1, $$4, $$2);
        $$2 += $$3.h().a($$1, $$2, $$4);
        ftm $$5 = $$1.dN();
        boolean $$6 = $$1.a($$0, $$4, $$2);
        if ($$6) {
            this.a($$1, this.b($$1, $$4), $$5);
            if ($$1 instanceof chl) {
                chl $$7 = (chl)$$1;
                $$3.a($$7, (chl)this);
            }
            dsq.a($$0, $$1, $$4);
            this.C($$1);
            this.fN();
        }
        this.fi();
        return $$6;
    }

    @Override
    protected void c(bef<fla> $$0) {
        if (this.N().p()) {
            super.c($$0);
        } else {
            this.k(this.dN().b(0.0, 0.3, 0.0));
        }
    }

    @VisibleForTesting
    public void gJ() {
        this.d((cop $$0) -> true);
        this.ev().g();
    }

    public void d(Predicate<cop> $$0) {
        this.cs.a($$0);
    }

    @Override
    protected void cV() {
        super.cV();
        for (cgv $$0 : cgv.j) {
            dlt $$1 = this.a($$0);
            if ($$1.f()) continue;
            $$1.e(0);
        }
    }

    @Override
    public @Nullable dlt dZ() {
        dna $$0 = dna.a(this.ay());
        if ($$0 == null) {
            return null;
        }
        return new dlt($$0);
    }

    @Override
    protected void a(jd<cin> $$0) {
        super.a($$0);
        if ($$0.a(cis.o) || $$0.a(cis.G)) {
            this.N().f();
        }
    }

    @Override
    public void a(axf $$0, bxh.a $$1) {
        $$1.a(bxf.f, () -> {
            flp $$0 = this.N().j();
            if ($$0 != null && $$0.k() != null) {
                return new bxb($$0.n(), this.N().q());
            }
            return null;
        });
        $$1.a(bxf.e, () -> {
            Set<cqe> $$0 = this.cs.b();
            ArrayList<bwz.a> $$12 = new ArrayList<bwz.a>($$0.size());
            $$0.forEach($$1 -> $$12.add(new bwz.a($$1.i(), $$1.h(), $$1.k().getClass().getSimpleName())));
            return new bwz($$12);
        });
        if (!this.ca.i()) {
            $$1.a(bxf.c, () -> bwu.a($$0, this));
        }
    }

    public float gK() {
        return 1.0f;
    }
}

