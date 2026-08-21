/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class czp
extends czz {
    private static final alw<Integer> a = ama.a(czp.class, aly.b);
    private static final alw<Boolean> b = ama.a(czp.class, aly.k);
    private static final alw<Boolean> c = ama.a(czp.class, aly.k);
    private static final boolean d = false;
    private static final boolean e = false;
    private static final short f = 30;
    private static final byte cv = 3;
    private int cw;
    private int cx;
    private int cy = 30;
    private int cz = 3;
    private boolean cA;

    public czp(cgu<? extends czp> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.cs.a(1, new coh(this));
        this.cs.a(2, new cpx(this));
        this.cs.a(3, new cnu<cve>(this, cve.class, 6.0f, 1.0, 1.2));
        this.cs.a(3, new cnu<cvb>(this, cvb.class, 6.0f, 1.0, 1.2));
        this.cs.a(4, new coz(this, 1.0, false));
        this.cs.a(5, new cqd(this, 0.8));
        this.cs.a(6, new cox(this, ddm.class, 8.0f));
        this.cs.a(6, new cpk(this));
        this.ct.a(1, new cqj<ddm>((chn)this, ddm.class, true));
        this.ct.a(2, new cqi(this, new Class[0]));
    }

    public static cir.a k() {
        return czz.gW().a(cis.x, 0.25);
    }

    @Override
    public int cW() {
        if (this.ag_() == null) {
            return this.y(0.0f);
        }
        return this.y(this.eZ() - 1.0f);
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        this.cx += (int)($$0 * 1.5);
        if (this.cx > this.cy - 5) {
            this.cx = this.cy - 5;
        }
        return $$3;
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, -1);
        $$0.a(b, false);
        $$0.a(c, false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("powered", this.p());
        $$0.a("Fuse", (short)this.cy);
        $$0.a("ExplosionRadius", (byte)this.cz);
        $$0.a("ignited", this.gQ());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.az.a(b, $$0.a("powered", false));
        this.cy = $$0.a("Fuse", (short)30);
        this.cz = $$0.a("ExplosionRadius", (byte)3);
        if ($$0.a("ignited", false)) {
            this.gR();
        }
    }

    @Override
    public void g() {
        if (this.cb()) {
            int $$0;
            this.cw = this.cx;
            if (this.gQ()) {
                this.a(1);
            }
            if (($$0 = this.gP()) > 0 && this.cx == 0) {
                this.a(bda.hI, 1.0f, 0.5f);
                this.c(etk.I);
            }
            this.cx += $$0;
            if (this.cx < 0) {
                this.cx = 0;
            }
            if (this.cx >= this.cy) {
                this.cx = this.cy;
                this.gS();
            }
        }
        super.g();
    }

    @Override
    public void g(@Nullable chl $$0) {
        if ($$0 instanceof cvy) {
            return;
        }
        super.g($$0);
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.hH;
    }

    @Override
    protected bcz fd() {
        return bda.hG;
    }

    @Override
    public boolean a(axf $$0, chl $$1, cex $$22) {
        if (this.e($$0) && this.p() && !this.cA) {
            $$1.a($$0, $$22, false, fnv.bd, (dlt $$2) -> {
                $$1.a($$0, (dlt)$$2);
                this.cA = true;
            });
        }
        return super.a($$0, $$1, $$22);
    }

    @Override
    public boolean c(axf $$0, cgk $$1) {
        return true;
    }

    public boolean p() {
        return this.az.a(b);
    }

    public float L(float $$0) {
        return bgj.h($$0, this.cw, this.cx) / (float)(this.cy - 2);
    }

    public int gP() {
        return this.az.a(a);
    }

    public void a(int $$0) {
        this.az.a(a, $$0);
    }

    @Override
    public void a(axf $$0, chk $$1) {
        super.a($$0, $$1);
        this.az.a(b, true);
    }

    @Override
    protected cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(bdy.bP)) {
            bcz $$3 = $$2.a(dlx.wi) ? bda.kx : bda.kN;
            this.ao().a((cgk)$$0, this.dP(), this.dR(), this.dV(), $$3, this.dB(), 1.0f, this.as.i() * 0.4f + 0.8f);
            if (!this.ao().B_()) {
                this.gR();
                if (!$$2.m()) {
                    $$2.h(1);
                } else {
                    $$2.a(1, (chl)$$0, $$1.a());
                }
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    private void gS() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            float $$1 = this.p() ? 2.0f : 1.0f;
            this.bJ = true;
            $$0.a((cgk)this, this.dP(), this.dR(), this.dV(), (float)this.cz * $$1, dwo.a.c);
            this.gT();
            this.a($$0, cgk.e.a);
            this.aC();
        }
    }

    private void gT() {
        Collection<cfm> $$0 = this.eW();
        if (!$$0.isEmpty()) {
            cga $$1 = new cga(this.ao(), this.dP(), this.dR(), this.dV());
            $$1.a(2.5f);
            $$1.c(-0.5f);
            $$1.d(10);
            $$1.a(300);
            $$1.b(0.25f);
            $$1.d(-$$1.c() / (float)$$1.h());
            for (cfm $$2 : $$0) {
                $$1.a(new cfm($$2));
            }
            this.ao().b($$1);
        }
    }

    public boolean gQ() {
        return this.az.a(c);
    }

    public void gR() {
        this.az.a(c, true);
    }
}

