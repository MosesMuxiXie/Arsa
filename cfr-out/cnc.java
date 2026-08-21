/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cnc<E extends dch>
extends cjd<E> {
    public cnc(int $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.aN, (Object)((Object)cqx.a), cqw.n, (Object)((Object)cqx.b), cqw.o, (Object)((Object)cqx.c)), $$0);
    }

    @Override
    protected boolean a(axf $$0, E $$1, long $$2) {
        return true;
    }

    @Override
    protected void b(axf $$0, E $$1, long $$2) {
        ((cgk)$$1).c(chx.n);
        ((cgk)$$1).a(bda.Fe, 5.0f, 1.0f);
    }

    @Override
    protected void c(axf $$0, E $$1, long $$2) {
        if (((cgk)$$1).d(chx.n)) {
            ((cgk)$$1).c(chx.a);
        }
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

