/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class coz
extends cop {
    protected final cht a;
    private final double b;
    private final boolean c;
    private flp d;
    private double e;
    private double f;
    private double g;
    private int h;
    private int i;
    private final int j = 20;
    private long k;
    private static final long l = 20L;

    public coz(cht $$0, double $$1, boolean $$2) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        long $$0 = this.a.ao().au();
        if ($$0 - this.k < 20L) {
            return false;
        }
        this.k = $$0;
        chl $$1 = this.a.ag_();
        if ($$1 == null) {
            return false;
        }
        if (!$$1.cb()) {
            return false;
        }
        this.d = this.a.N().a((cgk)$$1, 0);
        if (this.d != null) {
            return true;
        }
        return this.a.h($$1);
    }

    @Override
    public boolean c() {
        ddm $$1;
        chl $$0 = this.a.ag_();
        if ($$0 == null) {
            return false;
        }
        if (!$$0.cb()) {
            return false;
        }
        if (!this.c) {
            return !this.a.N().l();
        }
        if (!this.a.a($$0.dK())) {
            return false;
        }
        return !($$0 instanceof ddm) || !($$1 = (ddm)$$0).au() && !$$1.ha();
    }

    @Override
    public void d() {
        this.a.N().a(this.d, this.b);
        this.a.w(true);
        this.h = 0;
        this.i = 0;
    }

    @Override
    public void e() {
        chl $$0 = this.a.ag_();
        if (!cgs.e.test($$0)) {
            this.a.g((chl)null);
        }
        this.a.w(false);
        this.a.N().n();
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        chl $$0 = this.a.ag_();
        if ($$0 == null) {
            return;
        }
        this.a.J().a($$0, 30.0f, 30.0f);
        this.h = Math.max(this.h - 1, 0);
        if ((this.c || this.a.P().a($$0)) && this.h <= 0 && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.h(this.e, this.f, this.g) >= 1.0 || this.a.ep().i() < 0.05f)) {
            this.e = $$0.dP();
            this.f = $$0.dR();
            this.g = $$0.dV();
            this.h = 4 + this.a.ep().a(7);
            double $$1 = this.a.g((cgk)$$0);
            if ($$1 > 1024.0) {
                this.h += 10;
            } else if ($$1 > 256.0) {
                this.h += 5;
            }
            if (!this.a.N().a((cgk)$$0, this.b)) {
                this.h += 15;
            }
            this.h = this.a(this.h);
        }
        this.i = Math.max(this.i - 1, 0);
        this.a($$0);
    }

    protected void a(chl $$0) {
        if (this.b($$0)) {
            this.h();
            this.a.a(cdb.a);
            this.a.c(coz.a(this.a), (cgk)$$0);
        }
    }

    protected void h() {
        this.i = this.a(20);
    }

    protected boolean i() {
        return this.i <= 0;
    }

    protected boolean b(chl $$0) {
        return this.i() && this.a.h($$0) && this.a.P().a($$0);
    }

    protected int k() {
        return this.i;
    }

    protected int l() {
        return this.a(20);
    }
}

