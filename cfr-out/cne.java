/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cne
extends cjd<dch> {
    private static final int c = 25;
    private static final int d = 20;

    public cne() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.aJ, (Object)((Object)cqx.a), cqw.p, (Object)((Object)cqx.b), cqw.aQ, (Object)((Object)cqx.c), cqw.aO, (Object)((Object)cqx.c)), dci.b);
    }

    protected void a(axf $$0, dch $$1, long $$2) {
        cim<dch> $$3 = $$1.ev();
        $$3.a(cqw.aO, bhr.a, 25L);
        $$3.b(cqw.n);
        chl $$4 = $$1.ev().c(cqw.aJ).get();
        cjf.a((chl)$$1, $$4);
        $$1.c(chx.l);
        $$1.a((cgk)$$4, 20, false);
    }

    protected boolean b(axf $$0, dch $$1, long $$2) {
        return true;
    }

    @Override
    protected void c(axf $$0, dch $$1, long $$2) {
        if ($$1.ev().a(cqw.aO) || $$1.ev().a(cqw.aQ)) {
            return;
        }
        $$1.ev().a(cqw.aQ, bhr.a, dci.b - 25);
        $$1.a(bda.Fm, 3.0f, 1.0f);
    }

    @Override
    protected void d(axf $$0, dch $$1, long $$2) {
        if ($$1.d(chx.l)) {
            $$1.c(chx.a);
        }
        $$1.ev().c(cqw.aJ).ifPresent($$1::i);
        $$1.ev().b(cqw.aJ);
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.b(axf2, (dch)chl2, l2);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dch)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (dch)chl2, l2);
    }
}

