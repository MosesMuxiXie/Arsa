/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class cuo
extends cup {
    private static final alw<Boolean> cv = ama.a(cuo.class, aly.k);
    private static final boolean cw = false;
    private final cgn cx;

    protected cuo(cgu<? extends cuo> $$0, dwo $$1) {
        super((cgu<? extends cup>)$$0, $$1);
        this.cQ = false;
        this.cx = $$0.n().a(cgm.a().a(cgl.a, 0.0f, $$0.m() - 0.15625f, 0.0f)).a(0.5f);
    }

    @Override
    protected void a(bgr $$0) {
        this.h(cis.u).a(cuo.a($$0::a));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cv, false);
    }

    public static cir.a p() {
        return cuo.hx().a(cis.x, 0.175f).a(cis.q, 0.5);
    }

    public boolean gP() {
        return this.az.a(cv);
    }

    public void x(boolean $$0) {
        this.az.a(cv, $$0);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? this.cx : super.b($$0);
    }

    @Override
    protected void g(axf $$0) {
        super.g($$0);
        if (this.gP()) {
            this.a($$0, dzs.cS);
            this.x(false);
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("ChestedHorse", this.gP());
        if (this.gP()) {
            fns.a<cdd> $$1 = $$0.a("Items", cdd.a);
            for (int $$2 = 0; $$2 < this.cM.b(); ++$$2) {
                dlt $$3 = this.cM.a($$2);
                if ($$3.f()) continue;
                $$1.a(new cdd($$2, $$3));
            }
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("ChestedHorse", false));
        this.hv();
        if (this.gP()) {
            for (cdd $$1 : $$0.c("Items", cdd.a)) {
                if (!$$1.a(this.cM.b())) continue;
                this.cM.a($$1.a(), $$1.b());
            }
        }
    }

    @Override
    public @Nullable cic a_(int $$0) {
        if ($$0 == 499) {
            return new cic(){

                @Override
                public dlt a() {
                    return cuo.this.gP() ? new dlt(dlx.ft) : dlt.l;
                }

                @Override
                public boolean a(dlt $$0) {
                    if ($$0.f()) {
                        if (cuo.this.gP()) {
                            cuo.this.x(false);
                            cuo.this.hv();
                        }
                        return true;
                    }
                    if ($$0.a(dlx.ft)) {
                        if (!cuo.this.gP()) {
                            cuo.this.x(true);
                            cuo.this.hv();
                        }
                        return true;
                    }
                    return false;
                }
            };
        }
        return super.a_($$0);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        boolean $$2;
        boolean bl2 = $$2 = !this.e_() && this.hn() && $$0.gA();
        if (this.cr() || $$2) {
            return super.b($$0, $$1);
        }
        dlt $$3 = $$0.b($$1);
        if (!$$3.f()) {
            if (this.j($$3)) {
                return this.c($$0, $$3);
            }
            if (!this.hn()) {
                this.hD();
                return cdc.a;
            }
            if (!this.gP() && $$3.a(dlx.ft)) {
                this.d($$0, $$3);
                return cdc.a;
            }
        }
        return super.b($$0, $$1);
    }

    private void d(ddm $$0, dlt $$1) {
        this.x(true);
        this.gQ();
        $$1.a(1, (chl)$$0);
        this.hv();
    }

    @Override
    public ftm[] A() {
        return chj.a(this, 0.04, 0.41, 0.18, 0.73);
    }

    protected void gQ() {
        this.a(bda.iG, 1.0f, (this.as.i() - this.as.i()) * 0.2f + 1.0f);
    }

    @Override
    public int ad_() {
        return this.gP() ? 5 : 0;
    }
}

