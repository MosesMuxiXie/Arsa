/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class ctl
extends cht
implements dct,
ett {
    private static final jy e = new jy(1, 1, 1);
    private static final int cv = 5;
    private static final float cw = 55.0f;
    private static final float cx = 15.0f;
    private static final int cy = 0;
    private static final int cz = 6000;
    private static final int cA = 3;
    public static final int a = 1024;
    private static final alw<Boolean> cB = ama.a(ctl.class, aly.k);
    private static final alw<Boolean> cC = ama.a(ctl.class, aly.k);
    protected static final ImmutableList<cse<? extends csd<? super ctl>>> b = ImmutableList.of(cse.c, cse.d, cse.f, cse.b);
    protected static final ImmutableList<cqw<?>> c = ImmutableList.of(cqw.u, cqw.o, cqw.h, cqw.n, cqw.F, cqw.y, cqw.M, cqw.aX, cqw.aY, cqw.aZ, cqw.ba, cqw.aa, (Object[])new cqw[0]);
    public static final ImmutableList<Float> d = ImmutableList.of((Object)Float.valueOf(0.5625f), (Object)Float.valueOf(0.625f), (Object)Float.valueOf(0.75f), (Object)Float.valueOf(0.9375f), (Object)Float.valueOf(1.0f), (Object)Float.valueOf(1.0f), (Object)Float.valueOf(1.125f), (Object)Float.valueOf(1.25f), (Object)Float.valueOf(1.5f), (Object)Float.valueOf(1.875f), (Object)Float.valueOf(2.0f), (Object)Float.valueOf(2.25f), (Object[])new Float[]{Float.valueOf(2.5f), Float.valueOf(3.0f), Float.valueOf(3.75f), Float.valueOf(4.0f)});
    private final eth<ett.b> cD;
    private ett.a cE;
    private final ett.d cF;
    private final eth<a> cG;
    private final cdk cH = new cdk(1);
    private @Nullable is cI;
    private long cJ = 0L;
    private float cK;
    private float cL;
    private float cM;
    private float cN;
    private float cO;

    public ctl(cgu<? extends ctl> $$0, dwo $$1) {
        super((cgu<? extends cht>)$$0, $$1);
        this.cp = new cnn(this, 20, true);
        this.b_(this.gn());
        this.cF = new b();
        this.cE = new ett.a();
        this.cD = new eth<ett.b>(new ett.b(this));
        this.cG = new eth<a>(new a(this.cF.b(), etk.E.a().a()));
    }

    protected cim.b<ctl> ew() {
        return cim.a(c, b);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return ctm.a(this.ew().a($$0));
    }

    public cim<ctl> ev() {
        return super.ev();
    }

    public static cir.a k() {
        return chn.E().a(cis.u, 20.0).a(cis.n, 0.1f).a(cis.x, 0.1f).a(cis.d, 2.0);
    }

    @Override
    protected cre b(dwo $$0) {
        crc $$1 = new crc(this, $$0);
        $$1.e(false);
        $$1.a(true);
        $$1.a(48.0f);
        return $$1;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cB, false);
        $$0.a(cC, true);
    }

    @Override
    public void m(ftm $$0) {
        this.a($$0, this.fM());
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.H($$1.d())) {
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected boolean u(cgk $$0) {
        return this.H($$0) || super.u($$0);
    }

    private boolean H(@Nullable cgk $$0) {
        if ($$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            Optional<UUID> $$2 = this.ev().c(cqw.aX);
            return $$2.isPresent() && $$1.cY().equals($$2.get());
        }
        return false;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
    }

    @Override
    protected bcz W() {
        return this.d(cgv.a) ? bda.a : bda.b;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.d;
    }

    @Override
    protected bcz fd() {
        return bda.c;
    }

    @Override
    protected float fC() {
        return 0.4f;
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("allayBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("allayActivityUpdate");
        ctm.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.ao().B_() && this.cb() && this.at % 10 == 0) {
            this.d(1.0f);
        }
        if (this.gQ() && this.gV() && this.at % 20 == 0) {
            this.x(false);
            this.cI = null;
        }
        this.gW();
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            this.cL = this.cK;
            this.cK = this.p() ? bgj.a(this.cK + 1.0f, 0.0f, 5.0f) : bgj.a(this.cK - 1.0f, 0.0f, 5.0f);
            if (this.gQ()) {
                this.cM += 1.0f;
                this.cO = this.cN;
                this.cN = this.gR() ? (this.cN += 1.0f) : (this.cN -= 1.0f);
                this.cN = bgj.a(this.cN, 0.0f, 15.0f);
            } else {
                this.cM = 0.0f;
                this.cN = 0.0f;
                this.cO = 0.0f;
            }
        } else {
            ett.c.a(this.ao(), this.cE, this.cF);
            if (this.gM()) {
                this.x(false);
            }
        }
    }

    @Override
    public boolean gn() {
        return !this.gU() && this.p();
    }

    public boolean p() {
        return !this.b(cdb.a).f();
    }

    @Override
    protected boolean f(cgv $$0) {
        return false;
    }

    private boolean gU() {
        return this.ev().a(cqw.ba, cqx.a);
    }

    @Override
    protected cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        dlt $$3 = this.b(cdb.a);
        if (this.gQ() && $$2.a(bdy.ax) && this.gZ()) {
            this.gX();
            this.ao().a((cgk)this, (byte)18);
            this.ao().a((cgk)$$0, this, bda.E, bdb.g, 2.0f, 1.0f);
            this.a($$0, $$2);
            return cdc.a;
        }
        if ($$3.f() && !$$2.f()) {
            dlt $$4 = $$2.c(1);
            this.a(cdb.a, $$4);
            this.a($$0, $$2);
            this.ao().a((cgk)$$0, this, bda.e, bdb.g, 2.0f, 1.0f);
            this.ev().a(cqw.aX, $$0.cY());
            return cdc.a;
        }
        if (!$$3.f() && $$1 == cdb.a && $$2.f()) {
            this.a(cgv.a, dlt.l);
            this.ao().a((cgk)$$0, this, bda.f, bdb.g, 2.0f, 1.0f);
            this.a(cdb.a);
            for (dlt $$5 : this.gP().g()) {
                cjf.a((chl)this, $$5, this.dI());
            }
            this.ev().b(cqw.aX);
            $$0.h($$3);
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    public void b(is $$0, boolean $$1) {
        if ($$1) {
            if (!this.gQ()) {
                this.cI = $$0;
                this.x(true);
            }
        } else if ($$0.equals(this.cI) || this.cI == null) {
            this.cI = null;
            this.x(false);
        }
    }

    @Override
    public cdk gP() {
        return this.cH;
    }

    @Override
    protected jy Z() {
        return e;
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        dlt $$2 = this.b(cdb.a);
        return !$$2.f() && $$0.U().a(eua.F) != false && this.cH.c($$1) && this.c($$2, $$1);
    }

    private boolean c(dlt $$0, dlt $$1) {
        return dlt.b($$0, $$1) && !this.d($$0, $$1);
    }

    private boolean d(dlt $$0, dlt $$1) {
        dnr $$3;
        dnr $$2 = $$0.a(ki.Y);
        return !Objects.equals($$2, $$3 = $$1.a(ki.Y));
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        dct.a($$0, this, this, $$1);
    }

    @Override
    public boolean bp() {
        return !this.aV();
    }

    @Override
    public void a(BiConsumer<eth<?>, axf> $$0) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            $$0.accept(this.cD, $$1);
            $$0.accept(this.cG, $$1);
        }
    }

    public boolean gQ() {
        return this.az.a(cB);
    }

    public void x(boolean $$0) {
        if (this.ao().B_() || !this.dy() || $$0 && this.gM()) {
            return;
        }
        this.az.a(cB, $$0);
    }

    private boolean gV() {
        return this.cI == null || !this.cI.a(this.dI(), (double)etk.E.a().a()) || !this.ao().a_(this.cI).a(dzs.ew);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cL, this.cK) / 5.0f;
    }

    public boolean gR() {
        float $$0 = this.cM % 55.0f;
        return $$0 < 15.0f;
    }

    public float M(float $$0) {
        return bgj.h($$0, this.cO, this.cN) / 15.0f;
    }

    @Override
    public boolean a(dlt $$0, dlt $$1) {
        return !this.c($$0, $$1);
    }

    @Override
    protected void g(axf $$0) {
        super.g($$0);
        this.cH.g().forEach($$1 -> this.a($$0, (dlt)$$1));
        dlt $$12 = this.a(cgv.a);
        if (!$$12.f() && !dsq.a($$12, dsp.E)) {
            this.a($$0, $$12);
            this.a(cgv.a, dlt.l);
        }
    }

    @Override
    public boolean i(double $$0) {
        return false;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.a_($$0);
        $$0.a("listener", ett.a.a, this.cE);
        $$0.a("DuplicationCooldown", this.cJ);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a_($$0);
        this.cE = $$0.a("listener", ett.a.a).orElseGet(ett.a::new);
        this.a($$0.a("DuplicationCooldown", 0));
    }

    @Override
    protected boolean gN() {
        return false;
    }

    private void gW() {
        if (!this.ao().B_() && this.cJ > 0L) {
            this.a(this.cJ - 1L);
        }
    }

    private void a(long $$0) {
        this.cJ = $$0;
        this.az.a(cC, $$0 == 0L);
    }

    private void gX() {
        ctl $$0 = cgu.e.a(this.ao(), cgt.e);
        if ($$0 != null) {
            $$0.f(this.dI());
            $$0.gz();
            $$0.gY();
            this.gY();
            this.ao().b($$0);
        }
    }

    private void gY() {
        this.a(6000L);
    }

    private boolean gZ() {
        return this.az.a(cC);
    }

    private void a(ddm $$0, dlt $$1) {
        $$1.a(1, (chl)$$0);
    }

    @Override
    public ftm B() {
        return new ftm(0.0, (double)this.dk() * 0.6, (double)this.dF() * 0.1);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 18) {
            for (int $$1 = 0; $$1 < 3; ++$$1) {
                this.ha();
            }
        } else {
            super.b($$0);
        }
    }

    private void ha() {
        double $$0 = this.as.k() * 0.02;
        double $$1 = this.as.k() * 0.02;
        double $$2 = this.as.k() * 0.02;
        this.ao().a(ly.T, this.e(1.0), this.dS() + 0.5, this.h(1.0), $$0, $$1, $$2);
    }

    @Override
    public ett.a gS() {
        return this.cE;
    }

    @Override
    public ett.d gT() {
        return this.cF;
    }

    class b
    implements ett.d {
        private static final int b = 16;
        private final eto c;

        b() {
            this.c = new eti(ctl.this, ctl.this.dk());
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
        public boolean a(axf $$0, is $$1, jd<etk> $$2, etk.a $$3) {
            if (ctl.this.gG()) {
                return false;
            }
            Optional<jc> $$4 = ctl.this.ev().c(cqw.aY);
            if ($$4.isEmpty()) {
                return true;
            }
            jc $$5 = $$4.get();
            return $$5.a($$0.aq(), ctl.this.dK(), 1024) && $$5.b().equals($$1);
        }

        @Override
        public void a(axf $$0, is $$1, jd<etk> $$2, @Nullable cgk $$3, @Nullable cgk $$4, float $$5) {
            if ($$2.a(etk.H)) {
                ctm.a(ctl.this, new is($$1));
            }
        }

        @Override
        public bef<etk> c() {
            return bdw.e;
        }
    }

    class a
    implements etm {
        private final eto b;
        private final int c;

        public a(eto $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public eto a() {
            return this.b;
        }

        @Override
        public int b() {
            return this.c;
        }

        @Override
        public boolean a(axf $$0, jd<etk> $$1, etk.a $$2, ftm $$3) {
            if ($$1.a(etk.E)) {
                ctl.this.b(is.a($$3), true);
                return true;
            }
            if ($$1.a(etk.F)) {
                ctl.this.b(is.a($$3), false);
                return true;
            }
            return false;
        }
    }
}

