/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collection;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class dek
extends deh {
    private static final alw<Byte> f = ama.a(dek.class, aly.a);
    private static final alw<Boolean> g = ama.a(dek.class, aly.k);
    private static final float h = 0.99f;
    private static final boolean i = false;
    private boolean j = false;
    public int e;

    public dek(cgu<? extends dek> $$0, dwo $$1) {
        super((cgu<? extends deh>)$$0, $$1);
    }

    public dek(dwo $$0, chl $$1, dlt $$2) {
        super(cgu.bH, $$1, $$0, $$2, null);
        this.az.a(f, this.b($$2));
        this.az.a(g, $$2.C());
    }

    public dek(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        super(cgu.bH, $$1, $$2, $$3, $$0, $$4, $$4);
        this.az.a(f, this.b($$4));
        this.az.a(g, $$4.C());
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(f, (byte)0);
        $$0.a(g, false);
    }

    @Override
    public void g() {
        if (this.b > 4) {
            this.j = true;
        }
        cgk $$0 = this.p();
        byte $$1 = this.az.a(f);
        if ($$1 > 0 && (this.j || this.z()) && $$0 != null) {
            if (!this.B()) {
                dwo dwo2 = this.ao();
                if (dwo2 instanceof axf) {
                    axf $$2 = (axf)dwo2;
                    if (this.c == deh.a.b) {
                        this.a($$2, this.s(), 0.1f);
                    }
                }
                this.aC();
            } else {
                if (!($$0 instanceof ddm) && this.dI().f($$0.bV()) < (double)$$0.dF() + 1.0) {
                    this.aC();
                    return;
                }
                this.s(true);
                ftm $$3 = $$0.bV().d(this.dI());
                this.n(this.dP(), this.dR() + $$3.h * 0.015 * (double)$$1, this.dV());
                double $$4 = 0.05 * (double)$$1;
                this.k(this.dN().c(0.95).e($$3.d().c($$4)));
                if (this.e == 0) {
                    this.a(bda.CU, 10.0f, 1.0f);
                }
                ++this.e;
            }
        }
        super.g();
    }

    private boolean B() {
        cgk $$0 = this.p();
        if ($$0 == null || !$$0.cb()) {
            return false;
        }
        return !($$0 instanceof axg) || !$$0.au();
    }

    public boolean A() {
        return this.az.a(g);
    }

    @Override
    protected @Nullable ftj b(ftm $$0, ftm $$1) {
        if (this.j) {
            return null;
        }
        return super.b($$0, $$1);
    }

    @Override
    protected Collection<ftj> c(ftm $$0, ftm $$1) {
        ftj $$2 = this.b($$0, $$1);
        if ($$2 != null) {
            return List.of($$2);
        }
        return List.of();
    }

    @Override
    protected void a(ftj $$0) {
        cgk $$12 = $$0.a();
        float $$2 = 8.0f;
        cgk $$3 = this.p();
        cex $$4 = this.en().a((cgk)this, $$3 == null ? this : $$3);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$5 = (axf)dwo2;
            $$2 = dsq.a($$5, this.eq(), $$12, $$4, $$2);
        }
        this.j = true;
        if ($$12.b($$4, $$2)) {
            if ($$12.ay() == cgu.R) {
                return;
            }
            dwo2 = this.ao();
            if (dwo2 instanceof axf) {
                axf $$6 = (axf)dwo2;
                dsq.a($$6, $$12, $$4, this.eq(), (dlp $$1) -> this.c($$6));
            }
            if ($$12 instanceof chl) {
                chl $$7 = (chl)$$12;
                this.b($$7, $$4);
                this.a($$7);
            }
        }
        this.a(ded.b, $$12, this.a, false);
        this.k(this.dN().d(0.02, 0.2, 0.02));
        this.a(bda.CS, 1.0f, 1.0f);
    }

    @Override
    protected void a(axf $$0, fti $$12, dlt $$2) {
        chl $$4;
        ftm $$3 = $$12.b().a($$12.g());
        cgk cgk2 = this.p();
        dsq.a($$0, $$2, cgk2 instanceof chl ? ($$4 = (chl)cgk2) : null, this, null, $$3, $$0.a_($$12.b()), $$1 -> this.c($$0));
    }

    @Override
    public dlt eq() {
        return this.v();
    }

    @Override
    protected boolean a(ddm $$0) {
        return super.a($$0) || this.z() && this.e((cgk)$$0) && $$0.gK().g(this.s());
    }

    @Override
    protected dlt u() {
        return new dlt(dlx.yr);
    }

    @Override
    protected bcz k() {
        return bda.CT;
    }

    @Override
    public void a_(ddm $$0) {
        if (this.e((cgk)$$0) || this.p() == null) {
            super.a_($$0);
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.j = $$0.a("DealtDamage", false);
        this.az.a(f, this.b(this.v()));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("DealtDamage", this.j);
    }

    private byte b(dlt $$0) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            return (byte)bgj.a(dsq.c($$1, $$0, this), 0, 127);
        }
        return 0;
    }

    @Override
    public void i() {
        byte $$0 = this.az.a(f);
        if (this.c != deh.a.b || $$0 <= 0) {
            super.i();
        }
    }

    @Override
    protected float y() {
        return 0.99f;
    }

    @Override
    public boolean j(double $$0, double $$1, double $$2) {
        return true;
    }
}

