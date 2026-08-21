/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cyl
extends cyf {
    private static final csk b = csk.a().d();
    private @Nullable flp c;
    private @Nullable ftm d;

    public cyl(cyc $$0) {
        super($$0);
    }

    public cyt<cyl> h() {
        return cyt.c;
    }

    @Override
    public void c() {
        this.c = null;
        this.d = null;
    }

    @Override
    public void a(axf $$0) {
        double $$1;
        double d2 = $$1 = this.d == null ? 0.0 : this.d.c(this.a.dP(), this.a.dR(), this.a.dV());
        if ($$1 < 100.0 || $$1 > 22500.0 || this.a.ad || this.a.ae) {
            this.b($$0);
        }
    }

    @Override
    public @Nullable ftm f() {
        return this.d;
    }

    private void b(axf $$0) {
        if (this.c == null || this.c.c()) {
            int $$6;
            int $$1 = this.a.gL();
            is $$2 = $$0.a(euq.a.f, exv.a(this.a.k()));
            ddm $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
            if ($$3 != null) {
                ftm $$4 = new ftm($$3.dP(), 0.0, $$3.dV()).d();
                int $$5 = this.a.p(-$$4.g * 40.0, 105.0, -$$4.i * 40.0);
            } else {
                $$6 = this.a.p(40.0, $$2.v(), 0.0);
            }
            fln $$7 = new fln($$2.u(), $$2.v(), $$2.w());
            this.c = this.a.a($$1, $$6, $$7);
            if (this.c != null) {
                this.c.a();
            }
        }
        this.i();
        if (this.c != null && this.c.c()) {
            this.a.gN().a(cyt.d);
        }
    }

    private void i() {
        if (this.c != null && !this.c.c()) {
            double $$3;
            is $$0 = this.c.g();
            this.c.a();
            double $$1 = $$0.u();
            double $$2 = $$0.w();
            while (($$3 = (double)((float)$$0.v() + this.a.ep().i() * 20.0f)) < (double)$$0.v()) {
            }
            this.d = new ftm($$1, $$3, $$2);
        }
    }
}

