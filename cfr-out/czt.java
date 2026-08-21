/*
 * Decompiled with CFR 0.152.
 */
public class czt
extends czz {
    private static final int a = 2400;
    private static final int b = 0;
    private int c = 0;

    public czt(cgu<? extends czt> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.cn = 3;
    }

    @Override
    protected void D() {
        this.cs.a(1, new coh(this));
        this.cs.a(1, new coc(this, this.ao()));
        this.cs.a(2, new coz(this, 1.0, false));
        this.cs.a(3, new cqd(this, 1.0));
        this.cs.a(7, new cox(this, ddm.class, 8.0f));
        this.cs.a(8, new cpk(this));
        this.ct.a(1, new cqi(this, new Class[0]).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
    }

    public static cir.a k() {
        return czz.gW().a(cis.u, 8.0).a(cis.x, 0.25).a(cis.d, 2.0);
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    protected bcz W() {
        return bda.jX;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.jZ;
    }

    @Override
    protected bcz fd() {
        return bda.jY;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.ka, 0.15f, 1.0f);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.c = $$0.a("Lifetime", 0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Lifetime", this.c);
    }

    @Override
    public void g() {
        this.bC = this.ec();
        super.g();
    }

    @Override
    public void s(float $$0) {
        this.v($$0);
        super.s($$0);
    }

    @Override
    public void d_() {
        super.d_();
        if (this.ao().B_()) {
            for (int $$0 = 0; $$0 < 2; ++$$0) {
                this.ao().a(ly.ag, this.e(0.5), this.dS(), this.h(0.5), (this.as.j() - 0.5) * 2.0, -this.as.j(), (this.as.j() - 0.5) * 2.0);
            }
        } else {
            if (!this.gA()) {
                ++this.c;
            }
            if (this.c >= 2400) {
                this.aC();
            }
        }
    }

    public static boolean b(cgu<czt> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        if (!czt.c($$0, $$1, $$2, $$3, $$4)) {
            return false;
        }
        if (cgt.a($$2)) {
            return true;
        }
        ddm $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
        return $$5 == null;
    }
}

