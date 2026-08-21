/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class ciy<E extends cht>
extends cjd<E> {
    private static final int c = 100;
    private static final int d = 120;
    private static final int e = 5;
    private static final int f = 4;
    private final float g;
    private final Function<cht, bef<cez>> h;
    private final Function<E, ftm> i;

    public ciy(float $$02) {
        this($$02, $$0 -> bdq.F, $$0 -> csr.a($$0, 5, 4));
    }

    public ciy(float $$02, int $$12) {
        this($$02, $$0 -> bdq.F, $$1 -> csm.a($$1, 5, 4, $$12, $$1.h((float)0.0f).g, $$1.h((float)0.0f).i, 1.5707963705062866));
    }

    public ciy(float $$02, Function<cht, bef<cez>> $$1) {
        this($$02, $$1, $$0 -> csr.a($$0, 5, 4));
    }

    public ciy(float $$0, Function<cht, bef<cez>> $$1, Function<E, ftm> $$2) {
        super(Map.of(cqw.aa, cqx.c, cqw.y, cqx.c), 100, 120);
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
    }

    @Override
    protected boolean a(axf $$0, E $$12) {
        return ((chl)$$12).ev().c(cqw.y).map($$1 -> $$1.a(this.h.apply((cht)$$12))).orElse(false) != false || ((chl)$$12).ev().a(cqw.aa);
    }

    @Override
    protected boolean a(axf $$0, E $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(axf $$0, E $$1, long $$2) {
        ((chl)$$1).ev().a(cqw.aa, true);
        ((chl)$$1).ev().b(cqw.n);
        ((chn)$$1).N().n();
    }

    @Override
    protected void c(axf $$0, E $$1, long $$2) {
        cim<?> $$3 = ((chl)$$1).ev();
        $$3.b(cqw.aa);
    }

    @Override
    protected void d(axf $$0, E $$1, long $$2) {
        ftm $$3;
        if (((chn)$$1).N().l() && ($$3 = this.a($$1, $$0)) != null) {
            ((chl)$$1).ev().a(cqw.n, new cqz($$3, this.g, 0));
        }
    }

    private @Nullable ftm a(E $$0, axf $$1) {
        Optional<ftm> $$2;
        if (((cgk)$$0).cp() && ($$2 = this.a((dvt)$$1, (cgk)$$0).map(ftm::c)).isPresent()) {
            return $$2.get();
        }
        return this.i.apply($$0);
    }

    private Optional<is> a(dvt $$0, cgk $$13) {
        Predicate<is> $$4;
        is $$2 = $$13.dK();
        if (!$$0.a_($$2).g($$0, $$2).c()) {
            return Optional.empty();
        }
        if (bgj.d($$13.dF()) == 2) {
            Predicate<is> $$3 = $$12 -> is.a($$12).allMatch($$1 -> $$0.b_((is)$$1).a(bdv.a));
        } else {
            $$4 = $$1 -> $$0.b_((is)$$1).a(bdv.a);
        }
        return is.a($$2, 5, 1, $$4);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (E)((cht)chl2), l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (E)((cht)chl2), l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (E)((cht)chl2), l2);
    }
}

