/*
 * Decompiled with CFR 0.152.
 */
public class dgo
extends dgi {
    private static final alw<Boolean> f = ama.a(dgo.class, aly.k);
    private static final int g = 3600;
    private static final int h = 32000;
    private static final short i = 0;
    private static final ftm j = ftm.c;
    private int k = 0;
    public ftm e = j;

    public dgo(cgu<? extends dgo> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(f, false);
    }

    @Override
    public void g() {
        super.g();
        if (!this.ao().B_()) {
            if (this.k > 0) {
                --this.k;
            }
            if (this.k <= 0) {
                this.e = ftm.c;
            }
            this.r(this.k > 0);
        }
        if (this.e() && this.as.a(4) == 0) {
            this.ao().a(ly.ab, this.dP(), this.dR() + 0.8, this.dV(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected double a(axf $$0) {
        return this.by() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
    }

    @Override
    protected dlp p() {
        return dlx.pk;
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.pk);
    }

    @Override
    protected ftm a(ftm $$0) {
        ftm $$2;
        if (this.e.h() > 1.0E-7) {
            this.e = this.m($$0);
            ftm $$1 = $$0.d(0.8, 0.0, 0.8).e(this.e);
            if (this.by()) {
                $$1 = $$1.c(0.1);
            }
        } else {
            $$2 = $$0.d(0.98, 0.0, 0.98);
        }
        return super.a($$2);
    }

    private ftm m(ftm $$0) {
        double $$1 = 1.0E-4;
        double $$2 = 0.001;
        if (this.e.j() > 1.0E-4 && $$0.j() > 0.001) {
            return this.e.i($$0).d().c(this.e.g());
        }
        return this.e;
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (this.a($$0.dI(), $$2)) {
            $$2.a(1, (chl)$$0);
        }
        return cdc.a;
    }

    public boolean a(ftm $$0, dlt $$1) {
        if ($$1.a(bdy.ck) && this.k + 3600 <= 32000) {
            this.k += 3600;
        } else {
            return false;
        }
        if (this.k > 0) {
            this.e = this.dI().d($$0).f();
        }
        return true;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("PushX", this.e.g);
        $$0.a("PushZ", this.e.i);
        $$0.a("Fuel", (short)this.k);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        double $$1 = $$0.a("PushX", dgo.j.g);
        double $$2 = $$0.a("PushZ", dgo.j.i);
        this.e = new ftm($$1, 0.0, $$2);
        this.k = $$0.a("Fuel", (short)0);
    }

    protected boolean e() {
        return this.az.a(f);
    }

    protected void r(boolean $$0) {
        this.az.a(f, $$0);
    }

    @Override
    public eoh w() {
        return (eoh)((eoh)dzs.da.m().b(edd.a, iz.c)).b(edd.b, this.e());
    }
}

