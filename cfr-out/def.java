/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class def
extends dec {
    private static final double b = 0.15;
    private @Nullable cgr<cgk> c;
    private @Nullable iz d;
    private int e;
    private double f;
    private double g;
    private double h;

    public def(cgu<? extends def> $$0, dwo $$1) {
        super((cgu<? extends dec>)$$0, $$1);
        this.ar = true;
    }

    public def(dwo $$0, chl $$1, cgk $$2, iz.a $$3) {
        this((cgu<? extends def>)cgu.bl, $$0);
        this.d($$1);
        ftm $$4 = $$1.dj().f();
        this.b($$4.g, $$4.h, $$4.i, this.ec(), this.ee());
        this.c = cgr.a($$2);
        this.d = iz.b;
        this.a($$3, $$2);
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (this.c != null) {
            $$0.a("Target", jx.a, this.c.c());
        }
        $$0.b("Dir", iz.k, this.d);
        $$0.a("Steps", this.e);
        $$0.a("TXD", this.f);
        $$0.a("TYD", this.g);
        $$0.a("TZD", this.h);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.e = $$0.a("Steps", 0);
        this.f = $$0.a("TXD", 0.0);
        this.g = $$0.a("TYD", 0.0);
        this.h = $$0.a("TZD", 0.0);
        this.d = $$0.a("Dir", iz.k).orElse(null);
        this.c = cgr.a($$0, "Target");
    }

    @Override
    protected void a(ama.a $$0) {
    }

    private @Nullable iz f() {
        return this.d;
    }

    private void a(@Nullable iz $$0) {
        this.d = $$0;
    }

    private void a(@Nullable iz.a $$0, @Nullable cgk $$1) {
        is $$4;
        double $$2 = 0.5;
        if ($$1 == null) {
            is $$3 = this.dK().e();
        } else {
            $$2 = (double)$$1.dG() * 0.5;
            $$4 = is.a($$1.dP(), $$1.dR() + $$2, $$1.dV());
        }
        double $$5 = (double)$$4.u() + 0.5;
        double $$6 = (double)$$4.v() + $$2;
        double $$7 = (double)$$4.w() + 0.5;
        iz $$8 = null;
        if (!$$4.a(this.dI(), 2.0)) {
            is $$9 = this.dK();
            ArrayList $$10 = Lists.newArrayList();
            if ($$0 != iz.a.a) {
                if ($$9.u() < $$4.u() && this.ao().A($$9.i())) {
                    $$10.add(iz.f);
                } else if ($$9.u() > $$4.u() && this.ao().A($$9.h())) {
                    $$10.add(iz.e);
                }
            }
            if ($$0 != iz.a.b) {
                if ($$9.v() < $$4.v() && this.ao().A($$9.d())) {
                    $$10.add(iz.b);
                } else if ($$9.v() > $$4.v() && this.ao().A($$9.e())) {
                    $$10.add(iz.a);
                }
            }
            if ($$0 != iz.a.c) {
                if ($$9.w() < $$4.w() && this.ao().A($$9.g())) {
                    $$10.add(iz.d);
                } else if ($$9.w() > $$4.w() && this.ao().A($$9.f())) {
                    $$10.add(iz.c);
                }
            }
            $$8 = iz.b(this.as);
            if ($$10.isEmpty()) {
                for (int $$11 = 5; !this.ao().A($$9.a($$8)) && $$11 > 0; --$$11) {
                    $$8 = iz.b(this.as);
                }
            } else {
                $$8 = (iz)$$10.get(this.as.a($$10.size()));
            }
            $$5 = this.dP() + (double)$$8.j();
            $$6 = this.dR() + (double)$$8.k();
            $$7 = this.dV() + (double)$$8.l();
        }
        this.a($$8);
        double $$12 = $$5 - this.dP();
        double $$13 = $$6 - this.dR();
        double $$14 = $$7 - this.dV();
        double $$15 = Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14);
        if ($$15 == 0.0) {
            this.f = 0.0;
            this.g = 0.0;
            this.h = 0.0;
        } else {
            this.f = $$12 / $$15 * 0.15;
            this.g = $$13 / $$15 * 0.15;
            this.h = $$14 / $$15 * 0.15;
        }
        this.aF = true;
        this.e = 10 + this.as.a(5) * 10;
    }

    @Override
    public void dW() {
        if (this.ao().av() == ccz.a) {
            this.aC();
        }
    }

    @Override
    protected double bs() {
        return 0.04;
    }

    @Override
    public void g() {
        super.g();
        cgk $$0 = !this.ao().B_() ? cgr.a(this.c, this.ao()) : null;
        ftk $$1 = null;
        if (!this.ao().B_()) {
            if ($$0 == null) {
                this.c = null;
            }
            if (!($$0 == null || !$$0.cb() || $$0 instanceof ddm && $$0.au())) {
                this.f = bgj.a(this.f * 1.025, -1.0, 1.0);
                this.g = bgj.a(this.g * 1.025, -1.0, 1.0);
                this.h = bgj.a(this.h * 1.025, -1.0, 1.0);
                ftm $$2 = this.dN();
                this.k($$2.b((this.f - $$2.g) * 0.2, (this.g - $$2.h) * 0.2, (this.h - $$2.i) * 0.2));
            } else {
                this.bu();
            }
            $$1 = dee.a((cgk)this, this::b);
        }
        ftm $$3 = this.dN();
        this.b(this.dI().e($$3));
        this.aW();
        if (this.aG != null && this.aG.e()) {
            this.cn();
        }
        if ($$1 != null && this.cb() && $$1.d() != ftk.a.a) {
            this.a($$1);
        }
        dee.a((cgk)this, 0.5f);
        if (this.ao().B_()) {
            this.ao().a(ly.u, this.dP() - $$3.g, this.dR() - $$3.h + 0.15, this.dV() - $$3.i, 0.0, 0.0, 0.0);
        } else if ($$0 != null) {
            if (this.e > 0) {
                --this.e;
                if (this.e == 0) {
                    this.a(this.d == null ? null : this.d.o(), $$0);
                }
            }
            if (this.d != null) {
                is $$4 = this.dK();
                iz.a $$5 = this.d.o();
                if (this.ao().a($$4.a(this.d), this)) {
                    this.a($$5, $$0);
                } else {
                    is $$6 = $$0.dK();
                    if ($$5 == iz.a.a && $$4.u() == $$6.u() || $$5 == iz.a.c && $$4.w() == $$6.w() || $$5 == iz.a.b && $$4.v() == $$6.v()) {
                        this.a($$5, $$0);
                    }
                }
            }
        }
    }

    @Override
    protected boolean ba() {
        return !this.eh();
    }

    @Override
    protected boolean b(cgk $$0) {
        return super.b($$0) && !$$0.ar;
    }

    @Override
    public boolean cp() {
        return false;
    }

    @Override
    public boolean a(double $$0) {
        return $$0 < 16384.0;
    }

    @Override
    public float bO() {
        return 1.0f;
    }

    @Override
    protected void a(ftj $$0) {
        super.a($$0);
        cgk $$1 = $$0.a();
        cgk $$2 = this.p();
        chl $$3 = $$2 instanceof chl ? (chl)$$2 : null;
        cex $$4 = this.en().a((cgk)this, $$3);
        boolean $$5 = $$1.b($$4, 4.0f);
        if ($$5) {
            dwo dwo2 = this.ao();
            if (dwo2 instanceof axf) {
                axf $$6 = (axf)dwo2;
                dsq.a($$6, $$1, $$4);
            }
            if ($$1 instanceof chl) {
                chl $$7 = (chl)$$1;
                $$7.b(new cfm(cfo.y, 200), (cgk)MoreObjects.firstNonNull((Object)$$2, (Object)this));
            }
        }
    }

    @Override
    protected void a(fti $$0) {
        super.a($$0);
        ((axf)this.ao()).a(ly.x, this.dP(), this.dR(), this.dV(), 2, 0.2, 0.2, 0.2, 0.0);
        this.a(bda.zV, 1.0f, 1.0f);
    }

    private void i() {
        this.aC();
        this.ao().a(etk.o, this.dI(), etk.a.a(this));
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        this.i();
    }

    @Override
    public boolean bX() {
        return true;
    }

    @Override
    public boolean b(cex $$0) {
        return true;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        this.a(bda.zW, 1.0f, 1.0f);
        $$0.a(ly.g, this.dP(), this.dR(), this.dV(), 15, 0.2, 0.2, 0.2, 0.0);
        this.i();
        return true;
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        this.k($$0.j());
    }
}

