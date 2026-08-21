/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cys
extends cyf {
    private boolean b;
    private @Nullable flp c;
    private @Nullable ftm d;

    public cys(cyc $$0) {
        super($$0);
    }

    @Override
    public void a(axf $$0) {
        if (this.b || this.c == null) {
            this.b = false;
            this.i();
        } else {
            is $$1 = $$0.a(euq.a.f, exv.a(this.a.k()));
            if (!$$1.a(this.a.dI(), 10.0)) {
                this.a.gN().a(cyt.a);
            }
        }
    }

    @Override
    public void c() {
        this.b = true;
        this.c = null;
        this.d = null;
    }

    private void i() {
        int $$0 = this.a.gL();
        ftm $$1 = this.a.L(1.0f);
        int $$2 = this.a.p(-$$1.g * 40.0, 105.0, -$$1.i * 40.0);
        if (this.a.gO() == null || this.a.gO().e() <= 0) {
            $$2 -= 12;
            $$2 &= 7;
            $$2 += 12;
        } else if (($$2 %= 12) < 0) {
            $$2 += 12;
        }
        this.c = this.a.a($$0, $$2, (fln)null);
        this.j();
    }

    private void j() {
        if (this.c != null) {
            this.c.a();
            if (!this.c.c()) {
                double $$1;
                is $$0 = this.c.g();
                this.c.a();
                while (($$1 = (double)((float)$$0.v() + this.a.ep().i() * 20.0f)) < (double)$$0.v()) {
                }
                this.d = new ftm($$0.u(), $$1, $$0.w());
            }
        }
    }

    @Override
    public @Nullable ftm f() {
        return this.d;
    }

    public cyt<cys> h() {
        return cyt.e;
    }
}

