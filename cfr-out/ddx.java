/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ddx
extends cgk
implements dea {
    private static final float a = 12.25f;
    private static final float b = 8.0f;
    private static final float c = 12.0f;
    private static final alw<dlt> d = ama.a(ddx.class, aly.h);
    private @Nullable ftm e;
    private int f;
    private boolean g;

    public ddx(cgu<? extends ddx> $$0, dwo $$1) {
        super($$0, $$1);
    }

    public ddx(dwo $$0, double $$1, double $$2, double $$3) {
        this((cgu<? extends ddx>)cgu.aa, $$0);
        this.a_($$1, $$2, $$3);
    }

    public void a(dlt $$0) {
        if ($$0.f()) {
            this.aD().a(d, this.f());
        } else {
            this.aD().a(d, $$0.c(1));
        }
    }

    @Override
    public dlt e() {
        return this.aD().a(d);
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(d, this.f());
    }

    @Override
    public boolean a(double $$0) {
        if (this.at < 2 && $$0 < 12.25) {
            return false;
        }
        double $$1 = this.dj().a() * 4.0;
        if (Double.isNaN($$1)) {
            $$1 = 4.0;
        }
        return $$0 < ($$1 *= 64.0) * $$1;
    }

    public void a(ftm $$0) {
        ftm $$1 = $$0.d(this.dI());
        double $$2 = $$1.i();
        this.e = $$2 > 12.0 ? this.dI().b($$1.g / $$2 * 12.0, 8.0, $$1.i / $$2 * 12.0) : $$0;
        this.f = 0;
        this.g = this.as.a(5) > 0;
    }

    @Override
    public void g() {
        super.g();
        ftm $$0 = this.dI().e(this.dN());
        if (!this.ao().B_() && this.e != null) {
            this.k(ddx.a(this.dN(), $$0, this.e));
        }
        if (this.ao().B_()) {
            ftm $$1 = $$0.d(this.dN().c(0.25));
            this.b($$1, this.dN());
        }
        this.b($$0);
        if (!this.ao().B_()) {
            ++this.f;
            if (this.f > 80 && !this.ao().B_()) {
                this.a(bda.jP, 1.0f, 1.0f);
                this.aC();
                if (this.g) {
                    this.ao().b(new czl(this.ao(), this.dP(), this.dR(), this.dV(), this.e()));
                } else {
                    this.ao().c(2003, this.dK(), 0);
                }
            }
        }
    }

    private void b(ftm $$0, ftm $$1) {
        if (this.by()) {
            for (int $$2 = 0; $$2 < 4; ++$$2) {
                this.ao().a(ly.d, $$0.g, $$0.h, $$0.i, $$1.g, $$1.h, $$1.i);
            }
        } else {
            this.ao().a(ly.ag, $$0.g + this.as.j() * 0.6 - 0.3, $$0.h - 0.5, $$0.i + this.as.j() * 0.6 - 0.3, $$1.g, $$1.h, $$1.i);
        }
    }

    private static ftm a(ftm $$0, ftm $$1, ftm $$2) {
        ftm $$3 = new ftm($$2.g - $$1.g, 0.0, $$2.i - $$1.i);
        double $$4 = $$3.g();
        double $$5 = bgj.d(0.0025, $$0.i(), $$4);
        double $$6 = $$0.h;
        if ($$4 < 1.0) {
            $$5 *= 0.8;
            $$6 *= 0.8;
        }
        double $$7 = $$1.h - $$0.h < $$2.h ? 1.0 : -1.0;
        return $$3.c($$5 / $$4).b(0.0, $$6 + ($$7 - $$6) * 0.015, 0.0);
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("Item", dlt.b, this.e());
    }

    @Override
    protected void a(fnq $$0) {
        this.a($$0.a("Item", dlt.b).orElse(this.f()));
    }

    private dlt f() {
        return new dlt(dlx.uw);
    }

    @Override
    public float bO() {
        return 1.0f;
    }

    @Override
    public boolean cT() {
        return false;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }
}

