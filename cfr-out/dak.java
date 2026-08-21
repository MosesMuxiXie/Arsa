/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class dak
extends czz
implements day {
    private static final alw<Boolean> e = ama.a(dak.class, aly.k);
    private static final int f = 40;
    private static final int cv = 1;
    private static final float cw = 0.6f;
    private static final int cx = 6;
    private static final float cy = 0.5f;
    private static final int cz = 40;
    private static final int cA = 15;
    private static final int cB = 200;
    private static final float cC = 0.3f;
    private static final float cD = 0.4f;
    private static final boolean cE = false;
    private int cF;
    protected static final ImmutableList<? extends cse<? extends csd<? super dak>>> a = ImmutableList.of(cse.c, cse.d);
    protected static final ImmutableList<? extends cqw<?>> b = ImmutableList.of(cqw.g, cqw.h, cqw.k, cqw.l, cqw.o, cqw.n, cqw.F, cqw.u, cqw.p, cqw.q);

    public dak(cgu<? extends dak> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
        this.cn = 5;
    }

    protected cim.b<dak> ew() {
        return cim.a(b, a);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        cim<dak> $$1 = this.ew().a($$0);
        dak.a($$1);
        dak.b($$1);
        dak.c($$1);
        $$1.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$1.b(dfl.b);
        $$1.e();
        return $$1;
    }

    private static void a(cim<dak> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<dak>>)ImmutableList.of((Object)new ckk(45, 90), (Object)new cko()));
    }

    private static void b(cim<dak> $$02) {
        $$02.a(dfl.b, 10, (ImmutableList<cje<dak>>)ImmutableList.of(clt.a((axf $$0, E $$1) -> $$1.h($$0)), cle.a(8.0f, ccn.a(30, 60)), new clb(ImmutableList.of((Object)Pair.of(ckw.a(0.4f), (Object)2), (Object)Pair.of(cll.a(0.4f, 3), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)))));
    }

    private static void c(cim<dak> $$0) {
        $$0.a(dfl.k, 10, (ImmutableList<cje<dak>>)ImmutableList.of(clj.a(1.0f), cmv.a(dak::p, ckl.a(40)), cmv.a(dak::e_, ckl.a(15)), clw.a()), cqw.p);
    }

    private Optional<? extends chl> h(axf $$0) {
        return this.ev().c(cqw.h).orElse(cqy.a()).a((chl $$1) -> this.b($$0, (chl)$$1));
    }

    private boolean b(axf $$0, chl $$1) {
        cgu<?> $$2 = $$1.ay();
        return $$2 != cgu.bV && $$2 != cgu.I && csd.c($$0, this, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(e, false);
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (e.equals($$0)) {
            this.j_();
        }
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$0.G_().i() < 0.2f) {
            this.a_(true);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public static cir.a k() {
        return czz.gW().a(cis.u, 40.0).a(cis.x, 0.3f).a(cis.r, 0.6f).a(cis.e, 1.0).a(cis.d, 6.0);
    }

    public boolean p() {
        return !this.e_();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean c(axf $$0, cgk $$1) {
        void $$3;
        if (!($$1 instanceof chl)) {
            return false;
        }
        chl $$2 = (chl)$$1;
        this.cF = 10;
        $$0.a((cgk)this, (byte)4);
        this.b(bda.GC);
        return day.a($$0, this, (chl)$$3);
    }

    @Override
    public boolean aj_() {
        return true;
    }

    @Override
    protected void d(chl $$0) {
        if (!this.e_()) {
            day.a(this, $$0);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        void $$5;
        cgk cgk2;
        boolean $$3 = super.a($$0, $$1, $$2);
        if (!$$3 || !((cgk2 = $$1.d()) instanceof chl)) {
            return $$3;
        }
        chl $$4 = (chl)cgk2;
        if (this.c((chl)$$5) && !cjf.a((chl)this, (chl)$$5, 4.0)) {
            this.i((chl)$$5);
        }
        return true;
    }

    private void i(chl $$0) {
        this.ca.b(cqw.F);
        this.ca.a(cqw.p, $$0, 200L);
    }

    public cim<dak> ev() {
        return super.ev();
    }

    protected void gP() {
        dfl $$0 = this.ca.f().orElse(null);
        this.ca.a((List<dfl>)ImmutableList.of((Object)dfl.k, (Object)dfl.b));
        dfl $$1 = this.ca.f().orElse(null);
        if ($$1 == dfl.k && $$0 != dfl.k) {
            this.gR();
        }
        this.w(this.ca.a(cqw.p));
    }

    @Override
    protected void a(axf $$0) {
        bzm $$1 = bzl.a();
        $$1.a("zoglinBrain");
        this.ev().a($$0, this);
        $$1.c();
        this.gP();
    }

    @Override
    public void a_(boolean $$0) {
        this.aD().a(e, $$0);
        if (!this.ao().B_() && $$0) {
            this.h(cis.d).a(0.5);
        }
    }

    @Override
    public boolean e_() {
        return this.aD().a(e);
    }

    @Override
    public void d_() {
        if (this.cF > 0) {
            --this.cF;
        }
        super.d_();
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 4) {
            this.cF = 10;
            this.b(bda.GC);
        } else {
            super.b($$0);
        }
    }

    @Override
    public int gQ() {
        return this.cF;
    }

    @Override
    protected bcz W() {
        if (this.ao().B_()) {
            return null;
        }
        if (this.ca.a(cqw.p)) {
            return bda.GB;
        }
        return bda.GA;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.GE;
    }

    @Override
    protected bcz fd() {
        return bda.GD;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.GF, 0.15f, 1.0f);
    }

    protected void gR() {
        this.b(bda.GB);
    }

    @Override
    public @Nullable chl ag_() {
        return this.Q();
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("IsBaby", this.e_());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.a_($$0.a("IsBaby", false));
    }
}

