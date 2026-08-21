/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cxj
extends cth
implements cib {
    private static final int cv = 40;
    private static final alw<Byte> cw = ama.a(cxj.class, aly.a);
    private static final dkr cx = dkr.a;
    private static final boolean cz = false;
    private int cA;
    private cof cB;

    public cxj(cgu<? extends cxj> $$0, dwo $$1) {
        super((cgu<? extends cth>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.cB = new cof(this);
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cpi(this, 1.25));
        this.cs.a(2, new cnz(this, 1.0));
        this.cs.a(3, new cpy(this, 1.1, $$0 -> $$0.a(bdy.aG), false));
        this.cs.a(4, new coo(this, 1.1));
        this.cs.a(5, this.cB);
        this.cs.a(6, new cqd(this, 1.0));
        this.cs.a(7, new cox(this, ddm.class, 6.0f));
        this.cs.a(8, new cpk(this));
    }

    @Override
    public boolean j(dlt $$0) {
        return $$0.a(bdy.aG);
    }

    @Override
    protected void a(axf $$0) {
        this.cA = this.cB.h();
        super.a($$0);
    }

    @Override
    public void d_() {
        if (this.ao().B_()) {
            this.cA = Math.max(0, this.cA - 1);
        }
        super.d_();
    }

    public static cir.a p() {
        return cth.gW().a(cis.u, 8.0).a(cis.x, 0.23f);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cw, (byte)0);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 10) {
            this.cA = 40;
        } else {
            super.b($$0);
        }
    }

    public float L(float $$0) {
        if (this.cA <= 0) {
            return 0.0f;
        }
        if (this.cA >= 4 && this.cA <= 36) {
            return 1.0f;
        }
        if (this.cA < 4) {
            return ((float)this.cA - $$0) / 4.0f;
        }
        return -((float)(this.cA - 40) - $$0) / 4.0f;
    }

    public float M(float $$0) {
        if (this.cA > 4 && this.cA <= 36) {
            float $$1 = ((float)(this.cA - 4) - $$0) / 32.0f;
            return 0.62831855f + 0.21991149f * bgj.a((double)($$1 * 28.7f));
        }
        if (this.cA > 0) {
            return 0.62831855f;
        }
        return this.k($$0) * ((float)Math.PI / 180);
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.tZ)) {
            dwo dwo2 = this.ao();
            if (dwo2 instanceof axf) {
                axf $$3 = (axf)dwo2;
                if (this.a()) {
                    this.a($$3, bdb.h, $$2);
                    this.a(etk.M, (cgk)$$0);
                    $$2.a(1, (chl)$$0, $$1.a());
                    return cdc.b;
                }
            }
            return cdc.c;
        }
        return super.b($$0, $$1);
    }

    @Override
    public void a(axf $$02, bdb $$12, dlt $$2) {
        $$02.a(null, this, bda.zw, $$12, 1.0f, 1.0f);
        this.a($$02, fnv.bb, $$2, (axf $$0, dlt $$1) -> {
            for (int $$2 = 0; $$2 < $$1.N(); ++$$2) {
                czl $$3 = this.a((axf)$$0, $$1.c(1), 1.0f);
                if ($$3 == null) continue;
                $$3.k($$3.dN().b((this.as.i() - this.as.i()) * 0.1f, this.as.i() * 0.05f, (this.as.i() - this.as.i()) * 0.1f));
            }
        });
        this.x(true);
    }

    @Override
    public boolean a() {
        return this.cb() && !this.gQ() && !this.e_();
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Sheared", this.gQ());
        $$0.a("Color", dkr.s, this.gP());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a("Sheared", false));
        this.a($$0.a("Color", dkr.s).orElse(cx));
    }

    @Override
    protected bcz W() {
        return bda.zt;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.zv;
    }

    @Override
    protected bcz fd() {
        return bda.zu;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.zx, 0.15f, 1.0f);
    }

    public dkr gP() {
        return dkr.a(this.az.a(cw) & 0xF);
    }

    public void a(dkr $$0) {
        byte $$1 = this.az.a(cw);
        this.az.a(cw, (byte)($$1 & 0xF0 | $$0.a() & 0xF));
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aZ) {
            return cxj.c($$0, this.gP());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aZ);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aZ) {
            this.a(cxj.c(ki.aZ, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    public boolean gQ() {
        return (this.az.a(cw) & 0x10) != 0;
    }

    public void x(boolean $$0) {
        byte $$1 = this.az.a(cw);
        if ($$0) {
            this.az.a(cw, (byte)($$1 | 0x10));
        } else {
            this.az.a(cw, (byte)($$1 & 0xFFFFFFEF));
        }
    }

    public static dkr a(dxf $$0, is $$1) {
        jd<dxo> $$2 = $$0.z($$1);
        return cxk.a($$2, $$0.G_());
    }

    public @Nullable cxj b(axf $$0, cfy $$1) {
        cxj $$2 = cgu.bj.a($$0, cgt.e);
        if ($$2 != null) {
            dkr $$3 = this.gP();
            dkr $$4 = ((cxj)$$1).gP();
            $$2.a(dkr.a($$0, $$3, $$4));
        }
        return $$2;
    }

    @Override
    public void R() {
        super.R();
        this.x(false);
        if (this.e_()) {
            this.c_(60);
        }
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        this.a(cxj.a($$0, this.dK()));
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }
}

