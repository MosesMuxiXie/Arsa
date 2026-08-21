/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ddw
extends cgk
implements cik {
    public static final int a = 20;
    public static final int b = 2;
    public static final int c = 14;
    private static final int d = 0;
    private int e = 0;
    private boolean f;
    private int g = 22;
    private boolean h;
    private @Nullable cgr<chl> i;

    public ddw(cgu<? extends ddw> $$0, dwo $$1) {
        super($$0, $$1);
    }

    public ddw(dwo $$0, double $$1, double $$2, double $$3, float $$4, int $$5, chl $$6) {
        this((cgu<? extends ddw>)cgu.X, $$0);
        this.e = $$5;
        this.a($$6);
        this.v($$4 * 57.295776f);
        this.a_($$1, $$2, $$3);
    }

    @Override
    protected void a(ama.a $$0) {
    }

    public void a(@Nullable chl $$0) {
        this.i = cgr.a($$0);
    }

    public @Nullable chl e() {
        return cgr.b(this.i, this.ao());
    }

    @Override
    protected void a(fnq $$0) {
        this.e = $$0.a("Warmup", 0);
        this.i = cgr.a($$0, "Owner");
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("Warmup", this.e);
        cgr.a(this.i, $$0, "Owner");
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            if (this.h) {
                --this.g;
                if (this.g == 14) {
                    for (int $$0 = 0; $$0 < 12; ++$$0) {
                        double $$1 = this.dP() + (this.as.j() * 2.0 - 1.0) * (double)this.dF() * 0.5;
                        double $$2 = this.dR() + 0.05 + this.as.j();
                        double $$3 = this.dV() + (this.as.j() * 2.0 - 1.0) * (double)this.dF() * 0.5;
                        double $$4 = (this.as.j() * 2.0 - 1.0) * 0.3;
                        double $$5 = 0.3 + this.as.j() * 0.3;
                        double $$6 = (this.as.j() * 2.0 - 1.0) * 0.3;
                        this.ao().a(ly.g, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
                    }
                }
            }
        } else if (--this.e < 0) {
            if (this.e == -8) {
                List<chl> $$7 = this.ao().a(chl.class, this.dj().c(0.2, 0.0, 0.2));
                for (chl $$8 : $$7) {
                    this.c($$8);
                }
            }
            if (!this.f) {
                this.ao().a((cgk)this, (byte)4);
                this.f = true;
            }
            if (--this.g < 0) {
                this.aC();
            }
        }
    }

    private void c(chl $$0) {
        chl $$1 = this.e();
        if (!$$0.cb() || $$0.cU() || $$0 == $$1) {
            return;
        }
        if ($$1 == null) {
            $$0.a(this.en().q(), 6.0f);
        } else {
            axf $$3;
            if ($$1.t($$0)) {
                return;
            }
            cex $$2 = this.en().c((cgk)this, (cgk)$$1);
            dwo dwo2 = this.ao();
            if (dwo2 instanceof axf && $$0.a($$3 = (axf)dwo2, $$2, 6.0f)) {
                dsq.a($$3, (cgk)$$0, $$2);
            }
        }
    }

    @Override
    public void b(byte $$0) {
        super.b($$0);
        if ($$0 == 4) {
            this.h = true;
            if (!this.bq()) {
                this.ao().a(this.dP(), this.dR(), this.dV(), bda.kj, this.dB(), 1.0f, this.as.i() * 0.2f + 0.85f, false);
            }
        }
    }

    public float a(float $$0) {
        if (!this.h) {
            return 0.0f;
        }
        int $$1 = this.g - 2;
        if ($$1 <= 0) {
            return 1.0f;
        }
        return 1.0f - ((float)$$1 - $$0) / 20.0f;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }

    @Override
    public /* synthetic */ @Nullable cgk p() {
        return this.e();
    }
}

