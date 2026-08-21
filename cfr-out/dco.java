/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class dco
extends dcn
implements dcz {
    private static final alw<Boolean> a = ama.a(dco.class, aly.k);
    private static final alw<dcy> f = ama.a(dco.class, aly.t);
    private static final int cv = 3600;
    private static final int cw = 6000;
    private static final int cx = 14;
    private static final int cy = 4;
    private static final int cz = -1;
    private static final int cA = 0;
    private static final Set<cgt> cB = EnumSet.of(cgt.r, new cgt[]{cgt.s, cgt.i, cgt.m, cgt.c, cgt.q});
    private int cC;
    private @Nullable UUID cD;
    private @Nullable cqs cE;
    private @Nullable dvm cF;
    private int cG = 0;

    public dco(cgu<? extends dco> $$0, dwo $$1) {
        super((cgu<? extends dcn>)$$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, false);
        $$0.a(f, this.hb());
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("VillagerData", dcy.c, this.gZ());
        $$0.b("Offers", dvm.a, this.cF);
        $$0.b("Gossips", cqs.a, this.cE);
        $$0.a("ConversionTime", this.gS() ? this.cC : -1);
        $$0.b("ConversionPlayer", jx.a, this.cD);
        $$0.a("Xp", this.cG);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.az.a(f, $$0.a("VillagerData", dcy.c).orElseGet(this::hb));
        this.cF = $$0.a("Offers", dvm.a).orElse(null);
        this.cE = $$0.a("Gossips", cqs.a).orElse(null);
        int $$1 = $$0.a("ConversionTime", -1);
        if ($$1 != -1) {
            UUID $$2 = $$0.a("ConversionPlayer", jx.a).orElse(null);
            this.b($$2, $$1);
        } else {
            this.aD().a(a, false);
            this.cC = -1;
        }
        this.cG = $$0.a("Xp", 0);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if (!cB.contains((Object)$$2)) {
            this.a(this.gZ().a($$0.J_(), ddc.a($$0.z(this.dK()))));
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    private dcy hb() {
        Optional $$0 = mi.y.a(this.as);
        dcy $$1 = dcx.gX();
        if ($$0.isPresent()) {
            $$1 = $$1.b($$0.get());
        }
        return $$1;
    }

    @Override
    public void g() {
        if (!this.ao().B_() && this.cb() && this.gS()) {
            int $$0 = this.hc();
            this.cC -= $$0;
            if (this.cC <= 0) {
                this.i((axf)this.ao());
            }
        }
        super.g();
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.rK)) {
            if (this.d(cfo.r)) {
                $$2.a(1, (chl)$$0);
                if (!this.ao().B_()) {
                    this.b($$0.cY(), this.as.a(2401) + 3600);
                }
                return cdc.b;
            }
            return cdc.c;
        }
        return super.b($$0, $$1);
    }

    @Override
    protected boolean gR() {
        return false;
    }

    @Override
    public boolean i(double $$0) {
        return !this.gS() && this.cG == 0;
    }

    public boolean gS() {
        return this.aD().a(a);
    }

    private void b(@Nullable UUID $$0, int $$1) {
        this.cD = $$0;
        this.cC = $$1;
        this.aD().a(a, true);
        this.g(cfo.r);
        this.a(new cfm(cfo.e, $$1, Math.min(this.ao().av().a() - 1, 0)));
        this.ao().a((cgk)this, (byte)16);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 16) {
            if (!this.bq()) {
                this.ao().a(this.dP(), this.dT(), this.dV(), bda.Hn, this.dB(), 1.0f + this.as.i(), this.as.i() * 0.7f + 0.3f, false);
            }
            return;
        }
        super.b($$0);
    }

    private void i(axf $$0) {
        this.a(cgu.bL, cge.a(this, false, false), (T $$1) -> {
            ddm $$4;
            for (cgv $$2 : this.a($$0, (dlt $$0) -> !dsq.a($$0, dsp.F))) {
                cic $$3 = $$1.a_($$2.b() + 300);
                if ($$3 == null) continue;
                $$3.a(this.a($$2));
            }
            $$1.a(this.gZ());
            if (this.cE != null) {
                $$1.a(this.cE);
            }
            if (this.cF != null) {
                $$1.b(this.cF.a());
            }
            $$1.s(this.cG);
            $$1.a((dxf)$$0, $$0.c($$1.dK()), cgt.i, null);
            $$1.i($$0);
            if (this.cD != null && ($$4 = $$0.c(this.cD)) instanceof axg) {
                aj.s.a((axg)$$4, this, (dcx)$$1);
                $$0.a(csu.a, (cgk)$$4, (cia)((Object)$$1));
            }
            $$1.a(new cfm(cfo.i, 200, 0));
            if (!this.bq()) {
                $$0.a(null, 1027, this.dK(), 0);
            }
        });
    }

    @VisibleForTesting
    public void d(int $$0) {
        this.cC = $$0;
    }

    private int hc() {
        int $$0 = 1;
        if (this.as.i() < 0.01f) {
            int $$1 = 0;
            is.a $$2 = new is.a();
            for (int $$3 = (int)this.dP() - 4; $$3 < (int)this.dP() + 4 && $$1 < 14; ++$$3) {
                for (int $$4 = (int)this.dR() - 4; $$4 < (int)this.dR() + 4 && $$1 < 14; ++$$4) {
                    for (int $$5 = (int)this.dV() - 4; $$5 < (int)this.dV() + 4 && $$1 < 14; ++$$5) {
                        eoh $$6 = this.ao().a_($$2.d($$3, $$4, $$5));
                        if (!$$6.a(dzs.fC) && !($$6.b() instanceof dzj)) continue;
                        if (this.as.i() < 0.3f) {
                            ++$$0;
                        }
                        ++$$1;
                    }
                }
            }
        }
        return $$0;
    }

    @Override
    public float fD() {
        if (this.e_()) {
            return (this.as.i() - this.as.i()) * 0.2f + 2.0f;
        }
        return (this.as.i() - this.as.i()) * 0.2f + 1.0f;
    }

    @Override
    public bcz W() {
        return bda.Hl;
    }

    @Override
    public bcz h(cex $$0) {
        return bda.Hp;
    }

    @Override
    public bcz fd() {
        return bda.Ho;
    }

    @Override
    public bcz gP() {
        return bda.Hq;
    }

    public void a(dvm $$0) {
        this.cF = $$0;
    }

    public void a(cqs $$0) {
        this.cE = $$0;
    }

    @Override
    public void a(dcy $$0) {
        dcy $$1 = this.gZ();
        if (!$$1.b().equals($$0.b())) {
            this.cF = null;
        }
        this.az.a(f, $$0);
    }

    @Override
    public dcy gZ() {
        return this.az.a(f);
    }

    public int ha() {
        return this.cG;
    }

    public void r(int $$0) {
        this.cG = $$0;
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aC) {
            return dco.c($$0, this.gZ().a());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aC);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aC) {
            jd<ddc> $$2 = dco.c(ki.aC, $$1);
            this.a(this.gZ().a($$2));
            return true;
        }
        return super.b($$0, $$1);
    }
}

