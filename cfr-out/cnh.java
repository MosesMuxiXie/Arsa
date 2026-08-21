/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cnh<E extends dch>
extends cjd<E> {
    private static final double c = 6.0;
    private static final double d = 20.0;

    public cnh(int $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.aM, (Object)((Object)cqx.a), cqw.p, (Object)((Object)cqx.b), cqw.n, (Object)((Object)cqx.b), cqw.o, (Object)((Object)cqx.c), cqw.C, (Object)((Object)cqx.c), cqw.aK, (Object)((Object)cqx.c), cqw.aR, (Object)((Object)cqx.c)), $$0);
    }

    @Override
    protected boolean a(axf $$0, E $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(axf $$0, E $$1, long $$2) {
        ((cgk)$$1).a(bda.Fn, 5.0f, 1.0f);
    }

    @Override
    protected void c(axf $$0, E $$12, long $$2) {
        if (((cgk)$$12).d(chx.m)) {
            ((cgk)$$12).c(chx.a);
        }
        ((dch)$$12).ev().b(cqw.aM);
        ((dch)$$12).ev().c(cqw.C).filter(arg_0 -> $$12.H(arg_0)).ifPresent($$1 -> {
            if ($$12.a((cgk)$$1, 6.0, 20.0)) {
                $$12.J((cgk)$$1);
            }
            if (!$$12.ev().a(cqw.aK)) {
                dci.a($$12, $$1.dK());
            }
        });
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (dch)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (E)((dch)chl2), l2);
    }
}

