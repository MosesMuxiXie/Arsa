/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public abstract class det
extends dem
implements dea {
    public static final dwj e = new dxh(true, false, Optional.empty(), mi.e.a(bdp.cQ).map(Function.identity()));
    public static final double f = 0.25;

    public det(cgu<? extends det> $$0, dwo $$1) {
        super((cgu<? extends dem>)$$0, $$1);
        this.d = 0.0;
    }

    public det(cgu<? extends det> $$0, dwo $$1, cgk $$2, double $$3, double $$4, double $$5) {
        super($$0, $$3, $$4, $$5, $$1);
        this.d($$2);
        this.d = 0.0;
    }

    det(cgu<? extends det> $$0, double $$1, double $$2, double $$3, ftm $$4, dwo $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
        this.d = 0.0;
    }

    @Override
    protected fth c(ftm $$0) {
        float $$1 = this.ay().n().a() / 2.0f;
        float $$2 = this.ay().n().b();
        float $$3 = 0.15f;
        return new fth($$0.g - (double)$$1, $$0.h - (double)0.15f, $$0.i - (double)$$1, $$0.g + (double)$$1, $$0.h - (double)0.15f + (double)$$2, $$0.i + (double)$$1);
    }

    @Override
    public boolean i(cgk $$0) {
        if ($$0 instanceof det) {
            return false;
        }
        return super.i($$0);
    }

    @Override
    protected boolean b(cgk $$0) {
        if ($$0 instanceof det) {
            return false;
        }
        if ($$0.ay() == cgu.V) {
            return false;
        }
        return super.b($$0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void a(ftj $$0) {
        cex $$6;
        void $$2;
        chl $$3;
        super.a($$0);
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        cgk cgk2 = this.p();
        chl $$4 = cgk2 instanceof chl ? ($$3 = (chl)cgk2) : null;
        cgk $$5 = $$0.a();
        if ($$4 != null) {
            $$4.C($$5);
        }
        if ($$5.a((axf)$$2, $$6 = this.en().c((cgk)this, $$4), 1.0f) && $$5 instanceof chl) {
            chl $$7 = (chl)$$5;
            dsq.a((axf)$$2, (cgk)$$7, $$6);
        }
        this.a(this.dI());
    }

    @Override
    public void i(double $$0, double $$1, double $$2) {
    }

    protected abstract void a(ftm var1);

    @Override
    protected void a(fti $$0) {
        super.a($$0);
        if (!this.ao().B_()) {
            jy $$1 = $$0.c().q();
            ftm $$2 = ftm.a($$1).d(0.25, 0.25, 0.25);
            ftm $$3 = $$0.g().e($$2);
            this.a($$3);
            this.aC();
        }
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        if (!this.ao().B_()) {
            this.aC();
        }
    }

    @Override
    protected boolean i() {
        return false;
    }

    @Override
    public dlt e() {
        return dlt.l;
    }

    @Override
    protected float r() {
        return 1.0f;
    }

    @Override
    protected float s() {
        return this.r();
    }

    @Override
    protected @Nullable lw k() {
        return null;
    }

    @Override
    public void g() {
        if (!this.ao().B_() && this.dQ() > this.ao().aw() + 30) {
            this.a(this.dI());
            this.aC();
        } else {
            super.g();
        }
    }
}

