/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class dbm
extends dbi {
    private static final int f = 50;
    private static final float cv = 0.35f;
    private static final int cw = 7;
    private static final double cx = 12.0;
    protected static final ImmutableList<cse<? extends csd<? super dbm>>> d = ImmutableList.of(cse.c, cse.d, cse.b, cse.f, cse.m);
    protected static final ImmutableList<cqw<?>> e = ImmutableList.of(cqw.o, cqw.w, cqw.g, cqw.h, cqw.k, cqw.l, cqw.az, cqw.ay, cqw.y, cqw.z, cqw.n, cqw.F, (Object[])new cqw[]{cqw.p, cqw.q, cqw.r, cqw.u, cqw.am, cqw.N, cqw.b});

    public dbm(cgu<? extends dbm> $$0, dwo $$1) {
        super((cgu<? extends dbi>)$$0, $$1);
        this.cn = 20;
    }

    public static cir.a gP() {
        return czz.gW().a(cis.u, 50.0).a(cis.x, 0.35f).a(cis.d, 7.0).a(cis.o, 12.0);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dbn.a(this);
        this.a($$0.G_(), $$1);
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected void a(bgr $$0, cda $$1) {
        this.a(cgv.a, new dlt(dlx.qF));
    }

    protected cim.b<dbm> ew() {
        return cim.a(e, d);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        return dbn.a(this, this.ew().a($$0));
    }

    public cim<dbm> ev() {
        return super.ev();
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        if ($$1.a(dlx.qF)) {
            return super.c($$0, $$1);
        }
        return false;
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("piglinBruteBrain");
        this.ev().a($$0, this);
        $$1.c();
        dbn.b(this);
        dbn.c(this);
        super.a($$0);
    }

    @Override
    public dbl gS() {
        if (this.gI() && this.gT()) {
            return dbl.a;
        }
        return dbl.f;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk cgk2;
        boolean $$3 = super.a($$0, $$1, $$2);
        if ($$3 && (cgk2 = $$1.d()) instanceof chl) {
            chl $$4 = (chl)cgk2;
            dbn.a($$0, this, $$4);
        }
        return $$3;
    }

    @Override
    protected bcz W() {
        return bda.wB;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.wE;
    }

    @Override
    protected bcz fd() {
        return bda.wD;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.wF, 0.15f, 1.0f);
    }

    protected void gX() {
        this.b(bda.wC);
    }

    @Override
    protected void gU() {
        this.b(bda.wG);
    }
}

