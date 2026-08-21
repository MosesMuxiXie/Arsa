/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cni
extends cjd<dch> {
    private static final int d = 15;
    private static final int e = 20;
    private static final double f = 0.5;
    private static final double g = 2.5;
    public static final int c = 40;
    private static final int h = bgj.e(34.0);
    private static final int i = bgj.d(60.0f);

    public cni() {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.p, (Object)((Object)cqx.a), cqw.aU, (Object)((Object)cqx.b), cqw.aV, (Object)((Object)cqx.c), cqw.aW, (Object)((Object)cqx.c)), i);
    }

    @Override
    protected boolean a(axf $$0, dch $$1) {
        return $$1.a((cgk)$$1.ev().c(cqw.p).get(), 15.0, 20.0);
    }

    @Override
    protected boolean a(axf $$0, dch $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(axf $$0, dch $$1, long $$2) {
        $$1.ev().a(cqw.q, true, i);
        $$1.ev().a(cqw.aW, bhr.a, h);
        $$0.a((cgk)$$1, (byte)62);
        $$1.a(bda.Fp, 3.0f, 1.0f);
    }

    @Override
    protected void c(axf $$0, dch $$12, long $$22) {
        $$12.ev().c(cqw.p).ifPresent($$1 -> $$12.J().a($$1.dI()));
        if ($$12.ev().a(cqw.aW) || $$12.ev().a(cqw.aV)) {
            return;
        }
        $$12.ev().a(cqw.aV, bhr.a, i - h);
        $$12.ev().c(cqw.p).filter($$12::H).filter($$1 -> $$12.a((cgk)$$1, 15.0, 20.0)).ifPresent($$2 -> {
            ftm $$3 = $$12.dI().e($$12.dH().b(cgl.d, 0, $$12.ec()));
            ftm $$4 = $$2.bV().d($$3);
            ftm $$5 = $$4.d();
            int $$6 = bgj.c($$4.g()) + 7;
            for (int $$7 = 1; $$7 < $$6; ++$$7) {
                ftm $$8 = $$3.e($$5.c((double)$$7));
                $$0.a(ly.C, $$8.g, $$8.h, $$8.i, 1, 0.0, 0.0, 0.0, 0.0);
            }
            $$12.a(bda.Fo, 3.0f, 1.0f);
            if ($$2.a($$0, $$0.as().e($$12), 10.0f)) {
                double $$9 = 0.5 * (1.0 - $$2.i(cis.r));
                double $$10 = 2.5 * (1.0 - $$2.i(cis.r));
                $$2.i($$5.a() * $$10, $$5.b() * $$9, $$5.c() * $$10);
            }
        });
    }

    @Override
    protected void d(axf $$0, dch $$1, long $$2) {
        cni.a((chl)$$1, 40);
    }

    public static void a(chl $$0, int $$1) {
        $$0.ev().a(cqw.aU, bhr.a, $$1);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dch)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dch)chl2, l2);
    }
}

