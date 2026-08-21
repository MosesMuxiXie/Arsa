/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ckj
extends cjd<dcx> {
    private final float c;

    public ckj(float $$0) {
        super((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.c), cqw.o, (Object)((Object)cqx.c)), Integer.MAX_VALUE);
        this.c = $$0;
    }

    @Override
    protected boolean a(axf $$0, dcx $$1) {
        ddm $$2 = $$1.a();
        return $$1.cb() && $$2 != null && !$$1.by() && !$$1.ah && $$1.g((cgk)$$2) <= 16.0;
    }

    @Override
    protected boolean a(axf $$0, dcx $$1, long $$2) {
        return this.a($$0, $$1);
    }

    @Override
    protected void b(axf $$0, dcx $$1, long $$2) {
        this.a($$1);
    }

    @Override
    protected void c(axf $$0, dcx $$1, long $$2) {
        cim<dcx> $$3 = $$1.ev();
        $$3.b(cqw.n);
        $$3.b(cqw.o);
    }

    @Override
    protected void d(axf $$0, dcx $$1, long $$2) {
        this.a($$1);
    }

    @Override
    protected boolean a(long $$0) {
        return false;
    }

    private void a(dcx $$0) {
        cim<dcx> $$1 = $$0.ev();
        $$1.a(cqw.n, new cqz(new cjp($$0.a(), false), this.c, 2));
        $$1.a(cqw.o, new cjp($$0.a(), true));
    }

    @Override
    protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
        this.c(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
        this.d(axf2, (dcx)chl2, l2);
    }

    @Override
    protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
        this.b(axf2, (dcx)chl2, l2);
    }
}

