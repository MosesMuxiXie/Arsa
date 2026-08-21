/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dcp
extends dcn
implements chq {
    private static final cgn f = cgu.ca.n().a(0.5f).b(0.97f);
    private static final amo cv = amo.b("attacking");
    private static final ciq cw = new ciq(cv, 0.05, ciq.a.a);
    private static final ccn cx = bhn.a(0, 1);
    private int cy;
    private static final ccn cz = bhn.a(20, 39);
    private long cA;
    private @Nullable cgr<chl> cB;
    private static final int cC = 10;
    private static final ccn cD = bhn.a(4, 6);
    private int cE;

    public dcp(cgu<? extends dcp> $$0, dwo $$1) {
        super((cgu<? extends dcn>)$$0, $$1);
        this.a(fls.i, 8.0f);
    }

    @Override
    protected void p() {
        this.cs.a(1, new cpv<dcp>(this, 1.0, 1.0, 10.0f, 2.0f));
        this.cs.a(2, new cqf(this, 1.0, false));
        this.cs.a(7, new cqd(this, 1.0));
        this.ct.a(1, new cqi(this, new Class[0]).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>(this, ddm.class, 10, true, false, this::a));
        this.ct.a(3, new cqp<dcp>(this, true));
    }

    public static cir.a gS() {
        return dcn.gT().a(cis.C, 0.0).a(cis.x, 0.23f).a(cis.d, 5.0);
    }

    @Override
    public cgn b(chx $$0) {
        return this.e_() ? f : super.b($$0);
    }

    @Override
    protected boolean gR() {
        return false;
    }

    @Override
    protected void a(axf $$0) {
        cio $$1 = this.h(cis.x);
        if (this.ab_()) {
            if (!this.e_() && !$$1.b(cv)) {
                $$1.b(cw);
            }
            this.gZ();
        } else if ($$1.b(cv)) {
            $$1.c(cv);
        }
        this.a($$0, true);
        if (this.ag_() != null) {
            this.ha();
        }
        super.a($$0);
    }

    private void gZ() {
        if (this.cy > 0) {
            --this.cy;
            if (this.cy == 0) {
                this.hc();
            }
        }
    }

    private void ha() {
        if (this.cE > 0) {
            --this.cE;
            return;
        }
        if (this.P().a(this.ag_())) {
            this.hb();
        }
        this.cE = cD.a(this.as);
    }

    private void hb() {
        double $$02 = this.i(cis.o);
        fth $$1 = fth.a(this.dI()).c($$02, 10.0, $$02);
        this.ao().a(dcp.class, $$1, cgs.f).stream().filter($$0 -> $$0 != this).filter($$0 -> $$0.ag_() == null).filter($$0 -> !$$0.t(this.ag_())).forEach($$0 -> $$0.g(this.ag_()));
    }

    private void hc() {
        this.a(bda.Hh, this.fC() * 2.0f, this.fD() * 1.8f);
    }

    @Override
    public void g(@Nullable chl $$0) {
        if (this.ag_() == null && $$0 != null) {
            this.cy = cx.a(this.as);
            this.cE = cD.a(this.as);
        }
        super.g($$0);
    }

    @Override
    public void c() {
        this.a((long)cz.a(this.as));
    }

    public static boolean b(cgu<dcp> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.av() != ccz.a && !$$1.a_($$3.e()).a(dzs.lG);
    }

    @Override
    public boolean a(dwr $$0) {
        return $$0.f(this) && !$$0.d(this.dj());
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.b_($$0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a(this.ao(), $$0);
    }

    @Override
    public void b(long $$0) {
        this.cA = $$0;
    }

    @Override
    public long a() {
        return this.cA;
    }

    @Override
    public void a(@Nullable cgr<chl> $$0) {
        this.cB = $$0;
    }

    @Override
    protected bcz W() {
        return this.ab_() ? bda.Hh : bda.Hg;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Hj;
    }

    @Override
    protected bcz fd() {
        return bda.Hi;
    }

    @Override
    public void a(bgr $$0, cda $$1) {
        this.a(cgv.a, new dlt($$0.a(20) == 0 ? dlx.xM : dlx.qC));
    }

    @Override
    protected void gY() {
        this.h(cis.C).a(0.0);
    }

    @Override
    public @Nullable cgr<chl> b() {
        return this.cB;
    }

    @Override
    public boolean a(axf $$0, ddm $$1) {
        return this.a((chl)$$1, $$0);
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        return this.h($$1);
    }
}

