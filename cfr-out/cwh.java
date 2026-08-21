/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cwh
extends cwb
implements chq {
    protected static final alw<Byte> d = ama.a(cwh.class, aly.a);
    private static final int e = 25;
    private static final boolean f = false;
    private int cv;
    private int cw;
    private static final ccn cx = bhn.a(20, 39);
    private long cy;
    private @Nullable cgr<chl> cz;

    public cwh(cgu<? extends cwh> $$0, dwo $$1) {
        super((cgu<? extends cwb>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.cs.a(1, new coz(this, 1.0, true));
        this.cs.a(2, new cpe(this, 0.9, 32.0f));
        this.cs.a(2, new cpa((cht)this, 0.6, false));
        this.cs.a(4, new cor(this, 0.6));
        this.cs.a(5, new cpg(this));
        this.cs.a(7, new cox(this, ddm.class, 6.0f));
        this.cs.a(8, new cpk(this));
        this.ct.a(1, new cqh(this));
        this.ct.a(2, new cqi(this, new Class[0]));
        this.ct.a(3, new cqj<ddm>(this, ddm.class, 10, true, false, this::a));
        this.ct.a(3, new cqj<chn>(this, chn.class, 5, false, false, ($$0, $$1) -> $$0 instanceof czu && !($$0 instanceof czp)));
        this.ct.a(4, new cqp<cwh>(this, false));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(d, (byte)0);
    }

    public static cir.a k() {
        return chn.E().a(cis.u, 100.0).a(cis.x, 0.25).a(cis.r, 1.0).a(cis.d, 15.0).a(cis.D, 1.0);
    }

    @Override
    protected int l(int $$0) {
        return $$0;
    }

    @Override
    protected void F(cgk $$0) {
        if ($$0 instanceof czu && !($$0 instanceof czp) && this.ep().a(20) == 0) {
            this.g((chl)$$0);
        }
        super.F($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (this.cv > 0) {
            --this.cv;
        }
        if (this.cw > 0) {
            --this.cw;
        }
        if (!this.ao().B_()) {
            this.a((axf)this.ao(), true);
        }
    }

    @Override
    public boolean bL() {
        return this.dN().j() > 2.500000277905201E-7 && this.as.a(5) == 0;
    }

    @Override
    public boolean a(cgu<?> $$0) {
        if (this.gR() && $$0 == cgu.cb) {
            return false;
        }
        if ($$0 == cgu.I) {
            return false;
        }
        return super.a($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("PlayerCreated", this.gR());
        this.b_($$0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.y($$0.a("PlayerCreated", false));
        this.a(this.ao(), $$0);
    }

    @Override
    public void c() {
        this.a(cx.a(this.as));
    }

    @Override
    public void b(long $$0) {
        this.cy = $$0;
    }

    @Override
    public long a() {
        return this.cy;
    }

    @Override
    public void a(@Nullable cgr<chl> $$0) {
        this.cz = $$0;
    }

    @Override
    public @Nullable cgr<chl> b() {
        return this.cz;
    }

    private float gS() {
        return (float)this.i(cis.d);
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        this.cv = 10;
        $$0.a((cgk)this, (byte)4);
        float $$2 = this.gS();
        float $$3 = (int)$$2 > 0 ? $$2 / 2.0f + (float)this.as.a((int)$$2) : $$2;
        cex $$4 = this.en().b(this);
        boolean $$5 = $$1.a($$0, $$4, $$3);
        if ($$5) {
            double d2;
            if ($$1 instanceof chl) {
                chl $$6 = (chl)$$1;
                d2 = $$6.i(cis.r);
            } else {
                d2 = 0.0;
            }
            double $$7 = d2;
            double $$8 = Math.max(0.0, 1.0 - $$7);
            $$1.k($$1.dN().b(0.0, (double)0.4f * $$8, 0.0));
            dsq.a($$0, $$1, $$4);
        }
        this.a(bda.ps, 1.0f, 1.0f);
        return $$5;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgg.a $$3 = this.p();
        boolean $$4 = super.a($$0, $$1, $$2);
        if ($$4 && this.p() != $$3) {
            this.a(bda.pt, 1.0f, 1.0f);
        }
        return $$4;
    }

    public cgg.a p() {
        return cgg.a.a(this.eZ() / this.fq());
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.cv = 10;
            this.a(bda.ps, 1.0f, 1.0f);
        } else if ($$0 == 11) {
            this.cw = 400;
        } else if ($$0 == 34) {
            this.cw = 0;
        } else {
            super.b($$0);
        }
    }

    public int gP() {
        return this.cv;
    }

    public void x(boolean $$0) {
        if ($$0) {
            this.cw = 400;
            this.ao().a((cgk)this, (byte)11);
        } else {
            this.cw = 0;
            this.ao().a((cgk)this, (byte)34);
        }
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.pv;
    }

    @Override
    protected bcz fd() {
        return bda.pu;
    }

    @Override
    protected cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (!$$2.a(dlx.qg)) {
            return cdc.e;
        }
        float $$3 = this.eZ();
        this.d(25.0f);
        if (this.eZ() == $$3) {
            return cdc.e;
        }
        float $$4 = 1.0f + (this.as.i() - this.as.i()) * 0.2f;
        this.a(bda.pw, 1.0f, $$4);
        $$2.a(1, (chl)$$0);
        return cdc.a;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.px, 1.0f, 1.0f);
    }

    public int gQ() {
        return this.cw;
    }

    public boolean gR() {
        return (this.az.a(d) & 1) != 0;
    }

    public void y(boolean $$0) {
        byte $$1 = this.az.a(d);
        if ($$0) {
            this.az.a(d, (byte)($$1 | 1));
        } else {
            this.az.a(d, (byte)($$1 & 0xFFFFFFFE));
        }
    }

    @Override
    public void a(cex $$0) {
        super.a($$0);
    }

    @Override
    public boolean a(dwr $$0) {
        is $$1 = this.dK();
        is $$2 = $$1.e();
        eoh $$3 = $$0.a_($$2);
        if ($$3.b((dvt)$$0, $$2, this)) {
            for (int $$4 = 1; $$4 < 3; ++$$4) {
                eoh $$6;
                is $$5 = $$1.b($$4);
                if (dwz.a($$0, $$5, $$6 = $$0.a_($$5), $$6.y(), cgu.au)) continue;
                return false;
            }
            return dwz.a($$0, $$1, $$0.a_($$1), flc.a.g(), cgu.au) && $$0.f(this);
        }
        return false;
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.875f * this.dk(), this.dF() * 0.4f);
    }
}

