/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class cku
extends cjd<cvy> {
    public static final int c = 200;
    public static final float d = 1.65f;
    private final Function<cvy, ccn> e;
    private final csk f;
    private final float g;
    private final ToDoubleFunction<cvy> h;
    private ftm i;
    private final Function<cvy, bcz> j;
    private final Function<cvy, bcz> k;

    public cku(Function<cvy, ccn> $$0, csk $$1, float $$2, ToDoubleFunction<cvy> $$3, Function<cvy, bcz> $$4, Function<cvy, bcz> $$5) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.W, (Object)((Object)cqx.b), cqw.X, (Object)((Object)cqx.a)), 200);
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.j = $$4;
        this.k = $$5;
        this.i = ftm.c;
    }

    @Override
    protected boolean a(axf $$0, cvy $$1) {
        return $$1.ev().a(cqw.X);
    }

    @Override
    protected boolean a(axf $$0, cvy $$1, long $$2) {
        return $$1.ev().a(cqw.X);
    }

    @Override
    protected void b(axf $$0, cvy $$1, long $$2) {
        is $$3 = $$1.dK();
        cim<cvy> $$4 = $$1.ev();
        ftm $$5 = $$4.c(cqw.X).get();
        this.i = new ftm((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
        $$4.a(cqw.n, new cqz($$5, this.g, 0));
    }

    @Override
    protected void c(axf $$0, cvy $$1, long $$2) {
        List<chl> $$3 = $$0.a(chl.class, this.f, $$1, $$1.dj());
        cim<cvy> $$4 = $$1.ev();
        if (!$$3.isEmpty()) {
            float $$7;
            cex $$6;
            chl $$5 = $$3.get(0);
            if ($$5.a($$0, $$6 = $$0.as().c($$1), $$7 = (float)$$1.i(cis.d))) {
                dsq.a($$0, (cgk)$$5, $$6);
            }
            int $$8 = $$1.d(cfo.a) ? $$1.e(cfo.a).e() + 1 : 0;
            int $$9 = $$1.d(cfo.b) ? $$1.e(cfo.b).e() + 1 : 0;
            float $$10 = 0.25f * (float)($$8 - $$9);
            float $$11 = bgj.a($$1.fM() * 1.65f, 0.2f, 3.0f) + $$10;
            cex $$12 = $$0.as().b($$1);
            float $$13 = $$5.b($$0, $$12, $$7);
            float $$14 = $$13 > 0.0f ? 0.5f : 1.0f;
            $$5.o((double)($$14 * $$11) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
            this.b($$0, $$1);
            $$0.a(null, $$1, this.j.apply($$1), bdb.g, 1.0f, 1.0f);
        } else if (this.c($$0, $$1)) {
            $$0.a(null, $$1, this.j.apply($$1), bdb.g, 1.0f, 1.0f);
            boolean $$15 = $$1.gT();
            if ($$15) {
                $$0.a(null, $$1, this.k.apply($$1), bdb.g, 1.0f, 1.0f);
            }
            this.b($$0, $$1);
        } else {
            boolean $$18;
            Optional<cqz> $$16 = $$4.c(cqw.n);
            Optional<ftm> $$17 = $$4.c(cqw.X);
            boolean bl2 = $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a((jn)$$17.get(), 0.25);
            if ($$18) {
                this.b($$0, $$1);
            }
        }
    }

    private boolean c(axf $$0, cvy $$1) {
        ftm $$2 = $$1.dN().d(1.0, 0.0, 1.0).d();
        is $$3 = is.a($$1.dI().e($$2));
        return $$0.a_($$3).a(bdp.cD) || $$0.a_($$3.d()).a(bdp.cD);
    }

    protected void b(axf $$0, cvy $$1) {
        $$0.a((cgk)$$1, (byte)59);
        $$1.ev().a(cqw.W, this.e.apply($$1).a($$0.y));
        $$1.ev().b(cqw.X);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (cvy)chl2, l2);
    }
}

