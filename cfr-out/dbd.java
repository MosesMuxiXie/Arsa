/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dbd
extends dba
implements czq,
dct {
    private static final alw<Boolean> a = ama.a(dbd.class, aly.k);
    private static final int b = 5;
    private static final int e = 300;
    private final cdk cv = new cdk(5);

    public dbd(cgu<? extends dbd> $$0, dwo $$1) {
        super((cgu<? extends dba>)$$0, $$1);
    }

    @Override
    protected void D() {
        super.D();
        this.cs.a(0, new coh(this));
        this.cs.a(1, new cnu<dat>(this, dat.class, 8.0f, 1.0, 1.2));
        this.cs.a(2, new dfi.a(this, 10.0f));
        this.cs.a(3, new cpq<dbd>(this, 1.0, 8.0f));
        this.cs.a(8, new cpm(this, 0.6));
        this.cs.a(9, new cox(this, ddm.class, 15.0f, 1.0f));
        this.cs.a(10, new cox(this, chn.class, 15.0f));
        this.ct.a(1, new cqi(this, dfi.class).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
        this.ct.a(3, new cqj<dcw>((chn)this, dcw.class, false));
        this.ct.a(3, new cqj<cwh>((chn)this, cwh.class, true));
    }

    public static cir.a gZ() {
        return czz.gW().a(cis.x, 0.35f).a(cis.u, 24.0).a(cis.d, 5.0).a(cis.o, 32.0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, false);
    }

    @Override
    public boolean g(dlt $$0) {
        return $$0.h() == dlx.yz;
    }

    public boolean ha() {
        return this.az.a(a);
    }

    @Override
    public void b(boolean $$0) {
        this.az.a(a, $$0);
    }

    @Override
    public void a() {
        this.bK = 0;
    }

    @Override
    public bef<dlp> aa() {
        return bdy.cq;
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.a_($$0);
    }

    @Override
    public dba.a gY() {
        if (this.ha()) {
            return dba.a.f;
        }
        if (this.b(dlx.yz)) {
            return dba.a.e;
        }
        if (this.gI()) {
            return dba.a.b;
        }
        return dba.a.h;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a_($$0);
        this.b_(true);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        return 0.0f;
    }

    @Override
    public int aj() {
        return 1;
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        bgr $$4 = $$0.G_();
        this.a($$4, $$1);
        this.a($$0, $$4, $$1);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        this.a(cgv.a, new dlt(dlx.yz));
    }

    @Override
    protected void b(dxf $$0, bgr $$1, cda $$2) {
        dlt $$3;
        super.b($$0, $$1, $$2);
        if ($$1.a(300) == 0 && ($$3 = this.fx()).a(dlx.yz)) {
            dsq.a($$3, $$0.J_(), duf.b, $$2, $$1);
        }
    }

    @Override
    protected bcz W() {
        return bda.wH;
    }

    @Override
    protected bcz fd() {
        return bda.wJ;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.wK;
    }

    @Override
    public void a(chl $$0, float $$1) {
        this.b(this, 1.6f);
    }

    @Override
    public cdk gP() {
        return this.cv;
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        dlt $$2 = $$1.e();
        if ($$2.h() instanceof djz) {
            super.a($$0, $$1);
        } else if (this.j($$2)) {
            this.a($$1);
            dlt $$3 = this.cv.b($$2);
            if ($$3.f()) {
                $$1.aC();
            } else {
                $$2.e($$3.N());
            }
        }
    }

    private boolean j(dlt $$0) {
        return this.hh() && $$0.a(dlx.xe);
    }

    @Override
    public @Nullable cic a_(int $$0) {
        int $$1 = $$0 - 300;
        if ($$1 >= 0 && $$1 < this.cv.b()) {
            return this.cv.a_($$1);
        }
        return super.a_($$0);
    }

    @Override
    public void a(axf $$0, int $$1, boolean $$2) {
        boolean $$4;
        dfh $$3 = this.he();
        boolean bl2 = $$4 = this.as.i() <= $$3.s();
        if ($$4) {
            amt<dtz> $$8;
            dlt $$5 = new dlt(dlx.yz);
            if ($$1 > $$3.a(ccz.c)) {
                amt<dtz> $$6 = duf.d;
            } else if ($$1 > $$3.a(ccz.b)) {
                amt<dtz> $$7 = duf.c;
            } else {
                $$8 = null;
            }
            if ($$8 != null) {
                dsq.a($$5, $$0.J_(), $$8, $$0.c(this.dK()), this.ep());
                this.a(cgv.a, $$5);
            }
        }
    }

    @Override
    public bcz gX() {
        return bda.wI;
    }
}

