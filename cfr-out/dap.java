/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dap
extends cjd<dal> {
    private static final int c = 256;
    private static final int d = 5;
    private static final int e = 4;
    private static final float f = 0.7f;
    private static final int g = Math.round(15.0f);
    private static final int h = Math.round(4.0f);
    private static final int i = Math.round(10.0f);

    @VisibleForTesting
    public dap() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.p, (Object)((Object)cqx.a), cqw.bj, (Object)((Object)cqx.b), cqw.bh, (Object)((Object)cqx.b), cqw.bi, (Object)((Object)cqx.b), cqw.bg, (Object)((Object)cqx.a), cqw.n, (Object)((Object)cqx.b), cqw.bl, (Object)((Object)cqx.b)), g + 1 + h);
    }

    @Override
    protected boolean a(axf $$0, dal $$12) {
        if ($$12.aF() != chx.a) {
            return false;
        }
        return $$12.ev().c(cqw.p).map($$1 -> dap.a($$12, $$1)).map($$1 -> {
            if (!$$1.booleanValue()) {
                $$12.ev().b(cqw.bg);
            }
            return $$1;
        }).orElse(false);
    }

    @Override
    protected boolean a(axf $$0, dal $$1, long $$2) {
        return $$1.ev().a(cqw.p) && $$1.ev().a(cqw.bg);
    }

    @Override
    protected void b(axf $$0, dal $$12, long $$2) {
        $$12.ev().c(cqw.p).ifPresent($$1 -> $$12.c(chx.q));
        $$12.ev().a(cqw.bh, bhr.a, g);
        $$12.a(bda.cS, 1.0f, 1.0f);
    }

    @Override
    protected void c(axf $$0, dal $$1, long $$2) {
        if ($$1.aF() == chx.q) {
            $$1.c(chx.a);
        }
        $$1.ev().a(cqw.bj, bhr.a, i);
        $$1.ev().b(cqw.bg);
    }

    @Override
    protected void d(axf $$0, dal $$1, long $$2) {
        cim<dal> $$3 = $$1.ev();
        chl $$4 = $$3.c(cqw.p).orElse(null);
        if ($$4 == null) {
            return;
        }
        $$1.a(ep.a.b, $$4.dI());
        if ($$3.c(cqw.bh).isPresent() || $$3.c(cqw.bi).isPresent()) {
            return;
        }
        $$3.a(cqw.bi, bhr.a, h);
        double $$5 = $$4.dP() - $$1.dP();
        double $$6 = $$4.f($$4.cq() ? 0.8 : 0.3) - $$1.gS();
        double $$7 = $$4.dV() - $$1.dV();
        dec.a(new deu($$1, (dwo)$$0), $$0, dlt.l, $$5, $$6, $$7, 0.7f, 5 - $$0.av().a() * 4);
        $$1.a(bda.cV, 1.5f, 1.0f);
    }

    private static boolean a(dal $$0, chl $$1) {
        double $$2 = $$0.dI().g($$1.dI());
        return $$2 < 256.0;
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (dal)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dal)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dal)chl2, l2);
    }
}

