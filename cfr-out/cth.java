/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class cth
extends cfy {
    protected static final int cy = 6000;
    private static final int cv = 0;
    private int cw = 0;
    private @Nullable cgr<axg> cx;

    protected cth(cgu<? extends cth> $$0, dwo $$1) {
        super((cgu<? extends cfy>)$$0, $$1);
        this.a(fls.n, 16.0f);
        this.a(fls.o, -1.0f);
    }

    public static cir.a gW() {
        return chn.E().a(cis.G, 10.0);
    }

    @Override
    protected void a(axf $$0) {
        if (this.Z_() != 0) {
            this.cw = 0;
        }
        super.a($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (this.Z_() != 0) {
            this.cw = 0;
        }
        if (this.cw > 0) {
            --this.cw;
            if (this.cw % 10 == 0) {
                double $$0 = this.as.k() * 0.02;
                double $$1 = this.as.k() * 0.02;
                double $$2 = this.as.k() * 0.02;
                this.ao().a(ly.T, this.e(1.0), this.dS() + 0.5, this.h(1.0), $$0, $$1, $$2);
            }
        }
    }

    @Override
    protected void c(axf $$0, cex $$1, float $$2) {
        this.hc();
        super.c($$0, $$1, $$2);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if ($$1.a_($$0.e()).a(dzs.i)) {
            return 10.0f;
        }
        return $$1.C($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("InLove", this.cw);
        cgr.a(this.cx, $$0, "LoveCause");
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.cw = $$0.a("InLove", 0);
        this.cx = cgr.a($$0, "LoveCause");
    }

    public static boolean b(cgu<? extends cth> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        boolean $$5 = cgt.b($$2) || cth.a($$1, $$3);
        return $$1.a_($$3.e()).a(bdp.cl) && $$5;
    }

    protected static boolean a(dvq $$0, is $$1) {
        return $$0.b($$1, 0) > 8;
    }

    @Override
    public int S() {
        return 120;
    }

    @Override
    public boolean i(double $$0) {
        return false;
    }

    @Override
    protected int f(axf $$0) {
        return 1 + this.as.a(3);
    }

    public abstract boolean j(dlt var1);

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (this.j($$2)) {
            int $$3 = this.Z_();
            if ($$0 instanceof axg) {
                axg $$4 = (axg)$$0;
                if ($$3 == 0 && this.gY()) {
                    this.a($$0, $$1, $$2);
                    this.h($$4);
                    this.gX();
                    return cdc.b;
                }
            }
            if (this.e_()) {
                this.a($$0, $$1, $$2);
                this.a(cth.d(-$$3), true);
                this.gX();
                return cdc.a;
            }
            if (this.ao().B_()) {
                return cdc.c;
            }
        }
        return super.b($$0, $$1);
    }

    protected void gX() {
    }

    public boolean gY() {
        return this.cw <= 0;
    }

    public void h(@Nullable ddm $$0) {
        this.cw = 600;
        if ($$0 instanceof axg) {
            axg $$1 = (axg)$$0;
            this.cx = cgr.a($$1);
        }
        this.ao().a((cgk)this, (byte)18);
    }

    public void r(int $$0) {
        this.cw = $$0;
    }

    public int gZ() {
        return this.cw;
    }

    public @Nullable axg ha() {
        return cgr.a(this.cx, this.ao(), axg.class);
    }

    public boolean hb() {
        return this.cw > 0;
    }

    public void hc() {
        this.cw = 0;
    }

    public boolean a(cth $$0) {
        if ($$0 == this) {
            return false;
        }
        if ($$0.getClass() != this.getClass()) {
            return false;
        }
        return this.hb() && $$0.hb();
    }

    public void a(axf $$0, cth $$1) {
        cfy $$2 = this.a($$0, (cfy)$$1);
        if ($$2 == null) {
            return;
        }
        $$2.a_(true);
        $$2.b(this.dP(), this.dR(), this.dV(), 0.0f, 0.0f);
        this.a($$0, $$1, $$2);
        $$0.a_($$2);
    }

    public void a(axf $$0, cth $$1, @Nullable cfy $$22) {
        Optional.ofNullable(this.ha()).or(() -> Optional.ofNullable($$1.ha())).ifPresent($$2 -> {
            $$2.a(bdk.R);
            aj.p.a((axg)$$2, this, $$1, $$22);
        });
        this.d_(6000);
        $$1.d_(6000);
        this.hc();
        $$1.hc();
        $$0.a((cgk)this, (byte)18);
        if ($$0.U().a(eua.D).booleanValue()) {
            $$0.b(new cgz($$0, this.dP(), this.dR(), this.dV(), this.ep().a(7) + 1));
        }
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 18) {
            for (int $$1 = 0; $$1 < 7; ++$$1) {
                double $$2 = this.as.k() * 0.02;
                double $$3 = this.as.k() * 0.02;
                double $$4 = this.as.k() * 0.02;
                this.ao().a(ly.T, this.e(1.0), this.dS() + 0.5, this.h(1.0), $$2, $$3, $$4);
            }
        } else {
            super.b($$0);
        }
    }

    @Override
    public ftm b(chl $$0) {
        iz $$1 = this.dh();
        if ($$1.o() == iz.a.b) {
            return super.b($$0);
        }
        int[][] $$2 = dfz.a($$1);
        is $$3 = this.dK();
        is.a $$4 = new is.a();
        for (chx $$5 : $$0.go()) {
            fth $$6 = $$0.f($$5);
            for (int[] $$7 : $$2) {
                $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
                double $$8 = this.ao().m($$4);
                if (!dfz.a($$8)) continue;
                ftm $$9 = ftm.a($$4, $$8);
                if (!dfz.a(this.ao(), $$0, $$6.c($$9))) continue;
                $$0.c($$5);
                return $$9;
            }
        }
        return super.b($$0);
    }
}

