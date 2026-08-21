/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cwi
extends cwb
implements cib,
dac {
    private static final alw<Byte> a = ama.a(cwi.class, aly.a);
    private static final byte b = 16;
    private static final boolean c = true;

    public cwi(cgu<? extends cwi> $$0, dwo $$1) {
        super((cgu<? extends cwb>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.cs.a(1, new cpo(this, 1.25, 20, 10.0f));
        this.cs.a(2, new cqd((cht)this, 1.0, 1.0000001E-5f));
        this.cs.a(3, new cox(this, ddm.class, 6.0f));
        this.cs.a(4, new cpk(this));
        this.ct.a(1, new cqj<chn>(this, chn.class, 10, true, false, ($$0, $$1) -> $$0 instanceof czu));
    }

    public static cir.a k() {
        return chn.E().a(cis.u, 4.0).a(cis.x, 0.2f);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, (byte)16);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Pumpkin", this.p());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("Pumpkin", true));
    }

    @Override
    public boolean fR() {
        return true;
    }

    @Override
    public void d_() {
        super.d_();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            if ($$0.c().a(ceg.K, this.dI()).booleanValue()) {
                this.a($$0, this.en().d(), 1.0f);
            }
            if (!$$0.U().a(eua.F).booleanValue()) {
                return;
            }
            eoh $$1 = dzs.ep.m();
            for (int $$2 = 0; $$2 < 4; ++$$2) {
                int $$3 = bgj.c(this.dP() + (double)((float)($$2 % 2 * 2 - 1) * 0.25f));
                int $$4 = bgj.c(this.dR());
                int $$5 = bgj.c(this.dV() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25f));
                is $$6 = new is($$3, $$4, $$5);
                if (!this.ao().a_($$6).l() || !$$1.a((dwr)this.ao(), $$6)) continue;
                this.ao().c($$6, $$1);
                this.ao().a(etk.i, $$6, etk.a.a(this, $$1));
            }
        }
    }

    @Override
    public void a(chl $$0, float $$1) {
        double $$2 = $$0.dP() - this.dP();
        double $$3 = $$0.dT() - (double)1.1f;
        double $$42 = $$0.dV() - this.dV();
        double $$5 = Math.sqrt($$2 * $$2 + $$42 * $$42) * (double)0.2f;
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$6 = (axf)dwo2;
            dlt $$7 = new dlt(dlx.so);
            dec.a(new dez($$6, this, $$7), $$6, $$7, $$4 -> $$4.d($$2, $$3 + $$5 - $$4.dR(), $$42, 1.6f, 12.0f));
        }
        this.a(bda.BY, 1.0f, 0.4f / (this.ep().i() * 0.4f + 0.8f));
    }

    @Override
    protected cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.tZ) && this.a()) {
            dwo dwo2 = this.ao();
            if (dwo2 instanceof axf) {
                axf $$3 = (axf)dwo2;
                this.a($$3, bdb.h, $$2);
                this.a(etk.M, (cgk)$$0);
                $$2.a(1, (chl)$$0, $$1.a());
            }
            return cdc.a;
        }
        return cdc.e;
    }

    @Override
    public void a(axf $$02, bdb $$12, dlt $$2) {
        $$02.a(null, this, bda.BZ, $$12, 1.0f, 1.0f);
        this.x(false);
        this.a($$02, fnv.ba, $$2, (axf $$0, dlt $$1) -> this.a((axf)$$0, (dlt)$$1, this.dk()));
    }

    @Override
    public boolean a() {
        return this.cb() && this.p();
    }

    public boolean p() {
        return (this.az.a(a) & 0x10) != 0;
    }

    public void x(boolean $$0) {
        byte $$1 = this.az.a(a);
        if ($$0) {
            this.az.a(a, (byte)($$1 | 0x10));
        } else {
            this.az.a(a, (byte)($$1 & 0xFFFFFFEF));
        }
    }

    @Override
    protected @Nullable bcz W() {
        return bda.BV;
    }

    @Override
    protected @Nullable bcz h(cex $$0) {
        return bda.BX;
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.BW;
    }

    @Override
    public ftm B() {
        return new ftm(0.0, 0.75f * this.dk(), this.dF() * 0.4f);
    }
}

