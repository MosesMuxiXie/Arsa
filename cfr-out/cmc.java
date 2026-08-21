/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class cmc
extends cjd<dcx> {
    private Set<dlp> c = ImmutableSet.of();

    public cmc() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.r, (Object)((Object)cqx.a), cqw.h, (Object)((Object)cqx.a)));
    }

    @Override
    protected boolean a(axf $$0, dcx $$1) {
        return cjf.a($$1.ev(), cqw.r, cgu.bL);
    }

    @Override
    protected boolean a(axf $$0, dcx $$1, long $$2) {
        return this.a($$0, $$1);
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        dcx $$3 = (dcx)$$1.ev().c(cqw.r).get();
        cjf.a((chl)$$1, $$3, 0.5f, 2);
        this.c = cmc.a($$1, $$3);
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        dcx $$3 = (dcx)$$1.ev().c(cqw.r).get();
        if ($$1.g((cgk)$$3) > 5.0) {
            return;
        }
        cjf.a((chl)$$1, $$3, 0.5f, 2);
        $$1.a($$0, $$3, $$2);
        boolean $$4 = $$1.gZ().b().a(dda.g);
        if ($$1.hb() && ($$4 || $$3.hc())) {
            cmc.a($$1, dcx.cy.keySet(), $$3);
        }
        if ($$4 && $$1.gP().a_(dlx.rc) > dlx.rc.g() / 2) {
            cmc.a($$1, (Set<dlp>)ImmutableSet.of((Object)dlx.rc), $$3);
        }
        if (!this.c.isEmpty() && $$1.gP().a(this.c)) {
            cmc.a($$1, this.c, $$3);
        }
    }

    @Override
    protected void d(axf $$0, dcx $$1, long $$2) {
        $$1.ev().b(cqw.r);
    }

    private static Set<dlp> a(dcx $$0, dcx $$12) {
        ImmutableSet<dlp> $$2 = $$12.gZ().b().a().d();
        ImmutableSet<dlp> $$3 = $$0.gZ().b().a().d();
        return $$2.stream().filter($$1 -> !$$3.contains($$1)).collect(Collectors.toSet());
    }

    private static void a(dcx $$0, Set<dlp> $$1, chl $$2) {
        cdk $$3 = $$0.gP();
        dlt $$4 = dlt.l;
        for (int $$5 = 0; $$5 < $$3.b(); ++$$5) {
            int $$9;
            dlp $$7;
            dlt $$6 = $$3.a($$5);
            if ($$6.f() || !$$1.contains($$7 = $$6.h())) continue;
            if ($$6.N() > $$6.k() / 2) {
                int $$8 = $$6.N() / 2;
            } else {
                if ($$6.N() <= 24) continue;
                $$9 = $$6.N() - 24;
            }
            $$6.h($$9);
            $$4 = new dlt($$7, $$9);
            break;
        }
        if (!$$4.f()) {
            cjf.a((chl)$$0, $$4, $$2.dI());
        }
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dcx)chl2, l2);
    }
}

