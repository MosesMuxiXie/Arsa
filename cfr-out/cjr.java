/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class cjr
extends cjd<cht> {
    public static final int c = 100;
    public static final double d = 2.5;
    public static final double e = 3.5;
    private final Function<chl, Float> f;
    private final Function<chl, Double> g;
    private final boolean h;

    public cjr(Function<chl, Float> $$02) {
        this($$02, $$0 -> 2.5);
    }

    public cjr(Function<chl, Float> $$0, Function<chl, Double> $$1) {
        this($$0, $$1, false);
    }

    public cjr(Function<chl, Float> $$0, Function<chl, Double> $$1, boolean $$2) {
        super((Map)bhs.a(() -> {
            ImmutableMap.Builder $$0 = ImmutableMap.builder();
            $$0.put(cqw.o, (Object)cqx.c);
            $$0.put(cqw.n, (Object)cqx.c);
            $$0.put(cqw.Q, (Object)cqx.b);
            $$0.put(cqw.S, (Object)cqx.b);
            $$0.put(cqw.P, (Object)cqx.a);
            $$0.put(cqw.s, (Object)cqx.b);
            $$0.put(cqw.aa, (Object)cqx.b);
            return $$0.build();
        }));
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
    }

    protected float a(cht $$0) {
        return this.f.apply($$0).floatValue();
    }

    private Optional<ddm> b(cht $$0) {
        return $$0.ev().c(cqw.P);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    @Override
    protected boolean a(axf $$0, cht $$1, long $$2) {
        return this.b($$1).isPresent() && !$$1.ev().a(cqw.s) && !$$1.ev().a(cqw.aa);
    }

    @Override
    protected void b(axf $$0, cht $$1, long $$2) {
        $$1.ev().a(cqw.S, true);
    }

    @Override
    protected void c(axf $$0, cht $$1, long $$2) {
        cim<?> $$3 = $$1.ev();
        $$3.a(cqw.Q, 100);
        $$3.b(cqw.S);
        $$3.b(cqw.n);
        $$3.b(cqw.o);
    }

    @Override
    protected void d(axf $$0, cht $$1, long $$2) {
        ddm $$3 = this.b($$1).get();
        cim<?> $$4 = $$1.ev();
        $$4.a(cqw.o, new cjp($$3, true));
        double $$5 = this.g.apply($$1);
        if ($$1.g((cgk)$$3) < bgj.n($$5)) {
            $$4.b(cqw.n);
        } else {
            $$4.a(cqw.n, new cqz(new cjp($$3, this.h, this.h), this.a($$1), 2));
        }
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (cht)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (cht)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (cht)chl2, l2);
    }
}

