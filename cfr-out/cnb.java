/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class cnb<E extends dch>
extends cjd<E> {
    public cnb(int $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.p, (Object)((Object)cqx.b), cqw.n, (Object)((Object)cqx.b)), $$0);
    }

    @Override
    protected boolean a(axf $$0, E $$1, long $$2) {
        return ((cgk)$$1).ei() == null;
    }

    @Override
    protected boolean a(axf $$0, E $$1) {
        return ((cgk)$$1).aV() || ((cgk)$$1).by() || ((cgk)$$1).bN();
    }

    @Override
    protected void b(axf $$0, E $$1, long $$2) {
        if (((cgk)$$1).aV()) {
            ((cgk)$$1).c(chx.o);
            ((cgk)$$1).a(bda.Fd, 5.0f, 1.0f);
        } else {
            ((cgk)$$1).a(bda.EY, 5.0f, 1.0f);
            this.c($$0, $$1, $$2);
        }
    }

    @Override
    protected void c(axf $$0, E $$1, long $$2) {
        if (((cgk)$$1).ei() == null) {
            ((chl)$$1).a(cgk.e.b);
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

