/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cyj
extends cyf {
    private static final csk b = csk.a().d();
    private @Nullable flp c;
    private @Nullable ftm d;
    private boolean e;

    public cyj(cyc $$0) {
        super($$0);
    }

    public cyt<cyj> h() {
        return cyt.a;
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
    public void c() {
        this.c = null;
        this.d = null;
    }

    @Override
    public @Nullable ftm f() {
        return this.d;
    }

    private void b(axf $$0) {
        if (this.c != null && this.c.c()) {
            double $$5;
            int $$2;
            is $$1 = $$0.a(euq.a.f, exv.a(this.a.k()));
            int n2 = $$2 = this.a.gO() == null ? 0 : this.a.gO().e();
            if (this.a.ep().a($$2 + 3) == 0) {
                this.a.gN().a(cyt.c);
                return;
            }
            ddm $$3 = $$0.a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$3 != null) {
                double $$4 = $$1.b($$3.dI()) / 512.0;
            } else {
                $$5 = 64.0;
            }
            if ($$3 != null && (this.a.ep().a((int)($$5 + 2.0)) == 0 || this.a.ep().a($$2 + 2) == 0)) {
                this.a($$3);
                return;
            }
        }
        if (this.c == null || this.c.c()) {
            int $$6;
            int $$7 = $$6 = this.a.gL();
            if (this.a.ep().a(8) == 0) {
                this.e = !this.e;
                $$7 += 6;
            }
            $$7 = this.e ? ++$$7 : --$$7;
            if (this.a.gO() == null || this.a.gO().e() < 0) {
                $$7 -= 12;
                $$7 &= 7;
                $$7 += 12;
            } else if (($$7 %= 12) < 0) {
                $$7 += 12;
            }
            this.c = this.a.a($$6, $$7, (fln)null);
            if (this.c != null) {
                this.c.a();
            }
        }
        this.i();
    }

    private void a(ddm $$0) {
        this.a.gN().a(cyt.b);
        this.a.gN().b(cyt.b).a($$0);
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

    @Override
    public void a(cyb $$0, is $$1, cex $$2, @Nullable ddm $$3) {
        if ($$3 != null && this.a.c((chl)$$3)) {
            this.a($$3);
        }
    }
}

