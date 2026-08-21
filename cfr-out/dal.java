/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dal
extends czz {
    private static final int cv = 20;
    private static final int cw = 1;
    private static final int cx = 20;
    private static final int cy = 3;
    private static final int cz = 5;
    private static final int cA = 10;
    private static final float cB = 3.0f;
    private static final int cC = 1;
    private static final int cD = 80;
    public cfz a = new cfz();
    public cfz b = new cfz();
    public cfz c = new cfz();
    public cfz d = new cfz();
    public cfz e = new cfz();
    public cfz f = new cfz();
    private int cE = 0;
    private int cF = 0;
    private static final ded cG = ($$0, $$1, $$2) -> {
        $$1.ao().a(null, $$1, bda.cR, $$1.dB(), 1.0f, 1.0f);
        ded.b.deflect($$0, $$1, $$2);
    };

    public static cir.a k() {
        return chn.E().a(cis.x, 0.63f).a(cis.u, 30.0).a(cis.o, 24.0).a(cis.d, 3.0);
    }

    public dal(cgu<? extends czz> $$0, dwo $$1) {
        super($$0, $$1);
        this.a(fls.z, -1.0f);
        this.a(fls.o, -1.0f);
        this.cn = 10;
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return dam.a(this, this.ew().a($$0));
    }

    public cim<dal> ev() {
        return super.ev();
    }

    protected cim.b<dal> ew() {
        return cim.a(dam.f, dam.e);
    }

    @Override
    public void a(alw<?> $$0) {
        if (this.ao().B_() && aE.equals($$0)) {
            this.gT();
            chx $$1 = this.aF();
            switch ($$1) {
                case q: {
                    this.e.b(this.at);
                    break;
                }
                case r: {
                    this.f.b(this.at);
                    break;
                }
                case p: {
                    this.b.b(this.at);
                }
            }
        }
        super.a($$0);
    }

    private void gT() {
        this.e.a();
        this.a.a();
        this.f.a();
        this.d.a();
    }

    @Override
    public void g() {
        chx $$0 = this.aF();
        switch ($$0) {
            case p: {
                this.a(20);
                break;
            }
            case q: 
            case r: 
            case a: {
                this.p().a(1 + this.ep().a(1));
                break;
            }
            case g: {
                this.d.b(this.at);
                this.gP();
            }
        }
        this.a.b(this.at);
        if ($$0 != chx.p && this.b.b()) {
            this.c.a(this.at);
            this.b.a();
        }
        int n2 = this.cF = this.cF == 0 ? this.as.a(1, 80) : this.cF - 1;
        if (this.cF == 0) {
            this.gQ();
        }
        super.g();
    }

    public dal p() {
        this.cE = 0;
        return this;
    }

    public void gP() {
        if (++this.cE > 5) {
            return;
        }
        eoh $$0 = !this.dL().l() ? this.dL() : this.bK();
        ftm $$1 = this.dN();
        ftm $$2 = this.dI().e($$1).b(0.0, 0.1f, 0.0);
        for (int $$3 = 0; $$3 < 3; ++$$3) {
            this.ao().a(new lp(ly.b, $$0), $$2.g, $$2.h, $$2.i, 0.0, 0.0, 0.0);
        }
    }

    public void a(int $$0) {
        eoh $$3;
        if (this.cq()) {
            return;
        }
        ftm $$1 = this.dj().f();
        ftm $$2 = new ftm($$1.g, this.dI().h, $$1.i);
        eoh eoh2 = $$3 = !this.dL().l() ? this.dL() : this.bK();
        if ($$3.o() == egf.a) {
            return;
        }
        for (int $$4 = 0; $$4 < $$0; ++$$4) {
            this.ao().a(new lp(ly.b, $$3), $$2.g, $$2.h, $$2.i, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void T() {
        if (this.ag_() != null && this.aV()) {
            return;
        }
        this.ao().a(this, this.W(), this.dB(), 1.0f, 1.0f);
    }

    public void gQ() {
        float $$0 = 0.7f + 0.4f * this.as.i();
        float $$1 = 0.8f + 0.2f * this.as.i();
        this.ao().a(this, bda.db, this.dB(), $$1, $$0);
    }

    @Override
    public ded a(dec $$0) {
        if ($$0.ay() == cgu.u || $$0.ay() == cgu.bP) {
            return ded.a;
        }
        return this.ay().a(bdt.s) ? cG : ded.a;
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected bcz fd() {
        return bda.cZ;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.da;
    }

    @Override
    protected bcz W() {
        return this.aV() ? bda.cT : bda.cU;
    }

    public Optional<chl> gR() {
        return this.ev().c(cqw.y).map(cex::d).filter($$0 -> $$0 instanceof chl).map($$0 -> (chl)$$0);
    }

    public boolean o(ftm $$0) {
        ftm $$1 = this.dK().b();
        return $$0.a($$1, 4.0, 10.0);
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("breezeBrain");
        this.ev().a($$0, this);
        $$1.b("breezeActivityUpdate");
        dam.a(this);
        $$1.c();
        super.a($$0);
    }

    @Override
    public boolean a(cgu<?> $$0) {
        return $$0 == cgu.cb || $$0 == cgu.au;
    }

    @Override
    public int ae() {
        return 30;
    }

    @Override
    public int ai() {
        return 25;
    }

    public double gS() {
        return this.dR() + (double)(this.dG() / 2.0f) + (double)0.3f;
    }

    @Override
    public boolean a(axf $$0, cex $$1) {
        return $$1.d() instanceof dal || super.a($$0, $$1);
    }

    @Override
    public double dE() {
        return this.dk();
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$2) {
        if ($$0 > 3.0) {
            this.a(bda.cX, 1.0f, 1.0f);
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }

    @Override
    public void a(axf $$0, bxh.a $$1) {
        super.a($$0, $$1);
        $$1.a(bxf.d, () -> new bwv(this.ev().c(cqw.p).map(cgk::aA), this.ev().c(cqw.bl)));
    }
}

