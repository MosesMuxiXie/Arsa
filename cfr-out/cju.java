/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class cju<E extends chl>
extends cjd<E> {
    private static final int c = 3;
    private static final int d = 60;
    private final Function<chl, Optional<cks>> e;
    private final float f;

    public cju(Function<chl, Optional<cks>> $$0, float $$1, int $$2) {
        super(Map.of(cqw.o, cqx.c, cqw.n, cqx.c, cqw.ba, cqx.c), $$2);
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    protected boolean a(axf $$0, E $$1) {
        return this.b($$1);
    }

    @Override
    protected boolean a(axf $$0, E $$1, long $$2) {
        return this.b($$1);
    }

    @Override
    protected void d(axf $$0, E $$12, long $$2) {
        this.e.apply((chl)$$12).ifPresent($$1 -> cjf.a($$12, $$1, this.f, 3));
    }

    @Override
    protected void c(axf $$0, E $$1, long $$22) {
        dlt $$6;
        Optional<cks> $$3 = this.e.apply((chl)$$1);
        if ($$3.isEmpty()) {
            return;
        }
        cks $$4 = $$3.get();
        double $$5 = $$4.a().f(((cgk)$$1).bV());
        if ($$5 < 3.0 && !($$6 = ((dct)$$1).gP().a(0, 1)).f()) {
            cju.a($$1, $$6, cju.a($$4));
            if ($$1 instanceof ctl) {
                ctl $$7 = (ctl)$$1;
                ctm.a((chl)$$7).ifPresent($$2 -> this.a($$4, $$6, (axg)$$2));
            }
            ((chl)$$1).ev().a(cqw.ba, 60);
        }
    }

    private void a(cks $$0, dlt $$1, axg $$2) {
        is $$3 = $$0.b().e();
        aj.ac.a($$2, $$3, $$1);
    }

    private boolean b(E $$0) {
        if (((dct)$$0).gP().c()) {
            return false;
        }
        Optional<cks> $$1 = this.e.apply((chl)$$0);
        return $$1.isPresent();
    }

    private static ftm a(cks $$0) {
        return $$0.a().b(0.0, 1.0, 0.0);
    }

    public static void a(chl $$0, dlt $$1, ftm $$2) {
        ftm $$3 = new ftm(0.2f, 0.3f, 0.2f);
        cjf.a($$0, $$1, $$2, $$3, 0.2f);
        dwo $$4 = $$0.ao();
        if ($$4.au() % 7L == 0L && $$4.y.j() < 0.9) {
            float $$5 = bhs.a(ctl.d, $$4.G_()).floatValue();
            $$4.a(null, $$0, bda.g, bdb.g, 1.0f, $$5);
        }
    }
}

