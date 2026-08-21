/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class cqq
extends cop {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    protected final chn e;
    protected final boolean f;
    private final boolean d;
    private int i;
    private int j;
    private int k;
    protected @Nullable chl g;
    protected int h = 60;

    public cqq(chn $$0, boolean $$1) {
        this($$0, $$1, false);
    }

    public cqq(chn $$0, boolean $$1, boolean $$2) {
        this.e = $$0;
        this.f = $$1;
        this.d = $$2;
    }

    @Override
    public boolean c() {
        chl $$0 = this.e.ag_();
        if ($$0 == null) {
            $$0 = this.g;
        }
        if ($$0 == null) {
            return false;
        }
        if (!this.e.c($$0)) {
            return false;
        }
        fum $$1 = this.e.cI();
        fum $$2 = $$0.cI();
        if ($$1 != null && $$2 == $$1) {
            return false;
        }
        double $$3 = this.l();
        if (this.e.g((cgk)$$0) > $$3 * $$3) {
            return false;
        }
        if (this.f) {
            if (this.e.P().a($$0)) {
                this.k = 0;
            } else if (++this.k > cqq.b(this.h)) {
                return false;
            }
        }
        this.e.g($$0);
        return true;
    }

    protected double l() {
        return this.e.i(cis.o);
    }

    @Override
    public void d() {
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    @Override
    public void e() {
        this.e.g((chl)null);
        this.g = null;
    }

    protected boolean a(@Nullable chl $$0, csk $$1) {
        if ($$0 == null) {
            return false;
        }
        if (!$$1.a(cqq.a(this.e), this.e, $$0)) {
            return false;
        }
        if (!this.e.a($$0.dK())) {
            return false;
        }
        if (this.d) {
            if (--this.j <= 0) {
                this.i = 0;
            }
            if (this.i == 0) {
                int n2 = this.i = this.a($$0) ? 1 : 2;
            }
            if (this.i == 2) {
                return false;
            }
        }
        return true;
    }

    private boolean a(chl $$0) {
        int $$4;
        this.j = cqq.b(10 + this.e.ep().a(5));
        flp $$1 = this.e.N().a((cgk)$$0, 0);
        if ($$1 == null) {
            return false;
        }
        fln $$2 = $$1.d();
        if ($$2 == null) {
            return false;
        }
        int $$3 = $$2.a - $$0.dO();
        return (double)($$3 * $$3 + ($$4 = $$2.c - $$0.dU()) * $$4) <= 2.25;
    }

    public cqq c(int $$0) {
        this.h = $$0;
        return this;
    }
}

