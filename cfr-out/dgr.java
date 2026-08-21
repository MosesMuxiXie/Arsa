/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dgr
extends dgi {
    private static final byte e = 10;
    private static final String f = "explosion_power";
    private static final String g = "explosion_speed_factor";
    private static final String h = "fuse";
    private static final float i = 4.0f;
    private static final float j = 1.0f;
    private static final int k = -1;
    private @Nullable cex l;
    private int m = -1;
    private float n = 4.0f;
    private float o = 1.0f;

    public dgr(cgu<? extends dgr> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    public eoh w() {
        return dzs.cu.m();
    }

    @Override
    public void g() {
        double $$0;
        super.g();
        if (this.m > 0) {
            --this.m;
            this.ao().a(ly.ai, this.dP(), this.dR() + 0.5, this.dV(), 0.0, 0.0, 0.0);
        } else if (this.m == 0) {
            this.a(this.l, this.dN().j());
        }
        if (this.ad && ($$0 = this.dN().j()) >= (double)0.01f) {
            this.a(this.l, $$0);
        }
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        deh $$4;
        cgk $$3 = $$1.c();
        if ($$3 instanceof deh && ($$4 = (deh)$$3).cp()) {
            cex $$5 = this.en().d(this, $$1.d());
            this.a($$5, $$4.dN().h());
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(axf $$0, cex $$1) {
        double $$2 = this.dN().j();
        if (dgr.f($$1) || $$2 >= (double)0.01f) {
            if (this.m < 0) {
                this.e($$1);
                this.m = this.as.a(20) + this.as.a(20);
            }
            return;
        }
        this.a($$0, this.p());
    }

    @Override
    protected dlp p() {
        return dlx.pl;
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.pl);
    }

    protected void a(@Nullable cex $$0, double $$1) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            if ($$2.U().a(eua.ad).booleanValue()) {
                double $$3 = Math.min(Math.sqrt($$1), 5.0);
                $$2.a((cgk)this, $$0, null, this.dP(), this.dR(), this.dV(), (float)((double)this.n + (double)this.o * this.as.j() * 1.5 * $$3), false, dwo.a.d);
                this.aC();
            } else if (this.i()) {
                this.aC();
            }
        }
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$2) {
        if ($$0 >= 3.0) {
            double $$3 = $$0 / 10.0;
            this.a(this.l, $$3 * $$3);
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(axf $$0, int $$1, int $$2, int $$3, boolean $$4) {
        if ($$4 && this.m < 0) {
            this.e((cex)null);
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 10) {
            this.e((cex)null);
        } else {
            super.b($$0);
        }
    }

    public void e(@Nullable cex $$0) {
        axf $$1;
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf && !($$1 = (axf)dwo2).U().a(eua.ad).booleanValue()) {
            return;
        }
        this.m = 80;
        if (!this.ao().B_()) {
            if ($$0 != null && this.l == null) {
                this.l = this.en().d(this, $$0.d());
            }
            this.ao().a((cgk)this, (byte)10);
            if (!this.bq()) {
                this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.CQ, bdb.e, 1.0f, 1.0f);
            }
        }
    }

    public int e() {
        return this.m;
    }

    public boolean i() {
        return this.m > -1;
    }

    @Override
    public float a(dwi $$0, dvt $$1, is $$2, eoh $$3, flb $$4, float $$5) {
        if (this.i() && ($$3.a(bdp.L) || $$1.a_($$2.d()).a(bdp.L))) {
            return 0.0f;
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public boolean a(dwi $$0, dvt $$1, is $$2, eoh $$3, float $$4) {
        if (this.i() && ($$3.a(bdp.L) || $$1.a_($$2.d()).a(bdp.L))) {
            return false;
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.m = $$0.a(h, -1);
        this.n = bgj.a($$0.a(f, 4.0f), 0.0f, 128.0f);
        this.o = bgj.a($$0.a(g, 1.0f), 0.0f, 128.0f);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(h, this.m);
        if (this.n != 4.0f) {
            $$0.a(f, this.n);
        }
        if (this.o != 1.0f) {
            $$0.a(g, this.o);
        }
    }

    @Override
    protected boolean a(cex $$0) {
        return dgr.f($$0);
    }

    private static boolean f(cex $$0) {
        cgk cgk2 = $$0.c();
        if (cgk2 instanceof dec) {
            dec $$1 = (dec)cgk2;
            return $$1.cp();
        }
        return $$0.a(bdq.i) || $$0.a(bdq.l);
    }
}

