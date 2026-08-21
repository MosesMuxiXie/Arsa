/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cmt
extends cjd<dcx> {
    private static final int c = 300;
    private static final double d = 1.73;
    private long e;

    public cmt() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.c, (Object)((Object)cqx.a), cqw.o, (Object)((Object)cqx.c)));
    }

    protected boolean b(axf $$0, dcx $$1) {
        if ($$0.au() - this.e < 300L) {
            return false;
        }
        if ($$0.y.a(2) != 0) {
            return false;
        }
        this.e = $$0.au();
        jc $$2 = $$1.ev().c(cqw.c).get();
        return $$2.a() == $$0.aq() && $$2.b().a($$1.dI(), 1.73);
    }

    protected void a(axf $$0, dcx $$12, long $$2) {
        cim<dcx> $$3 = $$12.ev();
        $$3.a(cqw.K, $$2);
        $$3.c(cqw.c).ifPresent($$1 -> $$3.a(cqw.o, new cjg($$1.b())));
        $$12.gY();
        this.a($$0, $$12);
        if ($$12.j($$0)) {
            $$12.gW();
        }
    }

    protected void a(axf $$0, dcx $$1) {
    }

    protected boolean b(axf $$0, dcx $$1, long $$2) {
        Optional<jc> $$3 = $$1.ev().c(cqw.c);
        if ($$3.isEmpty()) {
            return false;
        }
        jc $$4 = $$3.get();
        return $$4.a() == $$0.aq() && $$4.b().a($$1.dI(), 1.73);
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2) {
        return this.b(axf2, (dcx)chl2);
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.b(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (dcx)chl2, l2);
    }
}

