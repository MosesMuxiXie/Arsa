/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class cvv
extends cvg {
    private static final int cv = 0;
    @VisibleForTesting
    public static int a = Math.abs(-24000);
    public static final float b = 0.4f;
    public static final float c = 0.3f;
    private int cw = 0;
    protected static final ImmutableList<cse<? extends csd<? super cvv>>> e = ImmutableList.of(cse.c, cse.d, cse.f, cse.s);
    protected static final ImmutableList<cqw<?>> f = ImmutableList.of(cqw.o, cqw.h, cqw.n, cqw.F, cqw.u, cqw.L, cqw.Q, cqw.S, cqw.P, cqw.s, cqw.aa);

    public cvv(cgu<? extends cvg> $$0, dwo $$1) {
        super($$0, $$1);
        this.cp = new cns(this, 85, 10, 0.02f, 0.1f, true);
        this.co = new cnr(this, 10);
    }

    @Override
    protected cre b(dwo $$0) {
        return new crg(this, $$0);
    }

    protected cim.b<cvv> ew() {
        return cim.a(f, e);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return cvw.a(this.ew().a($$0));
    }

    public cim<cvv> ev() {
        return super.ev();
    }

    @Override
    protected bcz gP() {
        return bda.CM;
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("tadpoleBrain");
        this.ev().a($$0, this);
        $$1.c();
        $$1.a("tadpoleActivityUpdate");
        cvw.a(this);
        $$1.c();
        super.a($$0);
    }

    public static cir.a gQ() {
        return cth.gW().a(cis.x, 1.0).a(cis.u, 6.0);
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.ao().B_()) {
            this.b(this.cw + 1);
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("Age", this.cw);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.b($$0.a("Age", 0));
    }

    @Override
    protected @Nullable bcz W() {
        return null;
    }

    @Override
    protected @Nullable bcz h(cex $$0) {
        return bda.CO;
    }

    @Override
    protected @Nullable bcz fd() {
        return bda.CL;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (this.j($$2)) {
            this.a($$0, $$2);
            return cdc.a;
        }
        return cti.a($$0, $$1, this).orElse(super.b($$0, $$1));
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(boolean $$0) {
    }

    @Override
    public void a(dlt $$02) {
        cti.a((chn)this, $$02);
        doe.a(ki.ag, $$02, (uz $$0) -> $$0.a("Age", this.gR()));
    }

    @Override
    public void a(uz $$0) {
        cti.a((chn)this, $$0);
        $$0.e("Age").ifPresent(this::b);
    }

    @Override
    public dlt b() {
        return new dlt(dlx.sw);
    }

    @Override
    public bcz c() {
        return bda.dA;
    }

    private boolean j(dlt $$0) {
        return $$0.a(bdy.aT);
    }

    private void a(ddm $$0, dlt $$1) {
        this.b($$0, $$1);
        this.a(cfy.d(this.gT()));
        this.ao().a(ly.R, this.e(1.0), this.dS() + 0.5, this.h(1.0), 0.0, 0.0, 0.0);
    }

    private void b(ddm $$0, dlt $$1) {
        $$1.a(1, (chl)$$0);
    }

    private int gR() {
        return this.cw;
    }

    private void a(int $$0) {
        this.b(this.cw + $$0 * 20);
    }

    private void b(int $$0) {
        this.cw = $$0;
        if (this.cw >= a) {
            this.gS();
        }
    }

    private void gS() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            this.a(cgu.af, cge.a(this, false, false), (T $$1) -> {
                $$1.a((dxf)$$0, $$0.c($$1.dK()), cgt.i, null);
                $$1.gz();
                $$1.a(this.a(this.aF()));
                this.a(bda.CN, 0.15f, 1.0f);
            });
        }
    }

    private int gT() {
        return Math.max(0, a - this.cw);
    }

    @Override
    public boolean eI() {
        return false;
    }
}

