/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cpr
extends cpc {
    private final dzq g;
    private final chn h;
    private int i;
    private static final int j = 20;

    public cpr(dzq $$0, cht $$1, double $$2, int $$3) {
        super($$1, $$2, 24, $$3);
        this.g = $$0;
        this.h = $$1;
    }

    @Override
    public boolean b() {
        if (!cpr.a(this.h).U().a(eua.F).booleanValue()) {
            return false;
        }
        if (this.c > 0) {
            --this.c;
            return false;
        }
        if (this.n()) {
            this.c = cpr.b(20);
            return true;
        }
        this.c = this.a(this.a);
        return false;
    }

    @Override
    public void e() {
        super.e();
        this.h.an = 1.0;
    }

    @Override
    public void d() {
        super.d();
        this.i = 0;
    }

    public void a(dwp $$0, is $$1) {
    }

    public void a(dwo $$0, is $$1) {
    }

    @Override
    public void a() {
        super.a();
        dwo $$0 = this.h.ao();
        is $$1 = this.h.dK();
        is $$2 = this.a($$1, $$0);
        bgr $$3 = this.h.ep();
        if (this.m() && $$2 != null) {
            if (this.i > 0) {
                ftm $$4 = this.h.dN();
                this.h.m($$4.g, 0.3, $$4.i);
                if (!$$0.B_()) {
                    double $$5 = 0.08;
                    ((axf)$$0).a(new lu(ly.V, new dlt(dlx.sD)), (double)$$2.u() + 0.5, (double)$$2.v() + 0.7, (double)$$2.w() + 0.5, 3, ((double)$$3.i() - 0.5) * 0.08, ((double)$$3.i() - 0.5) * 0.08, ((double)$$3.i() - 0.5) * 0.08, (double)0.15f);
                }
            }
            if (this.i % 2 == 0) {
                ftm $$6 = this.h.dN();
                this.h.m($$6.g, -0.3, $$6.i);
                if (this.i % 6 == 0) {
                    this.a((dwp)$$0, this.e);
                }
            }
            if (this.i > 60) {
                $$0.a($$2, false);
                if (!$$0.B_()) {
                    for (int $$7 = 0; $$7 < 20; ++$$7) {
                        double $$8 = $$3.k() * 0.02;
                        double $$9 = $$3.k() * 0.02;
                        double $$10 = $$3.k() * 0.02;
                        ((axf)$$0).a(ly.af, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, (double)0.15f);
                    }
                    this.a($$0, $$2);
                }
            }
            ++this.i;
        }
    }

    private @Nullable is a(is $$0, dvt $$1) {
        is[] $$2;
        if ($$1.a_($$0).a(this.g)) {
            return $$0;
        }
        for (is $$3 : $$2 = new is[]{$$0.e(), $$0.h(), $$0.i(), $$0.f(), $$0.g(), $$0.e().e()}) {
            if (!$$1.a_($$3).a(this.g)) continue;
            return $$3;
        }
        return null;
    }

    @Override
    protected boolean a(dwr $$0, is $$1) {
        eqf $$2 = $$0.a(jw.a($$1.u()), jw.a($$1.w()), erj.n, false);
        if ($$2 != null) {
            return $$2.a_($$1).a(this.g) && $$2.a_($$1.d()).l() && $$2.a_($$1.b(2)).l();
        }
        return false;
    }
}

