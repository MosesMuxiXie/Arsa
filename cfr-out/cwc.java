/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class cwc
extends cwb
implements cgd,
cib {
    private static final long b = -2L;
    private static final long c = -1L;
    private static final int d = 504000;
    private static final int e = 552000;
    private static final int f = 200;
    private static final int cv = 240;
    private static final float cw = 10.0f;
    private static final float cx = 0.0058f;
    private static final int cy = 60;
    private static final int cz = 100;
    private static final alw<ejq.a> cA = ama.a(cwc.class, aly.H);
    private static final alw<cwg> cB = ama.a(cwc.class, aly.I);
    private @Nullable is cC;
    private @Nullable UUID cD;
    private long cE = -1L;
    private int cF = 0;
    private final cfz cG = new cfz();
    private final cfz cH = new cfz();
    private final cfz cI = new cfz();
    private final cfz cJ = new cfz();
    private final cfz cK = new cfz();
    public static final cgv a = cgv.h;

    public cwc(cgu<? extends cwb> $$0, dwo $$1) {
        super($$0, $$1);
        this.N().a(48.0f);
        this.N().e(true);
        this.gz();
        this.a(cwg.a);
        this.a(fls.n, 16.0f);
        this.a(fls.p, 16.0f);
        this.a(fls.o, -1.0f);
        this.ev().a(cqw.ae, this.ep().b(60, 100));
    }

    public static cir.a k() {
        return chn.E().a(cis.x, 0.2f).a(cis.D, 1.0).a(cis.u, 12.0);
    }

    public cwg p() {
        return this.az.a(cB);
    }

    public void a(cwg $$0) {
        this.az.a(cB, $$0);
    }

    public ejq.a gP() {
        return this.az.a(cA);
    }

    public void a(ejq.a $$0) {
        this.az.a(cA, $$0);
    }

    public void h(is $$0) {
        this.cC = $$0;
    }

    public void gQ() {
        this.cC = null;
    }

    public cfz gR() {
        return this.cG;
    }

    public cfz gS() {
        return this.cH;
    }

    public cfz gT() {
        return this.cI;
    }

    public cfz gU() {
        return this.cJ;
    }

    public cfz gV() {
        return this.cK;
    }

    protected cim.b<cwc> ew() {
        return cwd.a();
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cwd.a(this.ew().a($$0));
    }

    public cim<cwc> ev() {
        return super.ev();
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cA, ejq.a.a);
        $$0.a(cB, cwg.a);
    }

    @Override
    public void a(fns $$0) {
        super.a($$0);
        $$0.a("next_weather_age", this.cE);
        $$0.a("weather_state", ejq.a.f, this.gP());
    }

    @Override
    public void a(fnq $$0) {
        super.a($$0);
        this.cE = $$0.a("next_weather_age", -1L);
        this.a($$0.a("weather_state", ejq.a.f).orElse(ejq.a.a));
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("copperGolemBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("copperGolemActivityUpdate");
        cwd.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            if (!this.gG()) {
                this.gX();
            }
        } else {
            this.a((axf)this.ao(), this.ao().G_(), this.ao().au());
        }
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        ejq.a $$6;
        dlt $$3;
        dlt $$2 = $$0.b($$1);
        if ($$2.f() && !($$3 = this.fx()).f()) {
            cjf.a((chl)this, $$3, $$0.dI());
            this.a(cdb.a, dlt.l);
            return cdc.a;
        }
        dwo $$4 = this.ao();
        if ($$2.a(dlx.tZ) && this.a()) {
            if ($$4 instanceof axf) {
                axf $$5 = (axf)$$4;
                this.a($$5, bdb.h, $$2);
                this.a(etk.M, (cgk)$$0);
                $$2.a(1, (chl)$$0, $$1);
            }
            return cdc.a;
        }
        if ($$4.B_()) {
            return cdc.e;
        }
        if ($$2.a(dlx.zf) && this.cE != -2L) {
            $$4.a((cgk)this, 3003, this.dK(), 0);
            this.cE = -2L;
            this.a($$0, $$1, $$2);
            return cdc.b;
        }
        if ($$2.a(bdy.cb) && this.cE == -2L) {
            $$4.a(null, this, bda.aL, this.dB(), 1.0f, 1.0f);
            $$4.a((cgk)this, 3004, this.dK(), 0);
            this.cE = -1L;
            $$2.a(1, (chl)$$0, $$1.a());
            return cdc.b;
        }
        if ($$2.a(bdy.cb) && ($$6 = this.gP()) != ejq.a.a) {
            $$4.a(null, this, bda.aL, this.dB(), 1.0f, 1.0f);
            $$4.a((cgk)this, 3005, this.dK(), 0);
            this.cE = -1L;
            this.az.a(cA, $$6.b(), true);
            $$2.a(1, (chl)$$0, $$1.a());
            return cdc.b;
        }
        return super.b($$0, $$1);
    }

    private void a(axf $$0, bgr $$1, long $$2) {
        if (this.cE == -2L) {
            return;
        }
        if (this.cE == -1L) {
            this.cE = $$2 + (long)$$1.a(504000, 552000);
            return;
        }
        ejq.a $$3 = this.az.a(cA);
        boolean $$4 = $$3.equals(ejq.a.d);
        if ($$2 >= this.cE && !$$4) {
            ejq.a $$5 = $$3.a();
            boolean $$6 = $$5.equals(ejq.a.d);
            this.a($$5);
            long l2 = this.cE = $$6 ? 0L : this.cE + (long)$$1.a(504000, 552000);
        }
        if ($$4 && this.c((dwo)$$0)) {
            this.h($$0);
        }
    }

    private boolean c(dwo $$0) {
        return $$0.a_(this.dK()).l() && $$0.y.i() <= 0.0058f;
    }

    private void h(axf $$0) {
        is $$1 = this.dK();
        $$0.a($$1, (eoh)((eoh)dzs.tD.m().b(ebh.c, ebh.a.values()[this.as.b(0, ebh.a.values().length)])).b(ebh.b, iz.a(this.ec())), 3);
        elb elb2 = $$0.c_($$1);
        if (elb2 instanceof elq) {
            elq $$2 = (elq)elb2;
            $$2.a(this);
            this.b($$0);
            this.aC();
            this.a(bda.gM);
            if (this.S_()) {
                if ($$0.U().a(eua.k).booleanValue()) {
                    this.o();
                } else {
                    this.r();
                }
            }
        }
    }

    private void gX() {
        switch (this.p()) {
            case a: {
                this.cI.a();
                this.cH.a();
                this.cJ.a();
                this.cK.a();
                if (this.cF == this.at) {
                    this.cG.a(this.at);
                } else if (this.cF == 0) {
                    this.cF = this.at + this.as.b(200, 240);
                }
                if ((float)this.at != (float)this.cF + 10.0f) break;
                this.gY();
                this.cF = 0;
                break;
            }
            case b: {
                this.cG.a();
                this.cF = 0;
                this.cI.a();
                this.cJ.a();
                this.cK.a();
                this.cH.b(this.at);
                break;
            }
            case c: {
                this.cG.a();
                this.cF = 0;
                this.cH.a();
                this.cK.a();
                this.cJ.a();
                this.cI.b(this.at);
                break;
            }
            case d: {
                this.cG.a();
                this.cF = 0;
                this.cH.a();
                this.cI.a();
                this.cK.a();
                this.cJ.b(this.at);
                break;
            }
            case e: {
                this.cG.a();
                this.cF = 0;
                this.cH.a();
                this.cI.a();
                this.cJ.a();
                this.cK.b(this.at);
            }
        }
    }

    public void b(ejq.a $$0) {
        this.a($$0);
        this.gW();
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.gW();
        return super.a($$0, $$1, $$2, $$3);
    }

    public void gW() {
        this.a(bda.gS);
    }

    private void gY() {
        if (!this.bq()) {
            this.ao().a(this.dP(), this.dR(), this.dV(), this.gZ(), this.dB(), 1.0f, 1.0f, false);
        }
    }

    @Override
    protected bcz h(cex $$0) {
        return cwf.a(this.gP()).b();
    }

    @Override
    protected bcz fd() {
        return cwf.a(this.gP()).c();
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(cwf.a(this.gP()).d(), 1.0f, 1.0f);
    }

    private bcz gZ() {
        return cwf.a(this.gP()).a();
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.75f * this.dk(), 0.0);
    }

    @Override
    public boolean a(elp $$0, is $$1) {
        if (this.cC == null) {
            return false;
        }
        eoh $$2 = this.ao().a_(this.cC);
        return this.cC.equals($$1) || $$2.b() instanceof eau && $$2.c(eau.d) != eoz.a && eau.b(this.cC, $$2).equals($$1);
    }

    @Override
    public double ar() {
        return 3.0;
    }

    @Override
    public void a(axf $$0, bdb $$1, dlt $$2) {
        $$0.a(null, this, bda.gT, $$1, 1.0f, 1.0f);
        dlt $$3 = this.a(a);
        this.a(a, dlt.l);
        this.a($$0, $$3, 1.5f);
    }

    @Override
    public boolean a() {
        return this.cb() && this.a(a).a(bdy.cs);
    }

    @Override
    protected void g(axf $$0) {
        super.g($$0);
        this.b($$0);
    }

    @Override
    protected void c(axf $$0, cex $$1, float $$2) {
        super.c($$0, $$1, $$2);
        this.a(cwg.a);
    }

    @Override
    public void a(axf $$0, chk $$1) {
        super.a($$0, $$1);
        UUID $$2 = $$1.cY();
        if (!$$2.equals(this.cD)) {
            this.cD = $$2;
            ejq.a $$3 = this.gP();
            if ($$3 != ejq.a.a) {
                this.cE = -1L;
                this.az.a(cA, $$3.b(), true);
            }
        }
    }
}

