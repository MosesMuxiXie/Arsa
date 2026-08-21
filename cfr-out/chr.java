/*
 * Decompiled with CFR 0.152.
 */
public class chr
extends cgk {
    private static final int b = 60;
    private static final int c = 120;
    private static final String d = "spawn_item_after_ticks";
    private static final String e = "item";
    private static final alw<dlt> f = ama.a(chr.class, aly.h);
    public static final int a = 36;
    private long g;

    public chr(cgu<? extends chr> $$0, dwo $$1) {
        super($$0, $$1);
        this.ar = true;
    }

    public static chr a(dwo $$0, dlt $$1) {
        chr $$2 = new chr((cgu<? extends chr>)cgu.aQ, $$0);
        $$2.g = $$0.y.a(60, 120);
        $$2.a($$1);
        return $$2;
    }

    @Override
    public void g() {
        super.g();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            this.a($$0);
        } else {
            this.i();
        }
    }

    private void a(axf $$0) {
        if ((long)this.at == this.g - 36L) {
            $$0.a(null, this.dK(), bda.nX, bdb.g);
        }
        if ((long)this.at >= this.g) {
            this.k();
            this.c($$0);
        }
    }

    private void i() {
        if (this.ao().au() % 5L == 0L) {
            this.e();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void k() {
        czl $$5;
        void $$1;
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$0 = (axf)dwo2;
        dlt $$2 = this.f();
        if ($$2.f()) {
            return;
        }
        dlp dlp2 = $$2.h();
        if (dlp2 instanceof dmn) {
            dmn $$3 = (dmn)((Object)dlp2);
            cgk $$4 = this.a((axf)$$1, $$3, $$2);
        } else {
            $$5 = new czl((dwo)$$1, this.dP(), this.dR(), this.dV(), $$2);
            $$1.b($$5);
        }
        $$1.c(3021, this.dK(), 1);
        $$1.a((cgk)$$5, etk.t, this.dI());
        this.a(dlt.l);
    }

    private cgk a(axf $$0, dmn $$12, dlt $$2) {
        dmn.a $$3 = $$12.a();
        $$3.e().ifPresent($$1 -> $$0.c($$1, this.dK(), 0));
        iz $$4 = iz.a;
        dec $$5 = dec.a($$12.a($$0, this.dI(), $$2, $$4), $$0, $$2, $$4.j(), $$4.k(), $$4.l(), $$3.d(), $$3.c());
        $$5.d(this);
        return $$5;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(f, dlt.l);
    }

    @Override
    protected void a(fnq $$0) {
        this.a($$0.a(e, dlt.b).orElse(dlt.l));
        this.g = $$0.a(d, 0L);
    }

    @Override
    protected void a(fns $$0) {
        if (!this.f().f()) {
            $$0.a(e, dlt.b, this.f());
        }
        $$0.a(d, this.g);
    }

    @Override
    protected boolean s(cgk $$0) {
        return false;
    }

    @Override
    protected boolean cg() {
        return false;
    }

    @Override
    protected void q(cgk $$0) {
        throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
    }

    @Override
    public flg n_() {
        return flg.d;
    }

    @Override
    public boolean m_() {
        return true;
    }

    public void e() {
        ftm $$0 = this.dI();
        int $$1 = this.as.a(1, 3);
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            double $$3 = 0.4;
            ftm $$4 = new ftm(this.dP() + 0.4 * (this.as.k() - this.as.k()), this.dR() + 0.4 * (this.as.k() - this.as.k()), this.dV() + 0.4 * (this.as.k() - this.as.k()));
            ftm $$5 = $$0.a($$4);
            this.ao().a(ly.bg, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
        }
    }

    public dlt f() {
        return this.aD().a(f);
    }

    private void a(dlt $$0) {
        this.aD().a(f, $$0);
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }
}

