/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class czg
extends czb {
    private static final alw<jd<czh>> c = ama.a(czg.class, aly.E);
    public static final float b = 0.0625f;

    public czg(cgu<? extends czg> $$0, dwo $$1) {
        super((cgu<? extends czb>)$$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, dfw.b(this.eo(), mj.bn));
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (c.equals($$0)) {
            this.e();
        }
    }

    private void a(jd<czh> $$0) {
        this.az.a(c, $$0);
    }

    public jd<czh> k() {
        return this.az.a(c);
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aU) {
            return czg.c($$0, this.k());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aU);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aU) {
            this.a(czg.c(ki.aU, $$1));
            return true;
        }
        return super.b($$0, $$1);
    }

    public static Optional<czg> a(dwo $$0, is $$12, iz $$2) {
        czg $$3 = new czg($$0, $$12);
        ArrayList<jd> $$4 = new ArrayList<jd>();
        $$0.J_().f(mj.bn).c(bdz.a).forEach($$4::add);
        if ($$4.isEmpty()) {
            return Optional.empty();
        }
        $$3.b($$2);
        $$4.removeIf($$1 -> {
            $$3.a((jd<czh>)$$1);
            return !$$3.f();
        });
        if ($$4.isEmpty()) {
            return Optional.empty();
        }
        int $$5 = $$4.stream().mapToInt(czg::b).max().orElse(0);
        $$4.removeIf($$1 -> czg.b($$1) < $$5);
        Optional $$6 = bhs.b($$4, $$3.as);
        if ($$6.isEmpty()) {
            return Optional.empty();
        }
        $$3.a((jd)$$6.get());
        $$3.b($$2);
        return Optional.of($$3);
    }

    private static int b(jd<czh> $$0) {
        return $$0.a().a();
    }

    private czg(dwo $$0, is $$1) {
        super((cgu<? extends czb>)cgu.aR, $$0, $$1);
    }

    public czg(dwo $$0, is $$1, iz $$2, jd<czh> $$3) {
        this($$0, $$1);
        this.a($$3);
        this.b($$2);
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("facing", iz.l, this.dg());
        super.a($$0);
        dfw.a($$0, this.k());
    }

    @Override
    protected void a(fnq $$0) {
        iz $$1 = $$0.a("facing", iz.l).orElse(iz.d);
        super.a($$0);
        this.b($$1);
        dfw.a($$0, mj.bn).ifPresent(this::a);
    }

    @Override
    protected fth a(is $$0, iz $$1) {
        float $$2 = 0.46875f;
        ftm $$3 = ftm.b($$0).a($$1, -0.46875);
        czh $$4 = this.k().a();
        double $$5 = this.a($$4.b());
        double $$6 = this.a($$4.c());
        iz $$7 = $$1.i();
        ftm $$8 = $$3.a($$7, $$5).a(iz.b, $$6);
        iz.a $$9 = $$1.o();
        double $$10 = $$9 == iz.a.a ? 0.0625 : (double)$$4.b();
        double $$11 = $$4.c();
        double $$12 = $$9 == iz.a.c ? 0.0625 : (double)$$4.b();
        return fth.a($$8, $$10, $$11, $$12);
    }

    private double a(int $$0) {
        return $$0 % 2 == 0 ? 0.5 : 0.0;
    }

    @Override
    public void a(axf $$0, @Nullable cgk $$1) {
        ddm $$2;
        if (!$$0.U().a(eua.k).booleanValue()) {
            return;
        }
        this.a(bda.uU, 1.0f, 1.0f);
        if ($$1 instanceof ddm && ($$2 = (ddm)$$1).gv()) {
            return;
        }
        this.a($$0, dlx.rJ);
    }

    @Override
    public void v() {
        this.a(bda.uV, 1.0f, 1.0f);
    }

    @Override
    public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
        this.a_($$0, $$1, $$2);
    }

    @Override
    public ftm dJ() {
        return ftm.a(this.a);
    }

    @Override
    public aay<adb> a(axd $$0) {
        return new adc((cgk)this, this.dg().d(), this.i());
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        this.b(iz.a($$0.n()));
    }

    @Override
    public dlt dZ() {
        return new dlt(dlx.rJ);
    }
}

