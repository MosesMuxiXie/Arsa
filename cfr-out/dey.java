/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair
 */
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;

public abstract class dey
extends dfa {
    public static final double b = 4.0;
    protected static final double c = 16.0;
    public static final Predicate<chl> d = $$0 -> $$0.fR() || $$0.cp();

    public dey(cgu<? extends dey> $$0, dwo $$1) {
        super((cgu<? extends dfa>)$$0, $$1);
    }

    public dey(cgu<? extends dey> $$0, dwo $$1, chl $$2, dlt $$3) {
        super($$0, $$2, $$1, $$3);
    }

    public dey(cgu<? extends dey> $$0, dwo $$1, double $$2, double $$3, double $$4, dlt $$5) {
        super($$0, $$2, $$3, $$4, $$1, $$5);
    }

    @Override
    protected double bs() {
        return 0.05;
    }

    @Override
    protected void a(fti $$0) {
        super.a($$0);
        if (this.ao().B_()) {
            return;
        }
        dlt $$1 = this.e();
        iz $$2 = $$0.c();
        is $$3 = $$0.b();
        is $$4 = $$3.a($$2);
        dnr $$5 = $$1.a(ki.Y, dnr.a);
        if ($$5.a(dns.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));
            for (iz $$6 : iz.c.a) {
                this.a($$4.a($$6));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void b(ftk $$0) {
        void $$2;
        super.b($$0);
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        dlt $$3 = this.e();
        dnr $$4 = $$3.a(ki.Y, dnr.a);
        if ($$4.a(dns.a)) {
            this.b((axf)$$2);
        } else if ($$4.c()) {
            this.a((axf)$$2, $$3, $$0);
        }
        int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
        $$2.c($$5, this.dK(), $$4.b());
        this.aC();
    }

    private void b(axf $$0) {
        fth $$1 = this.dj().c(4.0, 2.0, 4.0);
        List<chl> $$2 = this.ao().a(chl.class, $$1, d);
        for (chl $$3 : $$2) {
            double $$4 = this.g($$3);
            if (!($$4 < 16.0)) continue;
            if ($$3.fR()) {
                $$3.a($$0, this.en().c((cgk)this, this.p()), 1.0f);
            }
            if (!$$3.cp() || !$$3.cb()) continue;
            $$3.bc();
        }
        List<ctr> $$5 = this.ao().a(ctr.class, $$1);
        for (ctr $$6 : $$5) {
            $$6.p();
        }
    }

    protected abstract void a(axf var1, dlt var2, ftk var3);

    private void a(is $$0) {
        eoh $$1 = this.ao().a_($$0);
        if ($$1.a(bdp.aY)) {
            this.ao().a($$0, false, this);
        } else if (dyi.c($$1)) {
            dyi.a(null, $$1, (dwp)this.ao(), $$0);
        } else if (eag.h($$1)) {
            this.ao().a(null, 1009, $$0, 0);
            eag.a(this.p(), (dwp)this.ao(), $$0, $$1);
            this.ao().c($$0, (eoh)$$1.b(eag.b, false));
        }
    }

    @Override
    public DoubleDoubleImmutablePair a(chl $$0, cex $$1) {
        double $$2 = $$0.dI().g - this.dI().g;
        double $$3 = $$0.dI().i - this.dI().i;
        return DoubleDoubleImmutablePair.of((double)$$2, (double)$$3);
    }
}

