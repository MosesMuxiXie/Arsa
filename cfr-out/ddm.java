/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.math.IntMath
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.util.Either
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class ddm
extends cgc
implements cgd {
    public static final int cc = 20;
    public static final int cd = 100;
    public static final int ce = 10;
    public static final int cf = 200;
    public static final int cg = 499;
    public static final int ch = 500;
    public static final float ci = 4.5f;
    public static final float cj = 3.0f;
    private static final int a = 40;
    private static final alw<Float> b = ama.a(ddm.class, aly.d);
    private static final alw<Integer> c = ama.a(ddm.class, aly.b);
    private static final alw<OptionalInt> d = ama.a(ddm.class, aly.u);
    private static final alw<OptionalInt> e = ama.a(ddm.class, aly.u);
    private static final short f = 0;
    private static final float g = 0.0f;
    private static final int h = 0;
    private static final int i = 0;
    private static final int j = 0;
    private static final int k = 0;
    private static final int cB = 0;
    private static final boolean cC = false;
    private static final int cD = 0;
    public static final float ck = 2.0f;
    final ddl cE;
    protected diy cl = new diy();
    public final dim cm;
    public dhi cn;
    protected dhe co = new dhe();
    protected int cp;
    public int cq;
    private int cF = 0;
    protected boolean cr;
    private final ddi cG = new ddi();
    public int cs = 0;
    public int ct = 0;
    public float cu = 0.0f;
    protected int cv = 0;
    protected final float cw = 0.02f;
    private int cH;
    private final GameProfile cI;
    private boolean cJ;
    private dlt cK = dlt.l;
    private final dlq cL = this.f();
    private Optional<jc> cM = Optional.empty();
    public @Nullable ddz cx;
    protected float cy;
    public @Nullable ftm cz;
    public @Nullable cgk cA;
    private boolean cN = false;
    private int cO = 0;

    public ddm(dwo $$0, GameProfile $$1) {
        super((cgu<? extends chl>)cgu.cb, $$0);
        this.a($$1.id());
        this.cI = $$1;
        this.cE = new ddl(this, this.cb);
        this.cm = new dim(this.cE, !$$0.B_(), this);
        this.cn = this.cm;
    }

    @Override
    protected cgo eu() {
        return new ddn(this);
    }

    public boolean a(dwo $$0, is $$1, dwl $$2) {
        if (!$$2.f()) {
            return false;
        }
        if ($$2 == dwl.d) {
            return true;
        }
        if (this.gY()) {
            return false;
        }
        dlt $$3 = this.fx();
        return $$3.f() || !$$3.b(new eol($$0, $$1, false));
    }

    public static cir.a gz() {
        return chl.ex().a(cis.d, 1.0).a(cis.x, 0.1f).a(cis.f).a(cis.s).a(cis.h, 4.5).a(cis.l, 3.0).a(cis.g).a(cis.E).a(cis.B).a(cis.v).a(cis.F).a(cis.I, 6.0E7).a(cis.J, 6.0E7);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(b, Float.valueOf(0.0f));
        $$0.a(c, 0);
        $$0.a(d, OptionalInt.empty());
        $$0.a(e, OptionalInt.empty());
    }

    @Override
    public void g() {
        this.ar = this.au();
        if (this.au() || this.cq()) {
            this.e(false);
        }
        if (this.cq > 0) {
            --this.cq;
        }
        if (this.gr()) {
            ++this.cF;
            if (this.cF > 100) {
                this.cF = 100;
            }
            if (!this.ao().B_() && !this.ao().c().a(ceg.C, this.dI()).a(this.ao())) {
                this.a(false, true);
            }
        } else if (this.cF > 0) {
            ++this.cF;
            if (this.cF >= 110) {
                this.cF = 0;
            }
        }
        this.gD();
        super.g();
        int $$0 = 29999999;
        double $$1 = bgj.a(this.dP(), -2.9999999E7, 2.9999999E7);
        double $$2 = bgj.a(this.dV(), -2.9999999E7, 2.9999999E7);
        if ($$1 != this.dP() || $$2 != this.dV()) {
            this.a_($$1, this.dR(), $$2);
        }
        ++this.bz;
        ++this.bA;
        dlt $$3 = this.fx();
        if (!dlt.a(this.cK, $$3)) {
            if (!dlt.b(this.cK, $$3)) {
                this.hf();
            }
            this.cK = $$3.v();
        }
        if (!((cgk)this).a(bdv.a) && this.c(dlx.pP)) {
            this.m();
        }
        this.cL.a();
        this.gE();
        if (this.cO > 0) {
            --this.cO;
        }
    }

    @Override
    protected float fP() {
        if (this.gg()) {
            return 15.0f;
        }
        return super.fP();
    }

    public boolean gA() {
        return this.cu();
    }

    protected boolean gB() {
        return this.cu();
    }

    protected boolean gC() {
        return this.cu();
    }

    protected boolean gD() {
        this.cr = ((cgk)this).a(bdv.a);
        return this.cr;
    }

    @Override
    public void a(boolean $$0, is $$1) {
        if (!this.gL().b) {
            super.a($$0, $$1);
        }
    }

    @Override
    public void m(boolean $$0) {
        if (!this.gL().b) {
            super.m($$0);
        }
    }

    private void m() {
        this.a(new cfm(cfo.m, 200, 0, false, false, true));
    }

    private boolean c(dlp $$0) {
        for (cgv $$1 : cgv.j) {
            dlt $$2 = this.a($$1);
            dun $$3 = $$2.a(ki.H);
            if (!$$2.a($$0) || $$3 == null || $$3.b() != $$1) continue;
            return true;
        }
        return false;
    }

    protected dlq f() {
        return new dlq();
    }

    protected void gE() {
        chx $$3;
        if (!this.h(chx.d)) {
            return;
        }
        chx $$0 = this.n();
        if (this.au() || this.cq() || this.h($$0)) {
            chx $$1 = $$0;
        } else if (this.h(chx.f)) {
            chx $$2 = chx.f;
        } else {
            $$3 = chx.d;
        }
        this.c($$3);
    }

    private chx n() {
        if (this.gr()) {
            return chx.c;
        }
        if (this.cB()) {
            return chx.d;
        }
        if (this.gj()) {
            return chx.b;
        }
        if (this.fW()) {
            return chx.e;
        }
        if (this.cu() && !this.cG.b) {
            return chx.f;
        }
        return chx.a;
    }

    protected boolean h(chx $$0) {
        return this.ao().a((cgk)this, this.a($$0).a(this.dI()).h(1.0E-7));
    }

    @Override
    protected bcz bk() {
        return bda.xg;
    }

    @Override
    protected bcz bl() {
        return bda.xe;
    }

    @Override
    protected bcz bm() {
        return bda.xf;
    }

    @Override
    public int co() {
        return 10;
    }

    @Override
    public void a(bcz $$0, float $$1, float $$2) {
        this.ao().a((cgk)this, this.dP(), this.dR(), this.dV(), $$0, this.dB(), $$1, $$2);
    }

    @Override
    public bdb dB() {
        return bdb.h;
    }

    @Override
    protected int dC() {
        return 20;
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 9) {
            this.Q_();
        } else if ($$0 == 23) {
            this.v(false);
        } else if ($$0 == 22) {
            this.v(true);
        } else {
            super.b($$0);
        }
    }

    protected void r() {
        this.cn = this.cm;
    }

    protected void s() {
    }

    @Override
    public void t() {
        if (!this.ao().B_() && this.gB() && this.cq()) {
            this.cf();
            this.h(false);
            return;
        }
        super.t();
    }

    @Override
    public void d_() {
        if (this.cp > 0) {
            --this.cp;
        }
        this.i();
        this.cE.m();
        if (this.cG.b && !this.cq()) {
            this.l();
        }
        super.d_();
        this.fv();
        this.bE = this.ec();
        this.C((float)this.i(cis.x));
        if (this.eZ() > 0.0f && !this.au()) {
            fth $$1;
            if (this.cq() && !this.dz().eh()) {
                fth $$0 = this.dj().b(this.dz().dj()).c(1.0, 0.0, 1.0);
            } else {
                $$1 = this.dj().c(1.0, 0.5, 1.0);
            }
            List<cgk> $$2 = this.ao().a_(this, $$1);
            ArrayList $$3 = Lists.newArrayList();
            for (cgk $$4 : $$2) {
                if ($$4.ay() == cgu.Z) {
                    $$3.add($$4);
                    continue;
                }
                if ($$4.eh()) continue;
                this.d($$4);
            }
            if (!$$3.isEmpty()) {
                this.d((cgk)bhs.a($$3, this.as));
            }
        }
        this.j();
    }

    protected void i() {
    }

    public void j() {
    }

    protected void k() {
    }

    private void d(cgk $$0) {
        $$0.a_(this);
    }

    public int gF() {
        return this.az.a(c);
    }

    public void q(int $$0) {
        this.az.a(c, $$0);
    }

    public void r(int $$0) {
        int $$1 = this.gF();
        this.az.a(c, $$1 + $$0);
    }

    public void a(int $$0, float $$1, dlt $$2) {
        this.bW = $$0;
        this.bX = $$1;
        this.bY = $$2;
        if (!this.ao().B_()) {
            this.k();
            this.c(4, true);
        }
    }

    @Override
    public dlt eq() {
        if (this.fW() && this.bY != null) {
            return this.bY;
        }
        return super.eq();
    }

    @Override
    public void a(cex $$0) {
        dwo dwo2;
        super.a($$0);
        this.aH();
        if (!this.au() && (dwo2 = this.ao()) instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.b($$1, $$0);
        }
        if ($$0 != null) {
            this.m(-bgj.b((double)((this.fg() + this.ec()) * ((float)Math.PI / 180))) * 0.1f, 0.1f, -bgj.a((double)((this.fg() + this.ec()) * ((float)Math.PI / 180))) * 0.1f);
        } else {
            this.m(0.0, 0.1, 0.0);
        }
        this.a(bdk.P);
        this.a(bdk.i.b(bdk.m));
        this.a(bdk.i.b(bdk.n));
        this.aT();
        this.d(false);
        this.d(Optional.of(jc.a(this.ao().aq(), this.dK())));
    }

    @Override
    protected void g(axf $$0) {
        super.g($$0);
        if (!$$0.U().a(eua.s).booleanValue()) {
            this.gG();
            this.cE.n();
        }
    }

    protected void gG() {
        for (int $$0 = 0; $$0 < this.cE.b(); ++$$0) {
            dlt $$1 = this.cE.a($$0);
            if ($$1.f() || !dsq.a($$1, dsp.E)) continue;
            this.cE.b($$0);
        }
    }

    @Override
    protected bcz h(cex $$0) {
        return $$0.k().d().a();
    }

    @Override
    protected bcz fd() {
        return bda.wW;
    }

    public void g(dlt $$0) {
    }

    public @Nullable czl a(dlt $$0, boolean $$1) {
        return this.a($$0, false, $$1);
    }

    public float c(eoh $$0) {
        float $$1 = this.cE.h().a($$0);
        if ($$1 > 1.0f) {
            $$1 += (float)this.i(cis.v);
        }
        if (cfn.a(this)) {
            $$1 *= 1.0f + (float)(cfn.b(this) + 1) * 0.2f;
        }
        if (this.d(cfo.d)) {
            float $$2 = switch (this.e(cfo.d).e()) {
                case 0 -> 0.3f;
                case 1 -> 0.09f;
                case 2 -> 0.0027f;
                default -> 8.1E-4f;
            };
            $$1 *= $$2;
        }
        $$1 *= (float)this.i(cis.g);
        if (((cgk)this).a(bdv.a)) {
            $$1 *= (float)this.h(cis.E).g();
        }
        if (!this.aV()) {
            $$1 /= 5.0f;
        }
        return $$1;
    }

    public boolean d(eoh $$0) {
        return !$$0.C() || this.cE.h().b($$0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a(this.cI.id());
        this.cE.a($$0.c("Inventory", cdd.a));
        this.cE.d($$0.a("SelectedItemSlot", 0));
        this.cF = $$0.a("SleepTimer", (short)0);
        this.cu = $$0.a("XpP", 0.0f);
        this.cs = $$0.a("XpLevel", 0);
        this.ct = $$0.a("XpTotal", 0);
        this.cv = $$0.a("XpSeed", 0);
        if (this.cv == 0) {
            this.cv = this.as.f();
        }
        this.q($$0.a("Score", 0));
        this.co.a($$0);
        $$0.a("abilities", ddi.a.a).ifPresent(this.cG::a);
        this.h(cis.x).a(this.cG.b());
        this.cl.b($$0.c("EnderItems", cdd.a));
        this.d($$0.a("LastDeathLocation", jc.b));
        this.cz = $$0.a("current_explosion_impact_pos", ftm.a).orElse(null);
        this.cN = $$0.a("ignore_fall_damage_from_current_explosion", false);
        this.cO = $$0.a("current_impulse_context_reset_grace_time", 0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        vo.a($$0);
        this.cE.a($$0.a("Inventory", cdd.a));
        $$0.a("SelectedItemSlot", this.cE.g());
        $$0.a("SleepTimer", (short)this.cF);
        $$0.a("XpP", this.cu);
        $$0.a("XpLevel", this.cs);
        $$0.a("XpTotal", this.ct);
        $$0.a("XpSeed", this.cv);
        $$0.a("Score", this.gF());
        this.co.a($$0);
        $$0.a("abilities", ddi.a.a, this.cG.c());
        this.cl.b($$0.a("EnderItems", cdd.a));
        this.cM.ifPresent($$1 -> $$0.a("LastDeathLocation", jc.b, $$1));
        $$0.b("current_explosion_impact_pos", ftm.a, this.cz);
        $$0.a("ignore_fall_damage_from_current_explosion", this.cN);
        $$0.a("current_impulse_context_reset_grace_time", this.cO);
    }

    @Override
    public boolean a(axf $$0, cex $$1) {
        if (super.a($$0, $$1)) {
            return true;
        }
        if ($$1.a(bdq.n)) {
            return $$0.U().a(eua.h) == false;
        }
        if ($$1.a(bdq.m)) {
            return $$0.U().a(eua.l) == false;
        }
        if ($$1.a(bdq.i)) {
            return $$0.U().a(eua.m) == false;
        }
        if ($$1.a(bdq.o)) {
            return $$0.U().a(eua.p) == false;
        }
        return false;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.a($$0, $$1)) {
            return false;
        }
        if (this.cG.a && !$$1.a(bdq.d)) {
            return false;
        }
        this.bK = 0;
        if (this.fa()) {
            return false;
        }
        this.k();
        if ($$1.g()) {
            if ($$0.av() == ccz.a) {
                $$2 = 0.0f;
            }
            if ($$0.av() == ccz.b) {
                $$2 = Math.min($$2 / 2.0f + 1.0f, $$2);
            }
            if ($$0.av() == ccz.d) {
                $$2 = $$2 * 3.0f / 2.0f;
            }
        }
        if ($$2 == 0.0f) {
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected void a(axf $$0, chl $$1) {
        super.a($$0, $$1);
        dlt $$2 = this.gh();
        dnx $$3 = $$2 != null ? $$2.a(ki.M) : null;
        float $$4 = $$1.gu();
        if ($$4 > 0.0f && $$3 != null) {
            $$3.a($$0, this, $$4, $$2);
        }
    }

    @Override
    public boolean eS() {
        return !this.gL().a && super.eS();
    }

    public boolean a(ddm $$0) {
        fum $$1 = this.cI();
        fum $$2 = $$0.cI();
        if ($$1 == null) {
            return true;
        }
        if (!$$1.a($$2)) {
            return true;
        }
        return ((fut)$$1).i();
    }

    @Override
    protected void c(cex $$0, float $$1) {
        this.a($$0, $$1, cgv.c, cgv.d, cgv.e, cgv.f);
    }

    @Override
    protected void d(cex $$0, float $$1) {
        this.a($$0, $$1, cgv.f);
    }

    @Override
    protected void c(axf $$0, cex $$1, float $$2) {
        if (this.a($$0, $$1)) {
            return;
        }
        $$2 = this.e($$1, $$2);
        float $$3 = $$2 = this.f($$1, $$2);
        $$2 = Math.max($$2 - this.fX(), 0.0f);
        this.F(this.fX() - ($$3 - $$2));
        float $$4 = $$3 - $$2;
        if ($$4 > 0.0f && $$4 < 3.4028235E37f) {
            this.a(bdk.N, Math.round($$4 * 10.0f));
        }
        if ($$2 == 0.0f) {
            return;
        }
        this.a($$1.a());
        this.fo().a($$1, $$2);
        this.x(this.eZ() - $$2);
        if ($$2 < 3.4028235E37f) {
            this.a(bdk.L, Math.round($$2 * 10.0f));
        }
        this.c(etk.o);
    }

    public boolean Z() {
        return false;
    }

    public void a(ems $$0, boolean $$1) {
    }

    public void a(dgn $$0) {
    }

    public void a(elm $$0) {
    }

    public void a(emx $$0) {
    }

    public void a(emy $$0) {
    }

    public void a(emz $$0) {
    }

    public void a(emg $$0) {
    }

    public void a(cup $$0, ccv $$1) {
    }

    public void a(cwn $$0, ccv $$1) {
    }

    public OptionalInt a(@Nullable cdf $$0) {
        return OptionalInt.empty();
    }

    public void b(jd<asj> $$0) {
    }

    public void a(int $$0, dvm $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
    }

    public void a(dlt $$0, cdb $$1) {
    }

    public cdc a(cgk $$0, cdb $$1) {
        if (this.au()) {
            if ($$0 instanceof cdf) {
                this.a((cdf)((Object)$$0));
            }
            return cdc.e;
        }
        dlt $$2 = this.b($$1);
        dlt $$3 = $$2.v();
        cdc $$4 = $$0.a(this, $$1);
        if ($$4.a()) {
            if (this.gv() && $$2 == this.b($$1) && $$2.N() < $$3.N()) {
                $$2.e($$3.N());
            }
            return $$4;
        }
        if (!$$2.f() && $$0 instanceof chl) {
            cdc $$5;
            if (this.gv()) {
                $$2 = $$3;
            }
            if (($$5 = $$2.a(this, (chl)$$0, $$1)).a()) {
                this.ao().a(etk.r, $$0.dI(), etk.a.a(this));
                if ($$2.f() && !this.gv()) {
                    this.a($$1, dlt.l);
                }
                return $$5;
            }
        }
        return cdc.e;
    }

    @Override
    public void ad() {
        super.ad();
        this.X = 0;
    }

    @Override
    protected boolean fE() {
        return super.fE() || this.gr();
    }

    @Override
    public boolean eG() {
        return !this.cG.b;
    }

    @Override
    protected ftm a(ftm $$0, chp $$1) {
        double $$3;
        float $$2 = this.eg();
        if (this.cG.b || $$0.h > 0.0 || $$1 != chp.a && $$1 != chp.b || !this.gC() || !this.K($$2)) {
            return $$0;
        }
        double $$4 = $$0.i;
        double $$5 = 0.05;
        double $$6 = Math.signum($$3) * 0.05;
        double $$7 = Math.signum($$4) * 0.05;
        for ($$3 = $$0.g; $$3 != 0.0 && this.p($$3, 0.0, $$2); $$3 -= $$6) {
            if (!(Math.abs($$3) <= 0.05)) continue;
            $$3 = 0.0;
            break;
        }
        while ($$4 != 0.0 && this.p(0.0, $$4, $$2)) {
            if (Math.abs($$4) <= 0.05) {
                $$4 = 0.0;
                break;
            }
            $$4 -= $$7;
        }
        while ($$3 != 0.0 && $$4 != 0.0 && this.p($$3, $$4, $$2)) {
            $$3 = Math.abs($$3) <= 0.05 ? 0.0 : ($$3 -= $$6);
            if (Math.abs($$4) <= 0.05) {
                $$4 = 0.0;
                continue;
            }
            $$4 -= $$7;
        }
        return new ftm($$3, $$0.h, $$4);
    }

    private boolean K(float $$0) {
        return this.aV() || this.an < (double)$$0 && !this.p(0.0, 0.0, (double)$$0 - this.an);
    }

    private boolean p(double $$0, double $$1, double $$2) {
        fth $$3 = this.dj();
        return this.ao().a((cgk)this, new fth($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
    }

    public void e(cgk $$0) {
        if (this.H($$0)) {
            return;
        }
        float $$1 = this.fW() ? this.bX : (float)this.i(cis.d);
        dlt $$2 = this.eq();
        cex $$3 = this.i($$2);
        float $$4 = this.I(0.5f);
        float $$5 = $$4 * (this.a($$0, $$1, $$3) - $$1);
        $$1 *= this.p();
        this.fO();
        if (this.I($$0)) {
            return;
        }
        if ($$1 > 0.0f || $$5 > 0.0f) {
            boolean $$9;
            boolean $$8;
            boolean $$6;
            boolean bl2 = $$6 = $$4 > 0.9f;
            if (this.cA() && $$6) {
                this.c(bda.wO);
                boolean $$7 = true;
            } else {
                $$8 = false;
            }
            $$1 += $$2.h().a($$0, $$1, $$3);
            boolean bl3 = $$9 = $$6 && this.J($$0);
            if ($$9) {
                $$1 *= 1.5f;
            }
            float $$10 = $$1 + $$5;
            boolean $$11 = this.a($$6, $$9, $$8);
            float $$12 = 0.0f;
            if ($$0 instanceof chl) {
                chl $$13 = (chl)$$0;
                $$12 = $$13.eZ();
            }
            ftm $$14 = $$0.dN();
            boolean $$15 = $$0.b($$3, $$10);
            if ($$15) {
                this.a($$0, this.b($$0, $$3) + ($$8 ? 0.5f : 0.0f), $$14);
                if ($$11) {
                    this.a($$0, $$1, $$3, $$4);
                }
                this.a($$0, $$9, $$11, $$6, false, $$5);
                this.C($$0);
                this.a($$0, $$2, $$3, true);
                this.a($$0, $$12);
                this.a(0.1f);
            } else {
                this.c(bda.wP);
            }
        }
        this.fi();
    }

    private void c(bcz $$0) {
        this.ao().a(null, this.dP(), this.dR(), this.dV(), $$0, this.dB(), 1.0f, 1.0f);
    }

    private cex i(dlt $$0) {
        return $$0.a((chl)this, () -> this.en().a(this));
    }

    private boolean H(cgk $$0) {
        if (!$$0.cT()) {
            return true;
        }
        return $$0.w(this);
    }

    private boolean I(cgk $$0) {
        dec $$1;
        if ($$0.ay().a(bdt.I) && $$0 instanceof dec && ($$1 = (dec)$$0).a(ded.c, this, cgr.a(this), true)) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.wP, this.dB());
            return true;
        }
        return false;
    }

    private boolean J(cgk $$0) {
        return this.an > 0.0 && !this.aV() && !this.fl() && !this.by() && !this.hl() && !this.cq() && $$0 instanceof chl && !this.cA();
    }

    private boolean a(boolean $$0, boolean $$1, boolean $$2) {
        double $$4;
        double $$3;
        if ($$0 && !$$1 && !$$2 && this.aV() && ($$3 = this.ag().j()) < bgj.n($$4 = (double)this.fM() * 2.5)) {
            return this.b(cdb.a).a(bdy.ca);
        }
        return false;
    }

    private void a(cgk $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, float $$5) {
        if ($$1) {
            this.c(bda.wN);
            this.b($$0);
        }
        if (!($$1 || $$2 || $$4)) {
            this.c($$3 ? bda.wQ : bda.wS);
        }
        if ($$5 > 0.0f) {
            this.c($$0);
        }
    }

    private void a(cgk $$0, float $$1) {
        if ($$0 instanceof chl) {
            float $$2 = $$1 - ((chl)$$0).eZ();
            this.a(bdk.I, Math.round($$2 * 10.0f));
            if (this.ao() instanceof axf && $$2 > 2.0f) {
                int $$3 = (int)((double)$$2 * 0.5);
                ((axf)this.ao()).a(ly.h, $$0.dP(), $$0.f(0.5), $$0.dV(), $$3, 0.1, 0.0, 0.1, 0.2);
            }
        }
    }

    private void a(cgk $$0, dlt $$1, cex $$2, boolean $$3) {
        cgk $$4 = $$0;
        if ($$0 instanceof cyd) {
            $$4 = ((cyd)$$0).a;
        }
        boolean $$5 = false;
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$6 = (axf)dwo2;
            if ($$4 instanceof chl) {
                chl $$7 = (chl)$$4;
                $$5 = $$1.a($$7, (chl)this);
            }
            if ($$3) {
                dsq.a($$6, $$0, $$2, $$1);
            }
        }
        if (!this.ao().B_() && !$$1.f() && $$4 instanceof chl) {
            if ($$5) {
                $$1.b((chl)$$4, (chl)this);
            }
            if ($$1.f()) {
                if ($$1 == this.fx()) {
                    this.a(cdb.a, dlt.l);
                } else {
                    this.a(cdb.b, dlt.l);
                }
            }
        }
    }

    @Override
    public void a(cgk $$0, float $$1, ftm $$2) {
        if ($$1 > 0.0f) {
            if ($$0 instanceof chl) {
                chl $$3 = (chl)$$0;
                $$3.o($$1, bgj.a((double)(this.ec() * ((float)Math.PI / 180))), -bgj.b((double)(this.ec() * ((float)Math.PI / 180))));
            } else {
                $$0.i(-bgj.a((double)(this.ec() * ((float)Math.PI / 180))) * $$1, 0.1, bgj.b((double)(this.ec() * ((float)Math.PI / 180))) * $$1);
            }
            this.k(this.dN().d(0.6, 1.0, 0.6));
            this.i(false);
        }
        if ($$0 instanceof axg && $$0.ah) {
            ((axg)$$0).g.b(new agr($$0));
            $$0.ah = false;
            $$0.k($$2);
        }
    }

    @Override
    public float fD() {
        return 1.0f;
    }

    /*
     * WARNING - void declaration
     */
    private void a(cgk $$0, float $$1, cex $$2, float $$3) {
        void $$5;
        this.c(bda.wR);
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$4 = (axf)dwo2;
        float $$6 = 1.0f + (float)this.i(cis.F) * $$1;
        List<chl> $$7 = this.ao().a(chl.class, $$0.dj().c(1.0, 0.25, 1.0));
        for (chl $$8 : $$7) {
            float $$10;
            cyy $$9;
            if ($$8 == this || $$8 == $$0 || this.t($$8) || $$8 instanceof cyy && ($$9 = (cyy)$$8).r() || !(this.g($$8) < 9.0) || !$$8.a((axf)$$5, $$2, $$10 = this.a((cgk)$$8, $$6, $$2) * $$3)) continue;
            $$8.o(0.4f, bgj.a((double)(this.ec() * ((float)Math.PI / 180))), -bgj.b((double)(this.ec() * ((float)Math.PI / 180))));
            dsq.a((axf)$$5, (cgk)$$8, $$2);
        }
        double $$11 = -bgj.a((double)(this.ec() * ((float)Math.PI / 180)));
        double $$12 = bgj.b((double)(this.ec() * ((float)Math.PI / 180)));
        $$5.a(ly.an, this.dP() + $$11, this.f(0.5), this.dV() + $$12, 0, $$11, 0.0, $$12, 0.0);
    }

    protected float a(cgk $$0, float $$1, cex $$2) {
        return $$1;
    }

    @Override
    protected void f(chl $$0) {
        this.e((cgk)$$0);
    }

    public void b(cgk $$0) {
    }

    private float p() {
        float $$0 = this.I(0.5f);
        return 0.2f + $$0 * $$0 * 0.8f;
    }

    @Override
    public boolean a(cgv $$0, cgk $$1, float $$2, boolean $$3, boolean $$4, boolean $$5) {
        boolean $$13;
        if (this.H($$1)) {
            return false;
        }
        dlt $$6 = this.a($$0);
        cex $$7 = this.i($$6);
        float $$8 = this.a($$1, $$2, $$7) - $$2;
        if (!this.fZ() || this.ga().a() != $$0) {
            $$8 *= this.I(0.5f);
            $$2 *= this.p();
        }
        if ($$4 && this.I($$1)) {
            return true;
        }
        float $$9 = $$3 ? $$2 + $$8 : 0.0f;
        float $$10 = 0.0f;
        if ($$1 instanceof chl) {
            chl $$11 = (chl)$$1;
            $$10 = $$11.eZ();
        }
        ftm $$12 = $$1.dN();
        boolean bl2 = $$13 = $$3 && $$1.b($$7, $$9);
        if ($$4) {
            this.a($$1, 0.4f + this.b($$1, $$7), $$12);
        }
        boolean $$14 = false;
        if ($$5 && $$1.cq()) {
            $$14 = true;
            $$1.cf();
        }
        if (!($$13 || $$4 || $$14)) {
            return false;
        }
        this.a($$1, false, false, $$3, true, $$8);
        this.C($$1);
        this.a($$1, $$6, $$7, $$13);
        this.a($$1, $$10);
        this.a(0.1f);
        return true;
    }

    public void c(cgk $$0) {
    }

    @Override
    public void a(cgk.e $$0) {
        super.a($$0);
        this.cm.a(this);
        if (this.gN()) {
            this.s();
        }
    }

    @Override
    public boolean aa_() {
        return true;
    }

    @Override
    protected boolean dw() {
        return this.gH();
    }

    public boolean gH() {
        return false;
    }

    @Override
    public boolean dx() {
        return !this.ao().B_() || this.gH();
    }

    @Override
    public boolean dy() {
        return !this.ao().B_() || this.gH();
    }

    public GameProfile gI() {
        return this.cI;
    }

    public bbx gJ() {
        return new bbx(this.cI);
    }

    public ddl gK() {
        return this.cE;
    }

    public ddi gL() {
        return this.cG;
    }

    @Override
    public boolean gv() {
        return this.cG.d;
    }

    public boolean gM() {
        return this.cG.d;
    }

    public void a(dlt $$0, dlt $$1, dht $$2) {
    }

    public boolean gN() {
        return this.cn != this.cm;
    }

    public boolean gO() {
        return true;
    }

    public Either<a, bhr> a(is $$0) {
        this.b($$0);
        this.cF = 0;
        return Either.right((Object)((Object)bhr.a));
    }

    public void a(boolean $$0, boolean $$1) {
        super.gs();
        if (this.ao() instanceof axf && $$1) {
            ((axf)this.ao()).h();
        }
        this.cF = $$0 ? 0 : 100;
    }

    @Override
    public void gs() {
        this.a(true, true);
    }

    public boolean gP() {
        return this.gr() && this.cF >= 100;
    }

    public int gQ() {
        return this.cF;
    }

    public void a(yh $$0, boolean $$1) {
    }

    public void a(amo $$0) {
        this.b(bdk.i.b($$0));
    }

    public void a(amo $$0, int $$1) {
        this.a(bdk.i.b($$0), $$1);
    }

    public void b(bdh<?> $$0) {
        this.a($$0, 1);
    }

    public void a(bdh<?> $$0, int $$1) {
    }

    public void a(bdh<?> $$0) {
    }

    public int a(Collection<dqx<?>> $$0) {
        return 0;
    }

    public void a(dqx<?> $$0, List<dlt> $$1) {
    }

    public void b(List<amt<dqs<?>>> $$0) {
    }

    public int b(Collection<dqx<?>> $$0) {
        return 0;
    }

    @Override
    public void m(ftm $$0) {
        if (this.cq()) {
            super.m($$0);
            return;
        }
        if (this.cB()) {
            double $$2;
            double $$1 = this.cj().h;
            double d2 = $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bM || !this.ao().b_(is.a(this.dP(), this.dR() + 1.0 - 0.1, this.dV())).c()) {
                ftm $$3 = this.dN();
                this.k($$3.b(0.0, ($$1 - $$3.h) * $$2, 0.0));
            }
        }
        if (this.gL().b) {
            double $$4 = this.dN().h;
            super.m($$0);
            this.k(this.dN().a(iz.a.b, $$4 * 0.6));
        } else {
            super.m($$0);
        }
    }

    @Override
    protected boolean fU() {
        return !this.cG.b && super.fU();
    }

    @Override
    public void bF() {
        if (this.cG.b) {
            this.j(false);
        } else {
            super.bF();
        }
    }

    protected boolean h(is $$0) {
        return !this.ao().a_($$0).j(this.ao(), $$0);
    }

    @Override
    public float fM() {
        return (float)this.i(cis.x);
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$2) {
        double $$6;
        boolean $$3;
        if (this.cG.c) {
            return false;
        }
        if ($$0 >= 2.0) {
            this.a(bdk.t, (int)Math.round($$0 * 100.0));
        }
        boolean bl2 = $$3 = this.cz != null && this.cN;
        if ($$3) {
            boolean $$5;
            double $$4 = Math.min($$0, this.cz.h - this.dR());
            boolean bl3 = $$5 = $$4 <= 0.0;
            if ($$5) {
                this.hr();
            } else {
                this.hp();
            }
        } else {
            $$6 = $$0;
        }
        if ($$6 > 0.0 && super.a($$6, $$1, $$2)) {
            this.hr();
            return true;
        }
        this.b($$0, $$1, $$2);
        return false;
    }

    public boolean gR() {
        if (!this.gj() && this.fU() && !this.by()) {
            this.gS();
            return true;
        }
        return false;
    }

    public void gS() {
        this.b(7, true);
    }

    @Override
    protected void bI() {
        if (!this.au()) {
            super.bI();
        }
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        if (this.by()) {
            this.bn();
            this.b($$1);
        } else {
            is $$2 = this.e($$0);
            if (!$$0.equals($$2)) {
                eoh $$3 = this.ao().a_($$2);
                if ($$3.a(bdp.bB)) {
                    this.a($$3, $$1);
                } else {
                    super.b($$2, $$3);
                }
            } else {
                super.b($$0, $$1);
            }
        }
    }

    @Override
    public chl.a fj() {
        return new chl.a(bda.xd, bda.wT);
    }

    @Override
    public boolean a(axf $$0, chl $$1, cex $$2) {
        this.b(bdk.g.b($$1.ay()));
        return true;
    }

    @Override
    public void a(eoh $$0, ftm $$1) {
        if (!this.cG.b) {
            super.a($$0, $$1);
        }
        this.hp();
    }

    public void d(int $$0) {
        this.r($$0);
        this.cu += (float)$$0 / (float)this.gU();
        this.ct = bgj.a(this.ct + $$0, 0, Integer.MAX_VALUE);
        while (this.cu < 0.0f) {
            float $$1 = this.cu * (float)this.gU();
            if (this.cs > 0) {
                this.c(-1);
                this.cu = 1.0f + $$1 / (float)this.gU();
                continue;
            }
            this.c(-1);
            this.cu = 0.0f;
        }
        while (this.cu >= 1.0f) {
            this.cu = (this.cu - 1.0f) * (float)this.gU();
            this.c(1);
            this.cu /= (float)this.gU();
        }
    }

    public int gT() {
        return this.cv;
    }

    public void a(dlt $$0, int $$1) {
        this.cs -= $$1;
        if (this.cs < 0) {
            this.cs = 0;
            this.cu = 0.0f;
            this.ct = 0;
        }
        this.cv = this.as.f();
    }

    public void c(int $$0) {
        this.cs = IntMath.saturatedAdd((int)this.cs, (int)$$0);
        if (this.cs < 0) {
            this.cs = 0;
            this.cu = 0.0f;
            this.ct = 0;
        }
        if ($$0 > 0 && this.cs % 5 == 0 && (float)this.cH < (float)this.at - 100.0f) {
            float $$1 = this.cs > 30 ? 1.0f : (float)this.cs / 30.0f;
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.xc, this.dB(), $$1 * 0.75f, 1.0f);
            this.cH = this.at;
        }
    }

    public int gU() {
        if (this.cs >= 30) {
            return 112 + (this.cs - 30) * 9;
        }
        if (this.cs >= 15) {
            return 37 + (this.cs - 15) * 5;
        }
        return 7 + this.cs * 2;
    }

    public void a(float $$0) {
        if (this.cG.a) {
            return;
        }
        if (!this.ao().B_()) {
            this.co.a($$0);
        }
    }

    @Override
    public void fi() {
        if (this.gV()) {
            super.fi();
        }
    }

    protected boolean gV() {
        return this.gW().b() || this.gL().c;
    }

    public Optional<dcj> ab() {
        return Optional.empty();
    }

    public dhe gW() {
        return this.co;
    }

    public boolean u(boolean $$0) {
        return this.cG.a || $$0 || this.co.c();
    }

    public boolean gX() {
        return this.eZ() > 0.0f && this.eZ() < this.fq();
    }

    public boolean gY() {
        return this.cG.e;
    }

    public boolean a(is $$0, iz $$1, dlt $$2) {
        if (this.cG.e) {
            return true;
        }
        is $$3 = $$0.a($$1.g());
        eol $$4 = new eol(this.ao(), $$3, false);
        return $$2.a($$4);
    }

    @Override
    protected int f(axf $$0) {
        if ($$0.U().a(eua.s).booleanValue() || this.au()) {
            return 0;
        }
        return Math.min(this.cs * 7, 100);
    }

    @Override
    protected boolean eJ() {
        return true;
    }

    @Override
    public boolean de() {
        return true;
    }

    @Override
    protected cgk.d bv() {
        return !this.cG.b && (!this.aV() || !this.cx()) ? cgk.d.d : cgk.d.a;
    }

    public void z() {
    }

    @Override
    public yh ap() {
        return yh.b(this.cI.name());
    }

    @Override
    public String aq() {
        return this.cI.name();
    }

    public diy gZ() {
        return this.cl;
    }

    @Override
    protected boolean b(cgv $$0) {
        return $$0.a() == cgv.a.b;
    }

    public boolean h(dlt $$0) {
        return this.cE.g($$0);
    }

    public abstract @Nullable dwl a();

    @Override
    public boolean au() {
        return this.a() == dwl.d;
    }

    @Override
    public boolean bW() {
        return !this.au() && super.bW();
    }

    @Override
    public boolean cB() {
        return !this.cG.b && !this.au() && super.cB();
    }

    public boolean ha() {
        return this.a() == dwl.b;
    }

    @Override
    public boolean db() {
        return !this.cG.b;
    }

    @Override
    public yh R_() {
        yw $$0 = fum.a(this.cI(), this.ap());
        return this.a($$0);
    }

    private yw a(yw $$0) {
        String $$12 = this.gI().name();
        return $$0.a($$1 -> $$1.a(new yf.i("/tell " + $$12 + " ")).a(this.di()).a($$12));
    }

    @Override
    public String da() {
        return this.gI().name();
    }

    @Override
    protected void G(float $$0) {
        this.aD().a(b, Float.valueOf($$0));
    }

    @Override
    public float fX() {
        return this.aD().a(b).floatValue();
    }

    @Override
    public @Nullable cic a_(int $$0) {
        if ($$0 == 499) {
            return new cic(){

                @Override
                public dlt a() {
                    return ddm.this.cn.g();
                }

                @Override
                public boolean a(dlt $$0) {
                    ddm.this.cn.a($$0);
                    return true;
                }
            };
        }
        final int $$1 = $$0 - 500;
        if ($$1 >= 0 && $$1 < 4) {
            return new cic(){

                @Override
                public dlt a() {
                    return ddm.this.cm.r().a($$1);
                }

                @Override
                public boolean a(dlt $$0) {
                    ddm.this.cm.r().a($$1, $$0);
                    ddm.this.cm.a(ddm.this.cE);
                    return true;
                }
            };
        }
        if ($$0 >= 0 && $$0 < this.cE.j().size()) {
            return this.cE.a_($$0);
        }
        int $$2 = $$0 - 200;
        if ($$2 >= 0 && $$2 < this.cl.b()) {
            return this.cl.a_($$2);
        }
        return super.a_($$0);
    }

    public boolean hb() {
        return this.cJ;
    }

    public void v(boolean $$0) {
        this.cJ = $$0;
    }

    @Override
    public void h(int $$0) {
        super.h(this.cG.a ? Math.min($$0, 1) : $$0);
    }

    protected static Optional<cwy.b> d(uz $$0) {
        cgu $$1;
        if (!$$0.j() && ($$1 = (cgu)$$0.a("id", cgu.a).orElse(null)) == cgu.aW) {
            return $$0.a("Variant", cwy.b.h);
        }
        return Optional.empty();
    }

    protected static OptionalInt a(Optional<cwy.b> $$02) {
        return $$02.map($$0 -> OptionalInt.of($$0.a())).orElse(OptionalInt.empty());
    }

    private static Optional<cwy.b> a(OptionalInt $$0) {
        if ($$0.isPresent()) {
            return Optional.of(cwy.b.a($$0.getAsInt()));
        }
        return Optional.empty();
    }

    public void b(Optional<cwy.b> $$0) {
        this.az.a(d, ddm.a($$0));
    }

    public Optional<cwy.b> hc() {
        return ddm.a(this.az.a(d));
    }

    public void c(Optional<cwy.b> $$0) {
        this.az.a(e, ddm.a($$0));
    }

    public Optional<cwy.b> hd() {
        return ddm.a(this.az.a(e));
    }

    public float he() {
        return (float)(1.0 / this.i(cis.f) * 20.0);
    }

    public boolean c(dlt $$0, int $$1) {
        float $$2 = $$0.a(ki.i, Float.valueOf(0.0f)).floatValue();
        float $$3 = (float)(this.bz + $$1) / this.he();
        return $$2 > 0.0f && $$3 < $$2;
    }

    public float I(float $$0) {
        return bgj.a(((float)this.bz + $$0) / this.he(), 0.0f, 1.0f);
    }

    public float J(float $$0) {
        return bgj.a(((float)this.bA + $$0) / this.he(), 0.0f, 1.0f);
    }

    public void hf() {
        this.bz = 0;
        this.bA = 0;
    }

    @Override
    public void fO() {
        this.hg();
        super.fO();
    }

    public void hg() {
        this.bz = 0;
    }

    public dlq hh() {
        return this.cL;
    }

    @Override
    protected float bi() {
        return this.cG.b || this.gj() ? 1.0f : super.bi();
    }

    @Override
    public float eB() {
        return (float)this.i(cis.s);
    }

    public boolean hi() {
        return this.cG.d && this.I().hasPermission(bbr.b);
    }

    public bbn I() {
        return bbn.g;
    }

    @Override
    public ImmutableList<chx> go() {
        return ImmutableList.of((Object)chx.a, (Object)chx.f, (Object)chx.d);
    }

    @Override
    public dlt d(dlt $$0) {
        if (!($$0.h() instanceof dmo)) {
            return dlt.l;
        }
        Predicate<dlt> $$1 = ((dmo)$$0.h()).c();
        dlt $$2 = dmo.a(this, $$1);
        if (!$$2.f()) {
            return $$2;
        }
        $$1 = ((dmo)$$0.h()).a();
        for (int $$3 = 0; $$3 < this.cE.b(); ++$$3) {
            dlt $$4 = this.cE.a($$3);
            if (!$$1.test($$4)) continue;
            return $$4;
        }
        return this.gv() ? new dlt(dlx.pX) : dlt.l;
    }

    @Override
    public ftm u(float $$0) {
        double $$1 = 0.22 * (this.at() == chb.b ? -1.0 : 1.0);
        float $$2 = bgj.h($$0 * 0.5f, this.ee(), this.ac) * ((float)Math.PI / 180);
        float $$3 = bgj.h($$0, this.bD, this.bC) * ((float)Math.PI / 180);
        if (this.gj() || this.fW()) {
            float $$11;
            ftm $$4 = this.h($$0);
            ftm $$5 = this.dN();
            double $$6 = $$5.j();
            double $$7 = $$4.j();
            if ($$6 > 0.0 && $$7 > 0.0) {
                double $$8 = ($$5.g * $$4.g + $$5.i * $$4.i) / Math.sqrt($$6 * $$7);
                double $$9 = $$5.g * $$4.i - $$5.i * $$4.g;
                float $$10 = (float)(Math.signum($$9) * Math.acos($$8));
            } else {
                $$11 = 0.0f;
            }
            return this.p($$0).e(new ftm($$1, -0.11, 0.85).c(-$$11).a(-$$2).b(-$$3));
        }
        if (this.cC()) {
            return this.p($$0).e(new ftm($$1, 0.2, -0.15).a(-$$2).b(-$$3));
        }
        double $$12 = this.dj().c() - 1.0;
        double $$13 = this.cz() ? -0.2 : 0.07;
        return this.p($$0).e(new ftm($$1, $$12, $$13).b(-$$3));
    }

    @Override
    public boolean el() {
        return true;
    }

    public boolean hj() {
        return this.fZ() && this.gb().a(dlx.tb);
    }

    @Override
    public boolean ek() {
        return false;
    }

    public Optional<jc> hk() {
        return this.cM;
    }

    public void d(Optional<jc> $$0) {
        this.cM = $$0;
    }

    @Override
    public float fg() {
        return this.cy;
    }

    @Override
    public void q(float $$0) {
        super.q($$0);
        this.cy = $$0;
    }

    public boolean hl() {
        return this.d(cfo.o);
    }

    @Override
    public boolean ef() {
        return true;
    }

    @Override
    protected float fL() {
        if (this.cG.b && !this.cq()) {
            return this.cA() ? this.cG.a() * 2.0f : this.cG.a();
        }
        return this.cA() ? 0.025999999f : 0.02f;
    }

    @Override
    public boolean a(elp $$0, is $$1) {
        return $$0.a(this);
    }

    @Override
    public double ar() {
        return this.hm();
    }

    public double hm() {
        return this.i(cis.h);
    }

    public double hn() {
        return this.i(cis.l);
    }

    public boolean b(cgk $$0, double $$1) {
        if ($$0.eh()) {
            return false;
        }
        return this.a($$0.dj(), $$1);
    }

    public boolean a(fth $$0, double $$1) {
        double $$2 = this.hn() + $$1;
        double $$3 = $$0.e(this.bV());
        return $$3 < $$2 * $$2;
    }

    public boolean b(fth $$0, double $$1) {
        return this.fz().a((chl)this, $$0, $$1);
    }

    public boolean a(is $$0, double $$1) {
        double $$2 = this.hm() + $$1;
        return new fth($$0).e(this.bV()) < $$2 * $$2;
    }

    public void w(boolean $$0) {
        this.cN = $$0;
        if ($$0) {
            this.s(40);
        } else {
            this.cO = 0;
        }
    }

    public void s(int $$0) {
        this.cO = Math.max(this.cO, $$0);
    }

    public boolean ho() {
        return this.cN;
    }

    public void hp() {
        if (this.cO == 0) {
            this.hr();
        }
    }

    public boolean hq() {
        return this.cO > 0;
    }

    public void hr() {
        this.cO = 0;
        this.cA = null;
        this.cz = null;
        this.cN = false;
    }

    public boolean hs() {
        return false;
    }

    @Override
    public boolean fl() {
        if (this.cG.b) {
            return false;
        }
        return super.fl();
    }

    public String ht() {
        return MoreObjects.toStringHelper((Object)this).add("name", (Object)this.aq()).add("id", this.aA()).add("pos", (Object)this.dI()).add("mode", (Object)this.a()).add("permission", (Object)this.I()).toString();
    }

    public static final class a
    extends Record {
        private final @Nullable yh e;
        public static final a a = new a(yh.c("block.minecraft.bed.too_far_away"));
        public static final a b = new a(yh.c("block.minecraft.bed.obstructed"));
        public static final a c = new a(null);
        public static final a d = new a(yh.c("block.minecraft.bed.not_safe"));

        public a(@Nullable yh $$0) {
            this.e = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "message", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "message", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "message", "e"}, this, $$0);
        }

        public @Nullable yh a() {
            return this.e;
        }
    }
}

