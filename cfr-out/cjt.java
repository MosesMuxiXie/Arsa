/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cjt
extends cjd<dcx> {
    private static final int c = 5;
    private static final int d = 600;
    private static final int e = 6600;
    private static final int f = 20;
    private static final Map<amt<dda>, amt<fof>> g = ImmutableMap.builder().put(dda.c, fnv.ar).put(dda.d, fnv.as).put(dda.e, fnv.at).put(dda.f, fnv.au).put(dda.g, fnv.av).put(dda.h, fnv.aw).put(dda.i, fnv.ax).put(dda.j, fnv.ay).put(dda.k, fnv.az).put(dda.l, fnv.aA).put(dda.n, fnv.aB).put(dda.o, fnv.aC).put(dda.p, fnv.aD).build();
    private static final float h = 0.5f;
    private int i = 600;
    private boolean j;
    private long k;

    public cjt(int $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.c), cqw.o, (Object)((Object)cqx.c), cqw.r, (Object)((Object)cqx.c), cqw.k, (Object)((Object)cqx.a)), $$0);
    }

    @Override
    protected boolean a(axf $$0, dcx $$1) {
        if (!this.b($$1)) {
            return false;
        }
        if (this.i > 0) {
            --this.i;
            return false;
        }
        return true;
    }

    protected void a(axf $$0, dcx $$1, long $$2) {
        this.j = false;
        this.k = $$2;
        ddm $$3 = this.c($$1).get();
        $$1.ev().a(cqw.r, $$3);
        cjf.a((chl)$$1, (chl)$$3);
    }

    protected boolean b(axf $$0, dcx $$1, long $$2) {
        return this.b($$1) && !this.j;
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        ddm $$3 = this.c($$1).get();
        cjf.a((chl)$$1, (chl)$$3);
        if (this.a($$1, $$3)) {
            if ($$2 - this.k > 20L) {
                this.a($$0, $$1, $$3);
                this.j = true;
            }
        } else {
            cjf.a((chl)$$1, (cgk)$$3, 0.5f, 5);
        }
    }

    @Override
    protected void d(axf $$0, dcx $$1, long $$2) {
        this.i = cjt.a($$0);
        $$1.ev().b(cqw.r);
        $$1.ev().b(cqw.n);
        $$1.ev().b(cqw.o);
    }

    private void a(axf $$0, dcx $$1, chl $$22) {
        $$1.a($$0, cjt.a($$1), (axf $$2, dlt $$3) -> cjf.a((chl)$$1, $$3, $$22.dI()));
    }

    private static amt<fof> a(dcx $$0) {
        if ($$0.e_()) {
            return fnv.aF;
        }
        Optional<amt<dda>> $$1 = $$0.gZ().b().e();
        if ($$1.isEmpty()) {
            return fnv.aE;
        }
        return g.getOrDefault($$1.get(), fnv.aE);
    }

    private boolean b(dcx $$0) {
        return this.c($$0).isPresent();
    }

    private Optional<ddm> c(dcx $$0) {
        return $$0.ev().c(cqw.k).filter(this::a);
    }

    @Override
    private boolean a(ddm $$0) {
        return $$0.d(cfo.F);
    }

    private boolean a(dcx $$0, ddm $$1) {
        is $$2 = $$1.dK();
        is $$3 = $$0.dK();
        return $$3.a($$2, 5.0);
    }

    private static int a(axf $$0) {
        return 600 + $$0.y.a(6001);
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.b(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (dcx)chl2, l2);
    }
}

