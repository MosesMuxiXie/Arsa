/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class cix
extends cjd<cth> {
    private static final int c = 3;
    private static final int d = 60;
    private static final int e = 110;
    private final cgu<? extends cth> f;
    private final float g;
    private final int h;
    private static final int i = 2;
    private long j;

    public cix(cgu<? extends cth> $$0) {
        this($$0, 1.0f, 2);
    }

    public cix(cgu<? extends cth> $$0, float $$1, int $$2) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.h, (Object)((Object)cqx.a), cqw.s, (Object)((Object)cqx.b), cqw.n, (Object)((Object)cqx.c), cqw.o, (Object)((Object)cqx.c), cqw.aa, (Object)((Object)cqx.b)), 110);
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
    }

    @Override
    protected boolean a(axf $$0, cth $$1) {
        return $$1.hb() && this.c($$1).isPresent();
    }

    protected void a(axf $$0, cth $$1, long $$2) {
        cth $$3 = this.c($$1).get();
        $$1.ev().a(cqw.s, $$3);
        $$3.ev().a(cqw.s, $$1);
        cjf.a((chl)$$1, $$3, this.g, this.h);
        int $$4 = 60 + $$1.ep().a(50);
        this.j = $$2 + (long)$$4;
    }

    protected boolean b(axf $$0, cth $$1, long $$2) {
        if (!this.b($$1)) {
            return false;
        }
        cth $$3 = this.a($$1);
        return $$3.cb() && $$1.a($$3) && cjf.a($$1.ev(), (chl)$$3) && $$2 <= this.j && !$$1.gM() && !$$3.gM();
    }

    @Override
    protected void c(axf $$0, cth $$1, long $$2) {
        cth $$3 = this.a($$1);
        cjf.a((chl)$$1, $$3, this.g, this.h);
        if (!$$1.a((cgk)$$3, 3.0)) {
            return;
        }
        if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ev().b(cqw.s);
            $$3.ev().b(cqw.s);
        }
    }

    @Override
    protected void d(axf $$0, cth $$1, long $$2) {
        $$1.ev().b(cqw.s);
        $$1.ev().b(cqw.n);
        $$1.ev().b(cqw.o);
        this.j = 0L;
    }

    private cth a(cth $$0) {
        return (cth)$$0.ev().c(cqw.s).get();
    }

    private boolean b(cth $$0) {
        cim<cfy> $$1 = $$0.ev();
        return $$1.a(cqw.s) && $$1.c(cqw.s).get().ay() == this.f;
    }

    private Optional<? extends cth> c(cth $$0) {
        return $$0.ev().c(cqw.h).get().a((chl $$1) -> {
            cth $$2;
            return $$1.ay() == this.f && $$1 instanceof cth && $$0.a($$2 = (cth)$$1) && !$$2.gM();
        }).map(cth.class::cast);
    }

    @Override
    protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
        return this.b(axf2, (cth)chl2, l2);
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.d(axf2, (cth)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.a(axf2, (cth)chl2, l2);
    }
}

