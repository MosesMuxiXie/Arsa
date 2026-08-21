/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class czd
extends cyz {
    public static final double b = 0.375;

    public czd(cgu<? extends czd> $$0, dwo $$1) {
        super((cgu<? extends cyz>)$$0, $$1);
    }

    public czd(dwo $$0, is $$1) {
        super(cgu.aA, $$0, $$1);
        this.a_($$1.u(), $$1.v(), $$1.w());
    }

    @Override
    protected void a(ama.a $$0) {
    }

    @Override
    protected void e() {
        this.n((double)this.a.u() + 0.5, (double)this.a.v() + 0.375, (double)this.a.w() + 0.5);
        double $$0 = (double)this.ay().l() / 2.0;
        double $$1 = this.ay().m();
        this.a(new fth(this.dP() - $$0, this.dR(), this.dV() - $$0, this.dP() + $$0, this.dR() + $$1, this.dV() + $$0));
    }

    @Override
    public boolean a(double $$0) {
        return $$0 < 1024.0;
    }

    @Override
    public void a(axf $$0, @Nullable cgk $$1) {
        this.a(bda.qb, 1.0f, 1.0f);
    }

    @Override
    protected void a(fns $$0) {
    }

    @Override
    protected void a(fnq $$0) {
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        cdc.d $$3;
        cdc $$2;
        if (this.ao().B_()) {
            return cdc.a;
        }
        if ($$0.b($$1).a(dlx.tZ) && ($$2 = super.a($$0, $$1)) instanceof cdc.d && ($$3 = (cdc.d)$$2).c()) {
            return $$2;
        }
        boolean $$4 = false;
        List<chj> $$5 = chj.c_($$0);
        for (chj $$6 : $$5) {
            if (!$$6.b_(this)) continue;
            $$6.a_(this, true);
            $$4 = true;
        }
        boolean $$7 = false;
        if (!$$4 && !$$0.gA()) {
            List<chj> $$8 = chj.c_(this);
            for (chj $$9 : $$8) {
                if (!$$9.b_($$0)) continue;
                $$9.a_($$0, true);
                $$7 = true;
            }
        }
        if ($$4 || $$7) {
            this.a(etk.b, (cgk)$$0);
            this.a(bda.qc);
            return cdc.a;
        }
        return super.a($$0, $$1);
    }

    @Override
    public void b(chj $$0) {
        if (chj.c_(this).isEmpty()) {
            this.aC();
        }
    }

    @Override
    public boolean f() {
        return this.ao().a_(this.a).a(bdp.S);
    }

    public static czd b(dwo $$0, is $$1) {
        int $$2 = $$1.u();
        int $$3 = $$1.v();
        int $$4 = $$1.w();
        List<czd> $$5 = $$0.a(czd.class, new fth((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0));
        for (czd $$6 : $$5) {
            if (!$$6.i().equals($$1)) continue;
            return $$6;
        }
        czd $$7 = new czd($$0, $$1);
        $$0.b($$7);
        return $$7;
    }

    public void k() {
        this.a(bda.qc, 1.0f, 1.0f);
    }

    @Override
    public aay<adb> a(axd $$0) {
        return new adc((cgk)this, 0, this.i());
    }

    @Override
    public ftm u(float $$0) {
        return this.p($$0).b(0.0, 0.2, 0.0);
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.wZ);
    }
}

